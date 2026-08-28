import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cpg extends cpk {
   private static final Logger b = LogUtils.getLogger();
   private final azv c = azv.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final ako<Integer> g = aks.a(cpg.class, akq.b);
   private static final ako<Boolean> h = aks.a(cpg.class, akq.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bui o;
   private cpg.a p = cpg.a.a;
   private final int q;
   private final int r;

   private cpg(bup<? extends cpg> $$0, dff $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cpg(bup<? extends cpg> $$0, dff $$1) {
      this($$0, $$1, 0, 0);
   }

   public cpg(cor $$0, dff $$1, int $$2, int $$3, cwf $$4) {
      this(bup.bz, $$1, $$2, $$3);
      this.c($$0);
      float $$5 = $$0.dQ();
      float $$6 = $$0.dO();
      float $$7 = azn.b(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = azn.a(-$$6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$9 = -azn.b(-$$5 * (float) (Math.PI / 180.0));
      float $$10 = azn.a(-$$5 * (float) (Math.PI / 180.0));
      double $$11 = $$0.dD() - (double)$$8 * 0.3;
      double $$12 = $$0.dH();
      double $$13 = $$0.dJ() - (double)$$7 * 0.3;
      this.b($$11, $$12, $$13, $$6, $$5);
      ezr $$14 = new ezr((double)(-$$8), (double)azn.a(-($$10 / $$9), -5.0F, 5.0F), (double)(-$$7));
      double $$15 = $$14.g();
      $$14 = $$14.d(0.6 / $$15 + this.af.a(0.5, 0.0103365), 0.6 / $$15 + this.af.a(0.5, 0.0103365), 0.6 / $$15 + this.af.a(0.5, 0.0103365));
      this.h($$14);
      this.v((float)(azn.d($$14.d, $$14.f) * 180.0F / (float)Math.PI));
      this.w((float)(azn.d($$14.e, $$14.i()) * 180.0F / (float)Math.PI));
      this.O = this.dO();
      this.P = this.dQ();
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   protected boolean C() {
      return true;
   }

   @Override
   public void a(ako<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.aw().a(g);
         this.o = $$1 > 0 ? this.dY().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.aw().a(h);
         if (this.d) {
            this.n(this.dB().d, (double)(-0.4F * azn.a(this.c, 0.6F, 1.0F)), this.dB().f);
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
      this.c.b(this.cI().getLeastSignificantBits() ^ this.dY().aa());
      super.l();
      cor $$0 = this.o();
      if ($$0 == null) {
         this.av();
      } else if (this.dY().C || !this.a($$0)) {
         if (this.aL()) {
            this.i++;
            if (this.i >= 1200) {
               this.av();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         jh $$2 = this.dy();
         ero $$3 = this.dY().b_($$2);
         if ($$3.a(axj.a)) {
            $$1 = $$3.a(this.dY(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cpg.a.a) {
            if (this.o != null) {
               this.h(ezr.c);
               this.p = cpg.a.b;
               return;
            }

            if ($$4) {
               this.h(this.dB().d(0.3, 0.2, 0.3));
               this.p = cpg.a.c;
               return;
            }

            this.t();
         } else {
            if (this.p == cpg.a.b) {
               if (this.o != null) {
                  if (!this.o.dT() && this.o.dY().ag() == this.dY().ag()) {
                     this.a_(this.o.dD(), this.o.e(0.8), this.o.dJ());
                  } else {
                     this.B(null);
                     this.p = cpg.a.a;
                  }
               }

               return;
            }

            if (this.p == cpg.a.c) {
               ezr $$5 = this.dB();
               double $$6 = this.dF() + $$5.e - (double)$$2.v() - (double)$$1;
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
                     this.h(this.dB().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dY().C) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(axj.a)) {
            this.h(this.dB().b(0.0, -0.03, 0.0));
         }

         this.a(bvi.a, this.dB());
         this.aM();
         this.F();
         if (this.p == cpg.a.a && (this.aL() || this.Q)) {
            this.h(ezr.c);
         }

         double $$7 = 0.92;
         this.h(this.dB().c(0.92));
         this.aA();
      }
   }

   private boolean a(cor $$0) {
      cwf $$1 = $$0.fc();
      cwf $$2 = $$0.fd();
      boolean $$3 = $$1.a(cwj.rm);
      boolean $$4 = $$2.a(cwj.rm);
      if (!$$0.dT() && $$0.bN() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.av();
         return true;
      }
   }

   private void t() {
      ezp $$0 = cpm.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bui $$0) {
      return super.b($$0) || $$0.bN() && $$0 instanceof ckz;
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      if (!this.dY().C) {
         this.B($$0.a());
      }
   }

   @Override
   protected void a(ezn $$0) {
      super.a($$0);
      this.h(this.dB().d().c($$0.a(this)));
   }

   private void B(@Nullable bui $$0) {
      this.o = $$0;
      this.aw().a(g, $$0 == null ? 0 : $$0.as() + 1);
   }

   private void a(jh $$0) {
      arq $$1 = (arq)this.dY();
      int $$2 = 1;
      jh $$3 = $$0.d();
      if (this.af.i() < 0.25F && this.dY().r($$3)) {
         $$2++;
      }

      if (this.af.i() < 0.5F && !this.dY().h($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.aw().a(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.af.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = azn.a($$4);
            float $$6 = azn.b($$4);
            double $$7 = this.dD() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)azn.a(this.dF()) + 1.0F);
            double $$9 = this.dJ() + (double)($$6 * (float)this.l * 0.1F);
            dvo $$10 = $$1.a_(jh.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dil.G)) {
               if (this.af.i() < 0.15F) {
                  $$1.a(ls.d, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(ls.E, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(ls.E, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(awo.iY, 0.25F, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
            double $$13 = this.dF() + 0.5;
            $$1.a(ls.d, this.dD(), $$13, this.dJ(), (int)(1.0F + this.dt() * 20.0F), (double)this.dt(), 0.0, (double)this.dt(), 0.2F);
            $$1.a(ls.E, this.dD(), $$13, this.dJ(), (int)(1.0F + this.dt() * 20.0F), (double)this.dt(), 0.0, (double)this.dt(), 0.2F);
            this.j = azn.a(this.af, 20, 40);
            this.aw().a(h, true);
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
            float $$15 = azn.a(this.af, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = azn.a(this.af, 25.0F, 60.0F);
            double $$17 = this.dD() + (double)(azn.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)azn.a(this.dF()) + 1.0F);
            double $$19 = this.dJ() + (double)(azn.b($$15) * $$16) * 0.1;
            dvo $$20 = $$1.a_(jh.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dil.G)) {
               $$1.a(ls.am, $$17, $$18, $$19, 2 + this.af.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = azn.a(this.af, 0.0F, 360.0F);
            this.l = azn.a(this.af, 20, 80);
         }
      } else {
         this.k = azn.a(this.af, 100, 600);
         this.k = this.k - this.r;
      }
   }

   private boolean b(jh $$0) {
      cpg.b $$1 = cpg.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cpg.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cpg.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cpg.b.a) {
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

   private cpg.b a(jh $$0, jh $$1) {
      return jh.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cpg.b.c).orElse(cpg.b.c);
   }

   private cpg.b c(jh $$0) {
      dvo $$1 = this.dY().a_($$0);
      if (!$$1.l() && !$$1.a(dil.fm)) {
         ero $$2 = $$1.y();
         return $$2.a(axj.a) && $$2.b() && $$1.g(this.dY(), $$0).c() ? cpg.b.b : cpg.b.c;
      } else {
         return cpg.b.a;
      }
   }

   public boolean m() {
      return this.n;
   }

   @Override
   public void b(un $$0) {
   }

   @Override
   public void a(un $$0) {
   }

   public int a(cwf $$0) {
      cor $$1 = this.o();
      if (!this.dY().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.d(this.o);
            ao.E.a((arr)$$1, $$0, this, Collections.emptyList());
            this.dY().a(this, (byte)31);
            $$2 = this.o instanceof ckz ? 3 : 5;
         } else if (this.j > 0) {
            euj $$3 = new euj.a((arq)this.dY()).a(exc.f, this.dw()).a(exc.i, $$0).a(exc.a, this).a((float)this.q + $$1.gI()).a(exb.f);
            eul $$4 = this.dY().o().bc().b(euc.am);
            List<cwf> $$5 = $$4.a($$3);
            ao.E.a((arr)$$1, $$0, this, $$5);

            for (cwf $$6 : $$5) {
               ckz $$7 = new ckz(this.dY(), this.dD(), this.dF(), this.dJ(), $$6);
               double $$8 = $$1.dD() - this.dD();
               double $$9 = $$1.dF() - this.dF();
               double $$10 = $$1.dJ() - this.dJ();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dY().b($$7);
               $$1.dY().b(new buu($$1.dY(), $$1.dD(), $$1.dF() + 0.5, $$1.dJ() + 0.5, this.af.a(6) + 1));
               if ($$6.a(axm.aU)) {
                  $$1.a(awy.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aL()) {
            $$2 = 2;
         }

         this.av();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dY().C && this.o instanceof cor && ((cor)this.o).g()) {
         this.d(this.o);
      }

      super.b($$0);
   }

   protected void d(bui $$0) {
      bui $$1 = this.s();
      if ($$1 != null) {
         ezr $$2 = new ezr($$1.dD() - this.dD(), $$1.dF() - this.dF(), $$1.dJ() - this.dJ()).c(0.1);
         $$0.h($$0.dB().e($$2));
      }
   }

   @Override
   protected bui.b bi() {
      return bui.b.a;
   }

   @Override
   public void a(bui.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ax() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bui $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cpg $$0) {
      cor $$1 = this.o();
      if ($$1 != null) {
         $$1.cv = $$0;
      }
   }

   @Nullable
   public cor o() {
      bui $$0 = this.s();
      return $$0 instanceof cor ? (cor)$$0 : null;
   }

   @Nullable
   public bui q() {
      return this.o;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public zs<ach> a(arp $$0) {
      bui $$1 = this.s();
      return new aci(this, $$0, $$1 == null ? this.as() : $$1.as());
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      if (this.o() == null) {
         int $$1 = $$0.p();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dY().a($$1), $$1);
         this.au();
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
