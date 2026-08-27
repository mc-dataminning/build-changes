import java.util.function.Predicate;

public abstract class cbz extends bme implements cbr {
   protected cbz(blj<? extends cbz> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public ard db() {
      return ard.f;
   }

   @Override
   public void d_() {
      this.eQ();
      this.gj();
      super.d_();
   }

   protected void gj() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected arb aN() {
      return arc.mk;
   }

   @Override
   protected arb aO() {
      return arc.mj;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.mh;
   }

   @Override
   protected arb n_() {
      return arc.mg;
   }

   @Override
   public blv.a eG() {
      return new blv.a(arc.mi, arc.mf);
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(ctn $$0, hv $$1, auf $$2) {
      if ($$0.a(cth.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dly $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cth.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.D().Z() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(blj<? extends cbz> $$0, ctn $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.aj() != bji.a && (blz.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(blj<? extends cbz> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.aj() != bji.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bna.a gk() {
      return blx.C().a(bnb.c);
   }

   @Override
   public boolean ec() {
      return true;
   }

   @Override
   protected boolean ed() {
      return true;
   }

   public boolean f(cer $$0) {
      return true;
   }

   @Override
   public cmh g(cmh $$0) {
      if ($$0.d() instanceof cmx) {
         Predicate<cmh> $$1 = ((cmx)$$0.d()).e();
         cmh $$2 = cmx.a(this, $$1);
         return $$2.b() ? new cmh(cmk.os) : $$2;
      } else {
         return cmh.f;
      }
   }
}
