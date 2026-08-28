import java.util.function.Predicate;

public abstract class ckd extends btw implements cjv {
   protected ckd(bsx<? extends ckd> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = 5;
   }

   @Override
   public avq de() {
      return avq.f;
   }

   @Override
   public void m_() {
      this.eR();
      this.gp();
      super.m_();
   }

   protected void gp() {
      float $$0 = this.bu();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean Z() {
      return true;
   }

   @Override
   protected avo aQ() {
      return avp.mY;
   }

   @Override
   protected avo aR() {
      return avp.mX;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.mV;
   }

   @Override
   protected avo n_() {
      return avp.mU;
   }

   @Override
   public btn.a eH() {
      return new btn.a(avp.mW, avp.mT);
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(ddl $$0, jd $$1, ayw $$2) {
      if ($$0.a(ddf.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dwy $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(ddf.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsx<? extends ckd> $$0, ddl $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.al() != bqo.a && (btr.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsx<? extends ckd> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.al() != bqo.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static buv.a gq() {
      return btp.C().a(buw.c);
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   protected boolean ef() {
      return true;
   }

   public boolean a(cmx $$0) {
      return true;
   }

   @Override
   public cuq g(cuq $$0) {
      if ($$0.g() instanceof cvn) {
         Predicate<cuq> $$1 = ((cvn)$$0.g()).d();
         cuq $$2 = cvn.a(this, $$1);
         return $$2.e() ? new cuq(cut.ow) : $$2;
      } else {
         return cuq.l;
      }
   }
}
