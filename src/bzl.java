import org.joml.Vector3f;

public class bzl extends cah {
   public bzl(bja<? extends bzl> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public static boolean a(bja<bzl> $$0, cqq $$1, bjq $$2, gw $$3, ash $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjq.c || $$1.g($$3));
   }

   @Override
   protected boolean ab_() {
      return false;
   }

   @Override
   protected apf w() {
      return apg.lx;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.lA;
   }

   @Override
   protected apf l_() {
      return apg.lz;
   }

   @Override
   protected apf y() {
      return apg.lB;
   }

   @Override
   public boolean C(biw $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eS().b() && $$0 instanceof bjm) {
         float $$2 = this.dL().d_(this.dl()).b();
         ((bjm)$$0).b(new bij(bil.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gf() {
      return true;
   }

   @Override
   protected void gh() {
      this.b(bja.bp);
      if (!this.aS()) {
         this.dL().a(null, 1041, this.dl(), 0);
      }
   }

   @Override
   protected cjl ge() {
      return cjl.b;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
