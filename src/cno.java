public class cno extends cnk {
   public cno(bsn<? extends cno> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cno(dcg $$0, btc $$1) {
      super(bsn.L, $$1, $$0);
   }

   public cno(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.L, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cty t() {
      return cug.tW;
   }

   @Override
   protected double ba() {
      return 0.07;
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if (this.dR() instanceof aqm) {
         this.dR().c(2002, this.dr(), cwe.c(cwf.a));
         int $$1 = 3 + this.dR().z.a(5) + this.dR().z.a(5);
         bss.a((aqm)this.dR(), this.dp(), $$1);
         this.aq();
      }
   }
}
