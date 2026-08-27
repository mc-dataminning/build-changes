import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cca extends cce {
   private static final Logger b = LogUtils.getLogger();
   private final aru c = aru.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final adz<Integer> g = aec.a(cca.class, aeb.b);
   private static final adz<Boolean> h = aec.a(cca.class, aeb.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bii o;
   private cca.a p = cca.a.a;
   private final int q;
   private final int r;

   private cca(bim<? extends cca> $$0, cpl $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cca(bim<? extends cca> $$0, cpl $$1) {
      this($$0, $$1, 0, 0);
   }

   public cca(cbm $$0, cpl $$1, int $$2, int $$3) {
      this(bim.bu, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dC();
      float $$5 = $$0.dA();
      float $$6 = arp.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = arp.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -arp.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = arp.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dp() - (double)$$7 * 0.3;
      double $$11 = $$0.dt();
      double $$12 = $$0.dv() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ehd $$13 = new ehd((double)(-$$7), (double)arp.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.f($$13);
      this.r((float)(arp.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(arp.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dA();
      this.O = this.dC();
   }

   @Override
   protected void a_() {
      this.al().a(g, 0);
      this.al().a(h, false);
   }

   @Override
   public void a(adz<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.al().b(g);
         this.o = $$1 > 0 ? this.dK().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.al().b(h);
         if (this.d) {
            this.o(this.dn().c, (double)(-0.4F * arp.a(this.c, 0.6F, 1.0F)), this.dn().e);
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
      this.c.b(this.cv().getLeastSignificantBits() ^ this.dK().V());
      super.l();
      cbm $$0 = this.m();
      if ($$0 == null) {
         this.ak();
      } else if (this.dK().B || !this.a($$0)) {
         if (this.aA()) {
            this.i++;
            if (this.i >= 1200) {
               this.ak();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         gu $$2 = this.dk();
         eac $$3 = this.dK().b_($$2);
         if ($$3.a(apq.a)) {
            $$1 = $$3.a((cor)this.dK(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cca.a.a) {
            if (this.o != null) {
               this.f(ehd.b);
               this.p = cca.a.b;
               return;
            }

            if ($$4) {
               this.f(this.dn().d(0.3, 0.2, 0.3));
               this.p = cca.a.c;
               return;
            }

            this.p();
         } else {
            if (this.p == cca.a.b) {
               if (this.o != null) {
                  if (!this.o.dF() && this.o.dK().ac() == this.dK().ac()) {
                     this.e(this.o.dp(), this.o.e(0.8), this.o.dv());
                  } else {
                     this.A(null);
                     this.p = cca.a.a;
                  }
               }

               return;
            }

            if (this.p == cca.a.c) {
               ehd $$5 = this.dn();
               double $$6 = this.dr() + $$5.d - (double)$$2.v() - (double)$$1;
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
                     this.f(this.dn().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dK().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(apq.a)) {
            this.f(this.dn().b(0.0, -0.03, 0.0));
         }

         this.a(bje.a, this.dn());
         this.B();
         if (this.p == cca.a.a && (this.aA() || this.P)) {
            this.f(ehd.b);
         }

         double $$7 = 0.92;
         this.f(this.dn().a(0.92));
         this.ap();
      }
   }

   private boolean a(cbm $$0) {
      cix $$1 = $$0.eR();
      cix $$2 = $$0.eS();
      boolean $$3 = $$1.a(cja.qh);
      boolean $$4 = $$2.a(cja.qh);
      if (!$$0.dF() && $$0.bv() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.ak();
         return true;
      }
   }

   private void p() {
      ehb $$0 = ccf.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(bii $$0) {
      return super.a($$0) || $$0.bv() && $$0 instanceof byf;
   }

   @Override
   protected void a(eha $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(egz $$0) {
      super.a($$0);
      this.f(this.dn().d().a($$0.a(this)));
   }

   private void A(@Nullable bii $$0) {
      this.o = $$0;
      this.al().b(g, $$0 == null ? 0 : $$0.ah() + 1);
   }

   private void a(gu $$0) {
      akk $$1 = (akk)this.dK();
      int $$2 = 1;
      gu $$3 = $$0.c();
      if (this.ag.i() < 0.25F && this.dK().q($$3)) {
         $$2++;
      }

      if (this.ag.i() < 0.5F && !this.dK().g($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.al().b(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ag.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = arp.a($$4);
            float $$6 = arp.b($$4);
            double $$7 = this.dp() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)arp.a(this.dr()) + 1.0F);
            double $$9 = this.dv() + (double)($$6 * (float)this.l * 0.1F);
            dez $$10 = $$1.a_(gu.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(csm.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(iv.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(iv.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(iv.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(aow.hQ, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.dr() + 0.5;
            $$1.a(iv.e, this.dp(), $$13, this.dv(), (int)(1.0F + this.df() * 20.0F), (double)this.df(), 0.0, (double)this.df(), 0.2F);
            $$1.a(iv.B, this.dp(), $$13, this.dv(), (int)(1.0F + this.df() * 20.0F), (double)this.df(), 0.0, (double)this.df(), 0.2F);
            this.j = arp.a(this.ag, 20, 40);
            this.al().b(h, true);
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
            float $$15 = arp.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = arp.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dp() + (double)(arp.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)arp.a(this.dr()) + 1.0F);
            double $$19 = this.dv() + (double)(arp.b($$15) * $$16) * 0.1;
            dez $$20 = $$1.a_(gu.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(csm.G)) {
               $$1.a(iv.ag, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = arp.a(this.ag, 0.0F, 360.0F);
            this.l = arp.a(this.ag, 20, 80);
         }
      } else {
         this.k = arp.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(gu $$0) {
      cca.b $$1 = cca.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cca.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cca.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cca.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cca.b a(gu $$0, gu $$1) {
      return gu.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cca.b.c).orElse(cca.b.c);
   }

   private cca.b c(gu $$0) {
      dez $$1 = this.dK().a_($$0);
      if (!$$1.i() && !$$1.a(csm.fm)) {
         eac $$2 = $$1.u();
         return $$2.a(apq.a) && $$2.b() && $$1.k(this.dK(), $$0).c() ? cca.b.b : cca.b.c;
      } else {
         return cca.b.a;
      }
   }

   public boolean j() {
      return this.n;
   }

   @Override
   public void b(qr $$0) {
   }

   @Override
   public void a(qr $$0) {
   }

   public int a(cix $$0) {
      cbm $$1 = this.m();
      if (!this.dK().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            ai.D.a((akl)$$1, $$0, this, Collections.emptyList());
            this.dK().a(this, (byte)31);
            $$2 = this.o instanceof byf ? 3 : 5;
         } else if (this.j > 0) {
            ecm $$3 = new ecm.a((akk)this.dK()).a(eer.f, this.di()).a(eer.i, $$0).a(eer.a, this).a((float)this.q + $$1.gm()).a(eeq.f);
            eco $$4 = this.dK().n().aH().getLootTable(ece.ai);
            List<cix> $$5 = $$4.a($$3);
            ai.D.a((akl)$$1, $$0, this, $$5);

            for (cix $$6 : $$5) {
               byf $$7 = new byf(this.dK(), this.dp(), this.dr(), this.dv(), $$6);
               double $$8 = $$1.dp() - this.dp();
               double $$9 = $$1.dr() - this.dr();
               double $$10 = $$1.dv() - this.dv();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dK().b($$7);
               $$1.dK().b(new bio($$1.dK(), $$1.dp(), $$1.dr() + 0.5, $$1.dv() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(apt.ao)) {
                  $$1.a(apg.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aA()) {
            $$2 = 2;
         }

         this.ak();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dK().B && this.o instanceof cbm && ((cbm)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(bii $$0) {
      bii $$1 = this.v();
      if ($$1 != null) {
         ehd $$2 = new ehd($$1.dp() - this.dp(), $$1.dr() - this.dr(), $$1.dv() - this.dv()).a(0.1);
         $$0.f($$0.dn().e($$2));
      }
   }

   @Override
   protected bii.b aU() {
      return bii.b.a;
   }

   @Override
   public void a(bii.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void am() {
      this.a(null);
   }

   @Override
   public void b(@Nullable bii $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cca $$0) {
      cbm $$1 = this.m();
      if ($$1 != null) {
         $$1.ci = $$0;
      }
   }

   @Nullable
   public cbm m() {
      bii $$0 = this.v();
      return $$0 instanceof cbm ? (cbm)$$0 : null;
   }

   @Nullable
   public bii o() {
      return this.o;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public ux<wp> U() {
      bii $$0 = this.v();
      return new wq(this, $$0 == null ? this.ah() : $$0.ah());
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      if (this.m() == null) {
         int $$1 = $$0.o();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dK().a($$1), $$1);
         this.aj();
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
