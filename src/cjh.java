import javax.annotation.Nullable;

public class cjh extends bst implements bun {
   private static final akj<Integer> c = akn.a(cjh.class, akl.b);
   private static final akj<dsb> d = akn.a(cjh.class, akl.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private bto g;

   public cjh(bsz<? extends cjh> $$0, dbx $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cjh(dbx $$0, double $$1, double $$2, double $$3, @Nullable bto $$4) {
      this(bsz.bc, $$0);
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
      $$0.a(d, dfa.ck.o());
   }

   @Override
   protected bst.b bb() {
      return bst.b.a;
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
      this.a(btt.a, this.ds());
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
      this.dP().a(this, this.du(), this.e(0.0625), this.dA(), 4.0F, dbx.a.d);
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
   public bto p() {
      return this.g;
   }

   @Override
   public void w(bst $$0) {
      super.w($$0);
      if ($$0 instanceof cjh $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int u() {
      return this.ao.a(c);
   }

   public void c(dsb $$0) {
      this.ao.a(d, $$0);
   }

   public dsb v() {
      return this.ao.a(d);
   }
}
