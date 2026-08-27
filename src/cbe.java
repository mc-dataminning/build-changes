import org.joml.Vector3f;

public class cbe extends cbn {
   private static final int b = 2400;
   private int c;

   public cbe(bkz<? extends cbe> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsa(this));
      this.bO.a(1, new brv(this, this.dN()));
      this.bO.a(2, new bsq(this, 1.0, false));
      this.bO.a(3, new btt(this, 1.0));
      this.bO.a(7, new bso(this, cdz.class, 8.0F));
      this.bO.a(8, new btb(this));
      this.bP.a(1, new bty(this).a());
      this.bP.a(2, new btz<>(this, cdz.class, true));
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 0.13F;
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.l, 8.0).a(bmr.m, 0.25).a(bmr.c, 2.0);
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.c;
   }

   @Override
   protected aqu y() {
      return aqv.hC;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.hE;
   }

   @Override
   protected aqu n_() {
      return aqv.hD;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.hF, 0.15F, 1.0F);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dD();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(jw.X, this.d(0.5), this.dv(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fM()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(bkz<cbe> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cdz $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public blq eT() {
      return blq.c;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
