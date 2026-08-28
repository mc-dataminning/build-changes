import javax.annotation.Nullable;

public abstract class fto extends fsj {
   protected final alg a;
   protected final int b;
   protected final int c;

   fto(int $$0, int $$1, wy $$2, int $$3, int $$4, alg $$5, fsj.c $$6, @Nullable fsj.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fto.a a(wy $$0, fsj.c $$1, boolean $$2) {
      return new fto.a($$0, $$1, $$2);
   }

   public static class a {
      private final wy b;
      private final fsj.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private alg g;
      private int h;
      private int i;
      @Nullable
      fsj.b a;

      public a(wy $$0, fsj.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fto.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fto.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fto.a a(alg $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fto.a a(fsj.b $$0) {
         this.a = $$0;
         return this;
      }

      public fto a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fto)(this.d
               ? new fto.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fto.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fto {
      protected b(int $$0, int $$1, wy $$2, int $$3, int $$4, alg $$5, fsj.c $$6, @Nullable fsj.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(frv $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.F() + this.A() / 2 - this.b / 2;
         int $$5 = this.G() + this.y() / 2 - this.c / 2;
         $$0.a(gqk::H, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(frv $$0, frt $$1, int $$2) {
      }
   }

   public static class c extends fto {
      protected c(int $$0, int $$1, wy $$2, int $$3, int $$4, alg $$5, fsj.c $$6, @Nullable fsj.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(frv $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.F() + this.A() - this.b - 2;
         int $$5 = this.G() + this.y() / 2 - this.c / 2;
         $$0.a(gqk::H, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(frv $$0, frt $$1, int $$2) {
         int $$3 = this.F() + 2;
         int $$4 = this.F() + this.A() - this.b - 4;
         int $$5 = this.F() + this.A() / 2;
         a($$0, $$1, this.B(), $$5, $$3, this.G(), $$4, this.G() + this.y(), $$2);
      }
   }
}
