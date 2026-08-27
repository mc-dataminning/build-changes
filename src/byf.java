import javax.annotation.Nullable;

public class byf extends big implements bju {
   private static final adx<Integer> b = aea.a(byf.class, adz.b);
   private static final int c = 80;
   @Nullable
   private biw d;

   public byf(bik<? extends byf> $$0, cpk $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public byf(cpk $$0, double $$1, double $$2, double $$3, @Nullable biw $$4) {
      this(bik.aY, $$0);
      this.e($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.o(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.d = $$4;
   }

   @Override
   protected void a_() {
      this.an.a(b, 80);
   }

   @Override
   protected big.b aU() {
      return big.b.a;
   }

   @Override
   public boolean br() {
      return !this.dF();
   }

   @Override
   public void l() {
      if (!this.aT()) {
         this.f(this.dn().b(0.0, -0.04, 0.0));
      }

      this.a(bjc.a, this.dn());
      this.f(this.dn().a(0.98));
      if (this.aA()) {
         this.f(this.dn().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.m() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.ak();
         if (!this.dK().B) {
            this.o();
         }
      } else {
         this.be();
         if (this.dK().B) {
            this.dK().a(iw.Z, this.dp(), this.dr() + 0.5, this.dv(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void o() {
      float $$0 = 4.0F;
      this.dK().a(this, this.dp(), this.e(0.0625), this.dv(), 4.0F, cpk.a.d);
   }

   @Override
   protected void b(qs $$0) {
      $$0.a("Fuse", (short)this.m());
   }

   @Override
   protected void a(qs $$0) {
      this.b($$0.g("Fuse"));
   }

   @Nullable
   public biw j() {
      return this.d;
   }

   @Override
   protected float a(bji $$0, bih $$1) {
      return 0.15F;
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   public int m() {
      return this.an.b(b);
   }
}
