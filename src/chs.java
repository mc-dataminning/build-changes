import java.util.List;

public class chs extends cgv {
   private static final ajy<Integer> bY = akc.a(chs.class, aka.b);
   int bZ;
   int ca;
   private static final cfz.a cb = ($$0, $$1) -> {
      if ($$0 instanceof coy $$2 && $$2.b()) {
         return false;
      }

      return !$$0.aq().a(awt.A);
   };
   static final cfz cc = cfz.b().e().d().a(cb);
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;

   public chs(but<? extends chs> $$0, dgj $$1) {
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
   public cwq W_() {
      return new cwq(cwu.rm);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(1, new chs.a(this));
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
         for (bvk $$2 : this.dV().a(bvk.class, this.cR().g(0.3), $$1 -> cc.a($$0, this, $$1))) {
            if ($$2.bL()) {
               this.a($$0, $$2);
            }
         }
      }
   }

   private void a(ard $$0, bvk $$1) {
      int $$2 = this.gt();
      if ($$1.a($$0, this.dW().b((bvi)this), (float)(1 + $$2))) {
         $$1.b(new btr(btt.s, 60 * $$2, 0), this);
         this.a(awa.vv, 1.0F, 1.0F);
      }
   }

   @Override
   public void a_(coy $$0) {
      int $$1 = this.gt();
      if ($$0 instanceof are $$2 && $$1 > 0 && $$0.a($$2.y(), this.dW().b((bvi)this), (float)(1 + $$1))) {
         if (!this.bb()) {
            $$2.f.b(new act(act.k, 0.0F));
         }

         $$0.b(new btr(btt.s, 60 * $$1, 0), this);
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
   protected avz e(btc $$0) {
      return awa.vu;
   }

   @Override
   protected avz gs() {
      return awa.vt;
   }

   @Override
   public bup e(bvu $$0) {
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

   static class a extends ccg {
      private final chs a;

      public a(chs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bvi> $$0 = this.a.dV().a(bvi.class, this.a.cR().g(2.0), $$0x -> chs.cc.a(a(this.a), this.a, $$0x));
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
