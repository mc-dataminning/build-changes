import javax.annotation.Nullable;

public class cjg extends bss implements bum {
   private static final akj<Integer> c = akn.a(cjg.class, akl.b);
   private static final akj<dsa> d = akn.a(cjg.class, akl.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private btn g;

   public cjg(bsy<? extends cjg> $$0, dbw $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cjg(dbw $$0, double $$1, double $$2, double $$3, @Nullable btn $$4) {
      this(bsy.bc, $$0);
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
   protected void a(akn.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dez.ck.o());
   }

   @Override
   protected bss.b bb() {
      return bss.b.a;
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
      this.a(bts.a, this.ds());
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
      this.dP().a(this, this.du(), this.e(0.0625), this.dA(), 4.0F, dbw.a.d);
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
   public btn p() {
      return this.g;
   }

   @Override
   public void w(bss $$0) {
      super.w($$0);
      if ($$0 instanceof cjg $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int u() {
      return this.ao.a(c);
   }

   public void c(dsa $$0) {
      this.ao.a(d, $$0);
   }

   public dsa v() {
      return this.ao.a(d);
   }
}
