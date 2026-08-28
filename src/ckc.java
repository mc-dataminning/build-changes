import java.util.function.Predicate;

public abstract class ckc extends btx implements cju {
   protected ckc(bsz<? extends ckc> $$0, dbx $$1) {
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
   protected avy d(brm $$0) {
      return avz.mV;
   }

   @Override
   protected avy o_() {
      return avz.mU;
   }

   @Override
   public bto.a eL() {
      return new bto.a(avz.mW, avz.mT);
   }

   @Override
   public float a(iz $$0, dca $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dcm $$0, iz $$1, azg $$2) {
      if ($$0.a(dcg.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dvt $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dcg.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsz<? extends ckc> $$0, dcm $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.al() != bqq.a && (bts.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsz<? extends ckc> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.al() != bqq.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static buv.a gw() {
      return btq.A().a(buw.c);
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   protected boolean ei() {
      return true;
   }

   public boolean f(cmw $$0) {
      return true;
   }

   @Override
   public cuo g(cuo $$0) {
      if ($$0.g() instanceof cvh) {
         Predicate<cuo> $$1 = ((cvh)$$0.g()).d();
         cuo $$2 = cvh.a(this, $$1);
         return $$2.e() ? new cuo(cur.ov) : $$2;
      } else {
         return cuo.l;
      }
   }
}
