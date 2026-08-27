import java.util.function.Predicate;

public abstract class byz extends bjf implements byr {
   protected byz(bik<? extends byz> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public aov da() {
      return aov.f;
   }

   @Override
   public void b_() {
      this.eO();
      this.ge();
      super.b_();
   }

   protected void ge() {
      float $$0 = this.bm();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean S() {
      return true;
   }

   @Override
   protected aot aL() {
      return aou.lw;
   }

   @Override
   protected aot aM() {
      return aou.lv;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.lt;
   }

   @Override
   protected aot h_() {
      return aou.ls;
   }

   @Override
   public biw.a eE() {
      return new biw.a(aou.lu, aou.lr);
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(cpz $$0, gv $$1, art $$2) {
      if ($$0.a(cpt.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dih $$3 = $$0.x_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cpt.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bik<? extends byz> $$0, cpz $$1, bja $$2, gv $$3, art $$4) {
      return $$1.ai() != bgl.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bik<? extends byz> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.ai() != bgl.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkc.a gf() {
      return biy.x().a(bkd.f);
   }

   @Override
   public boolean ea() {
      return true;
   }

   @Override
   protected boolean eb() {
      return true;
   }

   public boolean f(cbl $$0) {
      return true;
   }

   @Override
   public ciw g(ciw $$0) {
      if ($$0.d() instanceof cjm) {
         Predicate<ciw> $$1 = ((cjm)$$0.d()).e();
         ciw $$2 = cjm.a(this, $$1);
         return $$2.b() ? new ciw(ciz.nH) : $$2;
      } else {
         return ciw.b;
      }
   }
}
