import org.joml.Vector3f;

public abstract class cai extends ceu {
   protected cai(bkm<? extends cai> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   @Override
   public bld eR() {
      return bld.d;
   }

   public cai.a s() {
      return cai.a.a;
   }

   @Override
   public boolean c(bky $$0) {
      return $$0 instanceof ccu && $$0.n_() ? false : super.c($$0);
   }

   @Override
   protected float l(bki $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
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

   protected class b extends bsl {
      public b(ceu $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cai.this.gt();
      }
   }
}
