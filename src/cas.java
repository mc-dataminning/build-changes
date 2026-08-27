import java.util.EnumSet;

public class cas extends cbi {
   private float b = 0.5F;
   private int c;
   private static final afo<Byte> d = afr.a(cas.class, afq.a);

   public cas(bku<? extends cas> $$0, csa $$1) {
      super($$0, $$1);
      this.a(edd.j, -1.0F);
      this.a(edd.i, 8.0F);
      this.a(edd.n, 0.0F);
      this.a(edd.o, 0.0F);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      this.bO.a(4, new cas.a(this));
      this.bO.a(5, new bsp(this, 1.0));
      this.bO.a(7, new bto(this, 1.0, 0.0F));
      this.bO.a(8, new bsj(this, cdu.class, 8.0F));
      this.bO.a(8, new bsw(this));
      this.bP.a(1, new btt(this).a());
      this.bP.a(2, new btu<>(this, cdu.class, true));
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.c, 6.0).a(bmm.m, 0.23F).a(bmm.g, 48.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, (byte)0);
   }

   @Override
   protected aqq y() {
      return aqr.bR;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.bU;
   }

   @Override
   protected aqq m_() {
      return aqr.bT;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   public void c_() {
      if (!this.aC() && this.dq().d < 0.0) {
         this.g(this.dq().d(1.0, 0.6, 1.0));
      }

      if (this.dN().B) {
         if (this.ag.a(24) == 0 && !this.aU()) {
            this.dN().a(this.ds() + 0.5, this.du() + 0.5, this.dy() + 0.5, aqr.bS, this.dc(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(js.S, this.d(0.5), this.dv(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.c_();
   }

   @Override
   public boolean fi() {
      return true;
   }

   @Override
   protected void Z() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ag.a(0.5, 6.891);
      }

      blg $$0 = this.q();
      if ($$0 != null && $$0.dw() > this.dw() + (double)this.b && this.c($$0)) {
         eju $$1 = this.dq();
         this.g(this.dq().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
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

   static class a extends bsb {
      private final cas a;
      private int b;
      private int c;
      private int d;

      public a(cas $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }

      @Override
      public boolean a() {
         blg $$0 = this.a.q();
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
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         this.c--;
         blg $$0 = this.a.q();
         if ($$0 != null) {
            boolean $$1 = this.a.O().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.f((bkq)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.C($$0);
               }

               this.a.K().a($$0.ds(), $$0.du(), $$0.dy(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.ds() - this.a.ds();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dy() - this.a.dy();
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
                        this.a.dN().a(null, 1018, this.a.dn(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        cep $$8 = new cep(this.a.dN(), this.a, this.a.eh().a($$3, 2.297 * $$6), $$4, this.a.eh().a($$5, 2.297 * $$6));
                        $$8.a_($$8.ds(), this.a.e(0.5) + 0.5, $$8.dy());
                        this.a.dN().b($$8);
                     }
                  }
               }

               this.a.I().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.K().a($$0.ds(), $$0.du(), $$0.dy(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.b(bmm.g);
      }
   }
}
