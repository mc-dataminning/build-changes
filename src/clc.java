import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clc extends clm implements bva {
   private static final alh c = alh.b("attacking");
   private static final bwb d = new bwb(c, 0.15F, bwb.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final akk<Optional<dvd>> bZ = ako.a(clc.class, akm.j);
   private static final akk<Boolean> ca = ako.a(clc.class, akm.k);
   private static final akk<Boolean> cb = ako.a(clc.class, akm.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final brj ce = bak.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public clc(bug<? extends clc> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new clc.a(this));
      this.bS.a(2, new ccd(this, 1.0, false));
      this.bS.a(7, new cdg(this, 1.0, 0.0F));
      this.bS.a(8, new ccb(this, coh.class, 8.0F));
      this.bS.a(8, new cco(this));
      this.bS.a(10, new clc.b(this));
      this.bS.a(11, new clc.d(this));
      this.bT.a(1, new clc.c(this, this::a_));
      this.bT.a(2, new cdl(this));
      this.bT.a(3, new cdm<>(this, cld.class, true, false));
      this.bT.a(4, new cds<>(this, false));
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.s, 40.0).a(bwd.v, 0.3F).a(bwd.c, 7.0).a(bwd.m, 64.0).a(bwd.B, 1.0);
   }

   @Override
   public void h(@Nullable buv $$0) {
      super.h($$0);
      bvz $$1 = this.g(bwd.v);
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
   protected void a(ako.a $$0) {
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
            this.dX().a(this.dC(), this.dG(), this.dI(), awk.io, this.dn(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akk<?> $$0) {
      if (ca.equals($$0) && this.gx() && this.dX().C) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      dvd $$1 = this.gv();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uy.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      dvd $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uy.a(this.dX().a(ly.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dX(), $$0);
   }

   boolean f(coh $$0) {
      cvx $$1 = $$0.gk().h.get(3);
      if ($$1.a(dia.ee.j())) {
         return false;
      } else {
         ezh $$2 = $$0.g(1.0F).d();
         ezh $$3 = new ezh(this.dC() - $$0.dC(), this.dG() - $$0.dG(), this.dI() - $$0.dI());
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
            this.dX().a(lq.ac, this.d(0.5), this.dF() - 0.25, this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      }

      this.bk = false;
      if (!this.dX().C) {
         this.a((arm)this.dX(), true);
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

   boolean c(btz $$0) {
      ezh $$1 = new ezh(this.dC() - $$0.dC(), this.e(0.5) - $$0.dG(), this.dI() - $$0.dI());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dC() + (this.af.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dE() + (double)(this.af.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dI() + (this.af.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jg.a $$3 = new jg.a($$0, $$1, $$2);

      while ($$3.v() > this.dX().I_() && !this.dX().a_($$3).d()) {
         $$3.c(jl.a);
      }

      dvd $$4 = this.dX().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axf.a);
      if ($$5 && !$$6) {
         ezh $$7 = this.dv();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dX().a(eaa.R, $$7, eaa.a.a(this));
            if (!this.bc()) {
               this.dX().a(null, this.L, this.M, this.N, awk.ip, this.dn(), 1.0F, 1.0F);
               this.a(awk.ip, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awj w() {
      return this.gw() ? awk.in : awk.ik;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.im;
   }

   @Override
   protected awj o_() {
      return awk.il;
   }

   @Override
   protected void a(arm $$0, bsp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dvd $$3 = this.gv();
      if ($$3 != null) {
         cvx $$4 = new cvx(cwb.pk);
         dbo.a($$4, $$0.H_(), dda.g, $$0.d_(this.dx()), this.ea());
         etz.a $$5 = new etz.a((arm)this.dX()).a(ews.f, this.dv()).a(ews.i, $$4).b(ews.a, this);

         for (cvx $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable dvd $$0) {
      this.am.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public dvd gv() {
      return this.am.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cpn;
         if (!$$0.a(axb.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dX().y_() && !($$0.d() instanceof buv) && this.af.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cpn)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bsp $$0, cpn $$1, float $$2) {
      cvx $$3 = $$1.m();
      cxw $$4 = $$3.a(kt.P, cxw.a);
      return $$4.a(cxx.a) ? super.a($$0, $$2) : false;
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

   static class a extends cbt {
      private final clc a;
      @Nullable
      private buv b;

      public a(clc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbt.a.c, cbt.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.m();
         if (!(this.b instanceof coh)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.f((coh)this.b);
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

   static class b extends cbt {
      private final clc a;

      public b(clc $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gv() == null) {
            return false;
         } else {
            return !this.a.dX().ac().b(der.c) ? false : this.a.ea().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azr $$0 = this.a.ea();
         dev $$1 = this.a.dX();
         int $$2 = azj.a(this.a.dC() - 1.0 + $$0.j() * 2.0);
         int $$3 = azj.a(this.a.dE() + $$0.j() * 2.0);
         int $$4 = azj.a(this.a.dI() - 1.0 + $$0.j() * 2.0);
         jg $$5 = new jg($$2, $$3, $$4);
         dvd $$6 = $$1.a_($$5);
         jg $$7 = $$5.e();
         dvd $$8 = $$1.a_($$7);
         dvd $$9 = this.a.gv();
         if ($$9 != null) {
            $$9 = dhy.b($$9, this.a.dX(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(eaa.i, $$5, eaa.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dev $$0, jg $$1, dvd $$2, dvd $$3, dvd $$4, jg $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dia.F) && $$4.m($$0, $$5) && $$2.a((dey)$$0, $$1) && $$0.a_(this.a, ezc.a(ezh.a($$1))).isEmpty();
      }
   }

   static class c extends cdm<coh> {
      private final clc i;
      @Nullable
      private coh j;
      private int k;
      private int l;
      private final cfm m;
      private final cfm n = cfm.a().d();
      private final Predicate<buv> o;

      public c(clc $$0, @Nullable Predicate<buv> $$1) {
         super($$0, coh.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.f((coh)$$1x) || $$0.a_($$1x)) && !$$0.A($$1x);
         this.m = cfm.a().a(this.l()).a(this.o);
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
            if (this.c != null && !this.i.ca()) {
               if (this.i.f((coh)this.c)) {
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

   static class d extends cbt {
      private final clc a;

      public d(clc $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gv() != null) {
            return false;
         } else {
            return !this.a.dX().ac().b(der.c) ? false : this.a.ea().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azr $$0 = this.a.ea();
         dev $$1 = this.a.dX();
         int $$2 = azj.a(this.a.dC() - 2.0 + $$0.j() * 4.0);
         int $$3 = azj.a(this.a.dE() + $$0.j() * 3.0);
         int $$4 = azj.a(this.a.dI() - 2.0 + $$0.j() * 4.0);
         jg $$5 = new jg($$2, $$3, $$4);
         dvd $$6 = $$1.a_($$5);
         ezh $$7 = new ezh((double)this.a.dB() + 0.5, (double)$$3 + 0.5, (double)this.a.dH() + 0.5);
         ezh $$8 = new ezh((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ezd $$9 = $$1.a(new ded($$7, $$8, ded.a.b, ded.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(awz.am) && $$10) {
            $$1.a($$5, false);
            $$1.a(eaa.f, $$5, eaa.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
