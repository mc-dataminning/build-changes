import javax.annotation.Nullable;

public class cif extends chz {
   private final cig bZ = new cig(this);
   private static final int ca = 18000;
   private static final btm cb = btq.aO.n().a(btl.a().a(btk.a, 0.0F, btq.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cd;
   private int ce;

   public cif(btq<? extends cif> $$0, dds $$1) {
      super($$0, $$1);
   }

   public static bvl.a q() {
      return gQ().a(bvm.s, 15.0).a(bvm.v, 0.2F);
   }

   public static boolean c(btq<? extends cfv> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return !btp.a($$2) ? cfv.b($$0, $$1, $$2, $$3, $$4) : btp.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azk $$0) {
      this.g(bvm.o).a(a($$0::j));
   }

   @Override
   protected void gG() {
   }

   @Override
   protected awc w() {
      return this.a(awy.a) ? awd.xj : awd.xf;
   }

   @Override
   protected awc n_() {
      return awd.xg;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.xh;
   }

   @Override
   protected awc aT() {
      if (this.aH()) {
         if (!this.bX()) {
            return awd.xm;
         }

         this.cz++;
         if (this.cz > 5 && this.cz % 3 == 0) {
            return awd.xk;
         }

         if (this.cz <= 5) {
            return awd.xm;
         }
      }

      return awd.xi;
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
         this.a(awd.xl, 0.4F, 1.0F);
      } else {
         super.gX();
      }
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? cb : super.e($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.t() && this.ce++ >= 18000) {
         this.as();
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.ce);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.ce = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fj() {
      return 0.96F;
   }

   public boolean t() {
      return this.cd;
   }

   public void x(boolean $$0) {
      if ($$0 != this.cd) {
         this.cd = $$0;
         if ($$0) {
            this.bT.a(1, this.bZ);
         } else {
            this.bT.a(this.bZ);
         }
      }
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return btq.aO.a($$0, btp.e);
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      return (brk)(!this.gF() ? brk.e : super.b($$0, $$1));
   }
}
