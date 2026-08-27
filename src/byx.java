import org.joml.Vector3f;

public class byx extends bzt {
   public byx(bim<? extends byx> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public static boolean a(bim<byx> $$0, cqa $$1, bjc $$2, gu $$3, aru $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjc.c || $$1.g($$3));
   }

   @Override
   protected boolean W_() {
      return false;
   }

   @Override
   protected aov r() {
      return aow.lx;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.lA;
   }

   @Override
   protected aov h_() {
      return aow.lz;
   }

   @Override
   protected aov t() {
      return aow.lB;
   }

   @Override
   public boolean C(bii $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eR().b() && $$0 instanceof biy) {
         float $$2 = this.dK().d_(this.dk()).b();
         ((biy)$$0).b(new bhv(bhx.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gb() {
      return true;
   }

   @Override
   protected void gd() {
      this.b(bim.bp);
      if (!this.aS()) {
         this.dK().a(null, 1041, this.dk(), 0);
      }
   }

   @Override
   protected cix ga() {
      return cix.b;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
