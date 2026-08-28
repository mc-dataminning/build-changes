import java.util.EnumSet;
import javax.annotation.Nullable;

public class cls extends clw {
   protected static final int b = 80;
   private static final ajx<Boolean> a = akb.a(cls.class, ajz.k);
   private static final ajx<Integer> d = akb.a(cls.class, ajz.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private bvf cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected cda c;

   public cls(buq<? extends cls> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(eto.j, 0.0F);
      this.bP = new cls.c(this);
      this.bY = this.ae.i();
      this.bZ = this.bY;
   }

   @Override
   protected void B() {
      ccr $$0 = new ccr(this, 1.0);
      this.c = new cda(this, 1.0, 80);
      this.bS.a(4, new cls.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.c);
      this.bS.a(8, new ccl(this, cov.class, 8.0F));
      this.bS.a(8, new ccl(this, cls.class, 12.0F, 0.01F));
      this.bS.a(9, new ccy(this));
      this.c.a(EnumSet.of(ccd.a.a, ccd.a.b));
      $$0.a(EnumSet.of(ccd.a.a, ccd.a.b));
      this.bT.a(1, new cdw<>(this, bvf.class, 10, true, false, new cls.b(this)));
   }

   public static bwm.a x() {
      return clw.gu().a(bwn.c, 6.0).a(bwn.v, 0.5).a(bwn.s, 30.0);
   }

   @Override
   protected cer b(dgg $$0) {
      return new cet(this, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(d, 0);
   }

   public boolean gp() {
      return this.al.a(a);
   }

   void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int p() {
      return 80;
   }

   void b(int $$0) {
      this.al.a(d, $$0);
   }

   public boolean gq() {
      return this.al.a(d) != 0;
   }

   @Nullable
   public bvf gr() {
      if (!this.gq()) {
         return null;
      } else if (this.dW().C) {
         if (this.cd != null) {
            return this.cd;
         } else {
            buj $$0 = this.dW().a(this.al.a(d));
            if ($$0 instanceof bvf) {
               this.cd = (bvf)$$0;
               return this.cd;
            } else {
               return null;
            }
         }
      } else {
         return this.O_();
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.ce = 0;
         this.cd = null;
      }
   }

   @Override
   public int Q() {
      return 160;
   }

   @Override
   protected avy u() {
      return this.bm() ? avz.lO : avz.lP;
   }

   @Override
   protected avy e(bsz $$0) {
      return this.bm() ? avz.lU : avz.lV;
   }

   @Override
   protected avy o_() {
      return this.bm() ? avz.lR : avz.lS;
   }

   @Override
   protected buj.c bg() {
      return buj.c.c;
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return $$1.b_($$0).a(awu.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bL()) {
         if (this.dW().C) {
            this.bZ = this.bY;
            if (!this.bj()) {
               this.ca = 2.0F;
               fay $$0 = this.dz();
               if ($$0.e > 0.0 && this.cf && !this.bb()) {
                  this.dW().a(this.dB(), this.dD(), this.dH(), this.t(), this.dn(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.e < 0.0 && this.dW().a(this.dw().e(), this);
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
            if (!this.bm()) {
               this.cb = this.ae.i();
            } else if (this.gp()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gp() && this.bj()) {
               fay $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dW().a(lt.d, this.d(0.5) - $$1.d * 1.5, this.dE() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gq()) {
               if (this.ce < this.p()) {
                  this.ce++;
               }

               bvf $$3 = this.gr();
               if ($$3 != null) {
                  this.H().a($$3, 90.0F, 90.0F);
                  this.H().a();
                  double $$4 = (double)this.L(0.0F);
                  double $$5 = $$3.dB() - this.dB();
                  double $$6 = $$3.e(0.5) - this.dF();
                  double $$7 = $$3.dH() - this.dH();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ae.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ae.j() * (1.7 - $$4);
                     this.dW().a(lt.d, this.dB() + $$5 * $$9, this.dF() + $$6 * $$9, this.dH() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bm()) {
            this.j(300);
         } else if (this.aJ()) {
            this.h(this.dz().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.4F)));
            this.v(this.ae.i() * 360.0F);
            this.d(false);
            this.ar = true;
         }

         if (this.gq()) {
            this.v(this.aZ);
         }
      }

      super.d_();
   }

   protected avy t() {
      return avz.lT;
   }

   public float J(float $$0) {
      return ayy.h($$0, this.bZ, this.bY);
   }

   public float K(float $$0) {
      return ayy.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return ((float)this.ce + $$0) / (float)this.p();
   }

   public float gs() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dgj $$0) {
      return $$0.f(this);
   }

   public static boolean b(buq<? extends cls> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.am() != bsf.a && (bup.a($$2) || $$1.b_($$3).a(awu.a)) && $$1.b_($$3.e()).a(awu.a);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (!this.gp() && !$$1.a(awq.w) && !$$1.a(btc.P) && $$1.c() instanceof bvf $$3) {
         $$3.a($$0, this.dX().d(this), 2.0F);
      }

      if (this.c != null) {
         this.c.i();
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void a_(fay $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bvj.a, this.dz());
         this.h(this.dz().c(0.9));
         if (!this.gp() && this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends ccd {
      private final cls a;
      private int b;
      private final boolean c;

      public a(cls $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cll;
         this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      }

      @Override
      public boolean b() {
         bvf $$0 = this.a.O_();
         return $$0 != null && $$0.bL();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.O_() != null && this.a.g((buj)this.a.O_()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.L().m();
         bvf $$0 = this.a.O_();
         if ($$0 != null) {
            this.a.H().a($$0, 90.0F, 90.0F);
         }

         this.a.ar = true;
      }

      @Override
      public void e() {
         this.a.b(0);
         this.a.h(null);
         this.a.c.i();
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvf $$0 = this.a.O_();
         if ($$0 != null) {
            this.a.L().m();
            this.a.H().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ar());
                  if (!this.a.bb()) {
                     this.a.dW().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.p()) {
                  float $$1 = 1.0F;
                  if (this.a.dW().am() == bsf.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  arc $$2 = a(this.a);
                  $$0.a($$2, this.a.dX().c(this.a, (buj)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements cfw.a {
      private final cls a;

      public b(cls $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bvf $$0, arc $$1) {
         return ($$0 instanceof cov || $$0 instanceof chv || $$0 instanceof cii) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cbg {
      private final cls l;

      public c(cls $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbg.a.b && !this.l.L().k()) {
            fay $$0 = new fay(this.e - this.l.dB(), this.f - this.l.dD(), this.g - this.l.dH());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(ayy.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dM(), $$5, 90.0F));
            this.l.aX = this.l.dM();
            float $$6 = (float)(this.h * this.l.h(bwn.v));
            float $$7 = ayy.h(0.125F, this.l.fp(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dM() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dM() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ar()) * 0.75) * 0.05;
            this.l.h(this.l.dz().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cbf $$12 = this.l.H();
            double $$13 = this.l.dB() + $$2 * 2.0;
            double $$14 = this.l.dF() + $$3 / $$1;
            double $$15 = this.l.dH() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.H().a(ayy.d(0.125, $$16, $$13), ayy.d(0.125, $$17, $$14), ayy.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
