import java.util.List;
import java.util.function.Predicate;

public class byl extends bxp {
   private static final agj<Integer> e = agm.a(byl.class, agl.b);
   int bT;
   int bU;
   private static final Predicate<bmf> bV = $$0 -> $$0 instanceof cfb && ((cfb)$$0).f() ? false : $$0.ai() == blt.f || $$0.eS() != bmk.e;
   static final bwt bW = bwt.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public byl(blt<? extends byl> $$0, cti $$1) {
      super($$0, $$1);
      this.k_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, 0);
   }

   public int gg() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(agj<?> $$0) {
      if (e.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gg());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cmr b() {
      return new cmr(cmu.qC);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new byl.a(this));
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && this.cY()) {
         if (this.bT > 0) {
            if (this.gg() == 0) {
               this.a(arm.tU, this.eW(), this.eX());
               this.c(1);
            } else if (this.bT > 40 && this.gg() == 1) {
               this.a(arm.tU, this.eW(), this.eX());
               this.c(2);
            }

            this.bT++;
         } else if (this.gg() != 0) {
            if (this.bU > 60 && this.gg() == 2) {
               this.a(arm.tT, this.eW(), this.eX());
               this.c(1);
            } else if (this.bU > 100 && this.gg() == 1) {
               this.a(arm.tT, this.eW(), this.eX());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.gg() > 0) {
         for (bmh $$1 : this.dM().a(bmh.class, this.cH().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bmh $$0) {
      int $$1 = this.gg();
      if ($$0.a(this.dN().b((bmf)this), (float)(1 + $$1))) {
         $$0.b(new blc(ble.s, 60 * $$1, 0), this);
         this.a(arm.tY, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cfb $$0) {
      int $$1 = this.gg();
      if ($$0 instanceof ana && $$1 > 0 && $$0.a(this.dN().b((bmf)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((ana)$$0).c.b(new aac(aac.j, 0.0F));
         }

         $$0.b(new blc(ble.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected arl y() {
      return arm.tS;
   }

   @Override
   protected arl n_() {
      return arm.tV;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.tX;
   }

   @Override
   protected arl gf() {
      return arm.tW;
   }

   @Override
   public blq a(bmr $$0) {
      return super.a($$0).a(s(this.gg()));
   }

   private static float s(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends btb {
      private final byl a;

      public a(byl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bmf> $$0 = this.a.dM().a(bmf.class, this.a.cH().g(2.0), $$0x -> byl.bW.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bT = 1;
         this.a.bU = 0;
      }

      @Override
      public void d() {
         this.a.bT = 0;
      }
   }
}
