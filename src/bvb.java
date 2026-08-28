public class bvb extends btz {
   private static final int c = 60;
   private static final int d = 120;
   private static final String e = "spawn_item_after_ticks";
   private static final String f = "item";
   private static final akk<cvx> g = ako.a(bvb.class, akm.h);
   public static final int b = 36;
   private long h;

   public bvb(bug<? extends bvb> $$0, dev $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public static bvb a(dev $$0, cvx $$1) {
      bvb $$2 = new bvb(bug.aj, $$0);
      $$2.h = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         this.t();
      } else {
         this.q();
      }
   }

   private void q() {
      if ((long)this.ag == this.h - 36L) {
         this.dX().a(null, this.dx(), awk.mc, awl.g);
      }

      if ((long)this.ag >= this.h) {
         this.v();
         this.at();
      }
   }

   private void t() {
      if (this.dX().aa() % 5L == 0L) {
         this.m();
      }
   }

   private void v() {
      if (this.dX() instanceof arm $$0) {
         cvx $$2 = this.o();
         if (!$$2.f()) {
            btz $$4;
            if ($$2.h() instanceof cws $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new ckq($$0, this.dC(), this.dE(), this.dI(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dx(), 1);
            $$0.a($$4, eaa.t, this.dv());
            this.a(cvx.k);
         }
      }
   }

   private btz a(arm $$0, cws $$1, cvx $$2) {
      cws.a $$3 = $$1.c();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dx(), 0));
      jl $$4 = jl.a;
      cpb $$5 = cpb.a($$1.a($$0, this.dv(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(g, cvx.k);
   }

   @Override
   protected void a(uj $$0) {
      cvx $$1 = $$0.b("item", 10) ? cvx.a(this.dZ(), (vg)$$0.p("item")).orElse(cvx.k) : cvx.k;
      this.a($$1);
      this.h = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(uj $$0) {
      if (!this.o().f()) {
         $$0.a("item", this.o().a(this.dZ()).d());
      }

      $$0.a("spawn_item_after_ticks", this.h);
   }

   @Override
   protected boolean r(btz $$0) {
      return false;
   }

   @Override
   protected boolean bS() {
      return false;
   }

   @Override
   protected void p(btz $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public erj k_() {
      return erj.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   public void m() {
      ezh $$0 = this.dv();
      int $$1 = this.af.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         ezh $$4 = new ezh(
            this.dC() + 0.4 * (this.af.k() - this.af.k()), this.dE() + 0.4 * (this.af.k() - this.af.k()), this.dI() + 0.4 * (this.af.k() - this.af.k())
         );
         ezh $$5 = $$0.a($$4);
         this.dX().a(lq.bc, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cvx o() {
      return this.av().a(g);
   }

   private void a(cvx $$0) {
      this.av().a(g, $$0);
   }
}
