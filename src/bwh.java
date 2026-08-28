public class bwh extends bvf {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final alc<cxk> f = alg.a(bwh.class, ale.h);
   public static final int a = 36;
   private long g;

   public bwh(bvm<? extends bwh> $$0, dha $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bwh a(dha $$0, cxk $$1) {
      bwh $$2 = new bwh(bvm.aK, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof ash $$0) {
         this.a($$0);
      } else {
         this.p();
      }
   }

   private void a(ash $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dv(), axf.mu, axg.g);
      }

      if ((long)this.af >= this.g) {
         this.s();
         this.c($$0);
      }
   }

   private void p() {
      if (this.dV().ac() % 5L == 0L) {
         this.l();
      }
   }

   private void s() {
      if (this.dV() instanceof ash $$0) {
         cxk $$2 = this.m();
         if (!$$2.f()) {
            bvf $$4;
            if ($$2.h() instanceof cyf $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new clw($$0, this.dA(), this.dC(), this.dG(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dv(), 1);
            $$0.a($$4, ecj.t, this.dt());
            this.a(cxk.k);
         }
      }
   }

   private bvf a(ash $$0, cyf $$1, cxk $$2) {
      cyf.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dv(), 0));
      jm $$4 = jm.a;
      cql $$5 = cql.a($$1.a($$0, this.dt(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(f, cxk.k);
   }

   @Override
   protected void a(ux $$0) {
      cxk $$1 = $$0.b("item", 10) ? cxk.a(this.dX(), (vu)$$0.p("item")).orElse(cxk.k) : cxk.k;
      this.a($$1);
      this.g = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(ux $$0) {
      if (!this.m().f()) {
         $$0.a("item", this.m().a(this.dX()).d());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bvf $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvf $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public etu n_() {
      return etu.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   public void l() {
      fbs $$0 = this.dt();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fbs $$4 = new fbs(
            this.dA() + 0.4 * (this.ae.k() - this.ae.k()), this.dC() + 0.4 * (this.ae.k() - this.ae.k()), this.dG() + 0.4 * (this.ae.k() - this.ae.k())
         );
         fbs $$5 = $$0.a($$4);
         this.dV().a(ls.bd, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cxk m() {
      return this.au().a(f);
   }

   private void a(cxk $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(ash $$0, btv $$1, float $$2) {
      return false;
   }
}
