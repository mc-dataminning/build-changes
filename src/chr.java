import java.util.function.Predicate;

public abstract class chr extends brm implements chj {
   protected chr(bqr<? extends chr> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public ava dc() {
      return ava.f;
   }

   @Override
   public void n_() {
      this.eT();
      this.gu();
      super.n_();
   }

   protected void gu() {
      float $$0 = this.br();
      if ($$0 > 0.5F) {
         this.bg += 2;
      }
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   protected auy aN() {
      return auz.mO;
   }

   @Override
   protected auy aO() {
      return auz.mN;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.mL;
   }

   @Override
   protected auy o_() {
      return auz.mK;
   }

   @Override
   public bre.a eJ() {
      return new bre.a(auz.mM, auz.mJ);
   }

   @Override
   public float a(im $$0, czx $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(daj $$0, im $$1, ayd $$2) {
      if ($$0.a(dad.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dtq $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dad.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ab() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bqr<? extends chr> $$0, daj $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.ak() != bon.a && (bri.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bqr<? extends chr> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.ak() != bon.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bsk.a gv() {
      return brg.A().a(bsl.c);
   }

   @Override
   public boolean ef() {
      return true;
   }

   @Override
   protected boolean eg() {
      return true;
   }

   public boolean f(ckl $$0) {
      return true;
   }

   @Override
   public csd g(csd $$0) {
      if ($$0.f() instanceof csu) {
         Predicate<csd> $$1 = ((csu)$$0.f()).d();
         csd $$2 = csu.a(this, $$1);
         return $$2.d() ? new csd(csg.ov) : $$2;
      } else {
         return csd.i;
      }
   }
}
