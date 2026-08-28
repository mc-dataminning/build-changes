import java.util.List;
import javax.annotation.Nullable;

public class clk extends cmb {
   @Nullable
   private chn b;

   public clk(bul<? extends clk> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new clk.b());
      this.bS.a(2, new cbf<>(this, com.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new clk.c());
      this.bS.a(5, new clk.a());
      this.bS.a(6, new clk.d());
      this.bS.a(8, new ccv(this, 0.6));
      this.bS.a(9, new ccg(this, com.class, 3.0F, 1.0F));
      this.bS.a(10, new ccg(this, bvc.class, 8.0F));
      this.bT.a(1, new cdq(this, cqb.class).a());
      this.bT.a(2, new cdr<>(this, com.class, true).c(300));
      this.bT.a(3, new cdr<>(this, cnt.class, false).c(300));
      this.bT.a(3, new cdr<>(this, chd.class, false));
   }

   public static bwh.a t() {
      return clr.gA().a(bwi.v, 0.5).a(bwi.m, 12.0).a(bwi.s, 24.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
   }

   @Override
   public awk aj_() {
      return awl.iA;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
   }

   @Override
   protected void ac() {
      super.ac();
   }

   @Override
   protected boolean t(bue $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cmf $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected awk w() {
      return awl.iy;
   }

   @Override
   protected awk o_() {
      return awl.iB;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.iD;
   }

   void a(@Nullable chn $$0) {
      this.b = $$0;
   }

   @Nullable
   chn gP() {
      return this.b;
   }

   @Override
   protected awk gu() {
      return awl.iz;
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
   }

   class a extends cmb.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         bva $$0 = clk.this.m();
         double $$1 = Math.min($$0.dE(), clk.this.dE());
         double $$2 = Math.max($$0.dE(), clk.this.dE()) + 1.0;
         float $$3 = (float)azk.d($$0.dI() - clk.this.dI(), $$0.dC() - clk.this.dC());
         if (clk.this.g((bue)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(clk.this.dC() + (double)azk.b($$5) * 1.5, clk.this.dI() + (double)azk.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(clk.this.dC() + (double)azk.b($$7) * 2.5, clk.this.dI() + (double)azk.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(clk.this.dC() + (double)azk.b($$3) * $$9, clk.this.dI() + (double)azk.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jh $$6 = jh.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jh $$9 = $$6.e();
            dvj $$10 = clk.this.dX().a_($$9);
            if ($$10.c(clk.this.dX(), $$9, jm.b)) {
               if (!clk.this.dX().u($$6)) {
                  dvj $$11 = clk.this.dX().a_($$6);
                  fah $$12 = $$11.g(clk.this.dX(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jm.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azk.a($$2) - 1);

         if ($$7) {
            clk.this.dX().b(new coy(clk.this.dX(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, clk.this));
            clk.this.dX().a(eag.t, new ezn($$0, (double)$$6.v() + $$8, $$1), eag.a.a(clk.this));
         }
      }

      @Override
      protected awk l() {
         return awl.iE;
      }

      @Override
      protected cmb.a m() {
         return cmb.a.c;
      }
   }

   class b extends cmb.b {
      @Override
      public void a() {
         if (clk.this.m() != null) {
            clk.this.K().a(clk.this.m(), (float)clk.this.ae(), (float)clk.this.ad());
         } else if (clk.this.gP() != null) {
            clk.this.K().a(clk.this.gP(), (float)clk.this.ae(), (float)clk.this.ad());
         }
      }
   }

   class c extends cmb.c {
      private final cfr e = cfr.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = clk.this.dX().a(cmf.class, this.e, clk.this, clk.this.cS().g(16.0)).size();
            return clk.this.af.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         arn $$0 = (arn)clk.this.dX();
         fan $$1 = clk.this.cs();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jh $$3 = clk.this.dx().b(-2 + clk.this.af.a(5), 1, -2 + clk.this.af.a(5));
            cmf $$4 = bul.bi.a(clk.this.dX(), buk.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, clk.this.dX().d_($$3), buk.f, null);
               $$4.a(clk.this);
               $$4.h($$3);
               $$4.b(20 * (30 + clk.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cJ(), $$1);
               }

               $$0.a_($$4);
               $$0.a(eag.t, $$3, eag.a.a(clk.this));
            }
         }
      }

      @Override
      protected awk l() {
         return awl.iF;
      }

      @Override
      protected cmb.a m() {
         return cmb.a.b;
      }
   }

   public class d extends cmb.c {
      private final cfr e = cfr.b().a(16.0).a($$0x -> ((chn)$$0x).t() == cuy.l);

      @Override
      public boolean b() {
         if (clk.this.m() != null) {
            return false;
         } else if (clk.this.gE()) {
            return false;
         } else if (clk.this.ag < this.c) {
            return false;
         } else if (!clk.this.dX().ac().b(dex.c)) {
            return false;
         } else {
            List<chn> $$0 = clk.this.dX().a(chn.class, this.e, clk.this, clk.this.cS().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               clk.this.a($$0.get(clk.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return clk.this.gP() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         clk.this.a(null);
      }

      @Override
      protected void k() {
         chn $$0 = clk.this.gP();
         if ($$0 != null && $$0.bM()) {
            $$0.b(cuy.o);
         }
      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected awk l() {
         return awl.iG;
      }

      @Override
      protected cmb.a m() {
         return cmb.a.d;
      }
   }
}
