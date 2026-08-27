import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfp extends cft {
   private static final Logger b = LogUtils.getLogger();
   private final aup c = aup.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final agj<Integer> g = agm.a(cfp.class, agl.b);
   private static final agj<Boolean> h = agm.a(cfp.class, agl.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private blp o;
   private cfp.a p = cfp.a.a;
   private final int q;
   private final int r;

   private cfp(blt<? extends cfp> $$0, cti $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cfp(blt<? extends cfp> $$0, cti $$1) {
      this($$0, $$1, 0, 0);
   }

   public cfp(cfb $$0, cti $$1, int $$2, int $$3) {
      this(blt.bw, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = aui.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = aui.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -aui.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = aui.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      elm $$13 = new elm((double)(-$$7), (double)aui.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(aui.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(aui.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   @Override
   protected void c_() {
      this.an().a(g, 0);
      this.an().a(h, false);
   }

   @Override
   public void a(agj<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.an().b(g);
         this.o = $$1 > 0 ? this.dM().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.an().b(h);
         if (this.d) {
            this.o(this.dp().c, (double)(-0.4F * aui.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      cfb $$0 = this.s();
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
         eek $$3 = this.dM().b_($$2);
         if ($$3.a(asg.a)) {
            $$1 = $$3.a((cso)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cfp.a.a) {
            if (this.o != null) {
               this.g(elm.b);
               this.p = cfp.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.p = cfp.a.c;
               return;
            }

            this.x();
         } else {
            if (this.p == cfp.a.b) {
               if (this.o != null) {
                  if (!this.o.dH() && this.o.dM().ae() == this.dM().ae()) {
                     this.a_(this.o.dr(), this.o.e(0.8), this.o.dx());
                  } else {
                     this.A(null);
                     this.p = cfp.a.a;
                  }
               }

               return;
            }

            if (this.p == cfp.a.c) {
               elm $$5 = this.dp();
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

         if (!$$3.a(asg.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bml.a, this.dp());
         this.K();
         if (this.p == cfp.a.a && (this.aC() || this.P)) {
            this.g(elm.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(cfb $$0) {
      cmr $$1 = $$0.eT();
      cmr $$2 = $$0.eU();
      boolean $$3 = $$1.a(cmu.qS);
      boolean $$4 = $$2.a(cmu.qS);
      if (!$$0.dH() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      elk $$0 = cfu.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(blp $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof cbo;
   }

   @Override
   protected void a(elj $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(eli $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void A(@Nullable blp $$0) {
      this.o = $$0;
      this.an().b(g, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(hx $$0) {
      amz $$1 = (amz)this.dM();
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
            float $$5 = aui.a($$4);
            float $$6 = aui.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)aui.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.l * 0.1F);
            dja $$10 = $$1.a_(hx.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cwl.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(jx.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(jx.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(jx.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(arm.it, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(jx.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(jx.D, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.j = aui.a(this.ag, 20, 40);
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
            float $$15 = aui.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = aui.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(aui.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)aui.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(aui.b($$15) * $$16) * 0.1;
            dja $$20 = $$1.a_(hx.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cwl.G)) {
               $$1.a(jx.aj, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = aui.a(this.ag, 0.0F, 360.0F);
            this.l = aui.a(this.ag, 20, 80);
         }
      } else {
         this.k = aui.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(hx $$0) {
      cfp.b $$1 = cfp.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cfp.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cfp.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cfp.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cfp.b a(hx $$0, hx $$1) {
      return hx.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cfp.b.c).orElse(cfp.b.c);
   }

   private cfp.b c(hx $$0) {
      dja $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(cwl.fm)) {
         eek $$2 = $$1.u();
         return $$2.a(asg.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? cfp.b.b : cfp.b.c;
      } else {
         return cfp.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(sl $$0) {
   }

   @Override
   public void a(sl $$0) {
   }

   public int a(cmr $$0) {
      cfb $$1 = this.s();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            am.E.a((ana)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.o instanceof cbo ? 3 : 5;
         } else if (this.j > 0) {
            egv $$3 = new egv.a((amz)this.dM()).a(eja.f, this.dk()).a(eja.i, $$0).a(eja.a, this).a((float)this.q + $$1.go()).a(eiz.f);
            egx $$4 = this.dM().o().aJ().getLootTable(egn.as);
            List<cmr> $$5 = $$4.a($$3);
            am.E.a((ana)$$1, $$0, this, $$5);

            for (cmr $$6 : $$5) {
               cbo $$7 = new cbo(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new blv($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(asj.ao)) {
                  $$1.a(arw.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.o instanceof cfb && ((cfb)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(blp $$0) {
      blp $$1 = this.w();
      if ($$1 != null) {
         elm $$2 = new elm($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected blp.b aW() {
      return blp.b.a;
   }

   @Override
   public void a(blp.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable blp $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cfp $$0) {
      cfb $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cfb s() {
      blp $$0 = this.w();
      return $$0 instanceof cfb ? (cfb)$$0 : null;
   }

   @Nullable
   public blp u() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public xd<yx> dj() {
      blp $$0 = this.w();
      return new yy(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(yy $$0) {
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
