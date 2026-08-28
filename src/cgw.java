import java.util.List;
import java.util.function.Predicate;

public class cgw extends cfz {
   private static final akh<Integer> bY = akl.a(cgw.class, akj.b);
   int bZ;
   int ca;
   private static final Predicate<bun> cb = $$0 -> {
      if ($$0 instanceof cnx $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ao().a(awz.A);
   };
   static final cfd cc = cfd.b().e().d().a(cb);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cgw(bty<? extends cgw> $$0, dej $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   public int gq() {
      return this.am.a(bY);
   }

   public void b(int $$0) {
      this.am.a(bY, $$0);
   }

   @Override
   public void a(akh<?> $$0) {
      if (bY.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gq());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cvs W_() {
      return new cvs(cvw.qG);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new cgw.a(this));
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && this.df()) {
         if (this.bZ > 0) {
            if (this.gq() == 0) {
               this.b(awg.uS);
               this.b(1);
            } else if (this.bZ > 40 && this.gq() == 1) {
               this.b(awg.uS);
               this.b(2);
            }

            this.bZ++;
         } else if (this.gq() != 0) {
            if (this.ca > 60 && this.gq() == 2) {
               this.b(awg.uR);
               this.b(1);
            } else if (this.ca > 100 && this.gq() == 1) {
               this.b(awg.uR);
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
      if (this.bI() && this.gq() > 0) {
         for (bup $$1 : this.dS().a(bup.class, this.cO().g(0.3), $$0 -> cc.a(this, $$0))) {
            if ($$1.bI()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bup $$0) {
      int $$1 = this.gq();
      if ($$0.a(this.dT().b((bun)this), (float)(1 + $$1))) {
         $$0.b(new bsy(bta.s, 60 * $$1, 0), this);
         this.a(awg.uW, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cnx $$0) {
      int $$1 = this.gq();
      if ($$0 instanceof ark && $$1 > 0 && $$0.a(this.dT().b((bun)this), (float)(1 + $$1))) {
         if (!this.ba()) {
            ((ark)$$0).c.b(new adh(adh.k, 0.0F));
         }

         $$0.b(new bsy(bta.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awf w() {
      return awg.uQ;
   }

   @Override
   protected awf o_() {
      return awg.uT;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.uV;
   }

   @Override
   protected awf gp() {
      return awg.uU;
   }

   @Override
   public btu e(buz $$0) {
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

   static class a extends cbk {
      private final cgw a;

      public a(cgw $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<bun> $$0 = this.a.dS().a(bun.class, this.a.cO().g(2.0), $$0x -> cgw.cc.a(this.a, $$0x));
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
