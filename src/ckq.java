import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckq extends cla implements bup {
   private static final alc c = alc.b("attacking");
   private static final bvp d = new bvp(c, 0.15F, bvp.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final akg<Optional<duo>> bZ = akk.a(ckq.class, aki.j);
   private static final akg<Boolean> ca = akk.a(ckq.class, aki.k);
   private static final akg<Boolean> cb = akk.a(ckq.class, aki.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final bra ce = bae.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public ckq(btv<? extends ckq> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new ckq.a(this));
      this.bS.a(2, new cbr(this, 1.0, false));
      this.bS.a(7, new ccu(this, 1.0, 0.0F));
      this.bS.a(8, new cbp(this, cnu.class, 8.0F));
      this.bS.a(8, new ccc(this));
      this.bS.a(10, new ckq.b(this));
      this.bS.a(11, new ckq.d(this));
      this.bT.a(1, new ckq.c(this, this::a_));
      this.bT.a(2, new ccz(this));
      this.bT.a(3, new cda<>(this, ckr.class, true, false));
      this.bT.a(4, new cdg<>(this, false));
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.s, 40.0).a(bvr.v, 0.3F).a(bvr.c, 7.0).a(bvr.m, 64.0).a(bvr.B, 1.0);
   }

   @Override
   public void h(@Nullable buk $$0) {
      super.h($$0);
      bvn $$1 = this.g(bvr.v);
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
   protected void a(akk.a $$0) {
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
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dB(), this.dD(), awe.io, this.di(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (ca.equals($$0) && this.gr() && this.dS().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      duo $$1 = this.gp();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uu.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      duo $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uu.a(this.dS().a(lv.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dS(), $$0);
   }

   boolean f(cnu $$0) {
      cvp $$1 = $$0.gc().h.get(3);
      if ($$1.a(dhl.ee.q())) {
         return false;
      } else {
         eys $$2 = $$0.g(1.0F).d();
         eys $$3 = new eys(this.dx() - $$0.dx(), this.dB() - $$0.dB(), this.dD() - $$0.dD());
         double $$4 = $$3.g();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.G(this) : false;
      }
   }

   @Override
   public void m_() {
      if (this.dS().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dS().a(ln.ac, this.d(0.5), this.dA() - 0.25, this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dS().B) {
         this.a((arh)this.dS(), true);
      }

      super.m_();
   }

   @Override
   public boolean fo() {
      return true;
   }

   @Override
   protected void ad() {
      if (this.dS().S() && this.ag >= this.cd + 600) {
         float $$0 = this.bx();
         if ($$0 > 0.5F && this.dS().h(this.ds()) && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.ad();
   }

   protected boolean y() {
      if (!this.dS().w_() && this.bI()) {
         double $$0 = this.dx() + (this.af.j() - 0.5) * 64.0;
         double $$1 = this.dz() + (double)(this.af.a(64) - 32);
         double $$2 = this.dD() + (this.af.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean c(bto $$0) {
      eys $$1 = new eys(this.dx() - $$0.dx(), this.e(0.5) - $$0.dB(), this.dD() - $$0.dD());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dx() + (this.af.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dz() + (double)(this.af.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dD() + (this.af.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      je.a $$3 = new je.a($$0, $$1, $$2);

      while ($$3.v() > this.dS().G_() && !this.dS().a_($$3).d()) {
         $$3.c(jj.a);
      }

      duo $$4 = this.dS().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(awz.a);
      if ($$5 && !$$6) {
         eys $$7 = this.dq();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dS().a(dzl.R, $$7, dzl.a.a(this));
            if (!this.ba()) {
               this.dS().a(null, this.L, this.M, this.N, awe.ip, this.di(), 1.0F, 1.0F);
               this.a(awe.ip, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awd w() {
      return this.gq() ? awe.in : awe.ik;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.im;
   }

   @Override
   protected awd n_() {
      return awe.il;
   }

   @Override
   protected void a(arh $$0, bsg $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      duo $$3 = this.gp();
      if ($$3 != null) {
         cvp $$4 = new cvp(cvt.pk);
         dbm.a($$4, $$0.F_(), dcy.g, $$0.d_(this.ds()), this.dV());
         etk.a $$5 = new etk.a((arh)this.dS()).a(ewd.f, this.dq()).a(ewd.i, $$4).b(ewd.a, this);

         for (cvp $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable duo $$0) {
      this.am.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public duo gp() {
      return this.am.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cpa;
         if (!$$0.a(awv.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dS().w_() && !($$0.d() instanceof buk) && this.af.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cpa)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bsg $$0, cpa $$1, float $$2) {
      cvp $$3 = $$1.m();
      cxo $$4 = $$3.a(kr.L, cxo.a);
      return $$4.a(cxp.a) ? super.a($$0, $$2) : false;
   }

   public boolean gq() {
      return this.am.a(ca);
   }

   public boolean gr() {
      return this.am.a(cb);
   }

   public void gs() {
      this.am.a(cb, true);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.gp() != null;
   }

   static class a extends cbh {
      private final ckq a;
      @Nullable
      private buk b;

      public a(ckq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.c, cbh.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.m();
         if (!(this.b instanceof cnu)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.f((cnu)this.b);
         }
      }

      @Override
      public void d() {
         this.a.P().o();
      }

      @Override
      public void a() {
         this.a.K().a(this.b.dx(), this.b.dB(), this.b.dD());
      }
   }

   static class b extends cbh {
      private final ckq a;

      public b(ckq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gp() == null) {
            return false;
         } else {
            return !this.a.dS().ac().b(dec.c) ? false : this.a.dV().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azl $$0 = this.a.dV();
         deg $$1 = this.a.dS();
         int $$2 = azd.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         int $$3 = azd.a(this.a.dz() + $$0.j() * 2.0);
         int $$4 = azd.a(this.a.dD() - 1.0 + $$0.j() * 2.0);
         je $$5 = new je($$2, $$3, $$4);
         duo $$6 = $$1.a_($$5);
         je $$7 = $$5.e();
         duo $$8 = $$1.a_($$7);
         duo $$9 = this.a.gp();
         if ($$9 != null) {
            $$9 = dhj.b($$9, this.a.dS(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dzl.i, $$5, dzl.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(deg $$0, je $$1, duo $$2, duo $$3, duo $$4, je $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dhl.F) && $$4.m($$0, $$5) && $$2.a((dej)$$0, $$1) && $$0.a_(this.a, eyn.a(eys.a($$1))).isEmpty();
      }
   }

   static class c extends cda<cnu> {
      private final ckq i;
      @Nullable
      private cnu j;
      private int k;
      private int l;
      private final cfa m;
      private final cfa n = cfa.a().d();
      private final Predicate<buk> o;

      public c(ckq $$0, @Nullable Predicate<buk> $$1) {
         super($$0, cnu.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.f((cnu)$$1x) || $$0.a_($$1x)) && !$$0.A($$1x);
         this.m = cfa.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = this.i.dS().a(this.m.a(this.l()), this.i);
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
            if (this.c != null && !this.i.bW()) {
               if (this.i.f((cnu)this.c)) {
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

   static class d extends cbh {
      private final ckq a;

      public d(ckq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gp() != null) {
            return false;
         } else {
            return !this.a.dS().ac().b(dec.c) ? false : this.a.dV().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azl $$0 = this.a.dV();
         deg $$1 = this.a.dS();
         int $$2 = azd.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         int $$3 = azd.a(this.a.dz() + $$0.j() * 3.0);
         int $$4 = azd.a(this.a.dD() - 2.0 + $$0.j() * 4.0);
         je $$5 = new je($$2, $$3, $$4);
         duo $$6 = $$1.a_($$5);
         eys $$7 = new eys((double)this.a.dw() + 0.5, (double)$$3 + 0.5, (double)this.a.dC() + 0.5);
         eys $$8 = new eys((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         eyo $$9 = $$1.a(new ddo($$7, $$8, ddo.a.b, ddo.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(awt.am) && $$10) {
            $$1.a($$5, false);
            $$1.a(dzl.f, $$5, dzl.a.a(this.a, $$6));
            this.a.c($$6.b().o());
         }
      }
   }
}
