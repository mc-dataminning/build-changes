import java.util.List;
import java.util.function.Predicate;

public class cbx extends cbb {
   private static final aim<Integer> e = aiq.a(cbx.class, aio.b);
   int bX;
   int bY;
   private static final Predicate<bpp> bZ = $$0 -> {
      if ($$0 instanceof ciu $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ai().a(auq.A);
   };
   static final caf ca = caf.b().e().d().a(bZ);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cbx(bpd<? extends cbx> $$0, cxb $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gp() {
      return this.an.a(e);
   }

   public void c(int $$0) {
      this.an.a(e, $$0);
   }

   @Override
   public void a(aim<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gp());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cqm b() {
      return new cqm(cqp.qE);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(1, new cbx.a(this));
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bA() && this.cY()) {
         if (this.bX > 0) {
            if (this.gp() == 0) {
               this.b(aty.us);
               this.c(1);
            } else if (this.bX > 40 && this.gp() == 1) {
               this.b(aty.us);
               this.c(2);
            }

            this.bX++;
         } else if (this.gp() != 0) {
            if (this.bY > 60 && this.gp() == 2) {
               this.b(aty.ur);
               this.c(1);
            } else if (this.bY > 100 && this.gp() == 1) {
               this.b(aty.ur);
               this.c(0);
            }

            this.bY++;
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bA() && this.gp() > 0) {
         for (bpr $$1 : this.dM().a(bpr.class, this.cH().g(0.3), $$0 -> ca.a(this, $$0))) {
            if ($$1.bA()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bpr $$0) {
      int $$1 = this.gp();
      if ($$0.a(this.dN().b((bpp)this), (float)(1 + $$1))) {
         $$0.b(new bok(bom.s, 60 * $$1, 0), this);
         this.a(aty.uw, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(ciu $$0) {
      int $$1 = this.gp();
      if ($$0 instanceof apg && $$1 > 0 && $$0.a(this.dN().b((bpp)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((apg)$$0).d.b(new abt(abt.k, 0.0F));
         }

         $$0.b(new bok(bom.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected atx v() {
      return aty.uq;
   }

   @Override
   protected atx n_() {
      return aty.ut;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.uv;
   }

   @Override
   protected atx go() {
      return aty.uu;
   }

   @Override
   public bpa e(bqa $$0) {
      return super.e($$0).a(t(this.gp()));
   }

   private static float t(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends bwm {
      private final cbx a;

      public a(cbx $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bpp> $$0 = this.a.dM().a(bpp.class, this.a.cH().g(2.0), $$0x -> cbx.ca.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bX = 1;
         this.a.bY = 0;
      }

      @Override
      public void d() {
         this.a.bX = 0;
      }
   }
}
