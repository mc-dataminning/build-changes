import java.util.List;
import java.util.function.Predicate;

public class bvf extends buj {
   private static final aec<Integer> e = aef.a(bvf.class, aee.b);
   int bT;
   int bU;
   private static final Predicate<bjb> bV = $$0 -> $$0 instanceof cbp && ((cbp)$$0).f() ? false : $$0.ag() == bip.f || $$0.eQ() != bjg.e;
   static final btn bW = btn.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bvf(bip<? extends bvf> $$0, cpq $$1) {
      super($$0, $$1);
      this.e_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, 0);
   }

   public int gc() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(aec<?> $$0) {
      if (e.equals($$0)) {
         this.e_();
      }

      super.a($$0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gc());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cja b() {
      return new cja(cjd.pR);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(1, new bvf.a(this));
   }

   @Override
   public void l() {
      if (!this.dK().B && this.bv() && this.cX()) {
         if (this.bT > 0) {
            if (this.gc() == 0) {
               this.a(aoz.te, this.eU(), this.eV());
               this.c(1);
            } else if (this.bT > 40 && this.gc() == 1) {
               this.a(aoz.te, this.eU(), this.eV());
               this.c(2);
            }

            this.bT++;
         } else if (this.gc() != 0) {
            if (this.bU > 60 && this.gc() == 2) {
               this.a(aoz.td, this.eU(), this.eV());
               this.c(1);
            } else if (this.bU > 100 && this.gc() == 1) {
               this.a(aoz.td, this.eU(), this.eV());
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
      if (this.bv() && this.gc() > 0) {
         for (bjd $$1 : this.dK().a(bjd.class, this.cG().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bv()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bjd $$0) {
      int $$1 = this.gc();
      if ($$0.a(this.dL().b((bjb)this), (float)(1 + $$1))) {
         $$0.b(new bhy(bia.s, 60 * $$1, 0), this);
         this.a(aoz.ti, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cbp $$0) {
      int $$1 = this.gc();
      if ($$0 instanceof ako && $$1 > 0 && $$0.a(this.dL().b((bjb)this), (float)(1 + $$1))) {
         if (!this.aS()) {
            ((ako)$$0).c.b(new xy(xy.j, 0.0F));
         }

         $$0.b(new bhy(bia.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aoy r() {
      return aoz.tc;
   }

   @Override
   protected aoy h_() {
      return aoz.tf;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.th;
   }

   @Override
   protected aoy gb() {
      return aoz.tg;
   }

   @Override
   public bim a(bjn $$0) {
      return super.a($$0).a(s(this.gc()));
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

   static class a extends bpw {
      private final bvf a;

      public a(bvf $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bjb> $$0 = this.a.dK().a(bjb.class, this.a.cG().g(2.0), $$0x -> bvf.bW.a(this.a, $$0x));
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
