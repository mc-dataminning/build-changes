public class cnz extends cnv {
   public cnz(bsz<? extends cnz> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cnz(dbx $$0, bto $$1) {
      super(bsz.L, $$1, $$0);
   }

   public cnz(dbx $$0, double $$1, double $$2, double $$3) {
      super(bsz.L, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuj u() {
      return cur.tW;
   }

   @Override
   protected double aY() {
      return 0.07;
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      if (this.dP() instanceof are) {
         this.dP().c(2002, this.dp(), cwp.c(cwq.a));
         int $$1 = 3 + this.dP().z.a(5) + this.dP().z.a(5);
         bte.a((are)this.dP(), this.dn(), $$1);
         this.ao();
      }
   }
}
