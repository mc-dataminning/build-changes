import java.util.EnumSet;

public class cbz extends ccp {
   private float b = 0.5F;
   private int c;
   private static final agm<Byte> d = agp.a(cbz.class, ago.a);

   public cbz(blz<? extends cbz> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.j, -1.0F);
      this.a(efc.i, 8.0F);
      this.a(efc.n, 0.0F);
      this.a(efc.o, 0.0F);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      this.bO.a(4, new cbz.a(this));
      this.bO.a(5, new btv(this, 1.0));
      this.bO.a(7, new buu(this, 1.0, 0.0F));
      this.bO.a(8, new btp(this, cfi.class, 8.0F));
      this.bO.a(8, new buc(this));
      this.bP.a(1, new buz(this).a());
      this.bP.a(2, new bva<>(this, cfi.class, true));
   }

   public static bnq.a u() {
      return ccp.gk().a(bnr.c, 6.0).a(bnr.m, 0.23F).a(bnr.g, 48.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, (byte)0);
   }

   @Override
   protected arr y() {
      return ars.bR;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.bU;
   }

   @Override
   protected arr n_() {
      return ars.bT;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   public void d_() {
      if (!this.aC() && this.dp().d < 0.0) {
         this.g(this.dp().d(1.0, 0.6, 1.0));
      }

      if (this.dM().B) {
         if (this.ag.a(24) == 0 && !this.aU()) {
            this.dM().a(this.dr() + 0.5, this.dt() + 0.5, this.dx() + 0.5, ars.bS, this.db(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jx.U, this.d(0.5), this.du(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.d_();
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   protected void Z() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ag.a(0.5, 6.891);
      }

      bml $$0 = this.q();
      if ($$0 != null && $$0.dv() > this.dv() + (double)this.b && this.c($$0)) {
         elt $$1 = this.dp();
         this.g(this.dp().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.au = true;
      }

      super.Z();
   }

   @Override
   public boolean bN() {
      return this.w();
   }

   private boolean w() {
      return (this.an.b(d) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.an.b(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.an.b(d, $$1);
   }

   static class a extends bth {
      private final cbz a;
      private int b;
      private int c;
      private int d;

      public a(cbz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bth.a.a, bth.a.b));
      }

      @Override
      public boolean a() {
         bml $$0 = this.a.q();
         return $$0 != null && $$0.bx() && this.a.c($$0);
      }

      @Override
      public void c() {
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.w(false);
         this.d = 0;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.c--;
         bml $$0 = this.a.q();
         if ($$0 != null) {
            boolean $$1 = this.a.O().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.f((blv)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.C($$0);
               }

               this.a.K().a($$0.dr(), $$0.dt(), $$0.dx(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dr() - this.a.dr();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dx() - this.a.dx();
               if (this.c <= 0) {
                  this.b++;
                  if (this.b == 1) {
                     this.c = 60;
                     this.a.w(true);
                  } else if (this.b <= 4) {
                     this.c = 6;
                  } else {
                     this.c = 100;
                     this.b = 0;
                     this.a.w(false);
                  }

                  if (this.b > 1) {
                     double $$6 = Math.sqrt(Math.sqrt($$2)) * 0.5;
                     if (!this.a.aU()) {
                        this.a.dM().a(null, 1018, this.a.dm(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        cgd $$8 = new cgd(this.a.dM(), this.a, this.a.eg().a($$3, 2.297 * $$6), $$4, this.a.eg().a($$5, 2.297 * $$6));
                        $$8.a_($$8.dr(), this.a.e(0.5) + 0.5, $$8.dx());
                        this.a.dM().b($$8);
                     }
                  }
               }

               this.a.I().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.K().a($$0.dr(), $$0.dt(), $$0.dx(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.b(bnr.g);
      }
   }
}
