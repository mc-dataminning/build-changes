public class dje extends dkp {
   private iu<cpq> e = iu.a(27, cpq.h);
   private final djy f = new djy() {
      @Override
      protected void a(cwe $$0, ib $$1, dme $$2) {
         dje.this.a($$2, atp.bx);
         dje.this.a($$2, true);
      }

      @Override
      protected void b(cwe $$0, ib $$1, dme $$2) {
         dje.this.a($$2, atp.bw);
         dje.this.a($$2, false);
      }

      @Override
      protected void a(cwe $$0, ib $$1, dme $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cia $$0) {
         if ($$0.bX instanceof clb) {
            bme $$1 = ((clb)$$0.bX).l();
            return $$1 == dje.this;
         } else {
            return false;
         }
      }
   };

   public dje(ib $$0, dme $$1) {
      super(djn.A, $$0, $$1);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmf.a($$0, this.e);
      }
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.e = iu.a(this.b(), cpq.h);
      if (!this.c_($$0)) {
         bmf.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iu<cpq> j() {
      return this.e;
   }

   @Override
   protected void a(iu<cpq> $$0) {
      this.e = $$0;
   }

   @Override
   protected vs k() {
      return vs.c("container.barrel");
   }

   @Override
   protected cku a(int $$0, chz $$1) {
      return clb.a($$0, $$1, this);
   }

   @Override
   public void d_(cia $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aD_(), this.n());
      }
   }

   @Override
   public void c(cia $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aD_(), this.n());
      }
   }

   public void l() {
      if (!this.q) {
         this.f.c(this.i(), this.aD_(), this.n());
      }
   }

   void a(dme $$0, boolean $$1) {
      this.o.a(this.aD_(), $$0.a(cyl.c, Boolean.valueOf($$1)), 3);
   }

   void a(dme $$0, ato $$1) {
      jf $$2 = $$0.c(cyl.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, atq.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
