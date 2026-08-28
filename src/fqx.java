import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class fqx extends hau implements hav {
   private static final int d = 256;
   private final fqy e;
   private final boolean f;
   private final fqx.a g;

   public fqx(fqy $$0, boolean $$1) {
      this.f = $$1;
      this.g = new fqx.a(0, 0, 256, 256);
      TextureUtil.prepareImage($$1 ? ffq.b.a : ffq.b.d, this.a(), 256, 256);
      this.e = $$0;
   }

   @Override
   public void a(avv $$0) {
   }

   @Override
   public void close() {
      this.b();
   }

   @Nullable
   public fra a(feq $$0) {
      if ($$0.c() != this.f) {
         return null;
      } else {
         fqx.a $$1 = this.g.a($$0);
         if ($$1 != null) {
            this.d();
            $$0.a($$1.a, $$1.b);
            float $$2 = 256.0F;
            float $$3 = 256.0F;
            float $$4 = 0.01F;
            return new fra(
               this.e,
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
   public void a(alz $$0, Path $$1) {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), 0, 256, 256, $$0x -> ($$0x & 0xFF000000) == 0 ? -16777216 : $$0x);
   }

   static class a {
      final int a;
      final int b;
      private final int c;
      private final int d;
      @Nullable
      private fqx.a e;
      @Nullable
      private fqx.a f;
      private boolean g;

      a(int $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Nullable
      fqx.a a(feq $$0) {
         if (this.e != null && this.f != null) {
            fqx.a $$1 = this.e.a($$0);
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
                  this.e = new fqx.a(this.a, this.b, $$2, this.d);
                  this.f = new fqx.a(this.a + $$2 + 1, this.b, this.c - $$2 - 1, this.d);
               } else {
                  this.e = new fqx.a(this.a, this.b, this.c, $$3);
                  this.f = new fqx.a(this.a, this.b + $$3 + 1, this.c, this.d - $$3 - 1);
               }

               return this.e.a($$0);
            }
         }
      }
   }
}
