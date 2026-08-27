import java.util.List;
import java.util.function.Predicate;

public class bwn extends bvr {
   private static final afc<Integer> e = aff.a(bwn.class, afe.b);
   int bT;
   int bU;
   private static final Predicate<bkj> bV = $$0 -> $$0 instanceof ccx && ((ccx)$$0).f() ? false : $$0.ag() == bjx.f || $$0.eR() != bko.e;
   static final buv bW = buv.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bwn(bjx<? extends bwn> $$0, cqz $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, 0);
   }

   public int gg() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(afc<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gg());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public ckj b() {
      return new ckj(ckm.pR);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new bwn.a(this));
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bv() && this.cX()) {
         if (this.bT > 0) {
            if (this.gg() == 0) {
               this.a(aqd.tg, this.eV(), this.eW());
               this.c(1);
            } else if (this.bT > 40 && this.gg() == 1) {
               this.a(aqd.tg, this.eV(), this.eW());
               this.c(2);
            }

            this.bT++;
         } else if (this.gg() != 0) {
            if (this.bU > 60 && this.gg() == 2) {
               this.a(aqd.tf, this.eV(), this.eW());
               this.c(1);
            } else if (this.bU > 100 && this.gg() == 1) {
               this.a(aqd.tf, this.eV(), this.eW());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void c_() {
      super.c_();
      if (this.bv() && this.gg() > 0) {
         for (bkl $$1 : this.dL().a(bkl.class, this.cG().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bv()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bkl $$0) {
      int $$1 = this.gg();
      if ($$0.a(this.dM().b((bkj)this), (float)(1 + $$1))) {
         $$0.b(new bjg(bji.s, 60 * $$1, 0), this);
         this.a(aqd.tk, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(ccx $$0) {
      int $$1 = this.gg();
      if ($$0 instanceof alr && $$1 > 0 && $$0.a(this.dM().b((bkj)this), (float)(1 + $$1))) {
         if (!this.aS()) {
            ((alr)$$0).c.b(new yz(yz.j, 0.0F));
         }

         $$0.b(new bjg(bji.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aqc w() {
      return aqd.te;
   }

   @Override
   protected aqc m_() {
      return aqd.th;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.tj;
   }

   @Override
   protected aqc gf() {
      return aqd.ti;
   }

   @Override
   public bju a(bkv $$0) {
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

   static class a extends bre {
      private final bwn a;

      public a(bwn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bkj> $$0 = this.a.dL().a(bkj.class, this.a.cG().g(2.0), $$0x -> bwn.bW.a(this.a, $$0x));
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
