import java.util.EnumSet;

public class cjm extends ckd {
   private float b = 0.5F;
   private int c;
   private static final ajw<Byte> d = aka.a(cjm.class, ajy.a);

   public cjm(bsx<? extends cjm> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.j, -1.0F);
      this.a(epv.i, 8.0F);
      this.a(epv.n, 0.0F);
      this.a(epv.o, 0.0F);
      this.bR = 10;
   }

   @Override
   protected void B() {
      this.bW.a(4, new cjm.a(this));
      this.bW.a(5, new cba(this, 1.0));
      this.bW.a(7, new cbz(this, 1.0, 0.0F));
      this.bW.a(8, new cau(this, cmx.class, 8.0F));
      this.bW.a(8, new cbh(this));
      this.bX.a(1, new cce(this).a());
      this.bX.a(2, new ccf<>(this, cmx.class, true));
   }

   public static buv.a s() {
      return ckd.gq().a(buw.c, 6.0).a(buw.v, 0.23F).a(buw.m, 48.0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected avo v() {
      return avp.cg;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.cj;
   }

   @Override
   protected avo n_() {
      return avp.ci;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   public void m_() {
      if (!this.aF() && this.dr().d < 0.0) {
         this.i(this.dr().d(1.0, 0.6, 1.0));
      }

      if (this.dO().B) {
         if (this.ah.a(24) == 0 && !this.aX()) {
            this.dO().a(this.dt() + 0.5, this.dv() + 0.5, this.dz() + 0.5, avp.ch, this.de(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dO().a(lm.X, this.d(0.5), this.dw(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.m_();
   }

   @Override
   public boolean fl() {
      return true;
   }

   @Override
   protected void ab() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ah.a(0.5, 6.891);
      }

      btn $$0 = this.p();
      if ($$0 != null && $$0.dx() > this.dx() + (double)this.b && this.c($$0)) {
         exc $$1 = this.dr();
         this.i(this.dr().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.av = true;
      }

      super.ab();
   }

   @Override
   public boolean bR() {
      return this.t();
   }

   private boolean t() {
      return (this.ao.a(d) & 1) != 0;
   }

   void x(boolean $$0) {
      byte $$1 = this.ao.a(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.ao.a(d, $$1);
   }

   static class a extends cam {
      private final cjm a;
      private int b;
      private int c;
      private int d;

      public a(cjm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean b() {
         btn $$0 = this.a.p();
         return $$0 != null && $$0.bE() && this.a.c($$0);
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
         btn $$0 = this.a.p();
         if ($$0 != null) {
            boolean $$1 = this.a.O().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bsr)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.D($$0);
               }

               this.a.J().a($$0.dt(), $$0.dv(), $$0.dz(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dt() - this.a.dt();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dz() - this.a.dz();
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
                     if (!this.a.aX()) {
                        this.a.dO().a(null, 1018, this.a.do(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        exc $$8 = new exc(this.a.dR().a($$3, 2.297 * $$6), $$4, this.a.dR().a($$5, 2.297 * $$6));
                        cnt $$9 = new cnt(this.a.dO(), this.a, $$8.d());
                        $$9.a_($$9.dt(), this.a.e(0.5) + 0.5, $$9.dz());
                        this.a.dO().b($$9);
                     }
                  }
               }

               this.a.I().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.J().a($$0.dt(), $$0.dv(), $$0.dz(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.g(buw.m);
      }
   }
}
