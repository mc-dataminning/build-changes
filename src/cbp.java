import javax.annotation.Nullable;

public class cbp extends blp implements bnc {
   private static final agj<Integer> c = agm.a(cbp.class, agl.b);
   private static final agj<dja> d = agm.a(cbp.class, agl.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bmf g;

   public cbp(blt<? extends cbp> $$0, cti $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cbp(cti $$0, double $$1, double $$2, double $$3, @Nullable bmf $$4) {
      this(blt.aZ, $$0);
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
      this.an.a(d, cwl.ck.o());
   }

   @Override
   protected blp.b aW() {
      return blp.b.a;
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

      this.a(bml.a, this.dp());
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
      this.dM().a(this, this.dr(), this.e(0.0625), this.dx(), 4.0F, cti.a.d);
   }

   @Override
   protected void b(sl $$0) {
      $$0.a("fuse", (short)this.s());
      $$0.a("block_state", ta.a(this.u()));
   }

   @Override
   protected void a(sl $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(ta.a(this.dM().a(ke.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bmf q() {
      return this.g;
   }

   @Override
   public void w(blp $$0) {
      super.w($$0);
      if ($$0 instanceof cbp $$1) {
         this.g = $$1.g;
      }
   }

   @Override
   protected float a(bmr $$0, blq $$1) {
      return 0.15F;
   }

   public void b(int $$0) {
      this.an.b(c, $$0);
   }

   public int s() {
      return this.an.b(c);
   }

   public void c(dja $$0) {
      this.an.b(d, $$0);
   }

   public dja u() {
      return this.an.b(d);
   }
}
