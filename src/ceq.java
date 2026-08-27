import java.util.EnumSet;

public class ceq extends cfg {
   private float b = 0.5F;
   private int c;
   private static final aii<Byte> d = ail.a(ceq.class, aik.a);

   public ceq(bol<? extends ceq> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.j, -1.0F);
      this.a(eic.i, 8.0F);
      this.a(eic.n, 0.0F);
      this.a(eic.o, 0.0F);
      this.bK = 10;
   }

   @Override
   protected void B() {
      this.bP.a(4, new ceq.a(this));
      this.bP.a(5, new bwi(this, 1.0));
      this.bP.a(7, new bxh(this, 1.0, 0.0F));
      this.bP.a(8, new bwc(this, cia.class, 8.0F));
      this.bP.a(8, new bwp(this));
      this.bQ.a(1, new bxm(this).a());
      this.bQ.a(2, new bxn<>(this, cia.class, true));
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.c, 6.0).a(bqe.o, 0.23F).a(bqe.i, 48.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, (byte)0);
   }

   @Override
   protected ato y() {
      return atp.ce;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.ch;
   }

   @Override
   protected ato n_() {
      return atp.cg;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   public void d_() {
      if (!this.aC() && this.dm().d < 0.0) {
         this.g(this.dm().d(1.0, 0.6, 1.0));
      }

      if (this.dJ().B) {
         if (this.af.a(24) == 0 && !this.aU()) {
            this.dJ().a(this.do() + 0.5, this.dq() + 0.5, this.du() + 0.5, atp.cf, this.cY(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dJ().a(kb.U, this.d(0.5), this.dr(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.d_();
   }

   @Override
   public boolean fj() {
      return true;
   }

   @Override
   protected void aa() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.af.a(0.5, 6.891);
      }

      box $$0 = this.q();
      if ($$0 != null && $$0.ds() > this.ds() + (double)this.b && this.c($$0)) {
         eov $$1 = this.dm();
         this.g(this.dm().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.at = true;
      }

      super.aa();
   }

   @Override
   public boolean bK() {
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

   static class a extends bvu {
      private final ceq a;
      private int b;
      private int c;
      private int d;

      public a(ceq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean a() {
         box $$0 = this.a.q();
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
         box $$0 = this.a.q();
         if ($$0 != null) {
            boolean $$1 = this.a.O().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.f((bof)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.B($$0);
               }

               this.a.K().a($$0.do(), $$0.dq(), $$0.du(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.do() - this.a.do();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.du() - this.a.du();
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
                        this.a.dJ().a(null, 1018, this.a.dj(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        ciw $$8 = new ciw(this.a.dJ(), this.a, this.a.ef().a($$3, 2.297 * $$6), $$4, this.a.ef().a($$5, 2.297 * $$6));
                        $$8.a_($$8.do(), this.a.e(0.5) + 0.5, $$8.du());
                        this.a.dJ().b($$8);
                     }
                  }
               }

               this.a.I().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.K().a($$0.do(), $$0.dq(), $$0.du(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.g(bqe.i);
      }
   }
}
