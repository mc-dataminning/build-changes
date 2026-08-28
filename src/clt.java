import java.util.EnumSet;
import javax.annotation.Nullable;

public class clt extends clx {
   protected static final int b = 80;
   private static final ajx<Boolean> a = akb.a(clt.class, ajz.k);
   private static final ajx<Integer> d = akb.a(clt.class, ajz.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private bvg cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected cdb c;

   public clt(bur<? extends clt> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(etq.j, 0.0F);
      this.bP = new clt.c(this);
      this.bY = this.ae.i();
      this.bZ = this.bY;
   }

   @Override
   protected void B() {
      ccs $$0 = new ccs(this, 1.0);
      this.c = new cdb(this, 1.0, 80);
      this.bS.a(4, new clt.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.c);
      this.bS.a(8, new ccm(this, cox.class, 8.0F));
      this.bS.a(8, new ccm(this, clt.class, 12.0F, 0.01F));
      this.bS.a(9, new ccz(this));
      this.c.a(EnumSet.of(cce.a.a, cce.a.b));
      $$0.a(EnumSet.of(cce.a.a, cce.a.b));
      this.bT.a(1, new cdx<>(this, bvg.class, 10, true, false, new clt.b(this)));
   }

   public static bwn.a x() {
      return clx.gu().a(bwo.c, 6.0).a(bwo.v, 0.5).a(bwo.s, 30.0);
   }

   @Override
   protected ces b(dgi $$0) {
      return new ceu(this, $$0);
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
   public bvg gr() {
      if (!this.gq()) {
         return null;
      } else if (this.dW().C) {
         if (this.cd != null) {
            return this.cd;
         } else {
            buk $$0 = this.dW().a(this.al.a(d));
            if ($$0 instanceof bvg) {
               this.cd = (bvg)$$0;
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
   protected avz u() {
      return this.bm() ? awa.lO : awa.lP;
   }

   @Override
   protected avz e(bta $$0) {
      return this.bm() ? awa.lU : awa.lV;
   }

   @Override
   protected avz o_() {
      return this.bm() ? awa.lR : awa.lS;
   }

   @Override
   protected buk.c bg() {
      return buk.c.c;
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return $$1.b_($$0).a(awv.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bL()) {
         if (this.dW().C) {
            this.bZ = this.bY;
            if (!this.bj()) {
               this.ca = 2.0F;
               fba $$0 = this.dz();
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
               fba $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dW().a(lt.d, this.d(0.5) - $$1.d * 1.5, this.dE() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gq()) {
               if (this.ce < this.p()) {
                  this.ce++;
               }

               bvg $$3 = this.gr();
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

   protected avz t() {
      return awa.lT;
   }

   public float J(float $$0) {
      return ayz.h($$0, this.bZ, this.bY);
   }

   public float K(float $$0) {
      return ayz.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return ((float)this.ce + $$0) / (float)this.p();
   }

   public float gs() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dgl $$0) {
      return $$0.f(this);
   }

   public static boolean b(bur<? extends clt> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.am() != bsg.a && (buq.a($$2) || $$1.b_($$3).a(awv.a)) && $$1.b_($$3.e()).a(awv.a);
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (!this.gp() && !$$1.a(awr.w) && !$$1.a(btd.P) && $$1.c() instanceof bvg $$3) {
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
   public void a_(fba $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bvk.a, this.dz());
         this.h(this.dz().c(0.9));
         if (!this.gp() && this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cce {
      private final clt a;
      private int b;
      private final boolean c;

      public a(clt $$0) {
         this.a = $$0;
         this.c = $$0 instanceof clm;
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean b() {
         bvg $$0 = this.a.O_();
         return $$0 != null && $$0.bL();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.O_() != null && this.a.g((buk)this.a.O_()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.L().m();
         bvg $$0 = this.a.O_();
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
         bvg $$0 = this.a.O_();
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
                  if (this.a.dW().am() == bsg.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  arc $$2 = a(this.a);
                  $$0.a($$2, this.a.dX().c(this.a, (buk)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements cfx.a {
      private final clt a;

      public b(clt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bvg $$0, arc $$1) {
         return ($$0 instanceof cox || $$0 instanceof chw || $$0 instanceof cij) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cbh {
      private final clt l;

      public c(clt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbh.a.b && !this.l.L().k()) {
            fba $$0 = new fba(this.e - this.l.dB(), this.f - this.l.dD(), this.g - this.l.dH());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(ayz.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dM(), $$5, 90.0F));
            this.l.aX = this.l.dM();
            float $$6 = (float)(this.h * this.l.h(bwo.v));
            float $$7 = ayz.h(0.125F, this.l.fp(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dM() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dM() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ar()) * 0.75) * 0.05;
            this.l.h(this.l.dz().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cbg $$12 = this.l.H();
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

            this.l.H().a(ayz.d(0.125, $$16, $$13), ayz.d(0.125, $$17, $$14), ayz.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
