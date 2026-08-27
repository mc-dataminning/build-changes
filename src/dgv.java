public class dgv extends dhs implements dhr {
   private static final int e = 1;
   private iq<cmr> f = iq.a(27, cmr.f);
   private final dhb g = new dhb() {
      @Override
      protected void a(cti $$0, hx $$1, dja $$2) {
         dgv.a($$0, $$1, $$2, arm.es);
      }

      @Override
      protected void b(cti $$0, hx $$1, dja $$2) {
         dgv.a($$0, $$1, $$2, arm.eq);
      }

      @Override
      protected void a(cti $$0, hx $$1, dja $$2, int $$3, int $$4) {
         dgv.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cfb $$0) {
         if (!($$0.bS instanceof cib)) {
            return false;
         } else {
            bjo $$1 = ((cib)$$0.bS).l();
            return $$1 == dgv.this || $$1 instanceof bjn && ((bjn)$$1).a(dgv.this);
         }
      }
   };
   private final dgw h = new dgw();

   protected dgv(dgq<?> $$0, hx $$1, dja $$2) {
      super($$0, $$1, $$2);
   }

   public dgv(hx $$0, dja $$1) {
      this(dgq.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vd l() {
      return vd.c("container.chest");
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.f = iq.a(this.b(), cmr.f);
      if (!this.c_($$0)) {
         bjp.b($$0, this.f);
      }
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjp.a($$0, this.f);
      }
   }

   public static void a(cti $$0, hx $$1, dja $$2, dgv $$3) {
      $$3.h.a();
   }

   static void a(cti $$0, hx $$1, dja $$2, arl $$3) {
      djs $$4 = $$2.c(cxm.d);
      if ($$4 != djs.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == djs.c) {
            ic $$8 = cxm.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, arn.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cfb $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public void c(cfb $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   protected iq<cmr> k() {
      return this.f;
   }

   @Override
   protected void a(iq<cmr> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cso $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dgo $$3 = $$0.c_($$1);
         if ($$3 instanceof dgv) {
            return ((dgv)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dgv $$0, dgv $$1) {
      iq<cmr> $$2 = $$0.k();
      $$0.a($$1.k());
      $$1.a($$2);
   }

   @Override
   protected chu a(int $$0, cfa $$1) {
      return cib.a($$0, $$1, this);
   }

   public void m() {
      if (!this.q) {
         this.g.c(this.i(), this.aB_(), this.r());
      }
   }

   protected void a(cti $$0, hx $$1, dja $$2, int $$3, int $$4) {
      cwj $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
