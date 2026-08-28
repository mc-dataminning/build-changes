import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cri extends crm {
   private static final Logger a = LogUtils.getLogger();
   private final azt b = azt.a();
   private boolean c;
   private int d;
   private static final int e = 10;
   private static final akh<Integer> f = akl.a(cri.class, akj.b);
   private static final akh<Boolean> g = akl.a(cri.class, akj.k);
   private int h;
   private int i;
   private int j;
   private int k;
   private float l;
   private boolean m = true;
   @Nullable
   private bwa n;
   private cri.a o = cri.a.a;
   private final int p;
   private final int q;

   private cri(bwj<? extends cri> $$0, dip $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.p = Math.max(0, $$2);
      this.q = Math.max(0, $$3);
   }

   public cri(bwj<? extends cri> $$0, dip $$1) {
      this($$0, $$1, 0, 0);
   }

   public cri(cqs $$0, dip $$1, int $$2, int $$3) {
      this(bwj.bT, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dN();
      float $$5 = $$0.dL();
      float $$6 = azk.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = azk.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -azk.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = azk.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dA() - (double)$$7 * 0.3;
      double $$11 = $$0.dE();
      double $$12 = $$0.dG() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      fdw $$13 = new fdw((double)(-$$7), (double)azk.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.g();
      $$13 = $$13.d(0.6 / $$14 + this.ae.a(0.5, 0.0103365), 0.6 / $$14 + this.ae.a(0.5, 0.0103365), 0.6 / $$14 + this.ae.a(0.5, 0.0103365));
      this.i($$13);
      this.w((float)(azk.d($$13.d, $$13.f) * 180.0F / (float)Math.PI));
      this.x((float)(azk.d($$13.e, $$13.i()) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, false);
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   public void a(akh<?> $$0) {
      if (f.equals($$0)) {
         int $$1 = this.au().a(f);
         this.n = $$1 > 0 ? this.dV().a($$1 - 1) : null;
      }

      if (g.equals($$0)) {
         this.c = this.au().a(g);
         if (this.c) {
            this.n(this.dy().d, (double)(-0.4F * azk.a(this.b, 0.6F, 1.0F)), this.dy().f);
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
   public void h() {
      this.b.b(this.cG().getLeastSignificantBits() ^ this.dV().ae());
      super.h();
      cqs $$0 = this.g();
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
         iu $$2 = this.dv();
         evv $$3 = this.dV().b_($$2);
         if ($$3.a(axf.a)) {
            $$1 = $$3.a(this.dV(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.o == cri.a.a) {
            if (this.n != null) {
               this.i(fdw.c);
               this.o = cri.a.b;
               return;
            }

            if ($$4) {
               this.i(this.dy().d(0.3, 0.2, 0.3));
               this.o = cri.a.c;
               return;
            }

            this.m();
         } else {
            if (this.o == cri.a.b) {
               if (this.n != null) {
                  if (!this.n.dQ() && this.n.dV().aj() == this.dV().aj()) {
                     this.a_(this.n.dA(), this.n.e(0.8), this.n.dG());
                  } else {
                     this.B(null);
                     this.o = cri.a.a;
                  }
               }

               return;
            }

            if (this.o == cri.a.c) {
               fdw $$5 = this.dy();
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
                     this.i(this.dy().b(0.0, -0.1 * (double)this.b.i() * (double)this.b.i(), 0.0));
                  }

                  if (!this.dV().C) {
                     this.a($$2);
                  }
               } else {
                  this.d = Math.min(10, this.d + 1);
               }
            }
         }

         if (!$$3.a(axf.a)) {
            this.i(this.dy().b(0.0, -0.03, 0.0));
         }

         this.a(bxd.a, this.dy());
         this.aK();
         this.A();
         if (this.o == cri.a.a && (this.aJ() || this.P)) {
            this.i(fdw.c);
         }

         double $$7 = 0.92;
         this.i(this.dy().c(0.92));
         this.ay();
      }
   }

   private boolean a(cqs $$0) {
      cys $$1 = $$0.fa();
      cys $$2 = $$0.fb();
      boolean $$3 = $$1.a(cyw.rW);
      boolean $$4 = $$2.a(cyw.rW);
      if (!$$0.dQ() && $$0.bK() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.at();
         return true;
      }
   }

   private void m() {
      fdu $$0 = cro.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bwa $$0) {
      return super.b($$0) || $$0.bK() && $$0 instanceof cmx;
   }

   @Override
   protected void a(fdt $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(fds $$0) {
      super.a($$0);
      this.i(this.dy().d().c($$0.a(this)));
   }

   private void B(@Nullable bwa $$0) {
      this.n = $$0;
      this.au().a(f, $$0 == null ? 0 : $$0.ar() + 1);
   }

   private void a(iu $$0) {
      aro $$1 = (aro)this.dV();
      int $$2 = 1;
      iu $$3 = $$0.d();
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
            float $$5 = azk.a($$4);
            float $$6 = azk.b($$4);
            double $$7 = this.dA() + (double)($$5 * (float)this.k * 0.1F);
            double $$8 = (double)((float)azk.a(this.dC()) + 1.0F);
            double $$9 = this.dG() + (double)($$6 * (float)this.k * 0.1F);
            dzo $$10 = $$1.a_(iu.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dlw.J)) {
               if (this.ae.i() < 0.15F) {
                  $$1.a(lx.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lx.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lx.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awl.jx, 0.25F, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
            double $$13 = this.dC() + 0.5;
            $$1.a(lx.d, this.dA(), $$13, this.dG(), (int)(1.0F + this.dq() * 20.0F), (double)this.dq(), 0.0, (double)this.dq(), 0.2F);
            $$1.a(lx.E, this.dA(), $$13, this.dG(), (int)(1.0F + this.dq() * 20.0F), (double)this.dq(), 0.0, (double)this.dq(), 0.2F);
            this.i = azk.a(this.ae, 20, 40);
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
            float $$15 = azk.a(this.ae, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = azk.a(this.ae, 25.0F, 60.0F);
            double $$17 = this.dA() + (double)(azk.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)azk.a(this.dC()) + 1.0F);
            double $$19 = this.dG() + (double)(azk.b($$15) * $$16) * 0.1;
            dzo $$20 = $$1.a_(iu.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dlw.J)) {
               $$1.a(lx.ap, $$17, $$18, $$19, 2 + this.ae.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.j <= 0) {
            this.l = azk.a(this.ae, 0.0F, 360.0F);
            this.k = azk.a(this.ae, 20, 80);
         }
      } else {
         this.j = azk.a(this.ae, 100, 600);
         this.j = this.j - this.q;
      }
   }

   private boolean b(iu $$0) {
      cri.b $$1 = cri.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cri.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cri.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cri.b.a) {
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

   private cri.b a(iu $$0, iu $$1) {
      return iu.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cri.b.c).orElse(cri.b.c);
   }

   private cri.b c(iu $$0) {
      dzo $$1 = this.dV().a_($$0);
      if (!$$1.l() && !$$1.a(dlw.fB)) {
         evv $$2 = $$1.y();
         return $$2.a(axf.a) && $$2.b() && $$1.g(this.dV(), $$0).c() ? cri.b.b : cri.b.c;
      } else {
         return cri.b.a;
      }
   }

   public boolean f() {
      return this.m;
   }

   @Override
   public void b(tx $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   public int a(cys $$0) {
      cqs $$1 = this.g();
      if (!this.dV().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.n != null) {
            this.d(this.n);
            ap.E.a((arp)$$1, $$0, this, Collections.emptyList());
            this.dV().a(this, (byte)31);
            $$2 = this.n instanceof cmx ? 3 : 5;
         } else if (this.i > 0) {
            eyq $$3 = new eyq.a((aro)this.dV()).a(fbh.f, this.dt()).a(fbh.i, $$0).a(fbh.a, this).a((float)this.p + $$1.eg()).a(fbg.f);
            eys $$4 = this.dV().p().bc().b(eyj.am);
            List<cys> $$5 = $$4.a($$3);
            ap.E.a((arp)$$1, $$0, this, $$5);

            for (cys $$6 : $$5) {
               cmx $$7 = new cmx(this.dV(), this.dA(), this.dC(), this.dG(), $$6);
               double $$8 = $$1.dA() - this.dA();
               double $$9 = $$1.dC() - this.dC();
               double $$10 = $$1.dG() - this.dG();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dV().b($$7);
               $$1.dV().b(new bwo($$1.dV(), $$1.dA(), $$1.dC() + 0.5, $$1.dG() + 0.5, this.ae.a(6) + 1));
               if ($$6.a(axi.aT)) {
                  $$1.a(awv.R, 1);
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
      if ($$0 == 31 && this.dV().C && this.n instanceof cqs $$1 && $$1.gg()) {
         this.d(this.n);
      }

      super.b($$0);
   }

   protected void d(bwa $$0) {
      bwa $$1 = this.q();
      if ($$1 != null) {
         fdw $$2 = new fdw($$1.dA() - this.dA(), $$1.dC() - this.dC(), $$1.dG() - this.dG()).c(0.1);
         $$0.i($$0.dy().e($$2));
      }
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.a;
   }

   @Override
   public void a(bwa.e $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void av() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bwa $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cri $$0) {
      cqs $$1 = this.g();
      if ($$1 != null) {
         $$1.cj = $$0;
      }
   }

   @Nullable
   public cqs g() {
      return this.q() instanceof cqs $$1 ? $$1 : null;
   }

   @Nullable
   public bwa j() {
      return this.n;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public zd<abs> a(arm $$0) {
      bwa $$1 = this.q();
      return new abt(this, $$0, $$1 == null ? this.ar() : $$1.ar());
   }

   @Override
   public void a(abt $$0) {
      super.a($$0);
      if (this.g() == null) {
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
