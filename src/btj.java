public class btj extends bsh {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final ajp<cud> g = ajt.a(btj.class, ajr.h);
   public static final int b = 36;
   private long h;

   public btj(bsn<? extends btj> $$0, dcg $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public static btj a(dcg $$0, cud $$1) {
      btj $$2 = new btj(bsn.aj, $$0);
      $$2.h = (long)$$0.z.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.dR().B) {
         this.v();
      } else {
         this.t();
      }
   }

   private void t() {
      if ((long)this.ai == this.h - 36L) {
         this.dR().a(null, this.dr(), avh.md, avi.g);
      }

      if ((long)this.ai >= this.h) {
         this.w();
         this.ap();
      }
   }

   private void v() {
      if (this.dR().Z() % 5L == 0L) {
         this.p();
      }
   }

   private void w() {
      dcg $$0 = this.dR();
      cud $$1 = this.s();
      if (!$$1.e()) {
         bsh $$6;
         if ($$1.g() instanceof cuv $$2) {
            jf $$3 = jf.a;
            cnd $$4 = $$2.a($$0, this.dp(), $$1, $$3);
            $$4.c(this);
            cuv.a $$5 = $$2.c();
            $$2.a($$4, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), $$5.d(), $$5.c());
            $$5.e().ifPresent($$1x -> $$0.c($$1x, this.dr(), 0));
            $$6 = $$4;
         } else {
            $$6 = new civ($$0, this.dw(), this.dy(), this.dC(), $$1);
         }

         $$0.b($$6);
         $$0.c(3021, this.dr(), 1);
         $$0.a($$6, dxh.t, this.dp());
         this.a(cud.l);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(g, cud.l);
   }

   @Override
   protected void a(tx $$0) {
      cud $$1 = $$0.b("item", 10) ? cud.a(this.dT(), (uu)$$0.p("item")).orElse(cud.l) : cud.l;
      this.a($$1);
      $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(tx $$0) {
      if (!this.s().e()) {
         $$0.a("item", this.s().a(this.dT()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(bsh $$0) {
      return false;
   }

   @Override
   protected boolean bL() {
      return false;
   }

   @Override
   protected void p(bsh $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eoo j_() {
      return eoo.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void p() {
      ewh $$0 = this.dp();
      int $$1 = this.ah.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         ewh $$4 = new ewh(
            this.dw() + 0.4 * (this.ah.k() - this.ah.k()), this.dy() + 0.4 * (this.ah.k() - this.ah.k()), this.dC() + 0.4 * (this.ah.k() - this.ah.k())
         );
         ewh $$5 = $$0.a($$4);
         this.dR().a(lj.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cud s() {
      return this.ar().a(g);
   }

   private void a(cud $$0) {
      this.ar().a(g, $$0);
   }
}
