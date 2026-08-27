import org.joml.Vector3f;

public abstract class cbw extends cgq {
   protected cbw(bly<? extends cbw> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   @Override
   public bmp eS() {
      return bmp.d;
   }

   public cbw.a u() {
      return cbw.a.a;
   }

   @Override
   public boolean c(bmk $$0) {
      return $$0 instanceof cep && $$0.o_() ? false : super.c($$0);
   }

   @Override
   protected float l(blu $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
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

   protected class b extends bty {
      public b(cgq $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cbw.this.gt();
      }
   }
}
