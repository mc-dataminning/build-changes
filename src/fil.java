import javax.annotation.Nullable;

public abstract class fil extends fhg {
   protected final alf a;
   protected final int b;
   protected final int c;

   fil(int $$0, int $$1, xp $$2, int $$3, int $$4, alf $$5, fhg.c $$6, @Nullable fhg.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fil.a a(xp $$0, fhg.c $$1, boolean $$2) {
      return new fil.a($$0, $$1, $$2);
   }

   public static class a {
      private final xp b;
      private final fhg.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private alf g;
      private int h;
      private int i;
      @Nullable
      fhg.b a;

      public a(xp $$0, fhg.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fil.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fil.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fil.a a(alf $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fil.a a(fhg.b $$0) {
         this.a = $$0;
         return this;
      }

      public fil a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fil)(this.d
               ? new fil.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fil.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fil {
      protected b(int $$0, int $$1, xp $$2, int $$3, int $$4, alf $$5, fhg.c $$6, @Nullable fhg.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fgt $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.C() + this.x() / 2 - this.b / 2;
         int $$5 = this.D() + this.v() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fgt $$0, fgr $$1, int $$2) {
      }
   }

   public static class c extends fil {
      protected c(int $$0, int $$1, xp $$2, int $$3, int $$4, alf $$5, fhg.c $$6, @Nullable fhg.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fgt $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.C() + this.x() - this.b - 2;
         int $$5 = this.D() + this.v() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fgt $$0, fgr $$1, int $$2) {
         int $$3 = this.C() + 2;
         int $$4 = this.C() + this.x() - this.b - 4;
         int $$5 = this.C() + this.x() / 2;
         a($$0, $$1, this.y(), $$5, $$3, this.D(), $$4, this.D() + this.v(), $$2);
      }
   }
}
