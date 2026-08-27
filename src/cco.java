import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cco extends ccs {
   private static final Logger b = LogUtils.getLogger();
   private final ash c = ash.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final aef<Integer> g = aei.a(cco.class, aeh.b);
   private static final aef<Boolean> h = aei.a(cco.class, aeh.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private biw o;
   private cco.a p = cco.a.a;
   private final int q;
   private final int r;

   private cco(bja<? extends cco> $$0, cqb $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cco(bja<? extends cco> $$0, cqb $$1) {
      this($$0, $$1, 0, 0);
   }

   public cco(cca $$0, cqb $$1, int $$2, int $$3) {
      this(bja.bu, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dD();
      float $$5 = $$0.dB();
      float $$6 = asb.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = asb.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -asb.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = asb.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dq() - (double)$$7 * 0.3;
      double $$11 = $$0.du();
      double $$12 = $$0.dw() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      ehh $$13 = new ehh((double)(-$$7), (double)asb.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.f($$13);
      this.r((float)(asb.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(asb.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dB();
      this.O = this.dD();
   }

   @Override
   protected void a_() {
      this.al().a(g, 0);
      this.al().a(h, false);
   }

   @Override
   public void a(aef<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.al().b(g);
         this.o = $$1 > 0 ? this.dL().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.al().b(h);
         if (this.d) {
            this.o(this.do().c, (double)(-0.4F * asb.a(this.c, 0.6F, 1.0F)), this.do().e);
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
      cca $$0 = this.s();
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
         gw $$2 = this.dl();
         eag $$3 = this.dL().b_($$2);
         if ($$3.a(aqa.a)) {
            $$1 = $$3.a((cph)this.dL(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cco.a.a) {
            if (this.o != null) {
               this.f(ehh.b);
               this.p = cco.a.b;
               return;
            }

            if ($$4) {
               this.f(this.do().d(0.3, 0.2, 0.3));
               this.p = cco.a.c;
               return;
            }

            this.w();
         } else {
            if (this.p == cco.a.b) {
               if (this.o != null) {
                  if (!this.o.dG() && this.o.dL().ac() == this.dL().ac()) {
                     this.e(this.o.dq(), this.o.e(0.8), this.o.dw());
                  } else {
                     this.A(null);
                     this.p = cco.a.a;
                  }
               }

               return;
            }

            if (this.p == cco.a.c) {
               ehh $$5 = this.do();
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

         if (!$$3.a(aqa.a)) {
            this.f(this.do().b(0.0, -0.03, 0.0));
         }

         this.a(bjs.a, this.do());
         this.H();
         if (this.p == cco.a.a && (this.aA() || this.P)) {
            this.f(ehh.b);
         }

         double $$7 = 0.92;
         this.f(this.do().a(0.92));
         this.ap();
      }
   }

   private boolean a(cca $$0) {
      cjl $$1 = $$0.eS();
      cjl $$2 = $$0.eT();
      boolean $$3 = $$1.a(cjo.qh);
      boolean $$4 = $$2.a(cjo.qh);
      if (!$$0.dG() && $$0.bv() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.ak();
         return true;
      }
   }

   private void w() {
      ehf $$0 = cct.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(biw $$0) {
      return super.a($$0) || $$0.bv() && $$0 instanceof byt;
   }

   @Override
   protected void a(ehe $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      this.f(this.do().d().a($$0.a(this)));
   }

   private void A(@Nullable biw $$0) {
      this.o = $$0;
      this.al().b(g, $$0 == null ? 0 : $$0.ah() + 1);
   }

   private void a(gw $$0) {
      akt $$1 = (akt)this.dL();
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
            this.al().b(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ag.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = asb.a($$4);
            float $$6 = asb.b($$4);
            double $$7 = this.dq() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)asb.a(this.ds()) + 1.0F);
            double $$9 = this.dw() + (double)($$6 * (float)this.l * 0.1F);
            dfd $$10 = $$1.a_(gw.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cte.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(iv.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(iv.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(iv.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(apg.hQ, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.ds() + 0.5;
            $$1.a(iv.e, this.dq(), $$13, this.dw(), (int)(1.0F + this.df() * 20.0F), (double)this.df(), 0.0, (double)this.df(), 0.2F);
            $$1.a(iv.B, this.dq(), $$13, this.dw(), (int)(1.0F + this.df() * 20.0F), (double)this.df(), 0.0, (double)this.df(), 0.2F);
            this.j = asb.a(this.ag, 20, 40);
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
            float $$15 = asb.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = asb.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.dq() + (double)(asb.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)asb.a(this.ds()) + 1.0F);
            double $$19 = this.dw() + (double)(asb.b($$15) * $$16) * 0.1;
            dfd $$20 = $$1.a_(gw.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cte.G)) {
               $$1.a(iv.ag, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = asb.a(this.ag, 0.0F, 360.0F);
            this.l = asb.a(this.ag, 20, 80);
         }
      } else {
         this.k = asb.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(gw $$0) {
      cco.b $$1 = cco.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cco.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cco.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cco.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cco.b a(gw $$0, gw $$1) {
      return gw.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cco.b.c).orElse(cco.b.c);
   }

   private cco.b c(gw $$0) {
      dfd $$1 = this.dL().a_($$0);
      if (!$$1.i() && !$$1.a(cte.fm)) {
         eag $$2 = $$1.u();
         return $$2.a(aqa.a) && $$2.b() && $$1.k(this.dL(), $$0).c() ? cco.b.b : cco.b.c;
      } else {
         return cco.b.a;
      }
   }

   public boolean q() {
      return this.n;
   }

   @Override
   public void b(qw $$0) {
   }

   @Override
   public void a(qw $$0) {
   }

   public int a(cjl $$0) {
      cca $$1 = this.s();
      if (!this.dL().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            al.D.a((aku)$$1, $$0, this, Collections.emptyList());
            this.dL().a(this, (byte)31);
            $$2 = this.o instanceof byt ? 3 : 5;
         } else if (this.j > 0) {
            ecq $$3 = new ecq.a((akt)this.dL()).a(eev.f, this.dj()).a(eev.i, $$0).a(eev.a, this).a((float)this.q + $$1.go()).a(eeu.f);
            ecs $$4 = this.dL().n().aH().getLootTable(eci.ai);
            List<cjl> $$5 = $$4.a($$3);
            al.D.a((aku)$$1, $$0, this, $$5);

            for (cjl $$6 : $$5) {
               byt $$7 = new byt(this.dL(), this.dq(), this.ds(), this.dw(), $$6);
               double $$8 = $$1.dq() - this.dq();
               double $$9 = $$1.ds() - this.ds();
               double $$10 = $$1.dw() - this.dw();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dL().b($$7);
               $$1.dL().b(new bjc($$1.dL(), $$1.dq(), $$1.ds() + 0.5, $$1.dw() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(aqd.ao)) {
                  $$1.a(apq.R, 1);
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
      if ($$0 == 31 && this.dL().B && this.o instanceof cca && ((cca)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(biw $$0) {
      biw $$1 = this.v();
      if ($$1 != null) {
         ehh $$2 = new ehh($$1.dq() - this.dq(), $$1.ds() - this.ds(), $$1.dw() - this.dw()).a(0.1);
         $$0.f($$0.do().e($$2));
      }
   }

   @Override
   protected biw.b aU() {
      return biw.b.a;
   }

   @Override
   public void a(biw.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void am() {
      this.a(null);
   }

   @Override
   public void b(@Nullable biw $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cco $$0) {
      cca $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cca s() {
      biw $$0 = this.v();
      return $$0 instanceof cca ? (cca)$$0 : null;
   }

   @Nullable
   public biw t() {
      return this.o;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public ve<wx> di() {
      biw $$0 = this.v();
      return new wy(this, $$0 == null ? this.ah() : $$0.ah());
   }

   @Override
   public void a(wy $$0) {
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
