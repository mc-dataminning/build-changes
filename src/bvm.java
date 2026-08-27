import java.util.EnumSet;

public class bvm extends bwc {
   private float b = 0.5F;
   private int c;
   private static final aby<Byte> d = acb.a(bvm.class, aca.a);

   public bvm(bfn<? extends bvm> $$0, cmm $$1) {
      super($$0, $$1);
      this.a(dxp.j, -1.0F);
      this.a(dxp.i, 8.0F);
      this.a(dxp.n, 0.0F);
      this.a(dxp.o, 0.0F);
      this.bJ = 10;
   }

   @Override
   protected void x() {
      this.bO.a(4, new bvm.a(this));
      this.bO.a(5, new bnj(this, 1.0));
      this.bO.a(7, new boi(this, 1.0, 0.0F));
      this.bO.a(8, new bnd(this, byo.class, 8.0F));
      this.bO.a(8, new bnq(this));
      this.bP.a(1, new bon(this).a());
      this.bP.a(2, new boo<>(this, byo.class, true));
   }

   public static bhf.a q() {
      return bwc.ge().a(bhg.f, 6.0).a(bhg.d, 0.23F).a(bhg.b, 48.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(d, (byte)0);
   }

   @Override
   protected amg s() {
      return amh.bR;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.bU;
   }

   @Override
   protected amg g_() {
      return amh.bT;
   }

   @Override
   public float bj() {
      return 1.0F;
   }

   @Override
   public void b_() {
      if (!this.ay() && this.dl().d < 0.0) {
         this.f(this.dl().d(1.0, 0.6, 1.0));
      }

      if (this.dI().B) {
         if (this.af.a(24) == 0 && !this.aQ()) {
            this.dI().a(this.dn() + 0.5, this.dp() + 0.5, this.dt() + 0.5, amh.bS, this.cY(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dI().a(iv.S, this.d(0.5), this.dq(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.b_();
   }

   @Override
   public boolean fb() {
      return true;
   }

   @Override
   protected void W() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.af.a(0.5, 6.891);
      }

      bfz $$0 = this.j();
      if ($$0 != null && $$0.dr() > this.dr() + (double)this.b && this.c($$0)) {
         eei $$1 = this.dl();
         this.f(this.dl().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.at = true;
      }

      super.W();
   }

   @Override
   public boolean bL() {
      return this.r();
   }

   private boolean r() {
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

   static class a extends bmv {
      private final bvm a;
      private int b;
      private int c;
      private int d;

      public a(bvm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.a, bmv.a.b));
      }

      @Override
      public boolean a() {
         bfz $$0 = this.a.j();
         return $$0 != null && $$0.bs() && this.a.c($$0);
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
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         this.c--;
         bfz $$0 = this.a.j();
         if ($$0 != null) {
            boolean $$1 = this.a.K().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.f((bfj)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.z($$0);
               }

               this.a.G().a($$0.dn(), $$0.dp(), $$0.dt(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.dn() - this.a.dn();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dt() - this.a.dt();
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
                     if (!this.a.aQ()) {
                        this.a.dI().a(null, 1018, this.a.di(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        bzj $$8 = new bzj(this.a.dI(), this.a, this.a.ec().a($$3, 2.297 * $$6), $$4, this.a.ec().a($$5, 2.297 * $$6));
                        $$8.e($$8.dn(), this.a.e(0.5) + 0.5, $$8.dt());
                        this.a.dI().b($$8);
                     }
                  }
               }

               this.a.E().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.G().a($$0.dn(), $$0.dp(), $$0.dt(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.b(bhg.b);
      }
   }
}
