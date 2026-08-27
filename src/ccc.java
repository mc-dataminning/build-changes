import javax.annotation.Nullable;

public class ccc extends blw implements bnl {
   private static final agn<Integer> c = agq.a(ccc.class, agp.b);
   private static final agn<djp> d = agq.a(ccc.class, agp.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bmo g;

   public ccc(bmc<? extends ccc> $$0, ctx $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public ccc(ctx $$0, double $$1, double $$2, double $$3, @Nullable bmo $$4) {
      this(bmc.ba, $$0);
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
   protected void c_() {
      this.an.a(c, 80);
      this.an.a(d, cxa.ck.o());
   }

   @Override
   protected blw.b aW() {
      return blw.b.a;
   }

   @Override
   public boolean bt() {
      return !this.dG();
   }

   @Override
   public void l() {
      if (!this.aV()) {
         this.g(this.do().b(0.0, -0.04, 0.0));
      }

      this.a(bmu.a, this.do());
      this.g(this.do().a(0.98));
      if (this.aC()) {
         this.g(this.do().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.s() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.am();
         if (!this.dL().B) {
            this.x();
         }
      } else {
         this.bg();
         if (this.dL().B) {
            this.dL().a(jx.ab, this.dq(), this.ds() + 0.5, this.dw(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void x() {
      float $$0 = 4.0F;
      this.dL().a(this, this.dq(), this.e(0.0625), this.dw(), 4.0F, ctx.a.d);
   }

   @Override
   protected void b(so $$0) {
      $$0.a("fuse", (short)this.s());
      $$0.a("block_state", td.a(this.u()));
   }

   @Override
   protected void a(so $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(td.a(this.dL().a(ke.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bmo q() {
      return this.g;
   }

   @Override
   public void v(blw $$0) {
      super.v($$0);
      if ($$0 instanceof ccc $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.an.b(c, $$0);
   }

   public int s() {
      return this.an.b(c);
   }

   public void c(djp $$0) {
      this.an.b(d, $$0);
   }

   public djp u() {
      return this.an.b(d);
   }
}
