import org.joml.Vector3f;

public class cca extends ccj {
   private static final int b = 2400;
   private int c;

   public cca(blt<? extends cca> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsv(this));
      this.bO.a(1, new bsq(this, this.dM()));
      this.bO.a(2, new btl(this, 1.0, false));
      this.bO.a(3, new buo(this, 1.0));
      this.bO.a(7, new btj(this, cfb.class, 8.0F));
      this.bO.a(8, new btw(this));
      this.bP.a(1, new but(this).a());
      this.bP.a(2, new buu<>(this, cfb.class, true));
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 0.13F;
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.l, 8.0).a(bnl.m, 0.25).a(bnl.c, 2.0);
   }

   @Override
   protected blp.b aW() {
      return blp.b.c;
   }

   @Override
   protected arl y() {
      return arm.hL;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.hN;
   }

   @Override
   protected arl n_() {
      return arm.hM;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.hO, 0.15F, 1.0F);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dC();
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
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jx.Z, this.d(0.5), this.du(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fL()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(blt<cca> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cfb $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bmk eS() {
      return bmk.c;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
