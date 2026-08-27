import org.joml.Vector3f;

public class ccl extends cdh {
   public ccl(bly<? extends ccl> $$0, cto $$1) {
      super($$0, $$1);
   }

   public static boolean a(bly<ccl> $$0, cud $$1, bmo $$2, hx $$3, auu $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bmo.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ae_() {
      return false;
   }

   @Override
   protected arq y() {
      return arr.ml;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.mo;
   }

   @Override
   protected arq n_() {
      return arr.mn;
   }

   @Override
   protected arq A() {
      return arr.mp;
   }

   @Override
   public boolean C(blu $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eT().b() && $$0 instanceof bmk) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((bmk)$$0).b(new blh(blj.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gf() {
      return true;
   }

   @Override
   protected void gh() {
      this.b(bly.br);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected cmx ge() {
      return cmx.f;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
