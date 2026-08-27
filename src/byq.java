import org.joml.Vector3f;

public class byq extends byz {
   private static final int b = 2400;
   private int c;

   public byq(bik<? extends byq> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpm(this));
      this.bO.a(1, new bph(this, this.dK()));
      this.bO.a(2, new bqc(this, 1.0, false));
      this.bO.a(3, new brf(this, 1.0));
      this.bO.a(7, new bqa(this, cbl.class, 8.0F));
      this.bO.a(8, new bqn(this));
      this.bP.a(1, new brk(this).a());
      this.bP.a(2, new brl<>(this, cbl.class, true));
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 0.13F;
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.a, 8.0).a(bkd.d, 0.25).a(bkd.f, 2.0);
   }

   @Override
   protected big.b aU() {
      return big.b.c;
   }

   @Override
   protected aot r() {
      return aou.hi;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.hk;
   }

   @Override
   protected aot h_() {
      return aou.hj;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.hl, 0.15F, 1.0F);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dA();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.dK().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dK().a(iw.X, this.d(0.5), this.ds(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fH()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ak();
         }
      }
   }

   public static boolean b(bik<byq> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbl $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjb eQ() {
      return bjb.c;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
