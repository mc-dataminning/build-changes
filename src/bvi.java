import javax.annotation.Nullable;

public class bvi extends bfj implements bgx {
   private static final aby<Integer> b = acb.a(bvi.class, aca.b);
   private static final int c = 80;
   @Nullable
   private bfz d;

   public bvi(bfn<? extends bvi> $$0, cmm $$1) {
      super($$0, $$1);
      this.H = true;
   }

   public bvi(cmm $$0, double $$1, double $$2, double $$3, @Nullable bfz $$4) {
      this(bfn.aY, $$0);
      this.e($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.o(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
      this.d = $$4;
   }

   @Override
   protected void a_() {
      this.am.a(b, 80);
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.a;
   }

   @Override
   public boolean bo() {
      return !this.dD();
   }

   @Override
   public void l() {
      if (!this.aR()) {
         this.f(this.dl().b(0.0, -0.04, 0.0));
      }

      this.a(bgf.a, this.dl());
      this.f(this.dl().a(0.98));
      if (this.ay()) {
         this.f(this.dl().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.k() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.ai();
         if (!this.dI().B) {
            this.o();
         }
      } else {
         this.bb();
         if (this.dI().B) {
            this.dI().a(iv.Z, this.dn(), this.dp() + 0.5, this.dt(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void o() {
      float $$0 = 4.0F;
      this.dI().a(this, this.dn(), this.e(0.0625), this.dt(), 4.0F, cmm.a.d);
   }

   @Override
   protected void b(qr $$0) {
      $$0.a("Fuse", (short)this.k());
   }

   @Override
   protected void a(qr $$0) {
      this.b($$0.g("Fuse"));
   }

   @Nullable
   public bfz j() {
      return this.d;
   }

   @Override
   protected float a(bgl $$0, bfk $$1) {
      return 0.15F;
   }

   public void b(int $$0) {
      this.am.b(b, $$0);
   }

   public int k() {
      return this.am.b(b);
   }
}
