import org.joml.Vector3f;

public abstract class cbh extends cga {
   protected cbh(blj<? extends cbh> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   @Override
   public bma eS() {
      return bma.d;
   }

   public cbh.a u() {
      return cbh.a.a;
   }

   @Override
   public boolean c(blv $$0) {
      return $$0 instanceof cdz && $$0.o_() ? false : super.c($$0);
   }

   @Override
   protected float l(blf $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
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

   protected class b extends btj {
      public b(cga $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cbh.this.gt();
      }
   }
}
