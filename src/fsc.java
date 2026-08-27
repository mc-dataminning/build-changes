import javax.annotation.Nullable;

public class fsc extends fud<bxy, fea> {
   public static final aeu a = new aeu("textures/entity/armorstand/wood.png");

   public fsc(ftc.a $$0) {
      super($$0, new feb($$0.a(fhw.b)), 0.0F);
      this.a(new fxa<>(this, new fea($$0.a(fhw.c)), new fea($$0.a(fhw.d)), $$0.g()));
      this.a(new fxd<>(this, $$0.d()));
      this.a(new fwt<>(this, $$0.f()));
      this.a(new fwp<>(this, $$0.f(), $$0.d()));
   }

   public aeu a(bxy $$0) {
      return a;
   }

   protected void a(bxy $$0, elk $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dK().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ars.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(bxy $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bW() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cA();
   }

   @Nullable
   protected foh a(bxy $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.t()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aeu $$4 = this.a($$0);
         if ($$2) {
            return foh.c($$4, false);
         } else {
            return $$1 ? foh.a($$4, false) : null;
         }
      }
   }
}
