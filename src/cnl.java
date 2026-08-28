import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnl extends cnp {
   private static final Logger b = LogUtils.getLogger();
   private final ayw c = ayw.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final ajw<Integer> g = aka.a(cnl.class, ajy.b);
   private static final ajw<Boolean> h = aka.a(cnl.class, ajy.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bsr o;
   private cnl.a p = cnl.a.a;
   private final int q;
   private final int r;

   private cnl(bsx<? extends cnl> $$0, dcw $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.au = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cnl(bsx<? extends cnl> $$0, dcw $$1) {
      this($$0, $$1, 0, 0);
   }

   public cnl(cmx $$0, dcw $$1, int $$2, int $$3) {
      this(bsx.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dH();
      float $$5 = $$0.dF();
      float $$6 = ayo.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ayo.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ayo.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = ayo.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.du() - (double)$$7 * 0.3;
      double $$11 = $$0.dy();
      double $$12 = $$0.dA() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      exa $$13 = new exa((double)(-$$7), (double)ayo.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365));
      this.i($$13);
      this.t((float)(ayo.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.u((float)(ayo.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   public void a(ajw<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.ar().a(g);
         this.o = $$1 > 0 ? this.dP().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.ar().a(h);
         if (this.d) {
            this.n(this.ds().c, (double)(-0.4F * ayo.a(this.c, 0.6F, 1.0F)), this.ds().e);
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
      this.c.b(this.cA().getLeastSignificantBits() ^ this.dP().Z());
      super.l();
      cmx $$0 = this.t();
      if ($$0 == null) {
         this.aq();
      } else if (this.dP().B || !this.a($$0)) {
         if (this.aF()) {
            this.i++;
            if (this.i >= 1200) {
               this.aq();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         jd $$2 = this.dp();
         epc $$3 = this.dP().b_($$2);
         if ($$3.a(awk.a)) {
            $$1 = $$3.a((dcc)this.dP(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cnl.a.a) {
            if (this.o != null) {
               this.i(exa.b);
               this.p = cnl.a.b;
               return;
            }

            if ($$4) {
               this.i(this.ds().d(0.3, 0.2, 0.3));
               this.p = cnl.a.c;
               return;
            }

            this.w();
         } else {
            if (this.p == cnl.a.b) {
               if (this.o != null) {
                  if (!this.o.dK() && this.o.dP().af() == this.dP().af()) {
                     this.a_(this.o.du(), this.o.e(0.8), this.o.dA());
                  } else {
                     this.A(null);
                     this.p = cnl.a.a;
                  }
               }

               return;
            }

            if (this.p == cnl.a.c) {
               exa $$5 = this.ds();
               double $$6 = this.dw() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.n($$5.c * 0.9, $$5.d - $$6 * (double)this.ah.i() * 0.2, $$5.e * 0.9);
               if (this.j <= 0 && this.l <= 0) {
                  this.n = true;
               } else {
                  this.n = this.n && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.i(this.ds().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dP().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(awk.a)) {
            this.i(this.ds().b(0.0, -0.03, 0.0));
         }

         this.a(bts.a, this.ds());
         this.I();
         if (this.p == cnl.a.a && (this.aF() || this.Q)) {
            this.i(exa.b);
         }

         double $$7 = 0.92;
         this.i(this.ds().a(0.92));
         this.av();
      }
   }

   private boolean a(cmx $$0) {
      cuq $$1 = $$0.eU();
      cuq $$2 = $$0.eV();
      boolean $$3 = $$1.a(cut.qV);
      boolean $$4 = $$2.a(cut.qV);
      if (!$$0.dK() && $$0.bE() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.aq();
         return true;
      }
   }

   private void w() {
      ewy $$0 = cnr.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bsr $$0) {
      return super.b($$0) || $$0.bE() && $$0 instanceof cjh;
   }

   @Override
   protected void a(ewx $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(eww $$0) {
      super.a($$0);
      this.i(this.ds().d().a($$0.a(this)));
   }

   private void A(@Nullable bsr $$0) {
      this.o = $$0;
      this.ar().a(g, $$0 == null ? 0 : $$0.an() + 1);
   }

   private void a(jd $$0) {
      aqu $$1 = (aqu)this.dP();
      int $$2 = 1;
      jd $$3 = $$0.d();
      if (this.ah.i() < 0.25F && this.dP().r($$3)) {
         $$2++;
      }

      if (this.ah.i() < 0.5F && !this.dP().h($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.ar().a(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ah.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = ayo.a($$4);
            float $$6 = ayo.b($$4);
            double $$7 = this.du() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)ayo.a(this.dw()) + 1.0F);
            double $$9 = this.dA() + (double)($$6 * (float)this.l * 0.1F);
            dtc $$10 = $$1.a_(jd.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dga.G)) {
               if (this.ah.i() < 0.15F) {
                  $$1.a(lm.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lm.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lm.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(avp.iX, 0.25F, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
            double $$13 = this.dw() + 0.5;
            $$1.a(lm.d, this.du(), $$13, this.dA(), (int)(1.0F + this.dk() * 20.0F), (double)this.dk(), 0.0, (double)this.dk(), 0.2F);
            $$1.a(lm.E, this.du(), $$13, this.dA(), (int)(1.0F + this.dk() * 20.0F), (double)this.dk(), 0.0, (double)this.dk(), 0.2F);
            this.j = ayo.a(this.ah, 20, 40);
            this.ar().a(h, true);
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

         if (this.ah.i() < $$14) {
            float $$15 = ayo.a(this.ah, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = ayo.a(this.ah, 25.0F, 60.0F);
            double $$17 = this.du() + (double)(ayo.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)ayo.a(this.dw()) + 1.0F);
            double $$19 = this.dA() + (double)(ayo.b($$15) * $$16) * 0.1;
            dtc $$20 = $$1.a_(jd.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dga.G)) {
               $$1.a(lm.am, $$17, $$18, $$19, 2 + this.ah.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = ayo.a(this.ah, 0.0F, 360.0F);
            this.l = ayo.a(this.ah, 20, 80);
         }
      } else {
         this.k = ayo.a(this.ah, 100, 600);
         this.k = this.k - this.r;
      }
   }

   private boolean b(jd $$0) {
      cnl.b $$1 = cnl.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cnl.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cnl.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cnl.b.a) {
                  return false;
               }
               break;
            case c:
               return false;
         }

         $$1 = $$3;
      }

      return true;
   }

   private cnl.b a(jd $$0, jd $$1) {
      return jd.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cnl.b.c).orElse(cnl.b.c);
   }

   private cnl.b c(jd $$0) {
      dtc $$1 = this.dP().a_($$0);
      if (!$$1.i() && !$$1.a(dga.fm)) {
         epc $$2 = $$1.u();
         return $$2.a(awk.a) && $$2.b() && $$1.k(this.dP(), $$0).c() ? cnl.b.b : cnl.b.c;
      } else {
         return cnl.b.a;
      }
   }

   public boolean p() {
      return this.n;
   }

   @Override
   public void b(ub $$0) {
   }

   @Override
   public void a(ub $$0) {
   }

   public int a(cuq $$0) {
      cmx $$1 = this.t();
      if (!this.dP().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.d(this.o);
            an.E.a((aqv)$$1, $$0, this, Collections.emptyList());
            this.dP().a(this, (byte)31);
            $$2 = this.o instanceof cjh ? 3 : 5;
         } else if (this.j > 0) {
            ers $$3 = new ers.a((aqu)this.dP()).a(eul.f, this.dn()).a(eul.i, $$0).a(eul.a, this).a((float)this.q + $$1.gv()).a(euk.f);
            eru $$4 = this.dP().o().be().b(erl.aC);
            List<cuq> $$5 = $$4.a($$3);
            an.E.a((aqv)$$1, $$0, this, $$5);

            for (cuq $$6 : $$5) {
               cjh $$7 = new cjh(this.dP(), this.du(), this.dw(), this.dA(), $$6);
               double $$8 = $$1.du() - this.du();
               double $$9 = $$1.dw() - this.dw();
               double $$10 = $$1.dA() - this.dA();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dP().b($$7);
               $$1.dP().b(new btc($$1.dP(), $$1.du(), $$1.dw() + 0.5, $$1.dA() + 0.5, this.ah.a(6) + 1));
               if ($$6.a(awn.aP)) {
                  $$1.a(avz.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aF()) {
            $$2 = 2;
         }

         this.aq();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dP().B && this.o instanceof cmx && ((cmx)this.o).g()) {
         this.d(this.o);
      }

      super.b($$0);
   }

   protected void d(bsr $$0) {
      bsr $$1 = this.s();
      if ($$1 != null) {
         exa $$2 = new exa($$1.du() - this.du(), $$1.dw() - this.dw(), $$1.dA() - this.dA()).a(0.1);
         $$0.i($$0.ds().e($$2));
      }
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.a;
   }

   @Override
   public void a(bsr.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void as() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bsr $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cnl $$0) {
      cmx $$1 = this.t();
      if ($$1 != null) {
         $$1.cv = $$0;
      }
   }

   @Nullable
   public cmx t() {
      bsr $$0 = this.s();
      return $$0 instanceof cmx ? (cmx)$$0 : null;
   }

   @Nullable
   public bsr v() {
      return this.o;
   }

   @Override
   public boolean cx() {
      return false;
   }

   @Override
   public zg<abu> a(aqt $$0) {
      bsr $$1 = this.s();
      return new abv(this, $$0, $$1 == null ? this.an() : $$1.an());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      if (this.t() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dP().a($$1), $$1);
         this.ap();
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
