import java.util.function.Predicate;

public abstract class cld extends buv implements ckv {
   protected cld(bty<? extends cld> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awh di() {
      return awh.f;
   }

   @Override
   public void n_() {
      this.eU();
      this.gt();
      super.n_();
   }

   protected void gt() {
      float $$0 = this.bx();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awf aT() {
      return awg.mZ;
   }

   @Override
   protected awf aU() {
      return awg.mY;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.mW;
   }

   @Override
   protected awf o_() {
      return awg.mV;
   }

   @Override
   public bun.a eK() {
      return new bun.a(awg.mX, awg.mU);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dez $$0, jf $$1, azn $$2) {
      if ($$0.a(des.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dyo $$3 = $$0.C_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(des.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ad() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bty<? extends cld> $$0, dez $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.am() != brp.a && (btx.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bty<? extends cld> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.am() != brp.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bvt.a gu() {
      return bup.E().a(bvu.c);
   }

   @Override
   public boolean ej() {
      return true;
   }

   @Override
   protected boolean ek() {
      return true;
   }

   public boolean a(cnx $$0) {
      return true;
   }

   @Override
   public cvs f(cvs $$0) {
      if ($$0.h() instanceof cwo) {
         Predicate<cvs> $$1 = ((cwo)$$0.h()).d();
         cvs $$2 = cwo.a(this, $$1);
         return $$2.f() ? new cvs(cvw.ox) : $$2;
      } else {
         return cvs.k;
      }
   }
}
