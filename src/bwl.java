public class bwl extends bvj {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final alc<cxo> f = alg.a(bwl.class, ale.h);
   public static final int a = 36;
   private long g;

   public bwl(bvq<? extends bwl> $$0, dhh $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bwl a(dhh $$0, cxo $$1) {
      bwl $$2 = new bwl(bvq.aK, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dW() instanceof ash $$0) {
         this.a($$0);
      } else {
         this.p();
      }
   }

   private void a(ash $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dw(), axf.mv, axg.g);
      }

      if ((long)this.af >= this.g) {
         this.s();
         this.c($$0);
      }
   }

   private void p() {
      if (this.dW().ac() % 5L == 0L) {
         this.l();
      }
   }

   private void s() {
      if (this.dW() instanceof ash $$0) {
         cxo $$2 = this.m();
         if (!$$2.f()) {
            bvj $$4;
            if ($$2.h() instanceof cyj $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new cma($$0, this.dB(), this.dD(), this.dH(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dw(), 1);
            $$0.a($$4, ecq.t, this.du());
            this.a(cxo.j);
         }
      }
   }

   private bvj a(ash $$0, cyj $$1, cxo $$2) {
      cyj.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dw(), 0));
      jm $$4 = jm.a;
      cqp $$5 = cqp.a($$1.a($$0, this.du(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(f, cxo.j);
   }

   @Override
   protected void a(ux $$0) {
      cxo $$1 = $$0.b("item", 10) ? cxo.a(this.dY(), (vu)$$0.p("item")).orElse(cxo.j) : cxo.j;
      this.a($$1);
      this.g = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(ux $$0) {
      if (!this.m().f()) {
         $$0.a("item", this.m().a(this.dY()).d());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bvj $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvj $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eub n_() {
      return eub.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   public void l() {
      fbx $$0 = this.du();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fbx $$4 = new fbx(
            this.dB() + 0.4 * (this.ae.k() - this.ae.k()), this.dD() + 0.4 * (this.ae.k() - this.ae.k()), this.dH() + 0.4 * (this.ae.k() - this.ae.k())
         );
         fbx $$5 = $$0.a($$4);
         this.dW().a(ls.bd, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cxo m() {
      return this.au().a(f);
   }

   private void a(cxo $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(ash $$0, btz $$1, float $$2) {
      return false;
   }
}
