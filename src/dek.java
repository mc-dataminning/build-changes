public class dek extends dfv {
   private il<clb> c = il.a(27, clb.b);
   private final dfe d = new dfe() {
      @Override
      protected void a(crs $$0, ht $$1, dgw $$2) {
         dek.this.a($$2, aqn.bk);
         dek.this.a($$2, true);
      }

      @Override
      protected void b(crs $$0, ht $$1, dgw $$2) {
         dek.this.a($$2, aqn.bj);
         dek.this.a($$2, false);
      }

      @Override
      protected void a(crs $$0, ht $$1, dgw $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cdm $$0) {
         if ($$0.bS instanceof cgl) {
            bij $$1 = ((cgl)$$0.bS).l();
            return $$1 == dek.this;
         } else {
            return false;
         }
      }
   };

   public dek(ht $$0, dgw $$1) {
      super(det.A, $$0, $$1);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bik.a($$0, this.c);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c = il.a(this.b(), clb.b);
      if (!this.d($$0)) {
         bik.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected il<clb> f() {
      return this.c;
   }

   @Override
   protected void a(il<clb> $$0) {
      this.c = $$0;
   }

   @Override
   protected ur g() {
      return ur.c("container.barrel");
   }

   @Override
   protected cge a(int $$0, cdl $$1) {
      return cgl.a($$0, $$1, this);
   }

   @Override
   public void d_(cdm $$0) {
      if (!this.q && !$$0.N_()) {
         this.d.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cdm $$0) {
      if (!this.q && !$$0.N_()) {
         this.d.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.d.c(this.k(), this.p(), this.q());
      }
   }

   void a(dgw $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(ctz.c, Boolean.valueOf($$1)), 3);
   }

   void a(dgw $$0, aqm $$1) {
      iw $$2 = $$0.c(ctz.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aqo.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
