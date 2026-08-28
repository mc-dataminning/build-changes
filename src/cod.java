import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cod extends coo implements bxo {
   private static final alg c = alg.b("attacking");
   private static final byn d = new byn(c, 0.15F, byn.a.a);
   private static final int bG = 400;
   private static final int bH = 600;
   private static final akj<Optional<eat>> bI = akn.a(cod.class, akl.j);
   private static final akj<Boolean> bJ = akn.a(cod.class, akl.k);
   private static final akj<Boolean> bK = akn.a(cod.class, akl.k);
   private int bL = Integer.MIN_VALUE;
   private int bM;
   private static final btr bN = baq.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;

   public cod(bwr<? extends cod> $$0, djm $$1) {
      super($$0, $$1);
      this.a(exr.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cod.a(this));
      this.bD.a(2, new cep(this, 1.0, false));
      this.bD.a(7, new cfs(this, 1.0, 0.0F));
      this.bD.a(8, new cen(this, crm.class, 8.0F));
      this.bD.a(8, new cfa(this));
      this.bD.a(10, new cod.b(this));
      this.bD.a(11, new cod.d(this));
      this.bE.a(1, new cod.c(this, this::a));
      this.bE.a(2, new cfx(this));
      this.bE.a(3, new cfy<>(this, coe.class, true, false));
      this.bE.a(4, new cge<>(this, false));
   }

   public static byo.a j() {
      return coo.gw().a(byp.s, 40.0).a(byp.v, 0.3F).a(byp.c, 7.0).a(byp.m, 64.0).a(byp.B, 1.0);
   }

   @Override
   public void g(@Nullable bxj $$0) {
      super.g($$0);
      byl $$1 = this.g(byp.v);
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
         if (!this.aZ()) {
            this.dU().a(this.dz(), this.dD(), this.dF(), awn.iL, this.dl(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (bJ.equals($$0) && this.x() && this.dU().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      eat $$1 = this.q();
      if ($$1 != null) {
         ale<uw> $$2 = this.dW().a(un.a);
         $$0.a("carriedBlockState", eat.a, $$2, $$1);
      }

      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      this.c($$0.<eat>a("carriedBlockState", eat.a, $$1).filter($$0x -> !$$0x.l()).orElse(null));
      this.a(this.dU(), $$0);
   }

   boolean a(crm $$0) {
      return !bxj.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dD()});
   }

   @Override
   public void k_() {
      if (this.dU().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dU().a(ly.af, this.d(0.5), this.dC() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bf = false;
      if (!this.dU().C) {
         this.a((arq)this.dU(), true);
      }

      super.k_();
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   protected void a(arq $$0) {
      if ($$0.V() && this.af >= this.bM + 600) {
         float $$1 = this.bv();
         if ($$1 > 0.5F && $$0.h(this.du()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.g(null);
            this.n();
         }
      }

      super.a($$0);
   }

   protected boolean n() {
      if (!this.dU().w_() && this.bI()) {
         double $$0 = this.dz() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dB() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dF() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bwi $$0) {
      ffc $$1 = new ffc(this.dz() - $$0.dz(), this.e(0.5) - $$0.dD(), this.dF() - $$0.dF());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dz() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dB() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dF() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      iv.a $$3 = new iv.a($$0, $$1, $$2);

      while ($$3.v() > this.dU().G_() && !this.dU().a_($$3).d()) {
         $$3.c(jb.a);
      }

      eat $$4 = this.dU().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axh.a);
      if ($$5 && !$$6) {
         ffc $$7 = this.ds();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dU().a(eft.R, $$7, eft.a.a(this));
            if (!this.aZ()) {
               this.dU().a(null, this.K, this.L, this.M, awn.iM, this.dl(), 1.0F, 1.0F);
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
   protected awm e(bux $$0) {
      return awn.iJ;
   }

   @Override
   protected awm l_() {
      return awn.iI;
   }

   @Override
   protected void a(arq $$0, bux $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      eat $$3 = this.q();
      if ($$3 != null) {
         czn $$4 = new czn(czr.pX);
         dgc.a($$4, $$0.F_(), dho.g, $$0.d_(this.du()), this.dX());
         ezw.a $$5 = new ezw.a((arq)this.dU()).a(fcn.f, this.ds()).a(fcn.i, $$4).b(fcn.a, this);

         for (czn $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable eat $$0) {
      this.al.a(bI, Optional.ofNullable($$0));
   }

   @Nullable
   public eat q() {
      return this.al.a(bI).orElse(null);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         crw $$4 = $$1.c() instanceof crw $$3 ? $$3 : null;
         if (!$$1.a(axd.j) && $$4 == null) {
            boolean $$7 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bxj) && this.ae.a(10) != 0) {
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

   private boolean a(arq $$0, bux $$1, crw $$2, float $$3) {
      czn $$4 = $$2.f();
      dbj $$5 = $$4.a(kk.R, dbj.a);
      return $$5.a(dbk.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean t() {
      return this.al.a(bJ);
   }

   public boolean x() {
      return this.al.a(bK);
   }

   public void gt() {
      this.al.a(bK, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.q() != null;
   }

   static class a extends cef {
      private final cod a;
      @Nullable
      private bxj b;

      public a(cod $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.c, cef.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.f();
         if (this.b instanceof crm $$0) {
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
         this.a.J().a(this.b.dz(), this.b.dD(), this.b.dF());
      }
   }

   static class b extends cef {
      private final cod a;

      public b(cod $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() == null) {
            return false;
         } else {
            return !a(this.a).O().c(dji.d) ? false : this.a.dX().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azv $$0 = this.a.dX();
         djm $$1 = this.a.dU();
         int $$2 = azm.a(this.a.dz() - 1.0 + $$0.j() * 2.0);
         int $$3 = azm.a(this.a.dB() + $$0.j() * 2.0);
         int $$4 = azm.a(this.a.dF() - 1.0 + $$0.j() * 2.0);
         iv $$5 = new iv($$2, $$3, $$4);
         eat $$6 = $$1.a_($$5);
         iv $$7 = $$5.e();
         eat $$8 = $$1.a_($$7);
         eat $$9 = this.a.q();
         if ($$9 != null) {
            $$9 = dmr.b($$9, this.a.dU(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(eft.i, $$5, eft.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(djm $$0, iv $$1, eat $$2, eat $$3, eat $$4, iv $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dmt.I) && $$4.m($$0, $$5) && $$2.a((djp)$$0, $$1) && $$0.a_(this.a, fex.a(ffc.a($$1))).isEmpty();
      }
   }

   static class c extends cfy<crm> {
      private final cod i;
      @Nullable
      private crm j;
      private int k;
      private int l;
      private final chy m;
      private final chy n = chy.a().d();
      private final chy.a o;

      public c(cod $$0, @Nullable chy.a $$1) {
         super($$0, crm.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((crm)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = chy.a().a(this.l()).a(this.o);
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
         this.i.gt();
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
            if (this.c != null && !this.i.bX()) {
               if (this.i.a((crm)this.c)) {
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

   static class d extends cef {
      private final cod a;

      public d(cod $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() != null) {
            return false;
         } else {
            return !a(this.a).O().c(dji.d) ? false : this.a.dX().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azv $$0 = this.a.dX();
         djm $$1 = this.a.dU();
         int $$2 = azm.a(this.a.dz() - 2.0 + $$0.j() * 4.0);
         int $$3 = azm.a(this.a.dB() + $$0.j() * 3.0);
         int $$4 = azm.a(this.a.dF() - 2.0 + $$0.j() * 4.0);
         iv $$5 = new iv($$2, $$3, $$4);
         eat $$6 = $$1.a_($$5);
         ffc $$7 = new ffc((double)this.a.dy() + 0.5, (double)$$3 + 0.5, (double)this.a.dE() + 0.5);
         ffc $$8 = new ffc((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fey $$9 = $$1.a(new dit($$7, $$8, dit.a.b, dit.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axc.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(eft.f, $$5, eft.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
