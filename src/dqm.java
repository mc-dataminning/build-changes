public class dqm extends drl implements drj {
   private static final int d = 1;
   private jv<cuo> e = jv.a(27, cuo.l);
   private final dqs f = new dqs() {
      @Override
      protected void a(dcu $$0, jd $$1, dta $$2) {
         dqm.a($$0, $$1, $$2, avo.eQ);
      }

      @Override
      protected void b(dcu $$0, jd $$1, dta $$2) {
         dqm.a($$0, $$1, $$2, avo.eO);
      }

      @Override
      protected void a(dcu $$0, jd $$1, dta $$2, int $$3, int $$4) {
         dqm.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmv $$0) {
         if (!($$0.cd instanceof cqa)) {
            return false;
         } else {
            bqj $$1 = ((cqa)$$0.cd).l();
            return $$1 == dqm.this || $$1 instanceof bqi && ((bqi)$$1).a(dqm.this);
         }
      }
   };
   private final dqn g = new dqn();

   protected dqm(dqh<?> $$0, jd $$1, dta $$2) {
      super($$0, $$1, $$2);
   }

   public dqm(jd $$0, dta $$1) {
      this(dqh.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wy k() {
      return wy.c("container.chest");
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.e = jv.a(this.b(), cuo.l);
      if (!this.a_($$0)) {
         bqk.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqk.a($$0, this.e, $$1);
      }
   }

   public static void a(dcu $$0, jd $$1, dta $$2, dqm $$3) {
      $$3.g.a();
   }

   static void a(dcu $$0, jd $$1, dta $$2, avn $$3) {
      dts $$4 = $$2.c(dgz.d);
      if ($$4 != dts.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dts.c) {
            ji $$8 = dgz.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avp.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected jv<cuo> j() {
      return this.e;
   }

   @Override
   protected void a(jv<cuo> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dca $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dqf $$3 = $$0.c_($$1);
         if ($$3 instanceof dqm) {
            return ((dqm)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dqm $$0, dqm $$1) {
      jv<cuo> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return cqa.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(dcu $$0, jd $$1, dta $$2, int $$3, int $$4) {
      dfw $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
