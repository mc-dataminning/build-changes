import java.util.EnumSet;

public class ceb extends cer {
   private float b = 0.5F;
   private int c;
   private static final aie<Byte> d = aih.a(ceb.class, aig.a);

   public ceb(bnw<? extends ceb> $$0, cvr $$1) {
      super($$0, $$1);
      this.a(ehh.j, -1.0F);
      this.a(ehh.i, 8.0F);
      this.a(ehh.n, 0.0F);
      this.a(ehh.o, 0.0F);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      this.bO.a(4, new ceb.a(this));
      this.bO.a(5, new bvt(this, 1.0));
      this.bO.a(7, new bws(this, 1.0, 0.0F));
      this.bO.a(8, new bvn(this, chl.class, 8.0F));
      this.bO.a(8, new bwa(this));
      this.bP.a(1, new bwx(this).a());
      this.bP.a(2, new bwy<>(this, chl.class, true));
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.c, 6.0).a(bpp.o, 0.23F).a(bpp.i, 48.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, (byte)0);
   }

   @Override
   protected atk y() {
      return atl.ce;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.ch;
   }

   @Override
   protected atk n_() {
      return atl.cg;
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
         if (this.af.a(24) == 0 && !this.aU()) {
            this.dM().a(this.dr() + 0.5, this.dt() + 0.5, this.dx() + 0.5, atl.cf, this.db(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jz.U, this.d(0.5), this.du(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.d_();
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   protected void aa() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.af.a(0.5, 6.891);
      }

      boi $$0 = this.q();
      if ($$0 != null && $$0.dv() > this.dv() + (double)this.b && this.c($$0)) {
         enz $$1 = this.dp();
         this.g(this.dp().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.at = true;
      }

      super.aa();
   }

   @Override
   public boolean bN() {
      return this.w();
   }

   private boolean w() {
      return (this.am.b(d) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.am.b(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.am.b(d, $$1);
   }

   static class a extends bvf {
      private final ceb a;
      private int b;
      private int c;
      private int d;

      public a(ceb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.a, bvf.a.b));
      }

      @Override
      public boolean a() {
         boi $$0 = this.a.q();
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
         boi $$0 = this.a.q();
         if ($$0 != null) {
            boolean $$1 = this.a.O().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.f((bnq)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.B($$0);
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
                        cih $$8 = new cih(this.a.dM(), this.a, this.a.eh().a($$3, 2.297 * $$6), $$4, this.a.eh().a($$5, 2.297 * $$6));
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
         return this.a.g(bpp.i);
      }
   }
}
