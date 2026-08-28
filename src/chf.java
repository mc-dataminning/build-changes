import java.util.List;
import java.util.function.Predicate;

public class chf extends cgi {
   private static final akk<Integer> bY = ako.a(chf.class, akm.b);
   int bZ;
   int ca;
   private static final Predicate<buv> cb = $$0 -> {
      if ($$0 instanceof coh $$1 && $$1.f()) {
         return false;
      }

      return !$$0.aq().a(axd.A);
   };
   static final cfm cc = cfm.b().e().d().a(cb);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public chf(bug<? extends chf> $$0, dev $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(ako.a $$0) {
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
   public void a(akk<?> $$0) {
      if (bY.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gx());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cvx X_() {
      return new cvx(cwb.qG);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new chf.a(this));
   }

   @Override
   public void l() {
      if (!this.dX().C && this.bM() && this.dk()) {
         if (this.bZ > 0) {
            if (this.gx() == 0) {
               this.b(awk.uQ);
               this.b(1);
            } else if (this.bZ > 40 && this.gx() == 1) {
               this.b(awk.uQ);
               this.b(2);
            }

            this.bZ++;
         } else if (this.gx() != 0) {
            if (this.ca > 60 && this.gx() == 2) {
               this.b(awk.uP);
               this.b(1);
            } else if (this.ca > 100 && this.gx() == 1) {
               this.b(awk.uP);
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
      if (this.bM() && this.gx() > 0) {
         for (bux $$1 : this.dX().a(bux.class, this.cS().g(0.3), $$0 -> cc.a(this, $$0))) {
            if ($$1.bM()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bux $$0) {
      int $$1 = this.gx();
      if ($$0.a(this.dY().b((buv)this), (float)(1 + $$1))) {
         $$0.b(new bte(btg.s, 60 * $$1, 0), this);
         this.a(awk.uU, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(coh $$0) {
      int $$1 = this.gx();
      if ($$0 instanceof arn && $$1 > 0 && $$0.a(this.dY().b((buv)this), (float)(1 + $$1))) {
         if (!this.bc()) {
            ((arn)$$0).d.b(new adk(adk.k, 0.0F));
         }

         $$0.b(new bte(btg.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awj w() {
      return awk.uO;
   }

   @Override
   protected awj o_() {
      return awk.uR;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.uT;
   }

   @Override
   protected awj gw() {
      return awk.uS;
   }

   @Override
   public buc e(bvh $$0) {
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

   static class a extends cbt {
      private final chf a;

      public a(chf $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<buv> $$0 = this.a.dX().a(buv.class, this.a.cS().g(2.0), $$0x -> chf.cc.a(this.a, $$0x));
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
