public class cal extends caf {
   public cal(bfn<?> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public cal(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bdx a(byo $$0, bdw $$1) {
      if ($$0.fD()) {
         return bdx.d;
      } else if (this.bN()) {
         return bdx.d;
      } else if (!this.dI().B) {
         return $$0.k(this) ? bdx.b : bdx.d;
      } else {
         return bdx.a;
      }
   }

   @Override
   protected cfu j() {
      return cgc.na;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bN()) {
            this.bz();
         }

         if (this.r() == 0) {
            this.d(-this.s());
            this.c(10);
            this.a(50.0F);
            this.bl();
         }
      }
   }

   @Override
   public caf.a t() {
      return caf.a.a;
   }
}
