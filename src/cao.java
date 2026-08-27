import javax.annotation.Nullable;

public class cao extends bkq implements bmd {
   private static final afo<Integer> c = afr.a(cao.class, afq.b);
   private static final afo<dhi> d = afr.a(cao.class, afq.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private blg g;

   public cao(bku<? extends cao> $$0, csa $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cao(csa $$0, double $$1, double $$2, double $$3, @Nullable blg $$4) {
      this(bku.aY, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.o(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.g = $$4;
   }

   @Override
   protected void b_() {
      this.an.a(c, 80);
      this.an.a(d, cvc.ck.o());
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.a;
   }

   @Override
   public boolean bt() {
      return !this.dI();
   }

   @Override
   public void l() {
      if (!this.aV()) {
         this.g(this.dq().b(0.0, -0.04, 0.0));
      }

      this.a(blm.a, this.dq());
      this.g(this.dq().a(0.98));
      if (this.aC()) {
         this.g(this.dq().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.s() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.am();
         if (!this.dN().B) {
            this.x();
         }
      } else {
         this.bg();
         if (this.dN().B) {
            this.dN().a(js.Z, this.ds(), this.du() + 0.5, this.dy(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void x() {
      float $$0 = 4.0F;
      this.dN().a(this, this.ds(), this.e(0.0625), this.dy(), 4.0F, csa.a.d);
   }

   @Override
   protected void b(rz $$0) {
      $$0.a("fuse", (short)this.s());
      $$0.a("block_state", so.a(this.u()));
   }

   @Override
   protected void a(rz $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(so.a(this.dN().a(jz.e), $$0.p("block_state")));
      }
   }

   @Nullable
   public blg q() {
      return this.g;
   }

   @Override
   public void w(bkq $$0) {
      super.w($$0);
      if ($$0 instanceof cao $$1) {
         this.g = $$1.g;
      }
   }

   @Override
   protected float a(bls $$0, bkr $$1) {
      return 0.15F;
   }

   public void b(int $$0) {
      this.an.b(c, $$0);
   }

   public int s() {
      return this.an.b(c);
   }

   public void c(dhi $$0) {
      this.an.b(d, $$0);
   }

   public dhi u() {
      return this.an.b(d);
   }
}
