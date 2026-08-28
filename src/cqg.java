import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cqg extends cqk {
   private static final Logger a = LogUtils.getLogger();
   private final azh b = azh.a();
   private boolean c;
   private int d;
   private static final int e = 10;
   private static final ajx<Integer> f = akb.a(cqg.class, ajz.b);
   private static final ajx<Boolean> g = akb.a(cqg.class, ajz.k);
   private int h;
   private int i;
   private int j;
   private int k;
   private float l;
   private boolean m = true;
   @Nullable
   private bva n;
   private cqg.a o = cqg.a.a;
   private final int p;
   private final int q;

   private cqg(bvi<? extends cqg> $$0, dgz $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.p = Math.max(0, $$2);
      this.q = Math.max(0, $$3);
   }

   public cqg(bvi<? extends cqg> $$0, dgz $$1) {
      this($$0, $$1, 0, 0);
   }

   public cqg(cpr $$0, dgz $$1, int $$2, int $$3) {
      this(bvi.bS, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dM();
      float $$5 = $$0.dK();
      float $$6 = ayz.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ayz.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ayz.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = ayz.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dz() - (double)$$7 * 0.3;
      double $$11 = $$0.dD();
      double $$12 = $$0.dF() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      fbx $$13 = new fbx((double)(-$$7), (double)ayz.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.g();
      $$13 = $$13.d(0.6 / $$14 + this.ae.a(0.5, 0.0103365), 0.6 / $$14 + this.ae.a(0.5, 0.0103365), 0.6 / $$14 + this.ae.a(0.5, 0.0103365));
      this.i($$13);
      this.w((float)(ayz.d($$13.d, $$13.f) * 180.0F / (float)Math.PI));
      this.x((float)(ayz.d($$13.e, $$13.i()) * 180.0F / (float)Math.PI));
      this.N = this.dK();
      this.O = this.dM();
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(f, 0);
      $$0.a(g, false);
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   public void a(ajx<?> $$0) {
      if (f.equals($$0)) {
         int $$1 = this.au().a(f);
         this.n = $$1 > 0 ? this.dU().a($$1 - 1) : null;
      }

      if (g.equals($$0)) {
         this.c = this.au().a(g);
         if (this.c) {
            this.n(this.dx().d, (double)(-0.4F * ayz.a(this.b, 0.6F, 1.0F)), this.dx().f);
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
   public void h() {
      this.b.b(this.cF().getLeastSignificantBits() ^ this.dU().ae());
      super.h();
      cpr $$0 = this.g();
      if ($$0 == null) {
         this.at();
      } else if (this.dU().C || !this.a($$0)) {
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
         ji $$2 = this.du();
         etw $$3 = this.dU().b_($$2);
         if ($$3.a(awv.a)) {
            $$1 = $$3.a(this.dU(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.o == cqg.a.a) {
            if (this.n != null) {
               this.i(fbx.c);
               this.o = cqg.a.b;
               return;
            }

            if ($$4) {
               this.i(this.dx().d(0.3, 0.2, 0.3));
               this.o = cqg.a.c;
               return;
            }

            this.m();
         } else {
            if (this.o == cqg.a.b) {
               if (this.n != null) {
                  if (!this.n.dP() && this.n.dU().aj() == this.dU().aj()) {
                     this.a_(this.n.dz(), this.n.e(0.8), this.n.dF());
                  } else {
                     this.B(null);
                     this.o = cqg.a.a;
                  }
               }

               return;
            }

            if (this.o == cqg.a.c) {
               fbx $$5 = this.dx();
               double $$6 = this.dB() + $$5.e - (double)$$2.v() - (double)$$1;
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
                     this.i(this.dx().b(0.0, -0.1 * (double)this.b.i() * (double)this.b.i(), 0.0));
                  }

                  if (!this.dU().C) {
                     this.a($$2);
                  }
               } else {
                  this.d = Math.min(10, this.d + 1);
               }
            }
         }

         if (!$$3.a(awv.a)) {
            this.i(this.dx().b(0.0, -0.03, 0.0));
         }

         this.a(bwc.a, this.dx());
         this.aK();
         this.A();
         if (this.o == cqg.a.a && (this.aJ() || this.P)) {
            this.i(fbx.c);
         }

         double $$7 = 0.92;
         this.i(this.dx().c(0.92));
         this.ay();
      }
   }

   private boolean a(cpr $$0) {
      cxh $$1 = $$0.eZ();
      cxh $$2 = $$0.fa();
      boolean $$3 = $$1.a(cxl.rU);
      boolean $$4 = $$2.a(cxl.rU);
      if (!$$0.dP() && $$0.bJ() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.at();
         return true;
      }
   }

   private void m() {
      fbv $$0 = cqm.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bva $$0) {
      return super.b($$0) || $$0.bJ() && $$0 instanceof clw;
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      this.i(this.dx().d().c($$0.a(this)));
   }

   private void B(@Nullable bva $$0) {
      this.n = $$0;
      this.au().a(f, $$0 == null ? 0 : $$0.ar() + 1);
   }

   private void a(ji $$0) {
      ard $$1 = (ard)this.dU();
      int $$2 = 1;
      ji $$3 = $$0.d();
      if (this.ae.i() < 0.25F && this.dU().r($$3)) {
         $$2++;
      }

      if (this.ae.i() < 0.5F && !this.dU().h($$3)) {
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
            float $$5 = ayz.a($$4);
            float $$6 = ayz.b($$4);
            double $$7 = this.dz() + (double)($$5 * (float)this.k * 0.1F);
            double $$8 = (double)((float)ayz.a(this.dB()) + 1.0F);
            double $$9 = this.dF() + (double)($$6 * (float)this.k * 0.1F);
            dxq $$10 = $$1.a_(ji.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dkg.J)) {
               if (this.ae.i() < 0.15F) {
                  $$1.a(lt.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(lt.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(lt.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awa.jx, 0.25F, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
            double $$13 = this.dB() + 0.5;
            $$1.a(lt.d, this.dz(), $$13, this.dF(), (int)(1.0F + this.dp() * 20.0F), (double)this.dp(), 0.0, (double)this.dp(), 0.2F);
            $$1.a(lt.E, this.dz(), $$13, this.dF(), (int)(1.0F + this.dp() * 20.0F), (double)this.dp(), 0.0, (double)this.dp(), 0.2F);
            this.i = ayz.a(this.ae, 20, 40);
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
            float $$15 = ayz.a(this.ae, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = ayz.a(this.ae, 25.0F, 60.0F);
            double $$17 = this.dz() + (double)(ayz.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)ayz.a(this.dB()) + 1.0F);
            double $$19 = this.dF() + (double)(ayz.b($$15) * $$16) * 0.1;
            dxq $$20 = $$1.a_(ji.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dkg.J)) {
               $$1.a(lt.ap, $$17, $$18, $$19, 2 + this.ae.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.j <= 0) {
            this.l = ayz.a(this.ae, 0.0F, 360.0F);
            this.k = ayz.a(this.ae, 20, 80);
         }
      } else {
         this.j = ayz.a(this.ae, 100, 600);
         this.j = this.j - this.q;
      }
   }

   private boolean b(ji $$0) {
      cqg.b $$1 = cqg.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cqg.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cqg.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cqg.b.a) {
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

   private cqg.b a(ji $$0, ji $$1) {
      return ji.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cqg.b.c).orElse(cqg.b.c);
   }

   private cqg.b c(ji $$0) {
      dxq $$1 = this.dU().a_($$0);
      if (!$$1.l() && !$$1.a(dkg.fB)) {
         etw $$2 = $$1.y();
         return $$2.a(awv.a) && $$2.b() && $$1.g(this.dU(), $$0).c() ? cqg.b.b : cqg.b.c;
      } else {
         return cqg.b.a;
      }
   }

   public boolean f() {
      return this.m;
   }

   @Override
   public void b(tq $$0) {
   }

   @Override
   public void a(tq $$0) {
   }

   public int a(cxh $$0) {
      cpr $$1 = this.g();
      if (!this.dU().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.n != null) {
            this.d(this.n);
            ap.E.a((are)$$1, $$0, this, Collections.emptyList());
            this.dU().a(this, (byte)31);
            $$2 = this.n instanceof clw ? 3 : 5;
         } else if (this.i > 0) {
            ewr $$3 = new ewr.a((ard)this.dU()).a(ezi.f, this.ds()).a(ezi.i, $$0).a(ezi.a, this).a((float)this.p + $$1.ef()).a(ezh.f);
            ewt $$4 = this.dU().p().bc().b(ewk.am);
            List<cxh> $$5 = $$4.a($$3);
            ap.E.a((are)$$1, $$0, this, $$5);

            for (cxh $$6 : $$5) {
               clw $$7 = new clw(this.dU(), this.dz(), this.dB(), this.dF(), $$6);
               double $$8 = $$1.dz() - this.dz();
               double $$9 = $$1.dB() - this.dB();
               double $$10 = $$1.dF() - this.dF();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dU().b($$7);
               $$1.dU().b(new bvn($$1.dU(), $$1.dz(), $$1.dB() + 0.5, $$1.dF() + 0.5, this.ae.a(6) + 1));
               if ($$6.a(awy.aT)) {
                  $$1.a(awk.R, 1);
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
      if ($$0 == 31 && this.dU().C && this.n instanceof cpr $$1 && $$1.gj()) {
         this.d(this.n);
      }

      super.b($$0);
   }

   protected void d(bva $$0) {
      bva $$1 = this.q();
      if ($$1 != null) {
         fbx $$2 = new fbx($$1.dz() - this.dz(), $$1.dB() - this.dB(), $$1.dF() - this.dF()).c(0.1);
         $$0.i($$0.dx().e($$2));
      }
   }

   @Override
   protected bva.c bg() {
      return bva.c.a;
   }

   @Override
   public void a(bva.d $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void av() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bva $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cqg $$0) {
      cpr $$1 = this.g();
      if ($$1 != null) {
         $$1.cj = $$0;
      }
   }

   @Nullable
   public cpr g() {
      return this.q() instanceof cpr $$1 ? $$1 : null;
   }

   @Nullable
   public bva j() {
      return this.n;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public yw<abl> a(arb $$0) {
      bva $$1 = this.q();
      return new abm(this, $$0, $$1 == null ? this.ar() : $$1.ar());
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      if (this.g() == null) {
         int $$1 = $$0.p();
         a.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dU().a($$1), $$1);
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
