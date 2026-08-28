import java.util.function.Predicate;

public abstract class cmx extends bwo implements cmp {
   protected cmx(bvr<? extends cmx> $$0, dhi $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   public axg dn() {
      return axg.f;
   }

   @Override
   public void d_() {
      this.eX();
      this.gs();
      super.d_();
   }

   protected void gs() {
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
      return axf.nq;
   }

   @Override
   protected axe aW() {
      return axf.np;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.nn;
   }

   @Override
   protected axe o_() {
      return axf.nm;
   }

   @Override
   public bwg.a eM() {
      return new bwg.a(axf.no, axf.nl);
   }

   @Override
   public float a(jh $$0, dhl $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dhz $$0, jh $$1, bam $$2) {
      if ($$0.a(dhr.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         ebq $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dhr.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ae() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bvr<? extends cmx> $$0, dhz $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.al() != btg.a && (bvq.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bvr<? extends cmx> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.al() != btg.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bxn.a gt() {
      return bwi.C().a(bxo.c);
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   public boolean a(ash $$0, cpx $$1) {
      return true;
   }

   @Override
   public cxp d(cxp $$0) {
      if ($$0.h() instanceof cyl) {
         Predicate<cxp> $$1 = ((cyl)$$0.h()).d();
         cxp $$2 = cyl.a(this, $$1);
         return $$2.f() ? new cxp(cxt.oS) : $$2;
      } else {
         return cxp.j;
      }
   }
}
