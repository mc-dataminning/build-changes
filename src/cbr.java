import org.joml.Vector3f;

public abstract class cbr extends cgk {
   protected cbr(blt<? extends cbr> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   @Override
   public bmk eS() {
      return bmk.d;
   }

   public cbr.a u() {
      return cbr.a.a;
   }

   @Override
   public boolean c(bmf $$0) {
      return $$0 instanceof cej && $$0.o_() ? false : super.c($$0);
   }

   @Override
   protected float l(blp $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
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

   protected class b extends btt {
      public b(cgk $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cbr.this.gt();
      }
   }
}
