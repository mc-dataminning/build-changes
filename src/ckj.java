import java.util.List;

public class ckj extends cjg {
   private static final akl<Integer> e = akp.a(ckj.class, akn.b);
   int f;
   int bI;
   private static final cij.a bJ = ($$0, $$1) -> {
      if ($$0 instanceof crx $$2 && $$2.b()) {
         return false;
      }

      return !$$0.an().a(axh.A);
   };
   static final cij bK = cij.b().e().d().a(bJ);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private static final int bL = 0;

   public ckj(bxc<? extends ckj> $$0, djx $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int x() {
      return this.al.a(e);
   }

   public void b(int $$0) {
      this.al.a(e, $$0);
   }

   @Override
   public void a(akl<?> $$0) {
      if (e.equals($$0)) {
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
      this.b(Math.min($$0.b("PuffState", 0), 2));
   }

   @Override
   public czy W_() {
      return new czy(dac.rv);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(1, new ckj.a(this));
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bJ() && this.dj()) {
         if (this.f > 0) {
            if (this.x() == 0) {
               this.b(awp.vF);
               this.b(1);
            } else if (this.f > 40 && this.x() == 1) {
               this.b(awp.vF);
               this.b(2);
            }

            this.f++;
         } else if (this.x() != 0) {
            if (this.bI > 60 && this.x() == 2) {
               this.b(awp.vE);
               this.b(1);
            } else if (this.bI > 100 && this.x() == 1) {
               this.b(awp.vE);
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
      if (this.dV() instanceof ars $$0 && this.bJ() && this.x() > 0) {
         for (bxw $$2 : this.dV().a(bxw.class, this.cR().g(0.3), $$1 -> bK.a($$0, this, $$1))) {
            if ($$2.bJ()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(ars $$0, bxw $$1) {
      int $$2 = this.x();
      if ($$1.a($$0, this.dW().b((bxu)this), (float)(1 + $$2))) {
         $$1.b(new bvx(bvz.s, 60 * $$2, 0), this);
         this.a(awp.vJ, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(crx $$0) {
      int $$1 = this.x();
      if ($$0 instanceof art $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bxu)this), (float)(1 + $$1))) {
         if (!this.ba()) {
            $$2.f.b(new add(add.k, 0.0F));
         }

         $$0.b(new bvx(bvz.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awo u() {
      return awp.vD;
   }

   @Override
   protected awo l_() {
      return awp.vG;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.vI;
   }

   @Override
   protected awo t() {
      return awp.vH;
   }

   @Override
   public bww e(byg $$0) {
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

   static class a extends ceq {
      private final ckj a;

      public a(ckj $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bxu> $$0 = this.a.dV().a(bxu.class, this.a.cR().g(2.0), $$0x -> ckj.bK.a(a(this.a), this.a, $$0x));
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
