import java.util.function.Predicate;

public abstract class ckf extends bua implements cjx {
   protected ckf(btc<? extends ckf> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awb de() {
      return awb.f;
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
   protected avz aP() {
      return awa.mY;
   }

   @Override
   protected avz aQ() {
      return awa.mX;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.mV;
   }

   @Override
   protected avz o_() {
      return awa.mU;
   }

   @Override
   public btr.a eL() {
      return new btr.a(awa.mW, awa.mT);
   }

   @Override
   public float a(iz $$0, dcd $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dcp $$0, iz $$1, azh $$2) {
      if ($$0.a(dcj.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dvw $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dcj.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(btc<? extends ckf> $$0, dcp $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.al() != bqt.a && (btv.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(btc<? extends ckf> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.al() != bqt.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static buy.a gw() {
      return btt.A().a(buz.c);
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   protected boolean ei() {
      return true;
   }

   public boolean f(cmz $$0) {
      return true;
   }

   @Override
   public cur g(cur $$0) {
      if ($$0.g() instanceof cvk) {
         Predicate<cur> $$1 = ((cvk)$$0.g()).d();
         cur $$2 = cvk.a(this, $$1);
         return $$2.e() ? new cur(cuu.ov) : $$2;
      } else {
         return cur.l;
      }
   }
}
