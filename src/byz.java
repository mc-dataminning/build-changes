import org.joml.Vector3f;

public class byz extends bzi {
   private static final int b = 2400;
   private int c;

   public byz(biu<? extends byz> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpv(this));
      this.bO.a(1, new bpq(this, this.dL()));
      this.bO.a(2, new bql(this, 1.0, false));
      this.bO.a(3, new bro(this, 1.0));
      this.bO.a(7, new bqj(this, cbu.class, 8.0F));
      this.bO.a(8, new bqw(this));
      this.bP.a(1, new brt(this).a());
      this.bP.a(2, new bru<>(this, cbu.class, true));
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 0.13F;
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.a, 8.0).a(bkm.d, 0.25).a(bkm.f, 2.0);
   }

   @Override
   protected biq.b aU() {
      return biq.b.c;
   }

   @Override
   protected apd w() {
      return ape.hi;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.hk;
   }

   @Override
   protected apd l_() {
      return ape.hj;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.hl, 0.15F, 1.0F);
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

   public static boolean b(biu<byz> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbu $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjl eR() {
      return bjl.c;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
