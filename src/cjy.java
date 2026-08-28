import java.util.function.Predicate;

public abstract class cjy extends btt implements cjq {
   protected cjy(bsv<? extends cjy> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public avx de() {
      return avx.f;
   }

   @Override
   public void n_() {
      this.eV();
      this.gv();
      super.n_();
   }

   protected void gv() {
      float $$0 = this.bt();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected avv aP() {
      return avw.mY;
   }

   @Override
   protected avv aQ() {
      return avw.mX;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.mV;
   }

   @Override
   protected avv o_() {
      return avw.mU;
   }

   @Override
   public btk.a eL() {
      return new btk.a(avw.mW, avw.mT);
   }

   @Override
   public float a(iz $$0, dbw $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dci $$0, iz $$1, azc $$2) {
      if ($$0.a(dcc.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dvp $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dcc.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsv<? extends cjy> $$0, dci $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.al() != bqm.a && (bto.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsv<? extends cjy> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.al() != bqm.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bur.a gw() {
      return btm.A().a(bus.c);
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   protected boolean ei() {
      return true;
   }

   public boolean f(cms $$0) {
      return true;
   }

   @Override
   public cuk g(cuk $$0) {
      if ($$0.g() instanceof cvd) {
         Predicate<cuk> $$1 = ((cvd)$$0.g()).d();
         cuk $$2 = cvd.a(this, $$1);
         return $$2.e() ? new cuk(cun.ov) : $$2;
      } else {
         return cuk.l;
      }
   }
}
