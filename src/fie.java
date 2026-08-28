import javax.annotation.Nullable;

public abstract class fie extends fgz {
   protected final alb a;
   protected final int b;
   protected final int c;

   fie(int $$0, int $$1, xl $$2, int $$3, int $$4, alb $$5, fgz.c $$6, @Nullable fgz.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fie.a a(xl $$0, fgz.c $$1, boolean $$2) {
      return new fie.a($$0, $$1, $$2);
   }

   public static class a {
      private final xl b;
      private final fgz.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private alb g;
      private int h;
      private int i;
      @Nullable
      fgz.b a;

      public a(xl $$0, fgz.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fie.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fie.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fie.a a(alb $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fie.a a(fgz.b $$0) {
         this.a = $$0;
         return this;
      }

      public fie a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fie)(this.d
               ? new fie.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fie.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fie {
      protected b(int $$0, int $$1, xl $$2, int $$3, int $$4, alb $$5, fgz.c $$6, @Nullable fgz.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.C() + this.x() / 2 - this.b / 2;
         int $$5 = this.D() + this.v() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fgm $$0, fgk $$1, int $$2) {
      }
   }

   public static class c extends fie {
      protected c(int $$0, int $$1, xl $$2, int $$3, int $$4, alb $$5, fgz.c $$6, @Nullable fgz.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.C() + this.x() - this.b - 2;
         int $$5 = this.D() + this.v() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fgm $$0, fgk $$1, int $$2) {
         int $$3 = this.C() + 2;
         int $$4 = this.C() + this.x() - this.b - 4;
         int $$5 = this.C() + this.x() / 2;
         a($$0, $$1, this.y(), $$5, $$3, this.D(), $$4, this.D() + this.v(), $$2);
      }
   }
}
