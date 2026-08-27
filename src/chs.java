import javax.annotation.Nullable;

public class chs extends brh implements bsy {
   private static final ajm<Integer> c = ajq.a(chs.class, ajo.b);
   private static final ajm<dqh> d = ajq.a(chs.class, ajo.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bsa g;

   public chs(brn<? extends chs> $$0, dad $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public chs(dad $$0, double $$1, double $$2, double $$3, @Nullable bsa $$4) {
      this(brn.bb, $$0);
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
   protected void a(ajq.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, ddg.ck.n());
   }

   @Override
   protected brh.b aZ() {
      return brh.b.a;
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
      this.a(bsf.a, this.dq());
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
            this.dN().a(kx.ab, this.ds(), this.du() + 0.5, this.dy(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dN().a(this, this.ds(), this.e(0.0625), this.dy(), 4.0F, dad.a.d);
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("fuse", (short)this.r());
      $$0.a("block_state", up.a(this.v()));
   }

   @Override
   protected void a(ua $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(up.a(this.dN().a(le.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bsa p() {
      return this.g;
   }

   @Override
   public void w(brh $$0) {
      super.w($$0);
      if ($$0 instanceof chs $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int r() {
      return this.ao.a(c);
   }

   public void c(dqh $$0) {
      this.ao.a(d, $$0);
   }

   public dqh v() {
      return this.ao.a(d);
   }
}
