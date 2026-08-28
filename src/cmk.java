import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmk extends cmo {
   protected static final int b = 80;
   private static final aks<Boolean> a = akw.a(cmk.class, aku.k);
   private static final aks<Integer> d = akw.a(cmk.class, aku.b);
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   @Nullable
   private bvx ce;
   private int cf;
   private boolean cg;
   @Nullable
   protected cds c;

   public cmk(bvi<? extends cmk> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 10;
      this.a(euh.j, 0.0F);
      this.bQ = new cmk.c(this);
      this.bZ = this.ae.i();
      this.ca = this.bZ;
   }

   @Override
   protected void B() {
      cdj $$0 = new cdj(this, 1.0);
      this.c = new cds(this, 1.0, 80);
      this.bT.a(4, new cmk.a(this));
      this.bT.a(5, $$0);
      this.bT.a(7, this.c);
      this.bT.a(8, new cdd(this, cpo.class, 8.0F));
      this.bT.a(8, new cdd(this, cmk.class, 12.0F, 0.01F));
      this.bT.a(9, new cdq(this));
      this.c.a(EnumSet.of(ccv.a.a, ccv.a.b));
      $$0.a(EnumSet.of(ccv.a.a, ccv.a.b));
      this.bU.a(1, new ceo<>(this, bvx.class, 10, true, false, new cmk.b(this)));
   }

   public static bxe.a x() {
      return cmo.gt().a(bxf.c, 6.0).a(bxf.v, 0.5).a(bxf.s, 30.0);
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cfl(this, $$0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(d, 0);
   }

   public boolean go() {
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

   public boolean gp() {
      return this.al.a(d) != 0;
   }

   @Nullable
   public bvx gq() {
      if (!this.gp()) {
         return null;
      } else if (this.dW().C) {
         if (this.ce != null) {
            return this.ce;
         } else {
            bvb $$0 = this.dW().a(this.al.a(d));
            if ($$0 instanceof bvx) {
               this.ce = (bvx)$$0;
               return this.ce;
            } else {
               return null;
            }
         }
      } else {
         return this.O_();
      }
   }

   @Override
   public void a(aks<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.cf = 0;
         this.ce = null;
      }
   }

   @Override
   public int Q() {
      return 160;
   }

   @Override
   protected awu u() {
      return this.bm() ? awv.lO : awv.lP;
   }

   @Override
   protected awu e(btr $$0) {
      return this.bm() ? awv.lU : awv.lV;
   }

   @Override
   protected awu o_() {
      return this.bm() ? awv.lR : awv.lS;
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.c;
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return $$1.b_($$0).a(axq.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bL()) {
         if (this.dW().C) {
            this.ca = this.bZ;
            if (!this.bj()) {
               this.cb = 2.0F;
               fbr $$0 = this.dz();
               if ($$0.e > 0.0 && this.cg && !this.bb()) {
                  this.dW().a(this.dB(), this.dD(), this.dH(), this.t(), this.dn(), 1.0F, 1.0F, false);
               }

               this.cg = $$0.e < 0.0 && this.dW().a(this.dw().e(), this);
            } else if (this.go()) {
               if (this.cb < 0.5F) {
                  this.cb = 4.0F;
               } else {
                  this.cb = this.cb + (0.5F - this.cb) * 0.1F;
               }
            } else {
               this.cb = this.cb + (0.125F - this.cb) * 0.2F;
            }

            this.bZ = this.bZ + this.cb;
            this.cd = this.cc;
            if (!this.bm()) {
               this.cc = this.ae.i();
            } else if (this.go()) {
               this.cc = this.cc + (0.0F - this.cc) * 0.25F;
            } else {
               this.cc = this.cc + (1.0F - this.cc) * 0.06F;
            }

            if (this.go() && this.bj()) {
               fbr $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dW().a(ls.d, this.d(0.5) - $$1.d * 1.5, this.dE() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gp()) {
               if (this.cf < this.p()) {
                  this.cf++;
               }

               bvx $$3 = this.gq();
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
                     this.dW().a(ls.d, this.dB() + $$5 * $$9, this.dF() + $$6 * $$9, this.dH() + $$7 * $$9, 0.0, 0.0, 0.0);
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

         if (this.gp()) {
            this.v(this.aZ);
         }
      }

      super.d_();
   }

   protected awu t() {
      return awv.lT;
   }

   public float J(float $$0) {
      return azu.h($$0, this.ca, this.bZ);
   }

   public float K(float $$0) {
      return azu.h($$0, this.cd, this.cc);
   }

   public float L(float $$0) {
      return ((float)this.cf + $$0) / (float)this.p();
   }

   public float gr() {
      return (float)this.cf;
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   public static boolean b(bvi<? extends cmk> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.am() != bsx.a && (bvh.a($$2) || $$1.b_($$3).a(axq.a)) && $$1.b_($$3.e()).a(axq.a);
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (!this.go() && !$$1.a(axm.w) && !$$1.a(btu.P) && $$1.c() instanceof bvx $$3) {
         $$3.a($$0, this.dX().d(this), 2.0F);
      }

      if (this.c != null) {
         this.c.i();
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bwb.a, this.dz());
         this.h(this.dz().c(0.9));
         if (!this.go() && this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends ccv {
      private final cmk a;
      private int b;
      private final boolean c;

      public a(cmk $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cmd;
         this.a(EnumSet.of(ccv.a.a, ccv.a.b));
      }

      @Override
      public boolean b() {
         bvx $$0 = this.a.O_();
         return $$0 != null && $$0.bL();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.O_() != null && this.a.g((bvb)this.a.O_()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.L().o();
         bvx $$0 = this.a.O_();
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
         bvx $$0 = this.a.O_();
         if ($$0 != null) {
            this.a.L().o();
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
                  if (this.a.dW().am() == bsx.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  arx $$2 = a(this.a);
                  $$0.a($$2, this.a.dX().c(this.a, (bvb)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements cgo.a {
      private final cmk a;

      public b(cmk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bvx $$0, arx $$1) {
         return ($$0 instanceof cpo || $$0 instanceof cin || $$0 instanceof cja) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cby {
      private final cmk l;

      public c(cmk $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cby.a.b && !this.l.L().m()) {
            fbr $$0 = new fbr(this.e - this.l.dB(), this.f - this.l.dD(), this.g - this.l.dH());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azu.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dM(), $$5, 90.0F));
            this.l.aX = this.l.dM();
            float $$6 = (float)(this.h * this.l.h(bxf.v));
            float $$7 = azu.h(0.125F, this.l.fp(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dM() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dM() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ar()) * 0.75) * 0.05;
            this.l.h(this.l.dz().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cbx $$12 = this.l.H();
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

            this.l.H().a(azu.d(0.125, $$16, $$13), azu.d(0.125, $$17, $$14), azu.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
