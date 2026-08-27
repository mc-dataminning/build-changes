import javax.annotation.Nullable;

public class fro extends ftp<bxw, fdq> {
   public static final aer a = new aer("textures/entity/armorstand/wood.png");

   public fro(fso.a $$0) {
      super($$0, new fdr($$0.a(fhm.b)), 0.0F);
      this.a(new fwm<>(this, new fdq($$0.a(fhm.c)), new fdq($$0.a(fhm.d)), $$0.g()));
      this.a(new fwp<>(this, $$0.d()));
      this.a(new fwf<>(this, $$0.f()));
      this.a(new fwb<>(this, $$0.f(), $$0.d()));
   }

   public aer a(bxw $$0) {
      return a;
   }

   protected void a(bxw $$0, elg $$1, float $$2, float $$3, float $$4) {
      $$1.a(a.d.rotationDegrees(180.0F - $$3));
      float $$5 = (float)($$0.dK().V() - $$0.bJ) + $$4;
      if ($$5 < 5.0F) {
         $$1.a(a.d.rotationDegrees(arp.a($$5 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean b(bxw $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bW() ? 32.0F : 64.0F;
      return $$1 >= (double)($$2 * $$2) ? false : $$0.cA();
   }

   @Nullable
   protected fnt a(bxw $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.t()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aer $$4 = this.a($$0);
         if ($$2) {
            return fnt.c($$4, false);
         } else {
            return $$1 ? fnt.a($$4, false) : null;
         }
      }
   }
}
