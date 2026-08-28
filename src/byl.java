public class byl extends bxe {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final aku<dak> f = aky.a(byl.class, akw.h);
   public static final int a = 36;
   private long g;

   public byl(bxn<? extends byl> $$0, dkj $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static byl a(dkj $$0, dak $$1) {
      byl $$2 = new byl(bxn.aK, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void g() {
      super.g();
      if (this.dV() instanceof asb $$0) {
         this.a($$0);
      } else {
         this.i();
      }
   }

   private void a(asb $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dv(), awy.mF, awz.g);
      }

      if ((long)this.af >= this.g) {
         this.l();
         this.c($$0);
      }
   }

   private void i() {
      if (this.dV().ae() % 5L == 0L) {
         this.e();
      }
   }

   private void l() {
      if (this.dV() instanceof asb $$0) {
         dak $$2 = this.f();
         if (!$$2.f()) {
            bxe $$4;
            if ($$2.h() instanceof dbe $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new coo($$0, this.dA(), this.dC(), this.dG(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dv(), 1);
            $$0.a($$4, egq.t, this.dt());
            this.a(dak.l);
         }
      }
   }

   private bxe a(asb $$0, dbe $$1, dak $$2) {
      dbe.a $$3 = $$1.a();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dv(), 0));
      jc $$4 = jc.a;
      ctd $$5 = ctd.a($$1.a($$0, this.dt(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(f, dak.l);
   }

   @Override
   protected void a(ua $$0) {
      alp<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<dak>a("item", dak.b, $$1).orElse(dak.l));
      this.g = $$0.b("spawn_item_after_ticks", 0L);
   }

   @Override
   protected void b(ua $$0) {
      if (!this.f().f()) {
         alp<va> $$1 = this.dX().a(uo.a);
         $$0.a("item", dak.b, $$1, this.f());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bxe $$0) {
      return false;
   }

   @Override
   protected boolean bP() {
      return false;
   }

   @Override
   protected void p(bxe $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public eyf i_() {
      return eyf.d;
   }

   @Override
   public boolean n_() {
      return true;
   }

   public void e() {
      fgc $$0 = this.dt();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fgc $$4 = new fgc(
            this.dA() + 0.4 * (this.ae.k() - this.ae.k()), this.dC() + 0.4 * (this.ae.k() - this.ae.k()), this.dG() + 0.4 * (this.ae.k() - this.ae.k())
         );
         fgc $$5 = $$0.a($$4);
         this.dV().a(lz.bf, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public dak f() {
      return this.ar().a(f);
   }

   private void a(dak $$0) {
      this.ar().a(f, $$0);
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }
}
