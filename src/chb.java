import javax.annotation.Nullable;

public class chb extends cgv {
   private final chc ca = new chc(this);
   private static final int cb = 18000;
   private static final bsj cd = bsm.aO.n().a(bsi.a().a(bsh.a, 0.0F, bsm.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean ce;
   private int cf;

   public chb(bsm<? extends chb> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public static bui.a s() {
      return gN().a(buj.s, 15.0).a(buj.v, 0.2F);
   }

   public static boolean c(bsm<? extends cer> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return !btf.a($$2) ? cer.b($$0, $$1, $$2, $$3, $$4) : btf.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayo $$0) {
      this.f(buj.o).a(a($$0::j));
   }

   @Override
   protected void gE() {
   }

   @Override
   protected avg v() {
      return this.a(awc.a) ? avh.xi : avh.xe;
   }

   @Override
   protected avg o_() {
      return avh.xf;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.xg;
   }

   @Override
   protected avg aQ() {
      if (this.aF()) {
         if (!this.bT()) {
            return avh.xl;
         }

         this.cz++;
         if (this.cz > 5 && this.cz % 3 == 0) {
            return avh.xj;
         }

         if (this.cz <= 5) {
            return avh.xl;
         }
      }

      return avh.xh;
   }

   @Override
   protected void f(float $$0) {
      if (this.aF()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gU() {
      if (this.bf()) {
         this.a(avh.xk, 0.4F, 1.0F);
      } else {
         super.gU();
      }
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.u() && this.cf++ >= 18000) {
         this.ap();
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cf);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cf = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fi() {
      return 0.96F;
   }

   public boolean u() {
      return this.ce;
   }

   public void w(boolean $$0) {
      if ($$0 != this.ce) {
         this.ce = $$0;
         if ($$0) {
            this.bU.a(1, this.ca);
         } else {
            this.bU.a(this.ca);
         }
      }
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      return bsm.aO.a((dcf)$$0);
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      return !this.gD() ? bqg.e : super.b($$0, $$1);
   }
}
