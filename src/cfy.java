import java.util.function.Predicate;

public abstract class cfy extends bpw implements cfq {
   protected cfy(bpc<? extends cfy> $$0, cwz $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   public void m_() {
      this.eS();
      this.gs();
      super.m_();
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
   protected atx aN() {
      return aty.mD;
   }

   @Override
   protected atx aO() {
      return aty.mC;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.mA;
   }

   @Override
   protected atx n_() {
      return aty.mz;
   }

   @Override
   public bpo.a eI() {
      return new bpo.a(aty.mB, aty.my);
   }

   @Override
   public float a(ib $$0, cxc $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(cxo $$0, ib $$1, axd $$2) {
      if ($$0.a(cxi.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dqm $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cxi.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bpc<? extends cfy> $$0, cxo $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.aj() != bmz.a && (bps.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bpc<? extends cfy> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.aj() != bmz.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bqu.a gt() {
      return bpq.A().a(bqv.c);
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   protected boolean ef() {
      return true;
   }

   public boolean f(cis $$0) {
      return true;
   }

   @Override
   public cqk g(cqk $$0) {
      if ($$0.d() instanceof cra) {
         Predicate<cqk> $$1 = ((cra)$$0.d()).d();
         cqk $$2 = cra.a(this, $$1);
         return $$2.b() ? new cqk(cqn.ou) : $$2;
      } else {
         return cqk.h;
      }
   }
}
