import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cli extends clm {
   protected static final int c = 80;
   private static final akk<Boolean> b = ako.a(cli.class, akm.k);
   private static final akk<Integer> e = ako.a(cli.class, akm.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private buv cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected ccq d;

   public cli(bug<? extends cli> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(erv.j, 0.0F);
      this.bP = new cli.c(this);
      this.bY = this.af.i();
      this.bZ = this.bY;
   }

   @Override
   protected void D() {
      cch $$0 = new cch(this, 1.0);
      this.d = new ccq(this, 1.0, 80);
      this.bS.a(4, new cli.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new ccb(this, coh.class, 8.0F));
      this.bS.a(8, new ccb(this, cli.class, 12.0F, 0.01F));
      this.bS.a(9, new cco(this));
      this.d.a(EnumSet.of(cbt.a.a, cbt.a.b));
      $$0.a(EnumSet.of(cbt.a.a, cbt.a.b));
      this.bT.a(1, new cdm<>(this, buv.class, 10, true, false, new cli.b(this)));
   }

   public static bwc.a gv() {
      return clm.gB().a(bwd.c, 6.0).a(bwd.v, 0.5).a(bwd.s, 30.0);
   }

   @Override
   protected ceh b(dev $$0) {
      return new cej(this, $$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gw() {
      return this.am.a(b);
   }

   void x(boolean $$0) {
      this.am.a(b, $$0);
   }

   public int t() {
      return 80;
   }

   void b(int $$0) {
      this.am.a(e, $$0);
   }

   public boolean gx() {
      return this.am.a(e) != 0;
   }

   @Nullable
   public buv gy() {
      if (!this.gx()) {
         return null;
      } else if (this.dX().C) {
         if (this.cd != null) {
            return this.cd;
         } else {
            btz $$0 = this.dX().a(this.am.a(e));
            if ($$0 instanceof buv) {
               this.cd = (buv)$$0;
               return this.cd;
            } else {
               return null;
            }
         }
      } else {
         return this.m();
      }
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.ce = 0;
         this.cd = null;
      }
   }

   @Override
   public int T() {
      return 160;
   }

   @Override
   protected awj w() {
      return this.bn() ? awk.lp : awk.lq;
   }

   @Override
   protected awj d(bsp $$0) {
      return this.bn() ? awk.lv : awk.lw;
   }

   @Override
   protected awj o_() {
      return this.bn() ? awk.ls : awk.lt;
   }

   @Override
   protected btz.b bh() {
      return btz.b.c;
   }

   @Override
   public float a(jg $$0, dey $$1) {
      return $$1.b_($$0).a(axf.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bM()) {
         if (this.dX().C) {
            this.bZ = this.bY;
            if (!this.bk()) {
               this.ca = 2.0F;
               ezh $$0 = this.dA();
               if ($$0.e > 0.0 && this.cf && !this.bc()) {
                  this.dX().a(this.dC(), this.dE(), this.dI(), this.y(), this.dn(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.e < 0.0 && this.dX().a(this.dx().e(), this);
            } else if (this.gw()) {
               if (this.ca < 0.5F) {
                  this.ca = 4.0F;
               } else {
                  this.ca = this.ca + (0.5F - this.ca) * 0.1F;
               }
            } else {
               this.ca = this.ca + (0.125F - this.ca) * 0.2F;
            }

            this.bY = this.bY + this.ca;
            this.cc = this.cb;
            if (!this.bn()) {
               this.cb = this.af.i();
            } else if (this.gw()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gw() && this.bk()) {
               ezh $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dX().a(lq.d, this.d(0.5) - $$1.d * 1.5, this.dF() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gx()) {
               if (this.ce < this.t()) {
                  this.ce++;
               }

               buv $$3 = this.gy();
               if ($$3 != null) {
                  this.K().a($$3, 90.0F, 90.0F);
                  this.K().a();
                  double $$4 = (double)this.L(0.0F);
                  double $$5 = $$3.dC() - this.dC();
                  double $$6 = $$3.e(0.5) - this.dG();
                  double $$7 = $$3.dI() - this.dI();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.af.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.af.j() * (1.7 - $$4);
                     this.dX().a(lq.d, this.dC() + $$5 * $$9, this.dG() + $$6 * $$9, this.dI() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bn()) {
            this.j(300);
         } else if (this.aJ()) {
            this.h(this.dA().b((double)((this.af.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.4F)));
            this.v(this.af.i() * 360.0F);
            this.d(false);
            this.as = true;
         }

         if (this.gx()) {
            this.v(this.aW);
         }
      }

      super.n_();
   }

   protected awj y() {
      return awk.lu;
   }

   public float J(float $$0) {
      return azj.h($$0, this.bZ, this.bY);
   }

   public float K(float $$0) {
      return azj.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return ((float)this.ce + $$0) / (float)this.t();
   }

   public float gz() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dey $$0) {
      return $$0.f(this);
   }

   public static boolean b(bug<? extends cli> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.am() != brv.a && (buf.a($$2) || $$1.b_($$3).a(axf.a)) && $$1.b_($$3.e()).a(axf.a);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.dX().C) {
         return false;
      } else {
         if (!this.gw() && !$$0.a(axb.w) && !$$0.a(bss.P) && $$0.c() instanceof buv $$2) {
            $$2.a(this.dY().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int ad() {
      return 180;
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj() && this.bk()) {
         this.a(0.1F, $$0);
         this.a(buz.a, this.dA());
         this.h(this.dA().c(0.9));
         if (!this.gw() && this.m() == null) {
            this.h(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cbt {
      private final cli a;
      private int b;
      private final boolean c;

      public a(cli $$0) {
         this.a = $$0;
         this.c = $$0 instanceof clb;
         this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      }

      @Override
      public boolean b() {
         buv $$0 = this.a.m();
         return $$0 != null && $$0.bM();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.m() != null && this.a.g((btz)this.a.m()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.P().o();
         buv $$0 = this.a.m();
         if ($$0 != null) {
            this.a.K().a($$0, 90.0F, 90.0F);
         }

         this.a.as = true;
      }

      @Override
      public void e() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         buv $$0 = this.a.m();
         if ($$0 != null) {
            this.a.P().o();
            this.a.K().a($$0, 90.0F, 90.0F);
            if (!this.a.G($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ar());
                  if (!this.a.bc()) {
                     this.a.dX().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dX().am() == brv.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dY().c(this.a, (btz)this.a), $$1);
                  this.a.E($$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements Predicate<buv> {
      private final cli a;

      public b(cli $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable buv $$0) {
         return ($$0 instanceof coh || $$0 instanceof chl || $$0 instanceof chy) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends caw {
      private final cli l;

      public c(cli $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == caw.a.b && !this.l.P().m()) {
            ezh $$0 = new ezh(this.e - this.l.dC(), this.f - this.l.dE(), this.g - this.l.dI());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azj.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dN(), $$5, 90.0F));
            this.l.aU = this.l.dN();
            float $$6 = (float)(this.h * this.l.h(bwd.v));
            float $$7 = azj.h(0.125F, this.l.fr(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.ag + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dN() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dN() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ag + this.l.ar()) * 0.75) * 0.05;
            this.l.h(this.l.dA().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cav $$12 = this.l.K();
            double $$13 = this.l.dC() + $$2 * 2.0;
            double $$14 = this.l.dG() + $$3 / $$1;
            double $$15 = this.l.dI() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.K().a(azj.d(0.125, $$16, $$13), azj.d(0.125, $$17, $$14), azj.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
