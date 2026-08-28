import javax.annotation.Nullable;

public abstract class fpv extends fop {
   protected final aku a;
   protected final int b;
   protected final int c;

   fpv(int $$0, int $$1, wo $$2, int $$3, int $$4, aku $$5, fop.c $$6, @Nullable fop.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fpv.a a(wo $$0, fop.c $$1, boolean $$2) {
      return new fpv.a($$0, $$1, $$2);
   }

   public static class a {
      private final wo b;
      private final fop.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private aku g;
      private int h;
      private int i;
      @Nullable
      fop.b a;

      public a(wo $$0, fop.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fpv.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fpv.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fpv.a a(aku $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fpv.a a(fop.b $$0) {
         this.a = $$0;
         return this;
      }

      public fpv a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fpv)(this.d
               ? new fpv.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fpv.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fpv {
      protected b(int $$0, int $$1, wo $$2, int $$3, int $$4, aku $$5, fop.c $$6, @Nullable fop.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fob $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.F() + this.A() / 2 - this.b / 2;
         int $$5 = this.G() + this.y() / 2 - this.c / 2;
         $$0.a(gmf::H, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fob $$0, fnz $$1, int $$2) {
      }
   }

   public static class c extends fpv {
      protected c(int $$0, int $$1, wo $$2, int $$3, int $$4, aku $$5, fop.c $$6, @Nullable fop.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(fob $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.F() + this.A() - this.b - 2;
         int $$5 = this.G() + this.y() / 2 - this.c / 2;
         $$0.a(gmf::H, this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(fob $$0, fnz $$1, int $$2) {
         int $$3 = this.F() + 2;
         int $$4 = this.F() + this.A() - this.b - 4;
         int $$5 = this.F() + this.A() / 2;
         a($$0, $$1, this.B(), $$5, $$3, this.G(), $$4, this.G() + this.y(), $$2);
      }
   }
}
