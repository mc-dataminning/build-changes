public class eqo extends epi {
   protected final acq a;
   protected final int b;
   protected final int c;
   protected final int d;
   protected final int e;
   protected final int f;
   private final int A;
   private final int C;
   private final int D;
   private final int E;

   eqo(sw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, acq $$10, epi.c $$11) {
      super(0, 0, 150, 20, $$0, $$11, x);
      this.e = $$8;
      this.f = $$9;
      this.b = $$1;
      this.c = $$2;
      this.d = $$5;
      this.a = $$10;
      this.A = $$3;
      this.C = $$4;
      this.D = $$6;
      this.E = $$7;
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      this.a($$0, this.a, this.a(), this.b(), this.b, this.c, this.d, this.D, this.E, this.e, this.f);
   }

   @Override
   public void a(eox $$0, eov $$1, int $$2) {
      int $$3 = this.p() + 2;
      int $$4 = this.p() + this.k() - this.D - 6;
      a($$0, $$1, this.l(), $$3, this.r(), $$4, this.r() + this.h(), $$2);
   }

   private int a() {
      return this.p() + (this.o / 2 - this.D / 2) + this.A;
   }

   private int b() {
      return this.r() + this.C;
   }

   public static eqo.a a(sw $$0, acq $$1, epi.c $$2) {
      return new eqo.a($$0, $$1, $$2);
   }

   public static class a {
      private final sw a;
      private final acq b;
      private final epi.c c;
      private int d;
      private int e;
      private int f;
      private int g;
      private int h;
      private int i;
      private int j;
      private int k;
      private int l;

      public a(sw $$0, acq $$1, epi.c $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public eqo.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public eqo.a b(int $$0, int $$1) {
         this.k = $$0;
         this.l = $$1;
         return this;
      }

      public eqo.a a(int $$0) {
         this.f = $$0;
         return this;
      }

      public eqo.a c(int $$0, int $$1) {
         this.g = $$0;
         this.h = $$1;
         return this;
      }

      public eqo.a d(int $$0, int $$1) {
         this.i = $$0;
         this.j = $$1;
         return this;
      }

      public eqo a() {
         return new eqo(this.a, this.d, this.e, this.k, this.l, this.f, this.g, this.h, this.i, this.j, this.b, this.c);
      }
   }
}
