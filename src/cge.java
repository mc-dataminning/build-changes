import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cge extends cgi {
   private static final Logger b = LogUtils.getLogger();
   private final auw c = auw.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final agn<Integer> g = agq.a(cge.class, agp.b);
   private static final agn<Boolean> h = agq.a(cge.class, agp.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private blw o;
   private cge.a p = cge.a.a;
   private final int q;
   private final int r;

   private cge(bmc<? extends cge> $$0, ctx $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cge(bmc<? extends cge> $$0, ctx $$1) {
      this($$0, $$1, 0, 0);
   }

   public cge(cfq $$0, ctx $$1, int $$2, int $$3) {
      this(bmc.bx, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dD();
      float $$5 = $$0.dB();
      float $$6 = aup.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aup.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aup.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = aup.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dq() - (double)$$7 * 0.3;
      double $$11 = $$0.du();
      double $$12 = $$0.dw() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      emc $$13 = new emc((double)(-$$7), (double)aup.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(aup.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(aup.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dB();
      this.O = this.dD();
   }

   @Override
   protected void c_() {
      this.an().a(g, 0);
      this.an().a(h, false);
   }

   @Override
   public void a(agn<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.an().b(g);
         this.o = $$1 > 0 ? this.dL().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.an().b(h);
         if (this.d) {
            this.o(this.do().c, (double)(-0.4F * aup.a(this.c, 0.6F, 1.0F)), this.do().e);
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
      this.c.b(this.cw().getLeastSignificantBits() ^ this.dL().X());
      super.l();
      cfq $$0 = this.s();
      if ($$0 == null) {
         this.am();
      } else if (this.dL().B || !this.a($$0)) {
         if (this.aC()) {
            this.i++;
            if (this.i >= 1200) {
               this.am();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         hx $$2 = this.dl();
         eez $$3 = this.dL().b_($$2);
         if ($$3.a(asn.a)) {
            $$1 = $$3.a((ctd)this.dL(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cge.a.a) {
            if (this.o != null) {
               this.g(emc.b);
               this.p = cge.a.b;
               return;
            }

            if ($$4) {
               this.g(this.do().d(0.3, 0.2, 0.3));
               this.p = cge.a.c;
               return;
            }

            this.x();
         } else {
            if (this.p == cge.a.b) {
               if (this.o != null) {
                  if (!this.o.dG() && this.o.dL().ae() == this.dL().ae()) {
                     this.a_(this.o.dq(), this.o.e(0.8), this.o.dw());
                  } else {
                     this.z(null);
                     this.p = cge.a.a;
                  }
               }

               return;
            }

            if (this.p == cge.a.c) {
               emc $$5 = this.do();
               double $$6 = this.ds() + $$5.d - (double)$$2.v() - (double)$$1;
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
                     this.g(this.do().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dL().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(asn.a)) {
            this.g(this.do().b(0.0, -0.03, 0.0));
         }

         this.a(bmu.a, this.do());
         this.J();
         if (this.p == cge.a.a && (this.aC() || this.P)) {
            this.g(emc.b);
         }

         double $$7 = 0.92;
         this.g(this.do().a(0.92));
         this.ar();
      }
   }

   private boolean a(cfq $$0) {
      cng $$1 = $$0.eT();
      cng $$2 = $$0.eU();
      boolean $$3 = $$1.a(cnj.qU);
      boolean $$4 = $$2.a(cnj.qU);
      if (!$$0.dG() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      ema $$0 = cgj.a(this, this::b);
      this.a($$0);
   }

   @Override
   protected boolean b(blw $$0) {
      return super.b($$0) || $$0.bx() && $$0 instanceof ccb;
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.z($$0.a());
      }
   }

   @Override
   protected void a(ely $$0) {
      super.a($$0);
      this.g(this.do().d().a($$0.a(this)));
   }

   private void z(@Nullable blw $$0) {
      this.o = $$0;
      this.an().b(g, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(hx $$0) {
      ane $$1 = (ane)this.dL();
      int $$2 = 1;
      hx $$3 = $$0.c();
      if (this.ag.i() < 0.25F && this.dL().r($$3)) {
         $$2++;
      }

      if (this.ag.i() < 0.5F && !this.dL().h($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.an().b(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ag.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = aup.a($$4);
            float $$6 = aup.b($$4);
            double $$7 = this.dq() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)aup.a(this.ds()) + 1.0F);
            double $$9 = this.dw() + (double)($$6 * (float)this.l * 0.1F);
            djp $$10 = $$1.a_(hx.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cxa.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(jx.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(jx.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(jx.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(art.iI, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.ds() + 0.5;
            $$1.a(jx.e, this.dq(), $$13, this.dw(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(jx.D, this.dq(), $$13, this.dw(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.j = aup.a(this.ag, 20, 40);
            this.an().b(h, true);
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
            float $$15 = aup.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = aup.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dq() + (double)(aup.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)aup.a(this.ds()) + 1.0F);
            double $$19 = this.dw() + (double)(aup.b($$15) * $$16) * 0.1;
            djp $$20 = $$1.a_(hx.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cxa.G)) {
               $$1.a(jx.aj, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = aup.a(this.ag, 0.0F, 360.0F);
            this.l = aup.a(this.ag, 20, 80);
         }
      } else {
         this.k = aup.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(hx $$0) {
      cge.b $$1 = cge.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cge.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cge.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cge.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cge.b a(hx $$0, hx $$1) {
      return hx.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cge.b.c).orElse(cge.b.c);
   }

   private cge.b c(hx $$0) {
      djp $$1 = this.dL().a_($$0);
      if (!$$1.i() && !$$1.a(cxa.fm)) {
         eez $$2 = $$1.u();
         return $$2.a(asn.a) && $$2.b() && $$1.k(this.dL(), $$0).c() ? cge.b.b : cge.b.c;
      } else {
         return cge.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(so $$0) {
   }

   @Override
   public void a(so $$0) {
   }

   public int a(cng $$0) {
      cfq $$1 = this.s();
      if (!this.dL().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.a(this.o);
            am.E.a((anf)$$1, $$0, this, Collections.emptyList());
            this.dL().a(this, (byte)31);
            $$2 = this.o instanceof ccb ? 3 : 5;
         } else if (this.j > 0) {
            ehl $$3 = new ehl.a((ane)this.dL()).a(ejq.f, this.dj()).a(ejq.i, $$0).a(ejq.a, this).a((float)this.q + $$1.go()).a(ejp.f);
            ehn $$4 = this.dL().o().aJ().getLootTable(ehd.as);
            List<cng> $$5 = $$4.a($$3);
            am.E.a((anf)$$1, $$0, this, $$5);

            for (cng $$6 : $$5) {
               ccb $$7 = new ccb(this.dL(), this.dq(), this.ds(), this.dw(), $$6);
               double $$8 = $$1.dq() - this.dq();
               double $$9 = $$1.ds() - this.ds();
               double $$10 = $$1.dw() - this.dw();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dL().b($$7);
               $$1.dL().b(new bme($$1.dL(), $$1.dq(), $$1.ds() + 0.5, $$1.dw() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(asq.ao)) {
                  $$1.a(asd.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aC()) {
            $$2 = 2;
         }

         this.am();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dL().B && this.o instanceof cfq && ((cfq)this.o).g()) {
         this.a(this.o);
      }

      super.b($$0);
   }

   protected void a(blw $$0) {
      blw $$1 = this.w();
      if ($$1 != null) {
         emc $$2 = new emc($$1.dq() - this.dq(), $$1.ds() - this.ds(), $$1.dw() - this.dw()).a(0.1);
         $$0.g($$0.do().e($$2));
      }
   }

   @Override
   protected blw.b aW() {
      return blw.b.a;
   }

   @Override
   public void a(blw.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void c(@Nullable blw $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cge $$0) {
      cfq $$1 = this.s();
      if ($$1 != null) {
         $$1.co = $$0;
      }
   }

   @Nullable
   public cfq s() {
      blw $$0 = this.w();
      return $$0 instanceof cfq ? (cfq)$$0 : null;
   }

   @Nullable
   public blw u() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public xg<zb> di() {
      blw $$0 = this.w();
      return new zc(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      if (this.s() == null) {
         int $$1 = $$0.o();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dL().a($$1), $$1);
         this.al();
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
