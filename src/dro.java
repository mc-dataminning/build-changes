public class dro extends dtc {
   private jx<cvs> d = jx.a(27, cvs.k);
   private final dsi e = new dsi() {
      @Override
      protected void a(dej $$0, jf $$1, dus $$2) {
         dro.this.a($$2, awg.bz);
         dro.this.a($$2, true);
      }

      @Override
      protected void b(dej $$0, jf $$1, dus $$2) {
         dro.this.a($$2, awg.by);
         dro.this.a($$2, false);
      }

      @Override
      protected void a(dej $$0, jf $$1, dus $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cnx $$0) {
         if ($$0.bZ instanceof cri) {
            brl $$1 = ((cri)$$0.bZ).l();
            return $$1 == dro.this;
         } else {
            return false;
         }
      }
   };

   public dro(jf $$0, dus $$1) {
      super(drx.A, $$0, $$1);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brm.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.d = jx.a(this.b(), cvs.k);
      if (!this.b_($$0)) {
         brm.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jx<cvs> f() {
      return this.d;
   }

   @Override
   protected void a(jx<cvs> $$0) {
      this.d = $$0;
   }

   @Override
   protected xe j() {
      return xe.c("container.barrel");
   }

   @Override
   protected cqz a(int $$0, cnw $$1) {
      return cri.a($$0, $$1, this);
   }

   @Override
   public void d_(cnx $$0) {
      if (!this.q && !$$0.Q_()) {
         this.e.a($$0, this.i(), this.aC_(), this.m());
      }
   }

   @Override
   public void c(cnx $$0) {
      if (!this.q && !$$0.Q_()) {
         this.e.b($$0, this.i(), this.aC_(), this.m());
      }
   }

   public void k() {
      if (!this.q) {
         this.e.c(this.i(), this.aC_(), this.m());
      }
   }

   void a(dus $$0, boolean $$1) {
      this.o.a(this.aC_(), $$0.b(dgs.c, Boolean.valueOf($$1)), 3);
   }

   void a(dus $$0, awf $$1) {
      kj $$2 = $$0.c(dgs.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, awh.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
