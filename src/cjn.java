import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjn extends cjr {
   protected static final int c = 80;
   private static final ajp<Boolean> b = ajt.a(cjn.class, ajr.k);
   private static final ajp<Integer> e = ajt.a(cjn.class, ajr.b);
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   @Nullable
   private btc cf;
   private int cg;
   private boolean ch;
   @Nullable
   protected cax d;

   public cjn(bsn<? extends cjn> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 10;
      this.a(epa.j, 0.0F);
      this.bR = new cjn.c(this);
      this.ca = this.ah.i();
      this.cb = this.ca;
   }

   @Override
   protected void z() {
      cao $$0 = new cao(this, 1.0);
      this.d = new cax(this, 1.0, 80);
      this.bU.a(4, new cjn.a(this));
      this.bU.a(5, $$0);
      this.bU.a(7, this.d);
      this.bU.a(8, new cai(this, cml.class, 8.0F));
      this.bU.a(8, new cai(this, cjn.class, 12.0F, 0.01F));
      this.bU.a(9, new cav(this));
      this.d.a(EnumSet.of(caa.a.a, caa.a.b));
      $$0.a(EnumSet.of(caa.a.a, caa.a.b));
      this.bV.a(1, new cbt<>(this, btc.class, 10, true, false, new cjn.b(this)));
   }

   public static buj.a gn() {
      return cjr.gt().a(buk.c, 6.0).a(buk.v, 0.5).a(buk.m, 16.0).a(buk.s, 30.0);
   }

   @Override
   protected cco b(dcg $$0) {
      return new ccq(this, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean go() {
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

   public boolean gp() {
      return this.ao.a(e) != 0;
   }

   @Nullable
   public btc gq() {
      if (!this.gp()) {
         return null;
      } else if (this.dR().B) {
         if (this.cf != null) {
            return this.cf;
         } else {
            bsh $$0 = this.dR().a(this.ao.a(e));
            if ($$0 instanceof btc) {
               this.cf = (btc)$$0;
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
   public void a(ajp<?> $$0) {
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
   protected avg v() {
      return this.bj() ? avh.lq : avh.lr;
   }

   @Override
   protected avg d(bra $$0) {
      return this.bj() ? avh.lw : avh.lx;
   }

   @Override
   protected avg n_() {
      return this.bj() ? avh.lt : avh.lu;
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.c;
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return $$1.b_($$0).a(awc.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void m_() {
      if (this.bF()) {
         if (this.dR().B) {
            this.cb = this.ca;
            if (!this.bg()) {
               this.cc = 2.0F;
               ewh $$0 = this.du();
               if ($$0.d > 0.0 && this.ch && !this.aY()) {
                  this.dR().a(this.dw(), this.dy(), this.dC(), this.x(), this.dg(), 1.0F, 1.0F, false);
               }

               this.ch = $$0.d < 0.0 && this.dR().a(this.dr().d(), this);
            } else if (this.go()) {
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
            if (!this.bj()) {
               this.cd = this.ah.i();
            } else if (this.go()) {
               this.cd = this.cd + (0.0F - this.cd) * 0.25F;
            } else {
               this.cd = this.cd + (1.0F - this.cd) * 0.06F;
            }

            if (this.go() && this.bg()) {
               ewh $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dR().a(lj.d, this.d(0.5) - $$1.c * 1.5, this.dz() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gp()) {
               if (this.cg < this.t()) {
                  this.cg++;
               }

               btc $$3 = this.gq();
               if ($$3 != null) {
                  this.F().a($$3, 90.0F, 90.0F);
                  this.F().a();
                  double $$4 = (double)this.J(0.0F);
                  double $$5 = $$3.dw() - this.dw();
                  double $$6 = $$3.e(0.5) - this.dA();
                  double $$7 = $$3.dC() - this.dC();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ah.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ah.j() * (1.7 - $$4);
                     this.dR().a(lj.d, this.dw() + $$5 * $$9, this.dA() + $$6 * $$9, this.dC() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bj()) {
            this.j(300);
         } else if (this.aG()) {
            this.j(this.du().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.4F)));
            this.s(this.ah.i() * 360.0F);
            this.e(false);
            this.av = true;
         }

         if (this.gp()) {
            this.s(this.bb);
         }
      }

      super.m_();
   }

   protected avg x() {
      return avh.lv;
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cb, this.ca);
   }

   public float I(float $$0) {
      return ayg.i($$0, this.ce, this.cd);
   }

   public float J(float $$0) {
      return ((float)this.cg + $$0) / (float)this.t();
   }

   public float gr() {
      return (float)this.cg;
   }

   @Override
   public boolean a(dcj $$0) {
      return $$0.f(this);
   }

   public static boolean b(bsn<? extends cjn> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.al() != bqe.a && (btg.a($$2) || $$1.b_($$3).a(awc.a)) && $$1.b_($$3.d()).a(awc.a);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.dR().B) {
         return false;
      } else {
         if (!this.go() && !$$0.a(avy.x) && !$$0.a(brd.O) && $$0.c() instanceof btc $$2) {
            $$2.a(this.dS().d(this), 2.0F);
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
   public void a(ewh $$0) {
      if (this.dc() && this.bg()) {
         this.a(0.1F, $$0);
         this.a(bth.a, this.du());
         this.j(this.du().a(0.9));
         if (!this.go() && this.p() == null) {
            this.j(this.du().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends caa {
      private final cjn a;
      private int b;
      private final boolean c;

      public a(cjn $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cjg;
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean a() {
         btc $$0 = this.a.p();
         return $$0 != null && $$0.bF();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((bsh)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.J().n();
         btc $$0 = this.a.p();
         if ($$0 != null) {
            this.a.F().a($$0, 90.0F, 90.0F);
         }

         this.a.av = true;
      }

      @Override
      public void d() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btc $$0 = this.a.p();
         if ($$0 != null) {
            this.a.J().n();
            this.a.F().a($$0, 90.0F, 90.0F);
            if (!this.a.F($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.an());
                  if (!this.a.aY()) {
                     this.a.dR().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dR().al() == bqe.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dS().c(this.a, (bsh)this.a), $$1);
                  this.a.D($$0);
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<btc> {
      private final cjn a;

      public b(cjn $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable btc $$0) {
         return ($$0 instanceof cml || $$0 instanceof cfr || $$0 instanceof cge) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends bzd {
      private final cjn l;

      public c(cjn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bzd.a.b && !this.l.J().l()) {
            ewh $$0 = new ewh(this.e - this.l.dw(), this.f - this.l.dy(), this.g - this.l.dC());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ayg.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.s(this.a(this.l.dH(), $$5, 90.0F));
            this.l.aZ = this.l.dH();
            float $$6 = (float)(this.h * this.l.g(buk.v));
            float $$7 = ayg.i(0.125F, this.l.fl(), $$6);
            this.l.z($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.an()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dH() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dH() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.an()) * 0.75) * 0.05;
            this.l.j(this.l.du().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bzc $$12 = this.l.F();
            double $$13 = this.l.dw() + $$2 * 2.0;
            double $$14 = this.l.dA() + $$3 / $$1;
            double $$15 = this.l.dC() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.F().a(ayg.d(0.125, $$16, $$13), ayg.d(0.125, $$17, $$14), ayg.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.z(0.0F);
            this.l.w(false);
         }
      }
   }
}
