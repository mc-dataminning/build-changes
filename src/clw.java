import java.util.function.Predicate;

public abstract class clw extends bvn implements clo {
   protected clw(buq<? extends clw> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awa dn() {
      return awa.f;
   }

   @Override
   public void d_() {
      this.eX();
      this.gt();
      super.d_();
   }

   protected void gt() {
      float $$0 = this.by();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   protected avy aV() {
      return avz.nw;
   }

   @Override
   protected avy aW() {
      return avz.nv;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.nt;
   }

   @Override
   protected avy o_() {
      return avz.ns;
   }

   @Override
   public bvf.a eM() {
      return new bvf.a(avz.nu, avz.nr);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dgx $$0, ji $$1, azg $$2) {
      if ($$0.a(dgp.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         eaq $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dgp.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().af() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(buq<? extends clw> $$0, dgx $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.am() != bsf.a && (bup.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(buq<? extends clw> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.am() != bsf.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bwm.a gu() {
      return bvh.C().a(bwn.c);
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   public boolean a(arc $$0, cov $$1) {
      return true;
   }

   @Override
   public cwn d(cwn $$0) {
      if ($$0.h() instanceof cxj) {
         Predicate<cwn> $$1 = ((cxj)$$0.h()).d();
         cwn $$2 = cxj.a(this, $$1);
         return $$2.f() ? new cwn(cwr.pb) : $$2;
      } else {
         return cwn.j;
      }
   }
}
