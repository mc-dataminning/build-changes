import java.util.function.Predicate;

public abstract class bwc extends bgi implements bvu {
   protected bwc(bfn<? extends bwc> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public ami cY() {
      return ami.f;
   }

   @Override
   public void b_() {
      this.eL();
      this.gd();
      super.b_();
   }

   protected void gd() {
      float $$0 = this.bj();
      if ($$0 > 0.5F) {
         this.bc += 2;
      }
   }

   @Override
   protected boolean U() {
      return true;
   }

   @Override
   protected amg aJ() {
      return amh.lw;
   }

   @Override
   protected amg aK() {
      return amh.lv;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.lt;
   }

   @Override
   protected amg g_() {
      return amh.ls;
   }

   @Override
   public bfz.a eC() {
      return new bfz.a(amh.lu, amh.lr);
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(cnb $$0, gu $$1, apf $$2) {
      if ($$0.a(cmv.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dfk $$3 = $$0.x_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cmv.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bfn<? extends bwc> $$0, cnb $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.ai() != bdu.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bfn<? extends bwc> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.ai() != bdu.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bhf.a ge() {
      return bgb.y().a(bhg.f);
   }

   @Override
   public boolean dY() {
      return true;
   }

   @Override
   protected boolean dZ() {
      return true;
   }

   public boolean f(byo $$0) {
      return true;
   }

   @Override
   public cfz g(cfz $$0) {
      if ($$0.d() instanceof cgp) {
         Predicate<cfz> $$1 = ((cgp)$$0.d()).e();
         cfz $$2 = cgp.a(this, $$1);
         return $$2.b() ? new cfz(cgc.nH) : $$2;
      } else {
         return cfz.b;
      }
   }
}
