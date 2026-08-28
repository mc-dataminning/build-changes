import java.util.function.Predicate;

public abstract class ckb extends btu implements cjt {
   protected ckb(bsw<? extends ckb> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public avp df() {
      return avp.f;
   }

   @Override
   public void m_() {
      this.eS();
      this.gr();
      super.m_();
   }

   protected void gr() {
      float $$0 = this.bu();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected avn aQ() {
      return avo.mY;
   }

   @Override
   protected avn aR() {
      return avo.mX;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.mV;
   }

   @Override
   protected avn n_() {
      return avo.mU;
   }

   @Override
   public btl.a eI() {
      return new btl.a(avo.mW, avo.mT);
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(ddj $$0, jd $$1, ayv $$2) {
      if ($$0.a(ddd.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dwv $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(ddd.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsw<? extends ckb> $$0, ddj $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.al() != bqn.a && (btp.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsw<? extends ckb> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.al() != bqn.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static but.a gs() {
      return btn.A().a(buu.c);
   }

   @Override
   public boolean ef() {
      return true;
   }

   @Override
   protected boolean eg() {
      return true;
   }

   public boolean f(cmv $$0) {
      return true;
   }

   @Override
   public cuo g(cuo $$0) {
      if ($$0.g() instanceof cvl) {
         Predicate<cuo> $$1 = ((cvl)$$0.g()).d();
         cuo $$2 = cvl.a(this, $$1);
         return $$2.e() ? new cuo(cur.ow) : $$2;
      } else {
         return cuo.l;
      }
   }
}
