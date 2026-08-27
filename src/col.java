public class col<T extends bnq & bof> extends coy {
   private final bnw<T> a;
   private final int b;

   public col(coy.a $$0, bnw<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      if ($$0.B) {
         return blx.c($$3);
      } else {
         bnq $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bof $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, boi.d($$2));
            if ($$3.b()) {
               cpd $$6 = new cpd(cpg.qU);
               $$6.c($$3.w());
               return blx.a($$6);
            }

            return blx.a($$3);
         }

         $$1.b(atv.c.b(this));
         return blx.c($$3);
      }
   }
}
