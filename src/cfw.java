import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfw extends cga {
   private static final Logger b = LogUtils.getLogger();
   private final auv c = auv.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final agm<Integer> g = agp.a(cfw.class, ago.b);
   private static final agm<Boolean> h = agp.a(cfw.class, ago.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private blv o;
   private cfw.a p = cfw.a.a;
   private final int q;
   private final int r;

   private cfw(blz<? extends cfw> $$0, ctp $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cfw(blz<? extends cfw> $$0, ctp $$1) {
      this($$0, $$1, 0, 0);
   }

   public cfw(cfi $$0, ctp $$1, int $$2, int $$3) {
      this(blz.bw, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dE();
      float $$5 = $$0.dC();
      float $$6 = auo.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = auo.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -auo.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = auo.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dr() - (double)$$7 * 0.3;
      double $$11 = $$0.dv();
      double $$12 = $$0.dx() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      elt $$13 = new elt((double)(-$$7), (double)auo.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(auo.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(auo.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
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
            this.o(this.dp().c, (double)(-0.4F * auo.a(this.c, 0.6F, 1.0F)), this.dp().e);
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
      cfi $$0 = this.s();
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
         eer $$3 = this.dM().b_($$2);
         if ($$3.a(asm.a)) {
            $$1 = $$3.a((csv)this.dM(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cfw.a.a) {
            if (this.o != null) {
               this.g(elt.b);
               this.p = cfw.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dp().d(0.3, 0.2, 0.3));
               this.p = cfw.a.c;
               return;
            }

            this.x();
         } else {
            if (this.p == cfw.a.b) {
               if (this.o != null) {
                  if (!this.o.dH() && this.o.dM().ae() == this.dM().ae()) {
                     this.a_(this.o.dr(), this.o.e(0.8), this.o.dx());
                  } else {
                     this.A(null);
                     this.p = cfw.a.a;
                  }
               }

               return;
            }

            if (this.p == cfw.a.c) {
               elt $$5 = this.dp();
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

         if (!$$3.a(asm.a)) {
            this.g(this.dp().b(0.0, -0.03, 0.0));
         }

         this.a(bmr.a, this.dp());
         this.K();
         if (this.p == cfw.a.a && (this.aC() || this.P)) {
            this.g(elt.b);
         }

         double $$7 = 0.92;
         this.g(this.dp().a(0.92));
         this.ar();
      }
   }

   private boolean a(cfi $$0) {
      cmy $$1 = $$0.eT();
      cmy $$2 = $$0.eU();
      boolean $$3 = $$1.a(cnb.qS);
      boolean $$4 = $$2.a(cnb.qS);
      if (!$$0.dH() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      elr $$0 = cgb.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(blv $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof cbu;
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      this.g(this.dp().d().a($$0.a(this)));
   }

   private void A(@Nullable blv $$0) {
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
            float $$5 = auo.a($$4);
            float $$6 = auo.b($$4);
            double $$7 = this.dr() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)auo.a(this.dt()) + 1.0F);
            double $$9 = this.dx() + (double)($$6 * (float)this.l * 0.1F);
            djh $$10 = $$1.a_(hx.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cws.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(jx.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(jx.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(jx.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(ars.it, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dt() + 0.5;
            $$1.a(jx.e, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(jx.D, this.dr(), $$13, this.dx(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.j = auo.a(this.ag, 20, 40);
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
            float $$15 = auo.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = auo.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dr() + (double)(auo.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)auo.a(this.dt()) + 1.0F);
            double $$19 = this.dx() + (double)(auo.b($$15) * $$16) * 0.1;
            djh $$20 = $$1.a_(hx.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cws.G)) {
               $$1.a(jx.aj, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = auo.a(this.ag, 0.0F, 360.0F);
            this.l = auo.a(this.ag, 20, 80);
         }
      } else {
         this.k = auo.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(hx $$0) {
      cfw.b $$1 = cfw.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cfw.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cfw.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cfw.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cfw.b a(hx $$0, hx $$1) {
      return hx.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cfw.b.c).orElse(cfw.b.c);
   }

   private cfw.b c(hx $$0) {
      djh $$1 = this.dM().a_($$0);
      if (!$$1.i() && !$$1.a(cws.fm)) {
         eer $$2 = $$1.u();
         return $$2.a(asm.a) && $$2.b() && $$1.k(this.dM(), $$0).c() ? cfw.b.b : cfw.b.c;
      } else {
         return cfw.b.a;
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

   public int a(cmy $$0) {
      cfi $$1 = this.s();
      if (!this.dM().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            am.E.a((ane)$$1, $$0, this, Collections.emptyList());
            this.dM().a(this, (byte)31);
            $$2 = this.o instanceof cbu ? 3 : 5;
         } else if (this.j > 0) {
            ehc $$3 = new ehc.a((and)this.dM()).a(ejh.f, this.dk()).a(ejh.i, $$0).a(ejh.a, this).a((float)this.q + $$1.go()).a(ejg.f);
            ehe $$4 = this.dM().o().aJ().getLootTable(egu.as);
            List<cmy> $$5 = $$4.a($$3);
            am.E.a((ane)$$1, $$0, this, $$5);

            for (cmy $$6 : $$5) {
               cbu $$7 = new cbu(this.dM(), this.dr(), this.dt(), this.dx(), $$6);
               double $$8 = $$1.dr() - this.dr();
               double $$9 = $$1.dt() - this.dt();
               double $$10 = $$1.dx() - this.dx();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dM().b($$7);
               $$1.dM().b(new bmb($$1.dM(), $$1.dr(), $$1.dt() + 0.5, $$1.dx() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(asp.ao)) {
                  $$1.a(asc.R, 1);
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
      if ($$0 == 31 && this.dM().B && this.o instanceof cfi && ((cfi)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(blv $$0) {
      blv $$1 = this.w();
      if ($$1 != null) {
         elt $$2 = new elt($$1.dr() - this.dr(), $$1.dt() - this.dt(), $$1.dx() - this.dx()).a(0.1);
         $$0.g($$0.dp().e($$2));
      }
   }

   @Override
   protected blv.b aW() {
      return blv.b.a;
   }

   @Override
   public void a(blv.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable blv $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cfw $$0) {
      cfi $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cfi s() {
      blv $$0 = this.w();
      return $$0 instanceof cfi ? (cfi)$$0 : null;
   }

   @Nullable
   public blv u() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public xf<za> dj() {
      blv $$0 = this.w();
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
