import java.util.EnumSet;

public class cjl extends ckc {
   private float b = 0.5F;
   private int c;
   private static final akj<Byte> d = akn.a(cjl.class, akl.a);

   public cjl(bsz<? extends cjl> $$0, dbx $$1) {
      super($$0, $$1);
      this.a(eol.j, -1.0F);
      this.a(eol.i, 8.0F);
      this.a(eol.n, 0.0F);
      this.a(eol.o, 0.0F);
      this.bN = 10;
   }

   @Override
   protected void z() {
      this.bS.a(4, new cjl.a(this));
      this.bS.a(5, new cba(this, 1.0));
      this.bS.a(7, new cbz(this, 1.0, 0.0F));
      this.bS.a(8, new cau(this, cmw.class, 8.0F));
      this.bS.a(8, new cbh(this));
      this.bT.a(1, new cce(this).a());
      this.bT.a(2, new ccf<>(this, cmw.class, true));
   }

   public static buv.a s() {
      return ckc.gw().a(buw.c, 6.0).a(buw.r, 0.23F).a(buw.k, 48.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   protected avy v() {
      return avz.cg;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.cj;
   }

   @Override
   protected avy o_() {
      return avz.ci;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Override
   public void n_() {
      if (!this.aE() && this.ds().d < 0.0) {
         this.h(this.ds().d(1.0, 0.6, 1.0));
      }

      if (this.dP().B) {
         if (this.ah.a(24) == 0 && !this.aW()) {
            this.dP().a(this.du() + 0.5, this.dw() + 0.5, this.dA() + 0.5, avz.ch, this.de(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }

         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dP().a(li.X, this.d(0.5), this.dx(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.n_();
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   protected void Z() {
      this.c--;
      if (this.c <= 0) {
         this.c = 100;
         this.b = (float)this.ah.a(0.5, 6.891);
      }

      bto $$0 = this.p();
      if ($$0 != null && $$0.dy() > this.dy() + (double)this.b && this.c($$0)) {
         evq $$1 = this.ds();
         this.h(this.ds().b(0.0, (0.3F - $$1.d) * 0.3F, 0.0));
         this.av = true;
      }

      super.Z();
   }

   @Override
   public boolean bQ() {
      return this.u();
   }

   private boolean u() {
      return (this.ao.a(d) & 1) != 0;
   }

   void w(boolean $$0) {
      byte $$1 = this.ao.a(d);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.ao.a(d, $$1);
   }

   static class a extends cam {
      private final cjl a;
      private int b;
      private int c;
      private int d;

      public a(cjl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean a() {
         bto $$0 = this.a.p();
         return $$0 != null && $$0.bD() && this.a.c($$0);
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
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.c--;
         bto $$0 = this.a.p();
         if ($$0 != null) {
            boolean $$1 = this.a.M().a($$0);
            if ($$1) {
               this.d = 0;
            } else {
               this.d++;
            }

            double $$2 = this.a.g((bst)$$0);
            if ($$2 < 4.0) {
               if (!$$1) {
                  return;
               }

               if (this.c <= 0) {
                  this.c = 20;
                  this.a.C($$0);
               }

               this.a.H().a($$0.du(), $$0.dw(), $$0.dA(), 1.0);
            } else if ($$2 < this.h() * this.h() && $$1) {
               double $$3 = $$0.du() - this.a.du();
               double $$4 = $$0.e(0.5) - this.a.e(0.5);
               double $$5 = $$0.dA() - this.a.dA();
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
                     if (!this.a.aW()) {
                        this.a.dP().a(null, 1018, this.a.dp(), 0);
                     }

                     for (int $$7 = 0; $$7 < 1; $$7++) {
                        cns $$8 = new cns(this.a.dP(), this.a, this.a.el().a($$3, 2.297 * $$6), $$4, this.a.el().a($$5, 2.297 * $$6));
                        $$8.a_($$8.du(), this.a.e(0.5) + 0.5, $$8.dA());
                        this.a.dP().b($$8);
                     }
                  }
               }

               this.a.G().a($$0, 10.0F, 10.0F);
            } else if (this.d < 5) {
               this.a.H().a($$0.du(), $$0.dw(), $$0.dA(), 1.0);
            }

            super.e();
         }
      }

      private double h() {
         return this.a.g(buw.k);
      }
   }
}
