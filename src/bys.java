import org.joml.Vector3f;

public class bys extends bzb {
   private static final int b = 2400;
   private int c;

   public bys(bim<? extends bys> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpo(this));
      this.bO.a(1, new bpj(this, this.dK()));
      this.bO.a(2, new bqe(this, 1.0, false));
      this.bO.a(3, new brh(this, 1.0));
      this.bO.a(7, new bqc(this, cbn.class, 8.0F));
      this.bO.a(8, new bqp(this));
      this.bP.a(1, new brm(this).a());
      this.bP.a(2, new brn<>(this, cbn.class, true));
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 0.13F;
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.a, 8.0).a(bkf.d, 0.25).a(bkf.f, 2.0);
   }

   @Override
   protected bii.b aU() {
      return bii.b.c;
   }

   @Override
   protected aov r() {
      return aow.hi;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.hk;
   }

   @Override
   protected aov h_() {
      return aow.hj;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.hl, 0.15F, 1.0F);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(qr $$0) {
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
            this.dK().a(iv.X, this.d(0.5), this.ds(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
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

   public static boolean b(bim<bys> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbn $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjd eQ() {
      return bjd.c;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
