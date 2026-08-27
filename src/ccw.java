import java.util.function.Predicate;

public abstract class ccw extends bmx implements cco {
   protected ccw(bmc<? extends ccw> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 5;
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   public void d_() {
      this.eQ();
      this.gk();
      super.d_();
   }

   protected void gk() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   protected ars aN() {
      return art.mz;
   }

   @Override
   protected ars aO() {
      return art.my;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.mw;
   }

   @Override
   protected ars n_() {
      return art.mv;
   }

   @Override
   public bmo.a eG() {
      return new bmo.a(art.mx, art.mu);
   }

   @Override
   public float a(hx $$0, cua $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(cum $$0, hx $$1, auw $$2) {
      if ($$0.a(cug.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dmy $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cug.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bmc<? extends ccw> $$0, cum $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.ak() != bjz.a && (bms.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bmc<? extends ccw> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.ak() != bjz.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bnt.a gl() {
      return bmq.C().a(bnu.c);
   }

   @Override
   public boolean ec() {
      return true;
   }

   @Override
   protected boolean ed() {
      return true;
   }

   public boolean f(cfq $$0) {
      return true;
   }

   @Override
   public cng g(cng $$0) {
      if ($$0.d() instanceof cnw) {
         Predicate<cng> $$1 = ((cnw)$$0.d()).e();
         cng $$2 = cnw.a(this, $$1);
         return $$2.b() ? new cng(cnj.ou) : $$2;
      } else {
         return cng.f;
      }
   }
}
