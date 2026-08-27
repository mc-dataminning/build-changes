import javax.annotation.Nullable;

public class cgw extends bql implements bsc {
   private static final ajk<Integer> c = ajo.a(cgw.class, ajm.b);
   private static final ajk<dpy> d = ajo.a(cgw.class, ajm.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bre g;

   public cgw(bqr<? extends cgw> $$0, czu $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cgw(czu $$0, double $$1, double $$2, double $$3, @Nullable bre $$4) {
      this(bqr.bb, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.o(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.g = $$4;
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dcx.ck.n());
   }

   @Override
   protected bql.b aZ() {
      return bql.b.a;
   }

   @Override
   public boolean bx() {
      return !this.dI();
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   @Override
   public void l() {
      this.aY();
      this.a(brj.a, this.dq());
      this.g(this.dq().a(0.98));
      if (this.aC()) {
         this.g(this.dq().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.r() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.am();
         if (!this.dN().B) {
            this.w();
         }
      } else {
         this.bj();
         if (this.dN().B) {
            this.dN().a(kw.ab, this.ds(), this.du() + 0.5, this.dy(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dN().a(this, this.ds(), this.e(0.0625), this.dy(), 4.0F, czu.a.d);
   }

   @Override
   protected void b(ty $$0) {
      $$0.a("fuse", (short)this.r());
      $$0.a("block_state", un.a(this.v()));
   }

   @Override
   protected void a(ty $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(un.a(this.dN().a(ld.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bre p() {
      return this.g;
   }

   @Override
   public void w(bql $$0) {
      super.w($$0);
      if ($$0 instanceof cgw $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int r() {
      return this.ao.a(c);
   }

   public void c(dpy $$0) {
      this.ao.a(d, $$0);
   }

   public dpy v() {
      return this.ao.a(d);
   }
}
