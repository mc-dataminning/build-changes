import javax.annotation.Nullable;

public abstract class fir extends fhm {
   protected final akk a;
   protected final int b;
   protected final int c;

   fir(int $$0, int $$1, wu $$2, int $$3, int $$4, akk $$5, fhm.c $$6, @Nullable fhm.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fir.a a(wu $$0, fhm.c $$1, boolean $$2) {
      return new fir.a($$0, $$1, $$2);
   }

   public static class a {
      private final wu b;
      private final fhm.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private akk g;
      private int h;
      private int i;
      @Nullable
      fhm.b a;

      public a(wu $$0, fhm.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fir.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fir.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fir.a a(akk $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fir.a a(fhm.b $$0) {
         this.a = $$0;
         return this;
      }

      public fir a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fir)(this.d
               ? new fir.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fir.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fir {
      protected b(int $$0, int $$1, wu $$2, int $$3, int $$4, akk $$5, fhm.c $$6, @Nullable fhm.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fgz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.D() + this.y() / 2 - this.b / 2;
         int $$5 = this.E() + this.w() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fgz $$0, fgx $$1, int $$2) {
      }
   }

   public static class c extends fir {
      protected c(int $$0, int $$1, wu $$2, int $$3, int $$4, akk $$5, fhm.c $$6, @Nullable fhm.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fgz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.D() + this.y() - this.b - 2;
         int $$5 = this.E() + this.w() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fgz $$0, fgx $$1, int $$2) {
         int $$3 = this.D() + 2;
         int $$4 = this.D() + this.y() - this.b - 4;
         int $$5 = this.D() + this.y() / 2;
         a($$0, $$1, this.z(), $$5, $$3, this.E(), $$4, this.E() + this.w(), $$2);
      }
   }
}
