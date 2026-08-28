import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clr extends clv {
   protected static final int c = 80;
   private static final ako<Boolean> b = aks.a(clr.class, akq.k);
   private static final ako<Integer> e = aks.a(clr.class, akq.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private bve cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected ccz d;

   public clr(bup<? extends clr> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(esf.j, 0.0F);
      this.bP = new clr.c(this);
      this.bY = this.af.i();
      this.bZ = this.bY;
   }

   @Override
   protected void D() {
      ccq $$0 = new ccq(this, 1.0);
      this.d = new ccz(this, 1.0, 80);
      this.bS.a(4, new clr.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new cck(this, cor.class, 8.0F));
      this.bS.a(8, new cck(this, clr.class, 12.0F, 0.01F));
      this.bS.a(9, new ccx(this));
      this.d.a(EnumSet.of(ccc.a.a, ccc.a.b));
      $$0.a(EnumSet.of(ccc.a.a, ccc.a.b));
      this.bT.a(1, new cdv<>(this, bve.class, 10, true, false, new clr.b(this)));
   }

   public static bwl.a gv() {
      return clv.gB().a(bwm.c, 6.0).a(bwm.v, 0.5).a(bwm.s, 30.0);
   }

   @Override
   protected ceq b(dff $$0) {
      return new ces(this, $$0);
   }

   @Override
   protected void a(aks.a $$0) {
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
   public bve gy() {
      if (!this.gx()) {
         return null;
      } else if (this.dY().C) {
         if (this.cd != null) {
            return this.cd;
         } else {
            bui $$0 = this.dY().a(this.am.a(e));
            if ($$0 instanceof bve) {
               this.cd = (bve)$$0;
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
   public void a(ako<?> $$0) {
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
   protected awn w() {
      return this.bo() ? awo.lp : awo.lq;
   }

   @Override
   protected awn d(bsy $$0) {
      return this.bo() ? awo.lv : awo.lw;
   }

   @Override
   protected awn o_() {
      return this.bo() ? awo.ls : awo.lt;
   }

   @Override
   protected bui.b bi() {
      return bui.b.c;
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return $$1.b_($$0).a(axj.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bN()) {
         if (this.dY().C) {
            this.bZ = this.bY;
            if (!this.bl()) {
               this.ca = 2.0F;
               ezr $$0 = this.dB();
               if ($$0.e > 0.0 && this.cf && !this.bd()) {
                  this.dY().a(this.dD(), this.dF(), this.dJ(), this.y(), this.do(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.e < 0.0 && this.dY().a(this.dy().e(), this);
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
            if (!this.bo()) {
               this.cb = this.af.i();
            } else if (this.gw()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gw() && this.bl()) {
               ezr $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dY().a(ls.d, this.d(0.5) - $$1.d * 1.5, this.dG() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gx()) {
               if (this.ce < this.t()) {
                  this.ce++;
               }

               bve $$3 = this.gy();
               if ($$3 != null) {
                  this.K().a($$3, 90.0F, 90.0F);
                  this.K().a();
                  double $$4 = (double)this.L(0.0F);
                  double $$5 = $$3.dD() - this.dD();
                  double $$6 = $$3.e(0.5) - this.dH();
                  double $$7 = $$3.dJ() - this.dJ();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.af.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.af.j() * (1.7 - $$4);
                     this.dY().a(ls.d, this.dD() + $$5 * $$9, this.dH() + $$6 * $$9, this.dJ() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bo()) {
            this.j(300);
         } else if (this.aL()) {
            this.h(this.dB().b((double)((this.af.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.4F)));
            this.v(this.af.i() * 360.0F);
            this.d(false);
            this.as = true;
         }

         if (this.gx()) {
            this.v(this.aZ);
         }
      }

      super.n_();
   }

   protected awn y() {
      return awo.lu;
   }

   public float J(float $$0) {
      return azn.h($$0, this.bZ, this.bY);
   }

   public float K(float $$0) {
      return azn.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return ((float)this.ce + $$0) / (float)this.t();
   }

   public float gz() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dfi $$0) {
      return $$0.f(this);
   }

   public static boolean b(bup<? extends clr> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bse.a && (buo.a($$2) || $$1.b_($$3).a(axj.a)) && $$1.b_($$3.e()).a(axj.a);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.dY().C) {
         return false;
      } else {
         if (!this.gw() && !$$0.a(axf.w) && !$$0.a(btb.P) && $$0.c() instanceof bve $$2) {
            $$2.a(this.dZ().d(this), 2.0F);
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
   public void a_(ezr $$0) {
      if (this.dk() && this.bl()) {
         this.a(0.1F, $$0);
         this.a(bvi.a, this.dB());
         this.h(this.dB().c(0.9));
         if (!this.gw() && this.m() == null) {
            this.h(this.dB().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends ccc {
      private final clr a;
      private int b;
      private final boolean c;

      public a(clr $$0) {
         this.a = $$0;
         this.c = $$0 instanceof clk;
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean b() {
         bve $$0 = this.a.m();
         return $$0 != null && $$0.bN();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.m() != null && this.a.g((bui)this.a.m()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.P().o();
         bve $$0 = this.a.m();
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
         bve $$0 = this.a.m();
         if ($$0 != null) {
            this.a.P().o();
            this.a.K().a($$0, 90.0F, 90.0F);
            if (!this.a.G($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.as());
                  if (!this.a.bd()) {
                     this.a.dY().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dY().ak() == bse.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dZ().c(this.a, (bui)this.a), $$1);
                  this.a.E($$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements Predicate<bve> {
      private final clr a;

      public b(clr $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bve $$0) {
         return ($$0 instanceof cor || $$0 instanceof chu || $$0 instanceof cih) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cbf {
      private final clr l;

      public c(clr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbf.a.b && !this.l.P().m()) {
            ezr $$0 = new ezr(this.e - this.l.dD(), this.f - this.l.dF(), this.g - this.l.dJ());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azn.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dO(), $$5, 90.0F));
            this.l.aX = this.l.dO();
            float $$6 = (float)(this.h * this.l.h(bwm.v));
            float $$7 = azn.h(0.125F, this.l.fs(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.ag + this.l.as()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dO() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dO() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ag + this.l.as()) * 0.75) * 0.05;
            this.l.h(this.l.dB().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cbe $$12 = this.l.K();
            double $$13 = this.l.dD() + $$2 * 2.0;
            double $$14 = this.l.dH() + $$3 / $$1;
            double $$15 = this.l.dJ() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.K().a(azn.d(0.125, $$16, $$13), azn.d(0.125, $$17, $$14), azn.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
