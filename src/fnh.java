import com.mojang.blaze3d.platform.TextureUtil;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class fnh extends gwr implements gws {
   private static final int d = 256;
   private final fni e;
   private final boolean f;
   private final fnh.a g;

   public fnh(fni $$0, boolean $$1) {
      this.f = $$1;
      this.g = new fnh.a(0, 0, 256, 256);
      TextureUtil.prepareImage($$1 ? fci.b.a : fci.b.d, this.a(), 256, 256);
      this.e = $$0;
   }

   @Override
   public void a(auv $$0) {
   }

   @Override
   public void close() {
      this.b();
   }

   @Nullable
   public fnk a(fbi $$0) {
      if ($$0.c() != this.f) {
         return null;
      } else {
         fnh.a $$1 = this.g.a($$0);
         if ($$1 != null) {
            this.d();
            $$0.a($$1.a, $$1.b);
            float $$2 = 256.0F;
            float $$3 = 256.0F;
            float $$4 = 0.01F;
            return new fnk(
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
   public void a(ale $$0, Path $$1) {
      String $$2 = $$0.c();
      TextureUtil.writeAsPNG($$1, $$2, this.a(), 0, 256, 256, $$0x -> ($$0x & 0xFF000000) == 0 ? -16777216 : $$0x);
   }

   static class a {
      final int a;
      final int b;
      private final int c;
      private final int d;
      @Nullable
      private fnh.a e;
      @Nullable
      private fnh.a f;
      private boolean g;

      a(int $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Nullable
      fnh.a a(fbi $$0) {
         if (this.e != null && this.f != null) {
            fnh.a $$1 = this.e.a($$0);
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
                  this.e = new fnh.a(this.a, this.b, $$2, this.d);
                  this.f = new fnh.a(this.a + $$2 + 1, this.b, this.c - $$2 - 1, this.d);
               } else {
                  this.e = new fnh.a(this.a, this.b, this.c, $$3);
                  this.f = new fnh.a(this.a, this.b + $$3 + 1, this.c, this.d - $$3 - 1);
               }

               return this.e.a($$0);
            }
         }
      }
   }
}
