import java.util.function.Predicate;

public abstract class cjn extends bth implements cjf {
   protected cjn(bsj<? extends cjn> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public avg de() {
      return avg.f;
   }

   @Override
   public void n_() {
      this.eR();
      this.gs();
      super.n_();
   }

   protected void gs() {
      float $$0 = this.bt();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected ave aP() {
      return avf.mY;
   }

   @Override
   protected ave aQ() {
      return avf.mX;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.mV;
   }

   @Override
   protected ave o_() {
      return avf.mU;
   }

   @Override
   public bsy.a eH() {
      return new bsy.a(avf.mW, avf.mT);
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dcs $$0, ja $$1, aym $$2) {
      if ($$0.a(dcm.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dvz $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dcm.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsj<? extends cjn> $$0, dcs $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.al() != bqa.a && (btc.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsj<? extends cjn> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.al() != bqa.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static buf.a gt() {
      return bta.A().a(bug.c);
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   protected boolean ef() {
      return true;
   }

   public boolean f(cmh $$0) {
      return true;
   }

   @Override
   public cua g(cua $$0) {
      if ($$0.g() instanceof cut) {
         Predicate<cua> $$1 = ((cut)$$0.g()).d();
         cua $$2 = cut.a(this, $$1);
         return $$2.e() ? new cua(cud.ov) : $$2;
      } else {
         return cua.l;
      }
   }
}
