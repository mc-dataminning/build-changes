import java.util.EnumSet;
import javax.annotation.Nullable;

public class cms extends cmw {
   protected static final int b = 80;
   private static final alc<Boolean> a = alg.a(cms.class, ale.k);
   private static final alc<Integer> d = alg.a(cms.class, ale.b);
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   @Nullable
   private bwf ce;
   private int cf;
   private boolean cg;
   @Nullable
   protected cea c;

   public cms(bvq<? extends cms> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 10;
      this.a(eun.j, 0.0F);
      this.bQ = new cms.c(this);
      this.bZ = this.ae.i();
      this.ca = this.bZ;
   }

   @Override
   protected void B() {
      cdr $$0 = new cdr(this, 1.0);
      this.c = new cea(this, 1.0, 80);
      this.bT.a(4, new cms.a(this));
      this.bT.a(5, $$0);
      this.bT.a(7, this.c);
      this.bT.a(8, new cdl(this, cpw.class, 8.0F));
      this.bT.a(8, new cdl(this, cms.class, 12.0F, 0.01F));
      this.bT.a(9, new cdy(this));
      this.c.a(EnumSet.of(cdd.a.a, cdd.a.b));
      $$0.a(EnumSet.of(cdd.a.a, cdd.a.b));
      this.bU.a(1, new cew<>(this, bwf.class, 10, true, false, new cms.b(this)));
   }

   public static bxm.a x() {
      return cmw.gt().a(bxn.c, 6.0).a(bxn.v, 0.5).a(bxn.s, 30.0);
   }

   @Override
   protected cfr b(dhh $$0) {
      return new cft(this, $$0);
   }

   @Override
   protected void a(alg.a $$0) {
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
   public bwf gq() {
      if (!this.gp()) {
         return null;
      } else if (this.dW().C) {
         if (this.ce != null) {
            return this.ce;
         } else {
            bvj $$0 = this.dW().a(this.al.a(d));
            if ($$0 instanceof bwf) {
               this.ce = (bwf)$$0;
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
   public void a(alc<?> $$0) {
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
   protected axe u() {
      return this.bm() ? axf.lI : axf.lJ;
   }

   @Override
   protected axe e(btz $$0) {
      return this.bm() ? axf.lO : axf.lP;
   }

   @Override
   protected axe o_() {
      return this.bm() ? axf.lL : axf.lM;
   }

   @Override
   protected bvj.c bg() {
      return bvj.c.c;
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      return $$1.b_($$0).a(aya.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bL()) {
         if (this.dW().C) {
            this.ca = this.bZ;
            if (!this.bj()) {
               this.cb = 2.0F;
               fbx $$0 = this.dz();
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
               fbx $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dW().a(ls.d, this.d(0.5) - $$1.d * 1.5, this.dE() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gp()) {
               if (this.cf < this.p()) {
                  this.cf++;
               }

               bwf $$3 = this.gq();
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

   protected axe t() {
      return axf.lN;
   }

   public float J(float $$0) {
      return bae.h($$0, this.ca, this.bZ);
   }

   public float K(float $$0) {
      return bae.h($$0, this.cd, this.cc);
   }

   public float L(float $$0) {
      return ((float)this.cf + $$0) / (float)this.p();
   }

   public float gr() {
      return (float)this.cf;
   }

   @Override
   public boolean a(dhk $$0) {
      return $$0.f(this);
   }

   public static boolean b(bvq<? extends cms> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.al() != btf.a && (bvp.a($$2) || $$1.b_($$3).a(aya.a)) && $$1.b_($$3.e()).a(aya.a);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (!this.go() && !$$1.a(axw.w) && !$$1.a(buc.P) && $$1.c() instanceof bwf $$3) {
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
   public void a_(fbx $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bwj.a, this.dz());
         this.h(this.dz().c(0.9));
         if (!this.go() && this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cdd {
      private final cms a;
      private int b;
      private final boolean c;

      public a(cms $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cml;
         this.a(EnumSet.of(cdd.a.a, cdd.a.b));
      }

      @Override
      public boolean b() {
         bwf $$0 = this.a.O_();
         return $$0 != null && $$0.bL();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.O_() != null && this.a.g((bvj)this.a.O_()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.L().o();
         bwf $$0 = this.a.O_();
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
         bwf $$0 = this.a.O_();
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
                  if (this.a.dW().al() == btf.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  ash $$2 = a(this.a);
                  $$0.a($$2, this.a.dX().c(this.a, (bvj)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements cgw.a {
      private final cms a;

      public b(cms $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bwf $$0, ash $$1) {
         return ($$0 instanceof cpw || $$0 instanceof civ || $$0 instanceof cji) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends ccg {
      private final cms l;

      public c(cms $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == ccg.a.b && !this.l.L().m()) {
            fbx $$0 = new fbx(this.e - this.l.dB(), this.f - this.l.dD(), this.g - this.l.dH());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(bae.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dM(), $$5, 90.0F));
            this.l.aX = this.l.dM();
            float $$6 = (float)(this.h * this.l.h(bxn.v));
            float $$7 = bae.h(0.125F, this.l.fp(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dM() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dM() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ar()) * 0.75) * 0.05;
            this.l.h(this.l.dz().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            ccf $$12 = this.l.H();
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

            this.l.H().a(bae.d(0.125, $$16, $$13), bae.d(0.125, $$17, $$14), bae.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
