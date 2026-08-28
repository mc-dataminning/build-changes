import java.util.function.Predicate;

public abstract class cly extends bvp implements clq {
   protected cly(bus<? extends cly> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   public void d_() {
      this.eV();
      this.gr();
      super.d_();
   }

   protected void gr() {
      float $$0 = this.by();
      if ($$0 > 0.5F) {
         this.be += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected awm aV() {
      return awn.mX;
   }

   @Override
   protected awm aW() {
      return awn.mW;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.mU;
   }

   @Override
   protected awm n_() {
      return awn.mT;
   }

   @Override
   public bvh.a eL() {
      return new bvh.a(awn.mV, awn.mS);
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dgd $$0, jh $$1, azu $$2) {
      if ($$0.a(dfv.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dzq $$3 = $$0.F_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dfv.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ad() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bus<? extends cly> $$0, dgd $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.ak() != bsh.a && (bur.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bus<? extends cly> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.ak() != bsh.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bwo.a gs() {
      return bvj.C().a(bwp.c);
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected boolean en() {
      return true;
   }

   public boolean a(arp $$0, cou $$1) {
      return true;
   }

   @Override
   public cwm d(cwm $$0) {
      if ($$0.h() instanceof cxi) {
         Predicate<cwm> $$1 = ((cxi)$$0.h()).d();
         cwm $$2 = cxi.a(this, $$1);
         return $$2.f() ? new cwm(cwq.ox) : $$2;
      } else {
         return cwm.k;
      }
   }
}
