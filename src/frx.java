import javax.annotation.Nullable;

public class frx extends fty<bxv, fdv> {
   public static final aer a = new aer("textures/entity/armorstand/wood.png");

   public frx(fsx.a $$0) {
      super($$0, new fdw($$0.a(fhr.b)), 0.0F);
      this.a(new fwv<>(this, new fdv($$0.a(fhr.c)), new fdv($$0.a(fhr.d)), $$0.g()));
      this.a(new fwy<>(this, $$0.d()));
      this.a(new fwo<>(this, $$0.f()));
      this.a(new fwk<>(this, $$0.f(), $$0.d()));
   }

   public aer a(bxv $$0) {
      return a;
   }

   protected void a(bxv $$0, elf $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dK().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(arp.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(bxv $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bW() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cA();
   }

   @Nullable
   protected foc a(bxv $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.t()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aer $$4 = this.a($$0);
         if ($$2) {
            return foc.c($$4, false);
         } else {
            return $$1 ? foc.a($$4, false) : null;
         }
      }
   }
}
