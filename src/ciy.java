import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ciy extends cjd {
   protected static final int c = 80;
   private static final ajy<Boolean> b = akc.a(ciy.class, aka.k);
   private static final ajy<Integer> e = akc.a(ciy.class, aka.b);
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;
   @Nullable
   private bso cm;
   private int cn;
   private boolean co;
   @Nullable
   protected cai d;
   final boolean cp;
   private int cq;
   private int cr;

   public ciy(bsb<? extends ciy> $$0, dca $$1, boolean $$2) {
      super($$0, $$1);
      this.cp = $$2;
      if ($$2) {
         this.bW = 5;
      } else {
         this.bW = 10;
      }

      this.a(epv.j, 0.0F);
      this.bY = new ciy.d(this);
      this.bX = new ciy.c();
      this.ch = this.al.i();
      this.ci = this.ch;
   }

   public static ciy c(bsb<? extends ciy> $$0, dca $$1) {
      return new ciy($$0, $$1, false);
   }

   public static ciy d(bsb<? extends ciy> $$0, dca $$1) {
      return new ciy($$0, $$1, true);
   }

   public boolean gz() {
      return this.cp;
   }

   @Override
   protected void y() {
      bzz $$0 = new bzz(this, 1.0);
      this.d = new cai(this, 1.0, 80) {
         @Override
         public boolean a() {
            return ciy.this.cp && ciy.this.bW() ? false : super.a();
         }
      };
      this.cb.a(4, new ciy.a(this));
      this.cb.a(5, $$0);
      this.cb.a(7, this.d);
      this.cb.a(8, new bzt(this, cly.class, 8.0F) {
         @Override
         public boolean a() {
            return ciy.this.cp && ciy.this.bW() ? false : super.a();
         }
      });
      this.cb.a(8, new bzt(this, ciy.class, 12.0F, 0.01F) {
         @Override
         public boolean a() {
            return ciy.this.cp && ciy.this.bW() ? false : super.a();
         }
      });
      this.cb.a(9, new cag(this) {
         @Override
         public boolean a() {
            return ciy.this.cp && ciy.this.bW() ? false : super.a();
         }
      });
      this.cb.a(10, new bzl() {
         private final cde b = cde.b().a(3.0).a($$0x -> !$$0x.bX() && !$$0x.bW() && ciy.this.b($$0x));

         @Override
         public boolean a() {
            return ciy.this.cp && ciy.this.al.a(100) == 0 && (!ciy.this.bX() || !(ciy.this instanceof cir));
         }

         @Override
         public void c() {
            if (ciy.this.dh() == null) {
               ewp $$0 = ciy.this.cP().c(2.0, 2.0, 2.0);
               ciy $$1 = ciy.this.dU().a(ciy.class, this.b, ciy.this, ciy.this.dz(), ciy.this.dB(), ciy.this.dF(), $$0);
               if ($$1 != null) {
                  ciy.this.n($$1);
               }
            } else if (ciy.this.al.a(10) == 0) {
               ciy.this.ae();
            }
         }
      });
      this.d.a(EnumSet.of(bzl.a.a, bzl.a.b));
      $$0.a(EnumSet.of(bzl.a.a, bzl.a.b));
      this.cc.a(1, new cbe<>(this, bso.class, 10, true, false, new ciy.b(this)));
   }

   public static btu.a gA() {
      return cjd.gG().a(btv.c, 6.0).a(btv.r, 0.5).a(btv.k, 16.0).a(btv.q, 30.0);
   }

   @Nullable
   @Override
   public bso cV() {
      bso $$0 = super.cV();
      return this.b($$0) ? null : $$0;
   }

   @Override
   protected void f(bqt $$0, float $$1) {
      super.f($$0, $$1);
      if (this.cp) {
         List<brv> $$2 = this.cX();
         $$2.forEach(brv::ae);
         brv $$3 = this.dh();
         if ($$3 != null) {
            this.ae();
            $$2.forEach($$1x -> $$1x.a($$3, true));
         }
      }
   }

   @Override
   protected cbz b(dca $$0) {
      return new ccb(this, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gB() {
      return this.as.a(b);
   }

   void w(boolean $$0) {
      this.as.a(b, $$0);
   }

   public int t() {
      return 80;
   }

   void b(int $$0) {
      this.as.a(e, $$0);
   }

   public boolean gC() {
      return this.as.a(e) != 0;
   }

   @Nullable
   public bso gD() {
      if (!this.gC()) {
         return null;
      } else if (this.dU().C) {
         if (this.cm != null) {
            return this.cm;
         } else {
            brv $$0 = this.dU().a(this.as.a(e));
            if ($$0 instanceof bso) {
               this.cm = (bso)$$0;
               return this.cm;
            } else {
               return null;
            }
         }
      } else {
         return this.p();
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.cn = 0;
         this.cm = null;
      }
   }

   @Override
   public int O() {
      return 160;
   }

   @Override
   protected avn u() {
      if (this.cp) {
         return this.bl() ? avo.lE : avo.lG;
      } else {
         return this.bl() ? avo.lD : avo.lF;
      }
   }

   @Override
   protected avn d(bqt $$0) {
      if (this.cp) {
         return this.bl() ? avo.lQ : avo.lS;
      } else {
         return this.bl() ? avo.lP : avo.lR;
      }
   }

   @Override
   protected avn n_() {
      if (this.cp) {
         return this.bl() ? avo.lK : avo.lM;
      } else {
         return this.bl() ? avo.lJ : avo.lL;
      }
   }

   @Override
   protected brv.c bf() {
      return brv.c.c;
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return $$1.b_($$0).a(awj.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public boolean a(dcb $$0, bss $$1) {
      return this.cp ? true : super.a($$0, $$1);
   }

   @Override
   protected void ed() {
      if (!this.cp) {
         super.ed();
      }
   }

   @Override
   public void m_() {
      if (!this.bl()) {
         this.cq++;
      } else {
         this.cq = 0;
      }

      if (this.bI()) {
         if (this.dU().C) {
            this.ci = this.ch;
            if (!this.bi()) {
               ewu $$0 = this.dx();
               if (this.cp) {
                  this.cj = (float)$$0.f() / 0.5F + 0.1F;
               } else {
                  this.cj = 2.0F;
               }

               if ($$0.d > 0.0 && this.co && !this.ba()) {
                  this.dU().a(this.dz(), this.dB(), this.dF(), this.x(), this.dj(), 1.0F, 1.0F, false);
               }

               this.co = $$0.d < 0.0 && this.dU().a(this.du().d(), this);
            } else if (this.gB()) {
               if (this.cj < 0.5F) {
                  this.cj = 4.0F;
               } else {
                  this.cj = this.cj + (0.5F - this.cj) * 0.1F;
               }
            } else {
               this.cj = this.cj + (0.125F - this.cj) * 0.2F;
            }

            this.ch = this.ch + this.cj;
            this.cl = this.ck;
            if (!this.bl()) {
               if (this.cp) {
                  this.ck = 0.5F - (float)Math.cos((double)this.cq * 0.05 * Math.PI / 2.0) / 2.0F;
               } else {
                  this.ck = this.al.i();
               }
            } else if (this.gB()) {
               this.ck = this.ck + (0.0F - this.ck) * 0.25F;
            } else {
               this.ck = this.ck + (1.0F - this.ck) * 0.06F;
            }

            if (this.bW() && this.dh() instanceof ciy $$1 && $$1.ak() == this.ak()) {
               this.ck = $$1.ck;
            }

            if (this.gB() && this.bi()) {
               ewu $$2 = this.f(0.0F);

               for (int $$3 = 0; $$3 < 2; $$3++) {
                  this.dU().a(lb.d, this.d(0.5) - $$2.c * 1.5, this.dC() - $$2.d * 1.5, this.g(0.5) - $$2.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gC()) {
               if (this.cn < this.t()) {
                  this.cn++;
               }

               bso $$4 = this.gD();
               if ($$4 != null) {
                  this.F().a($$4, 90.0F, 90.0F);
                  this.F().a();
                  double $$5 = (double)this.I(0.0F);
                  double $$6 = $$4.dz() - this.dz();
                  double $$7 = $$4.e(0.5) - this.dD();
                  double $$8 = $$4.dF() - this.dF();
                  double $$9 = Math.sqrt($$6 * $$6 + $$7 * $$7 + $$8 * $$8);
                  $$6 /= $$9;
                  $$7 /= $$9;
                  $$8 /= $$9;
                  double $$10 = this.al.j();

                  while ($$10 < $$9) {
                     $$10 += 1.8 - $$5 + this.al.j() * (1.7 - $$5);
                     this.dU().a(lb.d, this.dz() + $$6 * $$10, this.dD() + $$7 * $$10, this.dF() + $$8 * $$10, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (!this.dU().C && this.gC()) {
            bso $$11 = this.gD();
            if ($$11 != null && this.cp && $$11.c(brj.s) == null) {
               $$11.b(new brh(brj.s, 40, 0), this);
            }
         }

         if (this.bl()) {
            this.k(300);
         } else if (this.r()) {
            this.g(this.dx().b((double)((this.al.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.al.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.al.i() * 360.0F);
            this.d(false);
            this.az = true;
         }

         if (this.gC()) {
            this.r(this.bl);
         }
      }

      super.m_();
   }

   boolean b(@Nullable brv $$0) {
      if (this.cp && $$0 instanceof ciy $$1 && $$1.ak() == this.ak()) {
         return true;
      }

      return false;
   }

   private boolean r() {
      if (!this.aE()) {
         return false;
      } else if (!this.cp) {
         return true;
      } else {
         this.cr--;
         if (this.cr < 0) {
            this.cr = this.al.a(40) + 20;
            return true;
         } else {
            return false;
         }
      }
   }

   protected avn x() {
      return this.cp ? avo.lO : avo.lN;
   }

   public float G(float $$0) {
      return aym.i($$0, this.ci, this.ch);
   }

   public float H(float $$0) {
      return aym.i($$0, this.cl, this.ck);
   }

   public float I(float $$0) {
      return ((float)this.cn + $$0) / (float)this.t();
   }

   public float gE() {
      return (float)this.cn;
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this);
   }

   public static boolean b(bsb<? extends ciy> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.al() != bpx.a && (bss.a($$2) || $$1.b_($$3).a(awj.a)) && $$1.b_($$3.d()).a(awj.a);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.dU().C) {
         return false;
      } else {
         if (!this.gB() && !$$0.a(awg.x) && !$$0.a(bqw.O) && $$0.c() instanceof bso $$2) {
            if (this.cp) {
               $$2.b(new brh(brj.t, 40, 0), this);
            } else {
               $$2.a(this.dX().d(this), 2.0F);
            }
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public void a(ewu $$0) {
      if (this.df() && this.bi()) {
         this.a(0.1F, $$0);
         this.a(bst.a, this.dx());
         this.g(this.dx().a(0.9));
         if (!this.gB() && this.p() == null) {
            this.g(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   protected byj E() {
      return new byj(this) {
         @Override
         public void a() {
            if (ciy.this.cp && ciy.this.bW() && ciy.this.dh() instanceof bso $$0 && $$0.ak() == ciy.this.ak()) {
               ciy.this.bj = $$0.bj;
            }

            super.a();
         }
      };
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      ewu $$3 = super.a($$0, $$1, $$2);
      if ($$0.ak() == this.ak()) {
         $$3 = $$3.b(0.0, this.gy(), 0.0);
      }

      return $$3;
   }

   protected double gy() {
      return -0.112;
   }

   static class a extends bzl {
      private final ciy a;
      private int b;
      private final boolean c;

      public a(ciy $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cir;
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = this.a.p();
         return $$0 != null && $$0.bI();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((brv)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.J().n();
         bso $$0 = this.a.p();
         if ($$0 != null) {
            this.a.F().a($$0, 90.0F, 90.0F);
         }

         this.a.az = true;
      }

      @Override
      public void d() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         bso $$0 = this.a.p();
         if ($$0 != null) {
            this.a.J().n();
            this.a.F().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.al());
                  if (!this.a.ba()) {
                     this.a.dU().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.t()) {
                  float $$1 = 1.0F;
                  if (this.a.dU().al() == bpx.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  if (this.a.gz()) {
                     $$0.b(new brh(brj.t, 40 + (int)$$1 * 10, 0), this.a);
                  } else {
                     $$0.a(this.a.dX().c(this.a, (brv)this.a), $$1);
                     $$0.a(this.a.dX().b((bso)this.a), (float)this.a.g(btv.c));
                  }

                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bso> {
      private final ciy a;

      public b(ciy $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bso $$0) {
         return ($$0 instanceof cly || $$0 instanceof cfd || $$0 instanceof cfq) && $$0.g(this.a) > 9.0;
      }
   }

   class c extends byn {
      c() {
         super(ciy.this);
      }

      @Override
      protected Optional<Float> h() {
         return !ciy.this.cp || !ciy.this.bW() && !ciy.this.bX() ? super.h() : Optional.empty();
      }

      @Override
      public void a() {
         if (ciy.this.dh() instanceof ciy $$0 && $$0.ak() == ciy.this.ak()) {
            ciy.this.bl = $$0.bl;
         }

         super.a();
      }
   }

   static class d extends byo {
      private final ciy l;

      public d(ciy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == byo.a.b && !this.l.J().l()) {
            ewu $$0 = new ewu(this.e - this.l.dz(), this.f - this.l.dB(), this.g - this.l.dF());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(aym.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dK(), $$5, 90.0F));
            this.l.bj = this.l.dK();
            float $$6 = (float)(this.h * this.l.g(btv.r));
            float $$7 = aym.i(0.125F, this.l.fw(), $$6);
            this.l.y($$7);
            double $$8 = Math.sin((double)(this.l.am + this.l.al()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dK() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dK() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.am + this.l.al()) * 0.75) * 0.05;
            this.l.g(this.l.dx().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            byn $$12 = this.l.F();
            double $$13 = this.l.dz() + $$2 * 2.0;
            double $$14 = this.l.dD() + $$3 / $$1;
            double $$15 = this.l.dF() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.F().a(aym.d(0.125, $$16, $$13), aym.d(0.125, $$17, $$14), aym.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.y(0.0F);
            this.l.w(false);
         }
      }
   }
}
