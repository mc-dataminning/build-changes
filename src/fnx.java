import javax.annotation.Nullable;

public class fnx extends fpz<bux, fah> {
   public static final acq a = new acq("textures/entity/armorstand/wood.png");

   public fnx(foy.a $$0) {
      super($$0, new fai($$0.a(fed.b)), 0.0F);
      this.a(new fsw<>(this, new fah($$0.a(fed.c)), new fah($$0.a(fed.d)), $$0.g()));
      this.a(new fsz<>(this, $$0.d()));
      this.a(new fsp<>(this, $$0.f()));
      this.a(new fsl<>(this, $$0.f(), $$0.d()));
   }

   public acq a(bux $$0) {
      return a;
   }

   protected void a(bux $$0, eij $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dI().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(apa.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(bux $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bU() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cy();
   }

   @Nullable
   protected fkf a(bux $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.w()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         acq $$4 = this.a($$0);
         if ($$2) {
            return fkf.c($$4, false);
         } else {
            return $$1 ? fkf.a($$4, false) : null;
         }
      }
   }
}
