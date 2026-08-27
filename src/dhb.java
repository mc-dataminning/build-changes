public class dhb extends dhy implements dhx {
   private static final int e = 1;
   private iq<cmx> f = iq.a(27, cmx.f);
   private final dhh g = new dhh() {
      @Override
      protected void a(cto $$0, hx $$1, djg $$2) {
         dhb.a($$0, $$1, $$2, arr.es);
      }

      @Override
      protected void b(cto $$0, hx $$1, djg $$2) {
         dhb.a($$0, $$1, $$2, arr.eq);
      }

      @Override
      protected void a(cto $$0, hx $$1, djg $$2, int $$3, int $$4) {
         dhb.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cfh $$0) {
         if (!($$0.bS instanceof cih)) {
            return false;
         } else {
            bjt $$1 = ((cih)$$0.bS).l();
            return $$1 == dhb.this || $$1 instanceof bjs && ((bjs)$$1).a(dhb.this);
         }
      }
   };
   private final dhc h = new dhc();

   protected dhb(dgw<?> $$0, hx $$1, djg $$2) {
      super($$0, $$1, $$2);
   }

   public dhb(hx $$0, djg $$1) {
      this(dgw.b, $$0, $$1);
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
      this.f = iq.a(this.b(), cmx.f);
      if (!this.c_($$0)) {
         bju.b($$0, this.f);
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bju.a($$0, this.f);
      }
   }

   public static void a(cto $$0, hx $$1, djg $$2, dhb $$3) {
      $$3.h.a();
   }

   static void a(cto $$0, hx $$1, djg $$2, arq $$3) {
      djy $$4 = $$2.c(cxs.d);
      if ($$4 != djy.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == djy.c) {
            ic $$8 = cxs.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, ars.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cfh $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public void c(cfh $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   protected iq<cmx> k() {
      return this.f;
   }

   @Override
   protected void a(iq<cmx> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(csu $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dgu $$3 = $$0.c_($$1);
         if ($$3 instanceof dhb) {
            return ((dhb)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dhb $$0, dhb $$1) {
      iq<cmx> $$2 = $$0.k();
      $$0.a($$1.k());
      $$1.a($$2);
   }

   @Override
   protected cia a(int $$0, cfg $$1) {
      return cih.a($$0, $$1, this);
   }

   public void m() {
      if (!this.q) {
         this.g.c(this.i(), this.aB_(), this.r());
      }
   }

   protected void a(cto $$0, hx $$1, djg $$2, int $$3, int $$4) {
      cwp $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
