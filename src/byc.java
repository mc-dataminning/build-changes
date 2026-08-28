public class byc extends bwv {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final akn<daa> f = akr.a(byc.class, akp.h);
   public static final int a = 36;
   private long g;

   public byc(bxe<? extends byc> $$0, djz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static byc a(djz $$0, daa $$1) {
      byc $$2 = new byc(bxe.aK, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof aru $$0) {
         this.a($$0);
      } else {
         this.j();
      }
   }

   private void a(aru $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dv(), awr.mF, aws.g);
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
      if (this.dV() instanceof aru $$0) {
         daa $$2 = this.g();
         if (!$$2.f()) {
            bwv $$4;
            if ($$2.h() instanceof dau $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new coe($$0, this.dA(), this.dC(), this.dG(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dv(), 1);
            $$0.a($$4, egg.t, this.dt());
            this.a(daa.k);
         }
      }
   }

   private bwv a(aru $$0, dau $$1, daa $$2) {
      dau.a $$3 = $$1.a();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dv(), 0));
      jc $$4 = jc.a;
      csu $$5 = csu.a($$1.a($$0, this.dt(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(f, daa.k);
   }

   @Override
   protected void a(ua $$0) {
      ali<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<daa>a("item", daa.b, $$1).orElse(daa.k));
      this.g = $$0.b("spawn_item_after_ticks", 0L);
   }

   @Override
   protected void b(ua $$0) {
      if (!this.g().f()) {
         ali<va> $$1 = this.dX().a(uo.a);
         $$0.a("item", daa.b, $$1, this.g());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bwv $$0) {
      return false;
   }

   @Override
   protected boolean bP() {
      return false;
   }

   @Override
   protected void p(bwv $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public exv j_() {
      return exv.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   public void f() {
      ffs $$0 = this.dt();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         ffs $$4 = new ffs(
            this.dA() + 0.4 * (this.ae.k() - this.ae.k()), this.dC() + 0.4 * (this.ae.k() - this.ae.k()), this.dG() + 0.4 * (this.ae.k() - this.ae.k())
         );
         ffs $$5 = $$0.a($$4);
         this.dV().a(lz.bf, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public daa g() {
      return this.ar().a(f);
   }

   private void a(daa $$0) {
      this.ar().a(f, $$0);
   }

   @Override
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      return false;
   }
}
