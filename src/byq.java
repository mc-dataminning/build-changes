import org.joml.Vector3f;

public abstract class byq extends cdc {
   protected byq(biu<? extends byq> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   @Override
   public bjl eR() {
      return bjl.d;
   }

   public byq.a s() {
      return byq.a.a;
   }

   @Override
   public boolean c(bjg $$0) {
      return $$0 instanceof cbc && $$0.m_() ? false : super.c($$0);
   }

   @Override
   protected float l(biq $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
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

   protected class b extends bqt {
      public b(cdc $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && byq.this.gs();
      }
   }
}
