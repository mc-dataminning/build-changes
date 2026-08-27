import javax.annotation.Nullable;

public class fsh extends fui<byd, fef> {
   public static final aex a = new aex("textures/entity/armorstand/wood.png");

   public fsh(fth.a $$0) {
      super($$0, new feg($$0.a(fib.b)), 0.0F);
      this.a(new fxf<>(this, new fef($$0.a(fib.c)), new fef($$0.a(fib.d)), $$0.g()));
      this.a(new fxi<>(this, $$0.d()));
      this.a(new fwy<>(this, $$0.f()));
      this.a(new fwu<>(this, $$0.f(), $$0.d()));
   }

   public aex a(byd $$0) {
      return a;
   }

   protected void a(byd $$0, elp $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dL().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(arx.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(byd $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bX() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cB();
   }

   @Nullable
   protected fom a(byd $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.y()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aex $$4 = this.a($$0);
         if ($$2) {
            return fom.c($$4, false);
         } else {
            return $$1 ? fom.a($$4, false) : null;
         }
      }
   }
}
