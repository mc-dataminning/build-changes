import org.joml.Vector3f;

public class fpy extends fqa<jq> {
   private final Vector3f a;
   private final Vector3f b;

   protected fpy(fns $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, jq $$7, frq $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      float $$9 = this.r.i() * 0.4F + 0.6F;
      this.a = this.a($$7.c(), $$9);
      this.b = this.a($$7.d(), $$9);
   }

   private Vector3f a(Vector3f $$0, float $$1) {
      return new Vector3f(this.a($$0.x(), $$1), this.a($$0.y(), $$1), this.a($$0.z(), $$1));
   }

   private void f(float $$0) {
      float $$1 = ((float)this.s + $$0) / ((float)this.t + 1.0F);
      Vector3f $$2 = new Vector3f(this.a).lerp(this.b, $$1);
      this.v = $$2.x();
      this.w = $$2.y();
      this.x = $$2.z();
   }

   @Override
   public void a(eqf $$0, eut $$1, float $$2) {
      this.f($$2);
      super.a($$0, $$1, $$2);
   }

   public static class a implements fqy<jq> {
      private final frq a;

      public a(frq $$0) {
         this.a = $$0;
      }

      public fqv a(jq $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fpy($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
