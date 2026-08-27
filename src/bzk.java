import java.util.function.Predicate;

public abstract class bzk extends bjr implements bzc {
   protected bzk(biw<? extends bzk> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public apg da() {
      return apg.f;
   }

   @Override
   public void b_() {
      this.eP();
      this.gi();
      super.b_();
   }

   protected void gi() {
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
   protected ape aL() {
      return apf.lw;
   }

   @Override
   protected ape aM() {
      return apf.lv;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.lt;
   }

   @Override
   protected ape l_() {
      return apf.ls;
   }

   @Override
   public bji.a eF() {
      return new bji.a(apf.lu, apf.lr);
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(cqm $$0, gw $$1, ase $$2) {
      if ($$0.a(cqg.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         diu $$3 = $$0.C_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cqg.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(biw<? extends bzk> $$0, cqm $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.ai() != bgx.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(biw<? extends bzk> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.ai() != bgx.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkn.a gj() {
      return bjk.A().a(bko.f);
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   protected boolean ec() {
      return true;
   }

   public boolean f(cbw $$0) {
      return true;
   }

   @Override
   public cjh g(cjh $$0) {
      if ($$0.d() instanceof cjx) {
         Predicate<cjh> $$1 = ((cjx)$$0.d()).e();
         cjh $$2 = cjx.a(this, $$1);
         return $$2.b() ? new cjh(cjk.nH) : $$2;
      } else {
         return cjh.b;
      }
   }
}
