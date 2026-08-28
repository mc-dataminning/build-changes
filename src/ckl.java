import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckl extends ckv implements buk {
   private static final alb c = alb.b("attacking");
   private static final bvk d = new bvk(c, 0.15F, bvk.a.a);
   private static final int e = 400;
   private static final int bZ = 600;
   private static final akg<Optional<dua>> ca = akk.a(ckl.class, aki.j);
   private static final akg<Boolean> cb = akk.a(ckl.class, aki.k);
   private static final akg<Boolean> cc = akk.a(ckl.class, aki.k);
   private int cd = Integer.MIN_VALUE;
   private int ce;
   private static final bqv cf = bad.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public ckl(btq<? extends ckl> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bT.a(0, new caw(this));
      this.bT.a(1, new ckl.a(this));
      this.bT.a(2, new cbm(this, 1.0, false));
      this.bT.a(7, new ccp(this, 1.0, 0.0F));
      this.bT.a(8, new cbk(this, cnp.class, 8.0F));
      this.bT.a(8, new cbx(this));
      this.bT.a(10, new ckl.b(this));
      this.bT.a(11, new ckl.d(this));
      this.bU.a(1, new ckl.c(this, this::a_));
      this.bU.a(2, new ccu(this));
      this.bU.a(3, new ccv<>(this, ckm.class, true, false));
      this.bU.a(4, new cdb<>(this, false));
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.s, 40.0).a(bvm.v, 0.3F).a(bvm.c, 7.0).a(bvm.m, 64.0).a(bvm.B, 1.0);
   }

   @Override
   public void h(@Nullable buf $$0) {
      super.h($$0);
      bvi $$1 = this.g(bvm.v);
      if ($$0 == null) {
         this.ce = 0;
         this.am.a(cb, false);
         this.am.a(cc, false);
         $$1.c(c);
      } else {
         this.ce = this.ag;
         this.am.a(cb, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, Optional.empty());
      $$0.a(cb, false);
      $$0.a(cc, false);
   }

   @Override
   public void c() {
      this.a(cf.a(this.af));
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

   public void t() {
      if (this.ag >= this.cd + 400) {
         this.cd = this.ag;
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dB(), this.dD(), awd.io, this.di(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (cb.equals($$0) && this.gq() && this.dS().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      dua $$1 = this.go();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uu.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      dua $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uu.a(this.dS().a(lv.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dS(), $$0);
   }

   boolean f(cnp $$0) {
      cvl $$1 = $$0.gc().h.get(3);
      if ($$1.a(dgx.ee.r())) {
         return false;
      } else {
         eye $$2 = $$0.g(1.0F).d();
         eye $$3 = new eye(this.dx() - $$0.dx(), this.dB() - $$0.dB(), this.dD() - $$0.dD());
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

      this.bk = false;
      if (!this.dS().B) {
         this.a((arg)this.dS(), true);
      }

      super.m_();
   }

   @Override
   public boolean fo() {
      return true;
   }

   @Override
   protected void ad() {
      if (this.dS().S() && this.ag >= this.ce + 600) {
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

   boolean c(btj $$0) {
      eye $$1 = new eye(this.dx() - $$0.dx(), this.e(0.5) - $$0.dB(), this.dD() - $$0.dD());
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

      dua $$4 = this.dS().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(awy.a);
      if ($$5 && !$$6) {
         eye $$7 = this.dq();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dS().a(dyx.R, $$7, dyx.a.a(this));
            if (!this.ba()) {
               this.dS().a(null, this.L, this.M, this.N, awd.ip, this.di(), 1.0F, 1.0F);
               this.a(awd.ip, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awc w() {
      return this.gp() ? awd.in : awd.ik;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.im;
   }

   @Override
   protected awc n_() {
      return awd.il;
   }

   @Override
   protected void a(arg $$0, bsb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dua $$3 = this.go();
      if ($$3 != null) {
         cvl $$4 = new cvl(cvo.pk);
         day.a($$4, $$0.F_(), dck.g, $$0.d_(this.ds()), this.dV());
         esw.a $$5 = new esw.a((arg)this.dS()).a(evp.f, this.dq()).a(evp.i, $$4).b(evp.a, this);

         for (cvl $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable dua $$0) {
      this.am.a(ca, Optional.ofNullable($$0));
   }

   @Nullable
   public dua go() {
      return this.am.a(ca).orElse(null);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cov;
         if (!$$0.a(awu.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dS().w_() && !($$0.d() instanceof buf) && this.af.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cov)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bsb $$0, cov $$1, float $$2) {
      cvl $$3 = $$1.m();
      cxn $$4 = $$3.a(kr.I, cxn.a);
      return $$4.a(cxo.a) ? super.a($$0, $$2) : false;
   }

   public boolean gp() {
      return this.am.a(cb);
   }

   public boolean gq() {
      return this.am.a(cc);
   }

   public void gr() {
      this.am.a(cc, true);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.go() != null;
   }

   static class a extends cbc {
      private final ckl a;
      @Nullable
      private buf b;

      public a(ckl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.c, cbc.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.m();
         if (!(this.b instanceof cnp)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.f((cnp)this.b);
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

   static class b extends cbc {
      private final ckl a;

      public b(ckl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.go() == null) {
            return false;
         } else {
            return !this.a.dS().ac().b(ddo.c) ? false : this.a.dV().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azk $$0 = this.a.dV();
         dds $$1 = this.a.dS();
         int $$2 = azc.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         int $$3 = azc.a(this.a.dz() + $$0.j() * 2.0);
         int $$4 = azc.a(this.a.dD() - 1.0 + $$0.j() * 2.0);
         je $$5 = new je($$2, $$3, $$4);
         dua $$6 = $$1.a_($$5);
         je $$7 = $$5.e();
         dua $$8 = $$1.a_($$7);
         dua $$9 = this.a.go();
         if ($$9 != null) {
            $$9 = dgv.b($$9, this.a.dS(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dyx.i, $$5, dyx.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dds $$0, je $$1, dua $$2, dua $$3, dua $$4, je $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dgx.F) && $$4.m($$0, $$5) && $$2.a((ddv)$$0, $$1) && $$0.a_(this.a, exz.a(eye.a($$1))).isEmpty();
      }
   }

   static class c extends ccv<cnp> {
      private final ckl i;
      @Nullable
      private cnp j;
      private int k;
      private int l;
      private final cev m;
      private final cev n = cev.a().d();
      private final Predicate<buf> o;

      public c(ckl $$0, @Nullable Predicate<buf> $$1) {
         super($$0, cnp.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.f((cnp)$$1x) || $$0.a_($$1x)) && !$$0.A($$1x);
         this.m = cev.a().a(this.l()).a(this.o);
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
               if (this.i.f((cnp)this.c)) {
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

   static class d extends cbc {
      private final ckl a;

      public d(ckl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.go() != null) {
            return false;
         } else {
            return !this.a.dS().ac().b(ddo.c) ? false : this.a.dV().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azk $$0 = this.a.dV();
         dds $$1 = this.a.dS();
         int $$2 = azc.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         int $$3 = azc.a(this.a.dz() + $$0.j() * 3.0);
         int $$4 = azc.a(this.a.dD() - 2.0 + $$0.j() * 4.0);
         je $$5 = new je($$2, $$3, $$4);
         dua $$6 = $$1.a_($$5);
         eye $$7 = new eye((double)this.a.dw() + 0.5, (double)$$3 + 0.5, (double)this.a.dC() + 0.5);
         eye $$8 = new eye((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         eya $$9 = $$1.a(new dda($$7, $$8, dda.a.b, dda.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(aws.am) && $$10) {
            $$1.a($$5, false);
            $$1.a(dyx.f, $$5, dyx.a.a(this.a, $$6));
            this.a.c($$6.b().o());
         }
      }
   }
}
