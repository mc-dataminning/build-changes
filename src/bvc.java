import java.util.List;
import java.util.function.Predicate;

public class bvc extends bug {
   private static final adz<Integer> e = aec.a(bvc.class, aeb.b);
   int bT;
   int bU;
   private static final Predicate<biy> bV = $$0 -> $$0 instanceof cbm && ((cbm)$$0).f() ? false : $$0.ag() == bim.f || $$0.eQ() != bjd.e;
   static final btk bW = btk.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bvc(bim<? extends bvc> $$0, cpl $$1) {
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
   public void a(adz<?> $$0) {
      if (e.equals($$0)) {
         this.e_();
      }

      super.a($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gc());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cix b() {
      return new cix(cja.pR);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(1, new bvc.a(this));
   }

   @Override
   public void l() {
      if (!this.dK().B && this.bv() && this.cX()) {
         if (this.bT > 0) {
            if (this.gc() == 0) {
               this.a(aow.te, this.eU(), this.eV());
               this.c(1);
            } else if (this.bT > 40 && this.gc() == 1) {
               this.a(aow.te, this.eU(), this.eV());
               this.c(2);
            }

            this.bT++;
         } else if (this.gc() != 0) {
            if (this.bU > 60 && this.gc() == 2) {
               this.a(aow.td, this.eU(), this.eV());
               this.c(1);
            } else if (this.bU > 100 && this.gc() == 1) {
               this.a(aow.td, this.eU(), this.eV());
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
         for (bja $$1 : this.dK().a(bja.class, this.cG().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bv()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bja $$0) {
      int $$1 = this.gc();
      if ($$0.a(this.dL().b((biy)this), (float)(1 + $$1))) {
         $$0.b(new bhv(bhx.s, 60 * $$1, 0), this);
         this.a(aow.ti, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cbm $$0) {
      int $$1 = this.gc();
      if ($$0 instanceof akl && $$1 > 0 && $$0.a(this.dL().b((biy)this), (float)(1 + $$1))) {
         if (!this.aS()) {
            ((akl)$$0).c.b(new xv(xv.j, 0.0F));
         }

         $$0.b(new bhv(bhx.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aov r() {
      return aow.tc;
   }

   @Override
   protected aov h_() {
      return aow.tf;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.th;
   }

   @Override
   protected aov gb() {
      return aow.tg;
   }

   @Override
   public bij a(bjk $$0) {
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

   static class a extends bpt {
      private final bvc a;

      public a(bvc $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<biy> $$0 = this.a.dK().a(biy.class, this.a.cG().g(2.0), $$0x -> bvc.bW.a(this.a, $$0x));
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
