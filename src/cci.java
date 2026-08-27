import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cci extends ccm {
   private static final Logger b = LogUtils.getLogger();
   private final asc c = asc.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final aef<Integer> g = aei.a(cci.class, aeh.b);
   private static final aef<Boolean> h = aei.a(cci.class, aeh.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private biq o;
   private cci.a p = cci.a.a;
   private final int q;
   private final int r;

   private cci(biu<? extends cci> $$0, cpv $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cci(biu<? extends cci> $$0, cpv $$1) {
      this($$0, $$1, 0, 0);
   }

   public cci(cbu $$0, cpv $$1, int $$2, int $$3) {
      this(biu.bu, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dD();
      float $$5 = $$0.dB();
      float $$6 = arx.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = arx.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -arx.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = arx.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dq() - (double)$$7 * 0.3;
      double $$11 = $$0.du();
      double $$12 = $$0.dw() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ehn $$13 = new ehn((double)(-$$7), (double)arx.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.f($$13);
      this.r((float)(arx.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(arx.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dB();
      this.O = this.dD();
   }

   @Override
   protected void a_() {
      this.am().a(g, 0);
      this.am().a(h, false);
   }

   @Override
   public void a(aef<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.am().b(g);
         this.o = $$1 > 0 ? this.dL().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.am().b(h);
         if (this.d) {
            this.o(this.do().c, (double)(-0.4F * arx.a(this.c, 0.6F, 1.0F)), this.do().e);
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
      this.c.b(this.cw().getLeastSignificantBits() ^ this.dL().V());
      super.l();
      cbu $$0 = this.s();
      if ($$0 == null) {
         this.al();
      } else if (this.dL().B || !this.a($$0)) {
         if (this.aB()) {
            this.i++;
            if (this.i >= 1200) {
               this.al();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         gw $$2 = this.dl();
         eam $$3 = this.dL().b_($$2);
         if ($$3.a(apy.a)) {
            $$1 = $$3.a((cpb)this.dL(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cci.a.a) {
            if (this.o != null) {
               this.f(ehn.b);
               this.p = cci.a.b;
               return;
            }

            if ($$4) {
               this.f(this.do().d(0.3, 0.2, 0.3));
               this.p = cci.a.c;
               return;
            }

            this.w();
         } else {
            if (this.p == cci.a.b) {
               if (this.o != null) {
                  if (!this.o.dG() && this.o.dL().ac() == this.dL().ac()) {
                     this.e(this.o.dq(), this.o.e(0.8), this.o.dw());
                  } else {
                     this.A(null);
                     this.p = cci.a.a;
                  }
               }

               return;
            }

            if (this.p == cci.a.c) {
               ehn $$5 = this.do();
               double $$6 = this.ds() + $$5.d - (double)$$2.v() - (double)$$1;
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
                     this.f(this.do().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.dL().B) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(apy.a)) {
            this.f(this.do().b(0.0, -0.03, 0.0));
         }

         this.a(bjm.a, this.do());
         this.H();
         if (this.p == cci.a.a && (this.aB() || this.P)) {
            this.f(ehn.b);
         }

         double $$7 = 0.92;
         this.f(this.do().a(0.92));
         this.aq();
      }
   }

   private boolean a(cbu $$0) {
      cjf $$1 = $$0.eS();
      cjf $$2 = $$0.eT();
      boolean $$3 = $$1.a(cji.qh);
      boolean $$4 = $$2.a(cji.qh);
      if (!$$0.dG() && $$0.bw() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.al();
         return true;
      }
   }

   private void w() {
      ehl $$0 = ccn.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(biq $$0) {
      return super.a($$0) || $$0.bw() && $$0 instanceof byn;
   }

   @Override
   protected void a(ehk $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ehj $$0) {
      super.a($$0);
      this.f(this.do().d().a($$0.a(this)));
   }

   private void A(@Nullable biq $$0) {
      this.o = $$0;
      this.am().b(g, $$0 == null ? 0 : $$0.ai() + 1);
   }

   private void a(gw $$0) {
      akr $$1 = (akr)this.dL();
      int $$2 = 1;
      gw $$3 = $$0.c();
      if (this.ag.i() < 0.25F && this.dL().q($$3)) {
         $$2++;
      }

      if (this.ag.i() < 0.5F && !this.dL().g($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.am().b(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ag.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = arx.a($$4);
            float $$6 = arx.b($$4);
            double $$7 = this.dq() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)arx.a(this.ds()) + 1.0F);
            double $$9 = this.dw() + (double)($$6 * (float)this.l * 0.1F);
            dfj $$10 = $$1.a_(gw.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(csw.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(ix.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(ix.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(ix.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(ape.hQ, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.ds() + 0.5;
            $$1.a(ix.e, this.dq(), $$13, this.dw(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            $$1.a(ix.B, this.dq(), $$13, this.dw(), (int)(1.0F + this.dg() * 20.0F), (double)this.dg(), 0.0, (double)this.dg(), 0.2F);
            this.j = arx.a(this.ag, 20, 40);
            this.am().b(h, true);
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
            float $$15 = arx.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = arx.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dq() + (double)(arx.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)arx.a(this.ds()) + 1.0F);
            double $$19 = this.dw() + (double)(arx.b($$15) * $$16) * 0.1;
            dfj $$20 = $$1.a_(gw.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(csw.G)) {
               $$1.a(ix.ag, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = arx.a(this.ag, 0.0F, 360.0F);
            this.l = arx.a(this.ag, 20, 80);
         }
      } else {
         this.k = arx.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(gw $$0) {
      cci.b $$1 = cci.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cci.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cci.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cci.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cci.b a(gw $$0, gw $$1) {
      return gw.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cci.b.c).orElse(cci.b.c);
   }

   private cci.b c(gw $$0) {
      dfj $$1 = this.dL().a_($$0);
      if (!$$1.i() && !$$1.a(csw.fm)) {
         eam $$2 = $$1.u();
         return $$2.a(apy.a) && $$2.b() && $$1.k(this.dL(), $$0).c() ? cci.b.b : cci.b.c;
      } else {
         return cci.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(qx $$0) {
   }

   @Override
   public void a(qx $$0) {
   }

   public int a(cjf $$0) {
      cbu $$1 = this.s();
      if (!this.dL().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            al.D.a((aks)$$1, $$0, this, Collections.emptyList());
            this.dL().a(this, (byte)31);
            $$2 = this.o instanceof byn ? 3 : 5;
         } else if (this.j > 0) {
            ecw $$3 = new ecw.a((akr)this.dL()).a(efb.f, this.dj()).a(efb.i, $$0).a(efb.a, this).a((float)this.q + $$1.gn()).a(efa.f);
            ecy $$4 = this.dL().n().aH().getLootTable(eco.ai);
            List<cjf> $$5 = $$4.a($$3);
            al.D.a((aks)$$1, $$0, this, $$5);

            for (cjf $$6 : $$5) {
               byn $$7 = new byn(this.dL(), this.dq(), this.ds(), this.dw(), $$6);
               double $$8 = $$1.dq() - this.dq();
               double $$9 = $$1.ds() - this.ds();
               double $$10 = $$1.dw() - this.dw();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dL().b($$7);
               $$1.dL().b(new biw($$1.dL(), $$1.dq(), $$1.ds() + 0.5, $$1.dw() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(aqb.ao)) {
                  $$1.a(apo.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aB()) {
            $$2 = 2;
         }

         this.al();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.dL().B && this.o instanceof cbu && ((cbu)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(biq $$0) {
      biq $$1 = this.v();
      if ($$1 != null) {
         ehn $$2 = new ehn($$1.dq() - this.dq(), $$1.ds() - this.ds(), $$1.dw() - this.dw()).a(0.1);
         $$0.f($$0.do().e($$2));
      }
   }

   @Override
   protected biq.b aV() {
      return biq.b.a;
   }

   @Override
   public void a(biq.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void an() {
      this.a(null);
   }

   @Override
   public void b(@Nullable biq $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cci $$0) {
      cbu $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cbu s() {
      biq $$0 = this.v();
      return $$0 instanceof cbu ? (cbu)$$0 : null;
   }

   @Nullable
   public biq t() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public vd<ww> V() {
      biq $$0 = this.v();
      return new wx(this, $$0 == null ? this.ai() : $$0.ai());
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      if (this.s() == null) {
         int $$1 = $$0.o();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dL().a($$1), $$1);
         this.ak();
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
