import javax.annotation.Nullable;

public class cji extends cjc {
   private final cjj bY = new cjj(this);
   private static final int bZ = 18000;
   private static final buo ca = bus.bc.n().a(bun.a().a(bum.a, 0.0F, bus.bc.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cji(bus<? extends cji> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public static bwo.a n() {
      return gO().a(bwp.s, 15.0).a(bwp.v, 0.2F);
   }

   public static boolean c(bus<? extends cgy> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return !bur.a($$2) ? cgy.b($$0, $$1, $$2, $$3, $$4) : bur.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azu $$0) {
      this.g(bwp.o).a(a($$0::j));
   }

   @Override
   protected void gE() {
   }

   @Override
   protected awm t() {
      return this.a(axi.a) ? awn.xh : awn.xd;
   }

   @Override
   protected awm n_() {
      return awn.xe;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.xf;
   }

   @Override
   protected awm aV() {
      if (this.aJ()) {
         if (!this.ca()) {
            return awn.xk;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return awn.xi;
         }

         if (this.cy <= 5) {
            return awn.xk;
         }
      }

      return awn.xg;
   }

   @Override
   protected void f(float $$0) {
      if (this.aJ()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gU() {
      if (this.bj()) {
         this.a(awn.xj, 0.4F, 1.0F);
      } else {
         super.gU();
      }
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? ca : super.e($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.q() && this.cd++ >= 18000) {
         this.at();
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.q());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.cd = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fk() {
      return 0.96F;
   }

   public boolean q() {
      return this.cc;
   }

   public void x(boolean $$0) {
      if ($$0 != this.cc) {
         this.cc = $$0;
         if ($$0) {
            this.bS.a(1, this.bY);
         } else {
            this.bS.a(this.bY);
         }
      }
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return bus.bc.a($$0, bur.e);
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      return (bsk)(!this.gD() ? bsk.e : super.b($$0, $$1));
   }
}
