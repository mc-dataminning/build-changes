import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmy extends cnc {
   private static final Logger b = LogUtils.getLogger();
   private final ayo c = ayo.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final ajp<Integer> g = ajt.a(cmy.class, ajr.b);
   private static final ajp<Boolean> h = ajt.a(cmy.class, ajr.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bsg o;
   private cmy.a p = cmy.a.a;
   private final int q;
   private final int r;

   private cmy(bsm<? extends cmy> $$0, dcf $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.au = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cmy(bsm<? extends cmy> $$0, dcf $$1) {
      this($$0, $$1, 0, 0);
   }

   public cmy(cmk $$0, dcf $$1, int $$2, int $$3) {
      this(bsm.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dI();
      float $$5 = $$0.dG();
      float $$6 = ayg.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ayg.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ayg.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = ayg.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dv() - (double)$$7 * 0.3;
      double $$11 = $$0.dz();
      double $$12 = $$0.dB() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ewf $$13 = new ewf((double)(-$$7), (double)ayg.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365));
      this.i($$13);
      this.s((float)(ayg.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.t((float)(ayg.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.O = this.dG();
      this.P = this.dI();
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.aq().a(g);
         this.o = $$1 > 0 ? this.dQ().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.aq().a(h);
         if (this.d) {
            this.o(this.dt().c, (double)(-0.4F * ayg.a(this.c, 0.6F, 1.0F)), this.dt().e);
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
      this.c.b(this.cA().getLeastSignificantBits() ^ this.dQ().Z());
      super.l();
      cmk $$0 = this.u();
      if ($$0 == null) {
         this.ap();
      } else if (this.dQ().B || !this.a($$0)) {
         if (this.aF()) {
            this.i++;
            if (this.i >= 1200) {
               this.ap();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         ja $$2 = this.dq();
         eoh $$3 = this.dQ().b_($$2);
         if ($$3.a(awc.a)) {
            $$1 = $$3.a((dbl)this.dQ(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cmy.a.a) {
            if (this.o != null) {
               this.i(ewf.b);
               this.p = cmy.a.b;
               return;
            }

            if ($$4) {
               this.i(this.dt().d(0.3, 0.2, 0.3));
               this.p = cmy.a.c;
               return;
            }

            this.w();
         } else {
            if (this.p == cmy.a.b) {
               if (this.o != null) {
                  if (!this.o.dL() && this.o.dQ().af() == this.dQ().af()) {
                     this.a_(this.o.dv(), this.o.e(0.8), this.o.dB());
                  } else {
                     this.A(null);
                     this.p = cmy.a.a;
                  }
               }

               return;
            }

            if (this.p == cmy.a.c) {
               ewf $$5 = this.dt();
               double $$6 = this.dx() + $$5.d - (double)$$2.v() - (double)$$1;
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
                     this.i(this.dt().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dQ().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(awc.a)) {
            this.i(this.dt().b(0.0, -0.03, 0.0));
         }

         this.a(btg.a, this.dt());
         this.J();
         if (this.p == cmy.a.a && (this.aF() || this.Q)) {
            this.i(ewf.b);
         }

         double $$7 = 0.92;
         this.i(this.dt().a(0.92));
         this.au();
      }
   }

   private boolean a(cmk $$0) {
      cuc $$1 = $$0.eU();
      cuc $$2 = $$0.eV();
      boolean $$3 = $$1.a(cuf.qV);
      boolean $$4 = $$2.a(cuf.qV);
      if (!$$0.dL() && $$0.bE() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.ap();
         return true;
      }
   }

   private void w() {
      ewd $$0 = cne.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bsg $$0) {
      return super.b($$0) || $$0.bE() && $$0 instanceof ciu;
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ewb $$0) {
      super.a($$0);
      this.i(this.dt().d().a($$0.a(this)));
   }

   private void A(@Nullable bsg $$0) {
      this.o = $$0;
      this.aq().a(g, $$0 == null ? 0 : $$0.am() + 1);
   }

   private void a(ja $$0) {
      aqm $$1 = (aqm)this.dQ();
      int $$2 = 1;
      ja $$3 = $$0.c();
      if (this.ah.i() < 0.25F && this.dQ().r($$3)) {
         $$2++;
      }

      if (this.ah.i() < 0.5F && !this.dQ().h($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.aq().a(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ah.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = ayg.a($$4);
            float $$6 = ayg.b($$4);
            double $$7 = this.dv() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)ayg.a(this.dx()) + 1.0F);
            double $$9 = this.dB() + (double)($$6 * (float)this.l * 0.1F);
            dsk $$10 = $$1.a_(ja.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dfj.G)) {
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
            double $$13 = this.dx() + 0.5;
            $$1.a(lj.d, this.dv(), $$13, this.dB(), (int)(1.0F + this.dk() * 20.0F), (double)this.dk(), 0.0, (double)this.dk(), 0.2F);
            $$1.a(lj.E, this.dv(), $$13, this.dB(), (int)(1.0F + this.dk() * 20.0F), (double)this.dk(), 0.0, (double)this.dk(), 0.2F);
            this.j = ayg.a(this.ah, 20, 40);
            this.aq().a(h, true);
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
            double $$17 = this.dv() + (double)(ayg.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)ayg.a(this.dx()) + 1.0F);
            double $$19 = this.dB() + (double)(ayg.b($$15) * $$16) * 0.1;
            dsk $$20 = $$1.a_(ja.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dfj.G)) {
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
      cmy.b $$1 = cmy.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cmy.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cmy.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cmy.b.a) {
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

   private cmy.b a(ja $$0, ja $$1) {
      return ja.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cmy.b.c).orElse(cmy.b.c);
   }

   private cmy.b c(ja $$0) {
      dsk $$1 = this.dQ().a_($$0);
      if (!$$1.i() && !$$1.a(dfj.fm)) {
         eoh $$2 = $$1.u();
         return $$2.a(awc.a) && $$2.b() && $$1.k(this.dQ(), $$0).c() ? cmy.b.b : cmy.b.c;
      } else {
         return cmy.b.a;
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

   public int a(cuc $$0) {
      cmk $$1 = this.u();
      if (!this.dQ().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.d(this.o);
            am.E.a((aqn)$$1, $$0, this, Collections.emptyList());
            this.dQ().a(this, (byte)31);
            $$2 = this.o instanceof ciu ? 3 : 5;
         } else if (this.j > 0) {
            eqx $$3 = new eqx.a((aqm)this.dQ()).a(etq.f, this.do()).a(etq.i, $$0).a(etq.a, this).a((float)this.q + $$1.gv()).a(etp.f);
            eqz $$4 = this.dQ().o().bf().b(eqq.aC);
            List<cuc> $$5 = $$4.a($$3);
            am.E.a((aqn)$$1, $$0, this, $$5);

            for (cuc $$6 : $$5) {
               ciu $$7 = new ciu(this.dQ(), this.dv(), this.dx(), this.dB(), $$6);
               double $$8 = $$1.dv() - this.dv();
               double $$9 = $$1.dx() - this.dx();
               double $$10 = $$1.dB() - this.dB();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dQ().b($$7);
               $$1.dQ().b(new bsr($$1.dQ(), $$1.dv(), $$1.dx() + 0.5, $$1.dB() + 0.5, this.ah.a(6) + 1));
               if ($$6.a(awf.aP)) {
                  $$1.a(avr.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aF()) {
            $$2 = 2;
         }

         this.ap();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dQ().B && this.o instanceof cmk && ((cmk)this.o).g()) {
         this.d(this.o);
      }

      super.b($$0);
   }

   protected void d(bsg $$0) {
      bsg $$1 = this.s();
      if ($$1 != null) {
         ewf $$2 = new ewf($$1.dv() - this.dv(), $$1.dx() - this.dx(), $$1.dB() - this.dB()).a(0.1);
         $$0.i($$0.dt().e($$2));
      }
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.a;
   }

   @Override
   public void a(bsg.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ar() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bsg $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cmy $$0) {
      cmk $$1 = this.u();
      if ($$1 != null) {
         $$1.cv = $$0;
      }
   }

   @Nullable
   public cmk u() {
      bsg $$0 = this.s();
      return $$0 instanceof cmk ? (cmk)$$0 : null;
   }

   @Nullable
   public bsg v() {
      return this.o;
   }

   @Override
   public boolean cx() {
      return false;
   }

   @Override
   public zb<abn> dm() {
      bsg $$0 = this.s();
      return new abo(this, $$0 == null ? this.am() : $$0.am());
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      if (this.u() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dQ().a($$1), $$1);
         this.ao();
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
