import javax.annotation.Nullable;

public abstract class fpl extends fof {
   protected final alz a;
   protected final int b;
   protected final int c;

   fpl(int $$0, int $$1, xv $$2, int $$3, int $$4, alz $$5, fof.c $$6, @Nullable fof.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fpl.a a(xv $$0, fof.c $$1, boolean $$2) {
      return new fpl.a($$0, $$1, $$2);
   }

   public static class a {
      private final xv b;
      private final fof.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private alz g;
      private int h;
      private int i;
      @Nullable
      fof.b a;

      public a(xv $$0, fof.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fpl.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fpl.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fpl.a a(alz $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fpl.a a(fof.b $$0) {
         this.a = $$0;
         return this;
      }

      public fpl a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fpl)(this.d
               ? new fpl.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fpl.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fpl {
      protected b(int $$0, int $$1, xv $$2, int $$3, int $$4, alz $$5, fof.c $$6, @Nullable fof.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fns $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.D() + this.y() / 2 - this.b / 2;
         int $$5 = this.E() + this.w() / 2 - this.c / 2;
         $$0.a(glv::C, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fns $$0, fnq $$1, int $$2) {
      }
   }

   public static class c extends fpl {
      protected c(int $$0, int $$1, xv $$2, int $$3, int $$4, alz $$5, fof.c $$6, @Nullable fof.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fns $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.D() + this.y() - this.b - 2;
         int $$5 = this.E() + this.w() / 2 - this.c / 2;
         $$0.a(glv::C, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fns $$0, fnq $$1, int $$2) {
         int $$3 = this.D() + 2;
         int $$4 = this.D() + this.y() - this.b - 4;
         int $$5 = this.D() + this.y() / 2;
         a($$0, $$1, this.z(), $$5, $$3, this.E(), $$4, this.E() + this.w(), $$2);
      }
   }
}
