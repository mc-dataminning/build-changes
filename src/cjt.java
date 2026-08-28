import java.util.List;

public class cjt extends ciq {
   private static final akj<Integer> bG = akn.a(cjt.class, akl.b);
   int bH;
   int bI;
   private static final cht.a bJ = ($$0, $$1) -> {
      if ($$0 instanceof crc $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(axf.A);
   };
   static final cht bK = cht.b().e().d().a(bJ);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public cjt(bwo<? extends cjt> $$0, dja $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
   }

   public int x() {
      return this.al.a(bG);
   }

   public void b(int $$0) {
      this.al.a(bG, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if (bG.equals($$0)) {
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
   public czd S_() {
      return new czd(czh.rv);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(1, new cjt.a(this));
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && this.dj()) {
         if (this.bH > 0) {
            if (this.x() == 0) {
               this.b(awn.vF);
               this.b(1);
            } else if (this.bH > 40 && this.x() == 1) {
               this.b(awn.vF);
               this.b(2);
            }

            this.bH++;
         } else if (this.x() != 0) {
            if (this.bI > 60 && this.x() == 2) {
               this.b(awn.vE);
               this.b(1);
            } else if (this.bI > 100 && this.x() == 1) {
               this.b(awn.vE);
               this.b(0);
            }

            this.bI++;
         }
      }

      super.h();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV() instanceof arq $$0 && this.bK() && this.x() > 0) {
         for (bxg $$2 : this.dV().a(bxg.class, this.cR().g(0.3), $$1 -> bK.a($$0, this, $$1))) {
            if ($$2.bK()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(arq $$0, bxg $$1) {
      int $$2 = this.x();
      if ($$1.a($$0, this.dW().b((bxe)this), (float)(1 + $$2))) {
         $$1.b(new bvj(bvl.s, 60 * $$2, 0), this);
         this.a(awn.vJ, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(crc $$0) {
      int $$1 = this.x();
      if ($$0 instanceof arr $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bxe)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new adb(adb.k, 0.0F));
         }

         $$0.b(new bvj(bvl.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awm u() {
      return awn.vD;
   }

   @Override
   protected awm l_() {
      return awn.vG;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.vI;
   }

   @Override
   protected awm t() {
      return awn.vH;
   }

   @Override
   public bwi e(bxq $$0) {
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

   static class a extends cea {
      private final cjt a;

      public a(cjt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bxe> $$0 = this.a.dV().a(bxe.class, this.a.cR().g(2.0), $$0x -> cjt.bK.a(a(this.a), this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.bH = 1;
         this.a.bI = 0;
      }

      @Override
      public void e() {
         this.a.bH = 0;
      }
   }
}
