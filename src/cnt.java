import java.util.function.Predicate;

public abstract class cnt extends bxh implements cnl {
   protected cnt(bwj<? extends cnt> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   public awm dm() {
      return awm.f;
   }

   @Override
   public void k_() {
      this.eY();
      this.gs();
      super.k_();
   }

   protected void gs() {
      float $$0 = this.bx();
      if ($$0 > 0.5F) {
         this.bd += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awk aV() {
      return awl.nw;
   }

   @Override
   protected awk aW() {
      return awl.nv;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.nt;
   }

   @Override
   protected awk l_() {
      return awl.ns;
   }

   @Override
   public bwz.a eN() {
      return new bwz.a(awl.nu, awl.nr);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return -$$1.x($$0);
   }

   public static boolean a(djg $$0, iu $$1, azt $$2) {
      if ($$0.a(diy.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         edl $$3 = $$0.B_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(diy.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.B($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bwj<? extends cnt> $$0, djg $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.an() != btv.a && (bwi.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bwj<? extends cnt> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.an() != btv.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bye.a gt() {
      return bxb.E().a(byf.c);
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   public boolean a(aro $$0, cqs $$1) {
      return true;
   }

   @Override
   public cys e(cys $$0) {
      if ($$0.h() instanceof czn) {
         Predicate<cys> $$1 = ((czn)$$0.h()).c();
         cys $$2 = czn.a(this, $$1);
         return $$2.f() ? new cys(cyw.pf) : $$2;
      } else {
         return cys.k;
      }
   }
}
