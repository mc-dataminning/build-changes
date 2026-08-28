import java.util.function.Predicate;

public abstract class cms extends bwj implements cmk {
   protected cms(bvm<? extends cms> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   public axg dm() {
      return axg.f;
   }

   @Override
   public void d_() {
      this.eV();
      this.gq();
      super.d_();
   }

   protected void gq() {
      float $$0 = this.by();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected axe aV() {
      return axf.np;
   }

   @Override
   protected axe aW() {
      return axf.no;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.nm;
   }

   @Override
   protected axe o_() {
      return axf.nl;
   }

   @Override
   public bwb.a eL() {
      return new bwb.a(axf.nn, axf.nk);
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dhr $$0, jh $$1, bam $$2) {
      if ($$0.a(dhj.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         ebi $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dhj.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ae() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bvm<? extends cms> $$0, dhr $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.al() != btb.a && (bvl.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bvm<? extends cms> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.al() != btb.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bxi.a gr() {
      return bwd.C().a(bxj.c);
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected boolean en() {
      return true;
   }

   public boolean a(ash $$0, cps $$1) {
      return true;
   }

   @Override
   public cxk d(cxk $$0) {
      if ($$0.h() instanceof cyg) {
         Predicate<cxk> $$1 = ((cyg)$$0.h()).d();
         cxk $$2 = cyg.a(this, $$1);
         return $$2.f() ? new cxk(cxo.oS) : $$2;
      } else {
         return cxk.k;
      }
   }
}
