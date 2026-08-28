import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fjq extends fjr {
   public static final int a = 854;
   public static final int b = 480;
   static final fjq.a l = new fjq.a(854, 480);

   public fjq(int $$0, int $$1) {
      super("Main", true);
      this.c($$0, $$1);
   }

   private void c(int $$0, int $$1) {
      fjq.a $$2 = this.d($$0, $$1);
      if (this.i != null && this.j != null) {
         this.i.setTextureFilter(FilterMode.NEAREST, false);
         this.i.setAddressMode(AddressMode.CLAMP_TO_EDGE);
         this.i.setTextureFilter(FilterMode.NEAREST, false);
         this.i.setAddressMode(AddressMode.CLAMP_TO_EDGE);
         this.e = $$2.a;
         this.f = $$2.b;
         this.c = $$2.a;
         this.d = $$2.b;
      } else {
         throw new IllegalStateException("Missing color and/or depth textures");
      }
   }

   private fjq.a d(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();

      for (fjq.a $$2 : fjq.a.a($$0, $$1)) {
         if (this.i != null) {
            this.i.close();
            this.i = null;
         }

         if (this.j != null) {
            this.j.close();
            this.j = null;
         }

         this.i = this.a($$2);
         this.j = this.b($$2);
         if (this.i != null && this.j != null) {
            return $$2;
         }
      }

      throw new RuntimeException(
         "Unrecoverable GL_OUT_OF_MEMORY ("
            + (this.i == null ? "missing color" : "have color")
            + ", "
            + (this.j == null ? "missing depth" : "have depth")
            + ")"
      );
   }

   @Nullable
   private GpuTexture a(fjq.a $$0) {
      try {
         return RenderSystem.getDevice().createTexture(() -> this.g + " / Color", TextureFormat.RGBA8, $$0.a, $$0.b, 1);
      } catch (fie var3) {
         return null;
      }
   }

   @Nullable
   private GpuTexture b(fjq.a $$0) {
      try {
         return RenderSystem.getDevice().createTexture(() -> this.g + " / Depth", TextureFormat.DEPTH32, $$0.a, $$0.b, 1);
      } catch (fie var3) {
         return null;
      }
   }

   static class a {
      public final int a;
      public final int b;

      a(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      static List<fjq.a> a(int $$0, int $$1) {
         RenderSystem.assertOnRenderThread();
         int $$2 = RenderSystem.getDevice().getMaxTextureSize();
         return $$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2 ? ImmutableList.of(new fjq.a($$0, $$1), fjq.l) : ImmutableList.of(fjq.l);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            fjq.a $$1 = (fjq.a)$$0;
            return this.a == $$1.a && this.b == $$1.b;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.a, this.b);
      }

      @Override
      public String toString() {
         return this.a + "x" + this.b;
      }
   }
}
