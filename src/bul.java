public class bul extends btj {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final akg<cvl> g = akk.a(bul.class, aki.h);
   public static final int b = 36;
   private long h;

   public bul(btq<? extends bul> $$0, dds $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public static bul a(dds $$0, cvl $$1) {
      bul $$2 = new bul(btq.aj, $$0);
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
         this.dS().a(null, this.ds(), awd.me, awe.g);
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
      if (this.dS() instanceof arg $$0) {
         cvl $$2 = this.o();
         if (!$$2.f()) {
            btj $$4;
            if ($$2.h() instanceof cwh $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new cjz($$0, this.dx(), this.dz(), this.dD(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.ds(), 1);
            $$0.a($$4, dyx.t, this.dq());
            this.a(cvl.k);
         }
      }
   }

   private btj a(arg $$0, cwh $$1, cvl $$2) {
      cwh.a $$3 = $$1.c();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.ds(), 0));
      jj $$4 = jj.a;
      coi $$5 = coi.a($$1.a($$0, this.dq(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(g, cvl.k);
   }

   @Override
   protected void a(uf $$0) {
      cvl $$1 = $$0.b("item", 10) ? cvl.a(this.dU(), (vc)$$0.p("item")).orElse(cvl.k) : cvl.k;
      this.a($$1);
      this.h = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(uf $$0) {
      if (!this.o().f()) {
         $$0.a("item", this.o().a(this.dU()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(btj $$0) {
      return false;
   }

   @Override
   protected boolean bO() {
      return false;
   }

   @Override
   protected void p(btj $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eqg j_() {
      return eqg.d;
   }

   @Override
   public boolean q_() {
      return true;
   }

   public void m() {
      eye $$0 = this.dq();
      int $$1 = this.af.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         eye $$4 = new eye(
            this.dx() + 0.4 * (this.af.k() - this.af.k()), this.dz() + 0.4 * (this.af.k() - this.af.k()), this.dD() + 0.4 * (this.af.k() - this.af.k())
         );
         eye $$5 = $$0.a($$4);
         this.dS().a(ln.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cvl o() {
      return this.at().a(g);
   }

   private void a(cvl $$0) {
      this.at().a(g, $$0);
   }
}
