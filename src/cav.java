import org.joml.Vector3f;

public abstract class cav extends cfh {
   protected cav(bkz<? extends cav> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   @Override
   public blq eT() {
      return blq.d;
   }

   public cav.a u() {
      return cav.a.a;
   }

   @Override
   public boolean c(bll $$0) {
      return $$0 instanceof cdh && $$0.o_() ? false : super.c($$0);
   }

   @Override
   protected float l(bkv $$0) {
      return -0.6F;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
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

   protected class b extends bsy {
      public b(cfh $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cav.this.gu();
      }
   }
}
