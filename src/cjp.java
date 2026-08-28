import java.util.List;

public class cjp extends cio {
   private static final akj<Integer> bF = akn.a(cjp.class, akl.b);
   int bG;
   int bH;
   private static final chr.a bI = ($$0, $$1) -> {
      if ($$0 instanceof cqy $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(axf.A);
   };
   static final chr bJ = chr.b().e().d().a(bI);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public cjp(bwm<? extends cjp> $$0, div $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void a(akj<?> $$0) {
      if (bF.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("PuffState", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cyy R_() {
      return new cyy(czc.rs);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new cjp.a(this));
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && this.dj()) {
         if (this.bG > 0) {
            if (this.x() == 0) {
               this.b(awn.vC);
               this.b(1);
            } else if (this.bG > 40 && this.x() == 1) {
               this.b(awn.vC);
               this.b(2);
            }

            this.bG++;
         } else if (this.x() != 0) {
            if (this.bH > 60 && this.x() == 2) {
               this.b(awn.vB);
               this.b(1);
            } else if (this.bH > 100 && this.x() == 1) {
               this.b(awn.vB);
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
      if (this.dV() instanceof arq $$0 && this.bK() && this.x() > 0) {
         for (bxe $$2 : this.dV().a(bxe.class, this.cR().g(0.3), $$1 -> bJ.a($$0, this, $$1))) {
            if ($$2.bK()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(arq $$0, bxe $$1) {
      int $$2 = this.x();
      if ($$1.a($$0, this.dW().b((bxc)this), (float)(1 + $$2))) {
         $$1.b(new bvh(bvj.s, 60 * $$2, 0), this);
         this.a(awn.vG, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cqy $$0) {
      int $$1 = this.x();
      if ($$0 instanceof arr $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bxc)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new adb(adb.k, 0.0F));
         }

         $$0.b(new bvh(bvj.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awm u() {
      return awn.vA;
   }

   @Override
   protected awm l_() {
      return awn.vD;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.vF;
   }

   @Override
   protected awm t() {
      return awn.vE;
   }

   @Override
   public bwg e(bxo $$0) {
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

   static class a extends cdy {
      private final cjp a;

      public a(cjp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bxc> $$0 = this.a.dV().a(bxc.class, this.a.cR().g(2.0), $$0x -> cjp.bJ.a(a(this.a), this.a, $$0x));
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
