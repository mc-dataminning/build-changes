import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cbz extends ccd {
   private static final Logger b = LogUtils.getLogger();
   private final art c = art.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final adx<Integer> g = aea.a(cbz.class, adz.b);
   private static final adx<Boolean> h = aea.a(cbz.class, adz.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private big o;
   private cbz.a p = cbz.a.a;
   private final int q;
   private final int r;

   private cbz(bik<? extends cbz> $$0, cpk $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cbz(bik<? extends cbz> $$0, cpk $$1) {
      this($$0, $$1, 0, 0);
   }

   public cbz(cbl $$0, cpk $$1, int $$2, int $$3) {
      this(bik.bu, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dC();
      float $$5 = $$0.dA();
      float $$6 = aro.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aro.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aro.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = aro.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dp() - (double)$$7 * 0.3;
      double $$11 = $$0.dt();
      double $$12 = $$0.dv() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ehf $$13 = new ehf((double)(-$$7), (double)aro.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.f($$13);
      this.r((float)(aro.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(aro.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dA();
      this.O = this.dC();
   }

   @Override
   protected void a_() {
      this.al().a(g, 0);
      this.al().a(h, false);
   }

   @Override
   public void a(adx<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.al().b(g);
         this.o = $$1 > 0 ? this.dK().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.al().b(h);
         if (this.d) {
            this.o(this.dn().c, (double)(-0.4F * aro.a(this.c, 0.6F, 1.0F)), this.dn().e);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0;
      return $$0 < 4096.0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
   }

   @Override
   public void l() {
      this.c.b(this.cv().getLeastSignificantBits() ^ this.dK().V());
      super.l();
      cbl $$0 = this.m();
      if ($$0 == null) {
         this.ak();
      } else if (this.dK().B || !this.a($$0)) {
         if (this.aA()) {
            this.i++;
            if (this.i >= 1200) {
               this.ak();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         gv $$2 = this.dk();
         eab $$3 = this.dK().b_($$2);
         if ($$3.a(apo.a)) {
            $$1 = $$3.a((coq)this.dK(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cbz.a.a) {
            if (this.o != null) {
               this.f(ehf.b);
               this.p = cbz.a.b;
               return;
            }

            if ($$4) {
               this.f(this.dn().d(0.3, 0.2, 0.3));
               this.p = cbz.a.c;
               return;
            }

            this.p();
         } else {
            if (this.p == cbz.a.b) {
               if (this.o != null) {
                  if (!this.o.dF() && this.o.dK().ac() == this.dK().ac()) {
                     this.e(this.o.dp(), this.o.e(0.8), this.o.dv());
                  } else {
                     this.A(null);
                     this.p = cbz.a.a;
                  }
               }

               return;
            }

            if (this.p == cbz.a.c) {
               ehf $$5 = this.dn();
               double $$6 = this.dr() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.ag.i() * 0.2, $$5.e * 0.9);
               if (this.j <= 0 && this.l <= 0) {
                  this.n = true;
               } else {
                  this.n = this.n && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.f(this.dn().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dK().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(apo.a)) {
            this.f(this.dn().b(0.0, -0.03, 0.0));
         }

         this.a(bjc.a, this.dn());
         this.B();
         if (this.p == cbz.a.a && (this.aA() || this.P)) {
            this.f(ehf.b);
         }

         double $$7 = 0.92;
         this.f(this.dn().a(0.92));
         this.ap();
      }
   }

   private boolean a(cbl $$0) {
      ciw $$1 = $$0.eR();
      ciw $$2 = $$0.eS();
      boolean $$3 = $$1.a(ciz.qh);
      boolean $$4 = $$2.a(ciz.qh);
      if (!$$0.dF() && $$0.bv() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.ak();
         return true;
      }
   }

   private void p() {
      ehd $$0 = cce.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(big $$0) {
      return super.a($$0) || $$0.bv() && $$0 instanceof bye;
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      this.f(this.dn().d().a($$0.a(this)));
   }

   private void A(@Nullable big $$0) {
      this.o = $$0;
      this.al().b(g, $$0 == null ? 0 : $$0.ah() + 1);
   }

   private void a(gv $$0) {
      aki $$1 = (aki)this.dK();
      int $$2 = 1;
      gv $$3 = $$0.c();
      if (this.ag.i() < 0.25F && this.dK().q($$3)) {
         $$2++;
      }

      if (this.ag.i() < 0.5F && !this.dK().g($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.al().b(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ag.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = aro.a($$4);
            float $$6 = aro.b($$4);
            double $$7 = this.dp() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)aro.a(this.dr()) + 1.0F);
            double $$9 = this.dv() + (double)($$6 * (float)this.l * 0.1F);
            dey $$10 = $$1.a_(gv.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(csl.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(iw.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(iw.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(iw.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(aou.hQ, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dr() + 0.5;
            $$1.a(iw.e, this.dp(), $$13, this.dv(), (int)(1.0F + this.df() * 20.0F), (double)this.df(), 0.0, (double)this.df(), 0.2F);
            $$1.a(iw.B, this.dp(), $$13, this.dv(), (int)(1.0F + this.df() * 20.0F), (double)this.df(), 0.0, (double)this.df(), 0.2F);
            this.j = aro.a(this.ag, 20, 40);
            this.al().b(h, true);
         }
      } else if (this.k > 0) {
         this.k -= $$2;
         float $$14 = 0.15F;
         if (this.k < 20) {
            $$14 += (float)(20 - this.k) * 0.05F;
         } else if (this.k < 40) {
            $$14 += (float)(40 - this.k) * 0.02F;
         } else if (this.k < 60) {
            $$14 += (float)(60 - this.k) * 0.01F;
         }

         if (this.ag.i() < $$14) {
            float $$15 = aro.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = aro.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dp() + (double)(aro.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)aro.a(this.dr()) + 1.0F);
            double $$19 = this.dv() + (double)(aro.b($$15) * $$16) * 0.1;
            dey $$20 = $$1.a_(gv.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(csl.G)) {
               $$1.a(iw.ag, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = aro.a(this.ag, 0.0F, 360.0F);
            this.l = aro.a(this.ag, 20, 80);
         }
      } else {
         this.k = aro.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(gv $$0) {
      cbz.b $$1 = cbz.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cbz.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cbz.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cbz.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cbz.b a(gv $$0, gv $$1) {
      return gv.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cbz.b.c).orElse(cbz.b.c);
   }

   private cbz.b c(gv $$0) {
      dey $$1 = this.dK().a_($$0);
      if (!$$1.i() && !$$1.a(csl.fm)) {
         eab $$2 = $$1.u();
         return $$2.a(apo.a) && $$2.b() && $$1.k(this.dK(), $$0).c() ? cbz.b.b : cbz.b.c;
      } else {
         return cbz.b.a;
      }
   }

   public boolean j() {
      return this.n;
   }

   @Override
   public void b(qs $$0) {
   }

   @Override
   public void a(qs $$0) {
   }

   public int a(ciw $$0) {
      cbl $$1 = this.m();
      if (!this.dK().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            ai.D.a((akj)$$1, $$0, this, Collections.emptyList());
            this.dK().a(this, (byte)31);
            $$2 = this.o instanceof bye ? 3 : 5;
         } else if (this.j > 0) {
            ecn $$3 = new ecn.a((aki)this.dK()).a(eet.f, this.di()).a(eet.i, $$0).a(eet.a, this).a((float)this.q + $$1.gm()).a(ees.e);
            ecp $$4 = this.dK().n().aH().getLootTable(ecd.ai);
            List<ciw> $$5 = $$4.a($$3);
            ai.D.a((akj)$$1, $$0, this, $$5);

            for (ciw $$6 : $$5) {
               bye $$7 = new bye(this.dK(), this.dp(), this.dr(), this.dv(), $$6);
               double $$8 = $$1.dp() - this.dp();
               double $$9 = $$1.dr() - this.dr();
               double $$10 = $$1.dv() - this.dv();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dK().b($$7);
               $$1.dK().b(new bim($$1.dK(), $$1.dp(), $$1.dr() + 0.5, $$1.dv() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(apr.ao)) {
                  $$1.a(ape.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aA()) {
            $$2 = 2;
         }

         this.ak();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dK().B && this.o instanceof cbl && ((cbl)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(big $$0) {
      big $$1 = this.v();
      if ($$1 != null) {
         ehf $$2 = new ehf($$1.dp() - this.dp(), $$1.dr() - this.dr(), $$1.dv() - this.dv()).a(0.1);
         $$0.f($$0.dn().e($$2));
      }
   }

   @Override
   protected big.b aU() {
      return big.b.a;
   }

   @Override
   public void a(big.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void am() {
      this.a(null);
   }

   @Override
   public void b(@Nullable big $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cbz $$0) {
      cbl $$1 = this.m();
      if ($$1 != null) {
         $$1.ci = $$0;
      }
   }

   @Nullable
   public cbl m() {
      big $$0 = this.v();
      return $$0 instanceof cbl ? (cbl)$$0 : null;
   }

   @Nullable
   public big o() {
      return this.o;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public uw<wo> U() {
      big $$0 = this.v();
      return new wp(this, $$0 == null ? this.ah() : $$0.ah());
   }

   @Override
   public void a(wp $$0) {
      super.a($$0);
      if (this.m() == null) {
         int $$1 = $$0.o();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dK().a($$1), $$1);
         this.aj();
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }
}
