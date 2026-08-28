import java.util.List;

public class cip extends chs {
   private static final alc<Integer> bZ = alg.a(cip.class, ale.b);
   int ca;
   int cb;
   private static final cgw.a cc = ($$0, $$1) -> {
      if ($$0 instanceof cpw $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(axy.A);
   };
   static final cgw cd = cgw.b().e().d().a(cc);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public cip(bvq<? extends cip> $$0, dhh $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   public int gp() {
      return this.al.a(bZ);
   }

   public void b(int $$0) {
      this.al.a(bZ, $$0);
   }

   @Override
   public void a(alc<?> $$0) {
      if (bZ.equals($$0)) {
         this.m_();
      }

      super.a($$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gp());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cxo X_() {
      return new cxo(cxs.rd);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(1, new cip.a(this));
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && this.dk()) {
         if (this.ca > 0) {
            if (this.gp() == 0) {
               this.b(axf.vl);
               this.b(1);
            } else if (this.ca > 40 && this.gp() == 1) {
               this.b(axf.vl);
               this.b(2);
            }

            this.ca++;
         } else if (this.gp() != 0) {
            if (this.cb > 60 && this.gp() == 2) {
               this.b(axf.vk);
               this.b(1);
            } else if (this.cb > 100 && this.gp() == 1) {
               this.b(axf.vk);
               this.b(0);
            }

            this.cb++;
         }
      }

      super.h();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dW() instanceof ash $$0 && this.bL() && this.gp() > 0) {
         for (bwh $$2 : this.dW().a(bwh.class, this.cR().g(0.3), $$1 -> cd.a($$0, this, $$1))) {
            if ($$2.bL()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(ash $$0, bwh $$1) {
      int $$2 = this.gp();
      if ($$1.a($$0, this.dX().b((bwf)this), (float)(1 + $$2))) {
         $$1.b(new buo(buq.s, 60 * $$2, 0), this);
         this.a(axf.vp, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cpw $$0) {
      int $$1 = this.gp();
      if ($$0 instanceof asi $$2 && $$1 > 0 && $$0.a($$2.y(), this.dX().b((bwf)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new adz(adz.k, 0.0F));
         }

         $$0.b(new buo(buq.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected axe u() {
      return axf.vj;
   }

   @Override
   protected axe o_() {
      return axf.vm;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.vo;
   }

   @Override
   protected axe go() {
      return axf.vn;
   }

   @Override
   public bvm e(bwr $$0) {
      return super.e($$0).a(c(this.gp()));
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

   static class a extends cdd {
      private final cip a;

      public a(cip $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bwf> $$0 = this.a.dW().a(bwf.class, this.a.cR().g(2.0), $$0x -> cip.cd.a(a(this.a), this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.ca = 1;
         this.a.cb = 0;
      }

      @Override
      public void e() {
         this.a.ca = 0;
      }
   }
}
