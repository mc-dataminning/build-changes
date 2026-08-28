package com.mojang.renderpearl.api.commands;

import com.mojang.renderpearl.api.textures.GpuTextureView;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceLists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;

public record RenderPassDescriptor(
   Supplier<String> label,
   List<RenderPassDescriptor.Attachment<Optional<Vector4fc>>> colorAttachments,
   @Nullable RenderPassDescriptor.Attachment<OptionalDouble> depthAttachment,
   RenderPass.RenderArea renderArea
) {
   public RenderPassDescriptor(
      Supplier<String> label,
      List<RenderPassDescriptor.Attachment<Optional<Vector4fc>>> colorAttachments,
      @Nullable RenderPassDescriptor.Attachment<OptionalDouble> depthAttachment,
      RenderPass.RenderArea renderArea
   ) {
      List<RenderPassDescriptor.Attachment<Optional<Vector4fc>>> var5 = ReferenceLists.unmodifiable(new ReferenceArrayList(colorAttachments));
      this.label = label;
      this.colorAttachments = var5;
      this.depthAttachment = depthAttachment;
      this.renderArea = renderArea;
   }

   public static RenderPassDescriptor.Builder builder(final Supplier<String> label) {
      return new RenderPassDescriptor.Builder(label);
   }

   public static record Attachment<T>(GpuTextureView textureView, T clearValue) {
   }

   public static class Builder {
      private final Supplier<String> label;
      private final List<RenderPassDescriptor.Attachment<Optional<Vector4fc>>> colorAttachments = new ArrayList<>();
      @Nullable
      private RenderPassDescriptor.Attachment<OptionalDouble> depthAttachment;
      @Nullable
      private RenderPass.RenderArea renderArea;

      private Builder(final Supplier<String> label) {
         this.label = label;
      }

      public RenderPassDescriptor.Builder withColorAttachment(final GpuTextureView textureView) {
         this.colorAttachments.add(new RenderPassDescriptor.Attachment<>(textureView, Optional.empty()));
         return this;
      }

      public RenderPassDescriptor.Builder withColorAttachment(final GpuTextureView textureView, final Optional<Vector4fc> clearValue) {
         this.colorAttachments.add(new RenderPassDescriptor.Attachment<>(textureView, clearValue));
         return this;
      }

      public RenderPassDescriptor.Builder withUnusedColorAttachment() {
         this.colorAttachments.add(null);
         return this;
      }

      public RenderPassDescriptor.Builder withDepthAttachment(final GpuTextureView textureView) {
         this.depthAttachment = new RenderPassDescriptor.Attachment<>(textureView, OptionalDouble.empty());
         return this;
      }

      public RenderPassDescriptor.Builder withDepthAttachment(final GpuTextureView textureView, final OptionalDouble clearValue) {
         this.depthAttachment = new RenderPassDescriptor.Attachment<>(textureView, clearValue);
         return this;
      }

      public RenderPassDescriptor.Builder withRenderArea(final RenderPass.RenderArea renderArea) {
         this.renderArea = renderArea;
         return this;
      }

      public RenderPassDescriptor build() {
         RenderPass.RenderArea renderArea = this.renderArea != null ? this.renderArea : defaultRenderArea(this.colorAttachments, this.depthAttachment);
         return new RenderPassDescriptor(this.label, this.colorAttachments, this.depthAttachment, renderArea);
      }

      private static RenderPass.RenderArea defaultRenderArea(
         final List<RenderPassDescriptor.Attachment<Optional<Vector4fc>>> colorAttachments,
         @Nullable final RenderPassDescriptor.Attachment<OptionalDouble> depthAttachment
      ) {
         int width = 0;
         int height = 0;
         if (!colorAttachments.isEmpty()) {
            for (RenderPassDescriptor.Attachment<Optional<Vector4fc>> colorAttachment : colorAttachments) {
               if (colorAttachment != null) {
                  GpuTextureView textureView = colorAttachment.textureView();
                  width = textureView.getWidth(0);
                  height = textureView.getHeight(0);
               }
            }
         } else if (depthAttachment != null) {
            width = depthAttachment.textureView().getWidth(0);
            height = depthAttachment.textureView().getHeight(0);
         }

         return new RenderPass.RenderArea(0, 0, width, height);
      }
   }
}
