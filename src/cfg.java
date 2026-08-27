import java.util.function.Predicate;

public abstract class cfg extends bpf implements cey {
   protected cfg(bol<? extends cfg> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 5;
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   public void d_() {
      this.eP();
      this.gq();
      super.d_();
   }

   protected void gq() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bc += 2;
      }
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   protected ato aN() {
      return atp.mA;
   }

   @Override
   protected ato aO() {
      return atp.mz;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.mx;
   }

   @Override
   protected ato n_() {
      return atp.mw;
   }

   @Override
   public box.a eF() {
      return new box.a(atp.my, atp.mv);
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(cwt $$0, ib $$1, awt $$2) {
      if ($$0.a(cwn.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dpq $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cwn.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bol<? extends cfg> $$0, cwt $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.aj() != bmi.a && (bpb.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bol<? extends cfg> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.aj() != bmi.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bqd.a gr() {
      return boz.C().a(bqe.c);
   }

   @Override
   public boolean eb() {
      return true;
   }

   @Override
   protected boolean ec() {
      return true;
   }

   public boolean f(cia $$0) {
      return true;
   }

   @Override
   public cpq g(cpq $$0) {
      if ($$0.d() instanceof cqg) {
         Predicate<cpq> $$1 = ((cqg)$$0.d()).d();
         cpq $$2 = cqg.a(this, $$1);
         return $$2.b() ? new cpq(cpt.ou) : $$2;
      } else {
         return cpq.h;
      }
   }
}
