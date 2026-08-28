import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpa extends cpk implements byk {
   private static final alr c = alr.b("attacking");
   private static final bzj d = new bzj(c, 0.15F, bzj.a.a);
   private static final int e = 400;
   private static final int f = 600;
   private static final aku<Optional<ebq>> bI = aky.a(cpa.class, akw.j);
   private static final aku<Boolean> bJ = aky.a(cpa.class, akw.k);
   private static final aku<Boolean> bK = aky.a(cpa.class, akw.k);
   private int bL = Integer.MIN_VALUE;
   private int bM;
   private static final bun bN = bbd.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;

   public cpa(bxn<? extends cpa> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.j, -1.0F);
   }

   @Override
   protected void C() {
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cpa.a(this));
      this.bF.a(2, new cfl(this, 1.0, false));
      this.bF.a(7, new cgo(this, 1.0, 0.0F));
      this.bF.a(8, new cfj(this, csi.class, 8.0F));
      this.bF.a(8, new cfw(this));
      this.bF.a(10, new cpa.b(this));
      this.bF.a(11, new cpa.d(this));
      this.bG.a(1, new cpa.c(this, this::a));
      this.bG.a(2, new cgt(this));
      this.bG.a(3, new cgu<>(this, cpb.class, true, false));
      this.bG.a(4, new cha<>(this, false));
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.s, 40.0).a(bzl.v, 0.3F).a(bzl.c, 7.0).a(bzl.m, 64.0).a(bzl.B, 1.0);
   }

   @Override
   public void g(@Nullable byf $$0) {
      super.g($$0);
      bzh $$1 = this.g(bzl.v);
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
   protected void a(aky.a $$0) {
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

   public void p() {
      if (this.af >= this.bL + 400) {
         this.bL = this.af;
         if (!this.ba()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awy.iL, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aku<?> $$0) {
      if (bJ.equals($$0) && this.gw() && this.dV().C) {
         this.p();
      }

      super.a($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ebq $$1 = this.gu();
      if ($$1 != null) {
         alp<va> $$2 = this.dX().a(uo.a);
         $$0.a("carriedBlockState", ebq.a, $$2, $$1);
      }

      this.a_($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      alp<va> $$1 = this.dX().a(uo.a);
      this.c($$0.<ebq>a("carriedBlockState", ebq.a, $$1).filter($$0x -> !$$0x.l()).orElse(null));
      this.a(this.dV(), $$0);
   }

   boolean a(csi $$0) {
      return !byf.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dE()});
   }

   @Override
   public void d_() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lz.af, this.d(0.5), this.dD() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bf = false;
      if (!this.dV().C) {
         this.a((asb)this.dV(), true);
      }

      super.d_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(asb $$0) {
      if ($$0.V() && this.af >= this.bM + 600) {
         float $$1 = this.bw();
         if ($$1 > 0.5F && $$0.h(this.dv()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.g(null);
            this.u();
         }
      }

      super.a($$0);
   }

   protected boolean u() {
      if (!this.dV().A_() && this.bJ()) {
         double $$0 = this.dA() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dC() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dG() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bxe $$0) {
      fgc $$1 = new fgc(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
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

      ebq $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axs.a);
      if ($$5 && !$$6) {
         fgc $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(egq.R, $$7, egq.a.a(this));
            if (!this.ba()) {
               this.dV().a(null, this.K, this.L, this.M, awy.iM, this.dm(), 1.0F, 1.0F);
               this.a(awy.iM, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awx s() {
      return this.gv() ? awy.iK : awy.iH;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.iJ;
   }

   @Override
   protected awx j_() {
      return awy.iI;
   }

   @Override
   protected void a(asb $$0, bvt $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      ebq $$3 = this.gu();
      if ($$3 != null) {
         dak $$4 = new dak(dao.pX);
         dgz.a($$4, $$0.J_(), dil.g, $$0.d_(this.dv()), this.dY());
         faw.a $$5 = new faw.a((asb)this.dV()).a(fdn.f, this.dt()).a(fdn.i, $$4).b(fdn.a, this);

         for (dak $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable ebq $$0) {
      this.al.a(bI, Optional.ofNullable($$0));
   }

   @Nullable
   public ebq gu() {
      return this.al.a(bI).orElse(null);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         css $$4 = $$1.c() instanceof css $$3 ? $$3 : null;
         if (!$$1.a(axo.j) && $$4 == null) {
            boolean $$7 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof byf) && this.ae.a(10) != 0) {
               this.u();
            }

            return $$7;
         } else {
            boolean $$5 = $$4 != null && this.a($$0, $$1, $$4, $$2);

            for (int $$6 = 0; $$6 < 64; $$6++) {
               if (this.u()) {
                  return true;
               }
            }

            return $$5;
         }
      }
   }

   private boolean a(asb $$0, bvt $$1, css $$2, float $$3) {
      dak $$4 = $$2.e();
      dcg $$5 = $$4.a(kl.R, dcg.a);
      return $$5.a(dch.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean gv() {
      return this.al.a(bJ);
   }

   public boolean gw() {
      return this.al.a(bK);
   }

   public void gx() {
      this.al.a(bK, true);
   }

   @Override
   public boolean Y() {
      return super.Y() || this.gu() != null;
   }

   static class a extends cfb {
      private final cpa a;
      @Nullable
      private byf b;

      public a(cpa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cfb.a.c, cfb.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.e();
         if (this.b instanceof csi $$0) {
            double $$2 = this.b.g(this.a);
            return $$2 > 256.0 ? false : this.a.a($$0);
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         this.a.N().m();
      }

      @Override
      public void a() {
         this.a.I().a(this.b.dA(), this.b.dE(), this.b.dG());
      }
   }

   static class b extends cfb {
      private final cpa a;

      public b(cpa $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gu() == null) {
            return false;
         } else {
            return !a(this.a).O().c(dkf.d) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         bai $$0 = this.a.dY();
         dkj $$1 = this.a.dV();
         int $$2 = azz.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = azz.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = azz.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         iw $$5 = new iw($$2, $$3, $$4);
         ebq $$6 = $$1.a_($$5);
         iw $$7 = $$5.e();
         ebq $$8 = $$1.a_($$7);
         ebq $$9 = this.a.gu();
         if ($$9 != null) {
            $$9 = dno.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(egq.i, $$5, egq.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dkj $$0, iw $$1, ebq $$2, ebq $$3, ebq $$4, iw $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dnq.I) && $$4.m($$0, $$5) && $$2.a((dkm)$$0, $$1) && $$0.a_(this.a, ffx.a(fgc.a($$1))).isEmpty();
      }
   }

   static class c extends cgu<csi> {
      private final cpa i;
      @Nullable
      private csi j;
      private int k;
      private int l;
      private final ciu m;
      private final ciu n = ciu.a().d();
      private final ciu.a o;

      public c(cpa $$0, @Nullable ciu.a $$1) {
         super($$0, csi.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((csi)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = ciu.a().a(this.l()).a(this.o);
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
         this.i.gx();
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
         if (this.i.e() == null) {
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
               if (this.i.a((csi)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.u();
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

   static class d extends cfb {
      private final cpa a;

      public d(cpa $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gu() != null) {
            return false;
         } else {
            return !a(this.a).O().c(dkf.d) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         bai $$0 = this.a.dY();
         dkj $$1 = this.a.dV();
         int $$2 = azz.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = azz.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = azz.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         iw $$5 = new iw($$2, $$3, $$4);
         ebq $$6 = $$1.a_($$5);
         fgc $$7 = new fgc((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         fgc $$8 = new fgc((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ffy $$9 = $$1.a(new djq($$7, $$8, djq.a.b, djq.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axn.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(egq.f, $$5, egq.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
