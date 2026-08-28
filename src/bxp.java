public class bxp extends bwi {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final akj<czk> f = akn.a(bxp.class, akl.h);
   public static final int a = 36;
   private long g;

   public bxp(bwr<? extends bxp> $$0, djh $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bxp a(djh $$0, czk $$1) {
      bxp $$2 = new bxp(bwr.aJ, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dU() instanceof arq $$0) {
         this.a($$0);
      } else {
         this.j();
      }
   }

   private void a(arq $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.du(), awn.mF, awo.g);
      }

      if ((long)this.af >= this.g) {
         this.m();
         this.c($$0);
      }
   }

   private void j() {
      if (this.dU().ae() % 5L == 0L) {
         this.f();
      }
   }

   private void m() {
      if (this.dU() instanceof arq $$0) {
         czk $$2 = this.g();
         if (!$$2.f()) {
            bwi $$4;
            if ($$2.h() instanceof dae $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new cno($$0, this.dz(), this.dB(), this.dF(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.du(), 1);
            $$0.a($$4, efo.t, this.ds());
            this.a(czk.k);
         }
      }
   }

   private bwi a(arq $$0, dae $$1, czk $$2) {
      dae.a $$3 = $$1.a();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.du(), 0));
      jb $$4 = jb.a;
      cse $$5 = cse.a($$1.a($$0, this.ds(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(f, czk.k);
   }

   @Override
   protected void a(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.<czk>a("item", czk.b, $$1).orElse(czk.k));
      this.g = $$0.g("spawn_item_after_ticks");
   }

   @Override
   protected void b(tz $$0) {
      if (!this.g().f()) {
         ale<uw> $$1 = this.dW().a(un.a);
         $$0.a("item", czk.b, $$1, this.g());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bwi $$0) {
      return false;
   }

   @Override
   protected boolean bO() {
      return false;
   }

   @Override
   protected void p(bwi $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public exa j_() {
      return exa.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   public void f() {
      fex $$0 = this.ds();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fex $$4 = new fex(
            this.dz() + 0.4 * (this.ae.k() - this.ae.k()), this.dB() + 0.4 * (this.ae.k() - this.ae.k()), this.dF() + 0.4 * (this.ae.k() - this.ae.k())
         );
         fex $$5 = $$0.a($$4);
         this.dU().a(ly.bf, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public czk g() {
      return this.ar().a(f);
   }

   private void a(czk $$0) {
      this.ar().a(f, $$0);
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }
}
