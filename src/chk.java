import java.util.List;
import java.util.function.Predicate;

public class chk extends cgn {
   private static final akl<Integer> bY = akp.a(chk.class, akn.b);
   int bZ;
   int ca;
   private static final Predicate<bva> cb = $$0 -> {
      if ($$0 instanceof com $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ar().a(axe.A);
   };
   static final cfr cc = cfr.b().e().d().a(cb);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public chk(bul<? extends chk> $$0, dfb $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   public int gw() {
      return this.am.a(bY);
   }

   public void b(int $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public void a(akl<?> $$0) {
      if (bY.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gw());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cwb X_() {
      return new cwb(cwf.qG);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new chk.a(this));
   }

   @Override
   public void l() {
      if (!this.dX().C && this.bM() && this.dk()) {
         if (this.bZ > 0) {
            if (this.gw() == 0) {
               this.b(awl.uQ);
               this.b(1);
            } else if (this.bZ > 40 && this.gw() == 1) {
               this.b(awl.uQ);
               this.b(2);
            }

            this.bZ++;
         } else if (this.gw() != 0) {
            if (this.ca > 60 && this.gw() == 2) {
               this.b(awl.uP);
               this.b(1);
            } else if (this.ca > 100 && this.gw() == 1) {
               this.b(awl.uP);
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
      if (this.bM() && this.gw() > 0) {
         for (bvc $$1 : this.dX().a(bvc.class, this.cS().g(0.3), $$0 -> cc.a(this, $$0))) {
            if ($$1.bM()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bvc $$0) {
      int $$1 = this.gw();
      if ($$0.a(this.dY().b((bva)this), (float)(1 + $$1))) {
         $$0.b(new btj(btl.s, 60 * $$1, 0), this);
         this.a(awl.uU, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(com $$0) {
      int $$1 = this.gw();
      if ($$0 instanceof aro && $$1 > 0 && $$0.a(this.dY().b((bva)this), (float)(1 + $$1))) {
         if (!this.bc()) {
            ((aro)$$0).g.b(new adl(adl.k, 0.0F));
         }

         $$0.b(new btj(btl.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awk w() {
      return awl.uO;
   }

   @Override
   protected awk o_() {
      return awl.uR;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.uT;
   }

   @Override
   protected awk gv() {
      return awl.uS;
   }

   @Override
   public buh e(bvm $$0) {
      return super.e($$0).a(c(this.gw()));
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

   static class a extends cby {
      private final chk a;

      public a(chk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bva> $$0 = this.a.dX().a(bva.class, this.a.cS().g(2.0), $$0x -> chk.cc.a(this.a, $$0x));
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
