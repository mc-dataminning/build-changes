import javax.annotation.Nullable;

public class frj extends ftk<bxu, fdm> {
   public static final aep a = new aep("textures/entity/armorstand/wood.png");

   public frj(fsj.a $$0) {
      super($$0, new fdn($$0.a(fhi.b)), 0.0F);
      this.a(new fwh<>(this, new fdm($$0.a(fhi.c)), new fdm($$0.a(fhi.d)), $$0.g()));
      this.a(new fwk<>(this, $$0.d()));
      this.a(new fwa<>(this, $$0.f()));
      this.a(new fvw<>(this, $$0.f(), $$0.d()));
   }

   public aep a(bxu $$0) {
      return a;
   }

   protected void a(bxu $$0, elh $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dK().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(aro.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(bxu $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bW() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cA();
   }

   @Nullable
   protected fno a(bxu $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.t()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aep $$4 = this.a($$0);
         if ($$2) {
            return fno.c($$4, false);
         } else {
            return $$1 ? fno.a($$4, false) : null;
         }
      }
   }
}
