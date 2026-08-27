import javax.annotation.Nullable;

public class bzr extends bjt implements blg {
   private static final afc<Integer> b = aff.a(bzr.class, afe.b);
   private static final int c = 80;
   @Nullable
   private bkj d;

   public bzr(bjx<? extends bzr> $$0, cqz $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public bzr(cqz $$0, double $$1, double $$2, double $$3, @Nullable bkj $$4) {
      this(bjx.aY, $$0);
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
   protected void b_() {
      this.an.a(b, 80);
   }

   @Override
   protected bjt.b aU() {
      return bjt.b.a;
   }

   @Override
   public boolean br() {
      return !this.dG();
   }

   @Override
   public void l() {
      if (!this.aT()) {
         this.f(this.do().b(0.0, -0.04, 0.0));
      }

      this.a(bkp.a, this.do());
      this.f(this.do().a(0.98));
      if (this.aA()) {
         this.f(this.do().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.s() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.ak();
         if (!this.dL().B) {
            this.t();
         }
      } else {
         this.be();
         if (this.dL().B) {
            this.dL().a(js.Z, this.dq(), this.ds() + 0.5, this.dw(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void t() {
      float $$0 = 4.0F;
      this.dL().a(this, this.dq(), this.e(0.0625), this.dw(), 4.0F, cqz.a.d);
   }

   @Override
   protected void b(rt $$0) {
      $$0.a("Fuse", (short)this.s());
   }

   @Override
   protected void a(rt $$0) {
      this.b($$0.g("Fuse"));
   }

   @Nullable
   public bkj q() {
      return this.d;
   }

   @Override
   public void w(bjt $$0) {
      super.w($$0);
      if ($$0 instanceof bzr $$1) {
         this.d = $$1.d;
      }
   }

   @Override
   protected float a(bkv $$0, bju $$1) {
      return 0.15F;
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   public int s() {
      return this.an.b(b);
   }
}
