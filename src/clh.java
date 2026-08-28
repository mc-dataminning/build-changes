import java.util.EnumSet;

public class clh extends cly {
   private float a = 0.5F;
   private int b;
   private static final akm<Byte> c = akq.a(clh.class, ako.a);

   public clh(bus<? extends clh> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.j, -1.0F);
      this.a(esm.i, 8.0F);
      this.a(esm.n, 0.0F);
      this.a(esm.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void B() {
      this.bS.a(4, new clh.a(this));
      this.bS.a(5, new cct(this, 1.0));
      this.bS.a(7, new cds(this, 1.0, 0.0F));
      this.bS.a(8, new ccn(this, cou.class, 8.0F));
      this.bS.a(8, new cda(this));
      this.bT.a(1, new cdx(this).a());
      this.bT.a(2, new cdy<>(this, cou.class, true));
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.c, 6.0).a(bwp.v, 0.23F).a(bwp.m, 48.0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   protected awm t() {
      return awn.cg;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.cj;
   }

   @Override
   protected awm n_() {
      return awn.ci;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public void d_() {
      if (!this.aJ() && this.dy().e < 0.0) {
         this.h(this.dy().d(1.0, 0.6, 1.0));
      }

      if (this.dV().C) {
         if (this.ae.a(24) == 0 && !this.bb()) {
            this.dV().a(this.dA() + 0.5, this.dC() + 0.5, this.dG() + 0.5, awn.ch, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(ls.X, this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.d_();
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   protected void a(arp $$0) {
      this.b--;
      if (this.b <= 0) {
         this.b = 100;
         this.a = (float)this.ae.a(0.5, 6.891);
      }

      bvh $$1 = this.aa_();
      if ($$1 != null && $$1.dE() > this.dE() + (double)this.a && this.c($$1)) {
         ezy $$2 = this.dy();
         this.h(this.dy().b(0.0, (0.3F - $$2.e) * 0.3F, 0.0));
         this.ar = true;
      }

      super.a($$0);
   }

   @Override
   public boolean bY() {
      return this.q();
   }

   private boolean q() {
      return (this.al.a(c) & 1) != 0;
   }

   void x(boolean $$0) {
      byte $$1 = this.al.a(c);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.al.a(c, $$1);
   }

   static class a extends ccf {
      private final clh a;
      private int b;
      private int c;
      private int d;

      public a(clh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         bvh $$0 = this.a.aa_();
         return $$0 != null && $$0.bL() && this.a.c($$0);
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
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         bvh $$0 = this.a.aa_();
         if ($$0 != null) {
            boolean $$1 = this.a.N().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bul)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.c(a(this.a), $$0);
               }

               this.a.I().a($$0.dA(), $$0.dC(), $$0.dG(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dA() - this.a.dA();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dG() - this.a.dG();
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
                     if (!this.a.bb()) {
                        this.a.dV().a(null, 1018, this.a.dv(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        ezy $$8 = new ezy(this.a.dY().a($$3, 2.297 * $$6), $$4, this.a.dY().a($$5, 2.297 * $$6));
                        cpr $$9 = new cpr(this.a.dV(), this.a, $$8.d());
                        $$9.a_($$9.dA(), this.a.e(0.5) + 0.5, $$9.dG());
                        this.a.dV().b($$9);
                     }
                  }
               }

               this.a.H().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.I().a($$0.dA(), $$0.dC(), $$0.dG(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(bwp.m);
      }
   }
}
