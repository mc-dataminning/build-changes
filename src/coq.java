public class coq extends cog {
   private static final ajp<Boolean> e = ajt.a(coq.class, ajr.k);
   private int i;
   public double c;
   public double d;
   private static final cyg j = cyg.a(cug.ox, cug.oy);

   public coq(bsn<? extends coq> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public coq(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.S, $$0, $$1, $$2, $$3);
   }

   @Override
   public cog.a v() {
      return cog.a.c;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dR().x_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.b(this.i > 0);
      }

      if (this.B() && this.ah.a(4) == 0) {
         this.dR().a(lj.X, this.dw(), this.dy() + 0.8, this.dC(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double p() {
      return (this.bg() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cty ag_() {
      return cug.nO;
   }

   @Override
   protected void c(ja $$0, dsl $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      ewh $$4 = this.du();
      double $$5 = $$4.i();
      double $$6 = this.c * this.c + this.d * this.d;
      if ($$6 > 1.0E-4 && $$5 > 0.001) {
         double $$7 = Math.sqrt($$5);
         double $$8 = Math.sqrt($$6);
         this.c = $$4.c / $$7 * $$8;
         this.d = $$4.e / $$7 * $$8;
      }
   }

   @Override
   protected void t() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         ewh $$1 = this.du().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.bg()) {
            $$1 = $$1.a(0.1);
         }

         this.j($$1);
      } else {
         this.j(this.du().d(0.98, 0.0, 0.98));
      }

      super.t();
   }

   @Override
   public bqh a(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.dw() - $$0.dw();
         this.d = this.dC() - $$0.dC();
      }

      return bqh.a(this.dR().B);
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.i = $$0.g("Fuel");
   }

   protected boolean B() {
      return this.ao.a(e);
   }

   protected void b(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public dsl x() {
      return dfk.cD.o().a(dip.a, jf.c).a(dip.b, Boolean.valueOf(this.B()));
   }
}
