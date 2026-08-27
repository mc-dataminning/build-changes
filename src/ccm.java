import org.joml.Vector3f;

public class ccm extends cdi {
   public ccm(blz<? extends ccm> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public static boolean a(blz<ccm> $$0, cue $$1, bmp $$2, hx $$3, auv $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bmp.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ae_() {
      return false;
   }

   @Override
   protected arr y() {
      return ars.ml;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.mo;
   }

   @Override
   protected arr n_() {
      return ars.mn;
   }

   @Override
   protected arr A() {
      return ars.mp;
   }

   @Override
   public boolean C(blv $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eT().b() && $$0 instanceof bml) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((bml)$$0).b(new bli(blk.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gf() {
      return true;
   }

   @Override
   protected void gh() {
      this.b(blz.br);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected cmy ge() {
      return cmy.f;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
