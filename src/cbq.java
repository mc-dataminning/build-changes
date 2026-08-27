import org.joml.Vector3f;

public class cbq extends cbz {
   private static final int b = 2400;
   private int c;

   public cbq(blj<? extends cbq> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsl(this));
      this.bO.a(1, new bsg(this, this.dM()));
      this.bO.a(2, new btb(this, 1.0, false));
      this.bO.a(3, new bue(this, 1.0));
      this.bO.a(7, new bsz(this, cer.class, 8.0F));
      this.bO.a(8, new btm(this));
      this.bP.a(1, new buj(this).a());
      this.bP.a(2, new buk<>(this, cer.class, true));
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 0.13F;
   }

   public static bna.a u() {
      return cbz.gk().a(bnb.l, 8.0).a(bnb.m, 0.25).a(bnb.c, 2.0);
   }

   @Override
   protected blf.b aW() {
      return blf.b.c;
   }

   @Override
   protected arb y() {
      return arc.hL;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.hN;
   }

   @Override
   protected arb n_() {
      return arc.hM;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.hO, 0.15F, 1.0F);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dC();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jv.Z, this.d(0.5), this.du(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fL()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(blj<cbq> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cer $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bma eS() {
      return bma.c;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
