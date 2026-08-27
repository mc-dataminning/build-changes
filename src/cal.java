import java.util.function.Predicate;

public abstract class cal extends bks implements cad {
   protected cal(bjx<? extends cal> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public aqe da() {
      return aqe.f;
   }

   @Override
   public void c_() {
      this.eP();
      this.gj();
      super.c_();
   }

   protected void gj() {
      float $$0 = this.bm();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean V() {
      return true;
   }

   @Override
   protected aqc aL() {
      return aqd.ly;
   }

   @Override
   protected aqc aM() {
      return aqd.lx;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.lv;
   }

   @Override
   protected aqc m_() {
      return aqd.lu;
   }

   @Override
   public bkj.a eF() {
      return new bkj.a(aqd.lw, aqd.lt);
   }

   @Override
   public float a(ht $$0, crc $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(cro $$0, ht $$1, ate $$2) {
      if ($$0.a(cri.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         djk $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cri.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bjx<? extends cal> $$0, cro $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.ai() != bhy.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bjx<? extends cal> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.ai() != bhy.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static blo.a gk() {
      return bkl.A().a(blp.c);
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   protected boolean ec() {
      return true;
   }

   public boolean f(ccx $$0) {
      return true;
   }

   @Override
   public ckj g(ckj $$0) {
      if ($$0.d() instanceof ckz) {
         Predicate<ckj> $$1 = ((ckz)$$0.d()).e();
         ckj $$2 = ckz.a(this, $$1);
         return $$2.b() ? new ckj(ckm.nH) : $$2;
      } else {
         return ckj.b;
      }
   }
}
