import java.util.function.Predicate;

public abstract class ckb extends btw implements cjt {
   protected ckb(bsy<? extends ckb> $$0, dbw $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awa de() {
      return awa.f;
   }

   @Override
   public void n_() {
      this.eV();
      this.gv();
      super.n_();
   }

   protected void gv() {
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
   protected avy aP() {
      return avz.mY;
   }

   @Override
   protected avy aQ() {
      return avz.mX;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.mV;
   }

   @Override
   protected avy o_() {
      return avz.mU;
   }

   @Override
   public btn.a eL() {
      return new btn.a(avz.mW, avz.mT);
   }

   @Override
   public float a(iz $$0, dbz $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dcl $$0, iz $$1, azf $$2) {
      if ($$0.a(dcf.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dvs $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dcf.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsy<? extends ckb> $$0, dcl $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.al() != bqp.a && (btr.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsy<? extends ckb> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.al() != bqp.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static buu.a gw() {
      return btp.A().a(buv.c);
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   protected boolean ei() {
      return true;
   }

   public boolean f(cmv $$0) {
      return true;
   }

   @Override
   public cun g(cun $$0) {
      if ($$0.g() instanceof cvg) {
         Predicate<cun> $$1 = ((cvg)$$0.g()).d();
         cun $$2 = cvg.a(this, $$1);
         return $$2.e() ? new cun(cuq.ov) : $$2;
      } else {
         return cun.l;
      }
   }
}
