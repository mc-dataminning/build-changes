import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clv extends clz {
   private static final Logger b = LogUtils.getLogger();
   private final ayg c = ayg.a();
   private boolean d;
   private int e;
   private static final int g = 10;
   private static final ajm<Integer> h = ajq.a(clv.class, ajo.b);
   private static final ajm<Boolean> i = ajq.a(clv.class, ajo.k);
   private int j;
   private int k;
   private int l;
   private int m;
   private float n;
   private boolean o = true;
   @Nullable
   private brh p;
   private clv.a q = clv.a.a;
   private final int r;
   private final int s;

   private clv(brn<? extends clv> $$0, dad $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.au = true;
      this.r = Math.max(0, $$2);
      this.s = Math.max(0, $$3);
   }

   public clv(brn<? extends clv> $$0, dad $$1) {
      this($$0, $$1, 0, 0);
   }

   public clv(clh $$0, dad $$1, int $$2, int $$3) {
      this(brn.by, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dF();
      float $$5 = $$0.dD();
      float $$6 = axz.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = axz.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -axz.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = axz.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.ds() - (double)$$7 * 0.3;
      double $$11 = $$0.dw();
      double $$12 = $$0.dy() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      etp $$13 = new etp((double)(-$$7), (double)axz.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365), 0.6 / $$14 + this.ah.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(axz.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(axz.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.O = this.dD();
      this.P = this.dF();
   }

   @Override
   protected void a(ajq.a $$0) {
      $$0.a(h, 0);
      $$0.a(i, false);
   }

   @Override
   public void a(ajm<?> $$0) {
      if (h.equals($$0)) {
         int $$1 = this.an().a(h);
         this.p = $$1 > 0 ? this.dN().a($$1 - 1) : null;
      }

      if (i.equals($$0)) {
         this.d = this.an().a(i);
         if (this.d) {
            this.o(this.dq().c, (double)(-0.4F * axz.a(this.c, 0.6F, 1.0F)), this.dq().e);
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
      this.c.b(this.cx().getLeastSignificantBits() ^ this.dN().Y());
      super.l();
      clh $$0 = this.r();
      if ($$0 == null) {
         this.am();
      } else if (this.dN().B || !this.a($$0)) {
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
         in $$2 = this.dn();
         ema $$3 = this.dN().b_($$2);
         if ($$3.a(avw.a)) {
            $$1 = $$3.a((czj)this.dN(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.q == clv.a.a) {
            if (this.p != null) {
               this.g(etp.b);
               this.q = clv.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dq().d(0.3, 0.2, 0.3));
               this.q = clv.a.c;
               return;
            }

            this.w();
         } else {
            if (this.q == clv.a.b) {
               if (this.p != null) {
                  if (!this.p.dI() && this.p.dN().ae() == this.dN().ae()) {
                     this.a_(this.p.ds(), this.p.e(0.8), this.p.dy());
                  } else {
                     this.A(null);
                     this.q = clv.a.a;
                  }
               }

               return;
            }

            if (this.q == clv.a.c) {
               etp $$5 = this.dq();
               double $$6 = this.du() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.o($$5.c * 0.9, $$5.d - $$6 * (double)this.ah.i() * 0.2, $$5.e * 0.9);
               if (this.k <= 0 && this.m <= 0) {
                  this.o = true;
               } else {
                  this.o = this.o && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.g(this.dq().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dN().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(avw.a)) {
            this.g(this.dq().b(0.0, -0.03, 0.0));
         }

         this.a(bsf.a, this.dq());
         this.J();
         if (this.q == clv.a.a && (this.aC() || this.Q)) {
            this.g(etp.b);
         }

         double $$7 = 0.92;
         this.g(this.dq().a(0.92));
         this.ar();
      }
   }

   private boolean a(clh $$0) {
      csz $$1 = $$0.eV();
      csz $$2 = $$0.eW();
      boolean $$3 = $$1.a(ctc.qV);
      boolean $$4 = $$2.a(ctc.qV);
      if (!$$0.dI() && $$0.bB() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void w() {
      etn $$0 = cmb.a(this, this::b);
      this.a($$0);
   }

   @Override
   protected boolean b(brh $$0) {
      return super.b($$0) || $$0.bB() && $$0 instanceof chr;
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(etl $$0) {
      super.a($$0);
      this.g(this.dq().d().a($$0.a(this)));
   }

   private void A(@Nullable brh $$0) {
      this.p = $$0;
      this.an().a(h, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(in $$0) {
      aqh $$1 = (aqh)this.dN();
      int $$2 = 1;
      in $$3 = $$0.c();
      if (this.ah.i() < 0.25F && this.dN().r($$3)) {
         $$2++;
      }

      if (this.ah.i() < 0.5F && !this.dN().h($$3)) {
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
            this.n = this.n + (float)this.ah.a(0.0, 9.188);
            float $$4 = this.n * (float) (Math.PI / 180.0);
            float $$5 = axz.a($$4);
            float $$6 = axz.b($$4);
            double $$7 = this.ds() + (double)($$5 * (float)this.m * 0.1F);
            double $$8 = (double)((float)axz.a(this.du()) + 1.0F);
            double $$9 = this.dy() + (double)($$6 * (float)this.m * 0.1F);
            dqh $$10 = $$1.a_(in.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(ddg.G)) {
               if (this.ah.i() < 0.15F) {
                  $$1.a(kx.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(kx.D, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(kx.D, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(avc.iS, 0.25F, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
            double $$13 = this.du() + 0.5;
            $$1.a(kx.d, this.ds(), $$13, this.dy(), (int)(1.0F + this.dh() * 20.0F), (double)this.dh(), 0.0, (double)this.dh(), 0.2F);
            $$1.a(kx.D, this.ds(), $$13, this.dy(), (int)(1.0F + this.dh() * 20.0F), (double)this.dh(), 0.0, (double)this.dh(), 0.2F);
            this.k = axz.a(this.ah, 20, 40);
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

         if (this.ah.i() < $$14) {
            float $$15 = axz.a(this.ah, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = axz.a(this.ah, 25.0F, 60.0F);
            double $$17 = this.ds() + (double)(axz.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)axz.a(this.du()) + 1.0F);
            double $$19 = this.dy() + (double)(axz.b($$15) * $$16) * 0.1;
            dqh $$20 = $$1.a_(in.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(ddg.G)) {
               $$1.a(kx.aj, $$17, $$18, $$19, 2 + this.ah.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.l <= 0) {
            this.n = axz.a(this.ah, 0.0F, 360.0F);
            this.m = axz.a(this.ah, 20, 80);
         }
      } else {
         this.l = axz.a(this.ah, 100, 600);
         this.l = this.l - this.s * 20 * 5;
      }
   }

   private boolean b(in $$0) {
      clv.b $$1 = clv.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         clv.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == clv.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == clv.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private clv.b a(in $$0, in $$1) {
      return in.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : clv.b.c).orElse(clv.b.c);
   }

   private clv.b c(in $$0) {
      dqh $$1 = this.dN().a_($$0);
      if (!$$1.i() && !$$1.a(ddg.fm)) {
         ema $$2 = $$1.u();
         return $$2.a(avw.a) && $$2.b() && $$1.k(this.dN(), $$0).c() ? clv.b.b : clv.b.c;
      } else {
         return clv.b.a;
      }
   }

   public boolean p() {
      return this.o;
   }

   @Override
   public void b(ua $$0) {
   }

   @Override
   public void a(ua $$0) {
   }

   public int a(csz $$0) {
      clh $$1 = this.r();
      if (!this.dN().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.p != null) {
            this.d(this.p);
            am.E.a((aqi)$$1, $$0, this, Collections.emptyList());
            this.dN().a(this, (byte)31);
            $$2 = this.p instanceof chr ? 3 : 5;
         } else if (this.k > 0) {
            eoo $$3 = new eoo.a((aqh)this.dN()).a(erc.f, this.dl()).a(erc.i, $$0).a(erc.a, this).a((float)this.r + $$1.gw()).a(erb.f);
            eoq $$4 = this.dN().o().be().b(eoj.av);
            List<csz> $$5 = $$4.a($$3);
            am.E.a((aqi)$$1, $$0, this, $$5);

            for (csz $$6 : $$5) {
               chr $$7 = new chr(this.dN(), this.ds(), this.du(), this.dy(), $$6);
               double $$8 = $$1.ds() - this.ds();
               double $$9 = $$1.du() - this.du();
               double $$10 = $$1.dy() - this.dy();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dN().b($$7);
               $$1.dN().b(new brq($$1.dN(), $$1.ds(), $$1.du() + 0.5, $$1.dy() + 0.5, this.ah.a(6) + 1));
               if ($$6.a(avz.aP)) {
                  $$1.a(avm.R, 1);
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
      if ($$0 == 31 && this.dN().B && this.p instanceof clh && ((clh)this.p).g()) {
         this.d(this.p);
      }

      super.b($$0);
   }

   protected void d(brh $$0) {
      brh $$1 = this.u();
      if ($$1 != null) {
         etp $$2 = new etp($$1.ds() - this.ds(), $$1.du() - this.du(), $$1.dy() - this.dy()).a(0.1);
         $$0.g($$0.dq().e($$2));
      }
   }

   @Override
   protected brh.b aZ() {
      return brh.b.a;
   }

   @Override
   public void a(brh.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void c(@Nullable brh $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable clv $$0) {
      clh $$1 = this.r();
      if ($$1 != null) {
         $$1.cu = $$0;
      }
   }

   @Nullable
   public clh r() {
      brh $$0 = this.u();
      return $$0 instanceof clh ? (clh)$$0 : null;
   }

   @Nullable
   public brh v() {
      return this.p;
   }

   @Override
   public boolean cu() {
      return false;
   }

   @Override
   public zb<abm> dj() {
      brh $$0 = this.u();
      return new abn(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(abn $$0) {
      super.a($$0);
      if (this.r() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dN().a($$1), $$1);
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
