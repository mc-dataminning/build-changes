import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cij extends cin {
   protected static final int c = 80;
   private static final ajm<Boolean> b = ajq.a(cij.class, ajo.k);
   private static final ajm<Integer> e = ajq.a(cij.class, ajo.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private bsa cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected bzu d;

   public cij(brn<? extends cij> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(emr.j, 0.0F);
      this.bP = new cij.c(this);
      this.bY = this.ah.i();
      this.bZ = this.bY;
   }

   @Override
   protected void z() {
      bzl $$0 = new bzl(this, 1.0);
      this.d = new bzu(this, 1.0, 80);
      this.bS.a(4, new cij.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new bzf(this, clh.class, 8.0F));
      this.bS.a(8, new bzf(this, cij.class, 12.0F, 0.01F));
      this.bS.a(9, new bzs(this));
      this.d.a(EnumSet.of(byx.a.a, byx.a.b));
      $$0.a(EnumSet.of(byx.a.a, byx.a.b));
      this.bT.a(1, new caq<>(this, bsa.class, 10, true, false, new cij.b(this)));
   }

   public static btg.a gp() {
      return cin.gv().a(bth.c, 6.0).a(bth.r, 0.5).a(bth.k, 16.0).a(bth.q, 30.0);
   }

   @Override
   protected cbl b(dad $$0) {
      return new cbn(this, $$0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(e, 0);
   }

   public boolean gq() {
      return this.ao.a(b);
   }

   void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   public int u() {
      return 80;
   }

   void b(int $$0) {
      this.ao.a(e, $$0);
   }

   public boolean gr() {
      return this.ao.a(e) != 0;
   }

   @Nullable
   public bsa gs() {
      if (!this.gr()) {
         return null;
      } else if (this.dN().B) {
         if (this.cd != null) {
            return this.cd;
         } else {
            brh $$0 = this.dN().a(this.ao.a(e));
            if ($$0 instanceof bsa) {
               this.cd = (bsa)$$0;
               return this.cd;
            } else {
               return null;
            }
         }
      } else {
         return this.p();
      }
   }

   @Override
   public void a(ajm<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.ce = 0;
         this.cd = null;
      }
   }

   @Override
   public int O() {
      return 160;
   }

   @Override
   protected avb v() {
      return this.bf() ? avc.ll : avc.lm;
   }

   @Override
   protected avb d(bqf $$0) {
      return this.bf() ? avc.lr : avc.ls;
   }

   @Override
   protected avb o_() {
      return this.bf() ? avc.lo : avc.lp;
   }

   @Override
   protected brh.b aZ() {
      return brh.b.c;
   }

   @Override
   public float a(in $$0, dag $$1) {
      return $$1.b_($$0).a(avw.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bB()) {
         if (this.dN().B) {
            this.bZ = this.bY;
            if (!this.bc()) {
               this.ca = 2.0F;
               etp $$0 = this.dq();
               if ($$0.d > 0.0 && this.cf && !this.aU()) {
                  this.dN().a(this.ds(), this.du(), this.dy(), this.y(), this.dc(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.d < 0.0 && this.dN().a(this.dn().d(), this);
            } else if (this.gq()) {
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
            if (!this.bf()) {
               this.cb = this.ah.i();
            } else if (this.gq()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gq() && this.bc()) {
               etp $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dN().a(kx.d, this.d(0.5) - $$1.c * 1.5, this.dv() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gr()) {
               if (this.ce < this.u()) {
                  this.ce++;
               }

               bsa $$3 = this.gs();
               if ($$3 != null) {
                  this.G().a($$3, 90.0F, 90.0F);
                  this.G().a();
                  double $$4 = (double)this.I(0.0F);
                  double $$5 = $$3.ds() - this.ds();
                  double $$6 = $$3.e(0.5) - this.dw();
                  double $$7 = $$3.dy() - this.dy();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ah.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ah.j() * (1.7 - $$4);
                     this.dN().a(kx.d, this.ds() + $$5 * $$9, this.dw() + $$6 * $$9, this.dy() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bf()) {
            this.k(300);
         } else if (this.aC()) {
            this.g(this.dq().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ah.i() * 360.0F);
            this.d(false);
            this.av = true;
         }

         if (this.gr()) {
            this.r(this.bb);
         }
      }

      super.n_();
   }

   protected avb y() {
      return avc.lq;
   }

   public float G(float $$0) {
      return axz.i($$0, this.bZ, this.bY);
   }

   public float H(float $$0) {
      return axz.i($$0, this.cc, this.cb);
   }

   public float I(float $$0) {
      return ((float)this.ce + $$0) / (float)this.u();
   }

   public float gt() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dag $$0) {
      return $$0.f(this);
   }

   public static boolean b(brn<? extends cij> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bpj.a && (bse.a($$2) || $$1.b_($$3).a(avw.a)) && $$1.b_($$3.d()).a(avw.a);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.dN().B) {
         return false;
      } else {
         if (!this.gq() && !$$0.a(avt.x) && !$$0.a(bqi.N) && $$0.c() instanceof bsa $$2) {
            $$2.a(this.dO().d(this), 2.0F);
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
   public void a(etp $$0) {
      if (this.cY() && this.bc()) {
         this.a(0.1F, $$0);
         this.a(bsf.a, this.dq());
         this.g(this.dq().a(0.9));
         if (!this.gq() && this.p() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends byx {
      private final cij a;
      private int b;
      private final boolean c;

      public a(cij $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cic;
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean a() {
         bsa $$0 = this.a.p();
         return $$0 != null && $$0.bB();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((brh)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.K().n();
         bsa $$0 = this.a.p();
         if ($$0 != null) {
            this.a.G().a($$0, 90.0F, 90.0F);
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
         bsa $$0 = this.a.p();
         if ($$0 != null) {
            this.a.K().n();
            this.a.G().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.aj());
                  if (!this.a.aU()) {
                     this.a.dN().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.u()) {
                  float $$1 = 1.0F;
                  if (this.a.dN().ak() == bpj.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dO().c(this.a, (brh)this.a), $$1);
                  $$0.a(this.a.dO().b((bsa)this.a), (float)this.a.g(bth.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bsa> {
      private final cij a;

      public b(cij $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsa $$0) {
         return ($$0 instanceof clh || $$0 instanceof ceo || $$0 instanceof cfb) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends bya {
      private final cij l;

      public c(cij $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bya.a.b && !this.l.K().l()) {
            etp $$0 = new etp(this.e - this.l.ds(), this.f - this.l.du(), this.g - this.l.dy());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(axz.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dD(), $$5, 90.0F));
            this.l.aZ = this.l.dD();
            float $$6 = (float)(this.h * this.l.g(bth.r));
            float $$7 = axz.i(0.125F, this.l.fl(), $$6);
            this.l.y($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dD() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dD() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dq().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bxz $$12 = this.l.G();
            double $$13 = this.l.ds() + $$2 * 2.0;
            double $$14 = this.l.dw() + $$3 / $$1;
            double $$15 = this.l.dy() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.G().a(axz.d(0.125, $$16, $$13), axz.d(0.125, $$17, $$14), axz.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.y(0.0F);
            this.l.w(false);
         }
      }
   }
}
