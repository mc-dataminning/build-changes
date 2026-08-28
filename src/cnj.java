import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cnj extends cnt implements bxe {
   private static final ale c = ale.b("attacking");
   private static final byd d = new byd(c, 0.15F, byd.a.a);
   private static final int bF = 400;
   private static final int bG = 600;
   private static final akh<Optional<dzo>> bH = akl.a(cnj.class, akj.j);
   private static final akh<Boolean> bI = akl.a(cnj.class, akj.k);
   private static final akh<Boolean> bJ = akl.a(cnj.class, akj.k);
   private int bK = Integer.MIN_VALUE;
   private int bL;
   private static final btj bM = bao.a(20, 39);
   private int bN;
   @Nullable
   private UUID bO;

   public cnj(bwj<? extends cnj> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new cnj.a(this));
      this.bC.a(2, new cef(this, 1.0, false));
      this.bC.a(7, new cfi(this, 1.0, 0.0F));
      this.bC.a(8, new ced(this, cqs.class, 8.0F));
      this.bC.a(8, new ceq(this));
      this.bC.a(10, new cnj.b(this));
      this.bC.a(11, new cnj.d(this));
      this.bD.a(1, new cnj.c(this, this::a));
      this.bD.a(2, new cfn(this));
      this.bD.a(3, new cfo<>(this, cnk.class, true, false));
      this.bD.a(4, new cfu<>(this, false));
   }

   public static bye.a j() {
      return cnt.gt().a(byf.s, 40.0).a(byf.v, 0.3F).a(byf.c, 7.0).a(byf.m, 64.0).a(byf.B, 1.0);
   }

   @Override
   public void g(@Nullable bwz $$0) {
      super.g($$0);
      byb $$1 = this.g(byf.v);
      if ($$0 == null) {
         this.bL = 0;
         this.al.a(bI, false);
         this.al.a(bJ, false);
         $$1.c(c);
      } else {
         this.bL = this.af;
         this.al.a(bI, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bH, Optional.empty());
      $$0.a(bI, false);
      $$0.a(bJ, false);
   }

   @Override
   public void c() {
      this.a(bM.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bN = $$0;
   }

   @Override
   public int a() {
      return this.bN;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bO = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bO;
   }

   public void m() {
      if (this.af >= this.bK + 400) {
         this.bK = this.af;
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awl.iI, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akh<?> $$0) {
      if (bI.equals($$0) && this.x() && this.dV().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      dzo $$1 = this.q();
      if ($$1 != null) {
         $$0.a("carriedBlockState", um.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      dzo $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = um.a(this.dV().a(mg.i), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dV(), $$0);
   }

   boolean a(cqs $$0) {
      return !bwz.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dE()});
   }

   @Override
   public void k_() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lx.af, this.d(0.5), this.dD() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bf = false;
      if (!this.dV().C) {
         this.a((aro)this.dV(), true);
      }

      super.k_();
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   protected void a(aro $$0) {
      if ($$0.V() && this.af >= this.bL + 600) {
         float $$1 = this.bx();
         if ($$1 > 0.5F && $$0.h(this.dv()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.g(null);
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

   boolean b(bwa $$0) {
      fdw $$1 = new fdw(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dA() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dC() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dG() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      iu.a $$3 = new iu.a($$0, $$1, $$2);

      while ($$3.v() > this.dV().G_() && !this.dV().a_($$3).d()) {
         $$3.c(ja.a);
      }

      dzo $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axf.a);
      if ($$5 && !$$6) {
         fdw $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(eeo.R, $$7, eeo.a.a(this));
            if (!this.bb()) {
               this.dV().a(null, this.K, this.L, this.M, awl.iJ, this.dm(), 1.0F, 1.0F);
               this.a(awl.iJ, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awk u() {
      return this.t() ? awl.iH : awl.iE;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.iG;
   }

   @Override
   protected awk l_() {
      return awl.iF;
   }

   @Override
   protected void a(aro $$0, bup $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dzo $$3 = this.q();
      if ($$3 != null) {
         cys $$4 = new cys(cyw.pS);
         dfh.a($$4, $$0.F_(), dgt.g, $$0.d_(this.dv()), this.dY());
         eyq.a $$5 = new eyq.a((aro)this.dV()).a(fbh.f, this.dt()).a(fbh.i, $$4).b(fbh.a, this);

         for (cys $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dzo $$0) {
      this.al.a(bH, Optional.ofNullable($$0));
   }

   @Nullable
   public dzo q() {
      return this.al.a(bH).orElse(null);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         crb $$4 = $$1.c() instanceof crb $$3 ? $$3 : null;
         if (!$$1.a(axb.j) && $$4 == null) {
            boolean $$7 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bwz) && this.ae.a(10) != 0) {
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

   private boolean a(aro $$0, bup $$1, crb $$2, float $$3) {
      cys $$4 = $$2.ae_();
      dao $$5 = $$4.a(kj.R, dao.a);
      return $$5.a(dap.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean t() {
      return this.al.a(bI);
   }

   public boolean x() {
      return this.al.a(bJ);
   }

   public void gq() {
      this.al.a(bJ, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.q() != null;
   }

   static class a extends cdv {
      private final cnj a;
      @Nullable
      private bwz b;

      public a(cnj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.c, cdv.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.f();
         if (this.b instanceof cqs $$0) {
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

   static class b extends cdv {
      private final cnj a;

      public b(cnj $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() == null) {
            return false;
         } else {
            return !a(this.a).O().c(dil.c) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azt $$0 = this.a.dY();
         dip $$1 = this.a.dV();
         int $$2 = azk.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = azk.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = azk.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         iu $$5 = new iu($$2, $$3, $$4);
         dzo $$6 = $$1.a_($$5);
         iu $$7 = $$5.e();
         dzo $$8 = $$1.a_($$7);
         dzo $$9 = this.a.q();
         if ($$9 != null) {
            $$9 = dlu.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(eeo.i, $$5, eeo.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dip $$0, iu $$1, dzo $$2, dzo $$3, dzo $$4, iu $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dlw.I) && $$4.m($$0, $$5) && $$2.a((dis)$$0, $$1) && $$0.a_(this.a, fdr.a(fdw.a($$1))).isEmpty();
      }
   }

   static class c extends cfo<cqs> {
      private final cnj i;
      @Nullable
      private cqs j;
      private int k;
      private int l;
      private final cho m;
      private final cho n = cho.a().d();
      private final cho.a o;

      public c(cnj $$0, @Nullable cho.a $$1) {
         super($$0, cqs.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cqs)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cho.a().a(this.l()).a(this.o);
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
               if (this.i.a((cqs)this.c)) {
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

   static class d extends cdv {
      private final cnj a;

      public d(cnj $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() != null) {
            return false;
         } else {
            return !a(this.a).O().c(dil.c) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azt $$0 = this.a.dY();
         dip $$1 = this.a.dV();
         int $$2 = azk.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = azk.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = azk.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         iu $$5 = new iu($$2, $$3, $$4);
         dzo $$6 = $$1.a_($$5);
         fdw $$7 = new fdw((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         fdw $$8 = new fdw((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fds $$9 = $$1.a(new dhy($$7, $$8, dhy.a.b, dhy.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axa.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(eeo.f, $$5, eeo.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
