import javax.annotation.Nullable;

public class ftd extends fve<bzg, fez> {
   public static final afw a = new afw("textures/entity/armorstand/wood.png");

   public ftd(fud.a $$0) {
      super($$0, new ffa($$0.a(fiv.b)), 0.0F);
      this.a(new fyb<>(this, new fez($$0.a(fiv.c)), new fez($$0.a(fiv.d)), $$0.g()));
      this.a(new fye<>(this, $$0.d()));
      this.a(new fxu<>(this, $$0.f()));
      this.a(new fxq<>(this, $$0.f(), $$0.d()));
   }

   public afw a(bzg $$0) {
      return a;
   }

   protected void a(bzg $$0, emh $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dL().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(asy.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(bzg $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bW() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cA();
   }

   @Nullable
   protected fpj a(bzg $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.y()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         afw $$4 = this.a($$0);
         if ($$2) {
            return fpj.c($$4, false);
         } else {
            return $$1 ? fpj.a($$4, false) : null;
         }
      }
   }
}
