import java.util.List;
import java.util.function.Predicate;

public class cex extends ceb {
   private static final ajr<Integer> e = ajv.a(cex.class, ajt.b);
   int bY;
   int bZ;
   private static final Predicate<bso> ca = $$0 -> {
      if ($$0 instanceof clw $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ak().a(avz.A);
   };
   static final cdf cb = cdf.b().e().d().a(ca);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cex(bsa<? extends cex> $$0, dax $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gr() {
      return this.ao.a(e);
   }

   public void c(int $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public void a(ajr<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gr());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cto b() {
      return new cto(ctr.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cex.a(this));
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && this.db()) {
         if (this.bY > 0) {
            if (this.gr() == 0) {
               this.b(avh.uO);
               this.c(1);
            } else if (this.bY > 40 && this.gr() == 1) {
               this.b(avh.uO);
               this.c(2);
            }

            this.bY++;
         } else if (this.gr() != 0) {
            if (this.bZ > 60 && this.gr() == 2) {
               this.b(avh.uN);
               this.c(1);
            } else if (this.bZ > 100 && this.gr() == 1) {
               this.b(avh.uN);
               this.c(0);
            }

            this.bZ++;
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD() && this.gr() > 0) {
         for (bsq $$1 : this.dP().a(bsq.class, this.cK().g(0.3), $$0 -> cb.a(this, $$0))) {
            if ($$1.bD()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bsq $$0) {
      int $$1 = this.gr();
      if ($$0.a(this.dQ().b((bso)this), (float)(1 + $$1))) {
         $$0.b(new brc(bre.s, 60 * $$1, 0), this);
         this.a(avh.uS, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(clw $$0) {
      int $$1 = this.gr();
      if ($$0 instanceof aqn && $$1 > 0 && $$0.a(this.dQ().b((bso)this), (float)(1 + $$1))) {
         if (!this.aW()) {
            ((aqn)$$0).d.b(new acx(acx.k, 0.0F));
         }

         $$0.b(new brc(bre.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avg v() {
      return avh.uM;
   }

   @Override
   protected avg o_() {
      return avh.uP;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.uR;
   }

   @Override
   protected avg gq() {
      return avh.uQ;
   }

   @Override
   public brx e(bta $$0) {
      return super.e($$0).a(t(this.gr()));
   }

   private static float t(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends bzm {
      private final cex a;

      public a(cex $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bso> $$0 = this.a.dP().a(bso.class, this.a.cK().g(2.0), $$0x -> cex.cb.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bY = 1;
         this.a.bZ = 0;
      }

      @Override
      public void d() {
         this.a.bY = 0;
      }
   }
}
