public class bwx extends bvs {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final akg<cxy> f = akk.a(bwx.class, aki.h);
   public static final int a = 36;
   private long g;

   public bwx(bwb<? extends bwx> $$0, dhp $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bwx a(dhp $$0, cxy $$1) {
      bwx $$2 = new bwx(bwb.aJ, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof arn $$0) {
         this.a($$0);
      } else {
         this.j();
      }
   }

   private void a(arn $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dv(), awk.mB, awl.g);
      }

      if ((long)this.af >= this.g) {
         this.m();
         this.c($$0);
      }
   }

   private void j() {
      if (this.dV().ae() % 5L == 0L) {
         this.f();
      }
   }

   private void m() {
      if (this.dV() instanceof arn $$0) {
         cxy $$2 = this.g();
         if (!$$2.f()) {
            bvs $$4;
            if ($$2.h() instanceof cys $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new cmn($$0, this.dA(), this.dC(), this.dG(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dv(), 1);
            $$0.a($$4, edm.t, this.dt());
            this.a(cxy.k);
         }
      }
   }

   private bvs a(arn $$0, cys $$1, cxy $$2) {
      cys.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dv(), 0));
      jo $$4 = jo.a;
      crb $$5 = crb.a($$1.a($$0, this.dt(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(f, cxy.k);
   }

   @Override
   protected void a(tw $$0) {
      cxy $$1 = $$0.b("item", 10) ? cxy.a(this.dX(), (ut)$$0.p("item")).orElse(cxy.k) : cxy.k;
      this.a($$1);
      this.g = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(tw $$0) {
      if (!this.g().f()) {
         $$0.a("item", this.g().a(this.dX()).d());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bvs $$0) {
      return false;
   }

   @Override
   protected boolean bQ() {
      return false;
   }

   @Override
   protected void p(bvs $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public euy j_() {
      return euy.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   public void f() {
      fcu $$0 = this.dt();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fcu $$4 = new fcu(
            this.dA() + 0.4 * (this.ae.k() - this.ae.k()), this.dC() + 0.4 * (this.ae.k() - this.ae.k()), this.dG() + 0.4 * (this.ae.k() - this.ae.k())
         );
         fcu $$5 = $$0.a($$4);
         this.dV().a(lv.bf, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cxy g() {
      return this.au().a(f);
   }

   private void a(cxy $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(arn $$0, buh $$1, float $$2) {
      return false;
   }
}
