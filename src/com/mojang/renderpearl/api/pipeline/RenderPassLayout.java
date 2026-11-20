package com.mojang.renderpearl.api.pipeline;

import com.mojang.renderpearl.api.GpuFormat;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteImmutableList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Arrays;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class RenderPassLayout {
   public static final int MAXIMUM_ATTACHMENTS = 64;
   public static final int MAXIMUM_SUBPASSES = 64;
   public static final int MAX_COLOR_ATTACHMENTS = 4;
   public static final int MAX_INPUT_ATTACHMENTS = 4;
   public static final int ATTACHMENT_UNUSED = -1;
   private final String name;
   private final List<GpuFormat> attachmentFormats;
   private final List<RenderPassLayout.Subpass> subpasses;
   private final ByteList compatibilityKey;
   private final int compatabilityHash;

   public static RenderPassLayout.Builder builder(final String name) {
      return new RenderPassLayout.Builder(name);
   }

   public static RenderPassLayout simple(final String name, final GpuFormat format, final int count) {
      GpuFormat[] formatArray = new GpuFormat[count];
      Arrays.fill(formatArray, format);
      return simple(name, formatArray);
   }

   public static RenderPassLayout simple(final String name, final GpuFormat format, final int count, final GpuFormat depthStencil) {
      GpuFormat[] formatArray = new GpuFormat[count + 1];
      Arrays.fill(formatArray, format);
      formatArray[count] = depthStencil;
      return simple(name, formatArray);
   }

   public static RenderPassLayout simple(final String name, final GpuFormat firstAttachmentFormat, final GpuFormat... additionalAttachmentFormats) {
      GpuFormat[] formatArray = new GpuFormat[additionalAttachmentFormats.length + 1];
      formatArray[0] = firstAttachmentFormat;
      System.arraycopy(additionalAttachmentFormats, 0, formatArray, 1, additionalAttachmentFormats.length);
      return simple(name, formatArray);
   }

   private static RenderPassLayout simple(final String name, final GpuFormat[] formats) {
      if (formats.length < 1) {
         throw new IllegalArgumentException("At least one attachment required");
      }

      boolean hasDepthAttachment = false;

      for (GpuFormat attachmentFormat : formats) {
         if (attachmentFormat.hasDepthAspect() || attachmentFormat.hasStencilAspect()) {
            if (hasDepthAttachment) {
               throw new IllegalArgumentException("Only one depth/stencil attachment may be specified for a simple RenderPass");
            }

            hasDepthAttachment = true;
         }
      }

      RenderPassLayout.Builder builder = builder(name);
      RenderPassLayout.Builder.Subpass subpass = builder.withSubpass(name);

      for (GpuFormat attachmentFormat : formats) {
         RenderPassLayout.Builder.Attachment attachment = builder.withAttachment(attachmentFormat);
         if (attachmentFormat.hasColorAspect()) {
            subpass.withColorAttachment(attachment);
         } else {
            subpass.withDepthAttachment(attachment);
         }
      }

      return builder.build();
   }

   private RenderPassLayout(
      final String name, final List<RenderPassLayout.Builder.Attachment> attachments, final List<RenderPassLayout.Builder.Subpass> builderPasses
   ) {
      this.name = name;
      this.attachmentFormats = attachments.stream().map(RenderPassLayout.Builder.Attachment::format).toList();
      List<RenderPassLayout.Subpass> subpasses = new ReferenceArrayList();

      for (int index = 0; index < builderPasses.size(); index++) {
         RenderPassLayout.Builder.Subpass subpass = builderPasses.get(index);
         ByteArrayList inputAttachments = new ByteArrayList();
         ObjectListIterator ordinal = subpass.inputAttachments.iterator();

         while (ordinal.hasNext()) {
            RenderPassLayout.Builder.Attachment attachment = (RenderPassLayout.Builder.Attachment)ordinal.next();
            if (attachment == null) {
               inputAttachments.add((byte)-1);
            } else {
               inputAttachments.add((byte)attachments.indexOf(attachment));
            }
         }

         ByteArrayList colorAttachments = new ByteArrayList();
         ObjectListIterator var18 = subpass.colorAttachments.iterator();

         while (var18.hasNext()) {
            RenderPassLayout.Builder.Attachment attachment = (RenderPassLayout.Builder.Attachment)var18.next();
            if (attachment == null) {
               colorAttachments.add((byte)-1);
            } else {
               colorAttachments.add((byte)attachments.indexOf(attachment));
            }
         }

         int depthAttachmentIndex = subpass.depthAttachment != null ? attachments.indexOf(subpass.depthAttachment) : -1;
         subpasses.add(
            new RenderPassLayout.Subpass(
               subpass.name, this, index, new ByteImmutableList(inputAttachments), new ByteImmutableList(colorAttachments), depthAttachmentIndex
            )
         );
      }

      this.subpasses = List.copyOf(subpasses);
      ByteArrayList compatKey = new ByteArrayList();
      compatKey.add((byte)this.attachmentFormats.size());
      compatKey.add((byte)subpasses.size());
      assert GpuFormat.values().length < 256;

      for (GpuFormat attachmentFormat : this.attachmentFormats) {
         int ordinal = attachmentFormat.ordinal();
         compatKey.add((byte)ordinal);
         compatKey.add((byte)(ordinal >> 8));
      }

      for (RenderPassLayout.Subpass subpass : subpasses) {
         subpass.addToCompatKey(compatKey);
      }

      this.compatibilityKey = new ByteImmutableList(compatKey);
      this.compatabilityHash = this.compatibilityKey.hashCode();
   }

   public String name() {
      return this.name;
   }

   public List<GpuFormat> attachmentFormats() {
      return this.attachmentFormats;
   }

   public List<RenderPassLayout.Subpass> subpasses() {
      return this.subpasses;
   }

   public RenderPassLayout.Subpass subpass(final int index) {
      if (index >= 0 && index <= this.subpasses.size()) {
         return this.subpasses.get(index);
      } else {
         throw new IllegalArgumentException("Subpass index out of range");
      }
   }

   @Override
   public int hashCode() {
      return this.compatabilityHash;
   }

   @Override
   public boolean equals(final Object obj) {
      if (this == obj) {
         return true;
      } else if (obj instanceof RenderPassLayout other) {
         return this.compatabilityHash != other.compatabilityHash ? false : this.compatibilityKey.equals(other.compatibilityKey);
      } else {
         return false;
      }
   }

   public static class Builder {
      private final String name;
      private final List<RenderPassLayout.Builder.Attachment> attachments = new ReferenceArrayList();
      private final List<RenderPassLayout.Builder.Subpass> subpasses = new ReferenceArrayList();

      public Builder(final String name) {
         this.name = name;
      }

      public RenderPassLayout build() {
         return new RenderPassLayout(this.name, this.attachments, this.subpasses);
      }

      public RenderPassLayout.Builder.Attachment withAttachment(final GpuFormat format) {
         if (this.attachments.size() >= 64) {
            throw new IllegalStateException("Cannot add another attachment, maximum reached");
         }

         RenderPassLayout.Builder.Attachment attachment = new RenderPassLayout.Builder.Attachment(format);
         this.attachments.add(attachment);
         return attachment;
      }

      public List<RenderPassLayout.Builder.Attachment> withAttachments(final GpuFormat format, final int count) {
         List<RenderPassLayout.Builder.Attachment> attachments = new ReferenceArrayList();

         for (int i = 0; i < count; i++) {
            attachments.add(this.withAttachment(format));
         }

         return attachments;
      }

      public RenderPassLayout.Builder.Subpass withSubpass(final String name) {
         if (this.subpasses.size() >= 64) {
            throw new IllegalStateException("Cannot add another subpass, maximum reached");
         }

         RenderPassLayout.Builder.Subpass subpass = new RenderPassLayout.Builder.Subpass(name, this.subpasses.size());
         this.subpasses.add(subpass);
         return subpass;
      }

      public record Attachment(GpuFormat format) {
      }

      public class Subpass {
         private final String name;
         private final int index;
         private final ReferenceArrayList<RenderPassLayout.Builder.@Nullable Attachment> inputAttachments = new ReferenceArrayList();
         private final ReferenceArrayList<RenderPassLayout.Builder.@Nullable Attachment> colorAttachments = new ReferenceArrayList();
         private RenderPassLayout.Builder.@Nullable Attachment depthAttachment;

         public Subpass(final String name, final int index) {
            this.name = name;
            this.index = index;
         }

         public int index() {
            return this.index;
         }

         public RenderPassLayout.Builder.Subpass withInputAttachments(final List<RenderPassLayout.Builder.@Nullable Attachment> attachments) {
            attachments.forEach(this::withInputAttachment);
            return this;
         }

         public RenderPassLayout.Builder.Subpass withInputAttachment(final RenderPassLayout.Builder.@Nullable Attachment attachment) {
            this.withInputAttachment(attachment, this.inputAttachments.size());
            return this;
         }

         public RenderPassLayout.Builder.Subpass withInputAttachment(final RenderPassLayout.Builder.@Nullable Attachment attachment, final int index) {
            if (index > 4) {
               throw new IllegalArgumentException("input attachment index " + index + " out of range, maximum 4");
            }

            if (this.inputAttachments.size() <= index) {
               this.inputAttachments.size(index + 1);
            }

            if (this.inputAttachments.get(index) == attachment) {
               return this;
            }

            if (attachment != null) {
               if (!Builder.this.attachments.contains(attachment)) {
                  throw new IllegalArgumentException("Subpass attachment must be from parent RenderPass");
               }

               if (this.hasAttachment(attachment)) {
                  throw new IllegalStateException("Attachment may only be used once within a subpass");
               }
            }

            this.inputAttachments.set(index, attachment);
            return this;
         }

         public RenderPassLayout.Builder.Subpass withColorAttachments(final List<RenderPassLayout.Builder.@Nullable Attachment> attachments) {
            attachments.forEach(this::withColorAttachment);
            return this;
         }

         public RenderPassLayout.Builder.Subpass withColorAttachment(final RenderPassLayout.Builder.@Nullable Attachment attachment) {
            this.withColorAttachment(attachment, this.colorAttachments.size());
            return this;
         }

         public RenderPassLayout.Builder.Subpass withColorAttachment(final RenderPassLayout.Builder.@Nullable Attachment attachment, final int index) {
            if (index > 4) {
               throw new IllegalArgumentException("Color attachment index " + index + " out of range, maximum 4");
            }

            if (this.colorAttachments.size() <= index) {
               this.colorAttachments.size(index + 1);
            }

            if (this.colorAttachments.get(index) == attachment) {
               return this;
            }

            if (attachment != null) {
               if (!Builder.this.attachments.contains(attachment)) {
                  throw new IllegalArgumentException("Subpass attachment must be from parent RenderPass");
               }

               if (!attachment.format().hasColorAspect()) {
                  throw new IllegalArgumentException("Color attachment format must have color aspect");
               }

               if (this.hasAttachment(attachment)) {
                  throw new IllegalStateException("Attachment may only be used once within a subpass");
               }
            }

            this.colorAttachments.set(index, attachment);
            return this;
         }

         public RenderPassLayout.Builder.Subpass withDepthAttachment(final RenderPassLayout.Builder.@Nullable Attachment attachment) {
            if (this.depthAttachment == attachment) {
               return this;
            }

            if (attachment != null) {
               if (!Builder.this.attachments.contains(attachment)) {
                  throw new IllegalArgumentException("Subpass attachment must be from parent RenderPass");
               }

               if (!attachment.format().hasDepthAspect() && !attachment.format.hasStencilAspect()) {
                  throw new IllegalArgumentException("Depth attachment format must have at depth or stencil aspect");
               }

               if (this.hasAttachment(attachment)) {
                  throw new IllegalStateException("Attachment may only be used once within a subpass");
               }
            }

            this.depthAttachment = attachment;
            return this;
         }

         private boolean hasAttachment(final RenderPassLayout.Builder.Attachment attachment) {
            if (this.depthAttachment == attachment) {
               return true;
            } else {
               return this.colorAttachments.contains(attachment) ? true : this.inputAttachments.contains(attachment);
            }
         }
      }
   }

   public static class Subpass {
      private final String name;
      private final RenderPassLayout renderPassLayout;
      private final int index;
      private final ByteList inputAttachments;
      private final ByteList colorAttachments;
      private final int depthStencilAttachment;

      private Subpass(
         final String name,
         final RenderPassLayout renderPassLayout,
         final int index,
         final ByteList inputAttachments,
         final ByteList colorAttachments,
         final int depthStencilAttachment
      ) {
         this.name = name;
         this.renderPassLayout = renderPassLayout;
         this.index = index;
         this.inputAttachments = inputAttachments;
         this.colorAttachments = colorAttachments;
         this.depthStencilAttachment = depthStencilAttachment;
      }

      private void addToCompatKey(final ByteArrayList compatKey) {
         compatKey.add((byte)this.inputAttachments.size());
         compatKey.add((byte)this.colorAttachments.size());
         compatKey.addAll(this.inputAttachments);
         compatKey.addAll(this.colorAttachments);
         compatKey.add((byte)this.depthStencilAttachment);
      }

      public String name() {
         return this.name;
      }

      public RenderPassLayout renderPassLayout() {
         return this.renderPassLayout;
      }

      public int index() {
         return this.index;
      }

      public ByteList inputAttachments() {
         return this.inputAttachments;
      }

      public ByteList colorAttachments() {
         return this.colorAttachments;
      }

      public int depthStencilAttachment() {
         return this.depthStencilAttachment;
      }

      @Override
      public int hashCode() {
         return this.renderPassLayout.hashCode() ^ this.index;
      }

      @Override
      public boolean equals(final Object obj) {
         if (this == obj) {
            return true;
         } else if (obj instanceof RenderPassLayout.Subpass other) {
            return other.index != this.index ? false : this.renderPassLayout.equals(other.renderPassLayout);
         } else {
            return false;
         }
      }
   }
}
