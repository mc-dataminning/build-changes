public class cdg extends cds {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bto $$0, bto $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && cdy.c($$0, $$1);
   }

   private boolean e(bto $$0, bto $$1) {
      return !$$0.dS().a(ccs.U) && $$1.ak().a(aws.j);
   }

   private boolean b(bto $$0) {
      return $$0.ak().a(aws.i);
   }

   private boolean f(bto $$0, bto $$1) {
      return $$1.g((bst)$$0) <= 64.0;
   }

   @Override
   protected ccs<bto> b() {
      return ccs.B;
   }
}
