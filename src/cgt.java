import java.util.List;
import java.util.function.Predicate;

public class cgt extends cfw {
   private static final akg<Integer> bY = akk.a(cgt.class, aki.b);
   int bZ;
   int ca;
   private static final Predicate<buk> cb = $$0 -> {
      if ($$0 instanceof cnu $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ao().a(awx.A);
   };
   static final cfa cc = cfa.b().e().d().a(cb);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cgt(btv<? extends cgt> $$0, deg $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   public int gr() {
      return this.am.a(bY);
   }

   public void b(int $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (bY.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gr());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cvp V_() {
      return new cvp(cvt.qG);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new cgt.a(this));
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && this.df()) {
         if (this.bZ > 0) {
            if (this.gr() == 0) {
               this.b(awe.uS);
               this.b(1);
            } else if (this.bZ > 40 && this.gr() == 1) {
               this.b(awe.uS);
               this.b(2);
            }

            this.bZ++;
         } else if (this.gr() != 0) {
            if (this.ca > 60 && this.gr() == 2) {
               this.b(awe.uR);
               this.b(1);
            } else if (this.ca > 100 && this.gr() == 1) {
               this.b(awe.uR);
               this.b(0);
            }

            this.ca++;
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bI() && this.gr() > 0) {
         for (bum $$1 : this.dS().a(bum.class, this.cO().g(0.3), $$0 -> cc.a(this, $$0))) {
            if ($$1.bI()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bum $$0) {
      int $$1 = this.gr();
      if ($$0.a(this.dT().b((buk)this), (float)(1 + $$1))) {
         $$0.b(new bsv(bsx.s, 60 * $$1, 0), this);
         this.a(awe.uW, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cnu $$0) {
      int $$1 = this.gr();
      if ($$0 instanceof ari && $$1 > 0 && $$0.a(this.dT().b((buk)this), (float)(1 + $$1))) {
         if (!this.ba()) {
            ((ari)$$0).c.b(new adg(adg.k, 0.0F));
         }

         $$0.b(new bsv(bsx.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awd w() {
      return awe.uQ;
   }

   @Override
   protected awd n_() {
      return awe.uT;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.uV;
   }

   @Override
   protected awd gq() {
      return awe.uU;
   }

   @Override
   public btr e(buw $$0) {
      return super.e($$0).a(c(this.gr()));
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

   static class a extends cbh {
      private final cgt a;

      public a(cgt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<buk> $$0 = this.a.dS().a(buk.class, this.a.cO().g(2.0), $$0x -> cgt.cc.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.bZ = 1;
         this.a.ca = 0;
      }

      @Override
      public void e() {
         this.a.bZ = 0;
      }
   }
}
