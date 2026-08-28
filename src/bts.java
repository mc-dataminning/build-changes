public class bts extends bsq {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final ajv<cuo> g = ajz.a(bts.class, ajx.h);
   public static final int b = 36;
   private long h;

   public bts(bsw<? extends bts> $$0, dcu $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public static bts a(dcu $$0, cuo $$1) {
      bts $$2 = new bts(bsw.aj, $$0);
      $$2.h = (long)$$0.z.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B) {
         this.v();
      } else {
         this.t();
      }
   }

   private void t() {
      if ((long)this.ai == this.h - 36L) {
         this.dQ().a(null, this.dq(), avo.md, avp.g);
      }

      if ((long)this.ai >= this.h) {
         this.w();
         this.ap();
      }
   }

   private void v() {
      if (this.dQ().Z() % 5L == 0L) {
         this.p();
      }
   }

   private void w() {
      dcu $$0 = this.dQ();
      cuo $$1 = this.s();
      if (!$$1.e()) {
         bsq $$6;
         if ($$1.g() instanceof cvk $$2) {
            ji $$3 = ji.a;
            cnn $$4 = $$2.a($$0, this.do(), $$1, $$3);
            $$4.c(this);
            cvk.a $$5 = $$2.c();
            $$2.a($$4, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), $$5.d(), $$5.c());
            $$5.e().ifPresent($$1x -> $$0.c($$1x, this.dq(), 0));
            $$6 = $$4;
         } else {
            $$6 = new cjf($$0, this.dv(), this.dx(), this.dB(), $$1);
         }

         $$0.b($$6);
         $$0.c(3021, this.dq(), 1);
         $$0.a($$6, dxw.t, this.do());
         this.a(cuo.l);
      }
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(g, cuo.l);
   }

   @Override
   protected void a(ua $$0) {
      cuo $$1 = $$0.b("item", 10) ? cuo.a(this.dS(), (ux)$$0.p("item")).orElse(cuo.l) : cuo.l;
      this.a($$1);
      this.h = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(ua $$0) {
      if (!this.s().e()) {
         $$0.a("item", this.s().a(this.dS()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(bsq $$0) {
      return false;
   }

   @Override
   protected boolean bK() {
      return false;
   }

   @Override
   protected void p(bsq $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public epd j_() {
      return epd.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void p() {
      eww $$0 = this.do();
      int $$1 = this.ah.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         eww $$4 = new eww(
            this.dv() + 0.4 * (this.ah.k() - this.ah.k()), this.dx() + 0.4 * (this.ah.k() - this.ah.k()), this.dB() + 0.4 * (this.ah.k() - this.ah.k())
         );
         eww $$5 = $$0.a($$4);
         this.dQ().a(lm.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cuo s() {
      return this.ar().a(g);
   }

   private void a(cuo $$0) {
      this.ar().a(g, $$0);
   }
}
