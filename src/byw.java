import org.joml.Vector3f;

public class byw extends bzs {
   public byw(bik<? extends byw> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public static boolean a(bik<byw> $$0, cpz $$1, bja $$2, gv $$3, art $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bja.c || $$1.g($$3));
   }

   @Override
   protected boolean X_() {
      return false;
   }

   @Override
   protected aot r() {
      return aou.lx;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.lA;
   }

   @Override
   protected aot h_() {
      return aou.lz;
   }

   @Override
   protected aot t() {
      return aou.lB;
   }

   @Override
   public boolean C(big $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eR().b() && $$0 instanceof biw) {
         float $$2 = this.dK().d_(this.dk()).b();
         ((biw)$$0).b(new bht(bhv.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean ga() {
      return true;
   }

   @Override
   protected void gc() {
      this.b(bik.bp);
      if (!this.aS()) {
         this.dK().a(null, 1041, this.dk(), 0);
      }
   }

   @Override
   protected ciw fZ() {
      return ciw.b;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
