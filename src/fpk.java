import javax.annotation.Nullable;

public abstract class fpk extends foe {
   protected final alz a;
   protected final int b;
   protected final int c;

   fpk(int $$0, int $$1, xv $$2, int $$3, int $$4, alz $$5, foe.c $$6, @Nullable foe.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fpk.a a(xv $$0, foe.c $$1, boolean $$2) {
      return new fpk.a($$0, $$1, $$2);
   }

   public static class a {
      private final xv b;
      private final foe.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private alz g;
      private int h;
      private int i;
      @Nullable
      foe.b a;

      public a(xv $$0, foe.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fpk.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fpk.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fpk.a a(alz $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fpk.a a(foe.b $$0) {
         this.a = $$0;
         return this;
      }

      public fpk a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fpk)(this.d
               ? new fpk.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fpk.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fpk {
      protected b(int $$0, int $$1, xv $$2, int $$3, int $$4, alz $$5, foe.c $$6, @Nullable foe.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fnr $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.D() + this.y() / 2 - this.b / 2;
         int $$5 = this.E() + this.w() / 2 - this.c / 2;
         $$0.a(glu::C, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fnr $$0, fnp $$1, int $$2) {
      }
   }

   public static class c extends fpk {
      protected c(int $$0, int $$1, xv $$2, int $$3, int $$4, alz $$5, foe.c $$6, @Nullable foe.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fnr $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.D() + this.y() - this.b - 2;
         int $$5 = this.E() + this.w() / 2 - this.c / 2;
         $$0.a(glu::C, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fnr $$0, fnp $$1, int $$2) {
         int $$3 = this.D() + 2;
         int $$4 = this.D() + this.y() - this.b - 4;
         int $$5 = this.D() + this.y() / 2;
         a($$0, $$1, this.z(), $$5, $$3, this.E(), $$4, this.E() + this.w(), $$2);
      }
   }
}
