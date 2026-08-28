import java.util.function.Predicate;

public abstract class cjq extends btk implements cji {
   protected cjq(bsm<? extends cjq> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public avi df() {
      return avi.f;
   }

   @Override
   public void n_() {
      this.eS();
      this.gt();
      super.n_();
   }

   protected void gt() {
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
   protected avg aQ() {
      return avh.mY;
   }

   @Override
   protected avg aR() {
      return avh.mX;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.mV;
   }

   @Override
   protected avg o_() {
      return avh.mU;
   }

   @Override
   public btb.a eI() {
      return new btb.a(avh.mW, avh.mT);
   }

   @Override
   public float a(ja $$0, dci $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dcu $$0, ja $$1, ayo $$2) {
      if ($$0.a(dco.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dwf $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dco.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ac() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsm<? extends cjq> $$0, dcu $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqd.a && (btf.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsm<? extends cjq> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqd.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bui.a gu() {
      return btd.A().a(buj.c);
   }

   @Override
   public boolean ef() {
      return true;
   }

   @Override
   protected boolean eg() {
      return true;
   }

   public boolean f(cmk $$0) {
      return true;
   }

   @Override
   public cuc g(cuc $$0) {
      if ($$0.g() instanceof cuv) {
         Predicate<cuc> $$1 = ((cuv)$$0.g()).d();
         cuc $$2 = cuv.a(this, $$1);
         return $$2.e() ? new cuc(cuf.ow) : $$2;
      } else {
         return cuc.l;
      }
   }
}
