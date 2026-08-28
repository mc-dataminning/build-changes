public class bty extends bsw {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final akk<cur> g = ako.a(bty.class, akm.h);
   public static final int b = 36;
   private long h;

   public bty(btc<? extends bty> $$0, dca $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public static bty a(dca $$0, cur $$1) {
      bty $$2 = new bty(btc.aj, $$0);
      $$2.h = (long)$$0.z.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         this.v();
      } else {
         this.u();
      }
   }

   private void u() {
      if ((long)this.ai == this.h - 36L) {
         this.dP().a(null, this.dp(), awa.md, awb.g);
      }

      if ((long)this.ai >= this.h) {
         this.w();
         this.an();
      }
   }

   private void v() {
      if (this.dP().Z() % 5L == 0L) {
         this.p();
      }
   }

   private void w() {
      dca $$0 = this.dP();
      cur $$1 = this.s();
      if (!$$1.e()) {
         bsw $$6;
         if ($$1.g() instanceof cvj $$2) {
            je $$3 = je.a;
            cnr $$4 = $$2.a($$0, this.dn(), $$1, $$3);
            cvj.a $$5 = $$2.c();
            $$2.a($$4, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), $$5.d(), $$5.c());
            $$5.e().ifPresent($$1x -> $$0.c($$1x, this.dp(), 0));
            $$6 = $$4;
         } else {
            $$6 = new cjj($$0, this.du(), this.dw(), this.dA(), $$1);
         }

         $$0.b($$6);
         $$0.c(3021, this.dp(), 1);
         $$0.a($$6, dwx.t, this.dn());
         this.a(cur.l);
      }
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(g, cur.l);
   }

   @Override
   protected void a(us $$0) {
      cur $$1 = $$0.b("item", 10) ? cur.a(this.dR(), (vp)$$0.p("item")).orElse(cur.l) : cur.l;
      this.a($$1);
      $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(us $$0) {
      if (!this.s().e()) {
         $$0.a("item", this.s().a(this.dR()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(bsw $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(bsw $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eoc k_() {
      return eoc.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void p() {
      evt $$0 = this.dn();
      int $$1 = this.ah.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         evt $$4 = new evt(
            this.du() + 0.4 * (this.ah.k() - this.ah.k()), this.dw() + 0.4 * (this.ah.k() - this.ah.k()), this.dA() + 0.4 * (this.ah.k() - this.ah.k())
         );
         evt $$5 = $$0.a($$4);
         this.dP().a(li.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cur s() {
      return this.ap().a(g);
   }

   private void a(cur $$0) {
      this.ap().a(g, $$0);
   }
}
