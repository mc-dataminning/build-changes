import java.util.function.Predicate;

public abstract class chg extends brb implements cgy {
   protected chg(bqg<? extends chg> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public aup db() {
      return aup.f;
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
   protected aun aN() {
      return auo.mJ;
   }

   @Override
   protected aun aO() {
      return auo.mI;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.mG;
   }

   @Override
   protected aun o_() {
      return auo.mF;
   }

   @Override
   public bqt.a eI() {
      return new bqt.a(auo.mH, auo.mE);
   }

   @Override
   public float a(id $$0, czj $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(czv $$0, id $$1, axt $$2) {
      if ($$0.a(czp.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dta $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(czp.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ab() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bqg<? extends chg> $$0, czv $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.ak() != boc.a && (bqx.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bqg<? extends chg> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.ak() != boc.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static brz.a gt() {
      return bqv.A().a(bsa.c);
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   protected boolean ef() {
      return true;
   }

   public boolean f(cka $$0) {
      return true;
   }

   @Override
   public crs g(crs $$0) {
      if ($$0.f() instanceof csi) {
         Predicate<crs> $$1 = ((csi)$$0.f()).d();
         crs $$2 = csi.a(this, $$1);
         return $$2.d() ? new crs(crv.ou) : $$2;
      } else {
         return crs.i;
      }
   }
}
