import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chz extends cid {
   private static final Logger b = LogUtils.getLogger();
   private final awp c = awp.a();
   private boolean d;
   private int e;
   private static final int g = 10;
   private static final aie<Integer> h = aih.a(chz.class, aig.b);
   private static final aie<Boolean> i = aih.a(chz.class, aig.k);
   private int j;
   private int k;
   private int l;
   private int m;
   private float n;
   private boolean o = true;
   @Nullable
   private bnq p;
   private chz.a q = chz.a.a;
   private final int r;
   private final int s;

   private chz(bnw<? extends chz> $$0, cvr $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.as = true;
      this.r = Math.max(0, $$2);
      this.s = Math.max(0, $$3);
   }

   public chz(bnw<? extends chz> $$0, cvr $$1) {
      this($$0, $$1, 0, 0);
   }

   public chz(chl $$0, cvr $$1, int $$2, int $$3) {
      this(bnw.bx, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = awi.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = awi.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -awi.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = awi.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      enz $$13 = new enz((double)(-$$7), (double)awi.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.af.a(0.5, 0.0103365), 0.6 / $$14 + this.af.a(0.5, 0.0103365), 0.6 / $$14 + this.af.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(awi.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(awi.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.M = this.dC();
      this.N = this.dE();
   }

   @Override
   protected void c_() {
      this.an().a(h, 0);
      this.an().a(i, false);
   }

   @Override
   public void a(aie<?> $$0) {
      if (h.equals($$0)) {
         int $$1 = this.an().b(h);
         this.p = $$1 > 0 ? this.dM().a($$1 - 1) : null;
      }

      if (i.equals($$0)) {
         this.d = this.an().b(i);
         if (this.d) {
            this.o(this.dp().c, (double)(-0.4F * awi.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      chl $$0 = this.s();
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
         hz $$2 = this.dm();
         egw $$3 = this.dM().b_($$2);
         if ($$3.a(auf.a)) {
            $$1 = $$3.a((cux)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.q == chz.a.a) {
            if (this.p != null) {
               this.g(enz.b);
               this.q = chz.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.q = chz.a.c;
               return;
            }

            this.x();
         } else {
            if (this.q == chz.a.b) {
               if (this.p != null) {
                  if (!this.p.dH() && this.p.dM().ad() == this.dM().ad()) {
                     this.a_(this.p.dr(), this.p.e(0.8), this.p.dx());
                  } else {
                     this.z(null);
                     this.q = chz.a.a;
                  }
               }

               return;
            }

            if (this.q == chz.a.c) {
               enz $$5 = this.dp();
               double $$6 = this.dt() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.af.i() * 0.2, $$5.e * 0.9);
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

         if (!$$3.a(auf.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bon.a, this.dp());
         this.J();
         if (this.q == chz.a.a && (this.aC() || this.O)) {
            this.g(enz.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(chl $$0) {
      cpd $$1 = $$0.eT();
      cpd $$2 = $$0.eU();
      boolean $$3 = $$1.a(cpg.qU);
      boolean $$4 = $$2.a(cpg.qU);
      if (!$$0.dH() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      enx $$0 = cif.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(bnq $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof cdw;
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.z($$0.a());
      }
   }

   @Override
   protected void a(env $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void z(@Nullable bnq $$0) {
      this.p = $$0;
      this.an().b(h, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(hz $$0) {
      aow $$1 = (aow)this.dM();
      int $$2 = 1;
      hz $$3 = $$0.c();
      if (this.af.i() < 0.25F && this.dM().r($$3)) {
         $$2++;
      }

      if (this.af.i() < 0.5F && !this.dM().h($$3)) {
         $$2--;
      }

      if (this.k > 0) {
         this.k--;
         if (this.k <= 0) {
            this.l = 0;
            this.m = 0;
            this.an().b(i, false);
         }
      } else if (this.m > 0) {
         this.m -= $$2;
         if (this.m > 0) {
            this.n = this.n + (float)this.af.a(0.0, 9.188);
            float $$4 = this.n * (float) (Math.PI / 180.0);
            float $$5 = awi.a($$4);
            float $$6 = awi.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.m * 0.1F);
            double $$8 = (double)((float)awi.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.m * 0.1F);
            dlj $$10 = $$1.a_(hz.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cyu.G)) {
               if (this.af.i() < 0.15F) {
                  $$1.a(jz.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(jz.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(jz.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(atl.iJ, 0.25F, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(jz.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(jz.D, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.k = awi.a(this.af, 20, 40);
            this.an().b(i, true);
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

         if (this.af.i() < $$14) {
            float $$15 = awi.a(this.af, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = awi.a(this.af, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(awi.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)awi.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(awi.b($$15) * $$16) * 0.1;
            dlj $$20 = $$1.a_(hz.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cyu.G)) {
               $$1.a(jz.aj, $$17, $$18, $$19, 2 + this.af.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.l <= 0) {
            this.n = awi.a(this.af, 0.0F, 360.0F);
            this.m = awi.a(this.af, 20, 80);
         }
      } else {
         this.l = awi.a(this.af, 100, 600);
         this.l = this.l - this.s * 20 * 5;
      }
   }

   private boolean b(hz $$0) {
      chz.b $$1 = chz.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         chz.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == chz.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == chz.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private chz.b a(hz $$0, hz $$1) {
      return hz.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : chz.b.c).orElse(chz.b.c);
   }

   private chz.b c(hz $$0) {
      dlj $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(cyu.fm)) {
         egw $$2 = $$1.u();
         return $$2.a(auf.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? chz.b.b : chz.b.c;
      } else {
         return chz.b.a;
      }
   }

   public boolean q() {
      return this.o;
   }

   @Override
   public void b(sw $$0) {
   }

   @Override
   public void a(sw $$0) {
   }

   public int a(cpd $$0) {
      chl $$1 = this.s();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.p != null) {
            this.c(this.p);
            am.E.a((aox)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.p instanceof cdw ? 3 : 5;
         } else if (this.k > 0) {
            eji $$3 = new eji.a((aow)this.dM()).a(eln.f, this.dk()).a(eln.i, $$0).a(eln.a, this).a((float)this.r + $$1.gp()).a(elm.f);
            ejk $$4 = this.dM().o().aL().getLootTable(eja.as);
            List<cpd> $$5 = $$4.a($$3);
            am.E.a((aox)$$1, $$0, this, $$5);

            for (cpd $$6 : $$5) {
               cdw $$7 = new cdw(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new bny($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.af.a(6) + 1));
               if ($$6.a(aui.ao)) {
                  $$1.a(atv.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.p instanceof chl && ((chl)this.p).g()) {
         this.c(this.p);
      }

      super.b($$0);
   }

   protected void c(bnq $$0) {
      bnq $$1 = this.w();
      if ($$1 != null) {
         enz $$2 = new enz($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.a;
   }

   @Override
   public void a(bnq.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable bnq $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable chz $$0) {
      chl $$1 = this.s();
      if ($$1 != null) {
         $$1.co = $$0;
      }
   }

   @Nullable
   public chl s() {
      bnq $$0 = this.w();
      return $$0 instanceof chl ? (chl)$$0 : null;
   }

   @Nullable
   public bnq u() {
      return this.p;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public xx<aag> di() {
      bnq $$0 = this.w();
      return new aah(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      if (this.s() == null) {
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
