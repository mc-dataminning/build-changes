import org.joml.Vector3f;

public abstract class byw extends cdi {
   protected byw(bja<? extends byw> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   @Override
   public bjr eR() {
      return bjr.d;
   }

   public byw.a s() {
      return byw.a.a;
   }

   @Override
   public boolean c(bjm $$0) {
      return $$0 instanceof cbi && $$0.m_() ? false : super.c($$0);
   }

   @Override
   protected float l(biw $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
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

   protected class b extends bqz {
      public b(cdi $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && byw.this.gt();
      }
   }
}
