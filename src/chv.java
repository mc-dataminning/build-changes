import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chv extends chz {
   private static final Logger b = LogUtils.getLogger();
   private final awo c = awo.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final aie<Integer> g = aih.a(chv.class, aig.b);
   private static final aie<Boolean> h = aih.a(chv.class, aig.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bno o;
   private chv.a p = chv.a.a;
   private final int q;
   private final int r;

   private chv(bnu<? extends chv> $$0, cvn $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.as = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public chv(bnu<? extends chv> $$0, cvn $$1) {
      this($$0, $$1, 0, 0);
   }

   public chv(chh $$0, cvn $$1, int $$2, int $$3) {
      this(bnu.bx, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = awh.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = awh.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -awh.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = awh.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ens $$13 = new ens((double)(-$$7), (double)awh.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.af.a(0.5, 0.0103365), 0.6 / $$14 + this.af.a(0.5, 0.0103365), 0.6 / $$14 + this.af.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(awh.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(awh.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.M = this.dC();
      this.N = this.dE();
   }

   @Override
   protected void c_() {
      this.an().a(g, 0);
      this.an().a(h, false);
   }

   @Override
   public void a(aie<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.an().b(g);
         this.o = $$1 > 0 ? this.dM().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.an().b(h);
         if (this.d) {
            this.o(this.dp().c, (double)(-0.4F * awh.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      chh $$0 = this.s();
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
         hz $$2 = this.dm();
         egp $$3 = this.dM().b_($$2);
         if ($$3.a(aue.a)) {
            $$1 = $$3.a((cut)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == chv.a.a) {
            if (this.o != null) {
               this.g(ens.b);
               this.p = chv.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.p = chv.a.c;
               return;
            }

            this.x();
         } else {
            if (this.p == chv.a.b) {
               if (this.o != null) {
                  if (!this.o.dH() && this.o.dM().ae() == this.dM().ae()) {
                     this.a_(this.o.dr(), this.o.e(0.8), this.o.dx());
                  } else {
                     this.z(null);
                     this.p = chv.a.a;
                  }
               }

               return;
            }

            if (this.p == chv.a.c) {
               ens $$5 = this.dp();
               double $$6 = this.dt() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.af.i() * 0.2, $$5.e * 0.9);
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

         if (!$$3.a(aue.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bol.a, this.dp());
         this.J();
         if (this.p == chv.a.a && (this.aC() || this.O)) {
            this.g(ens.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(chh $$0) {
      coz $$1 = $$0.eT();
      coz $$2 = $$0.eU();
      boolean $$3 = $$1.a(cpc.qU);
      boolean $$4 = $$2.a(cpc.qU);
      if (!$$0.dH() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      enq $$0 = cib.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(bno $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof cds;
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.z($$0.a());
      }
   }

   @Override
   protected void a(eno $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void z(@Nullable bno $$0) {
      this.o = $$0;
      this.an().b(g, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(hz $$0) {
      aov $$1 = (aov)this.dM();
      int $$2 = 1;
      hz $$3 = $$0.c();
      if (this.af.i() < 0.25F && this.dM().r($$3)) {
         $$2++;
      }

      if (this.af.i() < 0.5F && !this.dM().h($$3)) {
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
            this.m = this.m + (float)this.af.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = awh.a($$4);
            float $$6 = awh.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)awh.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.l * 0.1F);
            dlf $$10 = $$1.a_(hz.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cyq.G)) {
               if (this.af.i() < 0.15F) {
                  $$1.a(jz.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(jz.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(jz.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(atk.iI, 0.25F, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(jz.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(jz.D, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.j = awh.a(this.af, 20, 40);
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

         if (this.af.i() < $$14) {
            float $$15 = awh.a(this.af, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = awh.a(this.af, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(awh.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)awh.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(awh.b($$15) * $$16) * 0.1;
            dlf $$20 = $$1.a_(hz.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cyq.G)) {
               $$1.a(jz.aj, $$17, $$18, $$19, 2 + this.af.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = awh.a(this.af, 0.0F, 360.0F);
            this.l = awh.a(this.af, 20, 80);
         }
      } else {
         this.k = awh.a(this.af, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(hz $$0) {
      chv.b $$1 = chv.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         chv.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == chv.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == chv.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private chv.b a(hz $$0, hz $$1) {
      return hz.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : chv.b.c).orElse(chv.b.c);
   }

   private chv.b c(hz $$0) {
      dlf $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(cyq.fm)) {
         egp $$2 = $$1.u();
         return $$2.a(aue.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? chv.b.b : chv.b.c;
      } else {
         return chv.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(sw $$0) {
   }

   @Override
   public void a(sw $$0) {
   }

   public int a(coz $$0) {
      chh $$1 = this.s();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            am.E.a((aow)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.o instanceof cds ? 3 : 5;
         } else if (this.j > 0) {
            ejb $$3 = new ejb.a((aov)this.dM()).a(elg.f, this.dk()).a(elg.i, $$0).a(elg.a, this).a((float)this.q + $$1.gp()).a(elf.f);
            ejd $$4 = this.dM().o().aJ().getLootTable(eit.as);
            List<coz> $$5 = $$4.a($$3);
            am.E.a((aow)$$1, $$0, this, $$5);

            for (coz $$6 : $$5) {
               cds $$7 = new cds(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new bnw($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.af.a(6) + 1));
               if ($$6.a(auh.ao)) {
                  $$1.a(atu.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.o instanceof chh && ((chh)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(bno $$0) {
      bno $$1 = this.w();
      if ($$1 != null) {
         ens $$2 = new ens($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected bno.b aW() {
      return bno.b.a;
   }

   @Override
   public void a(bno.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable bno $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable chv $$0) {
      chh $$1 = this.s();
      if ($$1 != null) {
         $$1.co = $$0;
      }
   }

   @Nullable
   public chh s() {
      bno $$0 = this.w();
      return $$0 instanceof chh ? (chh)$$0 : null;
   }

   @Nullable
   public bno u() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public xx<aag> di() {
      bno $$0 = this.w();
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
