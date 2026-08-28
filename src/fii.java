import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.BufferUsage;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.jtracy.TracyClient;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class fii implements AutoCloseable {
   private static final int a = 320;
   private static final int b = 180;
   private static final int c = 4;
   private int d;
   private int e;
   private int f;
   private int g;
   @Nullable
   private GpuTexture h;
   @Nullable
   private GpuBuffer i;
   private int j;
   private boolean k;
   private fii.a l = fii.a.a;

   private void a(int $$0, int $$1) {
      float $$2 = (float)$$0 / (float)$$1;
      if ($$0 > 320) {
         $$0 = 320;
         $$1 = (int)(320.0F / $$2);
      }

      if ($$1 > 180) {
         $$0 = (int)(180.0F * $$2);
         $$1 = 180;
      }

      $$0 = $$0 / 4 * 4;
      $$1 = $$1 / 4 * 4;
      if (this.f != $$0 || this.g != $$1) {
         this.f = $$0;
         this.g = $$1;
         if (this.h != null) {
            this.h.close();
         }

         this.h = RenderSystem.getDevice().createTexture("Tracy Frame Capture", TextureFormat.RGBA8, $$0, $$1, 1);
         if (this.i != null) {
            this.i.close();
         }

         this.i = RenderSystem.getDevice().createBuffer(() -> "Tracy Frame Capture buffer", BufferType.PIXEL_PACK, BufferUsage.STREAM_READ, $$0 * $$1 * 4);
      }
   }

   public void a(fjr $$0) {
      if (this.l == fii.a.a && !this.k && $$0.c() != null && this.i != null && this.h != null) {
         this.k = true;
         if ($$0.c != this.d || $$0.d != this.e) {
            this.d = $$0.c;
            this.e = $$0.d;
            this.a(this.d, this.e);
         }

         this.l = fii.a.b;
         CommandEncoder $$1 = RenderSystem.getDevice().createCommandEncoder();
         RenderSystem.a $$2 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
         GpuBuffer $$3 = $$2.b(6);

         try (RenderPass $$4 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(this.h, OptionalInt.empty())) {
            $$4.setPipeline(grw.aD);
            $$4.setVertexBuffer(0, RenderSystem.getQuadVertexBuffer());
            $$4.setIndexBuffer($$3, $$2.a());
            $$4.bindSampler("InSampler", $$0.c());
            $$4.drawIndexed(0, 6);
         }

         $$1.copyTextureToBuffer(this.h, this.i, 0, () -> this.l = fii.a.c, 0);
         this.j = 0;
      }
   }

   public void a() {
      if (this.l == fii.a.c && this.i != null) {
         this.l = fii.a.a;

         try (GpuBuffer.ReadView $$0 = RenderSystem.getDevice().createCommandEncoder().readBuffer(this.i)) {
            TracyClient.frameImage($$0.data(), this.f, this.g, this.j, true);
         }
      }
   }

   public void b() {
      this.j++;
      this.k = false;
      TracyClient.markFrame();
   }

   @Override
   public void close() {
      if (this.h != null) {
         this.h.close();
      }

      if (this.i != null) {
         this.i.close();
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
