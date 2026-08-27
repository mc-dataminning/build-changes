public class dcq extends dea {
   private hp<cjh> c = hp.a(27, cjh.b);
   private final ddk f = new ddk() {
      @Override
      protected void a(cpx $$0, gw $$1, dfl $$2) {
         dcq.this.a($$2, apf.bk);
         dcq.this.a($$2, true);
      }

      @Override
      protected void b(cpx $$0, gw $$1, dfl $$2) {
         dcq.this.a($$2, apf.bj);
         dcq.this.a($$2, false);
      }

      @Override
      protected void a(cpx $$0, gw $$1, dfl $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cbw $$0) {
         if ($$0.bS instanceof ceu) {
            bgt $$1 = ((ceu)$$0.bS).l();
            return $$1 == dcq.this;
         } else {
            return false;
         }
      }
   };

   public dcq(gw $$0, dfl $$1) {
      super(dcz.A, $$0, $$1);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgu.a($$0, this.c);
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c = hp.a(this.b(), cjh.b);
      if (!this.d($$0)) {
         bgu.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected hp<cjh> f() {
      return this.c;
   }

   @Override
   protected void a(hp<cjh> $$0) {
      this.c = $$0;
   }

   @Override
   protected tn g() {
      return tn.c("container.barrel");
   }

   @Override
   protected cen a(int $$0, cbv $$1) {
      return ceu.a($$0, $$1, this);
   }

   @Override
   public void d_(cbw $$0) {
      if (!this.q && !$$0.M_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbw $$0) {
      if (!this.q && !$$0.M_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.f.c(this.k(), this.p(), this.q());
      }
   }

   void a(dfl $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(cse.b, Boolean.valueOf($$1)), 3);
   }

   void a(dfl $$0, ape $$1) {
      ib $$2 = $$0.c(cse.a).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, apg.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
