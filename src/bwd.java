public class bwd extends bvb {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final aks<cxg> f = akw.a(bwd.class, aku.h);
   public static final int a = 36;
   private long g;

   public bwd(bvi<? extends bwd> $$0, dgz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bwd a(dgz $$0, cxg $$1) {
      bwd $$2 = new bwd(bvi.aK, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dW() instanceof arx $$0) {
         this.a($$0);
      } else {
         this.p();
      }
   }

   private void a(arx $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dw(), awv.mB, aww.g);
      }

      if ((long)this.af >= this.g) {
         this.s();
         this.c($$0);
      }
   }

   private void p() {
      if (this.dW().ad() % 5L == 0L) {
         this.l();
      }
   }

   private void s() {
      if (this.dW() instanceof arx $$0) {
         cxg $$2 = this.m();
         if (!$$2.f()) {
            bvb $$4;
            if ($$2.h() instanceof cyb $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new cls($$0, this.dB(), this.dD(), this.dH(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dw(), 1);
            $$0.a($$4, eck.t, this.du());
            this.a(cxg.j);
         }
      }
   }

   private bvb a(arx $$0, cyb $$1, cxg $$2) {
      cyb.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dw(), 0));
      jm $$4 = jm.a;
      cqh $$5 = cqh.a($$1.a($$0, this.du(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akw.a $$0) {
      $$0.a(f, cxg.j);
   }

   @Override
   protected void a(um $$0) {
      cxg $$1 = $$0.b("item", 10) ? cxg.a(this.dY(), (vj)$$0.p("item")).orElse(cxg.j) : cxg.j;
      this.a($$1);
      this.g = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(um $$0) {
      if (!this.m().f()) {
         $$0.a("item", this.m().a(this.dY()).d());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bvb $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvb $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public etv n_() {
      return etv.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   public void l() {
      fbr $$0 = this.du();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fbr $$4 = new fbr(
            this.dB() + 0.4 * (this.ae.k() - this.ae.k()), this.dD() + 0.4 * (this.ae.k() - this.ae.k()), this.dH() + 0.4 * (this.ae.k() - this.ae.k())
         );
         fbr $$5 = $$0.a($$4);
         this.dW().a(ls.be, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cxg m() {
      return this.au().a(f);
   }

   private void a(cxg $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(arx $$0, btr $$1, float $$2) {
      return false;
   }
}
