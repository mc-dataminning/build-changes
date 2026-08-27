public class dhk extends dih implements dig {
   private static final int e = 1;
   private iq<cng> f = iq.a(27, cng.f);
   private final dhq g = new dhq() {
      @Override
      protected void a(ctx $$0, hx $$1, djp $$2) {
         dhk.a($$0, $$1, $$2, art.eH);
      }

      @Override
      protected void b(ctx $$0, hx $$1, djp $$2) {
         dhk.a($$0, $$1, $$2, art.eF);
      }

      @Override
      protected void a(ctx $$0, hx $$1, djp $$2, int $$3, int $$4) {
         dhk.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cfq $$0) {
         if (!($$0.bW instanceof ciq)) {
            return false;
         } else {
            bjv $$1 = ((ciq)$$0.bW).l();
            return $$1 == dhk.this || $$1 instanceof bju && ((bju)$$1).a(dhk.this);
         }
      }
   };
   private final dhl h = new dhl();

   protected dhk(dhf<?> $$0, hx $$1, djp $$2) {
      super($$0, $$1, $$2);
   }

   public dhk(hx $$0, djp $$1) {
      this(dhf.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vg l() {
      return vg.c("container.chest");
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.f = iq.a(this.b(), cng.f);
      if (!this.c_($$0)) {
         bjw.b($$0, this.f);
      }
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjw.a($$0, this.f);
      }
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dhk $$3) {
      $$3.h.a();
   }

   static void a(ctx $$0, hx $$1, djp $$2, ars $$3) {
      dkh $$4 = $$2.c(cyb.d);
      if ($$4 != dkh.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dkh.c) {
            ic $$8 = cyb.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aru.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cfq $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   public void c(cfq $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   @Override
   protected iq<cng> k() {
      return this.f;
   }

   @Override
   protected void a(iq<cng> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(ctd $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dhd $$3 = $$0.c_($$1);
         if ($$3 instanceof dhk) {
            return ((dhk)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dhk $$0, dhk $$1) {
      iq<cng> $$2 = $$0.k();
      $$0.a($$1.k());
      $$1.a($$2);
   }

   @Override
   protected cij a(int $$0, cfp $$1) {
      return ciq.a($$0, $$1, this);
   }

   public void m() {
      if (!this.q) {
         this.g.c(this.i(), this.aE_(), this.r());
      }
   }

   protected void a(ctx $$0, hx $$1, djp $$2, int $$3, int $$4) {
      cwy $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
