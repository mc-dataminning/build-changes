import org.joml.Vector3f;

public abstract class byl extends ccx {
   protected byl(bip<? extends byl> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
   }

   @Override
   public bjg eQ() {
      return bjg.d;
   }

   public byl.a p() {
      return byl.a.a;
   }

   @Override
   public boolean c(bjb $$0) {
      return $$0 instanceof cax && $$0.i_() ? false : super.c($$0);
   }

   @Override
   protected float l(bil $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
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

   protected class b extends bqo {
      public b(ccx $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && byl.this.gp();
      }
   }
}
