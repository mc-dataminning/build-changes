import java.util.List;

public class cjb extends cic {
   private static final akg<Integer> bE = akk.a(cjb.class, aki.b);
   int bF;
   int bG;
   private static final chg.a bH = ($$0, $$1) -> {
      if ($$0 instanceof cqi $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(axd.A);
   };
   static final chg bI = chg.b().e().d().a(bH);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public cjb(bwb<? extends cjb> $$0, dhp $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, 0);
   }

   public int x() {
      return this.al.a(bE);
   }

   public void b(int $$0) {
      this.al.a(bE, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (bE.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("PuffState", this.x());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cxy R_() {
      return new cxy(cyc.rq);
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(1, new cjb.a(this));
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && this.dj()) {
         if (this.bF > 0) {
            if (this.x() == 0) {
               this.b(awk.vB);
               this.b(1);
            } else if (this.bF > 40 && this.x() == 1) {
               this.b(awk.vB);
               this.b(2);
            }

            this.bF++;
         } else if (this.x() != 0) {
            if (this.bG > 60 && this.x() == 2) {
               this.b(awk.vA);
               this.b(1);
            } else if (this.bG > 100 && this.x() == 1) {
               this.b(awk.vA);
               this.b(0);
            }

            this.bG++;
         }
      }

      super.h();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV() instanceof arn $$0 && this.bK() && this.x() > 0) {
         for (bwt $$2 : this.dV().a(bwt.class, this.cR().g(0.3), $$1 -> bI.a($$0, this, $$1))) {
            if ($$2.bK()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(arn $$0, bwt $$1) {
      int $$2 = this.x();
      if ($$1.a($$0, this.dW().b((bwr)this), (float)(1 + $$2))) {
         $$1.b(new buw(buy.s, 60 * $$2, 0), this);
         this.a(awk.vF, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cqi $$0) {
      int $$1 = this.x();
      if ($$0 instanceof aro $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bwr)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new acy(acy.k, 0.0F));
         }

         $$0.b(new buw(buy.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awj u() {
      return awk.vz;
   }

   @Override
   protected awj l_() {
      return awk.vC;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.vE;
   }

   @Override
   protected awj t() {
      return awk.vD;
   }

   @Override
   public bvv e(bxd $$0) {
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

   static class a extends cdn {
      private final cjb a;

      public a(cjb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bwr> $$0 = this.a.dV().a(bwr.class, this.a.cR().g(2.0), $$0x -> cjb.bI.a(a(this.a), this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.bF = 1;
         this.a.bG = 0;
      }

      @Override
      public void e() {
         this.a.bF = 0;
      }
   }
}
