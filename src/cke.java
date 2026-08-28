import java.util.function.Predicate;

public abstract class cke extends btz implements cjw {
   protected cke(btb<? extends cke> $$0, dbz $$1) {
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
   protected avz d(bro $$0) {
      return awa.mV;
   }

   @Override
   protected avz o_() {
      return awa.mU;
   }

   @Override
   public btq.a eL() {
      return new btq.a(awa.mW, awa.mT);
   }

   @Override
   public float a(iz $$0, dcc $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dco $$0, iz $$1, azh $$2) {
      if ($$0.a(dci.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dvv $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dci.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(btb<? extends cke> $$0, dco $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.al() != bqs.a && (btu.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(btb<? extends cke> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.al() != bqs.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bux.a gw() {
      return bts.A().a(buy.c);
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   protected boolean ei() {
      return true;
   }

   public boolean f(cmy $$0) {
      return true;
   }

   @Override
   public cuq g(cuq $$0) {
      if ($$0.g() instanceof cvj) {
         Predicate<cuq> $$1 = ((cvj)$$0.g()).d();
         cuq $$2 = cvj.a(this, $$1);
         return $$2.e() ? new cuq(cut.ov) : $$2;
      } else {
         return cuq.l;
      }
   }
}
