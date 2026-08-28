public class duh extends dvi implements dvg {
   private static final int d = 1;
   private ka<cwq> e = ka.a(27, cwq.j);
   private final dun f = new dun() {
      @Override
      protected void a(dgj $$0, ji $$1, dwy $$2) {
         duh.a($$0, $$1, $$2, awa.eS);
      }

      @Override
      protected void b(dgj $$0, ji $$1, dwy $$2) {
         duh.a($$0, $$1, $$2, awa.eQ);
      }

      @Override
      protected void a(dgj $$0, ji $$1, dwy $$2, int $$3, int $$4) {
         duh.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(coy $$0) {
         if (!($$0.cd instanceof csm)) {
            return false;
         } else {
            bse $$1 = ((csm)$$0.cd).l();
            return $$1 == duh.this || $$1 instanceof bsd && ((bsd)$$1).a(duh.this);
         }
      }
   };
   private final dui g = new dui();

   protected duh(duc<?> $$0, ji $$1, dwy $$2) {
      super($$0, $$1, $$2);
   }

   public duh(ji $$0, dwy $$1) {
      this(duc.b, $$0, $$1);
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
      this.e = ka.a(this.b(), cwq.j);
      if (!this.b_($$0)) {
         bsf.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsf.a($$0, this.e, $$1);
      }
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, duh $$3) {
      $$3.g.a();
   }

   static void a(dgj $$0, ji $$1, dwy $$2, avz $$3) {
      dxq $$4 = $$2.c(dkq.d);
      if ($$4 != dxq.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dxq.c) {
            jn $$8 = dkq.i($$2);
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
   public void c_(coy $$0) {
      if (!this.p && !$$0.Z_()) {
         this.f.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(coy $$0) {
      if (!this.p && !$$0.Z_()) {
         this.f.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   protected ka<cwq> f() {
      return this.e;
   }

   @Override
   protected void a(ka<cwq> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dfo $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dua $$3 = $$0.c_($$1);
         if ($$3 instanceof duh) {
            return ((duh)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(duh $$0, duh $$1) {
      ka<cwq> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected csd a(int $$0, cox $$1) {
      return csm.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.aA_(), this.m());
      }
   }

   protected void a(dgj $$0, ji $$1, dwy $$2, int $$3, int $$4) {
      djn $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
