import javax.annotation.Nullable;

public class cfe extends bow implements bqm {
   private static final aim<Integer> c = aiq.a(cfe.class, aio.b);
   private static final aim<dmz> d = aiq.a(cfe.class, aio.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bpo g;

   public cfe(bpc<? extends cfe> $$0, cwz $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cfe(cwz $$0, double $$1, double $$2, double $$3, @Nullable bpo $$4) {
      this(bpc.bb, $$0);
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
   protected void a(aiq.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dac.ck.o());
   }

   @Override
   protected bow.b aZ() {
      return bow.b.a;
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
      this.a(bpt.a, this.dp());
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
            this.dM().a(kc.ac, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dM().a(this, this.dr(), this.e(0.0625), this.dx(), 4.0F, cwz.a.d);
   }

   @Override
   protected void b(ta $$0) {
      $$0.a("fuse", (short)this.r());
      $$0.a("block_state", tp.a(this.s()));
   }

   @Override
   protected void a(ta $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(tp.a(this.dM().a(kj.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bpo p() {
      return this.g;
   }

   @Override
   public void w(bow $$0) {
      super.w($$0);
      if ($$0 instanceof cfe $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.an.a(c, $$0);
   }

   public int r() {
      return this.an.a(c);
   }

   public void c(dmz $$0) {
      this.an.a(d, $$0);
   }

   public dmz s() {
      return this.an.a(d);
   }
}
