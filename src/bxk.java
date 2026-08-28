public class bxk extends bwf {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final akj<czd> f = akn.a(bxk.class, akl.h);
   public static final int a = 36;
   private long g;

   public bxk(bwo<? extends bxk> $$0, dja $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bxk a(dja $$0, czd $$1) {
      bxk $$2 = new bxk(bwo.aJ, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof arq $$0) {
         this.a($$0);
      } else {
         this.j();
      }
   }

   private void a(arq $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dv(), awn.mF, awo.g);
      }

      if ((long)this.af >= this.g) {
         this.m();
         this.c($$0);
      }
   }

   private void j() {
      if (this.dV().ae() % 5L == 0L) {
         this.f();
      }
   }

   private void m() {
      if (this.dV() instanceof arq $$0) {
         czd $$2 = this.g();
         if (!$$2.f()) {
            bwf $$4;
            if ($$2.h() instanceof czx $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new cnh($$0, this.dA(), this.dC(), this.dG(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dv(), 1);
            $$0.a($$4, efh.t, this.dt());
            this.a(czd.k);
         }
      }
   }

   private bwf a(arq $$0, czx $$1, czd $$2) {
      czx.a $$3 = $$1.a();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dv(), 0));
      ja $$4 = ja.a;
      crx $$5 = crx.a($$1.a($$0, this.dt(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(f, czd.k);
   }

   @Override
   protected void a(tz $$0) {
      czd $$1 = $$0.b("item", 10) ? czd.a(this.dX(), (uw)$$0.p("item")).orElse(czd.k) : czd.k;
      this.a($$1);
      this.g = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(tz $$0) {
      if (!this.g().f()) {
         $$0.a("item", this.g().a(this.dX()).d());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bwf $$0) {
      return false;
   }

   @Override
   protected boolean bQ() {
      return false;
   }

   @Override
   protected void p(bwf $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ewt j_() {
      return ewt.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   public void f() {
      feq $$0 = this.dt();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         feq $$4 = new feq(
            this.dA() + 0.4 * (this.ae.k() - this.ae.k()), this.dC() + 0.4 * (this.ae.k() - this.ae.k()), this.dG() + 0.4 * (this.ae.k() - this.ae.k())
         );
         feq $$5 = $$0.a($$4);
         this.dV().a(lx.bf, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public czd g() {
      return this.au().a(f);
   }

   private void a(czd $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(arq $$0, buu $$1, float $$2) {
      return false;
   }
}
