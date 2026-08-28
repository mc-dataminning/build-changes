import javax.annotation.Nullable;

public class chc extends cgw {
   private final chd ca = new chd(this);
   private static final int cb = 18000;
   private static final bsk cd = bsn.aO.n().a(bsj.a().a(bsi.a, 0.0F, bsn.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean ce;
   private int cf;

   public chc(bsn<? extends chc> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public static buj.a s() {
      return gM().a(buk.s, 15.0).a(buk.v, 0.2F);
   }

   public static boolean c(bsn<? extends ces> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return !btg.a($$2) ? ces.b($$0, $$1, $$2, $$3, $$4) : btg.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayo $$0) {
      this.f(buk.o).a(a($$0::j));
   }

   @Override
   protected void gD() {
   }

   @Override
   protected avg v() {
      return this.a(awc.a) ? avh.xi : avh.xe;
   }

   @Override
   protected avg n_() {
      return avh.xf;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.xg;
   }

   @Override
   protected avg aR() {
      if (this.aG()) {
         if (!this.bU()) {
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
      if (this.aG()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gT() {
      if (this.bg()) {
         this.a(avh.xk, 0.4F, 1.0F);
      } else {
         super.gT();
      }
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? cd : super.e($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.t() && this.cf++ >= 18000) {
         this.aq();
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cf);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cf = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fj() {
      return 0.96F;
   }

   public boolean t() {
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
   public bsb a(aqm $$0, bsb $$1) {
      return bsn.aO.a((dcg)$$0);
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      return !this.gC() ? bqh.e : super.b($$0, $$1);
   }
}
