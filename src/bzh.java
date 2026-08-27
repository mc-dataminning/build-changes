import org.joml.Vector3f;

public class bzh extends cad {
   public bzh(biw<? extends bzh> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public static boolean a(biw<bzh> $$0, cqm $$1, bjm $$2, gw $$3, ase $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjm.c || $$1.g($$3));
   }

   @Override
   protected boolean ab_() {
      return false;
   }

   @Override
   protected ape w() {
      return apf.lx;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.lA;
   }

   @Override
   protected ape l_() {
      return apf.lz;
   }

   @Override
   protected ape y() {
      return apf.lB;
   }

   @Override
   public boolean C(bis $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eS().b() && $$0 instanceof bji) {
         float $$2 = this.dL().d_(this.dl()).b();
         ((bji)$$0).b(new bif(bih.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean ge() {
      return true;
   }

   @Override
   protected void gg() {
      this.b(biw.bp);
      if (!this.aS()) {
         this.dL().a(null, 1041, this.dl(), 0);
      }
   }

   @Override
   protected cjh gd() {
      return cjh.b;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
