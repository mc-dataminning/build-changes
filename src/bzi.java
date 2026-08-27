import java.util.function.Predicate;

public abstract class bzi extends bjp implements bza {
   protected bzi(biu<? extends bzi> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public apf db() {
      return apf.f;
   }

   @Override
   public void b_() {
      this.eP();
      this.gi();
      super.b_();
   }

   protected void gi() {
      float $$0 = this.bn();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   protected apd aM() {
      return ape.lw;
   }

   @Override
   protected apd aN() {
      return ape.lv;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.lt;
   }

   @Override
   protected apd l_() {
      return ape.ls;
   }

   @Override
   public bjg.a eF() {
      return new bjg.a(ape.lu, ape.lr);
   }

   @Override
   public float a(gw $$0, cpy $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(cqk $$0, gw $$1, asc $$2) {
      if ($$0.a(cqe.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dis $$3 = $$0.C_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cqe.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(biu<? extends bzi> $$0, cqk $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.ai() != bgv.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(biu<? extends bzi> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.ai() != bgv.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkl.a gj() {
      return bji.A().a(bkm.f);
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   protected boolean ec() {
      return true;
   }

   public boolean f(cbu $$0) {
      return true;
   }

   @Override
   public cjf g(cjf $$0) {
      if ($$0.d() instanceof cjv) {
         Predicate<cjf> $$1 = ((cjv)$$0.d()).e();
         cjf $$2 = cjv.a(this, $$1);
         return $$2.b() ? new cjf(cji.nH) : $$2;
      } else {
         return cjf.b;
      }
   }
}
