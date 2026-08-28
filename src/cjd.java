import javax.annotation.Nullable;

public class cjd extends bsp implements buj {
   private static final akg<Integer> c = akk.a(cjd.class, aki.b);
   private static final akg<drx> d = akk.a(cjd.class, aki.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private btk g;

   public cjd(bsv<? extends cjd> $$0, dbt $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cjd(dbt $$0, double $$1, double $$2, double $$3, @Nullable btk $$4) {
      this(bsv.bc, $$0);
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
   protected void a(akk.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dew.ck.n());
   }

   @Override
   protected bsp.b bb() {
      return bsp.b.a;
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
      this.a(btp.a, this.ds());
      this.h(this.ds().a(0.98));
      if (this.aE()) {
         this.h(this.ds().d(0.7, -0.5, 0.7));
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
            this.dP().a(lj.ae, this.du(), this.dw() + 0.5, this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dP().a(this, this.du(), this.e(0.0625), this.dA(), 4.0F, dbt.a.d);
   }

   @Override
   protected void b(ur $$0) {
      $$0.a("fuse", (short)this.u());
      $$0.a("block_state", vg.a(this.v()));
   }

   @Override
   protected void a(ur $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(vg.a(this.dP().a(lq.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public btk p() {
      return this.g;
   }

   @Override
   public void w(bsp $$0) {
      super.w($$0);
      if ($$0 instanceof cjd $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int u() {
      return this.ao.a(c);
   }

   public void c(drx $$0) {
      this.ao.a(d, $$0);
   }

   public drx v() {
      return this.ao.a(d);
   }
}
