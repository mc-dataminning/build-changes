public class dqa extends drn {
   private jv<cuq> d = jv.a(27, cuq.l);
   private final dqu e = new dqu() {
      @Override
      protected void a(dcw $$0, jd $$1, dtc $$2) {
         dqa.this.a($$2, avp.bz);
         dqa.this.a($$2, true);
      }

      @Override
      protected void b(dcw $$0, jd $$1, dtc $$2) {
         dqa.this.a($$2, avp.by);
         dqa.this.a($$2, false);
      }

      @Override
      protected void a(dcw $$0, jd $$1, dtc $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cmx $$0) {
         if ($$0.cd instanceof cqc) {
            bqk $$1 = ((cqc)$$0.cd).l();
            return $$1 == dqa.this;
         } else {
            return false;
         }
      }
   };

   public dqa(jd $$0, dtc $$1) {
      super(dqj.A, $$0, $$1);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bql.a($$0, this.d, $$1);
      }
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.d = jv.a(this.b(), cuq.l);
      if (!this.b_($$0)) {
         bql.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jv<cuq> j() {
      return this.d;
   }

   @Override
   protected void a(jv<cuq> $$0) {
      this.d = $$0;
   }

   @Override
   protected wz k() {
      return wz.c("container.barrel");
   }

   @Override
   protected cpu a(int $$0, cmw $$1) {
      return cqc.a($$0, $$1, this);
   }

   @Override
   public void d_(cmx $$0) {
      if (!this.p && !$$0.R_()) {
         this.e.a($$0, this.i(), this.aD_(), this.n());
      }
   }

   @Override
   public void c(cmx $$0) {
      if (!this.p && !$$0.R_()) {
         this.e.b($$0, this.i(), this.aD_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.aD_(), this.n());
      }
   }

   void a(dtc $$0, boolean $$1) {
      this.n.a(this.aD_(), $$0.a(dfe.c, Boolean.valueOf($$1)), 3);
   }

   void a(dtc $$0, avo $$1) {
      kh $$2 = $$0.c(dfe.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avq.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}
