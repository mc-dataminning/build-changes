import java.util.List;
import java.util.function.Predicate;

public class bvb extends buf {
   private static final adx<Integer> e = aea.a(bvb.class, adz.b);
   int bT;
   int bU;
   private static final Predicate<biw> bV = $$0 -> $$0 instanceof cbl && ((cbl)$$0).f() ? false : $$0.ag() == bik.f || $$0.eQ() != bjb.e;
   static final btj bW = btj.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bvb(bik<? extends bvb> $$0, cpk $$1) {
      super($$0, $$1);
      this.e_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, 0);
   }

   public int gb() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(adx<?> $$0) {
      if (e.equals($$0)) {
         this.e_();
      }

      super.a($$0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gb());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public ciw b() {
      return new ciw(ciz.pR);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(1, new bvb.a(this));
   }

   @Override
   public void l() {
      if (!this.dK().B && this.bv() && this.cX()) {
         if (this.bT > 0) {
            if (this.gb() == 0) {
               this.a(aou.te, this.eU(), this.eV());
               this.c(1);
            } else if (this.bT > 40 && this.gb() == 1) {
               this.a(aou.te, this.eU(), this.eV());
               this.c(2);
            }

            this.bT++;
         } else if (this.gb() != 0) {
            if (this.bU > 60 && this.gb() == 2) {
               this.a(aou.td, this.eU(), this.eV());
               this.c(1);
            } else if (this.bU > 100 && this.gb() == 1) {
               this.a(aou.td, this.eU(), this.eV());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv() && this.gb() > 0) {
         for (biy $$1 : this.dK().a(biy.class, this.cG().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bv()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(biy $$0) {
      int $$1 = this.gb();
      if ($$0.a(this.dL().b((biw)this), (float)(1 + $$1))) {
         $$0.b(new bht(bhv.s, 60 * $$1, 0), this);
         this.a(aou.ti, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cbl $$0) {
      int $$1 = this.gb();
      if ($$0 instanceof akj && $$1 > 0 && $$0.a(this.dL().b((biw)this), (float)(1 + $$1))) {
         if (!this.aS()) {
            ((akj)$$0).c.b(new xu(xu.j, 0.0F));
         }

         $$0.b(new bht(bhv.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aot r() {
      return aou.tc;
   }

   @Override
   protected aot h_() {
      return aou.tf;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.th;
   }

   @Override
   protected aot ga() {
      return aou.tg;
   }

   @Override
   public bih a(bji $$0) {
      return super.a($$0).a(s(this.gb()));
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

   static class a extends bps {
      private final bvb a;

      public a(bvb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<biw> $$0 = this.a.dK().a(biw.class, this.a.cG().g(2.0), $$0x -> bvb.bW.a(this.a, $$0x));
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
