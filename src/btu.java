public class btu extends bsr {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final ajw<cuq> g = aka.a(btu.class, ajy.h);
   public static final int b = 36;
   private long h;

   public btu(bsx<? extends btu> $$0, dcw $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public static btu a(dcw $$0, cuq $$1) {
      btu $$2 = new btu(bsx.aj, $$0);
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
         this.t();
      }
   }

   private void t() {
      if ((long)this.ai == this.h - 36L) {
         this.dP().a(null, this.dp(), avp.md, avq.g);
      }

      if ((long)this.ai >= this.h) {
         this.w();
         this.ap();
      }
   }

   private void v() {
      if (this.dP().Z() % 5L == 0L) {
         this.p();
      }
   }

   private void w() {
      dcw $$0 = this.dP();
      cuq $$1 = this.s();
      if (!$$1.e()) {
         bsr $$6;
         if ($$1.g() instanceof cvm $$2) {
            ji $$3 = ji.a;
            cnp $$4 = $$2.a($$0, this.dn(), $$1, $$3);
            $$4.c(this);
            cvm.a $$5 = $$2.c();
            $$2.a($$4, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), $$5.d(), $$5.c());
            $$5.e().ifPresent($$1x -> $$0.c($$1x, this.dp(), 0));
            $$6 = $$4;
         } else {
            $$6 = new cjh($$0, this.du(), this.dw(), this.dA(), $$1);
         }

         $$0.b($$6);
         $$0.c(3021, this.dp(), 1);
         $$0.a($$6, dxz.t, this.dn());
         this.a(cuq.l);
      }
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(g, cuq.l);
   }

   @Override
   protected void a(ub $$0) {
      cuq $$1 = $$0.b("item", 10) ? cuq.a(this.dR(), (uy)$$0.p("item")).orElse(cuq.l) : cuq.l;
      this.a($$1);
      this.h = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(ub $$0) {
      if (!this.s().e()) {
         $$0.a("item", this.s().a(this.dR()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(bsr $$0) {
      return false;
   }

   @Override
   protected boolean bK() {
      return false;
   }

   @Override
   protected void p(bsr $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eph j_() {
      return eph.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void p() {
      exa $$0 = this.dn();
      int $$1 = this.ah.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         exa $$4 = new exa(
            this.du() + 0.4 * (this.ah.k() - this.ah.k()), this.dw() + 0.4 * (this.ah.k() - this.ah.k()), this.dA() + 0.4 * (this.ah.k() - this.ah.k())
         );
         exa $$5 = $$0.a($$4);
         this.dP().a(lm.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cuq s() {
      return this.ar().a(g);
   }

   private void a(cuq $$0) {
      this.ar().a(g, $$0);
   }
}
