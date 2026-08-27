import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfv extends cfz {
   private static final Logger b = LogUtils.getLogger();
   private final auu c = auu.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final agm<Integer> g = agp.a(cfv.class, ago.b);
   private static final agm<Boolean> h = agp.a(cfv.class, ago.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private blu o;
   private cfv.a p = cfv.a.a;
   private final int q;
   private final int r;

   private cfv(bly<? extends cfv> $$0, cto $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cfv(bly<? extends cfv> $$0, cto $$1) {
      this($$0, $$1, 0, 0);
   }

   public cfv(cfh $$0, cto $$1, int $$2, int $$3) {
      this(bly.bw, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = aun.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aun.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aun.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = aun.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      els $$13 = new els((double)(-$$7), (double)aun.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(aun.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(aun.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   @Override
   protected void c_() {
      this.an().a(g, 0);
      this.an().a(h, false);
   }

   @Override
   public void a(agm<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.an().b(g);
         this.o = $$1 > 0 ? this.dM().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.an().b(h);
         if (this.d) {
            this.o(this.dp().c, (double)(-0.4F * aun.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      this.c.b(this.cw().getLeastSignificantBits() ^ this.dM().X());
      super.l();
      cfh $$0 = this.s();
      if ($$0 == null) {
         this.am();
      } else if (this.dM().B || !this.a($$0)) {
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
         hx $$2 = this.dm();
         eeq $$3 = this.dM().b_($$2);
         if ($$3.a(asl.a)) {
            $$1 = $$3.a((csu)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cfv.a.a) {
            if (this.o != null) {
               this.g(els.b);
               this.p = cfv.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.p = cfv.a.c;
               return;
            }

            this.x();
         } else {
            if (this.p == cfv.a.b) {
               if (this.o != null) {
                  if (!this.o.dH() && this.o.dM().ae() == this.dM().ae()) {
                     this.a_(this.o.dr(), this.o.e(0.8), this.o.dx());
                  } else {
                     this.A(null);
                     this.p = cfv.a.a;
                  }
               }

               return;
            }

            if (this.p == cfv.a.c) {
               els $$5 = this.dp();
               double $$6 = this.dt() + $$5.d - (double)$$2.v() - (double)$$1;
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
                     this.g(this.dp().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dM().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(asl.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bmq.a, this.dp());
         this.K();
         if (this.p == cfv.a.a && (this.aC() || this.P)) {
            this.g(els.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(cfh $$0) {
      cmx $$1 = $$0.eT();
      cmx $$2 = $$0.eU();
      boolean $$3 = $$1.a(cna.qS);
      boolean $$4 = $$2.a(cna.qS);
      if (!$$0.dH() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      elq $$0 = cga.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(blu $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof cbt;
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(elo $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void A(@Nullable blu $$0) {
      this.o = $$0;
      this.an().b(g, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(hx $$0) {
      and $$1 = (and)this.dM();
      int $$2 = 1;
      hx $$3 = $$0.c();
      if (this.ag.i() < 0.25F && this.dM().r($$3)) {
         $$2++;
      }

      if (this.ag.i() < 0.5F && !this.dM().h($$3)) {
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
            float $$5 = aun.a($$4);
            float $$6 = aun.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)aun.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.l * 0.1F);
            djg $$10 = $$1.a_(hx.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cwr.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(jx.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(jx.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(jx.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(arr.it, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(jx.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(jx.D, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.j = aun.a(this.ag, 20, 40);
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
            float $$15 = aun.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = aun.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(aun.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)aun.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(aun.b($$15) * $$16) * 0.1;
            djg $$20 = $$1.a_(hx.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cwr.G)) {
               $$1.a(jx.aj, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = aun.a(this.ag, 0.0F, 360.0F);
            this.l = aun.a(this.ag, 20, 80);
         }
      } else {
         this.k = aun.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(hx $$0) {
      cfv.b $$1 = cfv.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cfv.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cfv.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cfv.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cfv.b a(hx $$0, hx $$1) {
      return hx.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cfv.b.c).orElse(cfv.b.c);
   }

   private cfv.b c(hx $$0) {
      djg $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(cwr.fm)) {
         eeq $$2 = $$1.u();
         return $$2.a(asl.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? cfv.b.b : cfv.b.c;
      } else {
         return cfv.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(sn $$0) {
   }

   @Override
   public void a(sn $$0) {
   }

   public int a(cmx $$0) {
      cfh $$1 = this.s();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            am.E.a((ane)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.o instanceof cbt ? 3 : 5;
         } else if (this.j > 0) {
            ehb $$3 = new ehb.a((and)this.dM()).a(ejg.f, this.dk()).a(ejg.i, $$0).a(ejg.a, this).a((float)this.q + $$1.go()).a(ejf.f);
            ehd $$4 = this.dM().o().aJ().getLootTable(egt.as);
            List<cmx> $$5 = $$4.a($$3);
            am.E.a((ane)$$1, $$0, this, $$5);

            for (cmx $$6 : $$5) {
               cbt $$7 = new cbt(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new bma($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(aso.ao)) {
                  $$1.a(asb.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.o instanceof cfh && ((cfh)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(blu $$0) {
      blu $$1 = this.w();
      if ($$1 != null) {
         els $$2 = new els($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected blu.b aW() {
      return blu.b.a;
   }

   @Override
   public void a(blu.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable blu $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cfv $$0) {
      cfh $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cfh s() {
      blu $$0 = this.w();
      return $$0 instanceof cfh ? (cfh)$$0 : null;
   }

   @Nullable
   public blu u() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public xf<za> dj() {
      blu $$0 = this.w();
      return new zb(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      if (this.s() == null) {
         int $$1 = $$0.o();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dM().a($$1), $$1);
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
