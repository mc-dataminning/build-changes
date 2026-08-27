public class bsx extends brw {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final ajs<ctq> g = ajw.a(bsx.class, aju.h);
   public static final int b = 36;
   private long h;

   public bsx(bsc<? extends bsx> $$0, daz $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public static bsx a(daz $$0, ctq $$1) {
      bsx $$2 = new bsx(bsc.aj, $$0);
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
         this.dP().a(null, this.dp(), avi.md, avj.g);
      }

      if ((long)this.ai >= this.h) {
         this.w();
         this.an();
      }
   }

   private void v() {
      if (this.dP().Y() % 5L == 0L) {
         this.p();
      }
   }

   private void w() {
      daz $$0 = this.dP();
      ctq $$1 = this.s();
      if (!$$1.e()) {
         brw $$6;
         if ($$1.g() instanceof cui $$2) {
            it $$3 = it.a;
            cmq $$4 = $$2.a($$0, this.dn(), $$1, $$3);
            cui.a $$5 = $$2.c();
            $$2.a($$4, (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), $$5.d(), $$5.c());
            $$5.e().ifPresent($$1x -> $$0.c($$1x, this.dp(), 0));
            $$6 = $$4;
         } else {
            $$6 = new cii($$0, this.du(), this.dw(), this.dA(), $$1);
         }

         $$0.b($$6);
         $$0.c(3021, this.dp(), 1);
         $$0.a($$6, dvw.t, this.dn());
         this.a(ctq.i);
      }
   }

   @Override
   protected void a(ajw.a $$0) {
      $$0.a(g, ctq.i);
   }

   @Override
   protected void a(ud $$0) {
      ctq $$1 = $$0.b("item", 10) ? ctq.a(this.dR(), (va)$$0.p("item")).orElse(ctq.i) : ctq.i;
      this.a($$1);
      $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(ud $$0) {
      if (!this.s().e()) {
         $$0.a("item", this.s().a(this.dR()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(brw $$0) {
      return false;
   }

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   protected void p(brw $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public enb k_() {
      return enb.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void p() {
      eum $$0 = this.dn();
      int $$1 = this.ah.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         eum $$4 = new eum(
            this.du() + 0.4 * (this.ah.k() - this.ah.k()), this.dw() + 0.4 * (this.ah.k() - this.ah.k()), this.dA() + 0.4 * (this.ah.k() - this.ah.k())
         );
         eum $$5 = $$0.a($$4);
         this.dP().a(ky.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public ctq s() {
      return this.ap().a(g);
   }

   private void a(ctq $$0) {
      this.ap().a(g, $$0);
   }
}
