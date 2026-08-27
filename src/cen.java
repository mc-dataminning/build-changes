import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cen extends cer {
   private static final Logger b = LogUtils.getLogger();
   private final atw c = atw.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final afs<Integer> g = afv.a(cen.class, afu.b);
   private static final afs<Boolean> h = afv.a(cen.class, afu.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bkv o;
   private cen.a p = cen.a.a;
   private final int q;
   private final int r;

   private cen(bkz<? extends cen> $$0, csf $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cen(bkz<? extends cen> $$0, csf $$1) {
      this($$0, $$1, 0, 0);
   }

   public cen(cdz $$0, csf $$1, int $$2, int $$3) {
      this(bkz.bu, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dF();
      float $$5 = $$0.dD();
      float $$6 = atq.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = atq.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -atq.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = atq.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.ds() - (double)$$7 * 0.3;
      double $$11 = $$0.dw();
      double $$12 = $$0.dy() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ejz $$13 = new ejz((double)(-$$7), (double)atq.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(atq.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(atq.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dD();
      this.O = this.dF();
   }

   @Override
   protected void c_() {
      this.an().a(g, 0);
      this.an().a(h, false);
   }

   @Override
   public void a(afs<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.an().b(g);
         this.o = $$1 > 0 ? this.dN().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.an().b(h);
         if (this.d) {
            this.o(this.dq().c, (double)(-0.4F * atq.a(this.c, 0.6F, 1.0F)), this.dq().e);
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
      this.c.b(this.cw().getLeastSignificantBits() ^ this.dN().W());
      super.l();
      cdz $$0 = this.s();
      if ($$0 == null) {
         this.am();
      } else if (this.dN().B || !this.a($$0)) {
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
         hx $$2 = this.dn();
         ecx $$3 = this.dN().b_($$2);
         if ($$3.a(arp.a)) {
            $$1 = $$3.a((crl)this.dN(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cen.a.a) {
            if (this.o != null) {
               this.g(ejz.b);
               this.p = cen.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dq().d(0.3, 0.2, 0.3));
               this.p = cen.a.c;
               return;
            }

            this.x();
         } else {
            if (this.p == cen.a.b) {
               if (this.o != null) {
                  if (!this.o.dI() && this.o.dN().ad() == this.dN().ad()) {
                     this.a_(this.o.ds(), this.o.e(0.8), this.o.dy());
                  } else {
                     this.A(null);
                     this.p = cen.a.a;
                  }
               }

               return;
            }

            if (this.p == cen.a.c) {
               ejz $$5 = this.dq();
               double $$6 = this.du() + $$5.d - (double)$$2.v() - (double)$$1;
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

         if (!$$3.a(arp.a)) {
            this.g(this.dq().b(0.0, -0.03, 0.0));
         }

         this.a(blr.a, this.dq());
         this.J();
         if (this.p == cen.a.a && (this.aC() || this.P)) {
            this.g(ejz.b);
         }

         double $$7 = 0.92;
         this.g(this.dq().a(0.92));
         this.ar();
      }
   }

   private boolean a(cdz $$0) {
      clo $$1 = $$0.eU();
      clo $$2 = $$0.eV();
      boolean $$3 = $$1.a(clr.qS);
      boolean $$4 = $$2.a(clr.qS);
      if (!$$0.dI() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      ejx $$0 = ces.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(bkv $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof cas;
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ejv $$0) {
      super.a($$0);
      this.g(this.dq().d().a($$0.a(this)));
   }

   private void A(@Nullable bkv $$0) {
      this.o = $$0;
      this.an().b(g, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(hx $$0) {
      ami $$1 = (ami)this.dN();
      int $$2 = 1;
      hx $$3 = $$0.c();
      if (this.ag.i() < 0.25F && this.dN().q($$3)) {
         $$2++;
      }

      if (this.ag.i() < 0.5F && !this.dN().g($$3)) {
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
            float $$5 = atq.a($$4);
            float $$6 = atq.b($$4);
            double $$7 = this.ds() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)atq.a(this.du()) + 1.0F);
            double $$9 = this.dy() + (double)($$6 * (float)this.l * 0.1F);
            dhn $$10 = $$1.a_(hx.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cvh.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(jw.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(jw.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(jw.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(aqv.ik, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.du() + 0.5;
            $$1.a(jw.e, this.ds(), $$13, this.dy(), (int)(1.0F + this.dh() * 20.0F), (double)this.dh(), 0.0, (double)this.dh(), 0.2F);
            $$1.a(jw.B, this.ds(), $$13, this.dy(), (int)(1.0F + this.dh() * 20.0F), (double)this.dh(), 0.0, (double)this.dh(), 0.2F);
            this.j = atq.a(this.ag, 20, 40);
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
            float $$15 = atq.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = atq.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.ds() + (double)(atq.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)atq.a(this.du()) + 1.0F);
            double $$19 = this.dy() + (double)(atq.b($$15) * $$16) * 0.1;
            dhn $$20 = $$1.a_(hx.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cvh.G)) {
               $$1.a(jw.ah, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = atq.a(this.ag, 0.0F, 360.0F);
            this.l = atq.a(this.ag, 20, 80);
         }
      } else {
         this.k = atq.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(hx $$0) {
      cen.b $$1 = cen.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cen.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cen.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cen.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cen.b a(hx $$0, hx $$1) {
      return hx.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cen.b.c).orElse(cen.b.c);
   }

   private cen.b c(hx $$0) {
      dhn $$1 = this.dN().a_($$0);
      if (!$$1.i() && !$$1.a(cvh.fm)) {
         ecx $$2 = $$1.u();
         return $$2.a(arp.a) && $$2.b() && $$1.k(this.dN(), $$0).c() ? cen.b.b : cen.b.c;
      } else {
         return cen.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(sd $$0) {
   }

   @Override
   public void a(sd $$0) {
   }

   public int a(clo $$0) {
      cdz $$1 = this.s();
      if (!this.dN().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            al.D.a((amj)$$1, $$0, this, Collections.emptyList());
            this.dN().a(this, (byte)31);
            $$2 = this.o instanceof cas ? 3 : 5;
         } else if (this.j > 0) {
            efi $$3 = new efi.a((ami)this.dN()).a(ehn.f, this.dl()).a(ehn.i, $$0).a(ehn.a, this).a((float)this.q + $$1.gp()).a(ehm.f);
            efk $$4 = this.dN().n().aJ().getLootTable(efa.ai);
            List<clo> $$5 = $$4.a($$3);
            al.D.a((amj)$$1, $$0, this, $$5);

            for (clo $$6 : $$5) {
               cas $$7 = new cas(this.dN(), this.ds(), this.du(), this.dy(), $$6);
               double $$8 = $$1.ds() - this.ds();
               double $$9 = $$1.du() - this.du();
               double $$10 = $$1.dy() - this.dy();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dN().b($$7);
               $$1.dN().b(new blb($$1.dN(), $$1.ds(), $$1.du() + 0.5, $$1.dy() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(ars.ao)) {
                  $$1.a(arf.R, 1);
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
      if ($$0 == 31 && this.dN().B && this.o instanceof cdz && ((cdz)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(bkv $$0) {
      bkv $$1 = this.w();
      if ($$1 != null) {
         ejz $$2 = new ejz($$1.ds() - this.ds(), $$1.du() - this.du(), $$1.dy() - this.dy()).a(0.1);
         $$0.g($$0.dq().e($$2));
      }
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.a;
   }

   @Override
   public void a(bkv.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable bkv $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cen $$0) {
      cdz $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cdz s() {
      bkv $$0 = this.w();
      return $$0 instanceof cdz ? (cdz)$$0 : null;
   }

   @Nullable
   public bkv u() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public wo<yh> dk() {
      bkv $$0 = this.w();
      return new yi(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(yi $$0) {
      super.a($$0);
      if (this.s() == null) {
         int $$1 = $$0.o();
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
