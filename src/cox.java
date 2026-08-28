import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cox extends cpb {
   private static final Logger b = LogUtils.getLogger();
   private final azr c = azr.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final akk<Integer> g = ako.a(cox.class, akm.b);
   private static final akk<Boolean> h = ako.a(cox.class, akm.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private btz o;
   private cox.a p = cox.a.a;
   private final int q;
   private final int r;

   private cox(bug<? extends cox> $$0, dev $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cox(bug<? extends cox> $$0, dev $$1) {
      this($$0, $$1, 0, 0);
   }

   public cox(coh $$0, dev $$1, int $$2, int $$3, cvx $$4) {
      this(bug.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$5 = $$0.dP();
      float $$6 = $$0.dN();
      float $$7 = azj.b(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = azj.a(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$9 = -azj.b(-$$5 * (float) (Math.PI / 180.0));
      float $$10 = azj.a(-$$5 * (float) (Math.PI / 180.0));
      double $$11 = $$0.dC() - (double)$$8 * 0.3;
      double $$12 = $$0.dG();
      double $$13 = $$0.dI() - (double)$$7 * 0.3;
      this.b($$11, $$12, $$13, $$6, $$5);
      ezh $$14 = new ezh((double)(-$$8), (double)azj.a(-($$10 / $$9), -5.0F, 5.0F), (double)(-$$7));
      double $$15 = $$14.g();
      $$14 = $$14.d(0.6 / $$15 + this.af.a(0.5, 0.0103365), 0.6 / $$15 + this.af.a(0.5, 0.0103365), 0.6 / $$15 + this.af.a(0.5, 0.0103365));
      this.h($$14);
      this.v((float)(azj.d($$14.d, $$14.f) * 180.0F / (float)Math.PI));
      this.w((float)(azj.d($$14.e, $$14.i()) * 180.0F / (float)Math.PI));
      this.O = this.dN();
      this.P = this.dP();
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   protected boolean D() {
      return true;
   }

   @Override
   public void a(akk<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.av().a(g);
         this.o = $$1 > 0 ? this.dX().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.av().a(h);
         if (this.d) {
            this.n(this.dA().d, (double)(-0.4F * azj.a(this.c, 0.6F, 1.0F)), this.dA().f);
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
      coh $$0 = this.o();
      if ($$0 == null) {
         this.au();
      } else if (this.dX().C || !this.a($$0)) {
         if (this.aJ()) {
            this.i++;
            if (this.i >= 1200) {
               this.au();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         jg $$2 = this.dx();
         ere $$3 = this.dX().b_($$2);
         if ($$3.a(axf.a)) {
            $$1 = $$3.a(this.dX(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cox.a.a) {
            if (this.o != null) {
               this.h(ezh.c);
               this.p = cox.a.b;
               return;
            }

            if ($$4) {
               this.h(this.dA().d(0.3, 0.2, 0.3));
               this.p = cox.a.c;
               return;
            }

            this.t();
         } else {
            if (this.p == cox.a.b) {
               if (this.o != null) {
                  if (!this.o.dS() && this.o.dX().ag() == this.dX().ag()) {
                     this.a_(this.o.dC(), this.o.e(0.8), this.o.dI());
                  } else {
                     this.B(null);
                     this.p = cox.a.a;
                  }
               }

               return;
            }

            if (this.p == cox.a.c) {
               ezh $$5 = this.dA();
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

         if (!$$3.a(axf.a)) {
            this.h(this.dA().b(0.0, -0.03, 0.0));
         }

         this.a(buz.a, this.dA());
         this.aK();
         this.G();
         if (this.p == cox.a.a && (this.aJ() || this.Q)) {
            this.h(ezh.c);
         }

         double $$7 = 0.92;
         this.h(this.dA().c(0.92));
         this.az();
      }
   }

   private boolean a(coh $$0) {
      cvx $$1 = $$0.fb();
      cvx $$2 = $$0.fc();
      boolean $$3 = $$1.a(cwb.qW);
      boolean $$4 = $$2.a(cwb.qW);
      if (!$$0.dS() && $$0.bM() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.au();
         return true;
      }
   }

   private void t() {
      ezf $$0 = cpd.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(btz $$0) {
      return super.b($$0) || $$0.bM() && $$0 instanceof ckq;
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(ezd $$0) {
      super.a($$0);
      this.h(this.dA().d().c($$0.a(this)));
   }

   private void B(@Nullable btz $$0) {
      this.o = $$0;
      this.av().a(g, $$0 == null ? 0 : $$0.ar() + 1);
   }

   private void a(jg $$0) {
      arm $$1 = (arm)this.dX();
      int $$2 = 1;
      jg $$3 = $$0.d();
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
            this.av().a(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.af.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = azj.a($$4);
            float $$6 = azj.b($$4);
            double $$7 = this.dC() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)azj.a(this.dE()) + 1.0F);
            double $$9 = this.dI() + (double)($$6 * (float)this.l * 0.1F);
            dvd $$10 = $$1.a_(jg.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dia.G)) {
               if (this.af.i() < 0.15F) {
                  $$1.a(lq.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lq.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lq.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awk.iY, 0.25F, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
            double $$13 = this.dE() + 0.5;
            $$1.a(lq.d, this.dC(), $$13, this.dI(), (int)(1.0F + this.ds() * 20.0F), (double)this.ds(), 0.0, (double)this.ds(), 0.2F);
            $$1.a(lq.E, this.dC(), $$13, this.dI(), (int)(1.0F + this.ds() * 20.0F), (double)this.ds(), 0.0, (double)this.ds(), 0.2F);
            this.j = azj.a(this.af, 20, 40);
            this.av().a(h, true);
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
            float $$15 = azj.a(this.af, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = azj.a(this.af, 25.0F, 60.0F);
            double $$17 = this.dC() + (double)(azj.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)azj.a(this.dE()) + 1.0F);
            double $$19 = this.dI() + (double)(azj.b($$15) * $$16) * 0.1;
            dvd $$20 = $$1.a_(jg.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dia.G)) {
               $$1.a(lq.am, $$17, $$18, $$19, 2 + this.af.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = azj.a(this.af, 0.0F, 360.0F);
            this.l = azj.a(this.af, 20, 80);
         }
      } else {
         this.k = azj.a(this.af, 100, 600);
         this.k = this.k - this.r;
      }
   }

   private boolean b(jg $$0) {
      cox.b $$1 = cox.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cox.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cox.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cox.b.a) {
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

   private cox.b a(jg $$0, jg $$1) {
      return jg.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cox.b.c).orElse(cox.b.c);
   }

   private cox.b c(jg $$0) {
      dvd $$1 = this.dX().a_($$0);
      if (!$$1.l() && !$$1.a(dia.fm)) {
         ere $$2 = $$1.y();
         return $$2.a(axf.a) && $$2.b() && $$1.g(this.dX(), $$0).c() ? cox.b.b : cox.b.c;
      } else {
         return cox.b.a;
      }
   }

   public boolean m() {
      return this.n;
   }

   @Override
   public void b(uj $$0) {
   }

   @Override
   public void a(uj $$0) {
   }

   public int a(cvx $$0) {
      coh $$1 = this.o();
      if (!this.dX().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.d(this.o);
            an.E.a((arn)$$1, $$0, this, Collections.emptyList());
            this.dX().a(this, (byte)31);
            $$2 = this.o instanceof ckq ? 3 : 5;
         } else if (this.j > 0) {
            etz $$3 = new etz.a((arm)this.dX()).a(ews.f, this.dv()).a(ews.i, $$0).a(ews.a, this).a((float)this.q + $$1.gG()).a(ewr.f);
            eub $$4 = this.dX().o().bd().b(ets.am);
            List<cvx> $$5 = $$4.a($$3);
            an.E.a((arn)$$1, $$0, this, $$5);

            for (cvx $$6 : $$5) {
               ckq $$7 = new ckq(this.dX(), this.dC(), this.dE(), this.dI(), $$6);
               double $$8 = $$1.dC() - this.dC();
               double $$9 = $$1.dE() - this.dE();
               double $$10 = $$1.dI() - this.dI();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dX().b($$7);
               $$1.dX().b(new bul($$1.dX(), $$1.dC(), $$1.dE() + 0.5, $$1.dI() + 0.5, this.af.a(6) + 1));
               if ($$6.a(axi.aQ)) {
                  $$1.a(awu.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aJ()) {
            $$2 = 2;
         }

         this.au();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dX().C && this.o instanceof coh && ((coh)this.o).g()) {
         this.d(this.o);
      }

      super.b($$0);
   }

   protected void d(btz $$0) {
      btz $$1 = this.s();
      if ($$1 != null) {
         ezh $$2 = new ezh($$1.dC() - this.dC(), $$1.dE() - this.dE(), $$1.dI() - this.dI()).c(0.1);
         $$0.h($$0.dA().e($$2));
      }
   }

   @Override
   protected btz.b bh() {
      return btz.b.a;
   }

   @Override
   public void a(btz.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void aw() {
      this.a(null);
   }

   @Override
   public void c(@Nullable btz $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cox $$0) {
      coh $$1 = this.o();
      if ($$1 != null) {
         $$1.cs = $$0;
      }
   }

   @Nullable
   public coh o() {
      btz $$0 = this.s();
      return $$0 instanceof coh ? (coh)$$0 : null;
   }

   @Nullable
   public btz q() {
      return this.o;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public zo<acd> a(arl $$0) {
      btz $$1 = this.s();
      return new ace(this, $$0, $$1 == null ? this.ar() : $$1.ar());
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      if (this.o() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dX().a($$1), $$1);
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
