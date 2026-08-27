import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chn extends chr {
   protected static final int c = 80;
   private static final ajk<Boolean> b = ajo.a(chn.class, ajm.k);
   private static final ajk<Integer> e = ajo.a(chn.class, ajm.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private bre cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected byy d;

   public chn(bqr<? extends chn> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(emi.j, 0.0F);
      this.bP = new chn.c(this);
      this.bY = this.ah.i();
      this.bZ = this.bY;
   }

   @Override
   protected void z() {
      byp $$0 = new byp(this, 1.0);
      this.d = new byy(this, 1.0, 80);
      this.bS.a(4, new chn.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new byj(this, ckl.class, 8.0F));
      this.bS.a(8, new byj(this, chn.class, 12.0F, 0.01F));
      this.bS.a(9, new byw(this));
      this.d.a(EnumSet.of(byb.a.a, byb.a.b));
      $$0.a(EnumSet.of(byb.a.a, byb.a.b));
      this.bT.a(1, new bzu<>(this, bre.class, 10, true, false, new chn.b(this)));
   }

   public static bsk.a gp() {
      return chr.gv().a(bsl.c, 6.0).a(bsl.r, 0.5).a(bsl.k, 16.0).a(bsl.q, 30.0);
   }

   @Override
   protected cap b(czu $$0) {
      return new car(this, $$0);
   }

   @Override
   protected void a(ajo.a $$0) {
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
   public bre gs() {
      if (!this.gr()) {
         return null;
      } else if (this.dN().B) {
         if (this.cd != null) {
            return this.cd;
         } else {
            bql $$0 = this.dN().a(this.ao.a(e));
            if ($$0 instanceof bre) {
               this.cd = (bre)$$0;
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
   public void a(ajk<?> $$0) {
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
   protected auy v() {
      return this.bf() ? auz.ll : auz.lm;
   }

   @Override
   protected auy d(bpj $$0) {
      return this.bf() ? auz.lr : auz.ls;
   }

   @Override
   protected auy o_() {
      return this.bf() ? auz.lo : auz.lp;
   }

   @Override
   protected bql.b aZ() {
      return bql.b.c;
   }

   @Override
   public float a(im $$0, czx $$1) {
      return $$1.b_($$0).a(avt.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void n_() {
      if (this.bB()) {
         if (this.dN().B) {
            this.bZ = this.bY;
            if (!this.bc()) {
               this.ca = 2.0F;
               etf $$0 = this.dq();
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
               etf $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dN().a(kw.d, this.d(0.5) - $$1.c * 1.5, this.dv() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gr()) {
               if (this.ce < this.u()) {
                  this.ce++;
               }

               bre $$3 = this.gs();
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
                     this.dN().a(kw.d, this.ds() + $$5 * $$9, this.dw() + $$6 * $$9, this.dy() + $$7 * $$9, 0.0, 0.0, 0.0);
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

   protected auy y() {
      return auz.lq;
   }

   public float G(float $$0) {
      return axw.i($$0, this.bZ, this.bY);
   }

   public float H(float $$0) {
      return axw.i($$0, this.cc, this.cb);
   }

   public float I(float $$0) {
      return ((float)this.ce + $$0) / (float)this.u();
   }

   public float gt() {
      return (float)this.ce;
   }

   @Override
   public boolean a(czx $$0) {
      return $$0.f(this);
   }

   public static boolean b(bqr<? extends chn> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bon.a && (bri.a($$2) || $$1.b_($$3).a(avt.a)) && $$1.b_($$3.d()).a(avt.a);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.dN().B) {
         return false;
      } else {
         if (!this.gq() && !$$0.a(avq.x) && !$$0.a(bpm.N) && $$0.c() instanceof bre $$2) {
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
   public void a(etf $$0) {
      if (this.cY() && this.bc()) {
         this.a(0.1F, $$0);
         this.a(brj.a, this.dq());
         this.g(this.dq().a(0.9));
         if (!this.gq() && this.p() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends byb {
      private final chn a;
      private int b;
      private final boolean c;

      public a(chn $$0) {
         this.a = $$0;
         this.c = $$0 instanceof chg;
         this.a(EnumSet.of(byb.a.a, byb.a.b));
      }

      @Override
      public boolean a() {
         bre $$0 = this.a.p();
         return $$0 != null && $$0.bB();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.p() != null && this.a.g((bql)this.a.p()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.K().n();
         bre $$0 = this.a.p();
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
         bre $$0 = this.a.p();
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
                  if (this.a.dN().ak() == bon.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dO().c(this.a, (bql)this.a), $$1);
                  $$0.a(this.a.dO().b((bre)this.a), (float)this.a.g(bsl.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bre> {
      private final chn a;

      public b(chn $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bre $$0) {
         return ($$0 instanceof ckl || $$0 instanceof cds || $$0 instanceof cef) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends bxe {
      private final chn l;

      public c(chn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bxe.a.b && !this.l.K().l()) {
            etf $$0 = new etf(this.e - this.l.ds(), this.f - this.l.du(), this.g - this.l.dy());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(axw.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dD(), $$5, 90.0F));
            this.l.aZ = this.l.dD();
            float $$6 = (float)(this.h * this.l.g(bsl.r));
            float $$7 = axw.i(0.125F, this.l.fl(), $$6);
            this.l.y($$7);
            double $$8 = Math.sin((double)(this.l.ai + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dD() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dD() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ai + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dq().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bxd $$12 = this.l.G();
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

            this.l.G().a(axw.d(0.125, $$16, $$13), axw.d(0.125, $$17, $$14), axw.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.y(0.0F);
            this.l.w(false);
         }
      }
   }
}
