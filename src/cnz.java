import java.util.function.Predicate;

public abstract class cnz extends bxk implements cnr {
   protected cnz(bwm<? extends cnz> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   public awo dm() {
      return awo.f;
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
   protected awm aV() {
      return awn.nx;
   }

   @Override
   protected awm aW() {
      return awn.nw;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.nu;
   }

   @Override
   protected awm l_() {
      return awn.nt;
   }

   @Override
   public bxc.a eN() {
      return new bxc.a(awn.nv, awn.ns);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      return -$$1.x($$0);
   }

   public static boolean a(djm $$0, iu $$1, azv $$2) {
      if ($$0.a(dje.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         edw $$3 = $$0.B_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dje.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.B($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bwm<? extends cnz> $$0, djm $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.an() != bty.a && (bwl.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bwm<? extends cnz> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.an() != bty.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static byh.a gt() {
      return bxe.E().a(byi.c);
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   public boolean a(arq $$0, cqy $$1) {
      return true;
   }

   @Override
   public cyy e(cyy $$0) {
      if ($$0.h() instanceof czt) {
         Predicate<cyy> $$1 = ((czt)$$0.h()).c();
         cyy $$2 = czt.a(this, $$1);
         return $$2.f() ? new cyy(czc.ph) : $$2;
      } else {
         return cyy.k;
      }
   }
}
