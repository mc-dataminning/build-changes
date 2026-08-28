import java.util.List;

public class chp extends cgs {
   private static final ajx<Integer> bY = akb.a(chp.class, ajz.b);
   int bZ;
   int ca;
   private static final cfw.a cb = ($$0, $$1) -> {
      if ($$0 instanceof cov $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(aws.A);
   };
   static final cfw cc = cfw.b().e().d().a(cb);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public chp(buq<? extends chp> $$0, dgg $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   public int gq() {
      return this.al.a(bY);
   }

   public void b(int $$0) {
      this.al.a(bY, $$0);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bY.equals($$0)) {
         this.m_();
      }

      super.a($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gq());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cwn W_() {
      return new cwn(cwr.rm);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(1, new chp.a(this));
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && this.dk()) {
         if (this.bZ > 0) {
            if (this.gq() == 0) {
               this.b(avz.vr);
               this.b(1);
            } else if (this.bZ > 40 && this.gq() == 1) {
               this.b(avz.vr);
               this.b(2);
            }

            this.bZ++;
         } else if (this.gq() != 0) {
            if (this.ca > 60 && this.gq() == 2) {
               this.b(avz.vq);
               this.b(1);
            } else if (this.ca > 100 && this.gq() == 1) {
               this.b(avz.vq);
               this.b(0);
            }

            this.ca++;
         }
      }

      super.h();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dW() instanceof arc $$0 && this.bL() && this.gq() > 0) {
         for (bvh $$2 : this.dW().a(bvh.class, this.cR().g(0.3), $$1 -> cc.a($$0, this, $$1))) {
            if ($$2.bL()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(arc $$0, bvh $$1) {
      int $$2 = this.gq();
      if ($$1.a($$0, this.dX().b((bvf)this), (float)(1 + $$2))) {
         $$1.b(new bto(btq.s, 60 * $$2, 0), this);
         this.a(avz.vv, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cov $$0) {
      int $$1 = this.gq();
      if ($$0 instanceof ard $$2 && $$1 > 0 && $$0.a($$2.y(), this.dX().b((bvf)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new acs(acs.k, 0.0F));
         }

         $$0.b(new bto(btq.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avy u() {
      return avz.vp;
   }

   @Override
   protected avy o_() {
      return avz.vs;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.vu;
   }

   @Override
   protected avy gp() {
      return avz.vt;
   }

   @Override
   public bum e(bvr $$0) {
      return super.e($$0).a(c(this.gq()));
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

   static class a extends ccd {
      private final chp a;

      public a(chp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bvf> $$0 = this.a.dW().a(bvf.class, this.a.cR().g(2.0), $$0x -> chp.cc.a(a(this.a), this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.bZ = 1;
         this.a.ca = 0;
      }

      @Override
      public void e() {
         this.a.bZ = 0;
      }
   }
}
