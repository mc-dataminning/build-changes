public class cgp extends chb {
   public static final float a = 8.0F;

   @Override
   protected boolean a(aro $$0, bwz $$1, bwz $$2) {
      return this.b($$1, $$2) && $$2.bj() && (this.b($$2) || this.a($$1, $$2)) && chh.c($$0, $$1, $$2);
   }

   private boolean a(bwz $$0, bwz $$1) {
      return !$$0.eb().a(cgb.V) && $$1.aq().a(axd.j);
   }

   private boolean b(bwz $$0) {
      return $$0.aq().a(axd.i);
   }

   private boolean b(bwz $$0, bwz $$1) {
      return $$1.g($$0) <= 64.0;
   }

   @Override
   protected cgb<bwz> b() {
      return cgb.C;
   }
}
