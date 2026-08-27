import javax.annotation.Nullable;

public class cih extends brv implements btm {
   private static final ajy<Integer> c = akc.a(cih.class, aka.b);
   private static final ajy<dtc> d = akc.a(cih.class, aka.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bso g;

   public cih(bsb<? extends cih> $$0, dca $$1) {
      super($$0, $$1);
      this.K = true;
   }

   public cih(dca $$0, double $$1, double $$2, double $$3, @Nullable bso $$4) {
      this(bsb.bf, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.A.j() * (float) (Math.PI * 2);
      this.o(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.M = $$1;
      this.N = $$2;
      this.O = $$3;
      this.g = $$4;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dfe.cV.n());
   }

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      this.be();
      this.a(bst.a, this.dx());
      this.g(this.dx().a(0.98));
      if (this.aE()) {
         this.g(this.dx().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.r() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.ao();
         if (!this.dU().C) {
            this.w();
         }
      } else {
         this.bp();
         if (this.dU().C) {
            this.dU().a(lb.ac, this.dz(), this.dB() + 0.5, this.dF(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dU().a(this, this.dz(), this.e(0.0625), this.dF(), 4.0F, dca.a.d);
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("fuse", (short)this.r());
      $$0.a("block_state", uz.a(this.u()));
   }

   @Override
   protected void a(uk $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uz.a(this.dU().a(li.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bso p() {
      return this.g;
   }

   @Override
   public void w(brv $$0) {
      super.w($$0);
      if ($$0 instanceof cih $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.as.a(c, $$0);
   }

   public int r() {
      return this.as.a(c);
   }

   public void c(dtc $$0) {
      this.as.a(d, $$0);
   }

   public dtc u() {
      return this.as.a(d);
   }
}
