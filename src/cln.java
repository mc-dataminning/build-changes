import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cln extends clx implements bvl {
   private static final akv c = akv.b("attacking");
   private static final bwm d = new bwm(c, 0.15F, bwm.a.a);
   private static final int bY = 400;
   private static final int bZ = 600;
   private static final ajy<Optional<dww>> ca = akc.a(cln.class, aka.j);
   private static final ajy<Boolean> cb = akc.a(cln.class, aka.k);
   private static final ajy<Boolean> cc = akc.a(cln.class, aka.k);
   private int cd = Integer.MIN_VALUE;
   private int ce;
   private static final bru cf = bab.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public cln(bur<? extends cln> $$0, dgh $$1) {
      super($$0, $$1);
      this.a(etp.j, -1.0F);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cby(this));
      this.bS.a(1, new cln.a(this));
      this.bS.a(2, new cco(this, 1.0, false));
      this.bS.a(7, new cdr(this, 1.0, 0.0F));
      this.bS.a(8, new ccm(this, cow.class, 8.0F));
      this.bS.a(8, new ccz(this));
      this.bS.a(10, new cln.b(this));
      this.bS.a(11, new cln.d(this));
      this.bT.a(1, new cln.c(this, this::a));
      this.bT.a(2, new cdw(this));
      this.bT.a(3, new cdx<>(this, clo.class, true, false));
      this.bT.a(4, new ced<>(this, false));
   }

   public static bwn.a m() {
      return clx.gx().a(bwo.s, 40.0).a(bwo.v, 0.3F).a(bwo.c, 7.0).a(bwo.m, 64.0).a(bwo.B, 1.0);
   }

   @Override
   public void h(@Nullable bvg $$0) {
      super.h($$0);
      bwk $$1 = this.g(bwo.v);
      if ($$0 == null) {
         this.ce = 0;
         this.al.a(cb, false);
         this.al.a(cc, false);
         $$1.c(c);
      } else {
         this.ce = this.af;
         this.al.a(cb, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ca, Optional.empty());
      $$0.a(cb, false);
      $$0.a(cc, false);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   public void p() {
      if (this.af >= this.cd + 400) {
         this.cd = this.af;
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awa.iI, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      if (cb.equals($$0) && this.gt() && this.dV().C) {
         this.p();
      }

      super.a($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      dww $$1 = this.x();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uf.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      dww $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uf.a(this.dV().a(mc.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dV(), $$0);
   }

   boolean a(cow $$0) {
      return !bvg.aH.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dE()});
   }

   @Override
   public void d_() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lt.ae, this.d(0.5), this.dD() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bm = false;
      if (!this.dV().C) {
         this.a((ard)this.dV(), true);
      }

      super.d_();
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   protected void a(ard $$0) {
      if ($$0.V() && this.af >= this.ce + 600) {
         float $$1 = this.by();
         if ($$1 > 0.5F && $$0.h(this.dv()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.h(null);
            this.t();
         }
      }

      super.a($$0);
   }

   protected boolean t() {
      if (!this.dV().B_() && this.bL()) {
         double $$0 = this.dA() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dC() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dG() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(buk $$0) {
      faz $$1 = new faz(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dA() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dC() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dG() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      ji.a $$3 = new ji.a($$0, $$1, $$2);

      while ($$3.v() > this.dV().L_() && !this.dV().a_($$3).d()) {
         $$3.c(jn.a);
      }

      dww $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(awv.a);
      if ($$5 && !$$6) {
         faz $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(ebs.R, $$7, ebs.a.a(this));
            if (!this.bb()) {
               this.dV().a(null, this.K, this.L, this.M, awa.iJ, this.dm(), 1.0F, 1.0F);
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
      return this.gs() ? awa.iH : awa.iE;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.iG;
   }

   @Override
   protected avz o_() {
      return awa.iF;
   }

   @Override
   protected void a(ard $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dww $$3 = this.x();
      if ($$3 != null) {
         cwo $$4 = new cwo(cws.pO);
         dda.a($$4, $$0.K_(), dem.g, $$0.d_(this.dv()), this.dY());
         evt.a $$5 = new evt.a((ard)this.dV()).a(eyk.f, this.dt()).a(eyk.i, $$4).b(eyk.a, this);

         for (cwo $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dww $$0) {
      this.al.a(ca, Optional.ofNullable($$0));
   }

   @Nullable
   public dww x() {
      return this.al.a(ca).orElse(null);
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof cqb;
         if (!$$1.a(awr.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bvg) && this.ae.a(10) != 0) {
               this.t();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (cqb)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(ard $$0, bta $$1, cqb $$2, float $$3) {
      cwo $$4 = $$2.l();
      cyn $$5 = $$4.a(kv.Q, cyn.a);
      return $$5.a(cyo.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean gs() {
      return this.al.a(cb);
   }

   public boolean gt() {
      return this.al.a(cc);
   }

   public void gu() {
      this.al.a(cc, true);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.x() != null;
   }

   static class a extends cce {
      private final cln a;
      @Nullable
      private bvg b;

      public a(cln $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cce.a.c, cce.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.O_();
         if (!(this.b instanceof cow)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.a((cow)this.b);
         }
      }

      @Override
      public void d() {
         this.a.P().m();
      }

      @Override
      public void a() {
         this.a.L().a(this.b.dA(), this.b.dE(), this.b.dG());
      }
   }

   static class b extends cce {
      private final cln a;

      public b(cln $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() == null) {
            return false;
         } else {
            return !a(this.a).O().b(dgd.c) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azh $$0 = this.a.dY();
         dgh $$1 = this.a.dV();
         int $$2 = ayz.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayz.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = ayz.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         ji $$5 = new ji($$2, $$3, $$4);
         dww $$6 = $$1.a_($$5);
         ji $$7 = $$5.e();
         dww $$8 = $$1.a_($$7);
         dww $$9 = this.a.x();
         if ($$9 != null) {
            $$9 = djl.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ebs.i, $$5, ebs.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dgh $$0, ji $$1, dww $$2, dww $$3, dww $$4, ji $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(djn.I) && $$4.m($$0, $$5) && $$2.a((dgk)$$0, $$1) && $$0.a_(this.a, fau.a(faz.a($$1))).isEmpty();
      }
   }

   static class c extends cdx<cow> {
      private final cln i;
      @Nullable
      private cow j;
      private int k;
      private int l;
      private final cfx m;
      private final cfx n = cfx.a().d();
      private final cfx.a o;

      public c(cln $$0, @Nullable cfx.a $$1) {
         super($$0, cow.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cow)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cfx.a().a(this.l()).a(this.o);
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
         if (this.i.O_() == null) {
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
               if (this.i.a((cow)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.t();
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

   static class d extends cce {
      private final cln a;

      public d(cln $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.x() != null) {
            return false;
         } else {
            return !a(this.a).O().b(dgd.c) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azh $$0 = this.a.dY();
         dgh $$1 = this.a.dV();
         int $$2 = ayz.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayz.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = ayz.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         ji $$5 = new ji($$2, $$3, $$4);
         dww $$6 = $$1.a_($$5);
         faz $$7 = new faz((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         faz $$8 = new faz((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         fav $$9 = $$1.a(new dfp($$7, $$8, dfp.a.b, dfp.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(awp.ao) && $$10) {
            $$1.a($$5, false);
            $$1.a(ebs.f, $$5, ebs.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
