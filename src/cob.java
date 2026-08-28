public class cob extends cnx {
   public cob(btb<? extends cob> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cob(dbz $$0, btq $$1) {
      super(btb.L, $$1, $$0);
   }

   public cob(dbz $$0, double $$1, double $$2, double $$3) {
      super(btb.L, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cul u() {
      return cut.tW;
   }

   @Override
   protected double aY() {
      return 0.07;
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if (this.dP() instanceof arf) {
         this.dP().c(2002, this.dp(), cwr.c(cws.a));
         int $$1 = 3 + this.dP().z.a(5) + this.dP().z.a(5);
         btg.a((arf)this.dP(), this.dn(), $$1);
         this.ao();
      }
   }
}
