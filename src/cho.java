import java.util.List;
import java.util.function.Predicate;

public class cho extends cgr {
   private static final ako<Integer> bY = aks.a(cho.class, akq.b);
   int bZ;
   int ca;
   private static final Predicate<bve> cb = $$0 -> {
      if ($$0 instanceof cor $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ar().a(axh.A);
   };
   static final cfv cc = cfv.b().e().d().a(cb);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cho(bup<? extends cho> $$0, dff $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   public int gx() {
      return this.am.a(bY);
   }

   public void b(int $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public void a(ako<?> $$0) {
      if (bY.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gx());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cwf X_() {
      return new cwf(cwj.qG);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new cho.a(this));
   }

   @Override
   public void l() {
      if (!this.dY().C && this.bN() && this.dl()) {
         if (this.bZ > 0) {
            if (this.gx() == 0) {
               this.b(awo.uQ);
               this.b(1);
            } else if (this.bZ > 40 && this.gx() == 1) {
               this.b(awo.uQ);
               this.b(2);
            }

            this.bZ++;
         } else if (this.gx() != 0) {
            if (this.ca > 60 && this.gx() == 2) {
               this.b(awo.uP);
               this.b(1);
            } else if (this.ca > 100 && this.gx() == 1) {
               this.b(awo.uP);
               this.b(0);
            }

            this.ca++;
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bN() && this.gx() > 0) {
         for (bvg $$1 : this.dY().a(bvg.class, this.cT().g(0.3), $$0 -> cc.a(this, $$0))) {
            if ($$1.bN()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bvg $$0) {
      int $$1 = this.gx();
      if ($$0.a(this.dZ().b((bve)this), (float)(1 + $$1))) {
         $$0.b(new btn(btp.s, 60 * $$1, 0), this);
         this.a(awo.uU, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cor $$0) {
      int $$1 = this.gx();
      if ($$0 instanceof arr && $$1 > 0 && $$0.a(this.dZ().b((bve)this), (float)(1 + $$1))) {
         if (!this.bd()) {
            ((arr)$$0).g.b(new ado(ado.k, 0.0F));
         }

         $$0.b(new btn(btp.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awn w() {
      return awo.uO;
   }

   @Override
   protected awn o_() {
      return awo.uR;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.uT;
   }

   @Override
   protected awn gw() {
      return awo.uS;
   }

   @Override
   public bul e(bvq $$0) {
      return super.e($$0).a(c(this.gx()));
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

   static class a extends ccc {
      private final cho a;

      public a(cho $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bve> $$0 = this.a.dY().a(bve.class, this.a.cT().g(2.0), $$0x -> cho.cc.a(this.a, $$0x));
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
