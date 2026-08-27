import java.util.function.Predicate;

public abstract class ccp extends bmu implements cch {
   protected ccp(blz<? extends ccp> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public art db() {
      return art.f;
   }

   @Override
   public void d_() {
      this.eQ();
      this.gj();
      super.d_();
   }

   protected void gj() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected arr aN() {
      return ars.mk;
   }

   @Override
   protected arr aO() {
      return ars.mj;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.mh;
   }

   @Override
   protected arr n_() {
      return ars.mg;
   }

   @Override
   public bml.a eG() {
      return new bml.a(ars.mi, ars.mf);
   }

   @Override
   public float a(hx $$0, cts $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(cue $$0, hx $$1, auv $$2) {
      if ($$0.a(cty.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dmq $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cty.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(blz<? extends ccp> $$0, cue $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.ak() != bjy.a && (bmp.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(blz<? extends ccp> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.ak() != bjy.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bnq.a gk() {
      return bmn.C().a(bnr.c);
   }

   @Override
   public boolean ec() {
      return true;
   }

   @Override
   protected boolean ed() {
      return true;
   }

   public boolean f(cfi $$0) {
      return true;
   }

   @Override
   public cmy g(cmy $$0) {
      if ($$0.d() instanceof cno) {
         Predicate<cmy> $$1 = ((cno)$$0.d()).e();
         cmy $$2 = cno.a(this, $$1);
         return $$2.b() ? new cmy(cnb.os) : $$2;
      } else {
         return cmy.f;
      }
   }
}
