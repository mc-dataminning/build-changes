import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckz extends cld {
   protected static final int c = 80;
   private static final akh<Boolean> b = akl.a(ckz.class, akj.k);
   private static final akh<Integer> e = akl.a(ckz.class, akj.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private bun cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected cch d;

   public ckz(bty<? extends ckz> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(erk.j, 0.0F);
      this.bP = new ckz.c(this);
      this.bY = this.af.i();
      this.bZ = this.bY;
   }

   @Override
   protected void D() {
      cby $$0 = new cby(this, 1.0);
      this.d = new cch(this, 1.0, 80);
      this.bS.a(4, new ckz.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new cbs(this, cnx.class, 8.0F));
      this.bS.a(8, new cbs(this, ckz.class, 12.0F, 0.01F));
      this.bS.a(9, new ccf(this));
      this.d.a(EnumSet.of(cbk.a.a, cbk.a.b));
      $$0.a(EnumSet.of(cbk.a.a, cbk.a.b));
      this.bT.a(1, new cdd<>(this, bun.class, 10, true, false, new ckz.b(this)));
   }

   public static bvt.a go() {
      return cld.gu().a(bvu.c, 6.0).a(bvu.v, 0.5).a(bvu.s, 30.0);
   }

   @Override
   protected cdy b(dej $$0) {
      return new cea(this, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gp() {
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

   public boolean gq() {
      return this.am.a(e) != 0;
   }

   @Nullable
   public bun gr() {
      if (!this.gq()) {
         return null;
      } else if (this.dS().B) {
         if (this.cd != null) {
            return this.cd;
         } else {
            btr $$0 = this.dS().a(this.am.a(e));
            if ($$0 instanceof bun) {
               this.cd = (bun)$$0;
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
   public void a(akh<?> $$0) {
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
   protected awf w() {
      return this.bl() ? awg.lr : awg.ls;
   }

   @Override
   protected awf d(bsj $$0) {
      return this.bl() ? awg.lx : awg.ly;
   }

   @Override
   protected awf o_() {
      return this.bl() ? awg.lu : awg.lv;
   }

   @Override
   protected btr.b bf() {
      return btr.b.c;
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return $$1.b_($$0).a(axb.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bI()) {
         if (this.dS().B) {
            this.bZ = this.bY;
            if (!this.bi()) {
               this.ca = 2.0F;
               eyw $$0 = this.dv();
               if ($$0.e > 0.0 && this.cf && !this.ba()) {
                  this.dS().a(this.dx(), this.dz(), this.dD(), this.y(), this.di(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.e < 0.0 && this.dS().a(this.ds().e(), this);
            } else if (this.gp()) {
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
            if (!this.bl()) {
               this.cb = this.af.i();
            } else if (this.gp()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gp() && this.bi()) {
               eyw $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dS().a(lo.d, this.d(0.5) - $$1.d * 1.5, this.dA() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gq()) {
               if (this.ce < this.t()) {
                  this.ce++;
               }

               bun $$3 = this.gr();
               if ($$3 != null) {
                  this.K().a($$3, 90.0F, 90.0F);
                  this.K().a();
                  double $$4 = (double)this.L(0.0F);
                  double $$5 = $$3.dx() - this.dx();
                  double $$6 = $$3.e(0.5) - this.dB();
                  double $$7 = $$3.dD() - this.dD();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.af.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.af.j() * (1.7 - $$4);
                     this.dS().a(lo.d, this.dx() + $$5 * $$9, this.dB() + $$6 * $$9, this.dD() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bl()) {
            this.j(300);
         } else if (this.aH()) {
            this.h(this.dv().b((double)((this.af.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.4F)));
            this.v(this.af.i() * 360.0F);
            this.d(false);
            this.as = true;
         }

         if (this.gq()) {
            this.v(this.aV);
         }
      }

      super.n_();
   }

   protected awf y() {
      return awg.lw;
   }

   public float J(float $$0) {
      return azf.h($$0, this.bZ, this.bY);
   }

   public float K(float $$0) {
      return azf.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return ((float)this.ce + $$0) / (float)this.t();
   }

   public float gs() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dem $$0) {
      return $$0.f(this);
   }

   public static boolean b(bty<? extends ckz> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.am() != brp.a && (btx.a($$2) || $$1.b_($$3).a(axb.a)) && $$1.b_($$3.e()).a(axb.a);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.dS().B) {
         return false;
      } else {
         if (!this.gp() && !$$0.a(awx.w) && !$$0.a(bsm.P) && $$0.c() instanceof bun $$2) {
            $$2.a(this.dT().d(this), 2.0F);
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
   public void a_(eyw $$0) {
      if (this.de() && this.bi()) {
         this.a(0.1F, $$0);
         this.a(bur.a, this.dv());
         this.h(this.dv().c(0.9));
         if (!this.gp() && this.m() == null) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cbk {
      private final ckz a;
      private int b;
      private final boolean c;

      public a(ckz $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cks;
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }

      @Override
      public boolean b() {
         bun $$0 = this.a.m();
         return $$0 != null && $$0.bI();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.m() != null && this.a.g((btr)this.a.m()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.P().o();
         bun $$0 = this.a.m();
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
      public boolean U_() {
         return true;
      }

      @Override
      public void a() {
         bun $$0 = this.a.m();
         if ($$0 != null) {
            this.a.P().o();
            this.a.K().a($$0, 90.0F, 90.0F);
            if (!this.a.G($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ap());
                  if (!this.a.ba()) {
                     this.a.dS().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dS().am() == brp.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dT().c(this.a, (btr)this.a), $$1);
                  this.a.E($$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements Predicate<bun> {
      private final ckz a;

      public b(ckz $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bun $$0) {
         return ($$0 instanceof cnx || $$0 instanceof chc || $$0 instanceof chp) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends can {
      private final ckz l;

      public c(ckz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == can.a.b && !this.l.P().m()) {
            eyw $$0 = new eyw(this.e - this.l.dx(), this.f - this.l.dz(), this.g - this.l.dD());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azf.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.a(this.l.dI(), $$5, 90.0F));
            this.l.aT = this.l.dI();
            float $$6 = (float)(this.h * this.l.h(bvu.v));
            float $$7 = azf.h(0.125F, this.l.fm(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.ag + this.l.ap()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dI() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dI() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ag + this.l.ap()) * 0.75) * 0.05;
            this.l.h(this.l.dv().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cam $$12 = this.l.K();
            double $$13 = this.l.dx() + $$2 * 2.0;
            double $$14 = this.l.dB() + $$3 / $$1;
            double $$15 = this.l.dD() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.K().a(azf.d(0.125, $$16, $$13), azf.d(0.125, $$17, $$14), azf.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
