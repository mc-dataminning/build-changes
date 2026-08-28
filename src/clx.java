import java.util.EnumSet;

public class clx extends cmo {
   private float a = 0.5F;
   private int b;
   private static final aks<Byte> c = akw.a(clx.class, aku.a);

   public clx(bvi<? extends clx> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.j, -1.0F);
      this.a(euh.i, 8.0F);
      this.a(euh.n, 0.0F);
      this.a(euh.o, 0.0F);
      this.bO = 10;
   }

   @Override
   protected void B() {
      this.bT.a(4, new clx.a(this));
      this.bT.a(5, new cdj(this, 1.0));
      this.bT.a(7, new cei(this, 1.0, 0.0F));
      this.bT.a(8, new cdd(this, cpo.class, 8.0F));
      this.bT.a(8, new cdq(this));
      this.bU.a(1, new cen(this).a());
      this.bU.a(2, new ceo<>(this, cpo.class, true));
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.c, 6.0).a(bxf.v, 0.23F).a(bxf.m, 48.0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   protected awu u() {
      return awv.cg;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.cj;
   }

   @Override
   protected awu o_() {
      return awv.ci;
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
            this.dW().a(this.dB() + 0.5, this.dD() + 0.5, this.dH() + 0.5, awv.ch, this.dn(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dW().a(ls.Z, this.d(0.5), this.dE(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.d_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(arx $$0) {
      this.b--;
      if (this.b <= 0) {
         this.b = 100;
         this.a = (float)this.ae.a(0.5, 6.891);
      }

      bvx $$1 = this.O_();
      if ($$1 != null && $$1.dF() > this.dF() + (double)this.a && this.c($$1)) {
         fbr $$2 = this.dz();
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

   static class a extends ccv {
      private final clx a;
      private int b;
      private int c;
      private int d;

      public a(clx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccv.a.a, ccv.a.b));
      }

      @Override
      public boolean b() {
         bvx $$0 = this.a.O_();
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
         bvx $$0 = this.a.O_();
         if ($$0 != null) {
            boolean $$1 = this.a.N().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bvb)$$0);
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
                        fbr $$8 = new fbr(this.a.dZ().a($$3, 2.297 * $$6), $$4, this.a.dZ().a($$5, 2.297 * $$6));
                        cql $$9 = new cql(this.a.dW(), this.a, $$8.d());
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
         return this.a.h(bxf.m);
      }
   }
}
