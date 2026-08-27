import javax.annotation.Nullable;

public class cbv extends blv implements bni {
   private static final agm<Integer> c = agp.a(cbv.class, ago.b);
   private static final agm<djh> d = agp.a(cbv.class, ago.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bml g;

   public cbv(blz<? extends cbv> $$0, ctp $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cbv(ctp $$0, double $$1, double $$2, double $$3, @Nullable bml $$4) {
      this(blz.aZ, $$0);
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
      this.an.a(d, cws.ck.o());
   }

   @Override
   protected blv.b aW() {
      return blv.b.a;
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

      this.a(bmr.a, this.dp());
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
            this.dM().a(jx.ab, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void x() {
      float $$0 = 4.0F;
      this.dM().a(this, this.dr(), this.e(0.0625), this.dx(), 4.0F, ctp.a.d);
   }

   @Override
   protected void b(sn $$0) {
      $$0.a("fuse", (short)this.s());
      $$0.a("block_state", tc.a(this.u()));
   }

   @Override
   protected void a(sn $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(tc.a(this.dM().a(ke.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bml q() {
      return this.g;
   }

   @Override
   public void w(blv $$0) {
      super.w($$0);
      if ($$0 instanceof cbv $$1) {
         this.g = $$1.g;
      }
   }

   @Override
   protected float a(bmx $$0, blw $$1) {
      return 0.15F;
   }

   public void b(int $$0) {
      this.an.b(c, $$0);
   }

   public int s() {
      return this.an.b(c);
   }

   public void c(djh $$0) {
      this.an.b(d, $$0);
   }

   public djh u() {
      return this.an.b(d);
   }
}
