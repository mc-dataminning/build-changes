import org.joml.Vector3f;

public class bza extends bzw {
   public bza(bip<? extends bza> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public static boolean a(bip<bza> $$0, cqf $$1, bjf $$2, gw $$3, arx $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjf.c || $$1.g($$3));
   }

   @Override
   protected boolean W_() {
      return false;
   }

   @Override
   protected aoy r() {
      return aoz.lx;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.lA;
   }

   @Override
   protected aoy h_() {
      return aoz.lz;
   }

   @Override
   protected aoy t() {
      return aoz.lB;
   }

   @Override
   public boolean C(bil $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eR().b() && $$0 instanceof bjb) {
         float $$2 = this.dK().d_(this.dk()).b();
         ((bjb)$$0).b(new bhy(bia.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gb() {
      return true;
   }

   @Override
   protected void gd() {
      this.b(bip.bp);
      if (!this.aS()) {
         this.dK().a(null, 1041, this.dk(), 0);
      }
   }

   @Override
   protected cja ga() {
      return cja.b;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
