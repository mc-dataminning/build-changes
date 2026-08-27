import java.util.function.Predicate;

public abstract class cgz extends bqw implements cgr {
   protected cgz(bqb<? extends cgz> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public aun db() {
      return aun.f;
   }

   @Override
   public void n_() {
      this.eS();
      this.gs();
      super.n_();
   }

   protected void gs() {
      float $$0 = this.br();
      if ($$0 > 0.5F) {
         this.be += 2;
      }
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   protected aul aN() {
      return aum.mJ;
   }

   @Override
   protected aul aO() {
      return aum.mI;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.mG;
   }

   @Override
   protected aul o_() {
      return aum.mF;
   }

   @Override
   public bqo.a eI() {
      return new bqo.a(aum.mH, aum.mE);
   }

   @Override
   public float a(ib $$0, cza $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(czm $$0, ib $$1, axr $$2) {
      if ($$0.a(czg.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dsr $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(czg.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ab() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bqb<? extends cgz> $$0, czm $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.ak() != bnx.a && (bqs.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bqb<? extends cgz> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.ak() != bnx.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bru.a gt() {
      return bqq.A().a(brv.c);
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   protected boolean ef() {
      return true;
   }

   public boolean f(cjt $$0) {
      return true;
   }

   @Override
   public crj g(crj $$0) {
      if ($$0.f() instanceof crz) {
         Predicate<crj> $$1 = ((crz)$$0.f()).d();
         crj $$2 = crz.a(this, $$1);
         return $$2.d() ? new crj(crm.ou) : $$2;
      } else {
         return crj.i;
      }
   }
}
