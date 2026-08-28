public class duz extends dwa implements dvy {
   private static final int d = 1;
   private ka<cxh> e = ka.a(27, cxh.k);
   private final dvf f = new dvf() {
      @Override
      protected void a(dgz $$0, ji $$1, dxq $$2) {
         duz.a($$0, $$1, $$2, awa.eS);
      }

      @Override
      protected void b(dgz $$0, ji $$1, dxq $$2) {
         duz.a($$0, $$1, $$2, awa.eQ);
      }

      @Override
      protected void a(dgz $$0, ji $$1, dxq $$2, int $$3, int $$4) {
         duz.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cpr $$0) {
         if (!($$0.bQ instanceof ctf)) {
            return false;
         } else {
            bsr $$1 = ((ctf)$$0.bQ).l();
            return $$1 == duz.this || $$1 instanceof bsq && ((bsq)$$1).a(duz.this);
         }
      }
   };
   private final dva g = new dva();

   protected duz(duu<?> $$0, ji $$1, dxq $$2) {
      super($$0, $$1, $$2);
   }

   public duz(ji $$0, dxq $$1) {
      this(duu.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wp j() {
      return wp.c("container.chest");
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.e = ka.a(this.b(), cxh.k);
      if (!this.b_($$0)) {
         bss.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bss.a($$0, this.e, $$1);
      }
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, duz $$3) {
      $$3.g.a();
   }

   static void a(dgz $$0, ji $$1, dxq $$2, avz $$3) {
      dyi $$4 = $$2.c(dlh.d);
      if ($$4 != dyi.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dyi.c) {
            jn $$8 = dlh.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awb.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.g.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void c_(cpr $$0) {
      if (!this.p && !$$0.U_()) {
         this.f.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cpr $$0) {
      if (!this.p && !$$0.U_()) {
         this.f.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   protected ka<cxh> f() {
      return this.e;
   }

   @Override
   protected void a(ka<cxh> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dgf $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dus $$3 = $$0.c_($$1);
         if ($$3 instanceof duz) {
            return ((duz)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(duz $$0, duz $$1) {
      ka<cxh> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected csw a(int $$0, cpq $$1) {
      return ctf.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.aA_(), this.m());
      }
   }

   protected void a(dgz $$0, ji $$1, dxq $$2, int $$3, int $$4) {
      dke $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
