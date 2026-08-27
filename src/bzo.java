import java.util.function.Predicate;

public abstract class bzo extends bjv implements bzg {
   protected bzo(bja<? extends bzo> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public aph da() {
      return aph.f;
   }

   @Override
   public void b_() {
      this.eP();
      this.gj();
      super.b_();
   }

   protected void gj() {
      float $$0 = this.bm();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean V() {
      return true;
   }

   @Override
   protected apf aL() {
      return apg.lw;
   }

   @Override
   protected apf aM() {
      return apg.lv;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.lt;
   }

   @Override
   protected apf l_() {
      return apg.ls;
   }

   @Override
   public bjm.a eF() {
      return new bjm.a(apg.lu, apg.lr);
   }

   @Override
   public float a(gw $$0, cqe $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(cqq $$0, gw $$1, ash $$2) {
      if ($$0.a(cqk.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dim $$3 = $$0.C_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cqk.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bja<? extends bzo> $$0, cqq $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.ai() != bhb.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bja<? extends bzo> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.ai() != bhb.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkr.a gk() {
      return bjo.A().a(bks.c);
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   protected boolean ec() {
      return true;
   }

   public boolean f(cca $$0) {
      return true;
   }

   @Override
   public cjl g(cjl $$0) {
      if ($$0.d() instanceof ckb) {
         Predicate<cjl> $$1 = ((ckb)$$0.d()).e();
         cjl $$2 = ckb.a(this, $$1);
         return $$2.b() ? new cjl(cjo.nH) : $$2;
      } else {
         return cjl.b;
      }
   }
}
