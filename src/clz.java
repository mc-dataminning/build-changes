import java.util.function.Predicate;

public abstract class clz extends bvq implements clr {
   protected clz(but<? extends clz> $$0, dgj $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   public void d_() {
      this.eX();
      this.gw();
      super.d_();
   }

   protected void gw() {
      float $$0 = this.by();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean ab() {
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
   protected avz e(btc $$0) {
      return awa.nt;
   }

   @Override
   protected avz o_() {
      return awa.ns;
   }

   @Override
   public bvi.a eM() {
      return new bvi.a(awa.nu, awa.nr);
   }

   @Override
   public float a(ji $$0, dgm $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dha $$0, ji $$1, azh $$2) {
      if ($$0.a(dgs.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         eat $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dgs.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().af() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(but<? extends clz> $$0, dha $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.am() != bsi.a && (bus.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(but<? extends clz> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.am() != bsi.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bwp.a gx() {
      return bvk.F().a(bwq.c);
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected boolean en() {
      return true;
   }

   public boolean a(ard $$0, coy $$1) {
      return true;
   }

   @Override
   public cwq d(cwq $$0) {
      if ($$0.h() instanceof cxm) {
         Predicate<cwq> $$1 = ((cxm)$$0.h()).d();
         cwq $$2 = cxm.a(this, $$1);
         return $$2.f() ? new cwq(cwu.pb) : $$2;
      } else {
         return cwq.j;
      }
   }
}
