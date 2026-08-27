import org.joml.Vector3f;

public abstract class cbx extends cgr {
   protected cbx(blz<? extends cbx> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   @Override
   public bmq eS() {
      return bmq.d;
   }

   public cbx.a u() {
      return cbx.a.a;
   }

   @Override
   public boolean c(bml $$0) {
      return $$0 instanceof ceq && $$0.o_() ? false : super.c($$0);
   }

   @Override
   protected float l(blv $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
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

   protected class b extends btz {
      public b(cgr $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cbx.this.gt();
      }
   }
}
