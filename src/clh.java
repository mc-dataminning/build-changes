import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clh extends clr implements bvf {
   private static final ali c = ali.b("attacking");
   private static final bwg d = new bwg(c, 0.15F, bwg.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final akl<Optional<dvj>> bZ = akp.a(clh.class, akn.j);
   private static final akl<Boolean> ca = akp.a(clh.class, akn.k);
   private static final akl<Boolean> cb = akp.a(clh.class, akn.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final bro ce = bal.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public clh(bul<? extends clh> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new clh.a(this));
      this.bS.a(2, new cci(this, 1.0, false));
      this.bS.a(7, new cdl(this, 1.0, 0.0F));
      this.bS.a(8, new ccg(this, com.class, 8.0F));
      this.bS.a(8, new cct(this));
      this.bS.a(10, new clh.b(this));
      this.bS.a(11, new clh.d(this));
      this.bT.a(1, new clh.c(this, this::a_));
      this.bT.a(2, new cdq(this));
      this.bT.a(3, new cdr<>(this, cli.class, true, false));
      this.bT.a(4, new cdx<>(this, false));
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.s, 40.0).a(bwi.v, 0.3F).a(bwi.c, 7.0).a(bwi.m, 64.0).a(bwi.B, 1.0);
   }

   @Override
   public void h(@Nullable bva $$0) {
      super.h($$0);
      bwe $$1 = this.g(bwi.v);
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
   protected void a(akp.a $$0) {
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
         if (!this.bc()) {
            this.dX().a(this.dC(), this.dG(), this.dI(), awl.io, this.dn(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akl<?> $$0) {
      if (ca.equals($$0) && this.gw() && this.dX().C) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      dvj $$1 = this.gu();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uz.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      dvj $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uz.a(this.dX().a(lz.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dX(), $$0);
   }

   boolean f(com $$0) {
      cwb $$1 = $$0.gk().h.get(3);
      if ($$1.a(dig.ee.j())) {
         return false;
      } else {
         ezn $$2 = $$0.g(1.0F).d();
         ezn $$3 = new ezn(this.dC() - $$0.dC(), this.dG() - $$0.dG(), this.dI() - $$0.dI());
         double $$4 = $$3.g();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.G(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dX().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dX().a(lr.ac, this.d(0.5), this.dF() - 0.25, this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dX().C) {
         this.a((arn)this.dX(), true);
      }

      super.n_();
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   protected void ac() {
      if (this.dX().S() && this.ag >= this.cd + 600) {
         float $$0 = this.bz();
         if ($$0 > 0.5F && this.dX().h(this.dx()) && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.ac();
   }

   protected boolean y() {
      if (!this.dX().y_() && this.bM()) {
         double $$0 = this.dC() + (this.af.j() - 0.5) * 64.0;
         double $$1 = this.dE() + (double)(this.af.a(64) - 32);
         double $$2 = this.dI() + (this.af.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean c(bue $$0) {
      ezn $$1 = new ezn(this.dC() - $$0.dC(), this.e(0.5) - $$0.dG(), this.dI() - $$0.dI());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dC() + (this.af.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dE() + (double)(this.af.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dI() + (this.af.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jh.a $$3 = new jh.a($$0, $$1, $$2);

      while ($$3.v() > this.dX().I_() && !this.dX().a_($$3).d()) {
         $$3.c(jm.a);
      }

      dvj $$4 = this.dX().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axg.a);
      if ($$5 && !$$6) {
         ezn $$7 = this.dv();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dX().a(eag.R, $$7, eag.a.a(this));
            if (!this.bc()) {
               this.dX().a(null, this.L, this.M, this.N, awl.ip, this.dn(), 1.0F, 1.0F);
               this.a(awl.ip, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awk w() {
      return this.gv() ? awl.in : awl.ik;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.im;
   }

   @Override
   protected awk o_() {
      return awl.il;
   }

   @Override
   protected void a(arn $$0, bsu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dvj $$3 = this.gu();
      if ($$3 != null) {
         cwb $$4 = new cwb(cwf.pk);
         dbu.a($$4, $$0.H_(), ddg.g, $$0.d_(this.dx()), this.ea());
         euf.a $$5 = new euf.a((arn)this.dX()).a(ewy.f, this.dv()).a(ewy.i, $$4).b(ewy.a, this);

         for (cwb $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable dvj $$0) {
      this.am.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public dvj gu() {
      return this.am.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cps;
         if (!$$0.a(axc.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dX().y_() && !($$0.d() instanceof bva) && this.af.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cps)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bsu $$0, cps $$1, float $$2) {
      cwb $$3 = $$1.m();
      cya $$4 = $$3.a(ku.Q, cya.a);
      return $$4.a(cyb.a) ? super.a($$0, $$2) : false;
   }

   public boolean gv() {
      return this.am.a(ca);
   }

   public boolean gw() {
      return this.am.a(cb);
   }

   public void gx() {
      this.am.a(cb, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gu() != null;
   }

   static class a extends cby {
      private final clh a;
      @Nullable
      private bva b;

      public a(clh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cby.a.c, cby.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.m();
         if (!(this.b instanceof com)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.f((com)this.b);
         }
      }

      @Override
      public void d() {
         this.a.P().o();
      }

      @Override
      public void a() {
         this.a.K().a(this.b.dC(), this.b.dG(), this.b.dI());
      }
   }

   static class b extends cby {
      private final clh a;

      public b(clh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gu() == null) {
            return false;
         } else {
            return !this.a.dX().ac().b(dex.c) ? false : this.a.ea().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azs $$0 = this.a.ea();
         dfb $$1 = this.a.dX();
         int $$2 = azk.a(this.a.dC() - 1.0 + $$0.j() * 2.0);
         int $$3 = azk.a(this.a.dE() + $$0.j() * 2.0);
         int $$4 = azk.a(this.a.dI() - 1.0 + $$0.j() * 2.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dvj $$6 = $$1.a_($$5);
         jh $$7 = $$5.e();
         dvj $$8 = $$1.a_($$7);
         dvj $$9 = this.a.gu();
         if ($$9 != null) {
            $$9 = die.b($$9, this.a.dX(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(eag.i, $$5, eag.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dfb $$0, jh $$1, dvj $$2, dvj $$3, dvj $$4, jh $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dig.F) && $$4.m($$0, $$5) && $$2.a((dfe)$$0, $$1) && $$0.a_(this.a, ezi.a(ezn.a($$1))).isEmpty();
      }
   }

   static class c extends cdr<com> {
      private final clh i;
      @Nullable
      private com j;
      private int k;
      private int l;
      private final cfr m;
      private final cfr n = cfr.a().d();
      private final Predicate<bva> o;

      public c(clh $$0, @Nullable Predicate<bva> $$1) {
         super($$0, com.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.f((com)$$1x) || $$0.a_($$1x)) && !$$0.A($$1x);
         this.m = cfr.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = this.i.dX().a(this.m.a(this.l()), this.i);
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
            if (this.c != null && !this.i.ca()) {
               if (this.i.f((com)this.c)) {
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

   static class d extends cby {
      private final clh a;

      public d(clh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gu() != null) {
            return false;
         } else {
            return !this.a.dX().ac().b(dex.c) ? false : this.a.ea().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azs $$0 = this.a.ea();
         dfb $$1 = this.a.dX();
         int $$2 = azk.a(this.a.dC() - 2.0 + $$0.j() * 4.0);
         int $$3 = azk.a(this.a.dE() + $$0.j() * 3.0);
         int $$4 = azk.a(this.a.dI() - 2.0 + $$0.j() * 4.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dvj $$6 = $$1.a_($$5);
         ezn $$7 = new ezn((double)this.a.dB() + 0.5, (double)$$3 + 0.5, (double)this.a.dH() + 0.5);
         ezn $$8 = new ezn((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ezj $$9 = $$1.a(new dej($$7, $$8, dej.a.b, dej.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axa.am) && $$10) {
            $$1.a($$5, false);
            $$1.a(eag.f, $$5, eag.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
