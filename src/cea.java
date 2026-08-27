import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cea extends cee {
   private static final Logger b = LogUtils.getLogger();
   private final ato c = ato.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final afm<Integer> g = afp.a(cea.class, afo.b);
   private static final afm<Boolean> h = afp.a(cea.class, afo.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bki o;
   private cea.a p = cea.a.a;
   private final int q;
   private final int r;

   private cea(bkm<? extends cea> $$0, crs $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cea(bkm<? extends cea> $$0, crs $$1) {
      this($$0, $$1, 0, 0);
   }

   public cea(cdm $$0, crs $$1, int $$2, int $$3) {
      this(bkm.bu, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dD();
      float $$5 = $$0.dB();
      float $$6 = ati.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ati.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ati.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = ati.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dq() - (double)$$7 * 0.3;
      double $$11 = $$0.du();
      double $$12 = $$0.dw() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      eji $$13 = new eji((double)(-$$7), (double)ati.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.f($$13);
      this.r((float)(ati.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(ati.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dB();
      this.O = this.dD();
   }

   @Override
   protected void b_() {
      this.al().a(g, 0);
      this.al().a(h, false);
   }

   @Override
   public void a(afm<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.al().b(g);
         this.o = $$1 > 0 ? this.dL().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.al().b(h);
         if (this.d) {
            this.o(this.do().c, (double)(-0.4F * ati.a(this.c, 0.6F, 1.0F)), this.do().e);
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
      this.c.b(this.cv().getLeastSignificantBits() ^ this.dL().V());
      super.l();
      cdm $$0 = this.s();
      if ($$0 == null) {
         this.ak();
      } else if (this.dL().B || !this.a($$0)) {
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
         ht $$2 = this.dl();
         ecg $$3 = this.dL().b_($$2);
         if ($$3.a(arh.a)) {
            $$1 = $$3.a((cqy)this.dL(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cea.a.a) {
            if (this.o != null) {
               this.f(eji.b);
               this.p = cea.a.b;
               return;
            }

            if ($$4) {
               this.f(this.do().d(0.3, 0.2, 0.3));
               this.p = cea.a.c;
               return;
            }

            this.w();
         } else {
            if (this.p == cea.a.b) {
               if (this.o != null) {
                  if (!this.o.dG() && this.o.dL().ac() == this.dL().ac()) {
                     this.e(this.o.dq(), this.o.e(0.8), this.o.dw());
                  } else {
                     this.A(null);
                     this.p = cea.a.a;
                  }
               }

               return;
            }

            if (this.p == cea.a.c) {
               eji $$5 = this.do();
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

         if (!$$3.a(arh.a)) {
            this.f(this.do().b(0.0, -0.03, 0.0));
         }

         this.a(ble.a, this.do());
         this.H();
         if (this.p == cea.a.a && (this.aA() || this.P)) {
            this.f(eji.b);
         }

         double $$7 = 0.92;
         this.f(this.do().a(0.92));
         this.ap();
      }
   }

   private boolean a(cdm $$0) {
      clb $$1 = $$0.eS();
      clb $$2 = $$0.eT();
      boolean $$3 = $$1.a(cle.qh);
      boolean $$4 = $$2.a(cle.qh);
      if (!$$0.dG() && $$0.bv() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.ak();
         return true;
      }
   }

   private void w() {
      ejg $$0 = cef.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(bki $$0) {
      return super.a($$0) || $$0.bv() && $$0 instanceof caf;
   }

   @Override
   protected void a(ejf $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(eje $$0) {
      super.a($$0);
      this.f(this.do().d().a($$0.a(this)));
   }

   private void A(@Nullable bki $$0) {
      this.o = $$0;
      this.al().b(g, $$0 == null ? 0 : $$0.ah() + 1);
   }

   private void a(ht $$0) {
      ama $$1 = (ama)this.dL();
      int $$2 = 1;
      ht $$3 = $$0.c();
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
            this.al().b(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ag.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = ati.a($$4);
            float $$6 = ati.b($$4);
            double $$7 = this.dq() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)ati.a(this.ds()) + 1.0F);
            double $$9 = this.dw() + (double)($$6 * (float)this.l * 0.1F);
            dgw $$10 = $$1.a_(ht.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cuv.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(js.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(js.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(js.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(aqn.hU, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.ds() + 0.5;
            $$1.a(js.e, this.dq(), $$13, this.dw(), (int)(1.0F + this.df() * 20.0F), (double)this.df(), 0.0, (double)this.df(), 0.2F);
            $$1.a(js.B, this.dq(), $$13, this.dw(), (int)(1.0F + this.df() * 20.0F), (double)this.df(), 0.0, (double)this.df(), 0.2F);
            this.j = ati.a(this.ag, 20, 40);
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
            float $$15 = ati.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = ati.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dq() + (double)(ati.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)ati.a(this.ds()) + 1.0F);
            double $$19 = this.dw() + (double)(ati.b($$15) * $$16) * 0.1;
            dgw $$20 = $$1.a_(ht.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cuv.G)) {
               $$1.a(js.ah, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = ati.a(this.ag, 0.0F, 360.0F);
            this.l = ati.a(this.ag, 20, 80);
         }
      } else {
         this.k = ati.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(ht $$0) {
      cea.b $$1 = cea.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cea.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cea.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cea.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cea.b a(ht $$0, ht $$1) {
      return ht.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cea.b.c).orElse(cea.b.c);
   }

   private cea.b c(ht $$0) {
      dgw $$1 = this.dL().a_($$0);
      if (!$$1.i() && !$$1.a(cuv.fm)) {
         ecg $$2 = $$1.u();
         return $$2.a(arh.a) && $$2.b() && $$1.k(this.dL(), $$0).c() ? cea.b.b : cea.b.c;
      } else {
         return cea.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(rz $$0) {
   }

   @Override
   public void a(rz $$0) {
   }

   public int a(clb $$0) {
      cdm $$1 = this.s();
      if (!this.dL().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            al.D.a((amb)$$1, $$0, this, Collections.emptyList());
            this.dL().a(this, (byte)31);
            $$2 = this.o instanceof caf ? 3 : 5;
         } else if (this.j > 0) {
            eer $$3 = new eer.a((ama)this.dL()).a(egw.f, this.dj()).a(egw.i, $$0).a(egw.a, this).a((float)this.q + $$1.go()).a(egv.f);
            eet $$4 = this.dL().n().aH().getLootTable(eej.ai);
            List<clb> $$5 = $$4.a($$3);
            al.D.a((amb)$$1, $$0, this, $$5);

            for (clb $$6 : $$5) {
               caf $$7 = new caf(this.dL(), this.dq(), this.ds(), this.dw(), $$6);
               double $$8 = $$1.dq() - this.dq();
               double $$9 = $$1.ds() - this.ds();
               double $$10 = $$1.dw() - this.dw();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dL().b($$7);
               $$1.dL().b(new bko($$1.dL(), $$1.dq(), $$1.ds() + 0.5, $$1.dw() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(ark.ao)) {
                  $$1.a(aqx.R, 1);
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
      if ($$0 == 31 && this.dL().B && this.o instanceof cdm && ((cdm)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(bki $$0) {
      bki $$1 = this.v();
      if ($$1 != null) {
         eji $$2 = new eji($$1.dq() - this.dq(), $$1.ds() - this.ds(), $$1.dw() - this.dw()).a(0.1);
         $$0.f($$0.do().e($$2));
      }
   }

   @Override
   protected bki.b aU() {
      return bki.b.a;
   }

   @Override
   public void a(bki.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void am() {
      this.a(null);
   }

   @Override
   public void b(@Nullable bki $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cea $$0) {
      cdm $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cdm s() {
      bki $$0 = this.v();
      return $$0 instanceof cdm ? (cdm)$$0 : null;
   }

   @Nullable
   public bki t() {
      return this.o;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public wk<yd> di() {
      bki $$0 = this.v();
      return new ye(this, $$0 == null ? this.ah() : $$0.ah());
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      if (this.s() == null) {
         int $$1 = $$0.o();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.dL().a($$1), $$1);
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
