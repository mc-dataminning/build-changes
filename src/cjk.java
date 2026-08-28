import javax.annotation.Nullable;

public class cjk extends bsw implements buq {
   private static final akk<Integer> c = ako.a(cjk.class, akm.b);
   private static final akk<dse> d = ako.a(cjk.class, akm.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private btr g;

   public cjk(btc<? extends cjk> $$0, dca $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cjk(dca $$0, double $$1, double $$2, double $$3, @Nullable btr $$4) {
      this(btc.bc, $$0);
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
   protected void a(ako.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dfd.ck.o());
   }

   @Override
   protected bsw.b bb() {
      return bsw.b.a;
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
      this.a(btw.a, this.ds());
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
            this.dP().a(li.ae, this.du(), this.dw() + 0.5, this.dA(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dP().a(this, this.du(), this.e(0.0625), this.dA(), 4.0F, dca.a.d);
   }

   @Override
   protected void b(us $$0) {
      $$0.a("fuse", (short)this.u());
      $$0.a("block_state", vh.a(this.v()));
   }

   @Override
   protected void a(us $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(vh.a(this.dP().a(lq.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public btr p() {
      return this.g;
   }

   @Override
   public void w(bsw $$0) {
      super.w($$0);
      if ($$0 instanceof cjk $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int u() {
      return this.ao.a(c);
   }

   public void c(dse $$0) {
      this.ao.a(d, $$0);
   }

   public dse v() {
      return this.ao.a(d);
   }
}
