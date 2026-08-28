import java.util.List;

public class cih extends chk {
   private static final aks<Integer> bZ = akw.a(cih.class, aku.b);
   int ca;
   int cb;
   private static final cgo.a cc = ($$0, $$1) -> {
      if ($$0 instanceof cpo $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(axo.A);
   };
   static final cgo cd = cgo.b().e().d().a(cc);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public cih(bvi<? extends cih> $$0, dgz $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   protected void a(akw.a $$0) {
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
   public void a(aks<?> $$0) {
      if (bZ.equals($$0)) {
         this.m_();
      }

      super.a($$0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gp());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cxg X_() {
      return new cxg(cxk.rm);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(1, new cih.a(this));
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && this.dk()) {
         if (this.ca > 0) {
            if (this.gp() == 0) {
               this.b(awv.vr);
               this.b(1);
            } else if (this.ca > 40 && this.gp() == 1) {
               this.b(awv.vr);
               this.b(2);
            }

            this.ca++;
         } else if (this.gp() != 0) {
            if (this.cb > 60 && this.gp() == 2) {
               this.b(awv.vq);
               this.b(1);
            } else if (this.cb > 100 && this.gp() == 1) {
               this.b(awv.vq);
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
      if (this.dW() instanceof arx $$0 && this.bL() && this.gp() > 0) {
         for (bvz $$2 : this.dW().a(bvz.class, this.cR().g(0.3), $$1 -> cd.a($$0, this, $$1))) {
            if ($$2.bL()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(arx $$0, bvz $$1) {
      int $$2 = this.gp();
      if ($$1.a($$0, this.dX().b((bvx)this), (float)(1 + $$2))) {
         $$1.b(new bug(bui.s, 60 * $$2, 0), this);
         this.a(awv.vv, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cpo $$0) {
      int $$1 = this.gp();
      if ($$0 instanceof ary $$2 && $$1 > 0 && $$0.a($$2.y(), this.dX().b((bvx)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new ado(ado.k, 0.0F));
         }

         $$0.b(new bug(bui.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awu u() {
      return awv.vp;
   }

   @Override
   protected awu o_() {
      return awv.vs;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.vu;
   }

   @Override
   protected awu go() {
      return awv.vt;
   }

   @Override
   public bve e(bwj $$0) {
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

   static class a extends ccv {
      private final cih a;

      public a(cih $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bvx> $$0 = this.a.dW().a(bvx.class, this.a.cR().g(2.0), $$0x -> cih.cd.a(a(this.a), this.a, $$0x));
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
