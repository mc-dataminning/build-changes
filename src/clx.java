import java.util.function.Predicate;

public abstract class clx extends bvo implements clp {
   protected clx(bur<? extends clx> $$0, dgh $$1) {
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
   protected avz e(bta $$0) {
      return awa.nt;
   }

   @Override
   protected avz o_() {
      return awa.ns;
   }

   @Override
   public bvg.a eM() {
      return new bvg.a(awa.nu, awa.nr);
   }

   @Override
   public float a(ji $$0, dgk $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dgy $$0, ji $$1, azh $$2) {
      if ($$0.a(dgq.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         ear $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dgq.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().af() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bur<? extends clx> $$0, dgy $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.am() != bsg.a && (buq.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bur<? extends clx> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.am() != bsg.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bwn.a gx() {
      return bvi.F().a(bwo.c);
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected boolean en() {
      return true;
   }

   public boolean a(ard $$0, cow $$1) {
      return true;
   }

   @Override
   public cwo d(cwo $$0) {
      if ($$0.h() instanceof cxk) {
         Predicate<cwo> $$1 = ((cxk)$$0.h()).d();
         cwo $$2 = cxk.a(this, $$1);
         return $$2.f() ? new cwo(cws.pb) : $$2;
      } else {
         return cwo.j;
      }
   }
}
