import org.joml.Vector3f;

public abstract class byh extends cct {
   protected byh(bik<? extends byh> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
   }

   @Override
   public bjb eQ() {
      return bjb.d;
   }

   public byh.a p() {
      return byh.a.a;
   }

   @Override
   public boolean c(biw $$0) {
      return $$0 instanceof cat && $$0.i_() ? false : super.c($$0);
   }

   @Override
   protected float l(big $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;
   }

   protected class b extends bqk {
      public b(cct $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && byh.this.go();
      }
   }
}
