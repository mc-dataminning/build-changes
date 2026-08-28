import java.util.List;

public class chq extends cgt {
   private static final ajy<Integer> bY = akc.a(chq.class, aka.b);
   int bZ;
   int ca;
   private static final cfx.a cb = ($$0, $$1) -> {
      if ($$0 instanceof cow $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(awt.A);
   };
   static final cfx cc = cfx.b().e().d().a(cb);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public chq(bur<? extends chq> $$0, dgh $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   public int gt() {
      return this.al.a(bY);
   }

   public void b(int $$0) {
      this.al.a(bY, $$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (bY.equals($$0)) {
         this.m_();
      }

      super.a($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gt());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cwo W_() {
      return new cwo(cws.rm);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(1, new chq.a(this));
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && this.dj()) {
         if (this.bZ > 0) {
            if (this.gt() == 0) {
               this.b(awa.vr);
               this.b(1);
            } else if (this.bZ > 40 && this.gt() == 1) {
               this.b(awa.vr);
               this.b(2);
            }

            this.bZ++;
         } else if (this.gt() != 0) {
            if (this.ca > 60 && this.gt() == 2) {
               this.b(awa.vq);
               this.b(1);
            } else if (this.ca > 100 && this.gt() == 1) {
               this.b(awa.vq);
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
      if (this.dV() instanceof ard $$0 && this.bL() && this.gt() > 0) {
         for (bvi $$2 : this.dV().a(bvi.class, this.cR().g(0.3), $$1 -> cc.a($$0, this, $$1))) {
            if ($$2.bL()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(ard $$0, bvi $$1) {
      int $$2 = this.gt();
      if ($$1.a($$0, this.dW().b((bvg)this), (float)(1 + $$2))) {
         $$1.b(new btp(btr.s, 60 * $$2, 0), this);
         this.a(awa.vv, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(cow $$0) {
      int $$1 = this.gt();
      if ($$0 instanceof are $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bvg)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new act(act.k, 0.0F));
         }

         $$0.b(new btp(btr.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avz u() {
      return awa.vp;
   }

   @Override
   protected avz o_() {
      return awa.vs;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.vu;
   }

   @Override
   protected avz gs() {
      return awa.vt;
   }

   @Override
   public bun e(bvs $$0) {
      return super.e($$0).a(c(this.gt()));
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

   static class a extends cce {
      private final chq a;

      public a(chq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bvg> $$0 = this.a.dV().a(bvg.class, this.a.cR().g(2.0), $$0x -> chq.cc.a(a(this.a), this.a, $$0x));
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
