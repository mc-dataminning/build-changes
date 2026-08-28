public class btv extends bst {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final akj<cuo> g = akn.a(btv.class, akl.h);
   public static final int b = 36;
   private long h;

   public btv(bsz<? extends btv> $$0, dbx $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public static btv a(dbx $$0, cuo $$1) {
      btv $$2 = new btv(bsz.aj, $$0);
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
         this.dP().a(null, this.dp(), avz.md, awa.g);
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
      dbx $$0 = this.dP();
      cuo $$1 = this.s();
      if (!$$1.e()) {
         bst $$6;
         if ($$1.g() instanceof cvg $$2) {
            je $$3 = je.a;
            cno $$4 = $$2.a($$0, this.dn(), $$1, $$3);
            cvg.a $$5 = $$2.c();
            $$2.a($$4, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), $$5.d(), $$5.c());
            $$5.e().ifPresent($$1x -> $$0.c($$1x, this.dp(), 0));
            $$6 = $$4;
         } else {
            $$6 = new cjg($$0, this.du(), this.dw(), this.dA(), $$1);
         }

         $$0.b($$6);
         $$0.c(3021, this.dp(), 1);
         $$0.a($$6, dwu.t, this.dn());
         this.a(cuo.l);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(g, cuo.l);
   }

   @Override
   protected void a(ur $$0) {
      cuo $$1 = $$0.b("item", 10) ? cuo.a(this.dR(), (vo)$$0.p("item")).orElse(cuo.l) : cuo.l;
      this.a($$1);
      $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(ur $$0) {
      if (!this.s().e()) {
         $$0.a("item", this.s().a(this.dR()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(bst $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(bst $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public enz k_() {
      return enz.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void p() {
      evq $$0 = this.dn();
      int $$1 = this.ah.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         evq $$4 = new evq(
            this.du() + 0.4 * (this.ah.k() - this.ah.k()), this.dw() + 0.4 * (this.ah.k() - this.ah.k()), this.dA() + 0.4 * (this.ah.k() - this.ah.k())
         );
         evq $$5 = $$0.a($$4);
         this.dP().a(li.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cuo s() {
      return this.ap().a(g);
   }

   private void a(cuo $$0) {
      this.ap().a(g, $$0);
   }
}
