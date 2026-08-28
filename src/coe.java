import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class coe extends coi {
   private static final Logger b = LogUtils.getLogger();
   private final azk c = azk.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final akg<Integer> g = akk.a(coe.class, aki.b);
   private static final akg<Boolean> h = akk.a(coe.class, aki.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private btj o;
   private coe.a p = coe.a.a;
   private final int q;
   private final int r;

   private coe(btq<? extends coe> $$0, dds $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public coe(btq<? extends coe> $$0, dds $$1) {
      this($$0, $$1, 0, 0);
   }

   public coe(cnp $$0, dds $$1, int $$2, int $$3, cvl $$4) {
      this(btq.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$5 = $$0.dK();
      float $$6 = $$0.dI();
      float $$7 = azc.b(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = azc.a(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$9 = -azc.b(-$$5 * (float) (Math.PI / 180.0));
      float $$10 = azc.a(-$$5 * (float) (Math.PI / 180.0));
      double $$11 = $$0.dx() - (double)$$8 * 0.3;
      double $$12 = $$0.dB();
      double $$13 = $$0.dD() - (double)$$7 * 0.3;
      this.b($$11, $$12, $$13, $$6, $$5);
      eye $$14 = new eye((double)(-$$8), (double)azc.a(-($$10 / $$9), -5.0F, 5.0F), (double)(-$$7));
      double $$15 = $$14.g();
      $$14 = $$14.d(0.6 / $$15 + this.af.a(0.5, 0.0103365), 0.6 / $$15 + this.af.a(0.5, 0.0103365), 0.6 / $$15 + this.af.a(0.5, 0.0103365));
      this.h($$14);
      this.v((float)(azc.d($$14.d, $$14.f) * 180.0F / (float)Math.PI));
      this.w((float)(azc.d($$14.e, $$14.i()) * 180.0F / (float)Math.PI));
      this.O = this.dI();
      this.P = this.dK();
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   public void a(akg<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.at().a(g);
         this.o = $$1 > 0 ? this.dS().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.at().a(h);
         if (this.d) {
            this.n(this.dv().d, (double)(-0.4F * azc.a(this.c, 0.6F, 1.0F)), this.dv().f);
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
      this.c.b(this.cD().getLeastSignificantBits() ^ this.dS().aa());
      super.l();
      cnp $$0 = this.o();
      if ($$0 == null) {
         this.as();
      } else if (this.dS().B || !this.a($$0)) {
         if (this.aH()) {
            this.i++;
            if (this.i >= 1200) {
               this.as();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         je $$2 = this.ds();
         eqb $$3 = this.dS().b_($$2);
         if ($$3.a(awy.a)) {
            $$1 = $$3.a(this.dS(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == coe.a.a) {
            if (this.o != null) {
               this.h(eye.c);
               this.p = coe.a.b;
               return;
            }

            if ($$4) {
               this.h(this.dv().d(0.3, 0.2, 0.3));
               this.p = coe.a.c;
               return;
            }

            this.t();
         } else {
            if (this.p == coe.a.b) {
               if (this.o != null) {
                  if (!this.o.dN() && this.o.dS().ag() == this.dS().ag()) {
                     this.a_(this.o.dx(), this.o.e(0.8), this.o.dD());
                  } else {
                     this.B(null);
                     this.p = coe.a.a;
                  }
               }

               return;
            }

            if (this.p == coe.a.c) {
               eye $$5 = this.dv();
               double $$6 = this.dz() + $$5.e - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.n($$5.d * 0.9, $$5.e - $$6 * (double)this.af.i() * 0.2, $$5.f * 0.9);
               if (this.j <= 0 && this.l <= 0) {
                  this.n = true;
               } else {
                  this.n = this.n && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.h(this.dv().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dS().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(awy.a)) {
            this.h(this.dv().b(0.0, -0.03, 0.0));
         }

         this.a(buj.a, this.dv());
         if (!this.dS().w_()) {
            this.aI();
         }

         this.F();
         if (this.p == coe.a.a && (this.aH() || this.Q)) {
            this.h(eye.c);
         }

         double $$7 = 0.92;
         this.h(this.dv().c(0.92));
         this.ax();
      }
   }

   private boolean a(cnp $$0) {
      cvl $$1 = $$0.eW();
      cvl $$2 = $$0.eX();
      boolean $$3 = $$1.a(cvo.qW);
      boolean $$4 = $$2.a(cvo.qW);
      if (!$$0.dN() && $$0.bI() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.as();
         return true;
      }
   }

   private void t() {
      eyc $$0 = cok.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(btj $$0) {
      return super.b($$0) || $$0.bI() && $$0 instanceof cjz;
   }

   @Override
   protected void a(eyb $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(eya $$0) {
      super.a($$0);
      this.h(this.dv().d().c($$0.a(this)));
   }

   private void B(@Nullable btj $$0) {
      this.o = $$0;
      this.at().a(g, $$0 == null ? 0 : $$0.ap() + 1);
   }

   private void a(je $$0) {
      arg $$1 = (arg)this.dS();
      int $$2 = 1;
      je $$3 = $$0.d();
      if (this.af.i() < 0.25F && this.dS().r($$3)) {
         $$2++;
      }

      if (this.af.i() < 0.5F && !this.dS().h($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.at().a(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.af.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = azc.a($$4);
            float $$6 = azc.b($$4);
            double $$7 = this.dx() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)azc.a(this.dz()) + 1.0F);
            double $$9 = this.dD() + (double)($$6 * (float)this.l * 0.1F);
            dua $$10 = $$1.a_(je.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dgx.G)) {
               if (this.af.i() < 0.15F) {
                  $$1.a(ln.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(ln.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(ln.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awd.iY, 0.25F, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
            double $$13 = this.dz() + 0.5;
            $$1.a(ln.d, this.dx(), $$13, this.dD(), (int)(1.0F + this.dn() * 20.0F), (double)this.dn(), 0.0, (double)this.dn(), 0.2F);
            $$1.a(ln.E, this.dx(), $$13, this.dD(), (int)(1.0F + this.dn() * 20.0F), (double)this.dn(), 0.0, (double)this.dn(), 0.2F);
            this.j = azc.a(this.af, 20, 40);
            this.at().a(h, true);
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
            float $$15 = azc.a(this.af, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = azc.a(this.af, 25.0F, 60.0F);
            double $$17 = this.dx() + (double)(azc.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)azc.a(this.dz()) + 1.0F);
            double $$19 = this.dD() + (double)(azc.b($$15) * $$16) * 0.1;
            dua $$20 = $$1.a_(je.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dgx.G)) {
               $$1.a(ln.am, $$17, $$18, $$19, 2 + this.af.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = azc.a(this.af, 0.0F, 360.0F);
            this.l = azc.a(this.af, 20, 80);
         }
      } else {
         this.k = azc.a(this.af, 100, 600);
         this.k = this.k - this.r;
      }
   }

   private boolean b(je $$0) {
      coe.b $$1 = coe.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         coe.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == coe.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == coe.b.a) {
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

   private coe.b a(je $$0, je $$1) {
      return je.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : coe.b.c).orElse(coe.b.c);
   }

   private coe.b c(je $$0) {
      dua $$1 = this.dS().a_($$0);
      if (!$$1.l() && !$$1.a(dgx.fm)) {
         eqb $$2 = $$1.y();
         return $$2.a(awy.a) && $$2.b() && $$1.g(this.dS(), $$0).c() ? coe.b.b : coe.b.c;
      } else {
         return coe.b.a;
      }
   }

   public boolean m() {
      return this.n;
   }

   @Override
   public void b(uf $$0) {
   }

   @Override
   public void a(uf $$0) {
   }

   public int a(cvl $$0) {
      cnp $$1 = this.o();
      if (!this.dS().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.d(this.o);
            an.E.a((arh)$$1, $$0, this, Collections.emptyList());
            this.dS().a(this, (byte)31);
            $$2 = this.o instanceof cjz ? 3 : 5;
         } else if (this.j > 0) {
            esw $$3 = new esw.a((arg)this.dS()).a(evp.f, this.dq()).a(evp.i, $$0).a(evp.a, this).a((float)this.q + $$1.gy()).a(evo.f);
            esy $$4 = this.dS().o().bd().b(esp.ao);
            List<cvl> $$5 = $$4.a($$3);
            an.E.a((arh)$$1, $$0, this, $$5);

            for (cvl $$6 : $$5) {
               cjz $$7 = new cjz(this.dS(), this.dx(), this.dz(), this.dD(), $$6);
               double $$8 = $$1.dx() - this.dx();
               double $$9 = $$1.dz() - this.dz();
               double $$10 = $$1.dD() - this.dD();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dS().b($$7);
               $$1.dS().b(new btv($$1.dS(), $$1.dx(), $$1.dz() + 0.5, $$1.dD() + 0.5, this.af.a(6) + 1));
               if ($$6.a(axb.aP)) {
                  $$1.a(awn.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aH()) {
            $$2 = 2;
         }

         this.as();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dS().B && this.o instanceof cnp && ((cnp)this.o).g()) {
         this.d(this.o);
      }

      super.b($$0);
   }

   protected void d(btj $$0) {
      btj $$1 = this.s();
      if ($$1 != null) {
         eye $$2 = new eye($$1.dx() - this.dx(), $$1.dz() - this.dz(), $$1.dD() - this.dD()).c(0.1);
         $$0.h($$0.dv().e($$2));
      }
   }

   @Override
   protected btj.b bf() {
      return btj.b.a;
   }

   @Override
   public void a(btj.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void au() {
      this.a(null);
   }

   @Override
   public void c(@Nullable btj $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable coe $$0) {
      cnp $$1 = this.o();
      if ($$1 != null) {
         $$1.cs = $$0;
      }
   }

   @Nullable
   public cnp o() {
      btj $$0 = this.s();
      return $$0 instanceof cnp ? (cnp)$$0 : null;
   }

   @Nullable
   public btj q() {
      return this.o;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public zk<abz> a(arf $$0) {
      btj $$1 = this.s();
      return new aca(this, $$0, $$1 == null ? this.ap() : $$1.ap());
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      if (this.o() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dS().a($$1), $$1);
         this.ar();
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
