import java.util.EnumSet;
import javax.annotation.Nullable;

public class clu extends cly {
   protected static final int b = 80;
   private static final akm<Boolean> a = akq.a(clu.class, ako.k);
   private static final akm<Integer> d = akq.a(clu.class, ako.b);
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   @Nullable
   private bvh cd;
   private int ce;
   private boolean cf;
   @Nullable
   protected cdc c;

   public clu(bus<? extends clu> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(esm.j, 0.0F);
      this.bP = new clu.c(this);
      this.bY = this.ae.i();
      this.bZ = this.bY;
   }

   @Override
   protected void B() {
      cct $$0 = new cct(this, 1.0);
      this.c = new cdc(this, 1.0, 80);
      this.bS.a(4, new clu.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.c);
      this.bS.a(8, new ccn(this, cou.class, 8.0F));
      this.bS.a(8, new ccn(this, clu.class, 12.0F, 0.01F));
      this.bS.a(9, new cda(this));
      this.c.a(EnumSet.of(ccf.a.a, ccf.a.b));
      $$0.a(EnumSet.of(ccf.a.a, ccf.a.b));
      this.bT.a(1, new cdy<>(this, bvh.class, 10, true, false, new clu.b(this)));
   }

   public static bwo.a gm() {
      return cly.gs().a(bwp.c, 6.0).a(bwp.v, 0.5).a(bwp.s, 30.0);
   }

   @Override
   protected cet b(dfm $$0) {
      return new cev(this, $$0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, false);
      $$0.a(d, 0);
   }

   public boolean gn() {
      return this.al.a(a);
   }

   void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   public int q() {
      return 80;
   }

   void b(int $$0) {
      this.al.a(d, $$0);
   }

   public boolean go() {
      return this.al.a(d) != 0;
   }

   @Nullable
   public bvh gp() {
      if (!this.go()) {
         return null;
      } else if (this.dV().C) {
         if (this.cd != null) {
            return this.cd;
         } else {
            bul $$0 = this.dV().a(this.al.a(d));
            if ($$0 instanceof bvh) {
               this.cd = (bvh)$$0;
               return this.cd;
            } else {
               return null;
            }
         }
      } else {
         return this.aa_();
      }
   }

   @Override
   public void a(akm<?> $$0) {
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
   protected awm t() {
      return this.bm() ? awn.lp : awn.lq;
   }

   @Override
   protected awm e(btb $$0) {
      return this.bm() ? awn.lv : awn.lw;
   }

   @Override
   protected awm n_() {
      return this.bm() ? awn.ls : awn.lt;
   }

   @Override
   protected bul.b bg() {
      return bul.b.c;
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      return $$1.b_($$0).a(axi.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bL()) {
         if (this.dV().C) {
            this.bZ = this.bY;
            if (!this.bj()) {
               this.ca = 2.0F;
               ezy $$0 = this.dy();
               if ($$0.e > 0.0 && this.cf && !this.bb()) {
                  this.dV().a(this.dA(), this.dC(), this.dG(), this.v(), this.dm(), 1.0F, 1.0F, false);
               }

               this.cf = $$0.e < 0.0 && this.dV().a(this.dv().e(), this);
            } else if (this.gn()) {
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
            } else if (this.gn()) {
               this.cb = this.cb + (0.0F - this.cb) * 0.25F;
            } else {
               this.cb = this.cb + (1.0F - this.cb) * 0.06F;
            }

            if (this.gn() && this.bj()) {
               ezy $$1 = this.g(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dV().a(ls.d, this.d(0.5) - $$1.d * 1.5, this.dD() - $$1.e * 1.5, this.g(0.5) - $$1.f * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.go()) {
               if (this.ce < this.q()) {
                  this.ce++;
               }

               bvh $$3 = this.gp();
               if ($$3 != null) {
                  this.H().a($$3, 90.0F, 90.0F);
                  this.H().a();
                  double $$4 = (double)this.L(0.0F);
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
                     this.dV().a(ls.d, this.dA() + $$5 * $$9, this.dE() + $$6 * $$9, this.dG() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bm()) {
            this.j(300);
         } else if (this.aJ()) {
            this.h(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.4F)));
            this.v(this.ae.i() * 360.0F);
            this.d(false);
            this.ar = true;
         }

         if (this.go()) {
            this.v(this.aY);
         }
      }

      super.d_();
   }

   protected awm v() {
      return awn.lu;
   }

   public float J(float $$0) {
      return azm.h($$0, this.bZ, this.bY);
   }

   public float K(float $$0) {
      return azm.h($$0, this.cc, this.cb);
   }

   public float L(float $$0) {
      return ((float)this.ce + $$0) / (float)this.q();
   }

   public float gq() {
      return (float)this.ce;
   }

   @Override
   public boolean a(dfp $$0) {
      return $$0.f(this);
   }

   public static boolean b(bus<? extends clu> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bsh.a && (bur.a($$2) || $$1.b_($$3).a(axi.a)) && $$1.b_($$3.e()).a(axi.a);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (!this.gn() && !$$1.a(axe.w) && !$$1.a(bte.P) && $$1.c() instanceof bvh $$3) {
         $$3.a($$0, this.dW().d(this), 2.0F);
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
   public void a_(ezy $$0) {
      if (this.di() && this.bj()) {
         this.a(0.1F, $$0);
         this.a(bvl.a, this.dy());
         this.h(this.dy().c(0.9));
         if (!this.gn() && this.aa_() == null) {
            this.h(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   static class a extends ccf {
      private final clu a;
      private int b;
      private final boolean c;

      public a(clu $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cln;
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         bvh $$0 = this.a.aa_();
         return $$0 != null && $$0.bL();
      }

      @Override
      public boolean c() {
         return super.c() && (this.c || this.a.aa_() != null && this.a.g((bul)this.a.aa_()) > 9.0);
      }

      @Override
      public void d() {
         this.b = -10;
         this.a.L().o();
         bvh $$0 = this.a.aa_();
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
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         bvh $$0 = this.a.aa_();
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
                     this.a.dV().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.q()) {
                  float $$1 = 1.0F;
                  if (this.a.dV().ak() == bsh.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  arp $$2 = a(this.a);
                  $$0.a($$2, this.a.dW().c(this.a, (bul)this.a), $$1);
                  this.a.c($$2, $$0);
                  this.a.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b implements cfy.a {
      private final clu a;

      public b(clu $$0) {
         this.a = $$0;
      }

      @Override
      public boolean test(@Nullable bvh $$0, arp $$1) {
         return ($$0 instanceof cou || $$0 instanceof chx || $$0 instanceof cik) && $$0.g(this.a) > 9.0;
      }
   }

   static class c extends cbi {
      private final clu l;

      public c(clu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == cbi.a.b && !this.l.L().m()) {
            ezy $$0 = new ezy(this.e - this.l.dA(), this.f - this.l.dC(), this.g - this.l.dG());
            double $$1 = $$0.g();
            double $$2 = $$0.d / $$1;
            double $$3 = $$0.e / $$1;
            double $$4 = $$0.f / $$1;
            float $$5 = (float)(azm.d($$0.f, $$0.d) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aW = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bwp.v));
            float $$7 = azm.h(0.125F, this.l.fn(), $$6);
            this.l.C($$7);
            double $$8 = Math.sin((double)(this.l.af + this.l.ar()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dL() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dL() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.af + this.l.ar()) * 0.75) * 0.05;
            this.l.h(this.l.dy().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            cbh $$12 = this.l.H();
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

            this.l.H().a(azm.d(0.125, $$16, $$13), azm.d(0.125, $$17, $$14), azm.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.x(true);
         } else {
            this.l.C(0.0F);
            this.l.x(false);
         }
      }
   }
}
