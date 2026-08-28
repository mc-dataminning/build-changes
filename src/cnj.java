import java.util.function.Predicate;

public abstract class cnj extends bwz implements cnb {
   protected cnj(bwb<? extends cnj> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 5;
   }

   @Override
   public awl dm() {
      return awl.f;
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
         this.bc += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awj aV() {
      return awk.nw;
   }

   @Override
   protected awj aW() {
      return awk.nv;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.nt;
   }

   @Override
   protected awj l_() {
      return awk.ns;
   }

   @Override
   public bwr.a eN() {
      return new bwr.a(awk.nu, awk.nr);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dig $$0, jj $$1, azs $$2) {
      if ($$0.a(dhy.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         ecj $$3 = $$0.B_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dhy.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bwb<? extends cnj> $$0, dig $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.an() != btn.a && (bwa.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bwb<? extends cnj> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.an() != btn.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bxw.a gt() {
      return bwt.E().a(bxx.c);
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   public boolean a(arn $$0, cqi $$1) {
      return true;
   }

   @Override
   public cxy e(cxy $$0) {
      if ($$0.h() instanceof cyt) {
         Predicate<cxy> $$1 = ((cyt)$$0.h()).d();
         cxy $$2 = cyt.a(this, $$1);
         return $$2.f() ? new cxy(cyc.pf) : $$2;
      } else {
         return cxy.k;
      }
   }
}
