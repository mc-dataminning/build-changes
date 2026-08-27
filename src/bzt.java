import org.joml.Vector3f;

public abstract class bzt extends cef {
   protected bzt(bjx<? extends bzt> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   @Override
   public bko eR() {
      return bko.d;
   }

   public bzt.a s() {
      return bzt.a.a;
   }

   @Override
   public boolean c(bkj $$0) {
      return $$0 instanceof ccf && $$0.n_() ? false : super.c($$0);
   }

   @Override
   protected float l(bjt $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
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

   protected class b extends brw {
      public b(cef $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && bzt.this.gt();
      }
   }
}
