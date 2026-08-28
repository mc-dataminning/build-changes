import javax.annotation.Nullable;

public abstract class fii extends fhd {
   protected final ale a;
   protected final int b;
   protected final int c;

   fii(int $$0, int $$1, xo $$2, int $$3, int $$4, ale $$5, fhd.c $$6, @Nullable fhd.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fii.a a(xo $$0, fhd.c $$1, boolean $$2) {
      return new fii.a($$0, $$1, $$2);
   }

   public static class a {
      private final xo b;
      private final fhd.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private ale g;
      private int h;
      private int i;
      @Nullable
      fhd.b a;

      public a(xo $$0, fhd.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fii.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fii.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fii.a a(ale $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fii.a a(fhd.b $$0) {
         this.a = $$0;
         return this;
      }

      public fii a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fii)(this.d
               ? new fii.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fii.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fii {
      protected b(int $$0, int $$1, xo $$2, int $$3, int $$4, ale $$5, fhd.c $$6, @Nullable fhd.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fgq $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.C() + this.x() / 2 - this.b / 2;
         int $$5 = this.D() + this.v() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fgq $$0, fgo $$1, int $$2) {
      }
   }

   public static class c extends fii {
      protected c(int $$0, int $$1, xo $$2, int $$3, int $$4, ale $$5, fhd.c $$6, @Nullable fhd.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fgq $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.C() + this.x() - this.b - 2;
         int $$5 = this.D() + this.v() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fgq $$0, fgo $$1, int $$2) {
         int $$3 = this.C() + 2;
         int $$4 = this.C() + this.x() - this.b - 4;
         int $$5 = this.C() + this.x() / 2;
         a($$0, $$1, this.y(), $$5, $$3, this.D(), $$4, this.D() + this.v(), $$2);
      }
   }
}
