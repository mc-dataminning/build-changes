import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjx extends ckb {
   protected static final int c = 80;
   private static final ajv<Boolean> b = ajz.a(cjx.class, ajx.k);
   private static final ajv<Integer> e = ajz.a(cjx.class, ajx.b);
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   @Nullable
   private btl cf;
   private int cg;
   private boolean ch;
   @Nullable
   protected cbh d;

   public cjx(bsw<? extends cjx> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 10;
      this.a(epp.j, 0.0F);
      this.bR = new cjx.c(this);
      this.ca = this.ah.i();
      this.cb = this.ca;
   }

   @Override
   protected void z() {
      cay $$0 = new cay(this, 1.0);
      this.d = new cbh(this, 1.0, 80);
      this.bU.a(4, new cjx.a(this));
      this.bU.a(5, $$0);
      this.bU.a(7, this.d);
      this.bU.a(8, new cas(this, cmv.class, 8.0F));
      this.bU.a(8, new cas(this, cjx.class, 12.0F, 0.01F));
      this.bU.a(9, new cbf(this));
      this.d.a(EnumSet.of(cak.a.a, cak.a.b));
      $$0.a(EnumSet.of(cak.a.a, cak.a.b));
      this.bV.a(1, new ccd<>(this, btl.class, 10, true, false, new cjx.b(this)));
   }

   public static but.a gm() {
      return ckb.gs().a(buu.c, 6.0).a(buu.v, 0.5).a(buu.m, 16.0).a(buu.s, 30.0);
   }

   @Override
   protected ccy b(dcu $$0) {
      return new cda(this, $$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gn() {
      return this.ao.a(b);
   }

   void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int t() {
      return 80;
   }

   void b(int $$0) {
      this.ao.a(e, $$0);
   }

   public boolean go() {
      return this.ao.a(e) != 0;
   }

   @Nullable
   public btl gp() {
      if (!this.go()) {
         return null;
      } else if (this.dQ().B) {
         if (this.cf != null) {
            return this.cf;
         } else {
            bsq $$0 = this.dQ().a(this.ao.a(e));
            if ($$0 instanceof btl) {
               this.cf = (btl)$$0;
               return this.cf;
            } else {
               return null;
            }
         }
      } else {
         return this.p();
      }
   }

   @Override
   public void a(ajv<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.cg = 0;
         this.cf = null;
      }
   }

   @Override
   public int P() {
      return 160;
   }

   @Override
   protected avn v() {
      return this.bi() ? avo.lq : avo.lr;
   }

   @Override
   protected avn d(brj $$0) {
      return this.bi() ? avo.lw : avo.lx;
   }

   @Override
   protected avn n_() {
      return this.bi() ? avo.lt : avo.lu;
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.c;
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return $$1.b_($$0).a(awj.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void m_() {
      if (this.bE()) {
         if (this.dQ().B) {
            this.cb = this.ca;
            if (!this.bf()) {
               this.cc = 2.0F;
               eww $$0 = this.dt();
               if ($$0.d > 0.0 && this.ch && !this.aX()) {
                  this.dQ().a(this.dv(), this.dx(), this.dB(), this.x(), this.df(), 1.0F, 1.0F, false);
               }

               this.ch = $$0.d < 0.0 && this.dQ().a(this.dq().d(), this);
            } else if (this.gn()) {
               if (this.cc < 0.5F) {
                  this.cc = 4.0F;
               } else {
                  this.cc = this.cc + (0.5F - this.cc) * 0.1F;
               }
            } else {
               this.cc = this.cc + (0.125F - this.cc) * 0.2F;
            }

            this.ca = this.ca + this.cc;
            this.ce = this.cd;
            if (!this.bi()) {
               this.cd = this.ah.i();
            } else if (this.gn()) {
               this.cd = this.cd + (0.0F - this.cd) * 0.25F;
            } else {
               this.cd = this.cd + (1.0F - this.cd) * 0.06F;
            }

            if (this.gn() && this.bf()) {
               eww $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dQ().a(lm.d, this.d(0.5) - $$1.c * 1.5, this.dy() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.go()) {
               if (this.cg < this.t()) {
                  this.cg++;
               }

               btl $$3 = this.gp();
               if ($$3 != null) {
                  this.F().a($$3, 90.0F, 90.0F);
                  this.F().a();
                  double $$4 = (double)this.J(0.0F);
                  double $$5 = $$3.dv() - this.dv();
                  double $$6 = $$3.e(0.5) - this.dz();
                  double $$7 = $$3.dB() - this.dB();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ah.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ah.j() * (1.7 - $$4);
                     this.dQ().a(lm.d, this.dv() + $$5 * $$9, this.dz() + $$6 * $$9, this.dB() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bi()) {
            this.j(300);
         } else if (this.aF()) {
            this.i(this.dt().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.4F)));
            this.s(this.ah.i() * 360.0F);
            this.e(false);
            this.av = true;
         }

         if (this.go()) {
            this.s(this.ba);
         }
      }

      super.m_();
   }

   protected avn x() {
      return avo.lv;
   }

   public float H(float $$0) {
      return ayn.i($$0, this.cb, this.ca);
   }

   public float I(float $$0) {
      return ayn.i($$0, this.ce, this.cd);
   }

   public float J(float $$0) {
      return ((float)this.cg + $$0) / (float)this.t();
   }

   public float gq() {
      return (float)this.cg;
   }

   @Override
   public boolean a(dcx $$0) {
      return $$0.f(this);
   }

   public static boolean b(bsw<? extends cjx> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.al() != bqn.a && (btp.a($$2) || $$1.b_($$3).a(awj.a)) && $$1.b_($$3.d()).a(awj.a);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.dQ().B) {
         return false;
      } else {
         if (!this.gn() && !$$0.a(awf.w) && !$$0.a(brm.O) && $$0.c() instanceof btl $$2) {
            $$2.a(this.dR().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void a(eww $$0) {
      if (this.db() && this.bf()) {
         this.a(0.1F, $$0);
         this.a(btq.a, this.dt());
         this.i(this.dt().a(0.9));
         if (!this.gn() && this.p() == null) {
            this.i(this.dt().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends cak {
      private final cjx a;
      private int b;
      private final boolean c;

      public a(cjx $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cjq;
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean b() {
         btl $$0 = this.a.p();
         return $$0 != null && $$0.bE();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.p() != null && this.a.g((bsq)this.a.p()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.J().n();
         btl $$0 = this.a.p();
         if ($$0 != null) {
            this.a.F().a($$0, 90.0F, 90.0F);
         }

         this.a.av = true;
      }

      @Override
      public void e() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         btl $$0 = this.a.p();
         if ($$0 != null) {
            this.a.J().n();
            this.a.F().a($$0, 90.0F, 90.0F);
            if (!this.a.F($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.an());
                  if (!this.a.aX()) {
                     this.a.dQ().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dQ().al() == bqn.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dR().c(this.a, (bsq)this.a), $$1);
                  this.a.D($$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements Predicate<btl> {
      private final cjx a;

      public b(cjx $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable btl $$0) {
         return ($$0 instanceof cmv || $$0 instanceof cgb || $$0 instanceof cgo) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends bzn {
      private final cjx l;

      public c(cjx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzn.a.b && !this.l.J().l()) {
            eww $$0 = new eww(this.e - this.l.dv(), this.f - this.l.dx(), this.g - this.l.dB());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ayn.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.s(this.a(this.l.dG(), $$5, 90.0F));
            this.l.aY = this.l.dG();
            float $$6 = (float)(this.h * this.l.g(buu.v));
            float $$7 = ayn.i(0.125F, this.l.fk(), $$6);
            this.l.z($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.an()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dG() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dG() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.an()) * 0.75) * 0.05;
            this.l.i(this.l.dt().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bzm $$12 = this.l.F();
            double $$13 = this.l.dv() + $$2 * 2.0;
            double $$14 = this.l.dz() + $$3 / $$1;
            double $$15 = this.l.dB() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.F().a(ayn.d(0.125, $$16, $$13), ayn.d(0.125, $$17, $$14), ayn.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.z(0.0F);
            this.l.w(false);
         }
      }
   }
}
