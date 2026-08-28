import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cop extends coz implements bxz {
   private static final ali c = ali.b("attacking");
   private static final byy d = new byy(c, 0.15F, byy.a.a);
   private static final int e = 400;
   private static final int f = 600;
   private static final akl<Optional<ebe>> bI = akp.a(cop.class, akn.j);
   private static final akl<Boolean> bJ = akp.a(cop.class, akn.k);
   private static final akl<Boolean> bK = akp.a(cop.class, akn.k);
   private int bL = Integer.MIN_VALUE;
   private int bM;
   private static final buc bN = bas.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;

   public cop(bxc<? extends cop> $$0, djx $$1) {
      super($$0, $$1);
      this.a(eyf.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cop.a(this));
      this.bF.a(2, new cfa(this, 1.0, false));
      this.bF.a(7, new cgd(this, 1.0, 0.0F));
      this.bF.a(8, new cey(this, crx.class, 8.0F));
      this.bF.a(8, new cfl(this));
      this.bF.a(10, new cop.b(this));
      this.bF.a(11, new cop.d(this));
      this.bG.a(1, new cop.c(this, this::a));
      this.bG.a(2, new cgi(this));
      this.bG.a(3, new cgj<>(this, coq.class, true, false));
      this.bG.a(4, new cgp<>(this, false));
   }

   public static byz.a j() {
      return coz.gx().a(bza.s, 40.0).a(bza.v, 0.3F).a(bza.c, 7.0).a(bza.m, 64.0).a(bza.B, 1.0);
   }

   @Override
   public void g(@Nullable bxu $$0) {
      super.g($$0);
      byw $$1 = this.g(bza.v);
      if ($$0 == null) {
         this.bM = 0;
         this.al.a(bJ, false);
         this.al.a(bK, false);
         $$1.c(c);
      } else {
         this.bM = this.af;
         this.al.a(bJ, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bI, Optional.empty());
      $$0.a(bJ, false);
      $$0.a(bK, false);
   }

   @Override
   public void c() {
      this.a(bN.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bO = $$0;
   }

   @Override
   public int a() {
      return this.bO;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bP = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bP;
   }

   public void m() {
      if (this.af >= this.bL + 400) {
         this.bL = this.af;
         if (!this.ba()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awp.iL, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akl<?> $$0) {
      if (bJ.equals($$0) && this.x() && this.dV().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ebe $$1 = this.q();
      if ($$1 != null) {
         alg<uy> $$2 = this.dX().a(un.a);
         $$0.a("carriedBlockState", ebe.a, $$2, $$1);
      }

      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      alg<uy> $$1 = this.dX().a(un.a);
      this.c($$0.<ebe>a("carriedBlockState", ebe.a, $$1).filter($$0x -> !$$0x.l()).orElse(null));
      this.a(this.dV(), $$0);
   }

   boolean a(crx $$0) {
      return !bxu.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dE()});
   }

   @Override
   public void k_() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(ly.af, this.d(0.5), this.dD() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bf = false;
      if (!this.dV().C) {
         this.a((ars)this.dV(), true);
      }

      super.k_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(ars $$0) {
      if ($$0.V() && this.af >= this.bM + 600) {
         float $$1 = this.bw();
         if ($$1 > 0.5F && $$0.h(this.dv()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.g(null);
            this.n();
         }
      }

      super.a($$0);
   }

   protected boolean n() {
      if (!this.dV().A_() && this.bJ()) {
         double $$0 = this.dA() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dC() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dG() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bwt $$0) {
      ffq $$1 = new ffq(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dA() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dC() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dG() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      iv.a $$3 = new iv.a($$0, $$1, $$2);

      while ($$3.v() > this.dV().K_() && !this.dV().a_($$3).d()) {
         $$3.c(jb.a);
      }

      ebe $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axj.a);
      if ($$5 && !$$6) {
         ffq $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(ege.R, $$7, ege.a.a(this));
            if (!this.ba()) {
               this.dV().a(null, this.K, this.L, this.M, awp.iM, this.dm(), 1.0F, 1.0F);
               this.a(awp.iM, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awo u() {
      return this.t() ? awp.iK : awp.iH;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.iJ;
   }

   @Override
   protected awo l_() {
      return awp.iI;
   }

   @Override
   protected void a(ars $$0, bvi $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      ebe $$3 = this.q();
      if ($$3 != null) {
         czy $$4 = new czy(dac.pX);
         dgn.a($$4, $$0.J_(), dhz.g, $$0.d_(this.dv()), this.dY());
         fak.a $$5 = new fak.a((ars)this.dV()).a(fdb.f, this.dt()).a(fdb.i, $$4).b(fdb.a, this);

         for (czy $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable ebe $$0) {
      this.al.a(bI, Optional.ofNullable($$0));
   }

   @Nullable
   public ebe q() {
      return this.al.a(bI).orElse(null);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         csh $$4 = $$1.c() instanceof csh $$3 ? $$3 : null;
         if (!$$1.a(axf.j) && $$4 == null) {
            boolean $$7 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bxu) && this.ae.a(10) != 0) {
               this.n();
            }

            return $$7;
         } else {
            boolean $$5 = $$4 != null && this.a($$0, $$1, $$4, $$2);

            for (int $$6 = 0; $$6 < 64; $$6++) {
               if (this.n()) {
                  return true;
               }
            }

            return $$5;
         }
      }
   }

   private boolean a(ars $$0, bvi $$1, csh $$2, float $$3) {
      czy $$4 = $$2.f();
      dbu $$5 = $$4.a(kk.R, dbu.a);
      return $$5.a(dbv.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean t() {
      return this.al.a(bJ);
   }

   public boolean x() {
      return this.al.a(bK);
   }

   public void gu() {
      this.al.a(bK, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.q() != null;
   }

   static class a extends ceq {
      private final cop a;
      @Nullable
      private bxu b;

      public a(cop $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.c, ceq.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.f();
         if (this.b instanceof crx $$0) {
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

   static class b extends ceq {
      private final cop a;

      public b(cop $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() == null) {
            return false;
         } else {
            return !a(this.a).O().c(djt.d) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azx $$0 = this.a.dY();
         djx $$1 = this.a.dV();
         int $$2 = azo.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = azo.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = azo.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         iv $$5 = new iv($$2, $$3, $$4);
         ebe $$6 = $$1.a_($$5);
         iv $$7 = $$5.e();
         ebe $$8 = $$1.a_($$7);
         ebe $$9 = this.a.q();
         if ($$9 != null) {
            $$9 = dnc.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ege.i, $$5, ege.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(djx $$0, iv $$1, ebe $$2, ebe $$3, ebe $$4, iv $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dne.I) && $$4.m($$0, $$5) && $$2.a((dka)$$0, $$1) && $$0.a_(this.a, ffl.a(ffq.a($$1))).isEmpty();
      }
   }

   static class c extends cgj<crx> {
      private final cop i;
      @Nullable
      private crx j;
      private int k;
      private int l;
      private final cij m;
      private final cij n = cij.a().d();
      private final cij.a o;

      public c(cop $$0, @Nullable cij.a $$1) {
         super($$0, crx.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((crx)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cij.a().a(this.l()).a(this.o);
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
         this.i.gu();
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
            if (this.c != null && !this.i.bY()) {
               if (this.i.a((crx)this.c)) {
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

   static class d extends ceq {
      private final cop a;

      public d(cop $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() != null) {
            return false;
         } else {
            return !a(this.a).O().c(djt.d) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azx $$0 = this.a.dY();
         djx $$1 = this.a.dV();
         int $$2 = azo.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = azo.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = azo.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         iv $$5 = new iv($$2, $$3, $$4);
         ebe $$6 = $$1.a_($$5);
         ffq $$7 = new ffq((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         ffq $$8 = new ffq((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ffm $$9 = $$1.a(new dje($$7, $$8, dje.a.b, dje.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axe.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(ege.f, $$5, ege.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
