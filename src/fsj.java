import javax.annotation.Nullable;

public class fsj extends fuk<byf, feh> {
   public static final aey a = new aey("textures/entity/armorstand/wood.png");

   public fsj(ftj.a $$0) {
      super($$0, new fei($$0.a(fid.b)), 0.0F);
      this.a(new fxh<>(this, new feh($$0.a(fid.c)), new feh($$0.a(fid.d)), $$0.g()));
      this.a(new fxk<>(this, $$0.d()));
      this.a(new fxa<>(this, $$0.f()));
      this.a(new fww<>(this, $$0.f(), $$0.d()));
   }

   public aey a(byf $$0) {
      return a;
   }

   protected void a(byf $$0, elr $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dL().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(ary.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(byf $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bW() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cA();
   }

   @Nullable
   protected foo a(byf $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.y()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aey $$4 = this.a($$0);
         if ($$2) {
            return foo.c($$4, false);
         } else {
            return $$1 ? foo.a($$4, false) : null;
         }
      }
   }
}
