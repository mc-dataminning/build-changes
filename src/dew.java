public class dew extends dgh {
   private il<clj> c = il.a(27, clj.b);
   private final dfq d = new dfq() {
      @Override
      protected void a(csa $$0, ht $$1, dhi $$2) {
         dew.this.a($$2, aqr.bk);
         dew.this.a($$2, true);
      }

      @Override
      protected void b(csa $$0, ht $$1, dhi $$2) {
         dew.this.a($$2, aqr.bj);
         dew.this.a($$2, false);
      }

      @Override
      protected void a(csa $$0, ht $$1, dhi $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cdu $$0) {
         if ($$0.bS instanceof cgt) {
            biq $$1 = ((cgt)$$0.bS).l();
            return $$1 == dew.this;
         } else {
            return false;
         }
      }
   };

   public dew(ht $$0, dhi $$1) {
      super(dff.A, $$0, $$1);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bir.a($$0, this.c);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c = il.a(this.b(), clj.b);
      if (!this.d($$0)) {
         bir.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected il<clj> f() {
      return this.c;
   }

   @Override
   protected void a(il<clj> $$0) {
      this.c = $$0;
   }

   @Override
   protected ur g() {
      return ur.c("container.barrel");
   }

   @Override
   protected cgm a(int $$0, cdt $$1) {
      return cgt.a($$0, $$1, this);
   }

   @Override
   public void d_(cdu $$0) {
      if (!this.q && !$$0.O_()) {
         this.d.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cdu $$0) {
      if (!this.q && !$$0.O_()) {
         this.d.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.d.c(this.k(), this.p(), this.q());
      }
   }

   void a(dhi $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(cug.c, Boolean.valueOf($$1)), 3);
   }

   void a(dhi $$0, aqq $$1) {
      iw $$2 = $$0.c(cug.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aqs.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
