import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfo extends cfy implements bpu {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bqt d = new bqt(c, "Attacking speed boost", 0.15F, bqt.a.a);
   private static final int e = 400;
   private static final int bX = 600;
   private static final aim<Optional<dmz>> bY = aiq.a(cfo.class, aio.j);
   private static final aim<Boolean> bZ = aiq.a(cfo.class, aio.k);
   private static final aim<Boolean> ca = aiq.a(cfo.class, aio.k);
   private int cb = Integer.MIN_VALUE;
   private int cc;
   private static final bmn cd = axv.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public cfo(bpc<? extends cfo> $$0, cwz $$1) {
      super($$0, $$1);
      this.a(eiy.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new cfo.a(this));
      this.bR.a(2, new bwv(this, 1.0, false));
      this.bR.a(7, new bxy(this, 1.0, 0.0F));
      this.bR.a(8, new bwt(this, cis.class, 8.0F));
      this.bR.a(8, new bxg(this));
      this.bR.a(10, new cfo.b(this));
      this.bR.a(11, new cfo.d(this));
      this.bS.a(1, new cfo.c(this, this::a_));
      this.bS.a(2, new byd(this));
      this.bS.a(3, new bye<>(this, cfp.class, true, false));
      this.bS.a(4, new byk<>(this, false));
   }

   public static bqu.a r() {
      return cfy.gt().a(bqv.q, 40.0).a(bqv.r, 0.3F).a(bqv.c, 7.0).a(bqv.k, 64.0).a(bqv.v, 1.0);
   }

   @Override
   public void h(@Nullable bpo $$0) {
      super.h($$0);
      bqr $$1 = this.f(bqv.r);
      if ($$0 == null) {
         this.cc = 0;
         this.an.a(bZ, false);
         this.an.a(ca, false);
         $$1.b(d.a());
      } else {
         this.cc = this.ah;
         this.an.a(bZ, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bY, Optional.empty());
      $$0.a(bZ, false);
      $$0.a(ca, false);
   }

   @Override
   public void c() {
      this.a(cd.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ce = $$0;
   }

   @Override
   public int a() {
      return this.ce;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   public void s() {
      if (this.ah >= this.cb + 400) {
         this.cb = this.ah;
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), aty.ic, this.db(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aim<?> $$0) {
      if (bZ.equals($$0) && this.gp() && this.dM().B) {
         this.s();
      }

      super.a($$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      dmz $$1 = this.gn();
      if ($$1 != null) {
         $$0.a("carriedBlockState", tp.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      dmz $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = tp.a(this.dM().a(kj.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dM(), $$0);
   }

   boolean g(cis $$0) {
      cqk $$1 = $$0.fZ().j.get(3);
      if ($$1.a(dac.ee.l())) {
         return false;
      } else {
         epr $$2 = $$0.f(1.0F).d();
         epr $$3 = new epr(this.dr() - $$0.dr(), this.dv() - $$0.dv(), this.dx() - $$0.dx());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   public void m_() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(kc.aa, this.d(0.5), this.du() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bm = false;
      if (!this.dM().B) {
         this.a((apf)this.dM(), true);
      }

      super.m_();
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   protected void Y() {
      if (this.dM().P() && this.ah >= this.cc + 600) {
         float $$0 = this.br();
         if ($$0 > 0.5F && this.dM().h(this.dm()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.Y();
   }

   protected boolean y() {
      if (!this.dM().x_() && this.bA()) {
         double $$0 = this.dr() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.dt() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dx() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bow $$0) {
      epr $$1 = new epr(this.dr() - $$0.dr(), this.e(0.5) - $$0.dv(), this.dx() - $$0.dx());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dr() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dt() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dx() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      ib.a $$3 = new ib.a($$0, $$1, $$2);

      while ($$3.v() > this.dM().I_() && !this.dM().a_($$3).d()) {
         $$3.c(ih.a);
      }

      dmz $$4 = this.dM().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(aus.a);
      if ($$5 && !$$6) {
         epr $$7 = this.dk();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dM().a(drn.R, $$7, drn.a.a(this));
            if (!this.aU()) {
               this.dM().a(null, this.K, this.L, this.M, aty.id, this.db(), 1.0F, 1.0F);
               this.a(aty.id, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected atx v() {
      return this.go() ? aty.ib : aty.hY;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.ia;
   }

   @Override
   protected atx n_() {
      return aty.hZ;
   }

   @Override
   protected void a(bnv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dmz $$3 = this.gn();
      if ($$3 != null) {
         cqk $$4 = new cqk(cqn.ph);
         $$4.a(cux.v, 1);
         ela.a $$5 = new ela.a((apf)this.dM()).a(enf.f, this.dk()).a(enf.i, $$4).b(enf.a, this);

         for (cqk $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dmz $$0) {
      this.an.a(bY, Optional.ofNullable($$0));
   }

   @Nullable
   public dmz gn() {
      return this.an.a(bY).orElse(null);
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cjw;
         if (!$$0.a(aup.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dM().x_() && !($$0.d() instanceof bpo) && this.ag.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cjw)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bnv $$0, cjw $$1, float $$2) {
      cqk $$3 = $$1.p();
      il<csh> $$4 = csj.d($$3);
      List<boj> $$5 = csj.a($$3);
      boolean $$6 = $$4.a(csk.c) && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean go() {
      return this.an.a(bZ);
   }

   public boolean gp() {
      return this.an.a(ca);
   }

   public void gq() {
      this.an.a(ca, true);
   }

   @Override
   public boolean V() {
      return super.V() || this.gn() != null;
   }

   static class a extends bwl {
      private final cfo a;
      @Nullable
      private bpo b;

      public a(cfo $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.c, bwl.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cis)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cis)this.b);
         }
      }

      @Override
      public void c() {
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.b.dr(), this.b.dv(), this.b.dx());
      }
   }

   static class b extends bwl {
      private final cfo a;

      public b(cfo $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() == null) {
            return false;
         } else {
            return !this.a.dM().Z().b(cwv.c) ? false : this.a.ei().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         axd $$0 = this.a.ei();
         cwz $$1 = this.a.dM();
         int $$2 = aww.a(this.a.dr() - 1.0 + $$0.j() * 2.0);
         int $$3 = aww.a(this.a.dt() + $$0.j() * 2.0);
         int $$4 = aww.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         ib $$5 = new ib($$2, $$3, $$4);
         dmz $$6 = $$1.a_($$5);
         ib $$7 = $$5.d();
         dmz $$8 = $$1.a_($$7);
         dmz $$9 = this.a.gn();
         if ($$9 != null) {
            $$9 = daa.b($$9, this.a.dM(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(drn.i, $$5, drn.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cwz $$0, ib $$1, dmz $$2, dmz $$3, dmz $$4, ib $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dac.F) && $$4.r($$0, $$5) && $$2.a((cxc)$$0, $$1) && $$0.a_(this.a, epm.a(epr.a($$1))).isEmpty();
      }
   }

   static class c extends bye<cis> {
      private final cfo i;
      @Nullable
      private cis j;
      private int k;
      private int l;
      private final cae m;
      private final cae n = cae.a().d();
      private final Predicate<bpo> o;

      public c(cfo $$0, @Nullable Predicate<bpo> $$1) {
         super($$0, cis.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cis)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cae.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dM().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gq();
      }

      @Override
      public void d() {
         this.j = null;
         super.d();
      }

      @Override
      public boolean b() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.z(this.c)) {
                  return false;
               }

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.b();
         }
      }

      @Override
      public void e() {
         if (this.i.p() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bO()) {
               if (this.i.g((cis)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.y();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.b(this.c)) {
                  this.l = 0;
               }
            }

            super.e();
         }
      }
   }

   static class d extends bwl {
      private final cfo a;

      public d(cfo $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() != null) {
            return false;
         } else {
            return !this.a.dM().Z().b(cwv.c) ? false : this.a.ei().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         axd $$0 = this.a.ei();
         cwz $$1 = this.a.dM();
         int $$2 = aww.a(this.a.dr() - 2.0 + $$0.j() * 4.0);
         int $$3 = aww.a(this.a.dt() + $$0.j() * 3.0);
         int $$4 = aww.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         ib $$5 = new ib($$2, $$3, $$4);
         dmz $$6 = $$1.a_($$5);
         epr $$7 = new epr((double)this.a.dq() + 0.5, (double)$$3 + 0.5, (double)this.a.dw() + 0.5);
         epr $$8 = new epr((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         epn $$9 = $$1.a(new cwi($$7, $$8, cwi.a.b, cwi.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(aun.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(drn.f, $$5, drn.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
