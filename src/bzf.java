import org.joml.Vector3f;

public class bzf extends bzo {
   private static final int b = 2400;
   private int c;

   public bzf(bja<? extends bzf> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqb(this));
      this.bO.a(1, new bpw(this, this.dL()));
      this.bO.a(2, new bqr(this, 1.0, false));
      this.bO.a(3, new bru(this, 1.0));
      this.bO.a(7, new bqp(this, cca.class, 8.0F));
      this.bO.a(8, new brc(this));
      this.bP.a(1, new brz(this).a());
      this.bP.a(2, new bsa<>(this, cca.class, true));
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 0.13F;
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.l, 8.0).a(bks.m, 0.25).a(bks.c, 2.0);
   }

   @Override
   protected biw.b aU() {
      return biw.b.c;
   }

   @Override
   protected apf w() {
      return apg.hi;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.hk;
   }

   @Override
   protected apf l_() {
      return apg.hj;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.hl, 0.15F, 1.0F);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dB();
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
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(iv.X, this.d(0.5), this.dt(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fL()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ak();
         }
      }
   }

   public static boolean b(bja<bzf> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cca $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjr eR() {
      return bjr.c;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
