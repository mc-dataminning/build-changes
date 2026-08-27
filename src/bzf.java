import org.joml.Vector3f;

public class bzf extends cab {
   public bzf(biu<? extends bzf> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public static boolean a(biu<bzf> $$0, cqk $$1, bjk $$2, gw $$3, asc $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bjk.c || $$1.g($$3));
   }

   @Override
   protected boolean ab_() {
      return false;
   }

   @Override
   protected apd w() {
      return ape.lx;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.lA;
   }

   @Override
   protected apd l_() {
      return ape.lz;
   }

   @Override
   protected apd y() {
      return ape.lB;
   }

   @Override
   public boolean C(biq $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eS().b() && $$0 instanceof bjg) {
         float $$2 = this.dL().d_(this.dl()).b();
         ((bjg)$$0).b(new bid(bif.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean ge() {
      return true;
   }

   @Override
   protected void gg() {
      this.b(biu.bp);
      if (!this.aT()) {
         this.dL().a(null, 1041, this.dl(), 0);
      }
   }

   @Override
   protected cjf gd() {
      return cjf.b;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
