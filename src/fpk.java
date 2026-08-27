import org.joml.Vector3f;

public class fpk extends fqw {
   private final Vector3f a = new Vector3f(0.5F, 0.5F, 0.5F);
   private final Vector3f b = new Vector3f(1.0F, 1.0F, 1.0F);

   fpk(fmt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.n = false;
      this.j = $$4 + (double)aty.b(this.r, -0.4F, 0.4F);
      this.l = $$6 + (double)aty.b(this.r, -0.4F, 0.4F);
      double $$7 = Math.random() * 2.0;
      double $$8 = Math.sqrt(this.j * this.j + this.k * this.k + this.l * this.l);
      this.j = this.j / $$8 * $$7 * 0.4F;
      this.l = this.l / $$8 * $$7 * 0.4F;
      this.D *= 2.5F;
      this.j *= 0.08F;
      this.l *= 0.08F;
      this.t = 18 + this.r.a(4);
   }

   @Override
   public void a(eph $$0, etv $$1, float $$2) {
      this.f($$2);
      super.a($$0, $$1, $$2);
   }

   private void f(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)(this.t + 1);
      Vector3f $$2 = new Vector3f(this.a).lerp(this.b, $$1);
      this.v = $$2.x();
      this.w = $$2.y();
      this.x = $$2.z();
   }

   @Override
   public fqa b() {
      return fqa.c;
   }

   @Override
   public void a() {
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.d = this.g;
         this.f = this.i;
         this.a(this.j, 0.0, this.l);
         this.j *= 0.99;
         this.l *= 0.99;
      }
   }

   public static class a implements fpz<jy> {
      private final fqr a;

      public a(fqr $$0) {
         this.a = $$0;
      }

      public fpw a(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fpk $$8 = new fpk($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
