import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;

public class fbr implements AutoCloseable {
   private static final int a = 320;
   private static final int b = 180;
   private static final int c = 4;
   private int d;
   private int e;
   private int f;
   private int g;
   private final fcl h = new fcm(320, 180, false);
   private final int i = GlStateManager._glGenBuffers();
   private long j;
   private boolean k;
   private int l;
   private boolean m;

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
         this.h.a($$0, $$1);
         GlStateManager._glBindBuffer(35051, this.i);
         GlStateManager._glBufferData(35051, (long)$$0 * (long)$$1 * 4L, 35041);
         GlStateManager._glBindBuffer(35051, 0);
         this.k = false;
      }
   }

   public void a(fcl $$0) {
      if (!this.k && !this.m) {
         this.m = true;
         if ($$0.c != this.d || $$0.d != this.e) {
            this.d = $$0.c;
            this.e = $$0.d;
            this.a(this.d, this.e);
         }

         GlStateManager._glBindFramebuffer(36009, this.h.h);
         GlStateManager._glBindFramebuffer(36008, $$0.h);
         GlStateManager._glBlitFrameBuffer(0, 0, $$0.c, $$0.d, 0, 0, this.f, this.g, 16384, 9729);
         GlStateManager._glBindFramebuffer(36008, 0);
         GlStateManager._glBindFramebuffer(36009, 0);
         GlStateManager._glBindBuffer(35051, this.i);
         GlStateManager._glBindFramebuffer(36008, this.h.h);
         GlStateManager._readPixels(0, 0, this.f, this.g, 6408, 5121, 0L);
         GlStateManager._glBindFramebuffer(36008, 0);
         GlStateManager._glBindBuffer(35051, 0);
         this.j = GlStateManager._glFenceSync(37143, 0);
         this.k = true;
         this.l = 0;
      }
   }

   public void a() {
      if (this.k) {
         if (GlStateManager._glClientWaitSync(this.j, 0, 0) != 37147) {
            GlStateManager._glDeleteSync(this.j);
            GlStateManager._glBindBuffer(35051, this.i);
            ByteBuffer $$0 = GlStateManager._glMapBuffer(35051, 35000);
            if ($$0 != null) {
               TracyClient.frameImage($$0, this.f, this.g, this.l, true);
            }

            GlStateManager._glUnmapBuffer(35051);
            GlStateManager._glBindBuffer(35051, 0);
            this.k = false;
         }
      }
   }

   public void b() {
      this.l++;
      this.m = false;
      TracyClient.markFrame();
   }

   @Override
   public void close() {
      if (this.k) {
         GlStateManager._glDeleteSync(this.j);
         this.k = false;
      }

      GlStateManager._glDeleteBuffers(this.i);
      this.h.a();
   }
}
