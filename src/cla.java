import java.util.EnumSet;

public class cla extends clr {
   private float b = 0.5F;
   private int c;
   private static final akl<Byte> d = akp.a(cla.class, akn.a);

   public cla(bul<? extends cla> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.j, -1.0F);
      this.a(esb.i, 8.0F);
      this.a(esb.n, 0.0F);
      this.a(esb.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void D() {
      this.bS.a(4, new cla.a(this));
      this.bS.a(5, new ccm(this, 1.0));
      this.bS.a(7, new cdl(this, 1.0, 0.0F));
      this.bS.a(8, new ccg(this, com.class, 8.0F));
      this.bS.a(8, new cct(this));
      this.bT.a(1, new cdq(this).a());
      this.bT.a(2, new cdr<>(this, com.class, true));
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.c, 6.0).a(bwi.v, 0.23F).a(bwi.m, 48.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected awk w() {
      return awl.cg;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.cj;
   }

   @Override
   protected awk o_() {
      return awl.ci;
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Override
   public void n_() {
      if (!this.aK() && this.dA().e < 0.0) {
         this.h(this.dA().d(1.0, 0.6, 1.0));
      }

      if (this.dX().C) {
         if (this.af.a(24) == 0 && !this.bc()) {
            this.dX().a(this.dC() + 0.5, this.dE() + 0.5, this.dI() + 0.5, awl.ch, this.dn(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dX().a(lr.X, this.d(0.5), this.dF(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.n_();
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   protected void ac() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.af.a(0.5, 6.891);
      }

      bva $$0 = this.m();
      if ($$0 != null && $$0.dG() > this.dG() + (double)this.b && this.c($$0)) {
         ezn $$1 = this.dA();
         this.h(this.dA().b(0.0, (0.3F - $$1.e) * 0.3F, 0.0));
         this.as = true;
      }

      super.ac();
   }

   @Override
   public boolean bZ() {
      return this.t();
   }

   private boolean t() {
      return (this.am.a(d) & 1) != 0;
   }

   void x(boolean $$0) {
      byte $$1 = this.am.a(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.am.a(d, $$1);
   }

   static class a extends cby {
      private final cla a;
      private int b;
      private int c;
      private int d;

      public a(cla $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.a, cby.a.b));
      }

      @Override
      public boolean b() {
         bva $$0 = this.a.m();
         return $$0 != null && $$0.bM() && this.a.c($$0);
      }

      @Override
      public void d() {
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.x(false);
         this.d = 0;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         bva $$0 = this.a.m();
         if ($$0 != null) {
            boolean $$1 = this.a.Q().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bue)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.E($$0);
               }

               this.a.M().a($$0.dC(), $$0.dE(), $$0.dI(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dC() - this.a.dC();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dI() - this.a.dI();
               if (this.c <= 0) {
                  this.b++;
                  if (this.b == 1) {
                     this.c = 60;
                     this.a.x(true);
                  } else if (this.b <= 4) {
                     this.c = 6;
                  } else {
                     this.c = 100;
                     this.b = 0;
                     this.a.x(false);
                  }

                  if (this.b > 1) {
                     double $$6 = Math.sqrt(Math.sqrt($$2)) * 0.5;
                     if (!this.a.bc()) {
                        this.a.dX().a(null, 1018, this.a.dx(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        ezn $$8 = new ezn(this.a.ea().a($$3, 2.297 * $$6), $$4, this.a.ea().a($$5, 2.297 * $$6));
                        cpk $$9 = new cpk(this.a.dX(), this.a, $$8.d());
                        $$9.a_($$9.dC(), this.a.e(0.5) + 0.5, $$9.dI());
                        this.a.dX().b($$9);
                     }
                  }
               }

               this.a.K().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.M().a($$0.dC(), $$0.dE(), $$0.dI(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(bwi.m);
      }
   }
}
