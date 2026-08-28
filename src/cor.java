import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cor extends cpb implements byb {
   private static final alk c = alk.b("attacking");
   private static final bza d = new bza(c, 0.15F, bza.a.a);
   private static final int e = 400;
   private static final int f = 600;
   private static final akn<Optional<ebg>> bI = akr.a(cor.class, akp.j);
   private static final akn<Boolean> bJ = akr.a(cor.class, akp.k);
   private static final akn<Boolean> bK = akr.a(cor.class, akp.k);
   private int bL = Integer.MIN_VALUE;
   private int bM;
   private static final bue bN = bau.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;

   public cor(bxe<? extends cor> $$0, djz $$1) {
      super($$0, $$1);
      this.a(eyh.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cor.a(this));
      this.bF.a(2, new cfc(this, 1.0, false));
      this.bF.a(7, new cgf(this, 1.0, 0.0F));
      this.bF.a(8, new cfa(this, crz.class, 8.0F));
      this.bF.a(8, new cfn(this));
      this.bF.a(10, new cor.b(this));
      this.bF.a(11, new cor.d(this));
      this.bG.a(1, new cor.c(this, this::a));
      this.bG.a(2, new cgk(this));
      this.bG.a(3, new cgl<>(this, cos.class, true, false));
      this.bG.a(4, new cgr<>(this, false));
   }

   public static bzb.a j() {
      return cpb.gx().a(bzc.s, 40.0).a(bzc.v, 0.3F).a(bzc.c, 7.0).a(bzc.m, 64.0).a(bzc.B, 1.0);
   }

   @Override
   public void g(@Nullable bxw $$0) {
      super.g($$0);
      byy $$1 = this.g(bzc.v);
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
   protected void a(akr.a $$0) {
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
            this.dV().a(this.dA(), this.dE(), this.dG(), awr.iL, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akn<?> $$0) {
      if (bJ.equals($$0) && this.x() && this.dV().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ebg $$1 = this.q();
      if ($$1 != null) {
         ali<va> $$2 = this.dX().a(uo.a);
         $$0.a("carriedBlockState", ebg.a, $$2, $$1);
      }

      this.a_($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      ali<va> $$1 = this.dX().a(uo.a);
      this.c($$0.<ebg>a("carriedBlockState", ebg.a, $$1).filter($$0x -> !$$0x.l()).orElse(null));
      this.a(this.dV(), $$0);
   }

   boolean a(crz $$0) {
      return !bxw.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dE()});
   }

   @Override
   public void k_() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lz.af, this.d(0.5), this.dD() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bf = false;
      if (!this.dV().C) {
         this.a((aru)this.dV(), true);
      }

      super.k_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(aru $$0) {
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

   boolean b(bwv $$0) {
      ffs $$1 = new ffs(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dA() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dC() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dG() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      iw.a $$3 = new iw.a($$0, $$1, $$2);

      while ($$3.v() > this.dV().K_() && !this.dV().a_($$3).d()) {
         $$3.c(jc.a);
      }

      ebg $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axl.a);
      if ($$5 && !$$6) {
         ffs $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(egg.R, $$7, egg.a.a(this));
            if (!this.ba()) {
               this.dV().a(null, this.K, this.L, this.M, awr.iM, this.dm(), 1.0F, 1.0F);
               this.a(awr.iM, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awq u() {
      return this.t() ? awr.iK : awr.iH;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.iJ;
   }

   @Override
   protected awq l_() {
      return awr.iI;
   }

   @Override
   protected void a(aru $$0, bvk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      ebg $$3 = this.q();
      if ($$3 != null) {
         daa $$4 = new daa(dae.pX);
         dgp.a($$4, $$0.J_(), dib.g, $$0.d_(this.dv()), this.dY());
         fam.a $$5 = new fam.a((aru)this.dV()).a(fdd.f, this.dt()).a(fdd.i, $$4).b(fdd.a, this);

         for (daa $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable ebg $$0) {
      this.al.a(bI, Optional.ofNullable($$0));
   }

   @Nullable
   public ebg q() {
      return this.al.a(bI).orElse(null);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         csj $$4 = $$1.c() instanceof csj $$3 ? $$3 : null;
         if (!$$1.a(axh.j) && $$4 == null) {
            boolean $$7 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bxw) && this.ae.a(10) != 0) {
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

   private boolean a(aru $$0, bvk $$1, csj $$2, float $$3) {
      daa $$4 = $$2.f();
      dbw $$5 = $$4.a(kl.R, dbw.a);
      return $$5.a(dbx.a) ? super.a($$0, $$1, $$3) : false;
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

   static class a extends ces {
      private final cor a;
      @Nullable
      private bxw b;

      public a(cor $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.c, ces.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.f();
         if (this.b instanceof crz $$0) {
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

   static class b extends ces {
      private final cor a;

      public b(cor $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() == null) {
            return false;
         } else {
            return !a(this.a).O().c(djv.d) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azz $$0 = this.a.dY();
         djz $$1 = this.a.dV();
         int $$2 = azq.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = azq.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = azq.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         iw $$5 = new iw($$2, $$3, $$4);
         ebg $$6 = $$1.a_($$5);
         iw $$7 = $$5.e();
         ebg $$8 = $$1.a_($$7);
         ebg $$9 = this.a.q();
         if ($$9 != null) {
            $$9 = dne.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(egg.i, $$5, egg.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(djz $$0, iw $$1, ebg $$2, ebg $$3, ebg $$4, iw $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dng.I) && $$4.m($$0, $$5) && $$2.a((dkc)$$0, $$1) && $$0.a_(this.a, ffn.a(ffs.a($$1))).isEmpty();
      }
   }

   static class c extends cgl<crz> {
      private final cor i;
      @Nullable
      private crz j;
      private int k;
      private int l;
      private final cil m;
      private final cil n = cil.a().d();
      private final cil.a o;

      public c(cor $$0, @Nullable cil.a $$1) {
         super($$0, crz.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((crz)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cil.a().a(this.l()).a(this.o);
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
               if (this.i.a((crz)this.c)) {
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

   static class d extends ces {
      private final cor a;

      public d(cor $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() != null) {
            return false;
         } else {
            return !a(this.a).O().c(djv.d) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azz $$0 = this.a.dY();
         djz $$1 = this.a.dV();
         int $$2 = azq.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = azq.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = azq.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         iw $$5 = new iw($$2, $$3, $$4);
         ebg $$6 = $$1.a_($$5);
         ffs $$7 = new ffs((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         ffs $$8 = new ffs((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ffo $$9 = $$1.a(new djg($$7, $$8, djg.a.b, djg.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axg.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(egg.f, $$5, egg.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
