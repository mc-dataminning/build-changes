import java.util.function.Predicate;

public abstract class cco extends bmt implements ccg {
   protected cco(bly<? extends cco> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public ars db() {
      return ars.f;
   }

   @Override
   public void d_() {
      this.eQ();
      this.gj();
      super.d_();
   }

   protected void gj() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected arq aN() {
      return arr.mk;
   }

   @Override
   protected arq aO() {
      return arr.mj;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.mh;
   }

   @Override
   protected arq n_() {
      return arr.mg;
   }

   @Override
   public bmk.a eG() {
      return new bmk.a(arr.mi, arr.mf);
   }

   @Override
   public float a(hx $$0, ctr $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(cud $$0, hx $$1, auu $$2) {
      if ($$0.a(ctx.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dmp $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(ctx.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bly<? extends cco> $$0, cud $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.ak() != bjx.a && (bmo.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bly<? extends cco> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.ak() != bjx.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bnp.a gk() {
      return bmm.C().a(bnq.c);
   }

   @Override
   public boolean ec() {
      return true;
   }

   @Override
   protected boolean ed() {
      return true;
   }

   public boolean f(cfh $$0) {
      return true;
   }

   @Override
   public cmx g(cmx $$0) {
      if ($$0.d() instanceof cnn) {
         Predicate<cmx> $$1 = ((cnn)$$0.d()).e();
         cmx $$2 = cnn.a(this, $$1);
         return $$2.b() ? new cmx(cna.os) : $$2;
      } else {
         return cmx.f;
      }
   }
}
