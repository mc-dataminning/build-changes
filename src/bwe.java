public class bwe extends bva {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final ajx<cxh> f = akb.a(bwe.class, ajz.h);
   public static final int a = 36;
   private long g;

   public bwe(bvi<? extends bwe> $$0, dgz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bwe a(dgz $$0, cxh $$1) {
      bwe $$2 = new bwe(bvi.aJ, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dU() instanceof ard $$0) {
         this.a($$0);
      } else {
         this.j();
      }
   }

   private void a(ard $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.du(), awa.mB, awb.g);
      }

      if ((long)this.af >= this.g) {
         this.m();
         this.c($$0);
      }
   }

   private void j() {
      if (this.dU().ae() % 5L == 0L) {
         this.f();
      }
   }

   private void m() {
      if (this.dU() instanceof ard $$0) {
         cxh $$2 = this.g();
         if (!$$2.f()) {
            bva $$4;
            if ($$2.h() instanceof cyb $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new clw($$0, this.dz(), this.dB(), this.dF(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.du(), 1);
            $$0.a($$4, ecp.t, this.ds());
            this.a(cxh.k);
         }
      }
   }

   private bva a(ard $$0, cyb $$1, cxh $$2) {
      cyb.a $$3 = $$1.b();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.du(), 0));
      jn $$4 = jn.a;
      cqk $$5 = cqk.a($$1.a($$0, this.ds(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(f, cxh.k);
   }

   @Override
   protected void a(tq $$0) {
      cxh $$1 = $$0.b("item", 10) ? cxh.a(this.dW(), (un)$$0.p("item")).orElse(cxh.k) : cxh.k;
      this.a($$1);
      this.g = $$0.i("spawn_item_after_ticks");
   }

   @Override
   protected void b(tq $$0) {
      if (!this.g().f()) {
         $$0.a("item", this.g().a(this.dW()).d());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bva $$0) {
      return false;
   }

   @Override
   protected boolean bP() {
      return false;
   }

   @Override
   protected void p(bva $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eub j_() {
      return eub.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   public void f() {
      fbx $$0 = this.ds();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fbx $$4 = new fbx(
            this.dz() + 0.4 * (this.ae.k() - this.ae.k()), this.dB() + 0.4 * (this.ae.k() - this.ae.k()), this.dF() + 0.4 * (this.ae.k() - this.ae.k())
         );
         fbx $$5 = $$0.a($$4);
         this.dU().a(lt.bf, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public cxh g() {
      return this.au().a(f);
   }

   private void a(cxh $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }
}
