import javax.annotation.Nullable;

public class ccf extends cbz {
   private final ccg bT = new ccg(this);
   private static final int bU = 18000;
   private static final bnt bW = bnw.aM.n().a(bns.a().a(bnr.a, 0.0F, bnw.aM.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bX;
   private int bY;

   public ccf(bnw<? extends ccf> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public static bpo.a u() {
      return gG().a(bpp.n, 15.0).a(bpp.o, 0.2F);
   }

   public static boolean c(bnw<? extends bzx> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return !bom.a($$2) ? bzx.b($$0, $$1, $$2, $$3, $$4) : bom.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(awp $$0) {
      this.f(bpp.j).a(a($$0::j));
   }

   @Override
   protected void gw() {
   }

   @Override
   protected atk y() {
      return this.a(auf.a) ? atl.wB : atl.wx;
   }

   @Override
   protected atk n_() {
      return atl.wy;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.wz;
   }

   @Override
   protected atk aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return atl.wE;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return atl.wC;
         }

         if (this.cu <= 5) {
            return atl.wE;
         }
      }

      return atl.wA;
   }

   @Override
   protected void e(float $$0) {
      if (this.aC()) {
         super.e(0.3F);
      } else {
         super.e(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gN() {
      if (this.aZ()) {
         this.a(atl.wD, 0.4F, 1.0F);
      } else {
         super.gN();
      }
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? bW : super.e($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.w() && this.bY++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.bY);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bY = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fd() {
      return 0.96F;
   }

   public boolean w() {
      return this.bX;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bX) {
         this.bX = $$0;
         if ($$0) {
            this.bO.a(1, this.bT);
         } else {
            this.bO.a(this.bT);
         }
      }
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      return bnw.aM.a((cvr)$$0);
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      return !this.gv() ? blw.d : super.b($$0, $$1);
   }
}
