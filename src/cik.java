import java.util.List;

public class cik extends chl {
   private static final ajx<Integer> bF = akb.a(cik.class, ajz.b);
   int bG;
   int bH;
   private static final cgp.a bI = ($$0, $$1) -> {
      if ($$0 instanceof cpr $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(awt.A);
   };
   static final cgp bJ = cgp.b().e().d().a(bI);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public cik(bvi<? extends cik> $$0, dgz $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akb.a $$0) {
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
   public void a(ajx<?> $$0) {
      if (bF.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("PuffState", this.x());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cxh R_() {
      return new cxh(cxl.ro);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new cik.a(this));
   }

   @Override
   public void h() {
      if (!this.dU().C && this.bJ() && this.di()) {
         if (this.bG > 0) {
            if (this.x() == 0) {
               this.b(awa.vB);
               this.b(1);
            } else if (this.bG > 40 && this.x() == 1) {
               this.b(awa.vB);
               this.b(2);
            }

            this.bG++;
         } else if (this.x() != 0) {
            if (this.bH > 60 && this.x() == 2) {
               this.b(awa.vA);
               this.b(1);
            } else if (this.bH > 100 && this.x() == 1) {
               this.b(awa.vA);
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
      if (this.dU() instanceof ard $$0 && this.bJ() && this.x() > 0) {
         for (bwa $$2 : this.dU().a(bwa.class, this.cQ().g(0.3), $$1 -> bJ.a($$0, this, $$1))) {
            if ($$2.bJ()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(ard $$0, bwa $$1) {
      int $$2 = this.x();
      if ($$1.a($$0, this.dV().b((bvy)this), (float)(1 + $$2))) {
         $$1.b(new bue(bug.s, 60 * $$2, 0), this);
         this.a(awa.vF, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cpr $$0) {
      int $$1 = this.x();
      if ($$0 instanceof are $$2 && $$1 > 0 && $$0.a($$2.y(), this.dV().b((bvy)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new acs(acs.k, 0.0F));
         }

         $$0.b(new bue(bug.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avz u() {
      return awa.vz;
   }

   @Override
   protected avz l_() {
      return awa.vC;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.vE;
   }

   @Override
   protected avz t() {
      return awa.vD;
   }

   @Override
   public bvd e(bwk $$0) {
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

   static class a extends ccw {
      private final cik a;

      public a(cik $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bvy> $$0 = this.a.dU().a(bvy.class, this.a.cQ().g(2.0), $$0x -> cik.bJ.a(a(this.a), this.a, $$0x));
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
