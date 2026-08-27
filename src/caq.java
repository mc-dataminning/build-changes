import org.joml.Vector3f;

public abstract class caq extends cfc {
   protected caq(bku<? extends caq> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   @Override
   public bll eT() {
      return bll.d;
   }

   public caq.a u() {
      return caq.a.a;
   }

   @Override
   public boolean c(blg $$0) {
      return $$0 instanceof cdc && $$0.n_() ? false : super.c($$0);
   }

   @Override
   protected float l(bkq $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
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

   protected class b extends bst {
      public b(cfc $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && caq.this.gu();
      }
   }
}
