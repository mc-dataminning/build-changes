public class bvn extends bul {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final akm<cwm> f = akq.a(bvn.class, ako.h);
   public static final int a = 36;
   private long g;

   public bvn(bus<? extends bvn> $$0, dfm $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bvn a(dfm $$0, cwm $$1) {
      bvn $$2 = new bvn(bus.aI, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof arp $$0) {
         this.a($$0);
      } else {
         this.n();
      }
   }

   private void a(arp $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dv(), awn.mc, awo.g);
      }

      if ((long)this.af >= this.g) {
         this.q();
         this.c($$0);
      }
   }

   private void n() {
      if (this.dV().ab() % 5L == 0L) {
         this.j();
      }
   }

   private void q() {
      if (this.dV() instanceof arp $$0) {
         cwm $$2 = this.l();
         if (!$$2.f()) {
            bul $$4;
            if ($$2.h() instanceof cxh $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new clc($$0, this.dA(), this.dC(), this.dG(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dv(), 1);
            $$0.a($$4, ear.t, this.dt());
            this.a(cwm.k);
         }
      }
   }

   private bul a(arp $$0, cxh $$1, cwm $$2) {
      cxh.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dv(), 0));
      jm $$4 = jm.a;
      cpn $$5 = cpn.a($$1.a($$0, this.dt(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(f, cwm.k);
   }

   @Override
   protected void a(ul $$0) {
      cwm $$1 = $$0.b("item", 10) ? cwm.a(this.dX(), (vi)$$0.p("item")).orElse(cwm.k) : cwm.k;
      this.a($$1);
      this.g = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(ul $$0) {
      if (!this.l().f()) {
         $$0.a("item", this.l().a(this.dX()).d());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bul $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bul $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public esa m_() {
      return esa.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void j() {
      ezy $$0 = this.dt();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         ezy $$4 = new ezy(
            this.dA() + 0.4 * (this.ae.k() - this.ae.k()), this.dC() + 0.4 * (this.ae.k() - this.ae.k()), this.dG() + 0.4 * (this.ae.k() - this.ae.k())
         );
         ezy $$5 = $$0.a($$4);
         this.dV().a(ls.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cwm l() {
      return this.au().a(f);
   }

   private void a(cwm $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      return false;
   }
}
