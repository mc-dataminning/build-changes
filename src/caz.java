import org.joml.Vector3f;

public class caz extends cbi {
   private static final int b = 2400;
   private int c;

   public caz(bku<? extends caz> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void B() {
      this.bO.a(1, new brv(this));
      this.bO.a(1, new brq(this, this.dN()));
      this.bO.a(2, new bsl(this, 1.0, false));
      this.bO.a(3, new bto(this, 1.0));
      this.bO.a(7, new bsj(this, cdu.class, 8.0F));
      this.bO.a(8, new bsw(this));
      this.bP.a(1, new btt(this).a());
      this.bP.a(2, new btu<>(this, cdu.class, true));
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 0.13F;
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.l, 8.0).a(bmm.m, 0.25).a(bmm.c, 2.0);
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.c;
   }

   @Override
   protected aqq y() {
      return aqr.hC;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.hE;
   }

   @Override
   protected aqq m_() {
      return aqr.hD;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.hF, 0.15F, 1.0F);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(rz $$0) {
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
   public void c_() {
      super.c_();
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(js.X, this.d(0.5), this.dv(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
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

   public static boolean b(bku<caz> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cdu $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bll eT() {
      return bll.c;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
