import javax.annotation.Nullable;

public abstract class fhe extends ffz {
   protected final akm a;
   protected final int b;
   protected final int c;

   fhe(int $$0, int $$1, wx $$2, int $$3, int $$4, akm $$5, ffz.c $$6, @Nullable ffz.b $$7) {
      super(0, 0, $$0, $$1, $$2, $$6, $$7 == null ? q : $$7);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fhe.a a(wx $$0, ffz.c $$1, boolean $$2) {
      return new fhe.a($$0, $$1, $$2);
   }

   public static class a {
      private final wx b;
      private final ffz.c c;
      private final boolean d;
      private int e = 150;
      private int f = 20;
      @Nullable
      private akm g;
      private int h;
      private int i;
      @Nullable
      ffz.b a;

      public a(wx $$0, ffz.c $$1, boolean $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public fhe.a a(int $$0) {
         this.e = $$0;
         return this;
      }

      public fhe.a a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
         return this;
      }

      public fhe.a a(akm $$0, int $$1, int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      public fhe.a a(ffz.b $$0) {
         this.a = $$0;
         return this;
      }

      public fhe a() {
         if (this.g == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fhe)(this.d
               ? new fhe.b(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a)
               : new fhe.c(this.e, this.f, this.b, this.h, this.i, this.g, this.c, this.a));
         }
      }
   }

   public static class b extends fhe {
      protected b(int $$0, int $$1, wx $$2, int $$3, int $$4, akm $$5, ffz.c $$6, @Nullable ffz.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(ffm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.C() + this.x() / 2 - this.b / 2;
         int $$5 = this.D() + this.v() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(ffm $$0, ffk $$1, int $$2) {
      }
   }

   public static class c extends fhe {
      protected c(int $$0, int $$1, wx $$2, int $$3, int $$4, akm $$5, ffz.c $$6, @Nullable ffz.b $$7) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      @Override
      public void b(ffm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.C() + this.x() - this.b - 2;
         int $$5 = this.D() + this.v() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(ffm $$0, ffk $$1, int $$2) {
         int $$3 = this.C() + 2;
         int $$4 = this.C() + this.x() - this.b - 4;
         int $$5 = this.C() + this.x() / 2;
         a($$0, $$1, this.y(), $$5, $$3, this.D(), $$4, this.D() + this.v(), $$2);
      }
   }
}
