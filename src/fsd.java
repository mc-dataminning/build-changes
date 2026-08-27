import javax.annotation.Nullable;

public class fsd extends fue<byj, fea> {
   public static final aez a = new aez("textures/entity/armorstand/wood.png");

   public fsd(ftd.a $$0) {
      super($$0, new feb($$0.a(fhw.b)), 0.0F);
      this.a(new fxb<>(this, new fea($$0.a(fhw.c)), new fea($$0.a(fhw.d)), $$0.g()));
      this.a(new fxe<>(this, $$0.d()));
      this.a(new fwu<>(this, $$0.f()));
      this.a(new fwq<>(this, $$0.f(), $$0.d()));
   }

   public aez a(byj $$0) {
      return a;
   }

   protected void a(byj $$0, elj $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dL().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(asb.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(byj $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bW() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cA();
   }

   @Nullable
   protected foi a(byj $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.y()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aez $$4 = this.a($$0);
         if ($$2) {
            return foi.c($$4, false);
         } else {
            return $$1 ? foi.a($$4, false) : null;
         }
      }
   }
}
