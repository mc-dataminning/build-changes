import javax.annotation.Nullable;

public abstract class flf extends fka {
   protected final alb a;
   protected final int b;
   protected final int c;

   flf(int $$0, int $$1, xd $$2, int $$3, int $$4, alb $$5, fka.c $$6, @Nullable fka.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static flf.a a(xd $$0, fka.c $$1, boolean $$2) {
      return new flf.a($$0, $$1, $$2);
   }

   public static class a {
      private final xd b;
      private final fka.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private alb g;
      private int h;
      private int i;
      @Nullable
      fka.b a;

      public a(xd $$0, fka.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public flf.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public flf.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public flf.a a(alb $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public flf.a a(fka.b $$0) {
         this.a = $$0;
         return this;
      }

      public flf a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (flf)(this.d
               ? new flf.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new flf.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends flf {
      protected b(int $$0, int $$1, xd $$2, int $$3, int $$4, alb $$5, fka.c $$6, @Nullable fka.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fjn $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.D() + this.y() / 2 - this.b / 2;
         int $$5 = this.E() + this.w() / 2 - this.c / 2;
         $$0.a(ghe::C, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fjn $$0, fjl $$1, int $$2) {
      }
   }

   public static class c extends flf {
      protected c(int $$0, int $$1, xd $$2, int $$3, int $$4, alb $$5, fka.c $$6, @Nullable fka.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fjn $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.D() + this.y() - this.b - 2;
         int $$5 = this.E() + this.w() / 2 - this.c / 2;
         $$0.a(ghe::C, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fjn $$0, fjl $$1, int $$2) {
         int $$3 = this.D() + 2;
         int $$4 = this.D() + this.y() - this.b - 4;
         int $$5 = this.D() + this.y() / 2;
         a($$0, $$1, this.z(), $$5, $$3, this.E(), $$4, this.E() + this.w(), $$2);
      }
   }
}
