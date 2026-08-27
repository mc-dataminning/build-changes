public class dcj extends ddt {
   private hp<cja> c = hp.a(27, cja.b);
   private final ddd f = new ddd() {
      @Override
      protected void a(cpq $$0, gw $$1, dfe $$2) {
         dcj.this.a($$2, aoz.bk);
         dcj.this.a($$2, true);
      }

      @Override
      protected void b(cpq $$0, gw $$1, dfe $$2) {
         dcj.this.a($$2, aoz.bj);
         dcj.this.a($$2, false);
      }

      @Override
      protected void a(cpq $$0, gw $$1, dfe $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cbp $$0) {
         if ($$0.bQ instanceof cen) {
            bgm $$1 = ((cen)$$0.bQ).l();
            return $$1 == dcj.this;
         } else {
            return false;
         }
      }
   };

   public dcj(gw $$0, dfe $$1) {
      super(dcs.A, $$0, $$1);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgn.a($$0, this.c);
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.c = hp.a(this.b(), cja.b);
      if (!this.d($$0)) {
         bgn.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected hp<cja> f() {
      return this.c;
   }

   @Override
   protected void a(hp<cja> $$0) {
      this.c = $$0;
   }

   @Override
   protected ti g() {
      return ti.c("container.barrel");
   }

   @Override
   protected ceg a(int $$0, cbo $$1) {
      return cen.a($$0, $$1, this);
   }

   @Override
   public void d_(cbp $$0) {
      if (!this.q && !$$0.G_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbp $$0) {
      if (!this.q && !$$0.G_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.f.c(this.k(), this.p(), this.q());
      }
   }

   void a(dfe $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(crx.b, Boolean.valueOf($$1)), 3);
   }

   void a(dfe $$0, aoy $$1) {
      ib $$2 = $$0.c(crx.a).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, apa.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
