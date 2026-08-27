import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class fgh extends gku implements gkv {
   private static final int e = 256;
   private final fgi f;
   private final boolean g;
   private final fgh.a h;

   public fgh(fgi $$0, boolean $$1) {
      this.g = $$1;
      this.h = new fgh.a(0, 0, 256, 256);
      TextureUtil.prepareImage($$1 ? evj.b.a : evj.b.d, this.a(), 256, 256);
      this.f = $$0;
   }

   @Override
   public void a(atc $$0) {
   }

   @Override
   public void close() {
      this.b();
   }

   @Nullable
   public fgk a(eum $$0) {
      if ($$0.c() != this.g) {
         return null;
      } else {
         fgh.a $$1 = this.h.a($$0);
         if ($$1 != null) {
            this.c();
            $$0.a($$1.a, $$1.b);
            float $$2 = 256.0F;
            float $$3 = 256.0F;
            float $$4 = 0.01F;
            return new fgk(
               this.f,
               ((float)$$1.a + 0.01F) / 256.0F,
               ((float)$$1.a - 0.01F + (float)$$0.a()) / 256.0F,
               ((float)$$1.b + 0.01F) / 256.0F,
               ((float)$$1.b - 0.01F + (float)$$0.b()) / 256.0F,
               $$0.e(),
               $$0.f(),
               $$0.g(),
               $$0.h()
            );
         } else {
            return null;
         }
      }
   }

   @Override
   public void a(ajt $$0, Path $$1) {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), 0, 256, 256, $$0x -> ($$0x & 0xFF000000) == 0 ? -16777216 : $$0x);
   }

   static class a {
      final int a;
      final int b;
      private final int c;
      private final int d;
      @Nullable
      private fgh.a e;
      @Nullable
      private fgh.a f;
      private boolean g;

      a(int $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Nullable
      fgh.a a(eum $$0) {
         if (this.e != null && this.f != null) {
            fgh.a $$1 = this.e.a($$0);
            if ($$1 == null) {
               $$1 = this.f.a($$0);
            }

            return $$1;
         } else if (this.g) {
            return null;
         } else {
            int $$2 = $$0.a();
            int $$3 = $$0.b();
            if ($$2 > this.c || $$3 > this.d) {
               return null;
            } else if ($$2 == this.c && $$3 == this.d) {
               this.g = true;
               return this;
            } else {
               int $$4 = this.c - $$2;
               int $$5 = this.d - $$3;
               if ($$4 > $$5) {
                  this.e = new fgh.a(this.a, this.b, $$2, this.d);
                  this.f = new fgh.a(this.a + $$2 + 1, this.b, this.c - $$2 - 1, this.d);
               } else {
                  this.e = new fgh.a(this.a, this.b, this.c, $$3);
                  this.f = new fgh.a(this.a, this.b + $$3 + 1, this.c, this.d - $$3 - 1);
               }

               return this.e.a($$0);
            }
         }
      }
   }
}
