public class bvg extends bue {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final akl<cwb> g = akp.a(bvg.class, akn.h);
   public static final int b = 36;
   private long h;

   public bvg(bul<? extends bvg> $$0, dfb $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public static bvg a(dfb $$0, cwb $$1) {
      bvg $$2 = new bvg(bul.aj, $$0);
      $$2.h = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         this.t();
      } else {
         this.q();
      }
   }

   private void q() {
      if ((long)this.ag == this.h - 36L) {
         this.dX().a(null, this.dx(), awl.mc, awm.g);
      }

      if ((long)this.ag >= this.h) {
         this.v();
         this.au();
      }
   }

   private void t() {
      if (this.dX().aa() % 5L == 0L) {
         this.m();
      }
   }

   private void v() {
      if (this.dX() instanceof arn $$0) {
         cwb $$2 = this.o();
         if (!$$2.f()) {
            bue $$4;
            if ($$2.h() instanceof cww $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new ckv($$0, this.dC(), this.dE(), this.dI(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dx(), 1);
            $$0.a($$4, eag.t, this.dv());
            this.a(cwb.k);
         }
      }
   }

   private bue a(arn $$0, cww $$1, cwb $$2) {
      cww.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dx(), 0));
      jm $$4 = jm.a;
      cpg $$5 = cpg.a($$1.a($$0, this.dv(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(g, cwb.k);
   }

   @Override
   protected void a(uk $$0) {
      cwb $$1 = $$0.b("item", 10) ? cwb.a(this.dZ(), (vh)$$0.p("item")).orElse(cwb.k) : cwb.k;
      this.a($$1);
      this.h = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(uk $$0) {
      if (!this.o().f()) {
         $$0.a("item", this.o().a(this.dZ()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(bue $$0) {
      return false;
   }

   @Override
   protected boolean bS() {
      return false;
   }

   @Override
   protected void p(bue $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public erp k_() {
      return erp.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void m() {
      ezn $$0 = this.dv();
      int $$1 = this.af.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         ezn $$4 = new ezn(
            this.dC() + 0.4 * (this.af.k() - this.af.k()), this.dE() + 0.4 * (this.af.k() - this.af.k()), this.dI() + 0.4 * (this.af.k() - this.af.k())
         );
         ezn $$5 = $$0.a($$4);
         this.dX().a(lr.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cwb o() {
      return this.aw().a(g);
   }

   private void a(cwb $$0) {
      this.aw().a(g, $$0);
   }
}
