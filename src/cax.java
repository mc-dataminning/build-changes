import org.joml.Vector3f;

public class cax extends cbt {
   public cax(bkm<? extends cax> $$0, crs $$1) {
      super($$0, $$1);
   }

   public static boolean a(bkm<cax> $$0, csh $$1, blc $$2, ht $$3, ato $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == blc.c || $$1.g($$3));
   }

   @Override
   protected boolean ac_() {
      return false;
   }

   @Override
   protected aqm w() {
      return aqn.lB;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.lE;
   }

   @Override
   protected aqm m_() {
      return aqn.lD;
   }

   @Override
   protected aqm y() {
      return aqn.lF;
   }

   @Override
   public boolean C(bki $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eS().b() && $$0 instanceof bky) {
         float $$2 = this.dL().d_(this.dl()).b();
         ((bky)$$0).b(new bjv(bjx.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gf() {
      return true;
   }

   @Override
   protected void gh() {
      this.b(bkm.bp);
      if (!this.aS()) {
         this.dL().a(null, 1041, this.dl(), 0);
      }
   }

   @Override
   protected clb ge() {
      return clb.b;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
