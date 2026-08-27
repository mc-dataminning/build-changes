import javax.annotation.Nullable;

public class cag extends bki implements blv {
   private static final afm<Integer> c = afp.a(cag.class, afo.b);
   private static final afm<dgw> d = afp.a(cag.class, afo.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bky g;

   public cag(bkm<? extends cag> $$0, crs $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cag(crs $$0, double $$1, double $$2, double $$3, @Nullable bky $$4) {
      this(bkm.aY, $$0);
      this.e($$1, $$2, $$3);
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
      this.an.a(d, cuv.ck.o());
   }

   @Override
   protected bki.b aU() {
      return bki.b.a;
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

      this.a(ble.a, this.do());
      this.f(this.do().a(0.98));
      if (this.aA()) {
         this.f(this.do().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.s() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.ak();
         if (!this.dL().B) {
            this.w();
         }
      } else {
         this.be();
         if (this.dL().B) {
            this.dL().a(js.Z, this.dq(), this.ds() + 0.5, this.dw(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dL().a(this, this.dq(), this.e(0.0625), this.dw(), 4.0F, crs.a.d);
   }

   @Override
   protected void b(rz $$0) {
      $$0.a("fuse", (short)this.s());
      $$0.a("block_state", so.a(this.t()));
   }

   @Override
   protected void a(rz $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(so.a(this.dL().a(jz.e), $$0.p("block_state")));
      }
   }

   @Nullable
   public bky q() {
      return this.g;
   }

   @Override
   public void w(bki $$0) {
      super.w($$0);
      if ($$0 instanceof cag $$1) {
         this.g = $$1.g;
      }
   }

   @Override
   protected float a(blk $$0, bkj $$1) {
      return 0.15F;
   }

   public void b(int $$0) {
      this.an.b(c, $$0);
   }

   public int s() {
      return this.an.b(c);
   }

   public void c(dgw $$0) {
      this.an.b(d, $$0);
   }

   public dgw t() {
      return this.an.b(d);
   }
}
