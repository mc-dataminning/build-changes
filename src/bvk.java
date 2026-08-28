public class bvk extends bui {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final ako<cwf> g = aks.a(bvk.class, akq.h);
   public static final int b = 36;
   private long h;

   public bvk(bup<? extends bvk> $$0, dff $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public static bvk a(dff $$0, cwf $$1) {
      bvk $$2 = new bvk(bup.aj, $$0);
      $$2.h = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().C) {
         this.t();
      } else {
         this.q();
      }
   }

   private void q() {
      if ((long)this.ag == this.h - 36L) {
         this.dY().a(null, this.dy(), awo.mc, awp.g);
      }

      if ((long)this.ag >= this.h) {
         this.v();
         this.au();
      }
   }

   private void t() {
      if (this.dY().aa() % 5L == 0L) {
         this.m();
      }
   }

   private void v() {
      if (this.dY() instanceof arq $$0) {
         cwf $$2 = this.o();
         if (!$$2.f()) {
            bui $$4;
            if ($$2.h() instanceof cxa $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new ckz($$0, this.dD(), this.dF(), this.dJ(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dy(), 1);
            $$0.a($$4, eak.t, this.dw());
            this.a(cwf.k);
         }
      }
   }

   private bui a(arq $$0, cxa $$1, cwf $$2) {
      cxa.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dy(), 0));
      jm $$4 = jm.a;
      cpk $$5 = cpk.a($$1.a($$0, this.dw(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(g, cwf.k);
   }

   @Override
   protected void a(un $$0) {
      cwf $$1 = $$0.b("item", 10) ? cwf.a(this.ea(), (vk)$$0.p("item")).orElse(cwf.k) : cwf.k;
      this.a($$1);
      this.h = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(un $$0) {
      if (!this.o().f()) {
         $$0.a("item", this.o().a(this.ea()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(bui $$0) {
      return false;
   }

   @Override
   protected boolean bT() {
      return false;
   }

   @Override
   protected void p(bui $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ert k_() {
      return ert.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void m() {
      ezr $$0 = this.dw();
      int $$1 = this.af.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         ezr $$4 = new ezr(
            this.dD() + 0.4 * (this.af.k() - this.af.k()), this.dF() + 0.4 * (this.af.k() - this.af.k()), this.dJ() + 0.4 * (this.af.k() - this.af.k())
         );
         ezr $$5 = $$0.a($$4);
         this.dY().a(ls.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cwf o() {
      return this.aw().a(g);
   }

   private void a(cwf $$0) {
      this.aw().a(g, $$0);
   }
}
