import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckh extends ckl {
   private static final Logger b = LogUtils.getLogger();
   private final axr c = axr.a();
   private boolean d;
   private int e;
   private static final int g = 10;
   private static final aiy<Integer> h = ajc.a(ckh.class, aja.b);
   private static final aiy<Boolean> i = ajc.a(ckh.class, aja.k);
   private int j;
   private int k;
   private int l;
   private int m;
   private float n;
   private boolean o = true;
   @Nullable
   private bpv p;
   private ckh.a q = ckh.a.a;
   private final int r;
   private final int s;

   private ckh(bqb<? extends ckh> $$0, cyx $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.r = Math.max(0, $$2);
      this.s = Math.max(0, $$3);
   }

   public ckh(bqb<? extends ckh> $$0, cyx $$1) {
      this($$0, $$1, 0, 0);
   }

   public ckh(cjt $$0, cyx $$1, int $$2, int $$3) {
      this(bqb.by, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = axk.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = axk.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -axk.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = axk.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      esa $$13 = new esa((double)(-$$7), (double)axk.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(axk.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(axk.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(h, 0);
      $$0.a(i, false);
   }

   @Override
   public void a(aiy<?> $$0) {
      if (h.equals($$0)) {
         int $$1 = this.an().a(h);
         this.p = $$1 > 0 ? this.dM().a($$1 - 1) : null;
      }

      if (i.equals($$0)) {
         this.d = this.an().a(i);
         if (this.d) {
            this.o(this.dp().c, (double)(-0.4F * axk.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      this.c.b(this.cw().getLeastSignificantBits() ^ this.dM().Y());
      super.l();
      cjt $$0 = this.r();
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
         eks $$3 = this.dM().b_($$2);
         if ($$3.a(avh.a)) {
            $$1 = $$3.a((cyd)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.q == ckh.a.a) {
            if (this.p != null) {
               this.g(esa.b);
               this.q = ckh.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.q = ckh.a.c;
               return;
            }

            this.w();
         } else {
            if (this.q == ckh.a.b) {
               if (this.p != null) {
                  if (!this.p.dH() && this.p.dM().ae() == this.dM().ae()) {
                     this.a_(this.p.dr(), this.p.e(0.8), this.p.dx());
                  } else {
                     this.A(null);
                     this.q = ckh.a.a;
                  }
               }

               return;
            }

            if (this.q == ckh.a.c) {
               esa $$5 = this.dp();
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

         if (!$$3.a(avh.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bqt.a, this.dp());
         this.J();
         if (this.q == ckh.a.a && (this.aC() || this.P)) {
            this.g(esa.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(cjt $$0) {
      crj $$1 = $$0.eU();
      crj $$2 = $$0.eV();
      boolean $$3 = $$1.a(crm.qU);
      boolean $$4 = $$2.a(crm.qU);
      if (!$$0.dH() && $$0.bA() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void w() {
      ery $$0 = ckn.a(this, this::b);
      this.a($$0);
   }

   @Override
   protected boolean b(bpv $$0) {
      return super.b($$0) || $$0.bA() && $$0 instanceof cgd;
   }

   @Override
   protected void a(erx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(erw $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void A(@Nullable bpv $$0) {
      this.p = $$0;
      this.an().a(h, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(ib $$0) {
      aps $$1 = (aps)this.dM();
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
            float $$5 = axk.a($$4);
            float $$6 = axk.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.m * 0.1F);
            double $$8 = (double)((float)axk.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.m * 0.1F);
            doz $$10 = $$1.a_(ib.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dca.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(kl.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(kl.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(kl.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(aum.iS, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(kl.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(kl.E, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.k = axk.a(this.ag, 20, 40);
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
            float $$15 = axk.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = axk.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(axk.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)axk.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(axk.b($$15) * $$16) * 0.1;
            doz $$20 = $$1.a_(ib.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dca.G)) {
               $$1.a(kl.ak, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.l <= 0) {
            this.n = axk.a(this.ag, 0.0F, 360.0F);
            this.m = axk.a(this.ag, 20, 80);
         }
      } else {
         this.l = axk.a(this.ag, 100, 600);
         this.l = this.l - this.s * 20 * 5;
      }
   }

   private boolean b(ib $$0) {
      ckh.b $$1 = ckh.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         ckh.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == ckh.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == ckh.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private ckh.b a(ib $$0, ib $$1) {
      return ib.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : ckh.b.c).orElse(ckh.b.c);
   }

   private ckh.b c(ib $$0) {
      doz $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(dca.fm)) {
         eks $$2 = $$1.u();
         return $$2.a(avh.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? ckh.b.b : ckh.b.c;
      } else {
         return ckh.b.a;
      }
   }

   public boolean p() {
      return this.o;
   }

   @Override
   public void b(tm $$0) {
   }

   @Override
   public void a(tm $$0) {
   }

   public int a(crj $$0) {
      cjt $$1 = this.r();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.p != null) {
            this.d(this.p);
            am.E.a((apt)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.p instanceof cgd ? 3 : 5;
         } else if (this.k > 0) {
            enh $$3 = new enh.a((aps)this.dM()).a(epo.f, this.dk()).a(epo.i, $$0).a(epo.a, this).a((float)this.r + $$1.gv()).a(epn.f);
            enj $$4 = this.dM().o().aM().getLootTable(emz.as);
            List<crj> $$5 = $$4.a($$3);
            am.E.a((apt)$$1, $$0, this, $$5);

            for (crj $$6 : $$5) {
               cgd $$7 = new cgd(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new bqe($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(avk.ao)) {
                  $$1.a(auw.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.p instanceof cjt && ((cjt)this.p).g()) {
         this.d(this.p);
      }

      super.b($$0);
   }

   protected void d(bpv $$0) {
      bpv $$1 = this.u();
      if ($$1 != null) {
         esa $$2 = new esa($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.a;
   }

   @Override
   public void a(bpv.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bpv $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable ckh $$0) {
      cjt $$1 = this.r();
      if ($$1 != null) {
         $$1.cq = $$0;
      }
   }

   @Nullable
   public cjt r() {
      bpv $$0 = this.u();
      return $$0 instanceof cjt ? (cjt)$$0 : null;
   }

   @Nullable
   public bpv v() {
      return this.p;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public yn<aay> di() {
      bpv $$0 = this.u();
      return new aaz(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(aaz $$0) {
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
