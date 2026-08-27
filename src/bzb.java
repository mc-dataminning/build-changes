import org.joml.Vector3f;

public class bzb extends bzk {
   private static final int b = 2400;
   private int c;

   public bzb(biw<? extends bzb> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpx(this));
      this.bO.a(1, new bps(this, this.dL()));
      this.bO.a(2, new bqn(this, 1.0, false));
      this.bO.a(3, new brq(this, 1.0));
      this.bO.a(7, new bql(this, cbw.class, 8.0F));
      this.bO.a(8, new bqy(this));
      this.bP.a(1, new brv(this).a());
      this.bP.a(2, new brw<>(this, cbw.class, true));
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 0.13F;
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.a, 8.0).a(bko.d, 0.25).a(bko.f, 2.0);
   }

   @Override
   protected bis.b aU() {
      return bis.b.c;
   }

   @Override
   protected ape w() {
      return apf.hi;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.hk;
   }

   @Override
   protected ape l_() {
      return apf.hj;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.hl, 0.15F, 1.0F);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dB();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(ix.X, this.d(0.5), this.dt(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fK()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ak();
         }
      }
   }

   public static boolean b(biw<bzb> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbw $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjn eR() {
      return bjn.c;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
