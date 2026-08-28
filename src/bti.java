public class bti extends bsg {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final ajp<cuc> g = ajt.a(bti.class, ajr.h);
   public static final int b = 36;
   private long h;

   public bti(bsm<? extends bti> $$0, dcf $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public static bti a(dcf $$0, cuc $$1) {
      bti $$2 = new bti(bsm.aj, $$0);
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
         this.u();
      }
   }

   private void u() {
      if ((long)this.ai == this.h - 36L) {
         this.dQ().a(null, this.dq(), avh.md, avi.g);
      }

      if ((long)this.ai >= this.h) {
         this.w();
         this.ao();
      }
   }

   private void v() {
      if (this.dQ().Z() % 5L == 0L) {
         this.p();
      }
   }

   private void w() {
      dcf $$0 = this.dQ();
      cuc $$1 = this.s();
      if (!$$1.e()) {
         bsg $$6;
         if ($$1.g() instanceof cuu $$2) {
            jf $$3 = jf.a;
            cnc $$4 = $$2.a($$0, this.do(), $$1, $$3);
            $$4.c(this);
            cuu.a $$5 = $$2.c();
            $$2.a($$4, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), $$5.d(), $$5.c());
            $$5.e().ifPresent($$1x -> $$0.c($$1x, this.dq(), 0));
            $$6 = $$4;
         } else {
            $$6 = new ciu($$0, this.dv(), this.dx(), this.dB(), $$1);
         }

         $$0.b($$6);
         $$0.c(3021, this.dq(), 1);
         $$0.a($$6, dxg.t, this.do());
         this.a(cuc.l);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(g, cuc.l);
   }

   @Override
   protected void a(tx $$0) {
      cuc $$1 = $$0.b("item", 10) ? cuc.a(this.dS(), (uu)$$0.p("item")).orElse(cuc.l) : cuc.l;
      this.a($$1);
      $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(tx $$0) {
      if (!this.s().e()) {
         $$0.a("item", this.s().a(this.dS()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(bsg $$0) {
      return false;
   }

   @Override
   protected boolean bK() {
      return false;
   }

   @Override
   protected void p(bsg $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eom k_() {
      return eom.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void p() {
      ewf $$0 = this.do();
      int $$1 = this.ah.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         ewf $$4 = new ewf(
            this.dv() + 0.4 * (this.ah.k() - this.ah.k()), this.dx() + 0.4 * (this.ah.k() - this.ah.k()), this.dB() + 0.4 * (this.ah.k() - this.ah.k())
         );
         ewf $$5 = $$0.a($$4);
         this.dQ().a(lj.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cuc s() {
      return this.aq().a(g);
   }

   private void a(cuc $$0) {
      this.aq().a(g, $$0);
   }
}
