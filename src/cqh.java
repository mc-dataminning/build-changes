import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cqh extends cql {
   private static final Logger a = LogUtils.getLogger();
   private final bam b = bam.a();
   private boolean c;
   private int d;
   private static final int e = 10;
   private static final alc<Integer> f = alg.a(cqh.class, ale.b);
   private static final alc<Boolean> g = alg.a(cqh.class, ale.k);
   private int h;
   private int i;
   private int j;
   private int k;
   private float l;
   private boolean m = true;
   @Nullable
   private bvf n;
   private cqh.a o = cqh.a.a;
   private final int p;
   private final int q;

   private cqh(bvm<? extends cqh> $$0, dha $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.p = Math.max(0, $$2);
      this.q = Math.max(0, $$3);
   }

   public cqh(bvm<? extends cqh> $$0, dha $$1) {
      this($$0, $$1, 0, 0);
   }

   public cqh(cps $$0, dha $$1, int $$2, int $$3, cxk $$4) {
      this(bvm.bT, $$1, $$2, $$3);
      this.c($$0);
      float $$5 = $$0.dN();
      float $$6 = $$0.dL();
      float $$7 = bae.b(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = bae.a(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$9 = -bae.b(-$$5 * (float) (Math.PI / 180.0));
      float $$10 = bae.a(-$$5 * (float) (Math.PI / 180.0));
      double $$11 = $$0.dA() - (double)$$8 * 0.3;
      double $$12 = $$0.dE();
      double $$13 = $$0.dG() - (double)$$7 * 0.3;
      this.b($$11, $$12, $$13, $$6, $$5);
      fbs $$14 = new fbs((double)(-$$8), (double)bae.a(-($$10 / $$9), -5.0F, 5.0F), (double)(-$$7));
      double $$15 = $$14.g();
      $$14 = $$14.d(0.6 / $$15 + this.ae.a(0.5, 0.0103365), 0.6 / $$15 + this.ae.a(0.5, 0.0103365), 0.6 / $$15 + this.ae.a(0.5, 0.0103365));
      this.h($$14);
      this.v((float)(bae.d($$14.d, $$14.f) * 180.0F / (float)Math.PI));
      this.w((float)(bae.d($$14.e, $$14.i()) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, false);
   }

   @Override
   protected boolean B() {
      return true;
   }

   @Override
   public void a(alc<?> $$0) {
      if (f.equals($$0)) {
         int $$1 = this.au().a(f);
         this.n = $$1 > 0 ? this.dV().a($$1 - 1) : null;
      }

      if (g.equals($$0)) {
         this.c = this.au().a(g);
         if (this.c) {
            this.n(this.dy().d, (double)(-0.4F * bae.a(this.b, 0.6F, 1.0F)), this.dy().f);
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
   public void h() {
      this.b.b(this.cG().getLeastSignificantBits() ^ this.dV().ac());
      super.h();
      cps $$0 = this.m();
      if ($$0 == null) {
         this.at();
      } else if (this.dV().C || !this.a($$0)) {
         if (this.aJ()) {
            this.h++;
            if (this.h >= 1200) {
               this.at();
               return;
            }
         } else {
            this.h = 0;
         }

         float $$1 = 0.0F;
         jh $$2 = this.dv();
         etp $$3 = this.dV().b_($$2);
         if ($$3.a(aya.a)) {
            $$1 = $$3.a(this.dV(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.o == cqh.a.a) {
            if (this.n != null) {
               this.h(fbs.c);
               this.o = cqh.a.b;
               return;
            }

            if ($$4) {
               this.h(this.dy().d(0.3, 0.2, 0.3));
               this.o = cqh.a.c;
               return;
            }

            this.t();
         } else {
            if (this.o == cqh.a.b) {
               if (this.n != null) {
                  if (!this.n.dQ() && this.n.dV().ah() == this.dV().ah()) {
                     this.a_(this.n.dA(), this.n.e(0.8), this.n.dG());
                  } else {
                     this.B(null);
                     this.o = cqh.a.a;
                  }
               }

               return;
            }

            if (this.o == cqh.a.c) {
               fbs $$5 = this.dy();
               double $$6 = this.dC() + $$5.e - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.n($$5.d * 0.9, $$5.e - $$6 * (double)this.ae.i() * 0.2, $$5.f * 0.9);
               if (this.i <= 0 && this.k <= 0) {
                  this.m = true;
               } else {
                  this.m = this.m && this.d < 10 && this.b($$2);
               }

               if ($$4) {
                  this.d = Math.max(0, this.d - 1);
                  if (this.c) {
                     this.h(this.dy().b(0.0, -0.1 * (double)this.b.i() * (double)this.b.i(), 0.0));
                  }

                  if (!this.dV().C) {
                     this.a($$2);
                  }
               } else {
                  this.d = Math.min(10, this.d + 1);
               }
            }
         }

         if (!$$3.a(aya.a)) {
            this.h(this.dy().b(0.0, -0.03, 0.0));
         }

         this.a(bwf.a, this.dy());
         this.aK();
         this.E();
         if (this.o == cqh.a.a && (this.aJ() || this.P)) {
            this.h(fbs.c);
         }

         double $$7 = 0.92;
         this.h(this.dy().c(0.92));
         this.ay();
      }
   }

   private boolean a(cps $$0) {
      cxk $$1 = $$0.eX();
      cxk $$2 = $$0.eY();
      boolean $$3 = $$1.a(cxo.rJ);
      boolean $$4 = $$2.a(cxo.rJ);
      if (!$$0.dQ() && $$0.bL() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.at();
         return true;
      }
   }

   private void t() {
      fbq $$0 = cqn.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bvf $$0) {
      return super.b($$0) || $$0.bL() && $$0 instanceof clw;
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      this.h(this.dy().d().c($$0.a(this)));
   }

   private void B(@Nullable bvf $$0) {
      this.n = $$0;
      this.au().a(f, $$0 == null ? 0 : $$0.ar() + 1);
   }

   private void a(jh $$0) {
      ash $$1 = (ash)this.dV();
      int $$2 = 1;
      jh $$3 = $$0.d();
      if (this.ae.i() < 0.25F && this.dV().r($$3)) {
         $$2++;
      }

      if (this.ae.i() < 0.5F && !this.dV().h($$3)) {
         $$2--;
      }

      if (this.i > 0) {
         this.i--;
         if (this.i <= 0) {
            this.j = 0;
            this.k = 0;
            this.au().a(g, false);
         }
      } else if (this.k > 0) {
         this.k -= $$2;
         if (this.k > 0) {
            this.l = this.l + (float)this.ae.a(0.0, 9.188);
            float $$4 = this.l * (float) (Math.PI / 180.0);
            float $$5 = bae.a($$4);
            float $$6 = bae.b($$4);
            double $$7 = this.dA() + (double)($$5 * (float)this.k * 0.1F);
            double $$8 = (double)((float)bae.a(this.dC()) + 1.0F);
            double $$9 = this.dG() + (double)($$6 * (float)this.k * 0.1F);
            dxn $$10 = $$1.a_(jh.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dkg.J)) {
               if (this.ae.i() < 0.15F) {
                  $$1.a(ls.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(ls.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(ls.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(axf.jq, 0.25F, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
            double $$13 = this.dC() + 0.5;
            $$1.a(ls.d, this.dA(), $$13, this.dG(), (int)(1.0F + this.dq() * 20.0F), (double)this.dq(), 0.0, (double)this.dq(), 0.2F);
            $$1.a(ls.E, this.dA(), $$13, this.dG(), (int)(1.0F + this.dq() * 20.0F), (double)this.dq(), 0.0, (double)this.dq(), 0.2F);
            this.i = bae.a(this.ae, 20, 40);
            this.au().a(g, true);
         }
      } else if (this.j > 0) {
         this.j -= $$2;
         float $$14 = 0.15F;
         if (this.j < 20) {
            $$14 += (float)(20 - this.j) * 0.05F;
         } else if (this.j < 40) {
            $$14 += (float)(40 - this.j) * 0.02F;
         } else if (this.j < 60) {
            $$14 += (float)(60 - this.j) * 0.01F;
         }

         if (this.ae.i() < $$14) {
            float $$15 = bae.a(this.ae, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = bae.a(this.ae, 25.0F, 60.0F);
            double $$17 = this.dA() + (double)(bae.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)bae.a(this.dC()) + 1.0F);
            double $$19 = this.dG() + (double)(bae.b($$15) * $$16) * 0.1;
            dxn $$20 = $$1.a_(jh.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dkg.J)) {
               $$1.a(ls.an, $$17, $$18, $$19, 2 + this.ae.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.j <= 0) {
            this.l = bae.a(this.ae, 0.0F, 360.0F);
            this.k = bae.a(this.ae, 20, 80);
         }
      } else {
         this.j = bae.a(this.ae, 100, 600);
         this.j = this.j - this.q;
      }
   }

   private boolean b(jh $$0) {
      cqh.b $$1 = cqh.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cqh.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cqh.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cqh.b.a) {
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

   private cqh.b a(jh $$0, jh $$1) {
      return jh.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cqh.b.c).orElse(cqh.b.c);
   }

   private cqh.b c(jh $$0) {
      dxn $$1 = this.dV().a_($$0);
      if (!$$1.l() && !$$1.a(dkg.fA)) {
         etp $$2 = $$1.y();
         return $$2.a(aya.a) && $$2.b() && $$1.g(this.dV(), $$0).c() ? cqh.b.b : cqh.b.c;
      } else {
         return cqh.b.a;
      }
   }

   public boolean l() {
      return this.m;
   }

   @Override
   public void b(ux $$0) {
   }

   @Override
   public void a(ux $$0) {
   }

   public int a(cxk $$0) {
      cps $$1 = this.m();
      if (!this.dV().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.n != null) {
            this.d(this.n);
            ao.E.a((asi)$$1, $$0, this, Collections.emptyList());
            this.dV().a(this, (byte)31);
            $$2 = this.n instanceof clw ? 3 : 5;
         } else if (this.i > 0) {
            ewk $$3 = new ewk.a((ash)this.dV()).a(ezd.f, this.dt()).a(ezd.i, $$0).a(ezd.a, this).a((float)this.p + $$1.gD()).a(ezc.f);
            ewm $$4 = this.dV().p().bc().b(ewd.am);
            List<cxk> $$5 = $$4.a($$3);
            ao.E.a((asi)$$1, $$0, this, $$5);

            for (cxk $$6 : $$5) {
               clw $$7 = new clw(this.dV(), this.dA(), this.dC(), this.dG(), $$6);
               double $$8 = $$1.dA() - this.dA();
               double $$9 = $$1.dC() - this.dC();
               double $$10 = $$1.dG() - this.dG();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dV().b($$7);
               $$1.dV().b(new bvr($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG() + 0.5, this.ae.a(6) + 1));
               if ($$6.a(ayd.aV)) {
                  $$1.a(axp.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aJ()) {
            $$2 = 2;
         }

         this.at();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dV().C && this.n instanceof cps && ((cps)this.n).c()) {
         this.d(this.n);
      }

      super.b($$0);
   }

   protected void d(bvf $$0) {
      bvf $$1 = this.p();
      if ($$1 != null) {
         fbs $$2 = new fbs($$1.dA() - this.dA(), $$1.dC() - this.dC(), $$1.dG() - this.dG()).c(0.1);
         $$0.h($$0.dy().e($$2));
      }
   }

   @Override
   protected bvf.b bg() {
      return bvf.b.a;
   }

   @Override
   public void a(bvf.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void av() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bvf $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cqh $$0) {
      cps $$1 = this.m();
      if ($$1 != null) {
         $$1.cv = $$0;
      }
   }

   @Nullable
   public cps m() {
      bvf $$0 = this.p();
      return $$0 instanceof cps ? (cps)$$0 : null;
   }

   @Nullable
   public bvf s() {
      return this.n;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public aac<acr> a(asf $$0) {
      bvf $$1 = this.p();
      return new acs(this, $$0, $$1 == null ? this.ar() : $$1.ar());
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      if (this.m() == null) {
         int $$1 = $$0.p();
         a.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dV().a($$1), $$1);
         this.at();
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
