import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cnp extends cnz implements bxh {
   private static final alg c = alg.b("attacking");
   private static final byg d = new byg(c, 0.15F, byg.a.a);
   private static final int bF = 400;
   private static final int bG = 600;
   private static final akj<Optional<dzz>> bH = akn.a(cnp.class, akl.j);
   private static final akj<Boolean> bI = akn.a(cnp.class, akl.k);
   private static final akj<Boolean> bJ = akn.a(cnp.class, akl.k);
   private int bK = Integer.MIN_VALUE;
   private int bL;
   private static final btm bM = baq.a(20, 39);
   private int bN;
   @Nullable
   private UUID bO;

   public cnp(bwm<? extends cnp> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cnp.a(this));
      this.bC.a(2, new cei(this, 1.0, false));
      this.bC.a(7, new cfl(this, 1.0, 0.0F));
      this.bC.a(8, new ceg(this, cqy.class, 8.0F));
      this.bC.a(8, new cet(this));
      this.bC.a(10, new cnp.b(this));
      this.bC.a(11, new cnp.d(this));
      this.bD.a(1, new cnp.c(this, this::a));
      this.bD.a(2, new cfq(this));
      this.bD.a(3, new cfr<>(this, cnq.class, true, false));
      this.bD.a(4, new cfx<>(this, false));
   }

   public static byh.a j() {
      return cnz.gt().a(byi.s, 40.0).a(byi.v, 0.3F).a(byi.c, 7.0).a(byi.m, 64.0).a(byi.B, 1.0);
   }

   @Override
   public void g(@Nullable bxc $$0) {
      super.g($$0);
      bye $$1 = this.g(byi.v);
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
   protected void a(akn.a $$0) {
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
            this.dV().a(this.dA(), this.dE(), this.dG(), awn.iJ, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (bI.equals($$0) && this.x() && this.dV().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      dzz $$1 = this.q();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uo.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      dzz $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uo.a(this.dV().a(mg.i), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dV(), $$0);
   }

   boolean a(cqy $$0) {
      return !bxc.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dE()});
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
         this.a((arq)this.dV(), true);
      }

      super.k_();
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   protected void a(arq $$0) {
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

   boolean b(bwd $$0) {
      fei $$1 = new fei(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
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

      dzz $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axh.a);
      if ($$5 && !$$6) {
         fei $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(eez.R, $$7, eez.a.a(this));
            if (!this.bb()) {
               this.dV().a(null, this.K, this.L, this.M, awn.iK, this.dm(), 1.0F, 1.0F);
               this.a(awn.iK, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awm u() {
      return this.t() ? awn.iI : awn.iF;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.iH;
   }

   @Override
   protected awm l_() {
      return awn.iG;
   }

   @Override
   protected void a(arq $$0, bus $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dzz $$3 = this.q();
      if ($$3 != null) {
         cyy $$4 = new cyy(czc.pU);
         dfn.a($$4, $$0.F_(), dgz.g, $$0.d_(this.dv()), this.dY());
         ezc.a $$5 = new ezc.a((arq)this.dV()).a(fbt.f, this.dt()).a(fbt.i, $$4).b(fbt.a, this);

         for (cyy $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dzz $$0) {
      this.al.a(bH, Optional.ofNullable($$0));
   }

   @Nullable
   public dzz q() {
      return this.al.a(bH).orElse(null);
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         crh $$4 = $$1.c() instanceof crh $$3 ? $$3 : null;
         if (!$$1.a(axd.j) && $$4 == null) {
            boolean $$7 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bxc) && this.ae.a(10) != 0) {
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

   private boolean a(arq $$0, bus $$1, crh $$2, float $$3) {
      cyy $$4 = $$2.f();
      dau $$5 = $$4.a(kj.R, dau.a);
      return $$5.a(dav.a) ? super.a($$0, $$1, $$3) : false;
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

   static class a extends cdy {
      private final cnp a;
      @Nullable
      private bxc b;

      public a(cnp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.c, cdy.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.f();
         if (this.b instanceof cqy $$0) {
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

   static class b extends cdy {
      private final cnp a;

      public b(cnp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() == null) {
            return false;
         } else {
            return !a(this.a).O().c(dir.c) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azv $$0 = this.a.dY();
         div $$1 = this.a.dV();
         int $$2 = azm.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = azm.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = azm.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         iu $$5 = new iu($$2, $$3, $$4);
         dzz $$6 = $$1.a_($$5);
         iu $$7 = $$5.e();
         dzz $$8 = $$1.a_($$7);
         dzz $$9 = this.a.q();
         if ($$9 != null) {
            $$9 = dma.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(eez.i, $$5, eez.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(div $$0, iu $$1, dzz $$2, dzz $$3, dzz $$4, iu $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dmc.I) && $$4.m($$0, $$5) && $$2.a((diy)$$0, $$1) && $$0.a_(this.a, fed.a(fei.a($$1))).isEmpty();
      }
   }

   static class c extends cfr<cqy> {
      private final cnp i;
      @Nullable
      private cqy j;
      private int k;
      private int l;
      private final chr m;
      private final chr n = chr.a().d();
      private final chr.a o;

      public c(cnp $$0, @Nullable chr.a $$1) {
         super($$0, cqy.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cqy)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = chr.a().a(this.l()).a(this.o);
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
               if (this.i.a((cqy)this.c)) {
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

   static class d extends cdy {
      private final cnp a;

      public d(cnp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() != null) {
            return false;
         } else {
            return !a(this.a).O().c(dir.c) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azv $$0 = this.a.dY();
         div $$1 = this.a.dV();
         int $$2 = azm.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = azm.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = azm.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         iu $$5 = new iu($$2, $$3, $$4);
         dzz $$6 = $$1.a_($$5);
         fei $$7 = new fei((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         fei $$8 = new fei((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fee $$9 = $$1.a(new die($$7, $$8, die.a.b, die.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axc.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(eez.f, $$5, eez.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
