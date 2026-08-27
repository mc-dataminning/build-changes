import org.joml.Vector3f;

public class cai extends cbe {
   public cai(bjx<? extends cai> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bjx<cai> $$0, cro $$1, bkn $$2, ht $$3, ate $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bkn.c || $$1.g($$3));
   }

   @Override
   protected boolean ac_() {
      return false;
   }

   @Override
   protected aqc w() {
      return aqd.lz;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.lC;
   }

   @Override
   protected aqc m_() {
      return aqd.lB;
   }

   @Override
   protected aqc y() {
      return aqd.lD;
   }

   @Override
   public boolean C(bjt $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eS().b() && $$0 instanceof bkj) {
         float $$2 = this.dL().d_(this.dl()).b();
         ((bkj)$$0).b(new bjg(bji.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gf() {
      return true;
   }

   @Override
   protected void gh() {
      this.b(bjx.bp);
      if (!this.aS()) {
         this.dL().a(null, 1041, this.dl(), 0);
      }
   }

   @Override
   protected ckj ge() {
      return ckj.b;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
