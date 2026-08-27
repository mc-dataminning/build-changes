import javax.annotation.Nullable;

public class cgl extends bqa implements brr {
   private static final aja<Integer> c = aje.a(cgl.class, ajc.b);
   private static final aja<dpi> d = aje.a(cgl.class, ajc.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bqt g;

   public cgl(bqg<? extends cgl> $$0, czg $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cgl(czg $$0, double $$1, double $$2, double $$3, @Nullable bqt $$4) {
      this(bqg.bb, $$0);
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
   protected void a(aje.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dcj.ck.n());
   }

   @Override
   protected bqa.b aZ() {
      return bqa.b.a;
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
      this.a(bqy.a, this.dp());
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
            this.dM().a(kn.ac, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dM().a(this, this.dr(), this.e(0.0625), this.dx(), 4.0F, czg.a.d);
   }

   @Override
   protected void b(to $$0) {
      $$0.a("fuse", (short)this.r());
      $$0.a("block_state", ud.a(this.v()));
   }

   @Override
   protected void a(to $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(ud.a(this.dM().a(ku.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bqt p() {
      return this.g;
   }

   @Override
   public void w(bqa $$0) {
      super.w($$0);
      if ($$0 instanceof cgl $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.an.a(c, $$0);
   }

   public int r() {
      return this.an.a(c);
   }

   public void c(dpi $$0) {
      this.an.a(d, $$0);
   }

   public dpi v() {
      return this.an.a(d);
   }
}
