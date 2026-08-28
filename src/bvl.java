public class bvl extends buj {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final ajx<cwn> f = akb.a(bvl.class, ajz.h);
   public static final int a = 36;
   private long g;

   public bvl(buq<? extends bvl> $$0, dgg $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bvl a(dgg $$0, cwn $$1) {
      bvl $$2 = new bvl(buq.aJ, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dW() instanceof arc $$0) {
         this.a($$0);
      } else {
         this.p();
      }
   }

   private void a(arc $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dw(), avz.mB, awa.g);
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
      if (this.dW() instanceof arc $$0) {
         cwn $$2 = this.m();
         if (!$$2.f()) {
            buj $$4;
            if ($$2.h() instanceof cxi $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new cla($$0, this.dB(), this.dD(), this.dH(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dw(), 1);
            $$0.a($$4, ebr.t, this.du());
            this.a(cwn.j);
         }
      }
   }

   private buj a(arc $$0, cxi $$1, cwn $$2) {
      cxi.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dw(), 0));
      jn $$4 = jn.a;
      cpo $$5 = cpo.a($$1.a($$0, this.du(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(f, cwn.j);
   }

   @Override
   protected void a(tq $$0) {
      cwn $$1 = $$0.b("item", 10) ? cwn.a(this.dY(), (un)$$0.p("item")).orElse(cwn.j) : cwn.j;
      this.a($$1);
      this.g = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(tq $$0) {
      if (!this.m().f()) {
         $$0.a("item", this.m().a(this.dY()).d());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(buj $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(buj $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public etc n_() {
      return etc.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   public void l() {
      fay $$0 = this.du();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fay $$4 = new fay(
            this.dB() + 0.4 * (this.ae.k() - this.ae.k()), this.dD() + 0.4 * (this.ae.k() - this.ae.k()), this.dH() + 0.4 * (this.ae.k() - this.ae.k())
         );
         fay $$5 = $$0.a($$4);
         this.dW().a(lt.be, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cwn m() {
      return this.au().a(f);
   }

   private void a(cwn $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(arc $$0, bsz $$1, float $$2) {
      return false;
   }
}
