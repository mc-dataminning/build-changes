import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cei extends cem {
   private static final Logger b = LogUtils.getLogger();
   private final ats c = ats.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final afo<Integer> g = afr.a(cei.class, afq.b);
   private static final afo<Boolean> h = afr.a(cei.class, afq.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bkq o;
   private cei.a p = cei.a.a;
   private final int q;
   private final int r;

   private cei(bku<? extends cei> $$0, csa $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.at = true;
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cei(bku<? extends cei> $$0, csa $$1) {
      this($$0, $$1, 0, 0);
   }

   public cei(cdu $$0, csa $$1, int $$2, int $$3) {
      this(bku.bu, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.dF();
      float $$5 = $$0.dD();
      float $$6 = atm.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = atm.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -atm.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = atm.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.ds() - (double)$$7 * 0.3;
      double $$11 = $$0.dw();
      double $$12 = $$0.dy() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      eju $$13 = new eju((double)(-$$7), (double)atm.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365), 0.6 / $$14 + this.ag.a(0.5, 0.0103365));
      this.g($$13);
      this.r((float)(atm.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.s((float)(atm.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.N = this.dD();
      this.O = this.dF();
   }

   @Override
   protected void b_() {
      this.an().a(g, 0);
      this.an().a(h, false);
   }

   @Override
   public void a(afo<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.an().b(g);
         this.o = $$1 > 0 ? this.dN().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.d = this.an().b(h);
         if (this.d) {
            this.o(this.dq().c, (double)(-0.4F * atm.a(this.c, 0.6F, 1.0F)), this.dq().e);
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
      cdu $$0 = this.s();
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
         ht $$2 = this.dn();
         ecs $$3 = this.dN().b_($$2);
         if ($$3.a(arl.a)) {
            $$1 = $$3.a((crg)this.dN(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cei.a.a) {
            if (this.o != null) {
               this.g(eju.b);
               this.p = cei.a.b;
               return;
            }

            if ($$4) {
               this.g(this.dq().d(0.3, 0.2, 0.3));
               this.p = cei.a.c;
               return;
            }

            this.x();
         } else {
            if (this.p == cei.a.b) {
               if (this.o != null) {
                  if (!this.o.dI() && this.o.dN().ad() == this.dN().ad()) {
                     this.a_(this.o.ds(), this.o.e(0.8), this.o.dy());
                  } else {
                     this.A(null);
                     this.p = cei.a.a;
                  }
               }

               return;
            }

            if (this.p == cei.a.c) {
               eju $$5 = this.dq();
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

         if (!$$3.a(arl.a)) {
            this.g(this.dq().b(0.0, -0.03, 0.0));
         }

         this.a(blm.a, this.dq());
         this.J();
         if (this.p == cei.a.a && (this.aC() || this.P)) {
            this.g(eju.b);
         }

         double $$7 = 0.92;
         this.g(this.dq().a(0.92));
         this.ar();
      }
   }

   private boolean a(cdu $$0) {
      clj $$1 = $$0.eU();
      clj $$2 = $$0.eV();
      boolean $$3 = $$1.a(clm.qS);
      boolean $$4 = $$2.a(clm.qS);
      if (!$$0.dI() && $$0.bx() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.am();
         return true;
      }
   }

   private void x() {
      ejs $$0 = cen.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(bkq $$0) {
      return super.a($$0) || $$0.bx() && $$0 instanceof can;
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.A($$0.a());
      }
   }

   @Override
   protected void a(ejq $$0) {
      super.a($$0);
      this.g(this.dq().d().a($$0.a(this)));
   }

   private void A(@Nullable bkq $$0) {
      this.o = $$0;
      this.an().b(g, $$0 == null ? 0 : $$0.aj() + 1);
   }

   private void a(ht $$0) {
      ame $$1 = (ame)this.dN();
      int $$2 = 1;
      ht $$3 = $$0.c();
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
            float $$5 = atm.a($$4);
            float $$6 = atm.b($$4);
            double $$7 = this.ds() + (double)($$5 * (float)this.l * 0.1F);
            double $$8 = (double)((float)atm.a(this.du()) + 1.0F);
            double $$9 = this.dy() + (double)($$6 * (float)this.l * 0.1F);
            dhi $$10 = $$1.a_(ht.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(cvc.G)) {
               if (this.ag.i() < 0.15F) {
                  $$1.a(js.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(js.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(js.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(aqr.ik, 0.25F, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
            double $$13 = this.du() + 0.5;
            $$1.a(js.e, this.ds(), $$13, this.dy(), (int)(1.0F + this.dh() * 20.0F), (double)this.dh(), 0.0, (double)this.dh(), 0.2F);
            $$1.a(js.B, this.ds(), $$13, this.dy(), (int)(1.0F + this.dh() * 20.0F), (double)this.dh(), 0.0, (double)this.dh(), 0.2F);
            this.j = atm.a(this.ag, 20, 40);
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
            float $$15 = atm.a(this.ag, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = atm.a(this.ag, 25.0F, 60.0F);
            double $$17 = this.ds() + (double)(atm.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)atm.a(this.du()) + 1.0F);
            double $$19 = this.dy() + (double)(atm.b($$15) * $$16) * 0.1;
            dhi $$20 = $$1.a_(ht.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(cvc.G)) {
               $$1.a(js.ah, $$17, $$18, $$19, 2 + this.ag.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = atm.a(this.ag, 0.0F, 360.0F);
            this.l = atm.a(this.ag, 20, 80);
         }
      } else {
         this.k = atm.a(this.ag, 100, 600);
         this.k = this.k - this.r * 20 * 5;
      }
   }

   private boolean b(ht $$0) {
      cei.b $$1 = cei.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cei.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case c:
               return false;
            case a:
               if ($$1 == cei.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cei.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private cei.b a(ht $$0, ht $$1) {
      return ht.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cei.b.c).orElse(cei.b.c);
   }

   private cei.b c(ht $$0) {
      dhi $$1 = this.dN().a_($$0);
      if (!$$1.i() && !$$1.a(cvc.fm)) {
         ecs $$2 = $$1.u();
         return $$2.a(arl.a) && $$2.b() && $$1.k(this.dN(), $$0).c() ? cei.b.b : cei.b.c;
      } else {
         return cei.b.a;
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

   public int a(clj $$0) {
      cdu $$1 = this.s();
      if (!this.dN().B && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.c(this.o);
            al.D.a((amf)$$1, $$0, this, Collections.emptyList());
            this.dN().a(this, (byte)31);
            $$2 = this.o instanceof can ? 3 : 5;
         } else if (this.j > 0) {
            efd $$3 = new efd.a((ame)this.dN()).a(ehi.f, this.dl()).a(ehi.i, $$0).a(ehi.a, this).a((float)this.q + $$1.gp()).a(ehh.f);
            eff $$4 = this.dN().n().aJ().getLootTable(eev.ai);
            List<clj> $$5 = $$4.a($$3);
            al.D.a((amf)$$1, $$0, this, $$5);

            for (clj $$6 : $$5) {
               can $$7 = new can(this.dN(), this.ds(), this.du(), this.dy(), $$6);
               double $$8 = $$1.ds() - this.ds();
               double $$9 = $$1.du() - this.du();
               double $$10 = $$1.dy() - this.dy();
               double $$11 = 0.1;
               $$7.o($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.dN().b($$7);
               $$1.dN().b(new bkw($$1.dN(), $$1.ds(), $$1.du() + 0.5, $$1.dy() + 0.5, this.ag.a(6) + 1));
               if ($$6.a(aro.ao)) {
                  $$1.a(arb.R, 1);
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
      if ($$0 == 31 && this.dN().B && this.o instanceof cdu && ((cdu)this.o).g()) {
         this.c(this.o);
      }

      super.b($$0);
   }

   protected void c(bkq $$0) {
      bkq $$1 = this.w();
      if ($$1 != null) {
         eju $$2 = new eju($$1.ds() - this.ds(), $$1.du() - this.du(), $$1.dy() - this.dy()).a(0.1);
         $$0.g($$0.dq().e($$2));
      }
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.a;
   }

   @Override
   public void a(bkq.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void ao() {
      this.a(null);
   }

   @Override
   public void b(@Nullable bkq $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable cei $$0) {
      cdu $$1 = this.s();
      if ($$1 != null) {
         $$1.ck = $$0;
      }
   }

   @Nullable
   public cdu s() {
      bkq $$0 = this.w();
      return $$0 instanceof cdu ? (cdu)$$0 : null;
   }

   @Nullable
   public bkq u() {
      return this.o;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public wk<yd> dk() {
      bkq $$0 = this.w();
      return new ye(this, $$0 == null ? this.aj() : $$0.aj());
   }

   @Override
   public void a(ye $$0) {
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
