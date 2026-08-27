import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjg extends cjk {
   private static final Logger b = LogUtils.getLogger();
   private final axd c = axd.a();
   private boolean d;
   private int e;
   private static final int g = 10;
   private static final aim<Integer> h = aiq.a(cjg.class, aio.b);
   private static final aim<Boolean> i = aiq.a(cjg.class, aio.k);
   private int j;
   private int k;
   private int l;
   private int m;
   private float n;
   private boolean o = true;
   @Nullable
   private bow p;
   private cjg.a q = cjg.a.a;
   private final int r;
   private final int s;

   private cjg(bpc<? extends cjg> $$0, cwz $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.r = Math.max(0, $$2);
      this.s = Math.max(0, $$3);
   }

   public cjg(bpc<? extends cjg> $$0, cwz $$1) {
      this($$0, $$1, 0, 0);
   }

   public cjg(cis $$0, cwz $$1, int $$2, int $$3) {
      this(bpc.by, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = aww.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aww.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aww.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = aww.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      epr $$13 = new epr((double)(-$$7), (double)aww.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(aww.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(aww.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(h, 0);
      $$0.a(i, false);
   }

   @Override
   public void a(aim<?> $$0) {
      if (h.equals($$0)) {
         int $$1 = this.an().a(h);
         this.p = $$1 > 0 ? this.dM().a($$1 - 1) : null;
      }

      if (i.equals($$0)) {
         this.d = this.an().a(i);
         if (this.d) {
            this.o(this.dp().c, (double)(-0.4F * aww.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      cis $$0 = this.r();
      if ($$0 == null) {
         this.am();
      } else if (this.dM().B || !this.a($$0)) {
         if (this.aC()) {
            this.j++;
            if (this.j >= 1200) {
               this.am();
               return;
            }
         } else {
            this.j = 0;
         }

         float $$1 = 0.0F;
         ib $$2 = this.dm();
         ein $$3 = this.dM().b_($$2);
         if ($$3.a(aus.a)) {
            $$1 = $$3.a((cwf)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.q == cjg.a.a) {
            if (this.p != null) {
               this.g(epr.b);
               this.q = cjg.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.q = cjg.a.c;
               return;
            }

            this.w();
         } else {
            if (this.q == cjg.a.b) {
               if (this.p != null) {
                  if (!this.p.dH() && this.p.dM().ad() == this.dM().ad()) {
                     this.a_(this.p.dr(), this.p.e(0.8), this.p.dx());
                  } else {
                     this.A(null);
                     this.q = cjg.a.a;
                  }
               }

               return;
            }

            if (this.q == cjg.a.c) {
               epr $$5 = this.dp();
               double $$6 = this.dt() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.ag.i() * 0.2, $$5.e * 0.9);
               if (this.k <= 0 && this.m <= 0) {
                  this.o = true;
               } else {
                  this.o = this.o && this.e < 10 && this.b($$2);
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

         if (!$$3.a(aus.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bpt.a, this.dp());
         this.I();
         if (this.q == cjg.a.a && (this.aC() || this.P)) {
            this.g(epr.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(cis $$0) {
      cqk $$1 = $$0.eU();
      cqk $$2 = $$0.eV();
      boolean $$3 = $$1.a(cqn.qU);
      boolean $$4 = $$2.a(cqn.qU);
      if (!$$0.dH() && $$0.bA() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void w() {
      epp $$0 = cjm.a(this, this::b);
      this.a($$0);
   }

   @Override
   protected boolean b(bow $$0) {
      return super.b($$0) || $$0.bA() && $$0 instanceof cfd;
   }

   @Override
   protected void a(epo $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(epn $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void A(@Nullable bow $$0) {
      this.p = $$0;
      this.an().a(h, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(ib $$0) {
      apf $$1 = (apf)this.dM();
      int $$2 = 1;
      ib $$3 = $$0.c();
      if (this.ag.i() < 0.25F && this.dM().r($$3)) {
         $$2++;
      }

      if (this.ag.i() < 0.5F && !this.dM().h($$3)) {
         $$2--;
      }

      if (this.k > 0) {
         this.k--;
         if (this.k <= 0) {
            this.l = 0;
            this.m = 0;
            this.an().a(i, false);
         }
      } else if (this.m > 0) {
         this.m -= $$2;
         if (this.m > 0) {
            this.n = this.n + (float)this.ag.a(0.0, 9.188);
            float $$4 = this.n * (float) (Math.PI / 180.0);
            float $$5 = aww.a($$4);
            float $$6 = aww.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.m * 0.1F);
            double $$8 = (double)((float)aww.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.m * 0.1F);
            dmz $$10 = $$1.a_(ib.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dac.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(kc.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(kc.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(kc.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(aty.iM, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(kc.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(kc.E, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.k = aww.a(this.ag, 20, 40);
            this.an().a(i, true);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         float $$14 = 0.15F;
         if (this.l < 20) {
            $$14 += (float)(20 - this.l) * 0.05F;
         } else if (this.l < 40) {
            $$14 += (float)(40 - this.l) * 0.02F;
         } else if (this.l < 60) {
            $$14 += (float)(60 - this.l) * 0.01F;
         }

         if (this.ag.i() < $$14) {
            float $$15 = aww.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = aww.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(aww.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)aww.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(aww.b($$15) * $$16) * 0.1;
            dmz $$20 = $$1.a_(ib.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dac.G)) {
               $$1.a(kc.ak, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.l <= 0) {
            this.n = aww.a(this.ag, 0.0F, 360.0F);
            this.m = aww.a(this.ag, 20, 80);
         }
      } else {
         this.l = aww.a(this.ag, 100, 600);
         this.l = this.l - this.s * 20 * 5;
      }
   }

   private boolean b(ib $$0) {
      cjg.b $$1 = cjg.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cjg.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cjg.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cjg.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cjg.b a(ib $$0, ib $$1) {
      return ib.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cjg.b.c).orElse(cjg.b.c);
   }

   private cjg.b c(ib $$0) {
      dmz $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(dac.fm)) {
         ein $$2 = $$1.u();
         return $$2.a(aus.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? cjg.b.b : cjg.b.c;
      } else {
         return cjg.b.a;
      }
   }

   public boolean p() {
      return this.o;
   }

   @Override
   public void b(ta $$0) {
   }

   @Override
   public void a(ta $$0) {
   }

   public int a(cqk $$0) {
      cis $$1 = this.r();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.p != null) {
            this.d(this.p);
            am.E.a((apg)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.p instanceof cfd ? 3 : 5;
         } else if (this.k > 0) {
            ela $$3 = new ela.a((apf)this.dM()).a(enf.f, this.dk()).a(enf.i, $$0).a(enf.a, this).a((float)this.r + $$1.gv()).a(ene.f);
            elc $$4 = this.dM().o().aM().getLootTable(eks.as);
            List<cqk> $$5 = $$4.a($$3);
            am.E.a((apg)$$1, $$0, this, $$5);

            for (cqk $$6 : $$5) {
               cfd $$7 = new cfd(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new bpe($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(auv.ao)) {
                  $$1.a(aui.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.p instanceof cis && ((cis)this.p).g()) {
         this.d(this.p);
      }

      super.b($$0);
   }

   protected void d(bow $$0) {
      bow $$1 = this.af_();
      if ($$1 != null) {
         epr $$2 = new epr($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected bow.b aZ() {
      return bow.b.a;
   }

   @Override
   public void a(bow.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bow $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cjg $$0) {
      cis $$1 = this.r();
      if ($$1 != null) {
         $$1.cr = $$0;
      }
   }

   @Nullable
   public cis r() {
      bow $$0 = this.af_();
      return $$0 instanceof cis ? (cis)$$0 : null;
   }

   @Nullable
   public bow s() {
      return this.p;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public yb<aam> di() {
      bow $$0 = this.af_();
      return new aan(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      if (this.r() == null) {
         int $$1 = $$0.p();
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
