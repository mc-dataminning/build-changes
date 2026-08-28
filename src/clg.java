import java.util.EnumSet;

public class clg extends clx {
   private float a = 0.5F;
   private int b;
   private static final ajx<Byte> c = akb.a(clg.class, ajz.a);

   public clg(bur<? extends clg> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.j, -1.0F);
      this.a(etq.i, 8.0F);
      this.a(etq.n, 0.0F);
      this.a(etq.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void B() {
      this.bS.a(4, new clg.a(this));
      this.bS.a(5, new ccs(this, 1.0));
      this.bS.a(7, new cdr(this, 1.0, 0.0F));
      this.bS.a(8, new ccm(this, cox.class, 8.0F));
      this.bS.a(8, new ccz(this));
      this.bT.a(1, new cdw(this).a());
      this.bT.a(2, new cdx<>(this, cox.class, true));
   }

   public static bwn.a m() {
      return clx.gu().a(bwo.c, 6.0).a(bwo.v, 0.23F).a(bwo.m, 48.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   protected avz u() {
      return awa.cg;
   }

   @Override
   protected avz e(bta $$0) {
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
      if (!this.aJ() && this.dz().e < 0.0) {
         this.h(this.dz().d(1.0, 0.6, 1.0));
      }

      if (this.dW().C) {
         if (this.ae.a(24) == 0 && !this.bb()) {
            this.dW().a(this.dB() + 0.5, this.dD() + 0.5, this.dH() + 0.5, awa.ch, this.dn(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dW().a(lt.Z, this.d(0.5), this.dE(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.d_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(arc $$0) {
      this.b--;
      if (this.b <= 0) {
         this.b = 100;
         this.a = (float)this.ae.a(0.5, 6.891);
      }

      bvg $$1 = this.O_();
      if ($$1 != null && $$1.dF() > this.dF() + (double)this.a && this.c($$1)) {
         fba $$2 = this.dz();
         this.h(this.dz().b(0.0, (0.3F - $$2.e) * 0.3F, 0.0));
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

   static class a extends cce {
      private final clg a;
      private int b;
      private int c;
      private int d;

      public a(clg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean b() {
         bvg $$0 = this.a.O_();
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
         bvg $$0 = this.a.O_();
         if ($$0 != null) {
            boolean $$1 = this.a.N().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((buk)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.c(a(this.a), $$0);
               }

               this.a.I().a($$0.dB(), $$0.dD(), $$0.dH(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dB() - this.a.dB();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dH() - this.a.dH();
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
                        this.a.dW().a(null, 1018, this.a.dw(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        fba $$8 = new fba(this.a.dZ().a($$3, 2.297 * $$6), $$4, this.a.dZ().a($$5, 2.297 * $$6));
                        cpu $$9 = new cpu(this.a.dW(), this.a, $$8.d());
                        $$9.a_($$9.dB(), this.a.e(0.5) + 0.5, $$9.dH());
                        this.a.dW().b($$9);
                     }
                  }
               }

               this.a.H().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.I().a($$0.dB(), $$0.dD(), $$0.dH(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(bwo.m);
      }
   }
}
