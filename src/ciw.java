import javax.annotation.Nullable;

public class ciw extends bsh implements bub {
   private static final ajp<Integer> c = ajt.a(ciw.class, ajr.b);
   private static final ajp<dsl> d = ajt.a(ciw.class, ajr.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private btc g;

   public ciw(bsn<? extends ciw> $$0, dcg $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public ciw(dcg $$0, double $$1, double $$2, double $$3, @Nullable btc $$4) {
      this(bsn.bc, $$0);
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
   protected void a(ajt.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dfk.ck.o());
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.a;
   }

   @Override
   public boolean bB() {
      return !this.dM();
   }

   @Override
   protected double ba() {
      return 0.04;
   }

   @Override
   public void l() {
      this.bc();
      this.a(bth.a, this.du());
      this.j(this.du().a(0.98));
      if (this.aG()) {
         this.j(this.du().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.t() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.aq();
         if (!this.dR().B) {
            this.w();
         }
      } else {
         this.bn();
         if (this.dR().B) {
            this.dR().a(lj.ae, this.dw(), this.dy() + 0.5, this.dC(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dR().a(this, this.dw(), this.e(0.0625), this.dC(), 4.0F, dcg.a.d);
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("fuse", (short)this.t());
      $$0.a("block_state", um.a(this.v()));
   }

   @Override
   protected void a(tx $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(um.a(this.dR().a(lr.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public btc p() {
      return this.g;
   }

   @Override
   public void w(bsh $$0) {
      super.w($$0);
      if ($$0 instanceof ciw $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int t() {
      return this.ao.a(c);
   }

   public void c(dsl $$0) {
      this.ao.a(d, $$0);
   }

   public dsl v() {
      return this.ao.a(d);
   }
}
