import java.util.function.Predicate;

public abstract class cms extends bwg implements cmk {
   protected cms(bvi<? extends cms> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 5;
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   public void k_() {
      this.eX();
      this.gu();
      super.k_();
   }

   protected void gu() {
      float $$0 = this.bw();
      if ($$0 > 0.5F) {
         this.bd += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected avz aV() {
      return awa.nw;
   }

   @Override
   protected avz aW() {
      return awa.nv;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.nt;
   }

   @Override
   protected avz l_() {
      return awa.ns;
   }

   @Override
   public bvy.a eM() {
      return new bvy.a(awa.nu, awa.nr);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dhq $$0, ji $$1, azh $$2) {
      if ($$0.a(dhi.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         ebm $$3 = $$0.B_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dhi.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bvi<? extends cms> $$0, dhq $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.an() != bsv.a && (bvh.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bvi<? extends cms> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.an() != bsv.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bxf.a gv() {
      return bwa.E().a(bxg.c);
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected boolean en() {
      return true;
   }

   public boolean a(ard $$0, cpr $$1) {
      return true;
   }

   @Override
   public cxh d(cxh $$0) {
      if ($$0.h() instanceof cyc) {
         Predicate<cxh> $$1 = ((cyc)$$0.h()).d();
         cxh $$2 = cyc.a(this, $$1);
         return $$2.f() ? new cxh(cxl.pd) : $$2;
      } else {
         return cxh.k;
      }
   }
}
