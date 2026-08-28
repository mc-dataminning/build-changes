import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cqd extends cqh {
   private static final Logger a = LogUtils.getLogger();
   private final bac b = bac.a();
   private boolean c;
   private int d;
   private static final int e = 10;
   private static final aks<Integer> f = akw.a(cqd.class, aku.b);
   private static final aks<Boolean> g = akw.a(cqd.class, aku.k);
   private int h;
   private int i;
   private int j;
   private int k;
   private float l;
   private boolean m = true;
   @Nullable
   private bvb n;
   private cqd.a o = cqd.a.a;
   private final int p;
   private final int q;

   private cqd(bvi<? extends cqd> $$0, dgz $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.p = Math.max(0, $$2);
      this.q = Math.max(0, $$3);
   }

   public cqd(bvi<? extends cqd> $$0, dgz $$1) {
      this($$0, $$1, 0, 0);
   }

   public cqd(cpo $$0, dgz $$1, int $$2, int $$3, cxg $$4) {
      this(bvi.bT, $$1, $$2, $$3);
      this.c($$0);
      float $$5 = $$0.dO();
      float $$6 = $$0.dM();
      float $$7 = azu.b(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = azu.a(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$9 = -azu.b(-$$5 * (float) (Math.PI / 180.0));
      float $$10 = azu.a(-$$5 * (float) (Math.PI / 180.0));
      double $$11 = $$0.dB() - (double)$$8 * 0.3;
      double $$12 = $$0.dF();
      double $$13 = $$0.dH() - (double)$$7 * 0.3;
      this.b($$11, $$12, $$13, $$6, $$5);
      fbr $$14 = new fbr((double)(-$$8), (double)azu.a(-($$10 / $$9), -5.0F, 5.0F), (double)(-$$7));
      double $$15 = $$14.g();
      $$14 = $$14.d(0.6 / $$15 + this.ae.a(0.5, 0.0103365), 0.6 / $$15 + this.ae.a(0.5, 0.0103365), 0.6 / $$15 + this.ae.a(0.5, 0.0103365));
      this.h($$14);
      this.v((float)(azu.d($$14.d, $$14.f) * 180.0F / (float)Math.PI));
      this.w((float)(azu.d($$14.e, $$14.i()) * 180.0F / (float)Math.PI));
      this.N = this.dM();
      this.O = this.dO();
   }

   @Override
   protected void a(akw.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, false);
   }

   @Override
   protected boolean C() {
      return true;
   }

   @Override
   public void a(aks<?> $$0) {
      if (f.equals($$0)) {
         int $$1 = this.au().a(f);
         this.n = $$1 > 0 ? this.dW().a($$1 - 1) : null;
      }

      if (g.equals($$0)) {
         this.c = this.au().a(g);
         if (this.c) {
            this.n(this.dz().d, (double)(-0.4F * azu.a(this.b, 0.6F, 1.0F)), this.dz().f);
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
   public void h() {
      this.b.b(this.cG().getLeastSignificantBits() ^ this.dW().ad());
      super.h();
      cpo $$0 = this.m();
      if ($$0 == null) {
         this.at();
      } else if (this.dW().C || !this.a($$0)) {
         if (this.aJ()) {
            this.h++;
            if (this.h >= 1200) {
               this.at();
               return;
            }
         } else {
            this.h = 0;
         }

         float $$1 = 0.0F;
         jh $$2 = this.dw();
         etq $$3 = this.dW().b_($$2);
         if ($$3.a(axq.a)) {
            $$1 = $$3.a(this.dW(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.o == cqd.a.a) {
            if (this.n != null) {
               this.h(fbr.c);
               this.o = cqd.a.b;
               return;
            }

            if ($$4) {
               this.h(this.dz().d(0.3, 0.2, 0.3));
               this.o = cqd.a.c;
               return;
            }

            this.t();
         } else {
            if (this.o == cqd.a.b) {
               if (this.n != null) {
                  if (!this.n.dR() && this.n.dW().ai() == this.dW().ai()) {
                     this.a_(this.n.dB(), this.n.e(0.8), this.n.dH());
                  } else {
                     this.B(null);
                     this.o = cqd.a.a;
                  }
               }

               return;
            }

            if (this.o == cqd.a.c) {
               fbr $$5 = this.dz();
               double $$6 = this.dD() + $$5.e - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.n($$5.d * 0.9, $$5.e - $$6 * (double)this.ae.i() * 0.2, $$5.f * 0.9);
               if (this.i <= 0 && this.k <= 0) {
                  this.m = true;
               } else {
                  this.m = this.m && this.d < 10 && this.b($$2);
               }

               if ($$4) {
                  this.d = Math.max(0, this.d - 1);
                  if (this.c) {
                     this.h(this.dz().b(0.0, -0.1 * (double)this.b.i() * (double)this.b.i(), 0.0));
                  }

                  if (!this.dW().C) {
                     this.a($$2);
                  }
               } else {
                  this.d = Math.min(10, this.d + 1);
               }
            }
         }

         if (!$$3.a(axq.a)) {
            this.h(this.dz().b(0.0, -0.03, 0.0));
         }

         this.a(bwb.a, this.dz());
         this.aK();
         this.F();
         if (this.o == cqd.a.a && (this.aJ() || this.P)) {
            this.h(fbr.c);
         }

         double $$7 = 0.92;
         this.h(this.dz().c(0.92));
         this.ay();
      }
   }

   private boolean a(cpo $$0) {
      cxg $$1 = $$0.eZ();
      cxg $$2 = $$0.fa();
      boolean $$3 = $$1.a(cxk.rS);
      boolean $$4 = $$2.a(cxk.rS);
      if (!$$0.dR() && $$0.bL() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.at();
         return true;
      }
   }

   private void t() {
      fbp $$0 = cqj.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bvb $$0) {
      return super.b($$0) || $$0.bL() && $$0 instanceof cls;
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(fbn $$0) {
      super.a($$0);
      this.h(this.dz().d().c($$0.a(this)));
   }

   private void B(@Nullable bvb $$0) {
      this.n = $$0;
      this.au().a(f, $$0 == null ? 0 : $$0.ar() + 1);
   }

   private void a(jh $$0) {
      arx $$1 = (arx)this.dW();
      int $$2 = 1;
      jh $$3 = $$0.d();
      if (this.ae.i() < 0.25F && this.dW().r($$3)) {
         $$2++;
      }

      if (this.ae.i() < 0.5F && !this.dW().h($$3)) {
         $$2--;
      }

      if (this.i > 0) {
         this.i--;
         if (this.i <= 0) {
            this.j = 0;
            this.k = 0;
            this.au().a(g, false);
         }
      } else if (this.k > 0) {
         this.k -= $$2;
         if (this.k > 0) {
            this.l = this.l + (float)this.ae.a(0.0, 9.188);
            float $$4 = this.l * (float) (Math.PI / 180.0);
            float $$5 = azu.a($$4);
            float $$6 = azu.b($$4);
            double $$7 = this.dB() + (double)($$5 * (float)this.k * 0.1F);
            double $$8 = (double)((float)azu.a(this.dD()) + 1.0F);
            double $$9 = this.dH() + (double)($$6 * (float)this.k * 0.1F);
            dxo $$10 = $$1.a_(jh.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dkf.J)) {
               if (this.ae.i() < 0.15F) {
                  $$1.a(ls.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(ls.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(ls.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awv.jx, 0.25F, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
            double $$13 = this.dD() + 0.5;
            $$1.a(ls.d, this.dB(), $$13, this.dH(), (int)(1.0F + this.dr() * 20.0F), (double)this.dr(), 0.0, (double)this.dr(), 0.2F);
            $$1.a(ls.E, this.dB(), $$13, this.dH(), (int)(1.0F + this.dr() * 20.0F), (double)this.dr(), 0.0, (double)this.dr(), 0.2F);
            this.i = azu.a(this.ae, 20, 40);
            this.au().a(g, true);
         }
      } else if (this.j > 0) {
         this.j -= $$2;
         float $$14 = 0.15F;
         if (this.j < 20) {
            $$14 += (float)(20 - this.j) * 0.05F;
         } else if (this.j < 40) {
            $$14 += (float)(40 - this.j) * 0.02F;
         } else if (this.j < 60) {
            $$14 += (float)(60 - this.j) * 0.01F;
         }

         if (this.ae.i() < $$14) {
            float $$15 = azu.a(this.ae, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = azu.a(this.ae, 25.0F, 60.0F);
            double $$17 = this.dB() + (double)(azu.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)azu.a(this.dD()) + 1.0F);
            double $$19 = this.dH() + (double)(azu.b($$15) * $$16) * 0.1;
            dxo $$20 = $$1.a_(jh.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dkf.J)) {
               $$1.a(ls.ao, $$17, $$18, $$19, 2 + this.ae.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.j <= 0) {
            this.l = azu.a(this.ae, 0.0F, 360.0F);
            this.k = azu.a(this.ae, 20, 80);
         }
      } else {
         this.j = azu.a(this.ae, 100, 600);
         this.j = this.j - this.q;
      }
   }

   private boolean b(jh $$0) {
      cqd.b $$1 = cqd.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cqd.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cqd.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cqd.b.a) {
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

   private cqd.b a(jh $$0, jh $$1) {
      return jh.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cqd.b.c).orElse(cqd.b.c);
   }

   private cqd.b c(jh $$0) {
      dxo $$1 = this.dW().a_($$0);
      if (!$$1.l() && !$$1.a(dkf.fB)) {
         etq $$2 = $$1.y();
         return $$2.a(axq.a) && $$2.b() && $$1.g(this.dW(), $$0).c() ? cqd.b.b : cqd.b.c;
      } else {
         return cqd.b.a;
      }
   }

   public boolean l() {
      return this.m;
   }

   @Override
   public void b(um $$0) {
   }

   @Override
   public void a(um $$0) {
   }

   public int a(cxg $$0) {
      cpo $$1 = this.m();
      if (!this.dW().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.n != null) {
            this.d(this.n);
            ao.E.a((ary)$$1, $$0, this, Collections.emptyList());
            this.dW().a(this, (byte)31);
            $$2 = this.n instanceof cls ? 3 : 5;
         } else if (this.i > 0) {
            ewl $$3 = new ewl.a((arx)this.dW()).a(ezc.f, this.du()).a(ezc.i, $$0).a(ezc.a, this).a((float)this.p + $$1.gF()).a(ezb.f);
            ewn $$4 = this.dW().p().bc().b(ewe.am);
            List<cxg> $$5 = $$4.a($$3);
            ao.E.a((ary)$$1, $$0, this, $$5);

            for (cxg $$6 : $$5) {
               cls $$7 = new cls(this.dW(), this.dB(), this.dD(), this.dH(), $$6);
               double $$8 = $$1.dB() - this.dB();
               double $$9 = $$1.dD() - this.dD();
               double $$10 = $$1.dH() - this.dH();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dW().b($$7);
               $$1.dW().b(new bvn($$1.dW(), $$1.dB(), $$1.dD() + 0.5, $$1.dH() + 0.5, this.ae.a(6) + 1));
               if ($$6.a(axt.aV)) {
                  $$1.a(axf.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aJ()) {
            $$2 = 2;
         }

         this.at();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dW().C && this.n instanceof cpo && ((cpo)this.n).c()) {
         this.d(this.n);
      }

      super.b($$0);
   }

   protected void d(bvb $$0) {
      bvb $$1 = this.p();
      if ($$1 != null) {
         fbr $$2 = new fbr($$1.dB() - this.dB(), $$1.dD() - this.dD(), $$1.dH() - this.dH()).c(0.1);
         $$0.h($$0.dz().e($$2));
      }
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.a;
   }

   @Override
   public void a(bvb.d $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void av() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bvb $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cqd $$0) {
      cpo $$1 = this.m();
      if ($$1 != null) {
         $$1.cv = $$0;
      }
   }

   @Nullable
   public cpo m() {
      bvb $$0 = this.p();
      return $$0 instanceof cpo ? (cpo)$$0 : null;
   }

   @Nullable
   public bvb s() {
      return this.n;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public zr<acg> a(arv $$0) {
      bvb $$1 = this.p();
      return new ach(this, $$0, $$1 == null ? this.ar() : $$1.ar());
   }

   @Override
   public void a(ach $$0) {
      super.a($$0);
      if (this.m() == null) {
         int $$1 = $$0.p();
         a.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dW().a($$1), $$1);
         this.at();
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
