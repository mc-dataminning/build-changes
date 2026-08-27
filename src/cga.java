import java.util.function.Predicate;

public abstract class cga extends bpx implements cfs {
   protected cga(bpd<? extends cga> $$0, cxb $$1) {
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
      return aty.mH;
   }

   @Override
   protected atx aO() {
      return aty.mG;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.mE;
   }

   @Override
   protected atx n_() {
      return aty.mD;
   }

   @Override
   public bpp.a eI() {
      return new bpp.a(aty.mF, aty.mC);
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(cxq $$0, ib $$1, axd $$2) {
      if ($$0.a(cxk.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dqo $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cxk.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bpd<? extends cga> $$0, cxq $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.aj() != bna.a && (bpt.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bpd<? extends cga> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.aj() != bna.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bqv.a gt() {
      return bpr.A().a(bqw.c);
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   protected boolean ef() {
      return true;
   }

   public boolean f(ciu $$0) {
      return true;
   }

   @Override
   public cqm g(cqm $$0) {
      if ($$0.d() instanceof crc) {
         Predicate<cqm> $$1 = ((crc)$$0.d()).d();
         cqm $$2 = crc.a(this, $$1);
         return $$2.b() ? new cqm(cqp.ou) : $$2;
      } else {
         return cqm.h;
      }
   }
}
