import javax.annotation.Nullable;

public class byj extends bil implements bjy {
   private static final aec<Integer> b = aef.a(byj.class, aee.b);
   private static final int c = 80;
   @Nullable
   private bjb d;

   public byj(bip<? extends byj> $$0, cpq $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public byj(cpq $$0, double $$1, double $$2, double $$3, @Nullable bjb $$4) {
      this(bip.aY, $$0);
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
   protected bil.b aU() {
      return bil.b.a;
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

      this.a(bjh.a, this.dn());
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
            this.dK().a(ix.Z, this.dp(), this.dr() + 0.5, this.dv(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void o() {
      float $$0 = 4.0F;
      this.dK().a(this, this.dp(), this.e(0.0625), this.dv(), 4.0F, cpq.a.d);
   }

   @Override
   protected void b(qu $$0) {
      $$0.a("Fuse", (short)this.m());
   }

   @Override
   protected void a(qu $$0) {
      this.b($$0.g("Fuse"));
   }

   @Nullable
   public bjb j() {
      return this.d;
   }

   @Override
   protected float a(bjn $$0, bim $$1) {
      return 0.15F;
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   public int m() {
      return this.an.b(b);
   }
}
