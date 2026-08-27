import javax.annotation.Nullable;

public class cdx extends bnq implements bpg {
   private static final aie<Integer> c = aih.a(cdx.class, aig.b);
   private static final aie<dlj> d = aih.a(cdx.class, aig.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private boi g;

   public cdx(bnw<? extends cdx> $$0, cvr $$1) {
      super($$0, $$1);
      this.H = true;
   }

   public cdx(cvr $$0, double $$1, double $$2, double $$3, @Nullable boi $$4) {
      this(bnw.ba, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.o(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
      this.g = $$4;
   }

   @Override
   protected void c_() {
      this.am.a(c, 80);
      this.am.a(d, cyu.ck.o());
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.a;
   }

   @Override
   public boolean bt() {
      return !this.dH();
   }

   @Override
   public void l() {
      if (!this.aV()) {
         this.g(this.dp().b(0.0, -0.04, 0.0));
      }

      this.a(bon.a, this.dp());
      this.g(this.dp().a(0.98));
      if (this.aC()) {
         this.g(this.dp().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.s() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.am();
         if (!this.dM().B) {
            this.x();
         }
      } else {
         this.bg();
         if (this.dM().B) {
            this.dM().a(jz.ab, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void x() {
      float $$0 = 4.0F;
      this.dM().a(this, this.dr(), this.e(0.0625), this.dx(), 4.0F, cvr.a.d);
   }

   @Override
   protected void b(sw $$0) {
      $$0.a("fuse", (short)this.s());
      $$0.a("block_state", tl.a(this.u()));
   }

   @Override
   protected void a(sw $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(tl.a(this.dM().a(kg.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public boi q() {
      return this.g;
   }

   @Override
   public void v(bnq $$0) {
      super.v($$0);
      if ($$0 instanceof cdx $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.am.b(c, $$0);
   }

   public int s() {
      return this.am.b(c);
   }

   public void c(dlj $$0) {
      this.am.b(d, $$0);
   }

   public dlj u() {
      return this.am.b(d);
   }
}
