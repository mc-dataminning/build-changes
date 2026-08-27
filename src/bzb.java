import java.util.function.Predicate;

public abstract class bzb extends bjh implements byt {
   protected bzb(bim<? extends bzb> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public aox da() {
      return aox.f;
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
   protected aov aL() {
      return aow.lw;
   }

   @Override
   protected aov aM() {
      return aow.lv;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.lt;
   }

   @Override
   protected aov h_() {
      return aow.ls;
   }

   @Override
   public biy.a eE() {
      return new biy.a(aow.lu, aow.lr);
   }

   @Override
   public float a(gu $$0, cpp $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(cqb $$0, gu $$1, aru $$2) {
      if ($$0.a(cpv.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dij $$3 = $$0.x_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cpv.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bim<? extends bzb> $$0, cqb $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.ai() != bgn.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bim<? extends bzb> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.ai() != bgn.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bke.a gf() {
      return bja.x().a(bkf.f);
   }

   @Override
   public boolean ea() {
      return true;
   }

   @Override
   protected boolean eb() {
      return true;
   }

   public boolean f(cbn $$0) {
      return true;
   }

   @Override
   public ciy g(ciy $$0) {
      if ($$0.d() instanceof cjo) {
         Predicate<ciy> $$1 = ((cjo)$$0.d()).e();
         ciy $$2 = cjo.a(this, $$1);
         return $$2.b() ? new ciy(cjb.nH) : $$2;
      } else {
         return ciy.b;
      }
   }
}
