import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfq extends cga implements bpv {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bqu d = new bqu(c, "Attacking speed boost", 0.15F, bqu.a.a);
   private static final int e = 400;
   private static final int bX = 600;
   private static final aim<Optional<dnb>> bY = aiq.a(cfq.class, aio.j);
   private static final aim<Boolean> bZ = aiq.a(cfq.class, aio.k);
   private static final aim<Boolean> ca = aiq.a(cfq.class, aio.k);
   private int cb = Integer.MIN_VALUE;
   private int cc;
   private static final bmo cd = axv.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public cfq(bpd<? extends cfq> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new cfq.a(this));
      this.bR.a(2, new bww(this, 1.0, false));
      this.bR.a(7, new bxz(this, 1.0, 0.0F));
      this.bR.a(8, new bwu(this, ciu.class, 8.0F));
      this.bR.a(8, new bxh(this));
      this.bR.a(10, new cfq.b(this));
      this.bR.a(11, new cfq.d(this));
      this.bS.a(1, new cfq.c(this, this::a_));
      this.bS.a(2, new bye(this));
      this.bS.a(3, new byf<>(this, cfr.class, true, false));
      this.bS.a(4, new byl<>(this, false));
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.q, 40.0).a(bqw.r, 0.3F).a(bqw.c, 7.0).a(bqw.k, 64.0).a(bqw.v, 1.0);
   }

   @Override
   public void h(@Nullable bpp $$0) {
      super.h($$0);
      bqs $$1 = this.f(bqw.r);
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
            this.dM().a(this.dr(), this.dv(), this.dx(), aty.ig, this.db(), 2.5F, 1.0F, false);
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
      dnb $$1 = this.gn();
      if ($$1 != null) {
         $$0.a("carriedBlockState", tp.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      dnb $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = tp.a(this.dM().a(kj.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dM(), $$0);
   }

   boolean g(ciu $$0) {
      cqm $$1 = $$0.fZ().j.get(3);
      if ($$1.a(dae.ee.l())) {
         return false;
      } else {
         ept $$2 = $$0.f(1.0F).d();
         ept $$3 = new ept(this.dr() - $$0.dr(), this.dv() - $$0.dv(), this.dx() - $$0.dx());
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

   boolean b(box $$0) {
      ept $$1 = new ept(this.dr() - $$0.dr(), this.e(0.5) - $$0.dv(), this.dx() - $$0.dx());
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

      dnb $$4 = this.dM().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(aus.a);
      if ($$5 && !$$6) {
         ept $$7 = this.dk();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dM().a(drp.R, $$7, drp.a.a(this));
            if (!this.aU()) {
               this.dM().a(null, this.K, this.L, this.M, aty.ih, this.db(), 1.0F, 1.0F);
               this.a(aty.ih, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected atx v() {
      return this.go() ? aty.if : aty.ic;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.ie;
   }

   @Override
   protected atx n_() {
      return aty.id;
   }

   @Override
   protected void a(bnw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dnb $$3 = this.gn();
      if ($$3 != null) {
         cqm $$4 = new cqm(cqp.ph);
         $$4.a(cuz.v, 1);
         elc.a $$5 = new elc.a((apf)this.dM()).a(enh.f, this.dk()).a(enh.i, $$4).b(enh.a, this);

         for (cqm $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dnb $$0) {
      this.an.a(bY, Optional.ofNullable($$0));
   }

   @Nullable
   public dnb gn() {
      return this.an.a(bY).orElse(null);
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cjy;
         if (!$$0.a(aup.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dM().x_() && !($$0.d() instanceof bpp) && this.ag.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cjy)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bnw $$0, cjy $$1, float $$2) {
      cqm $$3 = $$1.p();
      il<csj> $$4 = csl.d($$3);
      List<bok> $$5 = csl.a($$3);
      boolean $$6 = $$4.a(csm.c) && $$5.isEmpty();
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

   static class a extends bwm {
      private final cfq a;
      @Nullable
      private bpp b;

      public a(cfq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwm.a.c, bwm.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof ciu)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((ciu)this.b);
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

   static class b extends bwm {
      private final cfq a;

      public b(cfq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() == null) {
            return false;
         } else {
            return !this.a.dM().Z().b(cwx.c) ? false : this.a.ei().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         axd $$0 = this.a.ei();
         cxb $$1 = this.a.dM();
         int $$2 = aww.a(this.a.dr() - 1.0 + $$0.j() * 2.0);
         int $$3 = aww.a(this.a.dt() + $$0.j() * 2.0);
         int $$4 = aww.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         ib $$5 = new ib($$2, $$3, $$4);
         dnb $$6 = $$1.a_($$5);
         ib $$7 = $$5.d();
         dnb $$8 = $$1.a_($$7);
         dnb $$9 = this.a.gn();
         if ($$9 != null) {
            $$9 = dac.b($$9, this.a.dM(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(drp.i, $$5, drp.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cxb $$0, ib $$1, dnb $$2, dnb $$3, dnb $$4, ib $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dae.F) && $$4.r($$0, $$5) && $$2.a((cxe)$$0, $$1) && $$0.a_(this.a, epo.a(ept.a($$1))).isEmpty();
      }
   }

   static class c extends byf<ciu> {
      private final cfq i;
      @Nullable
      private ciu j;
      private int k;
      private int l;
      private final caf m;
      private final caf n = caf.a().d();
      private final Predicate<bpp> o;

      public c(cfq $$0, @Nullable Predicate<bpp> $$1) {
         super($$0, ciu.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((ciu)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = caf.a().a(this.l()).a(this.o);
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
               if (this.i.g((ciu)this.c)) {
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

   static class d extends bwm {
      private final cfq a;

      public d(cfq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() != null) {
            return false;
         } else {
            return !this.a.dM().Z().b(cwx.c) ? false : this.a.ei().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         axd $$0 = this.a.ei();
         cxb $$1 = this.a.dM();
         int $$2 = aww.a(this.a.dr() - 2.0 + $$0.j() * 4.0);
         int $$3 = aww.a(this.a.dt() + $$0.j() * 3.0);
         int $$4 = aww.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         ib $$5 = new ib($$2, $$3, $$4);
         dnb $$6 = $$1.a_($$5);
         ept $$7 = new ept((double)this.a.dq() + 0.5, (double)$$3 + 0.5, (double)this.a.dw() + 0.5);
         ept $$8 = new ept((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         epp $$9 = $$1.a(new cwk($$7, $$8, cwk.a.b, cwk.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(aun.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(drp.f, $$5, drp.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
