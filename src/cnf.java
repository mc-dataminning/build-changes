import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnf extends cnj {
   protected static final int b = 80;
   private static final akg<Boolean> a = akk.a(cnf.class, aki.k);
   private static final akg<Integer> d = akk.a(cnf.class, aki.b);
   private float bE;
   private float bF;
   private float bG;
   private float bH;
   private float bI;
   @Nullable
   private bwr bJ;
   private int bK;
   private boolean bL;
   @Nullable
   protected cek c;

   public cnf(bwb<? extends cnf> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 10;
      this.a(evk.j, 0.0F);
      this.by = new cnf.c(this);
      this.bE = this.ae.i();
      this.bF = this.bE;
   }

   @Override
   protected void D() {
      ceb $$0 = new ceb(this, 1.0);
      this.c = new cek(this, 1.0, 80);
      this.bB.a(4, new cnf.a(this));
      this.bB.a(5, $$0);
      this.bB.a(7, this.c);
      this.bB.a(8, new cdv(this, cqi.class, 8.0F));
      this.bB.a(8, new cdv(this, cnf.class, 12.0F, 0.01F));
      this.bB.a(9, new cei(this));
      this.c.a(EnumSet.of(cdn.a.a, cdn.a.b));
      $$0.a(EnumSet.of(cdn.a.a, cdn.a.b));
      this.bC.a(1, new cfg<>(this, bwr.class, 10, true, false, new cnf.b(this)));
   }

   public static bxw.a q() {
      return cnj.gt().a(bxx.c, 6.0).a(bxx.v, 0.5).a(bxx.s, 30.0);
   }

   @Override
   protected cgb b(dhp $$0) {
      return new cgd(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(d, 0);
   }

   public boolean t() {
      return this.al.a(a);
   }

   void w(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int m() {
      return 80;
   }

   void b(int $$0) {
      this.al.a(d, $$0);
   }

   public boolean x() {
      return this.al.a(d) != 0;
   }

   @Nullable
   public bwr gq() {
      if (!this.x()) {
         return null;
      } else if (this.dV().C) {
         if (this.bJ != null) {
            return this.bJ;
         } else {
            bvs $$0 = this.dV().a(this.al.a(d));
            if ($$0 instanceof bwr) {
               this.bJ = (bwr)$$0;
               return this.bJ;
            } else {
               return null;
            }
         }
      } else {
         return this.f();
      }
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.bK = 0;
         this.bJ = null;
      }
   }

   @Override
   public int S() {
      return 160;
   }

   @Override
   protected awj u() {
      return this.bj() ? awk.lO : awk.lP;
   }

   @Override
   protected awj e(buh $$0) {
      return this.bj() ? awk.lU : awk.lV;
   }

   @Override
   protected awj l_() {
      return this.bj() ? awk.lR : awk.lS;
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.c;
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return $$1.b_($$0).a(axf.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void k_() {
      if (this.bK()) {
         if (this.dV().C) {
            this.bF = this.bE;
            if (!this.bj()) {
               this.bG = 2.0F;
               fcu $$0 = this.dy();
               if ($$0.e > 0.0 && this.bL && !this.bb()) {
                  this.dV().a(this.dA(), this.dC(), this.dG(), this.n(), this.dm(), 1.0F, 1.0F, false);
               }

               this.bL = $$0.e < 0.0 && this.dV().a(this.dv().e(), this);
            } else if (this.t()) {
               if (this.bG < 0.5F) {
                  this.bG = 4.0F;
               } else {
                  this.bG = this.bG + (0.5F - this.bG) * 0.1F;
               }
            } else {
               this.bG = this.bG + (0.125F - this.bG) * 0.2F;
            }

            this.bE = this.bE + this.bG;
            this.bI = this.bH;
            if (!this.bj()) {
               this.bH = this.ae.i();
            } else if (this.t()) {
               this.bH = this.bH + (0.0F - this.bH) * 0.25F;
            } else {
               this.bH = this.bH + (1.0F - this.bH) * 0.06F;
            }

            if (this.t() && this.bj()) {
               fcu $$1 = this.h(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dV().a(lv.d, this.d(0.5) - $$1.d * 1.5, this.dD() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.x()) {
               if (this.bK < this.m()) {
                  this.bK++;
               }

               bwr $$3 = this.gq();
               if ($$3 != null) {
                  this.J().a($$3, 90.0F, 90.0F);
                  this.J().a();
                  double $$4 = (double)this.M(0.0F);
                  double $$5 = $$3.dA() - this.dA();
                  double $$6 = $$3.e(0.5) - this.dE();
                  double $$7 = $$3.dG() - this.dG();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ae.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ae.j() * (1.7 - $$4);
                     this.dV().a(lv.d, this.dA() + $$5 * $$9, this.dE() + $$6 * $$9, this.dG() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bj()) {
            this.j(300);
         } else if (this.aJ()) {
            this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.4F)));
            this.w(this.ae.i() * 360.0F);
            this.d(false);
            this.ar = true;
         }

         if (this.x()) {
            this.w(this.aW);
         }
      }

      super.k_();
   }

   protected awj n() {
      return awk.lT;
   }

   public float K(float $$0) {
      return azk.h($$0, this.bF, this.bE);
   }

   public float L(float $$0) {
      return azk.h($$0, this.bI, this.bH);
   }

   public float M(float $$0) {
      return ((float)this.bK + $$0) / (float)this.m();
   }

   public float gr() {
      return (float)this.bK;
   }

   @Override
   public boolean a(dhs $$0) {
      return $$0.f(this);
   }

   public static boolean b(bwb<? extends cnf> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.an() != btn.a && (bwa.a($$2) || $$1.b_($$3).a(axf.a)) && $$1.b_($$3.e()).a(axf.a);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (!this.t() && !$$1.a(axb.w) && !$$1.a(buk.P) && $$1.c() instanceof bwr $$3) {
         $$3.a($$0, this.dW().d(this), 2.0F);
      }

      if (this.c != null) {
         this.c.i();
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int ac() {
      return 180;
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bj()) {
         this.a(0.1F, $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.9));
         if (!this.t() && this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends cdn {
      private final cnf a;
      private int b;
      private final boolean c;

      public a(cnf $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cmy;
         this.a(EnumSet.of(cdn.a.a, cdn.a.b));
      }

      @Override
      public boolean b() {
         bwr $$0 = this.a.f();
         return $$0 != null && $$0.bK();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.f() != null && this.a.g((bvs)this.a.f()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.O().m();
         bwr $$0 = this.a.f();
         if ($$0 != null) {
            this.a.J().a($$0, 90.0F, 90.0F);
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
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bwr $$0 = this.a.f();
         if ($$0 != null) {
            this.a.O().m();
            this.a.J().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ar());
                  if (!this.a.bb()) {
                     this.a.dV().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.m()) {
                  float $$1 = 1.0F;
                  if (this.a.dV().an() == btn.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  arn $$2 = a(this.a);
                  $$0.a($$2, this.a.dW().c(this.a, (bvs)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements chg.a {
      private final cnf a;

      public b(cnf $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bwr $$0, arn $$1) {
         return ($$0 instanceof cqi || $$0 instanceof cjh || $$0 instanceof cjv) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends ccq {
      private final cnf l;

      public c(cnf $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == ccq.a.b && !this.l.O().k()) {
            fcu $$0 = new fcu(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azk.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aU = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bxx.v));
            float $$7 = azk.h(0.125F, this.l.fn(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dL() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dL() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ar()) * 0.75) * 0.05;
            this.l.i(this.l.dy().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            ccp $$12 = this.l.J();
            double $$13 = this.l.dA() + $$2 * 2.0;
            double $$14 = this.l.dE() + $$3 / $$1;
            double $$15 = this.l.dG() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.J().a(azk.d(0.125, $$16, $$13), azk.d(0.125, $$17, $$14), azk.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.C(0.0F);
            this.l.w(false);
         }
      }
   }
}
