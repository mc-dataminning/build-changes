import java.util.function.Predicate;

public abstract class cje extends bsz implements ciw {
   protected cje(bsc<? extends cje> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public avj de() {
      return avj.f;
   }

   @Override
   public void n_() {
      this.eV();
      this.gu();
      super.n_();
   }

   protected void gu() {
      float $$0 = this.bt();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   protected avh aP() {
      return avi.mY;
   }

   @Override
   protected avh aQ() {
      return avi.mX;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.mV;
   }

   @Override
   protected avh o_() {
      return avi.mU;
   }

   @Override
   public bsq.a eL() {
      return new bsq.a(avi.mW, avi.mT);
   }

   @Override
   public float a(io $$0, dbc $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dbo $$0, io $$1, aym $$2) {
      if ($$0.a(dbi.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         duv $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dbi.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ab() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsc<? extends cje> $$0, dbo $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.ak() != bpt.a && (bsu.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsc<? extends cje> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.ak() != bpt.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static btx.a gv() {
      return bss.A().a(bty.c);
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   protected boolean ei() {
      return true;
   }

   public boolean f(cly $$0) {
      return true;
   }

   @Override
   public ctq g(ctq $$0) {
      if ($$0.g() instanceof cuj) {
         Predicate<ctq> $$1 = ((cuj)$$0.g()).d();
         ctq $$2 = cuj.a(this, $$1);
         return $$2.e() ? new ctq(ctt.ov) : $$2;
      } else {
         return ctq.i;
      }
   }
}
