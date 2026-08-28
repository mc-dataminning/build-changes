public class dpm extends dqk implements dqi {
   private static final int d = 1;
   private jr<cun> e = jr.a(27, cun.l);
   private final dps f = new dps() {
      @Override
      protected void a(dbw $$0, iz $$1, dsa $$2) {
         dpm.a($$0, $$1, $$2, avz.eQ);
      }

      @Override
      protected void b(dbw $$0, iz $$1, dsa $$2) {
         dpm.a($$0, $$1, $$2, avz.eO);
      }

      @Override
      protected void a(dbw $$0, iz $$1, dsa $$2, int $$3, int $$4) {
         dpm.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmv $$0) {
         if (!($$0.cb instanceof cpz)) {
            return false;
         } else {
            bql $$1 = ((cpz)$$0.cb).l();
            return $$1 == dpm.this || $$1 instanceof bqk && ((bqk)$$1).a(dpm.this);
         }
      }
   };
   private final dpn g = new dpn();

   protected dpm(dph<?> $$0, iz $$1, dsa $$2) {
      super($$0, $$1, $$2);
   }

   public dpm(iz $$0, dsa $$1) {
      this(dph.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xo k() {
      return xo.c("container.chest");
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e = jr.a(this.b(), cun.l);
      if (!this.a_($$0)) {
         bqm.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqm.a($$0, this.e, $$1);
      }
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dpm $$3) {
      $$3.g.a();
   }

   static void a(dbw $$0, iz $$1, dsa $$2, avy $$3) {
      dss $$4 = $$2.c(dga.d);
      if ($$4 != dss.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dss.c) {
            je $$8 = dga.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   protected jr<cun> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cun> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbc $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dpf $$3 = $$0.c_($$1);
         if ($$3 instanceof dpm) {
            return ((dpm)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpm $$0, dpm $$1) {
      jr<cun> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return cpz.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(dbw $$0, iz $$1, dsa $$2, int $$3, int $$4) {
      dex $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
