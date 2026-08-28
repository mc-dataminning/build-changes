import java.util.EnumSet;

public class cli extends clz {
   private float a = 0.5F;
   private int b;
   private static final ajy<Byte> c = akc.a(cli.class, aka.a);

   public cli(but<? extends cli> $$0, dgj $$1) {
      super($$0, $$1);
      this.a(etr.j, -1.0F);
      this.a(etr.i, 8.0F);
      this.a(etr.n, 0.0F);
      this.a(etr.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void E() {
      this.bS.a(4, new cli.a(this));
      this.bS.a(5, new ccu(this, 1.0));
      this.bS.a(7, new cdt(this, 1.0, 0.0F));
      this.bS.a(8, new cco(this, coy.class, 8.0F));
      this.bS.a(8, new cdb(this));
      this.bT.a(1, new cdy(this).a());
      this.bT.a(2, new cdz<>(this, coy.class, true));
   }

   public static bwp.a m() {
      return clz.gx().a(bwq.c, 6.0).a(bwq.v, 0.23F).a(bwq.m, 48.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   protected avz u() {
      return awa.cg;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.cj;
   }

   @Override
   protected avz o_() {
      return awa.ci;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public void d_() {
      if (!this.aJ() && this.dy().e < 0.0) {
         this.i(this.dy().d(1.0, 0.6, 1.0));
      }

      if (this.dV().C) {
         if (this.ae.a(24) == 0 && !this.bb()) {
            this.dV().a(this.dA() + 0.5, this.dC() + 0.5, this.dG() + 0.5, awa.ch, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lt.Z, this.d(0.5), this.dD(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.d_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(ard $$0) {
      this.b--;
      if (this.b <= 0) {
         this.b = 100;
         this.a = (float)this.ae.a(0.5, 6.891);
      }

      bvi $$1 = this.O_();
      if ($$1 != null && $$1.dE() > this.dE() + (double)this.a && this.c($$1)) {
         fbb $$2 = this.dy();
         this.i(this.dy().b(0.0, (0.3F - $$2.e) * 0.3F, 0.0));
         this.ar = true;
      }

      super.a($$0);
   }

   @Override
   public boolean bY() {
      return this.p();
   }

   private boolean p() {
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

   static class a extends ccg {
      private final cli a;
      private int b;
      private int c;
      private int d;

      public a(cli $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccg.a.a, ccg.a.b));
      }

      @Override
      public boolean b() {
         bvi $$0 = this.a.O_();
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
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         bvi $$0 = this.a.O_();
         if ($$0 != null) {
            boolean $$1 = this.a.Q().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bum)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.c(a(this.a), $$0);
               }

               this.a.N().a($$0.dA(), $$0.dC(), $$0.dG(), 1.0);
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
                        fbb $$8 = new fbb(this.a.dY().a($$3, 2.297 * $$6), $$4, this.a.dY().a($$5, 2.297 * $$6));
                        cpv $$9 = new cpv(this.a.dV(), this.a, $$8.d());
                        $$9.a_($$9.dA(), this.a.e(0.5) + 0.5, $$9.dG());
                        this.a.dV().b($$9);
                     }
                  }
               }

               this.a.L().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.N().a($$0.dA(), $$0.dC(), $$0.dG(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(bwq.m);
      }
   }
}
