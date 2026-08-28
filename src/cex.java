public class cex extends cfj {
   public static final float a = 8.0F;

   @Override
   protected boolean a(arc $$0, bvf $$1, bvf $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && cfp.c($$0, $$1, $$2);
   }

   private boolean a(bvf $$0, bvf $$1) {
      return !$$0.ec().a(cej.U) && $$1.aq().a(aws.j);
   }

   private boolean b(bvf $$0) {
      return $$0.aq().a(aws.i);
   }

   private boolean b(bvf $$0, bvf $$1) {
      return $$1.g((buj)$$0) <= 64.0;
   }

   @Override
   protected cej<bvf> b() {
      return cej.B;
   }
}
