import java.util.function.Predicate;

public abstract class cmw extends bwn implements cmo {
   protected cmw(bvq<? extends cmw> $$0, dhh $$1) {
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
      return axf.nq;
   }

   @Override
   protected axe aW() {
      return axf.np;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.nn;
   }

   @Override
   protected axe o_() {
      return axf.nm;
   }

   @Override
   public bwf.a eL() {
      return new bwf.a(axf.no, axf.nl);
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dhy $$0, jh $$1, bam $$2) {
      if ($$0.a(dhq.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         ebp $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dhq.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ae() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bvq<? extends cmw> $$0, dhy $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.al() != btf.a && (bvp.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bvq<? extends cmw> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.al() != btf.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bxm.a gr() {
      return bwh.C().a(bxn.c);
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected boolean en() {
      return true;
   }

   public boolean a(ash $$0, cpw $$1) {
      return true;
   }

   @Override
   public cxo d(cxo $$0) {
      if ($$0.h() instanceof cyk) {
         Predicate<cxo> $$1 = ((cyk)$$0.h()).d();
         cxo $$2 = cyk.a(this, $$1);
         return $$2.f() ? new cxo(cxs.oS) : $$2;
      } else {
         return cxo.k;
      }
   }
}
