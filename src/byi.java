import org.joml.Vector3f;

public abstract class byi extends ccu {
   protected byi(bim<? extends byi> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
   }

   @Override
   public bjd eQ() {
      return bjd.d;
   }

   public byi.a p() {
      return byi.a.a;
   }

   @Override
   public boolean c(biy $$0) {
      return $$0 instanceof cau && $$0.i_() ? false : super.c($$0);
   }

   @Override
   protected float l(bii $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
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

   protected class b extends bql {
      public b(ccu $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && byi.this.gp();
      }
   }
}
