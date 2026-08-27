import org.joml.Vector3f;

public abstract class bys extends cde {
   protected bys(biw<? extends bys> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   @Override
   public bjn eR() {
      return bjn.d;
   }

   public bys.a s() {
      return bys.a.a;
   }

   @Override
   public boolean c(bji $$0) {
      return $$0 instanceof cbe && $$0.m_() ? false : super.c($$0);
   }

   @Override
   protected float l(bis $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
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

   protected class b extends bqv {
      public b(cde $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && bys.this.gs();
      }
   }
}
