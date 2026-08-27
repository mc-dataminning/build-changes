import org.joml.Vector3f;

public class byu extends bzd {
   private static final int b = 2400;
   private int c;

   public byu(bip<? extends byu> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpq(this));
      this.bO.a(1, new bpl(this, this.dK()));
      this.bO.a(2, new bqg(this, 1.0, false));
      this.bO.a(3, new brj(this, 1.0));
      this.bO.a(7, new bqe(this, cbp.class, 8.0F));
      this.bO.a(8, new bqr(this));
      this.bP.a(1, new bro(this).a());
      this.bP.a(2, new brp<>(this, cbp.class, true));
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 0.13F;
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.a, 8.0).a(bkh.d, 0.25).a(bkh.f, 2.0);
   }

   @Override
   protected bil.b aU() {
      return bil.b.c;
   }

   @Override
   protected aoy r() {
      return aoz.hi;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.hk;
   }

   @Override
   protected aoy h_() {
      return aoz.hj;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.hl, 0.15F, 1.0F);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(qu $$0) {
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
            this.dK().a(ix.X, this.d(0.5), this.ds(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
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

   public static boolean b(bip<byu> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbp $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjg eQ() {
      return bjg.c;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
