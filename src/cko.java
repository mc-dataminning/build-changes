import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cko extends cks {
   private static final Logger b = LogUtils.getLogger();
   private final axt c = axt.a();
   private boolean d;
   private int e;
   private static final int g = 10;
   private static final aja<Integer> h = aje.a(cko.class, ajc.b);
   private static final aja<Boolean> i = aje.a(cko.class, ajc.k);
   private int j;
   private int k;
   private int l;
   private int m;
   private float n;
   private boolean o = true;
   @Nullable
   private bqa p;
   private cko.a q = cko.a.a;
   private final int r;
   private final int s;

   private cko(bqg<? extends cko> $$0, czg $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.r = Math.max(0, $$2);
      this.s = Math.max(0, $$3);
   }

   public cko(bqg<? extends cko> $$0, czg $$1) {
      this($$0, $$1, 0, 0);
   }

   public cko(cka $$0, czg $$1, int $$2, int $$3) {
      this(bqg.by, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = axm.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = axm.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -axm.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = axm.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      esj $$13 = new esj((double)(-$$7), (double)axm.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(axm.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(axm.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(h, 0);
      $$0.a(i, false);
   }

   @Override
   public void a(aja<?> $$0) {
      if (h.equals($$0)) {
         int $$1 = this.an().a(h);
         this.p = $$1 > 0 ? this.dM().a($$1 - 1) : null;
      }

      if (i.equals($$0)) {
         this.d = this.an().a(i);
         if (this.d) {
            this.o(this.dp().c, (double)(-0.4F * axm.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      cka $$0 = this.r();
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
         id $$2 = this.dm();
         elb $$3 = this.dM().b_($$2);
         if ($$3.a(avj.a)) {
            $$1 = $$3.a((cym)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.q == cko.a.a) {
            if (this.p != null) {
               this.g(esj.b);
               this.q = cko.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.q = cko.a.c;
               return;
            }

            this.w();
         } else {
            if (this.q == cko.a.b) {
               if (this.p != null) {
                  if (!this.p.dH() && this.p.dM().ae() == this.dM().ae()) {
                     this.a_(this.p.dr(), this.p.e(0.8), this.p.dx());
                  } else {
                     this.A(null);
                     this.q = cko.a.a;
                  }
               }

               return;
            }

            if (this.q == cko.a.c) {
               esj $$5 = this.dp();
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

         if (!$$3.a(avj.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bqy.a, this.dp());
         this.J();
         if (this.q == cko.a.a && (this.aC() || this.P)) {
            this.g(esj.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(cka $$0) {
      crs $$1 = $$0.eU();
      crs $$2 = $$0.eV();
      boolean $$3 = $$1.a(crv.qU);
      boolean $$4 = $$2.a(crv.qU);
      if (!$$0.dH() && $$0.bA() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void w() {
      esh $$0 = cku.a(this, this::b);
      this.a($$0);
   }

   @Override
   protected boolean b(bqa $$0) {
      return super.b($$0) || $$0.bA() && $$0 instanceof cgk;
   }

   @Override
   protected void a(esg $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(esf $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void A(@Nullable bqa $$0) {
      this.p = $$0;
      this.an().a(h, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(id $$0) {
      apu $$1 = (apu)this.dM();
      int $$2 = 1;
      id $$3 = $$0.c();
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
            float $$5 = axm.a($$4);
            float $$6 = axm.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.m * 0.1F);
            double $$8 = (double)((float)axm.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.m * 0.1F);
            dpi $$10 = $$1.a_(id.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dcj.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(kn.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(kn.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(kn.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(auo.iS, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(kn.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(kn.E, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.k = axm.a(this.ag, 20, 40);
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
            float $$15 = axm.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = axm.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(axm.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)axm.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(axm.b($$15) * $$16) * 0.1;
            dpi $$20 = $$1.a_(id.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dcj.G)) {
               $$1.a(kn.ak, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.l <= 0) {
            this.n = axm.a(this.ag, 0.0F, 360.0F);
            this.m = axm.a(this.ag, 20, 80);
         }
      } else {
         this.l = axm.a(this.ag, 100, 600);
         this.l = this.l - this.s * 20 * 5;
      }
   }

   private boolean b(id $$0) {
      cko.b $$1 = cko.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cko.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cko.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cko.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cko.b a(id $$0, id $$1) {
      return id.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cko.b.c).orElse(cko.b.c);
   }

   private cko.b c(id $$0) {
      dpi $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(dcj.fm)) {
         elb $$2 = $$1.u();
         return $$2.a(avj.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? cko.b.b : cko.b.c;
      } else {
         return cko.b.a;
      }
   }

   public boolean p() {
      return this.o;
   }

   @Override
   public void b(to $$0) {
   }

   @Override
   public void a(to $$0) {
   }

   public int a(crs $$0) {
      cka $$1 = this.r();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.p != null) {
            this.d(this.p);
            am.E.a((apv)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.p instanceof cgk ? 3 : 5;
         } else if (this.k > 0) {
            enq $$3 = new enq.a((apu)this.dM()).a(epx.f, this.dk()).a(epx.i, $$0).a(epx.a, this).a((float)this.r + $$1.gv()).a(epw.f);
            ens $$4 = this.dM().o().aM().getLootTable(eni.as);
            List<crs> $$5 = $$4.a($$3);
            am.E.a((apv)$$1, $$0, this, $$5);

            for (crs $$6 : $$5) {
               cgk $$7 = new cgk(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new bqj($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(avm.ao)) {
                  $$1.a(auz.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.p instanceof cka && ((cka)this.p).g()) {
         this.d(this.p);
      }

      super.b($$0);
   }

   protected void d(bqa $$0) {
      bqa $$1 = this.u();
      if ($$1 != null) {
         esj $$2 = new esj($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected bqa.b aZ() {
      return bqa.b.a;
   }

   @Override
   public void a(bqa.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bqa $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cko $$0) {
      cka $$1 = this.r();
      if ($$1 != null) {
         $$1.cs = $$0;
      }
   }

   @Nullable
   public cka r() {
      bqa $$0 = this.u();
      return $$0 instanceof cka ? (cka)$$0 : null;
   }

   @Nullable
   public bqa v() {
      return this.p;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public yp<aba> di() {
      bqa $$0 = this.u();
      return new abb(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(abb $$0) {
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
