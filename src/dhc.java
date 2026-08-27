public class dhc extends dhz implements dhy {
   private static final int e = 1;
   private iq<cmy> f = iq.a(27, cmy.f);
   private final dhi g = new dhi() {
      @Override
      protected void a(ctp $$0, hx $$1, djh $$2) {
         dhc.a($$0, $$1, $$2, ars.es);
      }

      @Override
      protected void b(ctp $$0, hx $$1, djh $$2) {
         dhc.a($$0, $$1, $$2, ars.eq);
      }

      @Override
      protected void a(ctp $$0, hx $$1, djh $$2, int $$3, int $$4) {
         dhc.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cfi $$0) {
         if (!($$0.bS instanceof cii)) {
            return false;
         } else {
            bju $$1 = ((cii)$$0.bS).l();
            return $$1 == dhc.this || $$1 instanceof bjt && ((bjt)$$1).a(dhc.this);
         }
      }
   };
   private final dhd h = new dhd();

   protected dhc(dgx<?> $$0, hx $$1, djh $$2) {
      super($$0, $$1, $$2);
   }

   public dhc(hx $$0, djh $$1) {
      this(dgx.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vf l() {
      return vf.c("container.chest");
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.f = iq.a(this.b(), cmy.f);
      if (!this.c_($$0)) {
         bjv.b($$0, this.f);
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjv.a($$0, this.f);
      }
   }

   public static void a(ctp $$0, hx $$1, djh $$2, dhc $$3) {
      $$3.h.a();
   }

   static void a(ctp $$0, hx $$1, djh $$2, arr $$3) {
      djz $$4 = $$2.c(cxt.d);
      if ($$4 != djz.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == djz.c) {
            ic $$8 = cxt.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, art.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.h.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cfi $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public void c(cfi $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   protected iq<cmy> k() {
      return this.f;
   }

   @Override
   protected void a(iq<cmy> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(csv $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dgv $$3 = $$0.c_($$1);
         if ($$3 instanceof dhc) {
            return ((dhc)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dhc $$0, dhc $$1) {
      iq<cmy> $$2 = $$0.k();
      $$0.a($$1.k());
      $$1.a($$2);
   }

   @Override
   protected cib a(int $$0, cfh $$1) {
      return cii.a($$0, $$1, this);
   }

   public void m() {
      if (!this.q) {
         this.g.c(this.i(), this.aB_(), this.r());
      }
   }

   protected void a(ctp $$0, hx $$1, djh $$2, int $$3, int $$4) {
      cwq $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
