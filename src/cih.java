import javax.annotation.Nullable;

public class cih extends bru implements btn {
   private static final ajr<Integer> c = ajv.a(cih.class, ajt.b);
   private static final ajr<drb> d = ajv.a(cih.class, ajt.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bso g;

   public cih(bsa<? extends cih> $$0, dax $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cih(dax $$0, double $$1, double $$2, double $$3, @Nullable bso $$4) {
      this(bsa.bc, $$0);
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
   protected void a(ajv.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dea.ck.n());
   }

   @Override
   protected bru.b bb() {
      return bru.b.a;
   }

   @Override
   public boolean bz() {
      return !this.dK();
   }

   @Override
   protected double aY() {
      return 0.04;
   }

   @Override
   public void l() {
      this.ba();
      this.a(bst.a, this.ds());
      this.g(this.ds().a(0.98));
      if (this.aE()) {
         this.g(this.ds().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.u() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.ao();
         if (!this.dP().B) {
            this.w();
         }
      } else {
         this.bl();
         if (this.dP().B) {
            this.dP().a(ky.ae, this.du(), this.dw() + 0.5, this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dP().a(this, this.du(), this.e(0.0625), this.dA(), 4.0F, dax.a.d);
   }

   @Override
   protected void b(ud $$0) {
      $$0.a("fuse", (short)this.u());
      $$0.a("block_state", us.a(this.v()));
   }

   @Override
   protected void a(ud $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(us.a(this.dP().a(lf.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public bso p() {
      return this.g;
   }

   @Override
   public void w(bru $$0) {
      super.w($$0);
      if ($$0 instanceof cih $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int u() {
      return this.ao.a(c);
   }

   public void c(drb $$0) {
      this.ao.a(d, $$0);
   }

   public drb v() {
      return this.ao.a(d);
   }
}
