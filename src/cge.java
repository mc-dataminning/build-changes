import javax.annotation.Nullable;

public class cge extends bpv implements brm {
   private static final aiy<Integer> c = ajc.a(cge.class, aja.b);
   private static final aiy<doz> d = ajc.a(cge.class, aja.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bqo g;

   public cge(bqb<? extends cge> $$0, cyx $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cge(cyx $$0, double $$1, double $$2, double $$3, @Nullable bqo $$4) {
      this(bqb.bb, $$0);
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
   protected void a(ajc.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dca.ck.n());
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.a;
   }

   @Override
   public boolean bw() {
      return !this.dH();
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   @Override
   public void l() {
      this.aY();
      this.a(bqt.a, this.dp());
      this.g(this.dp().a(0.98));
      if (this.aC()) {
         this.g(this.dp().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.r() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.am();
         if (!this.dM().B) {
            this.w();
         }
      } else {
         this.bj();
         if (this.dM().B) {
            this.dM().a(kl.ac, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dM().a(this, this.dr(), this.e(0.0625), this.dx(), 4.0F, cyx.a.d);
   }

   @Override
   protected void b(tm $$0) {
      $$0.a("fuse", (short)this.r());
      $$0.a("block_state", ub.a(this.v()));
   }

   @Override
   protected void a(tm $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(ub.a(this.dM().a(ks.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bqo p() {
      return this.g;
   }

   @Override
   public void w(bpv $$0) {
      super.w($$0);
      if ($$0 instanceof cge $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.an.a(c, $$0);
   }

   public int r() {
      return this.an.a(c);
   }

   public void c(doz $$0) {
      this.an.a(d, $$0);
   }

   public doz v() {
      return this.an.a(d);
   }
}
