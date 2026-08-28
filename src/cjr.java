import java.util.function.Predicate;

public abstract class cjr extends btl implements cjj {
   protected cjr(bsn<? extends cjr> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   public void m_() {
      this.eT();
      this.gs();
      super.m_();
   }

   protected void gs() {
      float $$0 = this.bv();
      if ($$0 > 0.5F) {
         this.bg += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected avg aR() {
      return avh.mY;
   }

   @Override
   protected avg aS() {
      return avh.mX;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.mV;
   }

   @Override
   protected avg n_() {
      return avh.mU;
   }

   @Override
   public btc.a eJ() {
      return new btc.a(avh.mW, avh.mT);
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dcv $$0, ja $$1, ayo $$2) {
      if ($$0.a(dcp.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dwg $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dcp.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsn<? extends cjr> $$0, dcv $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqe.a && (btg.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsn<? extends cjr> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqe.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static buj.a gt() {
      return bte.A().a(buk.c);
   }

   @Override
   public boolean eg() {
      return true;
   }

   @Override
   protected boolean eh() {
      return true;
   }

   public boolean f(cml $$0) {
      return true;
   }

   @Override
   public cud g(cud $$0) {
      if ($$0.g() instanceof cuw) {
         Predicate<cud> $$1 = ((cuw)$$0.g()).d();
         cud $$2 = cuw.a(this, $$1);
         return $$2.e() ? new cud(cug.ow) : $$2;
      } else {
         return cud.l;
      }
   }
}
