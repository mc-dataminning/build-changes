import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cnt extends cod implements bxj {
   private static final alg c = alg.b("attacking");
   private static final byi d = new byi(c, 0.15F, byi.a.a);
   private static final int bG = 400;
   private static final int bH = 600;
   private static final akj<Optional<eah>> bI = akn.a(cnt.class, akl.j);
   private static final akj<Boolean> bJ = akn.a(cnt.class, akl.k);
   private static final akj<Boolean> bK = akn.a(cnt.class, akl.k);
   private int bL = Integer.MIN_VALUE;
   private int bM;
   private static final bto bN = baq.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;

   public cnt(bwo<? extends cnt> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cnt.a(this));
      this.bD.a(2, new cek(this, 1.0, false));
      this.bD.a(7, new cfn(this, 1.0, 0.0F));
      this.bD.a(8, new cei(this, crc.class, 8.0F));
      this.bD.a(8, new cev(this));
      this.bD.a(10, new cnt.b(this));
      this.bD.a(11, new cnt.d(this));
      this.bE.a(1, new cnt.c(this, this::a));
      this.bE.a(2, new cfs(this));
      this.bE.a(3, new cft<>(this, cnu.class, true, false));
      this.bE.a(4, new cfz<>(this, false));
   }

   public static byj.a j() {
      return cod.gu().a(byk.s, 40.0).a(byk.v, 0.3F).a(byk.c, 7.0).a(byk.m, 64.0).a(byk.B, 1.0);
   }

   @Override
   public void g(@Nullable bxe $$0) {
      super.g($$0);
      byg $$1 = this.g(byk.v);
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
   protected void a(akn.a $$0) {
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
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awn.iL, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (bJ.equals($$0) && this.x() && this.dV().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      eah $$1 = this.q();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uo.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      eah $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uo.a(this.dV().a(mg.i), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dV(), $$0);
   }

   boolean a(crc $$0) {
      return !bxe.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dE()});
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
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(arq $$0) {
      if ($$0.V() && this.af >= this.bM + 600) {
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

   boolean b(bwf $$0) {
      feq $$1 = new feq(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
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

      eah $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axh.a);
      if ($$5 && !$$6) {
         feq $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(efh.R, $$7, efh.a.a(this));
            if (!this.bb()) {
               this.dV().a(null, this.K, this.L, this.M, awn.iM, this.dm(), 1.0F, 1.0F);
               this.a(awn.iM, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awm u() {
      return this.t() ? awn.iK : awn.iH;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.iJ;
   }

   @Override
   protected awm l_() {
      return awn.iI;
   }

   @Override
   protected void a(arq $$0, buu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      eah $$3 = this.q();
      if ($$3 != null) {
         czd $$4 = new czd(czh.pX);
         dfs.a($$4, $$0.F_(), dhe.g, $$0.d_(this.dv()), this.dY());
         ezk.a $$5 = new ezk.a((arq)this.dV()).a(fcb.f, this.dt()).a(fcb.i, $$4).b(fcb.a, this);

         for (czd $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable eah $$0) {
      this.al.a(bI, Optional.ofNullable($$0));
   }

   @Nullable
   public eah q() {
      return this.al.a(bI).orElse(null);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         crm $$4 = $$1.c() instanceof crm $$3 ? $$3 : null;
         if (!$$1.a(axd.j) && $$4 == null) {
            boolean $$7 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bxe) && this.ae.a(10) != 0) {
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

   private boolean a(arq $$0, buu $$1, crm $$2, float $$3) {
      czd $$4 = $$2.f();
      daz $$5 = $$4.a(kj.R, daz.a);
      return $$5.a(dba.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean t() {
      return this.al.a(bJ);
   }

   public boolean x() {
      return this.al.a(bK);
   }

   public void gr() {
      this.al.a(bK, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.q() != null;
   }

   static class a extends cea {
      private final cnt a;
      @Nullable
      private bxe b;

      public a(cnt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.c, cea.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.f();
         if (this.b instanceof crc $$0) {
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

   static class b extends cea {
      private final cnt a;

      public b(cnt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() == null) {
            return false;
         } else {
            return !a(this.a).O().c(diw.d) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azv $$0 = this.a.dY();
         dja $$1 = this.a.dV();
         int $$2 = azm.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = azm.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = azm.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         iu $$5 = new iu($$2, $$3, $$4);
         eah $$6 = $$1.a_($$5);
         iu $$7 = $$5.e();
         eah $$8 = $$1.a_($$7);
         eah $$9 = this.a.q();
         if ($$9 != null) {
            $$9 = dmf.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(efh.i, $$5, efh.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dja $$0, iu $$1, eah $$2, eah $$3, eah $$4, iu $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dmh.I) && $$4.m($$0, $$5) && $$2.a((djd)$$0, $$1) && $$0.a_(this.a, fel.a(feq.a($$1))).isEmpty();
      }
   }

   static class c extends cft<crc> {
      private final cnt i;
      @Nullable
      private crc j;
      private int k;
      private int l;
      private final cht m;
      private final cht n = cht.a().d();
      private final cht.a o;

      public c(cnt $$0, @Nullable cht.a $$1) {
         super($$0, crc.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((crc)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cht.a().a(this.l()).a(this.o);
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
         this.i.gr();
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
               if (this.i.a((crc)this.c)) {
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

   static class d extends cea {
      private final cnt a;

      public d(cnt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() != null) {
            return false;
         } else {
            return !a(this.a).O().c(diw.d) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azv $$0 = this.a.dY();
         dja $$1 = this.a.dV();
         int $$2 = azm.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = azm.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = azm.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         iu $$5 = new iu($$2, $$3, $$4);
         eah $$6 = $$1.a_($$5);
         feq $$7 = new feq((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         feq $$8 = new feq((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fem $$9 = $$1.a(new dij($$7, $$8, dij.a.b, dij.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axc.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(efh.f, $$5, efh.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
