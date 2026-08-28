public class bya extends bwt {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final akl<czy> f = akp.a(bya.class, akn.h);
   public static final int a = 36;
   private long g;

   public bya(bxc<? extends bya> $$0, djx $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public static bya a(djx $$0, czy $$1) {
      bya $$2 = new bya(bxc.aK, $$0);
      $$2.g = (long)$$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV() instanceof ars $$0) {
         this.a($$0);
      } else {
         this.j();
      }
   }

   private void a(ars $$0) {
      if ((long)this.af == this.g - 36L) {
         $$0.a(null, this.dv(), awp.mF, awq.g);
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
      if (this.dV() instanceof ars $$0) {
         czy $$2 = this.g();
         if (!$$2.f()) {
            bwt $$4;
            if ($$2.h() instanceof das $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new coc($$0, this.dA(), this.dC(), this.dG(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dv(), 1);
            $$0.a($$4, ege.t, this.dt());
            this.a(czy.k);
         }
      }
   }

   private bwt a(ars $$0, das $$1, czy $$2) {
      das.a $$3 = $$1.a();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dv(), 0));
      jb $$4 = jb.a;
      css $$5 = css.a($$1.a($$0, this.dt(), $$2, $$4), $$0, $$2, (double)$$4.j(), (double)$$4.k(), (double)$$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(f, czy.k);
   }

   @Override
   protected void a(tz $$0) {
      alg<uy> $$1 = this.dX().a(un.a);
      this.a($$0.<czy>a("item", czy.b, $$1).orElse(czy.k));
      this.g = $$0.b("spawn_item_after_ticks", 0L);
   }

   @Override
   protected void b(tz $$0) {
      if (!this.g().f()) {
         alg<uy> $$1 = this.dX().a(un.a);
         $$0.a("item", czy.b, $$1, this.g());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean r(bwt $$0) {
      return false;
   }

   @Override
   protected boolean bP() {
      return false;
   }

   @Override
   protected void p(bwt $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public ext j_() {
      return ext.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   public void f() {
      ffq $$0 = this.dt();
      int $$1 = this.ae.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         ffq $$4 = new ffq(
            this.dA() + 0.4 * (this.ae.k() - this.ae.k()), this.dC() + 0.4 * (this.ae.k() - this.ae.k()), this.dG() + 0.4 * (this.ae.k() - this.ae.k())
         );
         ffq $$5 = $$0.a($$4);
         this.dV().a(ly.bf, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public czy g() {
      return this.ar().a(f);
   }

   private void a(czy $$0) {
      this.ar().a(f, $$0);
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      return false;
   }
}
