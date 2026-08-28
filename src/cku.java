import java.util.List;

public class cku extends cjr {
   private static final aku<Integer> e = aky.a(cku.class, akw.b);
   int f;
   int bI;
   private static final ciu.a bJ = ($$0, $$1) -> {
      if ($$0 instanceof csi $$2 && $$2.gz()) {
         return false;
      }

      return !$$0.an().a(axq.A);
   };
   static final ciu bK = ciu.b().e().d().a(bJ);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private static final int bL = 0;

   public cku(bxn<? extends cku> $$0, dkj $$1) {
      super($$0, $$1);
      this.h_();
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gw() {
      return this.al.a(e);
   }

   public void b(int $$0) {
      this.al.a(e, $$0);
   }

   @Override
   public void a(aku<?> $$0) {
      if (e.equals($$0)) {
         this.h_();
      }

      super.a($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gw());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.b(Math.min($$0.b("PuffState", 0), 2));
   }

   @Override
   public dak a() {
      return new dak(dao.rv);
   }

   @Override
   protected void C() {
      super.C();
      this.bF.a(1, new cku.a(this));
   }

   @Override
   public void g() {
      if (!this.dV().C && this.bJ() && this.dj()) {
         if (this.f > 0) {
            if (this.gw() == 0) {
               this.b(awy.vF);
               this.b(1);
            } else if (this.f > 40 && this.gw() == 1) {
               this.b(awy.vF);
               this.b(2);
            }

            this.f++;
         } else if (this.gw() != 0) {
            if (this.bI > 60 && this.gw() == 2) {
               this.b(awy.vE);
               this.b(1);
            } else if (this.bI > 100 && this.gw() == 1) {
               this.b(awy.vE);
               this.b(0);
            }

            this.bI++;
         }
      }

      super.g();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV() instanceof asb $$0 && this.bJ() && this.gw() > 0) {
         for (byh $$2 : this.dV().a(byh.class, this.cR().g(0.3), $$1 -> bK.a($$0, this, $$1))) {
            if ($$2.bJ()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(asb $$0, byh $$1) {
      int $$2 = this.gw();
      if ($$1.a($$0, this.dW().b((byf)this), (float)(1 + $$2))) {
         $$1.b(new bwi(bwk.s, 60 * $$2, 0), this);
         this.a(awy.vJ, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(csi $$0) {
      int $$1 = this.gw();
      if ($$0 instanceof asc $$2 && $$1 > 0 && $$0.a($$2.x(), this.dW().b((byf)this), (float)(1 + $$1))) {
         if (!this.ba()) {
            $$2.f.b(new adm(adm.k, 0.0F));
         }

         $$0.b(new bwi(bwk.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awx s() {
      return awy.vD;
   }

   @Override
   protected awx j_() {
      return awy.vG;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.vI;
   }

   @Override
   protected awx gv() {
      return awy.vH;
   }

   @Override
   public bxh e(byr $$0) {
      return super.e($$0).a(c(this.gw()));
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

   static class a extends cfb {
      private final cku a;

      public a(cku $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<byf> $$0 = this.a.dV().a(byf.class, this.a.cR().g(2.0), $$0x -> cku.bK.a(a(this.a), this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.f = 1;
         this.a.bI = 0;
      }

      @Override
      public void e() {
         this.a.f = 0;
      }
   }
}
