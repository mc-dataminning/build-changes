public class cfy extends cgk {
   public static final float a = 8.0F;

   @Override
   protected boolean a(ash $$0, bwg $$1, bwg $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && cgq.c($$0, $$1, $$2);
   }

   private boolean a(bwg $$0, bwg $$1) {
      return !$$0.ec().a(cfk.U) && $$1.aq().a(axy.j);
   }

   private boolean b(bwg $$0) {
      return $$0.aq().a(axy.i);
   }

   private boolean b(bwg $$0, bwg $$1) {
      return $$1.g((bvk)$$0) <= 64.0;
   }

   @Override
   protected cfk<bwg> b() {
      return cfk.B;
   }
}
