import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cpc extends cpg {
   private static final Logger b = LogUtils.getLogger();
   private final azs c = azs.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final akl<Integer> g = akp.a(cpc.class, akn.b);
   private static final akl<Boolean> h = akp.a(cpc.class, akn.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bue o;
   private cpc.a p = cpc.a.a;
   private final int q;
   private final int r;

   private cpc(bul<? extends cpc> $$0, dfb $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cpc(bul<? extends cpc> $$0, dfb $$1) {
      this($$0, $$1, 0, 0);
   }

   public cpc(com $$0, dfb $$1, int $$2, int $$3, cwb $$4) {
      this(bul.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$5 = $$0.dP();
      float $$6 = $$0.dN();
      float $$7 = azk.b(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = azk.a(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$9 = -azk.b(-$$5 * (float) (Math.PI / 180.0));
      float $$10 = azk.a(-$$5 * (float) (Math.PI / 180.0));
      double $$11 = $$0.dC() - (double)$$8 * 0.3;
      double $$12 = $$0.dG();
      double $$13 = $$0.dI() - (double)$$7 * 0.3;
      this.b($$11, $$12, $$13, $$6, $$5);
      ezn $$14 = new ezn((double)(-$$8), (double)azk.a(-($$10 / $$9), -5.0F, 5.0F), (double)(-$$7));
      double $$15 = $$14.g();
      $$14 = $$14.d(0.6 / $$15 + this.af.a(0.5, 0.0103365), 0.6 / $$15 + this.af.a(0.5, 0.0103365), 0.6 / $$15 + this.af.a(0.5, 0.0103365));
      this.h($$14);
      this.v((float)(azk.d($$14.d, $$14.f) * 180.0F / (float)Math.PI));
      this.w((float)(azk.d($$14.e, $$14.i()) * 180.0F / (float)Math.PI));
      this.O = this.dN();
      this.P = this.dP();
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   protected boolean C() {
      return true;
   }

   @Override
   public void a(akl<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.aw().a(g);
         this.o = $$1 > 0 ? this.dX().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.aw().a(h);
         if (this.d) {
            this.n(this.dA().d, (double)(-0.4F * azk.a(this.c, 0.6F, 1.0F)), this.dA().f);
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
      this.c.b(this.cH().getLeastSignificantBits() ^ this.dX().aa());
      super.l();
      com $$0 = this.o();
      if ($$0 == null) {
         this.av();
      } else if (this.dX().C || !this.a($$0)) {
         if (this.aK()) {
            this.i++;
            if (this.i >= 1200) {
               this.av();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         jh $$2 = this.dx();
         erk $$3 = this.dX().b_($$2);
         if ($$3.a(axg.a)) {
            $$1 = $$3.a(this.dX(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cpc.a.a) {
            if (this.o != null) {
               this.h(ezn.c);
               this.p = cpc.a.b;
               return;
            }

            if ($$4) {
               this.h(this.dA().d(0.3, 0.2, 0.3));
               this.p = cpc.a.c;
               return;
            }

            this.t();
         } else {
            if (this.p == cpc.a.b) {
               if (this.o != null) {
                  if (!this.o.dS() && this.o.dX().ag() == this.dX().ag()) {
                     this.a_(this.o.dC(), this.o.e(0.8), this.o.dI());
                  } else {
                     this.B(null);
                     this.p = cpc.a.a;
                  }
               }

               return;
            }

            if (this.p == cpc.a.c) {
               ezn $$5 = this.dA();
               double $$6 = this.dE() + $$5.e - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.n($$5.d * 0.9, $$5.e - $$6 * (double)this.af.i() * 0.2, $$5.f * 0.9);
               if (this.j <= 0 && this.l <= 0) {
                  this.n = true;
               } else {
                  this.n = this.n && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.h(this.dA().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dX().C) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(axg.a)) {
            this.h(this.dA().b(0.0, -0.03, 0.0));
         }

         this.a(bve.a, this.dA());
         this.aL();
         this.F();
         if (this.p == cpc.a.a && (this.aK() || this.Q)) {
            this.h(ezn.c);
         }

         double $$7 = 0.92;
         this.h(this.dA().c(0.92));
         this.aA();
      }
   }

   private boolean a(com $$0) {
      cwb $$1 = $$0.fb();
      cwb $$2 = $$0.fc();
      boolean $$3 = $$1.a(cwf.qW);
      boolean $$4 = $$2.a(cwf.qW);
      if (!$$0.dS() && $$0.bM() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.av();
         return true;
      }
   }

   private void t() {
      ezl $$0 = cpi.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bue $$0) {
      return super.b($$0) || $$0.bM() && $$0 instanceof ckv;
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(ezj $$0) {
      super.a($$0);
      this.h(this.dA().d().c($$0.a(this)));
   }

   private void B(@Nullable bue $$0) {
      this.o = $$0;
      this.aw().a(g, $$0 == null ? 0 : $$0.as() + 1);
   }

   private void a(jh $$0) {
      arn $$1 = (arn)this.dX();
      int $$2 = 1;
      jh $$3 = $$0.d();
      if (this.af.i() < 0.25F && this.dX().r($$3)) {
         $$2++;
      }

      if (this.af.i() < 0.5F && !this.dX().h($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.aw().a(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.af.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = azk.a($$4);
            float $$6 = azk.b($$4);
            double $$7 = this.dC() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)azk.a(this.dE()) + 1.0F);
            double $$9 = this.dI() + (double)($$6 * (float)this.l * 0.1F);
            dvj $$10 = $$1.a_(jh.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dig.G)) {
               if (this.af.i() < 0.15F) {
                  $$1.a(lr.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lr.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lr.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awl.iY, 0.25F, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
            double $$13 = this.dE() + 0.5;
            $$1.a(lr.d, this.dC(), $$13, this.dI(), (int)(1.0F + this.ds() * 20.0F), (double)this.ds(), 0.0, (double)this.ds(), 0.2F);
            $$1.a(lr.E, this.dC(), $$13, this.dI(), (int)(1.0F + this.ds() * 20.0F), (double)this.ds(), 0.0, (double)this.ds(), 0.2F);
            this.j = azk.a(this.af, 20, 40);
            this.aw().a(h, true);
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

         if (this.af.i() < $$14) {
            float $$15 = azk.a(this.af, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = azk.a(this.af, 25.0F, 60.0F);
            double $$17 = this.dC() + (double)(azk.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)azk.a(this.dE()) + 1.0F);
            double $$19 = this.dI() + (double)(azk.b($$15) * $$16) * 0.1;
            dvj $$20 = $$1.a_(jh.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dig.G)) {
               $$1.a(lr.am, $$17, $$18, $$19, 2 + this.af.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = azk.a(this.af, 0.0F, 360.0F);
            this.l = azk.a(this.af, 20, 80);
         }
      } else {
         this.k = azk.a(this.af, 100, 600);
         this.k = this.k - this.r;
      }
   }

   private boolean b(jh $$0) {
      cpc.b $$1 = cpc.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cpc.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cpc.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cpc.b.a) {
                  return false;
               }
               break;
            case c:
               return false;
         }

         $$1 = $$3;
      }

      return true;
   }

   private cpc.b a(jh $$0, jh $$1) {
      return jh.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cpc.b.c).orElse(cpc.b.c);
   }

   private cpc.b c(jh $$0) {
      dvj $$1 = this.dX().a_($$0);
      if (!$$1.l() && !$$1.a(dig.fm)) {
         erk $$2 = $$1.y();
         return $$2.a(axg.a) && $$2.b() && $$1.g(this.dX(), $$0).c() ? cpc.b.b : cpc.b.c;
      } else {
         return cpc.b.a;
      }
   }

   public boolean m() {
      return this.n;
   }

   @Override
   public void b(uk $$0) {
   }

   @Override
   public void a(uk $$0) {
   }

   public int a(cwb $$0) {
      com $$1 = this.o();
      if (!this.dX().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.d(this.o);
            ao.E.a((aro)$$1, $$0, this, Collections.emptyList());
            this.dX().a(this, (byte)31);
            $$2 = this.o instanceof ckv ? 3 : 5;
         } else if (this.j > 0) {
            euf $$3 = new euf.a((arn)this.dX()).a(ewy.f, this.dv()).a(ewy.i, $$0).a(ewy.a, this).a((float)this.q + $$1.gG()).a(ewx.f);
            euh $$4 = this.dX().o().bc().b(ety.am);
            List<cwb> $$5 = $$4.a($$3);
            ao.E.a((aro)$$1, $$0, this, $$5);

            for (cwb $$6 : $$5) {
               ckv $$7 = new ckv(this.dX(), this.dC(), this.dE(), this.dI(), $$6);
               double $$8 = $$1.dC() - this.dC();
               double $$9 = $$1.dE() - this.dE();
               double $$10 = $$1.dI() - this.dI();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dX().b($$7);
               $$1.dX().b(new buq($$1.dX(), $$1.dC(), $$1.dE() + 0.5, $$1.dI() + 0.5, this.af.a(6) + 1));
               if ($$6.a(axj.aT)) {
                  $$1.a(awv.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aK()) {
            $$2 = 2;
         }

         this.av();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dX().C && this.o instanceof com && ((com)this.o).g()) {
         this.d(this.o);
      }

      super.b($$0);
   }

   protected void d(bue $$0) {
      bue $$1 = this.s();
      if ($$1 != null) {
         ezn $$2 = new ezn($$1.dC() - this.dC(), $$1.dE() - this.dE(), $$1.dI() - this.dI()).c(0.1);
         $$0.h($$0.dA().e($$2));
      }
   }

   @Override
   protected bue.b bh() {
      return bue.b.a;
   }

   @Override
   public void a(bue.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ax() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bue $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cpc $$0) {
      com $$1 = this.o();
      if ($$1 != null) {
         $$1.cv = $$0;
      }
   }

   @Nullable
   public com o() {
      bue $$0 = this.s();
      return $$0 instanceof com ? (com)$$0 : null;
   }

   @Nullable
   public bue q() {
      return this.o;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public zp<ace> a(arm $$0) {
      bue $$1 = this.s();
      return new acf(this, $$0, $$1 == null ? this.as() : $$1.as());
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      if (this.o() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dX().a($$1), $$1);
         this.au();
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
