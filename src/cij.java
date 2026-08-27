import javax.annotation.Nullable;

public class cij extends brw implements btp {
   private static final ajs<Integer> c = ajw.a(cij.class, aju.b);
   private static final ajs<drd> d = ajw.a(cij.class, aju.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bsq g;

   public cij(bsc<? extends cij> $$0, daz $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cij(daz $$0, double $$1, double $$2, double $$3, @Nullable bsq $$4) {
      this(bsc.bc, $$0);
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
   protected void a(ajw.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dec.ck.n());
   }

   @Override
   protected brw.b bb() {
      return brw.b.a;
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
      this.a(bsv.a, this.ds());
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
      this.dP().a(this, this.du(), this.e(0.0625), this.dA(), 4.0F, daz.a.d);
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
   public bsq p() {
      return this.g;
   }

   @Override
   public void w(brw $$0) {
      super.w($$0);
      if ($$0 instanceof cij $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int u() {
      return this.ao.a(c);
   }

   public void c(drd $$0) {
      this.ao.a(d, $$0);
   }

   public drd v() {
      return this.ao.a(d);
   }
}
