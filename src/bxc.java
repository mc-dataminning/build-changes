import java.util.List;
import java.util.function.Predicate;

public class bxc extends bwg {
   private static final afm<Integer> e = afp.a(bxc.class, afo.b);
   int bT;
   int bU;
   private static final Predicate<bky> bV = $$0 -> $$0 instanceof cdm && ((cdm)$$0).f() ? false : $$0.ag() == bkm.f || $$0.eR() != bld.e;
   static final bvk bW = bvk.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bxc(bkm<? extends bxc> $$0, crs $$1) {
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
   public void a(afm<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gg());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public clb b() {
      return new clb(cle.pR);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new bxc.a(this));
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bv() && this.cX()) {
         if (this.bT > 0) {
            if (this.gg() == 0) {
               this.a(aqn.ti, this.eV(), this.eW());
               this.c(1);
            } else if (this.bT > 40 && this.gg() == 1) {
               this.a(aqn.ti, this.eV(), this.eW());
               this.c(2);
            }

            this.bT++;
         } else if (this.gg() != 0) {
            if (this.bU > 60 && this.gg() == 2) {
               this.a(aqn.th, this.eV(), this.eW());
               this.c(1);
            } else if (this.bU > 100 && this.gg() == 1) {
               this.a(aqn.th, this.eV(), this.eW());
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
         for (bla $$1 : this.dL().a(bla.class, this.cG().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bv()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bla $$0) {
      int $$1 = this.gg();
      if ($$0.a(this.dM().b((bky)this), (float)(1 + $$1))) {
         $$0.b(new bjv(bjx.s, 60 * $$1, 0), this);
         this.a(aqn.tm, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cdm $$0) {
      int $$1 = this.gg();
      if ($$0 instanceof amb && $$1 > 0 && $$0.a(this.dM().b((bky)this), (float)(1 + $$1))) {
         if (!this.aS()) {
            ((amb)$$0).c.b(new zi(zi.j, 0.0F));
         }

         $$0.b(new bjv(bjx.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aqm w() {
      return aqn.tg;
   }

   @Override
   protected aqm m_() {
      return aqn.tj;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.tl;
   }

   @Override
   protected aqm gf() {
      return aqn.tk;
   }

   @Override
   public bkj a(blk $$0) {
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

   static class a extends brt {
      private final bxc a;

      public a(bxc $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bky> $$0 = this.a.dL().a(bky.class, this.a.cG().g(2.0), $$0x -> bxc.bW.a(this.a, $$0x));
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
