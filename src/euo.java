import javax.annotation.Nullable;

public abstract class euo extends etj {
   protected final afw a;
   protected final int b;
   protected final int c;

   euo(int $$0, int $$1, ui $$2, int $$3, int $$4, afw $$5, etj.c $$6) {
      super(0, 0, $$0, $$1, $$2, $$6, o);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static euo.a a(ui $$0, etj.c $$1, boolean $$2) {
      return new euo.a($$0, $$1, $$2);
   }

   public static class a {
      private final ui a;
      private final etj.c b;
      private final boolean c;
      private int d = 150;
      private int e = 20;
      @Nullable
      private afw f;
      private int g;
      private int h;

      public a(ui $$0, etj.c $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public euo.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public euo.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public euo.a a(afw $$0, int $$1, int $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
         return this;
      }

      public euo a() {
         if (this.f == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (euo)(this.c
               ? new euo.b(this.d, this.e, this.a, this.g, this.h, this.f, this.b)
               : new euo.c(this.d, this.e, this.a, this.g, this.h, this.f, this.b));
         }
      }
   }

   public static class b extends euo {
      protected b(int $$0, int $$1, ui $$2, int $$3, int $$4, afw $$5, etj.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(esy $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.p() + this.k() / 2 - this.b / 2;
         int $$5 = this.r() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(esy $$0, esw $$1, int $$2) {
      }
   }

   public static class c extends euo {
      protected c(int $$0, int $$1, ui $$2, int $$3, int $$4, afw $$5, etj.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(esy $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.p() + this.k() - this.b - 2;
         int $$5 = this.r() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(esy $$0, esw $$1, int $$2) {
         int $$3 = this.p() + 2;
         int $$4 = this.p() + this.k() - this.b - 4;
         int $$5 = this.p() + this.k() / 2;
         a($$0, $$1, this.l(), $$5, $$3, this.r(), $$4, this.r() + this.i(), $$2);
      }
   }
}
