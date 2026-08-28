import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cng extends cnk {
   private static final Logger b = LogUtils.getLogger();
   private final azc c = azc.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final akg<Integer> g = akk.a(cng.class, aki.b);
   private static final akg<Boolean> h = akk.a(cng.class, aki.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bsp o;
   private cng.a p = cng.a.a;
   private final int q;
   private final int r;

   private cng(bsv<? extends cng> $$0, dbt $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.au = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cng(bsv<? extends cng> $$0, dbt $$1) {
      this($$0, $$1, 0, 0);
   }

   public cng(cms $$0, dbt $$1, int $$2, int $$3) {
      this(bsv.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dH();
      float $$5 = $$0.dF();
      float $$6 = ayu.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ayu.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ayu.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = ayu.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.du() - (double)$$7 * 0.3;
      double $$11 = $$0.dy();
      double $$12 = $$0.dA() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      evm $$13 = new evm((double)(-$$7), (double)ayu.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365));
      this.h($$13);
      this.r((float)(ayu.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(ayu.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.O = this.dF();
      this.P = this.dH();
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   public void a(akg<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.ap().a(g);
         this.o = $$1 > 0 ? this.dP().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.ap().a(h);
         if (this.d) {
            this.o(this.ds().c, (double)(-0.4F * ayu.a(this.c, 0.6F, 1.0F)), this.ds().e);
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
      this.c.b(this.cz().getLeastSignificantBits() ^ this.dP().Z());
      super.l();
      cms $$0 = this.u();
      if ($$0 == null) {
         this.ao();
      } else if (this.dP().B || !this.a($$0)) {
         if (this.aE()) {
            this.i++;
            if (this.i >= 1200) {
               this.ao();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         iz $$2 = this.dp();
         enq $$3 = this.dP().b_($$2);
         if ($$3.a(awr.a)) {
            $$1 = $$3.a((daz)this.dP(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cng.a.a) {
            if (this.o != null) {
               this.h(evm.b);
               this.p = cng.a.b;
               return;
            }

            if ($$4) {
               this.h(this.ds().d(0.3, 0.2, 0.3));
               this.p = cng.a.c;
               return;
            }

            this.w();
         } else {
            if (this.p == cng.a.b) {
               if (this.o != null) {
                  if (!this.o.dK() && this.o.dP().af() == this.dP().af()) {
                     this.a_(this.o.du(), this.o.e(0.8), this.o.dA());
                  } else {
                     this.B(null);
                     this.p = cng.a.a;
                  }
               }

               return;
            }

            if (this.p == cng.a.c) {
               evm $$5 = this.ds();
               double $$6 = this.dw() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.ah.i() * 0.2, $$5.e * 0.9);
               if (this.j <= 0 && this.l <= 0) {
                  this.n = true;
               } else {
                  this.n = this.n && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.h(this.ds().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dP().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(awr.a)) {
            this.h(this.ds().b(0.0, -0.03, 0.0));
         }

         this.a(btp.a, this.ds());
         this.J();
         if (this.p == cng.a.a && (this.aE() || this.Q)) {
            this.h(evm.b);
         }

         double $$7 = 0.92;
         this.h(this.ds().a(0.92));
         this.at();
      }
   }

   private boolean a(cms $$0) {
      cuk $$1 = $$0.eX();
      cuk $$2 = $$0.eY();
      boolean $$3 = $$1.a(cun.qV);
      boolean $$4 = $$2.a(cun.qV);
      if (!$$0.dK() && $$0.bD() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.ao();
         return true;
      }
   }

   private void w() {
      evk $$0 = cnm.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bsp $$0) {
      return super.b($$0) || $$0.bD() && $$0 instanceof cjc;
   }

   @Override
   protected void a(evj $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(evi $$0) {
      super.a($$0);
      this.h(this.ds().d().a($$0.a(this)));
   }

   private void B(@Nullable bsp $$0) {
      this.o = $$0;
      this.ap().a(g, $$0 == null ? 0 : $$0.al() + 1);
   }

   private void a(iz $$0) {
      arb $$1 = (arb)this.dP();
      int $$2 = 1;
      iz $$3 = $$0.c();
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
            this.ap().a(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ah.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = ayu.a($$4);
            float $$6 = ayu.b($$4);
            double $$7 = this.du() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)ayu.a(this.dw()) + 1.0F);
            double $$9 = this.dA() + (double)($$6 * (float)this.l * 0.1F);
            drx $$10 = $$1.a_(iz.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dew.G)) {
               if (this.ah.i() < 0.15F) {
                  $$1.a(lj.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lj.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lj.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(avw.iX, 0.25F, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
            double $$13 = this.dw() + 0.5;
            $$1.a(lj.d, this.du(), $$13, this.dA(), (int)(1.0F + this.dj() * 20.0F), (double)this.dj(), 0.0, (double)this.dj(), 0.2F);
            $$1.a(lj.E, this.du(), $$13, this.dA(), (int)(1.0F + this.dj() * 20.0F), (double)this.dj(), 0.0, (double)this.dj(), 0.2F);
            this.j = ayu.a(this.ah, 20, 40);
            this.ap().a(h, true);
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
            float $$15 = ayu.a(this.ah, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = ayu.a(this.ah, 25.0F, 60.0F);
            double $$17 = this.du() + (double)(ayu.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)ayu.a(this.dw()) + 1.0F);
            double $$19 = this.dA() + (double)(ayu.b($$15) * $$16) * 0.1;
            drx $$20 = $$1.a_(iz.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dew.G)) {
               $$1.a(lj.am, $$17, $$18, $$19, 2 + this.ah.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = ayu.a(this.ah, 0.0F, 360.0F);
            this.l = ayu.a(this.ah, 20, 80);
         }
      } else {
         this.k = ayu.a(this.ah, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(iz $$0) {
      cng.b $$1 = cng.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cng.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cng.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cng.b.a) {
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

   private cng.b a(iz $$0, iz $$1) {
      return iz.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cng.b.c).orElse(cng.b.c);
   }

   private cng.b c(iz $$0) {
      drx $$1 = this.dP().a_($$0);
      if (!$$1.i() && !$$1.a(dew.fm)) {
         enq $$2 = $$1.u();
         return $$2.a(awr.a) && $$2.b() && $$1.k(this.dP(), $$0).c() ? cng.b.b : cng.b.c;
      } else {
         return cng.b.a;
      }
   }

   public boolean p() {
      return this.n;
   }

   @Override
   public void b(ur $$0) {
   }

   @Override
   public void a(ur $$0) {
   }

   public int a(cuk $$0) {
      cms $$1 = this.u();
      if (!this.dP().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.e(this.o);
            am.E.a((arc)$$1, $$0, this, Collections.emptyList());
            this.dP().a(this, (byte)31);
            $$2 = this.o instanceof cjc ? 3 : 5;
         } else if (this.j > 0) {
            eqg $$3 = new eqg.a((arb)this.dP()).a(esz.f, this.dn()).a(esz.i, $$0).a(esz.a, this).a((float)this.q + $$1.gy()).a(esy.f);
            eqi $$4 = this.dP().o().be().b(epz.aC);
            List<cuk> $$5 = $$4.a($$3);
            am.E.a((arc)$$1, $$0, this, $$5);

            for (cuk $$6 : $$5) {
               cjc $$7 = new cjc(this.dP(), this.du(), this.dw(), this.dA(), $$6);
               double $$8 = $$1.du() - this.du();
               double $$9 = $$1.dw() - this.dw();
               double $$10 = $$1.dA() - this.dA();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dP().b($$7);
               $$1.dP().b(new bta($$1.dP(), $$1.du(), $$1.dw() + 0.5, $$1.dA() + 0.5, this.ah.a(6) + 1));
               if ($$6.a(awu.aP)) {
                  $$1.a(awg.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aE()) {
            $$2 = 2;
         }

         this.ao();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dP().B && this.o instanceof cms && ((cms)this.o).g()) {
         this.e(this.o);
      }

      super.b($$0);
   }

   protected void e(bsp $$0) {
      bsp $$1 = this.s();
      if ($$1 != null) {
         evm $$2 = new evm($$1.du() - this.du(), $$1.dw() - this.dw(), $$1.dA() - this.dA()).a(0.1);
         $$0.h($$0.ds().e($$2));
      }
   }

   @Override
   protected bsp.b bb() {
      return bsp.b.a;
   }

   @Override
   public void a(bsp.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void aq() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bsp $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cng $$0) {
      cms $$1 = this.u();
      if ($$1 != null) {
         $$1.ct = $$0;
      }
   }

   @Nullable
   public cms u() {
      bsp $$0 = this.s();
      return $$0 instanceof cms ? (cms)$$0 : null;
   }

   @Nullable
   public bsp v() {
      return this.o;
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public zs<ace> dl() {
      bsp $$0 = this.s();
      return new acf(this, $$0 == null ? this.al() : $$0.al());
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      if (this.u() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dP().a($$1), $$1);
         this.an();
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
