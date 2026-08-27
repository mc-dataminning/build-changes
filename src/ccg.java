import org.joml.Vector3f;

public class ccg extends cdc {
   public ccg(blt<? extends ccg> $$0, cti $$1) {
      super($$0, $$1);
   }

   public static boolean a(blt<ccg> $$0, ctx $$1, bmj $$2, hx $$3, aup $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bmj.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ae_() {
      return false;
   }

   @Override
   protected arl y() {
      return arm.ml;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.mo;
   }

   @Override
   protected arl n_() {
      return arm.mn;
   }

   @Override
   protected arl A() {
      return arm.mp;
   }

   @Override
   public boolean C(blp $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eT().b() && $$0 instanceof bmf) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((bmf)$$0).b(new blc(ble.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gf() {
      return true;
   }

   @Override
   protected void gh() {
      this.b(blt.br);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected cmr ge() {
      return cmr.f;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
