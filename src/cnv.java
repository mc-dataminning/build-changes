public class cnv extends cnr {
   public cnv(bsv<? extends cnv> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cnv(dbt $$0, btk $$1) {
      super(bsv.L, $$1, $$0);
   }

   public cnv(dbt $$0, double $$1, double $$2, double $$3) {
      super(bsv.L, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuf u() {
      return cun.tW;
   }

   @Override
   protected double aY() {
      return 0.07;
   }

   @Override
   protected void a(evk $$0) {
      super.a($$0);
      if (this.dP() instanceof arb) {
         this.dP().c(2002, this.dp(), cwl.c(cwm.a));
         int $$1 = 3 + this.dP().z.a(5) + this.dP().z.a(5);
         bta.a((arb)this.dP(), this.dn(), $$1);
         this.ao();
      }
   }
}
