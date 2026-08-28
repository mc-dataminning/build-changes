import javax.annotation.Nullable;

public class cin extends cih {
   private final cio bY = new cio(this);
   private static final int bZ = 18000;
   private static final btu ca = bty.aO.n().a(btt.a().a(bts.a, 0.0F, bty.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cin(bty<? extends cin> $$0, dej $$1) {
      super($$0, $$1);
   }

   public static bvt.a q() {
      return gQ().a(bvu.s, 15.0).a(bvu.v, 0.2F);
   }

   public static boolean c(bty<? extends cgd> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return !btx.a($$2) ? cgd.b($$0, $$1, $$2, $$3, $$4) : btx.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azn $$0) {
      this.g(bvu.o).a(a($$0::j));
   }

   @Override
   protected void gG() {
   }

   @Override
   protected awf w() {
      return this.a(axb.a) ? awg.xj : awg.xf;
   }

   @Override
   protected awf o_() {
      return awg.xg;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.xh;
   }

   @Override
   protected awf aT() {
      if (this.aH()) {
         if (!this.bX()) {
            return awg.xm;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return awg.xk;
         }

         if (this.cy <= 5) {
            return awg.xm;
         }
      }

      return awg.xi;
   }

   @Override
   protected void f(float $$0) {
      if (this.aH()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gX() {
      if (this.bi()) {
         this.a(awg.xl, 0.4F, 1.0F);
      } else {
         super.gX();
      }
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? ca : super.e($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.t() && this.cd++ >= 18000) {
         this.as();
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.cd = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fj() {
      return 0.96F;
   }

   public boolean t() {
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
   public btk a(arj $$0, btk $$1) {
      return bty.aO.a($$0, btx.e);
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      return (brs)(!this.gF() ? brs.e : super.b($$0, $$1));
   }
}
