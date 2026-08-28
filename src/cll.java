import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cll extends clv implements bvj {
   private static final all c = all.b("attacking");
   private static final bwk d = new bwk(c, 0.15F, bwk.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final ako<Optional<dvo>> bZ = aks.a(cll.class, akq.j);
   private static final ako<Boolean> ca = aks.a(cll.class, akq.k);
   private static final ako<Boolean> cb = aks.a(cll.class, akq.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final brs ce = bap.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cll(bup<? extends cll> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new cll.a(this));
      this.bS.a(2, new ccm(this, 1.0, false));
      this.bS.a(7, new cdp(this, 1.0, 0.0F));
      this.bS.a(8, new cck(this, cor.class, 8.0F));
      this.bS.a(8, new ccx(this));
      this.bS.a(10, new cll.b(this));
      this.bS.a(11, new cll.d(this));
      this.bT.a(1, new cll.c(this, this::a_));
      this.bT.a(2, new cdu(this));
      this.bT.a(3, new cdv<>(this, clm.class, true, false));
      this.bT.a(4, new ceb<>(this, false));
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.s, 40.0).a(bwm.v, 0.3F).a(bwm.c, 7.0).a(bwm.m, 64.0).a(bwm.B, 1.0);
   }

   @Override
   public void h(@Nullable bve $$0) {
      super.h($$0);
      bwi $$1 = this.g(bwm.v);
      if ($$0 == null) {
         this.cd = 0;
         this.am.a(ca, false);
         this.am.a(cb, false);
         $$1.c(c);
      } else {
         this.cd = this.ag;
         this.am.a(ca, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bZ, Optional.empty());
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   public void t() {
      if (this.ag >= this.cc + 400) {
         this.cc = this.ag;
         if (!this.bd()) {
            this.dY().a(this.dD(), this.dH(), this.dJ(), awo.io, this.do(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ako<?> $$0) {
      if (ca.equals($$0) && this.gx() && this.dY().C) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      dvo $$1 = this.gv();
      if ($$1 != null) {
         $$0.a("carriedBlockState", vc.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      dvo $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = vc.a(this.dY().a(ma.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dY(), $$0);
   }

   boolean f(cor $$0) {
      cwf $$1 = $$0.gl().h.get(3);
      if ($$1.a(dil.ee.j())) {
         return false;
      } else {
         ezr $$2 = $$0.g(1.0F).d();
         ezr $$3 = new ezr(this.dD() - $$0.dD(), this.dH() - $$0.dH(), this.dJ() - $$0.dJ());
         double $$4 = $$3.g();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.G(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dY().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dY().a(ls.ac, this.d(0.5), this.dG() - 0.25, this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dY().C) {
         this.a((arq)this.dY(), true);
      }

      super.n_();
   }

   @Override
   public boolean fu() {
      return true;
   }

   @Override
   protected void ac() {
      if (this.dY().S() && this.ag >= this.cd + 600) {
         float $$0 = this.bA();
         if ($$0 > 0.5F && this.dY().h(this.dy()) && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.ac();
   }

   protected boolean y() {
      if (!this.dY().y_() && this.bN()) {
         double $$0 = this.dD() + (this.af.j() - 0.5) * 64.0;
         double $$1 = this.dF() + (double)(this.af.a(64) - 32);
         double $$2 = this.dJ() + (this.af.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean c(bui $$0) {
      ezr $$1 = new ezr(this.dD() - $$0.dD(), this.e(0.5) - $$0.dH(), this.dJ() - $$0.dJ());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dD() + (this.af.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dF() + (double)(this.af.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dJ() + (this.af.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jh.a $$3 = new jh.a($$0, $$1, $$2);

      while ($$3.v() > this.dY().I_() && !this.dY().a_($$3).d()) {
         $$3.c(jm.a);
      }

      dvo $$4 = this.dY().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axj.a);
      if ($$5 && !$$6) {
         ezr $$7 = this.dw();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dY().a(eak.R, $$7, eak.a.a(this));
            if (!this.bd()) {
               this.dY().a(null, this.L, this.M, this.N, awo.ip, this.do(), 1.0F, 1.0F);
               this.a(awo.ip, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awn w() {
      return this.gw() ? awo.in : awo.ik;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.im;
   }

   @Override
   protected awn o_() {
      return awo.il;
   }

   @Override
   protected void a(arq $$0, bsy $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dvo $$3 = this.gv();
      if ($$3 != null) {
         cwf $$4 = new cwf(cwj.pk);
         dby.a($$4, $$0.H_(), ddk.g, $$0.d_(this.dy()), this.eb());
         euj.a $$5 = new euj.a((arq)this.dY()).a(exc.f, this.dw()).a(exc.i, $$4).b(exc.a, this);

         for (cwf $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable dvo $$0) {
      this.am.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public dvo gv() {
      return this.am.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cpw;
         if (!$$0.a(axf.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dY().y_() && !($$0.d() instanceof bve) && this.af.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cpw)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bsy $$0, cpw $$1, float $$2) {
      cwf $$3 = $$1.m();
      cye $$4 = $$3.a(ku.Q, cye.a);
      return $$4.a(cyf.a) ? super.a($$0, $$2) : false;
   }

   public boolean gw() {
      return this.am.a(ca);
   }

   public boolean gx() {
      return this.am.a(cb);
   }

   public void gy() {
      this.am.a(cb, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gv() != null;
   }

   static class a extends ccc {
      private final cll a;
      @Nullable
      private bve b;

      public a(cll $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.c, ccc.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.m();
         if (!(this.b instanceof cor)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.f((cor)this.b);
         }
      }

      @Override
      public void d() {
         this.a.P().o();
      }

      @Override
      public void a() {
         this.a.K().a(this.b.dD(), this.b.dH(), this.b.dJ());
      }
   }

   static class b extends ccc {
      private final cll a;

      public b(cll $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gv() == null) {
            return false;
         } else {
            return !this.a.dY().ac().b(dfb.c) ? false : this.a.eb().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azv $$0 = this.a.eb();
         dff $$1 = this.a.dY();
         int $$2 = azn.a(this.a.dD() - 1.0 + $$0.j() * 2.0);
         int $$3 = azn.a(this.a.dF() + $$0.j() * 2.0);
         int $$4 = azn.a(this.a.dJ() - 1.0 + $$0.j() * 2.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dvo $$6 = $$1.a_($$5);
         jh $$7 = $$5.e();
         dvo $$8 = $$1.a_($$7);
         dvo $$9 = this.a.gv();
         if ($$9 != null) {
            $$9 = dij.b($$9, this.a.dY(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(eak.i, $$5, eak.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dff $$0, jh $$1, dvo $$2, dvo $$3, dvo $$4, jh $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dil.F) && $$4.m($$0, $$5) && $$2.a((dfi)$$0, $$1) && $$0.a_(this.a, ezm.a(ezr.a($$1))).isEmpty();
      }
   }

   static class c extends cdv<cor> {
      private final cll i;
      @Nullable
      private cor j;
      private int k;
      private int l;
      private final cfv m;
      private final cfv n = cfv.a().d();
      private final Predicate<bve> o;

      public c(cll $$0, @Nullable Predicate<bve> $$1) {
         super($$0, cor.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.f((cor)$$1x) || $$0.a_($$1x)) && !$$0.A($$1x);
         this.m = cfv.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = this.i.dY().a(this.m.a(this.l()), this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gy();
      }

      @Override
      public void e() {
         this.j = null;
         super.e();
      }

      @Override
      public boolean c() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
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

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.c();
         }
      }

      @Override
      public void a() {
         if (this.i.m() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.d();
            }
         } else {
            if (this.c != null && !this.i.cb()) {
               if (this.i.f((cor)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.y();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.c(this.c)) {
                  this.l = 0;
               }
            }

            super.a();
         }
      }
   }

   static class d extends ccc {
      private final cll a;

      public d(cll $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gv() != null) {
            return false;
         } else {
            return !this.a.dY().ac().b(dfb.c) ? false : this.a.eb().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azv $$0 = this.a.eb();
         dff $$1 = this.a.dY();
         int $$2 = azn.a(this.a.dD() - 2.0 + $$0.j() * 4.0);
         int $$3 = azn.a(this.a.dF() + $$0.j() * 3.0);
         int $$4 = azn.a(this.a.dJ() - 2.0 + $$0.j() * 4.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dvo $$6 = $$1.a_($$5);
         ezr $$7 = new ezr((double)this.a.dC() + 0.5, (double)$$3 + 0.5, (double)this.a.dI() + 0.5);
         ezr $$8 = new ezr((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ezn $$9 = $$1.a(new den($$7, $$8, den.a.b, den.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axd.an) && $$10) {
            $$1.a($$5, false);
            $$1.a(eak.f, $$5, eak.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
