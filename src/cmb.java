import java.util.EnumSet;

public class cmb extends cms {
   private float a = 0.5F;
   private int b;
   private static final ajx<Byte> c = akb.a(cmb.class, ajz.a);

   public cmb(bvi<? extends cmb> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.j, -1.0F);
      this.a(eun.i, 8.0F);
      this.a(eun.n, 0.0F);
      this.a(eun.o, 0.0F);
      this.bx = 10;
   }

   @Override
   protected void D() {
      this.bC.a(4, new cmb.a(this));
      this.bC.a(5, new cdk(this, 1.0));
      this.bC.a(7, new cej(this, 1.0, 0.0F));
      this.bC.a(8, new cde(this, cpr.class, 8.0F));
      this.bC.a(8, new cdr(this));
      this.bD.a(1, new ceo(this).a());
      this.bD.a(2, new cep<>(this, cpr.class, true));
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.c, 6.0).a(bxg.v, 0.23F).a(bxg.m, 48.0);
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
   protected avz e(btp $$0) {
      return awa.cj;
   }

   @Override
   protected avz l_() {
      return awa.ci;
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Override
   public void k_() {
      if (!this.aJ() && this.dx().e < 0.0) {
         this.i(this.dx().d(1.0, 0.6, 1.0));
      }

      if (this.dU().C) {
         if (this.ae.a(24) == 0 && !this.bb()) {
            this.dU().a(this.dz() + 0.5, this.dB() + 0.5, this.dF() + 0.5, awa.ch, this.dl(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dU().a(lt.aa, this.d(0.5), this.dC(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.k_();
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   protected void a(ard $$0) {
      this.b--;
      if (this.b <= 0) {
         this.b = 100;
         this.a = (float)this.ae.a(0.5, 6.891);
      }

      bvy $$1 = this.f();
      if ($$1 != null && $$1.dD() > this.dD() + (double)this.a && this.c($$1)) {
         fbx $$2 = this.dx();
         this.i(this.dx().b(0.0, (0.3F - $$2.e) * 0.3F, 0.0));
         this.ar = true;
      }

      super.a($$0);
   }

   @Override
   public boolean bX() {
      return this.m();
   }

   private boolean m() {
      return (this.al.a(c) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.al.a(c);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.al.a(c, $$1);
   }

   static class a extends ccw {
      private final cmb a;
      private int b;
      private int c;
      private int d;

      public a(cmb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean b() {
         bvy $$0 = this.a.f();
         return $$0 != null && $$0.bJ() && this.a.c($$0);
      }

      @Override
      public void d() {
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.w(false);
         this.d = 0;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         this.c--;
         bvy $$0 = this.a.f();
         if ($$0 != null) {
            boolean $$1 = this.a.P().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bva)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.c(a(this.a), $$0);
               }

               this.a.L().a($$0.dz(), $$0.dB(), $$0.dF(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dz() - this.a.dz();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dF() - this.a.dF();
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
                     if (!this.a.bb()) {
                        this.a.dU().a(null, 1018, this.a.du(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        fbx $$8 = new fbx(this.a.dX().a($$3, 2.297 * $$6), $$4, this.a.dX().a($$5, 2.297 * $$6));
                        cqo $$9 = new cqo(this.a.dU(), this.a, $$8.d());
                        $$9.a_($$9.dz(), this.a.e(0.5) + 0.5, $$9.dF());
                        this.a.dU().b($$9);
                     }
                  }
               }

               this.a.J().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.L().a($$0.dz(), $$0.dB(), $$0.dF(), 1.0);
            }

            super.a();
         }
      }

      private double h() {
         return this.a.h(bxg.m);
      }
   }
}
