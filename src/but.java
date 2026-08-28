public class but extends btr {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final akh<cvs> g = akl.a(but.class, akj.h);
   public static final int b = 36;
   private long h;

   public but(bty<? extends but> $$0, dej $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public static but a(dej $$0, cvs $$1) {
      but $$2 = new but(bty.aj, $$0);
      $$2.h = (long)$$0.z.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         this.t();
      } else {
         this.q();
      }
   }

   private void q() {
      if ((long)this.ag == this.h - 36L) {
         this.dS().a(null, this.ds(), awg.me, awh.g);
      }

      if ((long)this.ag >= this.h) {
         this.v();
         this.ar();
      }
   }

   private void t() {
      if (this.dS().aa() % 5L == 0L) {
         this.m();
      }
   }

   private void v() {
      if (this.dS() instanceof arj $$0) {
         cvs $$2 = this.o();
         if (!$$2.f()) {
            btr $$4;
            if ($$2.h() instanceof cwn $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new ckh($$0, this.dx(), this.dz(), this.dD(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.ds(), 1);
            $$0.a($$4, dzp.t, this.dq());
            this.a(cvs.k);
         }
      }
   }

   private btr a(arj $$0, cwn $$1, cvs $$2) {
      cwn.a $$3 = $$1.c();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.ds(), 0));
      jk $$4 = jk.a;
      cor $$5 = cor.a($$1.a($$0, this.dq(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(g, cvs.k);
   }

   @Override
   protected void a(ug $$0) {
      cvs $$1 = $$0.b("item", 10) ? cvs.a(this.dU(), (vd)$$0.p("item")).orElse(cvs.k) : cvs.k;
      this.a($$1);
      this.h = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(ug $$0) {
      if (!this.o().f()) {
         $$0.a("item", this.o().a(this.dU()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(btr $$0) {
      return false;
   }

   @Override
   protected boolean bO() {
      return false;
   }

   @Override
   protected void p(btr $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eqy k_() {
      return eqy.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void m() {
      eyw $$0 = this.dq();
      int $$1 = this.af.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         eyw $$4 = new eyw(
            this.dx() + 0.4 * (this.af.k() - this.af.k()), this.dz() + 0.4 * (this.af.k() - this.af.k()), this.dD() + 0.4 * (this.af.k() - this.af.k())
         );
         eyw $$5 = $$0.a($$4);
         this.dS().a(lo.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cvs o() {
      return this.at().a(g);
   }

   private void a(cvs $$0) {
      this.at().a(g, $$0);
   }
}
