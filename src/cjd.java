import java.util.function.Predicate;

public abstract class cjd extends bsw implements ciu {
   protected cjd(bsb<? extends cjd> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 5;
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   public void m_() {
      this.fe();
      this.gF();
      super.m_();
   }

   protected void gF() {
      float $$0 = this.by();
      if ($$0 > 0.5F) {
         this.bq += 2;
      }
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   protected avn aT() {
      return avo.no;
   }

   @Override
   protected avn aU() {
      return avo.nn;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.nl;
   }

   @Override
   protected avn n_() {
      return avo.nk;
   }

   @Override
   public bso.a eT() {
      return new bso.a(avo.nm, avo.nj);
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dcp $$0, ir $$1, ayt $$2) {
      if ($$0.a(dcj.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dwu $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dcj.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsb<? extends cjd> $$0, dcp $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.al() != bpx.a && (bss.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsb<? extends cjd> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.al() != bpx.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static btu.a gG() {
      return bsq.A().a(btv.c);
   }

   @Override
   public boolean ep() {
      return true;
   }

   @Override
   protected boolean eq() {
      return true;
   }

   public boolean f(cly $$0) {
      return true;
   }

   @Override
   public cuh g(cuh $$0) {
      if ($$0.f() instanceof cvi) {
         Predicate<cuh> $$1 = ((cvi)$$0.f()).d();
         cuh $$2 = cvi.a(this, $$1);
         return $$2.d() ? new cuh(cuk.pL) : $$2;
      } else {
         return cuh.i;
      }
   }
}
