public class btr extends bsp {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final akg<cuk> g = akk.a(btr.class, aki.h);
   public static final int b = 36;
   private long h;

   public btr(bsv<? extends btr> $$0, dbt $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public static btr a(dbt $$0, cuk $$1) {
      btr $$2 = new btr(bsv.aj, $$0);
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
         this.dP().a(null, this.dp(), avw.md, avx.g);
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
      dbt $$0 = this.dP();
      cuk $$1 = this.s();
      if (!$$1.e()) {
         bsp $$6;
         if ($$1.g() instanceof cvc $$2) {
            je $$3 = je.a;
            cnk $$4 = $$2.a($$0, this.dn(), $$1, $$3);
            cvc.a $$5 = $$2.c();
            $$2.a($$4, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), $$5.d(), $$5.c());
            $$5.e().ifPresent($$1x -> $$0.c($$1x, this.dp(), 0));
            $$6 = $$4;
         } else {
            $$6 = new cjc($$0, this.du(), this.dw(), this.dA(), $$1);
         }

         $$0.b($$6);
         $$0.c(3021, this.dp(), 1);
         $$0.a($$6, dwq.t, this.dn());
         this.a(cuk.l);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(g, cuk.l);
   }

   @Override
   protected void a(ur $$0) {
      cuk $$1 = $$0.b("item", 10) ? cuk.a(this.dR(), (vo)$$0.p("item")).orElse(cuk.l) : cuk.l;
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
   protected boolean r(bsp $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(bsp $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public env k_() {
      return env.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void p() {
      evm $$0 = this.dn();
      int $$1 = this.ah.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         evm $$4 = new evm(
            this.du() + 0.4 * (this.ah.k() - this.ah.k()), this.dw() + 0.4 * (this.ah.k() - this.ah.k()), this.dA() + 0.4 * (this.ah.k() - this.ah.k())
         );
         evm $$5 = $$0.a($$4);
         this.dP().a(lj.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cuk s() {
      return this.ap().a(g);
   }

   private void a(cuk $$0) {
      this.ap().a(g, $$0);
   }
}
