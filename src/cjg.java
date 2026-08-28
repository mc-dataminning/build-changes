import javax.annotation.Nullable;

public class cjg extends bsq implements bul {
   private static final ajv<Integer> c = ajz.a(cjg.class, ajx.b);
   private static final ajv<dta> d = ajz.a(cjg.class, ajx.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private btl g;

   public cjg(bsw<? extends cjg> $$0, dcu $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cjg(dcu $$0, double $$1, double $$2, double $$3, @Nullable btl $$4) {
      this(bsw.bc, $$0);
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
   protected void a(ajz.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dfy.ck.o());
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.a;
   }

   @Override
   public boolean bA() {
      return !this.dL();
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   @Override
   public void l() {
      this.bb();
      this.a(btq.a, this.dt());
      this.i(this.dt().a(0.98));
      if (this.aF()) {
         this.i(this.dt().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.t() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.aq();
         if (!this.dQ().B) {
            this.w();
         }
      } else {
         this.bm();
         if (this.dQ().B) {
            this.dQ().a(lm.ae, this.dv(), this.dx() + 0.5, this.dB(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dQ().a(this, this.dv(), this.e(0.0625), this.dB(), 4.0F, dcu.a.d);
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("fuse", (short)this.t());
      $$0.a("block_state", up.a(this.v()));
   }

   @Override
   protected void a(ua $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(up.a(this.dQ().a(lu.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public btl p() {
      return this.g;
   }

   @Override
   public void w(bsq $$0) {
      super.w($$0);
      if ($$0 instanceof cjg $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int t() {
      return this.ao.a(c);
   }

   public void c(dta $$0) {
      this.ao.a(d, $$0);
   }

   public dta v() {
      return this.ao.a(d);
   }
}
