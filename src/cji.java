import javax.annotation.Nullable;

public class cji extends bsr implements bun {
   private static final ajw<Integer> c = aka.a(cji.class, ajy.b);
   private static final ajw<dtc> d = aka.a(cji.class, ajy.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private btn g;

   public cji(bsx<? extends cji> $$0, dcw $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cji(dcw $$0, double $$1, double $$2, double $$3, @Nullable btn $$4) {
      this(bsx.bc, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.g = $$4;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dga.ck.o());
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.a;
   }

   @Override
   public boolean bA() {
      return !this.dK();
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   @Override
   public void l() {
      this.bP();
      this.bb();
      this.a(bts.a, this.ds());
      this.i(this.ds().a(0.98));
      if (this.aF()) {
         this.i(this.ds().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.t() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.aq();
         if (!this.dP().B) {
            this.w();
         }
      } else {
         this.bm();
         if (this.dP().B) {
            this.dP().a(lm.ae, this.du(), this.dw() + 0.5, this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dP().a(this, this.du(), this.e(0.0625), this.dA(), 4.0F, dcw.a.d);
   }

   @Override
   protected void b(ub $$0) {
      $$0.a("fuse", (short)this.t());
      $$0.a("block_state", uq.a(this.v()));
   }

   @Override
   protected void a(ub $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uq.a(this.dP().a(lu.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public btn p() {
      return this.g;
   }

   @Override
   public void w(bsr $$0) {
      super.w($$0);
      if ($$0 instanceof cji $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int t() {
      return this.ao.a(c);
   }

   public void c(dtc $$0) {
      this.ao.a(d, $$0);
   }

   public dtc v() {
      return this.ao.a(d);
   }
}
