import java.util.List;

public class cjj extends cik {
   private static final akh<Integer> bF = akl.a(cjj.class, akj.b);
   int bG;
   int bH;
   private static final cho.a bI = ($$0, $$1) -> {
      if ($$0 instanceof cqs $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(axd.A);
   };
   static final cho bJ = cho.b().e().d().a(bI);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public cjj(bwj<? extends cjj> $$0, dip $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bF, 0);
   }

   public int x() {
      return this.al.a(bF);
   }

   public void b(int $$0) {
      this.al.a(bF, $$0);
   }

   @Override
   public void a(akh<?> $$0) {
      if (bF.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("PuffState", this.x());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cys R_() {
      return new cys(cyw.rq);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new cjj.a(this));
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && this.dj()) {
         if (this.bG > 0) {
            if (this.x() == 0) {
               this.b(awl.vB);
               this.b(1);
            } else if (this.bG > 40 && this.x() == 1) {
               this.b(awl.vB);
               this.b(2);
            }

            this.bG++;
         } else if (this.x() != 0) {
            if (this.bH > 60 && this.x() == 2) {
               this.b(awl.vA);
               this.b(1);
            } else if (this.bH > 100 && this.x() == 1) {
               this.b(awl.vA);
               this.b(0);
            }

            this.bH++;
         }
      }

      super.h();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV() instanceof aro $$0 && this.bK() && this.x() > 0) {
         for (bxb $$2 : this.dV().a(bxb.class, this.cR().g(0.3), $$1 -> bJ.a($$0, this, $$1))) {
            if ($$2.bK()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(aro $$0, bxb $$1) {
      int $$2 = this.x();
      if ($$1.a($$0, this.dW().b((bwz)this), (float)(1 + $$2))) {
         $$1.b(new bve(bvg.s, 60 * $$2, 0), this);
         this.a(awl.vF, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cqs $$0) {
      int $$1 = this.x();
      if ($$0 instanceof arp $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bwz)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new acz(acz.k, 0.0F));
         }

         $$0.b(new bve(bvg.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awk u() {
      return awl.vz;
   }

   @Override
   protected awk l_() {
      return awl.vC;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.vE;
   }

   @Override
   protected awk t() {
      return awl.vD;
   }

   @Override
   public bwd e(bxl $$0) {
      return super.e($$0).a(c(this.x()));
   }

   private static float c(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends cdv {
      private final cjj a;

      public a(cjj $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bwz> $$0 = this.a.dV().a(bwz.class, this.a.cR().g(2.0), $$0x -> cjj.bJ.a(a(this.a), this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.bG = 1;
         this.a.bH = 0;
      }

      @Override
      public void e() {
         this.a.bG = 0;
      }
   }
}
