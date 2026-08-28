import java.util.List;

public class cil extends cho {
   private static final alc<Integer> bZ = alg.a(cil.class, ale.b);
   int ca;
   int cb;
   private static final cgs.a cc = ($$0, $$1) -> {
      if ($$0 instanceof cps $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(axy.A);
   };
   static final cgs cd = cgs.b().e().d().a(cc);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public cil(bvm<? extends cil> $$0, dha $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   public int gn() {
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
      $$0.a("PuffState", this.gn());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cxk X_() {
      return new cxk(cxo.rd);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(1, new cil.a(this));
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && this.dj()) {
         if (this.ca > 0) {
            if (this.gn() == 0) {
               this.b(axf.vk);
               this.b(1);
            } else if (this.ca > 40 && this.gn() == 1) {
               this.b(axf.vk);
               this.b(2);
            }

            this.ca++;
         } else if (this.gn() != 0) {
            if (this.cb > 60 && this.gn() == 2) {
               this.b(axf.vj);
               this.b(1);
            } else if (this.cb > 100 && this.gn() == 1) {
               this.b(axf.vj);
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
      if (this.dV() instanceof ash $$0 && this.bL() && this.gn() > 0) {
         for (bwd $$2 : this.dV().a(bwd.class, this.cR().g(0.3), $$1 -> cd.a($$0, this, $$1))) {
            if ($$2.bL()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(ash $$0, bwd $$1) {
      int $$2 = this.gn();
      if ($$1.a($$0, this.dW().b((bwb)this), (float)(1 + $$2))) {
         $$1.b(new buk(bum.s, 60 * $$2, 0), this);
         this.a(axf.vo, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cps $$0) {
      int $$1 = this.gn();
      if ($$0 instanceof asi $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bwb)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new adz(adz.k, 0.0F));
         }

         $$0.b(new buk(bum.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected axe u() {
      return axf.vi;
   }

   @Override
   protected axe o_() {
      return axf.vl;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.vn;
   }

   @Override
   protected axe gm() {
      return axf.vm;
   }

   @Override
   public bvi e(bwn $$0) {
      return super.e($$0).a(c(this.gn()));
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

   static class a extends ccz {
      private final cil a;

      public a(cil $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bwb> $$0 = this.a.dV().a(bwb.class, this.a.cR().g(2.0), $$0x -> cil.cd.a(a(this.a), this.a, $$0x));
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
