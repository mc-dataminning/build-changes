import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cff extends cfj {
   private static final Logger b = LogUtils.getLogger();
   private final auf c = auf.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final afz<Integer> g = agc.a(cff.class, agb.b);
   private static final afz<Boolean> h = agc.a(cff.class, agb.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private blf o;
   private cff.a p = cff.a.a;
   private final int q;
   private final int r;

   private cff(blj<? extends cff> $$0, csy $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cff(blj<? extends cff> $$0, csy $$1) {
      this($$0, $$1, 0, 0);
   }

   public cff(cer $$0, csy $$1, int $$2, int $$3) {
      this(blj.bw, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = aty.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aty.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aty.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = aty.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      elb $$13 = new elb((double)(-$$7), (double)aty.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(aty.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(aty.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   @Override
   protected void c_() {
      this.an().a(g, 0);
      this.an().a(h, false);
   }

   @Override
   public void a(afz<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.an().b(g);
         this.o = $$1 > 0 ? this.dM().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.an().b(h);
         if (this.d) {
            this.o(this.dp().c, (double)(-0.4F * aty.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      this.c.b(this.cw().getLeastSignificantBits() ^ this.dM().W());
      super.l();
      cer $$0 = this.s();
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
         hv $$2 = this.dm();
         edz $$3 = this.dM().b_($$2);
         if ($$3.a(arw.a)) {
            $$1 = $$3.a((cse)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cff.a.a) {
            if (this.o != null) {
               this.g(elb.b);
               this.p = cff.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.p = cff.a.c;
               return;
            }

            this.x();
         } else {
            if (this.p == cff.a.b) {
               if (this.o != null) {
                  if (!this.o.dH() && this.o.dM().ad() == this.dM().ad()) {
                     this.a_(this.o.dr(), this.o.e(0.8), this.o.dx());
                  } else {
                     this.A(null);
                     this.p = cff.a.a;
                  }
               }

               return;
            }

            if (this.p == cff.a.c) {
               elb $$5 = this.dp();
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

         if (!$$3.a(arw.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bmb.a, this.dp());
         this.K();
         if (this.p == cff.a.a && (this.aC() || this.P)) {
            this.g(elb.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(cer $$0) {
      cmh $$1 = $$0.eT();
      cmh $$2 = $$0.eU();
      boolean $$3 = $$1.a(cmk.qS);
      boolean $$4 = $$2.a(cmk.qS);
      if (!$$0.dH() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      ekz $$0 = cfk.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(blf $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof cbe;
   }

   @Override
   protected void a(eky $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ekx $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void A(@Nullable blf $$0) {
      this.o = $$0;
      this.an().b(g, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(hv $$0) {
      amp $$1 = (amp)this.dM();
      int $$2 = 1;
      hv $$3 = $$0.c();
      if (this.ag.i() < 0.25F && this.dM().q($$3)) {
         $$2++;
      }

      if (this.ag.i() < 0.5F && !this.dM().g($$3)) {
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
            float $$5 = aty.a($$4);
            float $$6 = aty.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)aty.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.l * 0.1F);
            dip $$10 = $$1.a_(hv.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cwb.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(jv.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(jv.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(jv.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(arc.it, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(jv.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(jv.D, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.j = aty.a(this.ag, 20, 40);
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
            float $$15 = aty.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = aty.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(aty.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)aty.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(aty.b($$15) * $$16) * 0.1;
            dip $$20 = $$1.a_(hv.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cwb.G)) {
               $$1.a(jv.aj, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = aty.a(this.ag, 0.0F, 360.0F);
            this.l = aty.a(this.ag, 20, 80);
         }
      } else {
         this.k = aty.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(hv $$0) {
      cff.b $$1 = cff.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cff.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cff.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cff.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cff.b a(hv $$0, hv $$1) {
      return hv.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cff.b.c).orElse(cff.b.c);
   }

   private cff.b c(hv $$0) {
      dip $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(cwb.fm)) {
         edz $$2 = $$1.u();
         return $$2.a(arw.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? cff.b.b : cff.b.c;
      } else {
         return cff.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(sj $$0) {
   }

   @Override
   public void a(sj $$0) {
   }

   public int a(cmh $$0) {
      cer $$1 = this.s();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            am.E.a((amq)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.o instanceof cbe ? 3 : 5;
         } else if (this.j > 0) {
            egk $$3 = new egk.a((amp)this.dM()).a(eip.f, this.dk()).a(eip.i, $$0).a(eip.a, this).a((float)this.q + $$1.go()).a(eio.f);
            egm $$4 = this.dM().n().aJ().getLootTable(egc.as);
            List<cmh> $$5 = $$4.a($$3);
            am.E.a((amq)$$1, $$0, this, $$5);

            for (cmh $$6 : $$5) {
               cbe $$7 = new cbe(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new bll($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(arz.ao)) {
                  $$1.a(arm.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.o instanceof cer && ((cer)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(blf $$0) {
      blf $$1 = this.w();
      if ($$1 != null) {
         elb $$2 = new elb($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected blf.b aW() {
      return blf.b.a;
   }

   @Override
   public void a(blf.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable blf $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cff $$0) {
      cer $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cer s() {
      blf $$0 = this.w();
      return $$0 instanceof cer ? (cer)$$0 : null;
   }

   @Nullable
   public blf u() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public wu<yo> dj() {
      blf $$0 = this.w();
      return new yp(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(yp $$0) {
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
