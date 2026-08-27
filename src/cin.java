import java.util.function.Predicate;

public abstract class cin extends bsi implements cif {
   protected cin(brn<? extends cin> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public avd dc() {
      return avd.f;
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
   protected avb aN() {
      return avc.mO;
   }

   @Override
   protected avb aO() {
      return avc.mN;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.mL;
   }

   @Override
   protected avb o_() {
      return avc.mK;
   }

   @Override
   public bsa.a eJ() {
      return new bsa.a(avc.mM, avc.mJ);
   }

   @Override
   public float a(in $$0, dag $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(das $$0, in $$1, ayg $$2) {
      if ($$0.a(dam.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dtz $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dam.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ab() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(brn<? extends cin> $$0, das $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.ak() != bpj.a && (bse.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(brn<? extends cin> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.ak() != bpj.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static btg.a gv() {
      return bsc.A().a(bth.c);
   }

   @Override
   public boolean ef() {
      return true;
   }

   @Override
   protected boolean eg() {
      return true;
   }

   public boolean f(clh $$0) {
      return true;
   }

   @Override
   public csz g(csz $$0) {
      if ($$0.f() instanceof ctq) {
         Predicate<csz> $$1 = ((ctq)$$0.f()).d();
         csz $$2 = ctq.a(this, $$1);
         return $$2.d() ? new csz(ctc.ov) : $$2;
      } else {
         return csz.i;
      }
   }
}
