import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmz extends cnd {
   private static final Logger b = LogUtils.getLogger();
   private final ayo c = ayo.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final ajp<Integer> g = ajt.a(cmz.class, ajr.b);
   private static final ajp<Boolean> h = ajt.a(cmz.class, ajr.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bsh o;
   private cmz.a p = cmz.a.a;
   private final int q;
   private final int r;

   private cmz(bsn<? extends cmz> $$0, dcg $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.au = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cmz(bsn<? extends cmz> $$0, dcg $$1) {
      this($$0, $$1, 0, 0);
   }

   public cmz(cml $$0, dcg $$1, int $$2, int $$3) {
      this(bsn.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dJ();
      float $$5 = $$0.dH();
      float $$6 = ayg.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ayg.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ayg.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = ayg.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dw() - (double)$$7 * 0.3;
      double $$11 = $$0.dA();
      double $$12 = $$0.dC() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ewh $$13 = new ewh((double)(-$$7), (double)ayg.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365));
      this.j($$13);
      this.s((float)(ayg.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.t((float)(ayg.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.O = this.dH();
      this.P = this.dJ();
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.ar().a(g);
         this.o = $$1 > 0 ? this.dR().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.ar().a(h);
         if (this.d) {
            this.o(this.du().c, (double)(-0.4F * ayg.a(this.c, 0.6F, 1.0F)), this.du().e);
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
      this.c.b(this.cB().getLeastSignificantBits() ^ this.dR().Z());
      super.l();
      cml $$0 = this.t();
      if ($$0 == null) {
         this.aq();
      } else if (this.dR().B || !this.a($$0)) {
         if (this.aG()) {
            this.i++;
            if (this.i >= 1200) {
               this.aq();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         ja $$2 = this.dr();
         eoj $$3 = this.dR().b_($$2);
         if ($$3.a(awc.a)) {
            $$1 = $$3.a((dbm)this.dR(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cmz.a.a) {
            if (this.o != null) {
               this.j(ewh.b);
               this.p = cmz.a.b;
               return;
            }

            if ($$4) {
               this.j(this.du().d(0.3, 0.2, 0.3));
               this.p = cmz.a.c;
               return;
            }

            this.w();
         } else {
            if (this.p == cmz.a.b) {
               if (this.o != null) {
                  if (!this.o.dM() && this.o.dR().af() == this.dR().af()) {
                     this.a_(this.o.dw(), this.o.e(0.8), this.o.dC());
                  } else {
                     this.A(null);
                     this.p = cmz.a.a;
                  }
               }

               return;
            }

            if (this.p == cmz.a.c) {
               ewh $$5 = this.du();
               double $$6 = this.dy() + $$5.d - (double)$$2.v() - (double)$$1;
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
                     this.j(this.du().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dR().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(awc.a)) {
            this.j(this.du().b(0.0, -0.03, 0.0));
         }

         this.a(bth.a, this.du());
         this.J();
         if (this.p == cmz.a.a && (this.aG() || this.Q)) {
            this.j(ewh.b);
         }

         double $$7 = 0.92;
         this.j(this.du().a(0.92));
         this.av();
      }
   }

   private boolean a(cml $$0) {
      cud $$1 = $$0.eV();
      cud $$2 = $$0.eW();
      boolean $$3 = $$1.a(cug.qV);
      boolean $$4 = $$2.a(cug.qV);
      if (!$$0.dM() && $$0.bF() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.aq();
         return true;
      }
   }

   private void w() {
      ewf $$0 = cnf.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bsh $$0) {
      return super.b($$0) || $$0.bF() && $$0 instanceof civ;
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      if (!this.dR().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      this.j(this.du().d().a($$0.a(this)));
   }

   private void A(@Nullable bsh $$0) {
      this.o = $$0;
      this.ar().a(g, $$0 == null ? 0 : $$0.an() + 1);
   }

   private void a(ja $$0) {
      aqm $$1 = (aqm)this.dR();
      int $$2 = 1;
      ja $$3 = $$0.c();
      if (this.ah.i() < 0.25F && this.dR().r($$3)) {
         $$2++;
      }

      if (this.ah.i() < 0.5F && !this.dR().h($$3)) {
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
            float $$5 = ayg.a($$4);
            float $$6 = ayg.b($$4);
            double $$7 = this.dw() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)ayg.a(this.dy()) + 1.0F);
            double $$9 = this.dC() + (double)($$6 * (float)this.l * 0.1F);
            dsl $$10 = $$1.a_(ja.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dfk.G)) {
               if (this.ah.i() < 0.15F) {
                  $$1.a(lj.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lj.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lj.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(avh.iX, 0.25F, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
            double $$13 = this.dy() + 0.5;
            $$1.a(lj.d, this.dw(), $$13, this.dC(), (int)(1.0F + this.dl() * 20.0F), (double)this.dl(), 0.0, (double)this.dl(), 0.2F);
            $$1.a(lj.E, this.dw(), $$13, this.dC(), (int)(1.0F + this.dl() * 20.0F), (double)this.dl(), 0.0, (double)this.dl(), 0.2F);
            this.j = ayg.a(this.ah, 20, 40);
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
            float $$15 = ayg.a(this.ah, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = ayg.a(this.ah, 25.0F, 60.0F);
            double $$17 = this.dw() + (double)(ayg.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)ayg.a(this.dy()) + 1.0F);
            double $$19 = this.dC() + (double)(ayg.b($$15) * $$16) * 0.1;
            dsl $$20 = $$1.a_(ja.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dfk.G)) {
               $$1.a(lj.am, $$17, $$18, $$19, 2 + this.ah.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = ayg.a(this.ah, 0.0F, 360.0F);
            this.l = ayg.a(this.ah, 20, 80);
         }
      } else {
         this.k = ayg.a(this.ah, 100, 600);
         this.k = this.k - this.r;
      }
   }

   private boolean b(ja $$0) {
      cmz.b $$1 = cmz.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cmz.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cmz.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cmz.b.a) {
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

   private cmz.b a(ja $$0, ja $$1) {
      return ja.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cmz.b.c).orElse(cmz.b.c);
   }

   private cmz.b c(ja $$0) {
      dsl $$1 = this.dR().a_($$0);
      if (!$$1.i() && !$$1.a(dfk.fm)) {
         eoj $$2 = $$1.u();
         return $$2.a(awc.a) && $$2.b() && $$1.k(this.dR(), $$0).c() ? cmz.b.b : cmz.b.c;
      } else {
         return cmz.b.a;
      }
   }

   public boolean p() {
      return this.n;
   }

   @Override
   public void b(tx $$0) {
   }

   @Override
   public void a(tx $$0) {
   }

   public int a(cud $$0) {
      cml $$1 = this.t();
      if (!this.dR().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.d(this.o);
            am.E.a((aqn)$$1, $$0, this, Collections.emptyList());
            this.dR().a(this, (byte)31);
            $$2 = this.o instanceof civ ? 3 : 5;
         } else if (this.j > 0) {
            eqz $$3 = new eqz.a((aqm)this.dR()).a(ets.f, this.dp()).a(ets.i, $$0).a(ets.a, this).a((float)this.q + $$1.gw()).a(etr.f);
            erb $$4 = this.dR().o().bf().b(eqs.aC);
            List<cud> $$5 = $$4.a($$3);
            am.E.a((aqn)$$1, $$0, this, $$5);

            for (cud $$6 : $$5) {
               civ $$7 = new civ(this.dR(), this.dw(), this.dy(), this.dC(), $$6);
               double $$8 = $$1.dw() - this.dw();
               double $$9 = $$1.dy() - this.dy();
               double $$10 = $$1.dC() - this.dC();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dR().b($$7);
               $$1.dR().b(new bss($$1.dR(), $$1.dw(), $$1.dy() + 0.5, $$1.dC() + 0.5, this.ah.a(6) + 1));
               if ($$6.a(awf.aP)) {
                  $$1.a(avr.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aG()) {
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
      if ($$0 == 31 && this.dR().B && this.o instanceof cml && ((cml)this.o).g()) {
         this.d(this.o);
      }

      super.b($$0);
   }

   protected void d(bsh $$0) {
      bsh $$1 = this.s();
      if ($$1 != null) {
         ewh $$2 = new ewh($$1.dw() - this.dw(), $$1.dy() - this.dy(), $$1.dC() - this.dC()).a(0.1);
         $$0.j($$0.du().e($$2));
      }
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.a;
   }

   @Override
   public void a(bsh.d $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void as() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bsh $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cmz $$0) {
      cml $$1 = this.t();
      if ($$1 != null) {
         $$1.cw = $$0;
      }
   }

   @Nullable
   public cml t() {
      bsh $$0 = this.s();
      return $$0 instanceof cml ? (cml)$$0 : null;
   }

   @Nullable
   public bsh v() {
      return this.o;
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public zb<abn> dn() {
      bsh $$0 = this.s();
      return new abo(this, $$0 == null ? this.an() : $$0.an());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      if (this.t() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dR().a($$1), $$1);
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
