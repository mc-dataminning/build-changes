import javax.annotation.Nullable;

public abstract class fpy extends fot {
   protected final akv a;
   protected final int b;
   protected final int c;

   fpy(int $$0, int $$1, wp $$2, int $$3, int $$4, akv $$5, fot.c $$6, @Nullable fot.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fpy.a a(wp $$0, fot.c $$1, boolean $$2) {
      return new fpy.a($$0, $$1, $$2);
   }

   public static class a {
      private final wp b;
      private final fot.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private akv g;
      private int h;
      private int i;
      @Nullable
      fot.b a;

      public a(wp $$0, fot.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fpy.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fpy.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fpy.a a(akv $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fpy.a a(fot.b $$0) {
         this.a = $$0;
         return this;
      }

      public fpy a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fpy)(this.d
               ? new fpy.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fpy.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fpy {
      protected b(int $$0, int $$1, wp $$2, int $$3, int $$4, akv $$5, fot.c $$6, @Nullable fot.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(foe $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.F() + this.A() / 2 - this.b / 2;
         int $$5 = this.G() + this.y() / 2 - this.c / 2;
         $$0.a(gmi::H, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(foe $$0, foc $$1, int $$2) {
      }
   }

   public static class c extends fpy {
      protected c(int $$0, int $$1, wp $$2, int $$3, int $$4, akv $$5, fot.c $$6, @Nullable fot.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(foe $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.F() + this.A() - this.b - 2;
         int $$5 = this.G() + this.y() / 2 - this.c / 2;
         $$0.a(gmi::H, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(foe $$0, foc $$1, int $$2) {
         int $$3 = this.F() + 2;
         int $$4 = this.F() + this.A() - this.b - 4;
         int $$5 = this.F() + this.A() / 2;
         a($$0, $$1, this.B(), $$5, $$3, this.G(), $$4, this.G() + this.y(), $$2);
      }
   }
}
