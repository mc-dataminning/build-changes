import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmz extends cnj implements bww {
   private static final ald c = ald.b("attacking");
   private static final bxv d = new bxv(c, 0.15F, bxv.a.a);
   private static final int bE = 400;
   private static final int bF = 600;
   private static final akg<Optional<dym>> bG = akk.a(cmz.class, aki.j);
   private static final akg<Boolean> bH = akk.a(cmz.class, aki.k);
   private static final akg<Boolean> bI = akk.a(cmz.class, aki.k);
   private int bJ = Integer.MIN_VALUE;
   private int bK;
   private static final btb bL = bam.a(20, 39);
   private int bM;
   @Nullable
   private UUID bN;

   public cmz(bwb<? extends cmz> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new cmz.a(this));
      this.bB.a(2, new cdx(this, 1.0, false));
      this.bB.a(7, new cfa(this, 1.0, 0.0F));
      this.bB.a(8, new cdv(this, cqi.class, 8.0F));
      this.bB.a(8, new cei(this));
      this.bB.a(10, new cmz.b(this));
      this.bB.a(11, new cmz.d(this));
      this.bC.a(1, new cmz.c(this, this::a));
      this.bC.a(2, new cff(this));
      this.bC.a(3, new cfg<>(this, cna.class, true, false));
      this.bC.a(4, new cfm<>(this, false));
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.s, 40.0).a(bxx.v, 0.3F).a(bxx.c, 7.0).a(bxx.m, 64.0).a(bxx.B, 1.0);
   }

   @Override
   public void h(@Nullable bwr $$0) {
      super.h($$0);
      bxt $$1 = this.g(bxx.v);
      if ($$0 == null) {
         this.bK = 0;
         this.al.a(bH, false);
         this.al.a(bI, false);
         $$1.c(c);
      } else {
         this.bK = this.af;
         this.al.a(bH, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bG, Optional.empty());
      $$0.a(bH, false);
      $$0.a(bI, false);
   }

   @Override
   public void c() {
      this.a(bL.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bM = $$0;
   }

   @Override
   public int a() {
      return this.bM;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bN = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bN;
   }

   public void m() {
      if (this.af >= this.bJ + 400) {
         this.bJ = this.af;
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awk.iI, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (bH.equals($$0) && this.x() && this.dV().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      dym $$1 = this.q();
      if ($$1 != null) {
         $$0.a("carriedBlockState", ul.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      dym $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = ul.a(this.dV().a(me.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dV(), $$0);
   }

   boolean a(cqi $$0) {
      return !bwr.aG.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dE()});
   }

   @Override
   public void k_() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lv.af, this.d(0.5), this.dD() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.be = false;
      if (!this.dV().C) {
         this.a((arn)this.dV(), true);
      }

      super.k_();
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   protected void a(arn $$0) {
      if ($$0.V() && this.af >= this.bK + 600) {
         float $$1 = this.bx();
         if ($$1 > 0.5F && $$0.h(this.dv()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.h(null);
            this.n();
         }
      }

      super.a($$0);
   }

   protected boolean n() {
      if (!this.dV().w_() && this.bK()) {
         double $$0 = this.dA() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dC() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dG() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bvs $$0) {
      fcu $$1 = new fcu(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dA() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dC() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dG() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jj.a $$3 = new jj.a($$0, $$1, $$2);

      while ($$3.v() > this.dV().G_() && !this.dV().a_($$3).d()) {
         $$3.c(jo.a);
      }

      dym $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axf.a);
      if ($$5 && !$$6) {
         fcu $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(edm.R, $$7, edm.a.a(this));
            if (!this.bb()) {
               this.dV().a(null, this.K, this.L, this.M, awk.iJ, this.dm(), 1.0F, 1.0F);
               this.a(awk.iJ, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awj u() {
      return this.t() ? awk.iH : awk.iE;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.iG;
   }

   @Override
   protected awj l_() {
      return awk.iF;
   }

   @Override
   protected void a(arn $$0, buh $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dym $$3 = this.q();
      if ($$3 != null) {
         cxy $$4 = new cxy(cyc.pS);
         dej.a($$4, $$0.F_(), dfv.g, $$0.d_(this.dv()), this.dY());
         exo.a $$5 = new exo.a((arn)this.dV()).a(faf.f, this.dt()).a(faf.i, $$4).b(faf.a, this);

         for (cxy $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dym $$0) {
      this.al.a(bG, Optional.ofNullable($$0));
   }

   @Nullable
   public dym q() {
      return this.al.a(bG).orElse(null);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof crn;
         if (!$$1.a(axb.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bwr) && this.ae.a(10) != 0) {
               this.n();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (crn)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.n()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(arn $$0, buh $$1, crn $$2, float $$3) {
      cxy $$4 = $$2.f();
      czu $$5 = $$4.a(kx.R, czu.a);
      return $$5.a(czv.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean t() {
      return this.al.a(bH);
   }

   public boolean x() {
      return this.al.a(bI);
   }

   public void gq() {
      this.al.a(bI, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.q() != null;
   }

   static class a extends cdn {
      private final cmz a;
      @Nullable
      private bwr b;

      public a(cmz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.c, cdn.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.f();
         if (this.b instanceof cqi $$0) {
            double $$2 = this.b.g(this.a);
            return $$2 > 256.0 ? false : this.a.a($$0);
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         this.a.O().m();
      }

      @Override
      public void a() {
         this.a.J().a(this.b.dA(), this.b.dE(), this.b.dG());
      }
   }

   static class b extends cdn {
      private final cmz a;

      public b(cmz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() == null) {
            return false;
         } else {
            return !a(this.a).O().c(dhl.c) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azs $$0 = this.a.dY();
         dhp $$1 = this.a.dV();
         int $$2 = azk.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = azk.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = azk.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         jj $$5 = new jj($$2, $$3, $$4);
         dym $$6 = $$1.a_($$5);
         jj $$7 = $$5.e();
         dym $$8 = $$1.a_($$7);
         dym $$9 = this.a.q();
         if ($$9 != null) {
            $$9 = dku.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(edm.i, $$5, edm.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dhp $$0, jj $$1, dym $$2, dym $$3, dym $$4, jj $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dkw.I) && $$4.m($$0, $$5) && $$2.a((dhs)$$0, $$1) && $$0.a_(this.a, fcp.a(fcu.a($$1))).isEmpty();
      }
   }

   static class c extends cfg<cqi> {
      private final cmz i;
      @Nullable
      private cqi j;
      private int k;
      private int l;
      private final chg m;
      private final chg n = chg.a().d();
      private final chg.a o;

      public c(cmz $$0, @Nullable chg.a $$1) {
         super($$0, cqi.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cqi)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = chg.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = a(this.i).a(this.m.a(this.l()), this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gq();
      }

      @Override
      public void e() {
         this.j = null;
         super.e();
      }

      @Override
      public boolean c() {
         if (this.j != null) {
            if (!this.o.test(this.j, a(this.i))) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.A(this.c)) {
                  return false;
               }

               if (this.n.a(a(this.i), this.i, this.c)) {
                  return true;
               }
            }

            return super.c();
         }
      }

      @Override
      public void a() {
         if (this.i.f() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.d();
            }
         } else {
            if (this.c != null && !this.i.bZ()) {
               if (this.i.a((cqi)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.n();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.b(this.c)) {
                  this.l = 0;
               }
            }

            super.a();
         }
      }
   }

   static class d extends cdn {
      private final cmz a;

      public d(cmz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() != null) {
            return false;
         } else {
            return !a(this.a).O().c(dhl.c) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azs $$0 = this.a.dY();
         dhp $$1 = this.a.dV();
         int $$2 = azk.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = azk.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = azk.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         jj $$5 = new jj($$2, $$3, $$4);
         dym $$6 = $$1.a_($$5);
         fcu $$7 = new fcu((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         fcu $$8 = new fcu((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fcq $$9 = $$1.a(new dgy($$7, $$8, dgy.a.b, dgy.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(awz.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(edm.f, $$5, edm.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
