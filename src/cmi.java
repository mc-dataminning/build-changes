import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmi extends cms implements bwd {
   private static final aku c = aku.b("attacking");
   private static final bxe d = new bxe(c, 0.15F, bxe.a.a);
   private static final int bF = 400;
   private static final int bG = 600;
   private static final ajx<Optional<dxq>> bH = akb.a(cmi.class, ajz.j);
   private static final ajx<Boolean> bI = akb.a(cmi.class, ajz.k);
   private static final ajx<Boolean> bJ = akb.a(cmi.class, ajz.k);
   private int bK = Integer.MIN_VALUE;
   private int bL;
   private static final bsj bM = bab.a(20, 39);
   private int bN;
   @Nullable
   private UUID bO;

   public cmi(bvi<? extends cmi> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cmi.a(this));
      this.bC.a(2, new cdg(this, 1.0, false));
      this.bC.a(7, new cej(this, 1.0, 0.0F));
      this.bC.a(8, new cde(this, cpr.class, 8.0F));
      this.bC.a(8, new cdr(this));
      this.bC.a(10, new cmi.b(this));
      this.bC.a(11, new cmi.d(this));
      this.bD.a(1, new cmi.c(this, this::a));
      this.bD.a(2, new ceo(this));
      this.bD.a(3, new cep<>(this, cmj.class, true, false));
      this.bD.a(4, new cev<>(this, false));
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.s, 40.0).a(bxg.v, 0.3F).a(bxg.c, 7.0).a(bxg.m, 64.0).a(bxg.B, 1.0);
   }

   @Override
   public void h(@Nullable bvy $$0) {
      super.h($$0);
      bxc $$1 = this.g(bxg.v);
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
   protected void a(akb.a $$0) {
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
            this.dU().a(this.dz(), this.dD(), this.dF(), awa.iI, this.dl(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bI.equals($$0) && this.x() && this.dU().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      dxq $$1 = this.q();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uf.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      dxq $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uf.a(this.dU().a(mc.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dU(), $$0);
   }

   boolean a(cpr $$0) {
      return !bvy.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dD()});
   }

   @Override
   public void k_() {
      if (this.dU().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dU().a(lt.af, this.d(0.5), this.dC() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bf = false;
      if (!this.dU().C) {
         this.a((ard)this.dU(), true);
      }

      super.k_();
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   protected void a(ard $$0) {
      if ($$0.V() && this.af >= this.bL + 600) {
         float $$1 = this.bw();
         if ($$1 > 0.5F && $$0.h(this.du()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.h(null);
            this.n();
         }
      }

      super.a($$0);
   }

   protected boolean n() {
      if (!this.dU().w_() && this.bJ()) {
         double $$0 = this.dz() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dB() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dF() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bva $$0) {
      fbx $$1 = new fbx(this.dz() - $$0.dz(), this.e(0.5) - $$0.dD(), this.dF() - $$0.dF());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dz() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dB() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dF() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      ji.a $$3 = new ji.a($$0, $$1, $$2);

      while ($$3.v() > this.dU().G_() && !this.dU().a_($$3).d()) {
         $$3.c(jn.a);
      }

      dxq $$4 = this.dU().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(awv.a);
      if ($$5 && !$$6) {
         fbx $$7 = this.ds();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dU().a(ecp.R, $$7, ecp.a.a(this));
            if (!this.bb()) {
               this.dU().a(null, this.K, this.L, this.M, awa.iJ, this.dl(), 1.0F, 1.0F);
               this.a(awa.iJ, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avz u() {
      return this.t() ? awa.iH : awa.iE;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.iG;
   }

   @Override
   protected avz l_() {
      return awa.iF;
   }

   @Override
   protected void a(ard $$0, btp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dxq $$3 = this.q();
      if ($$3 != null) {
         cxh $$4 = new cxh(cxl.pQ);
         ddt.a($$4, $$0.F_(), dff.g, $$0.d_(this.du()), this.dX());
         ewr.a $$5 = new ewr.a((ard)this.dU()).a(ezi.f, this.ds()).a(ezi.i, $$4).b(ezi.a, this);

         for (cxh $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dxq $$0) {
      this.al.a(bH, Optional.ofNullable($$0));
   }

   @Nullable
   public dxq q() {
      return this.al.a(bH).orElse(null);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof cqw;
         if (!$$1.a(awr.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bvy) && this.ae.a(10) != 0) {
               this.n();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (cqw)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.n()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(ard $$0, btp $$1, cqw $$2, float $$3) {
      cxh $$4 = $$2.f();
      cze $$5 = $$4.a(kv.R, cze.a);
      return $$5.a(czf.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean t() {
      return this.al.a(bI);
   }

   public boolean x() {
      return this.al.a(bJ);
   }

   public void gs() {
      this.al.a(bJ, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.q() != null;
   }

   static class a extends ccw {
      private final cmi a;
      @Nullable
      private bvy b;

      public a(cmi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.c, ccw.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.f();
         if (this.b instanceof cpr $$0) {
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

   static class b extends ccw {
      private final cmi a;

      public b(cmi $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() == null) {
            return false;
         } else {
            return !a(this.a).O().b(dgv.c) ? false : this.a.dX().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azh $$0 = this.a.dX();
         dgz $$1 = this.a.dU();
         int $$2 = ayz.a(this.a.dz() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayz.a(this.a.dB() + $$0.j() * 2.0);
         int $$4 = ayz.a(this.a.dF() - 1.0 + $$0.j() * 2.0);
         ji $$5 = new ji($$2, $$3, $$4);
         dxq $$6 = $$1.a_($$5);
         ji $$7 = $$5.e();
         dxq $$8 = $$1.a_($$7);
         dxq $$9 = this.a.q();
         if ($$9 != null) {
            $$9 = dke.b($$9, this.a.dU(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ecp.i, $$5, ecp.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dgz $$0, ji $$1, dxq $$2, dxq $$3, dxq $$4, ji $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dkg.I) && $$4.m($$0, $$5) && $$2.a((dhc)$$0, $$1) && $$0.a_(this.a, fbs.a(fbx.a($$1))).isEmpty();
      }
   }

   static class c extends cep<cpr> {
      private final cmi i;
      @Nullable
      private cpr j;
      private int k;
      private int l;
      private final cgp m;
      private final cgp n = cgp.a().d();
      private final cgp.a o;

      public c(cmi $$0, @Nullable cgp.a $$1) {
         super($$0, cpr.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cpr)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cgp.a().a(this.l()).a(this.o);
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
         this.i.gs();
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
               if (this.i.a((cpr)this.c)) {
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

   static class d extends ccw {
      private final cmi a;

      public d(cmi $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.q() != null) {
            return false;
         } else {
            return !a(this.a).O().b(dgv.c) ? false : this.a.dX().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azh $$0 = this.a.dX();
         dgz $$1 = this.a.dU();
         int $$2 = ayz.a(this.a.dz() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayz.a(this.a.dB() + $$0.j() * 3.0);
         int $$4 = ayz.a(this.a.dF() - 2.0 + $$0.j() * 4.0);
         ji $$5 = new ji($$2, $$3, $$4);
         dxq $$6 = $$1.a_($$5);
         fbx $$7 = new fbx((double)this.a.dy() + 0.5, (double)$$3 + 0.5, (double)this.a.dE() + 0.5);
         fbx $$8 = new fbx((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fbt $$9 = $$1.a(new dgi($$7, $$8, dgi.a.b, dgi.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(awp.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(ecp.f, $$5, ecp.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
