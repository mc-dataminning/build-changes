import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgp extends cgz implements bqu {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final brt d = new brt(c, "Attacking speed boost", 0.15F, brt.a.a);
   private static final int e = 400;
   private static final int bX = 600;
   private static final aiy<Optional<doz>> bY = ajc.a(cgp.class, aja.j);
   private static final aiy<Boolean> bZ = ajc.a(cgp.class, aja.k);
   private static final aiy<Boolean> ca = ajc.a(cgp.class, aja.k);
   private int cb = Integer.MIN_VALUE;
   private int cc;
   private static final bnl cd = ayj.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public cgp(bqb<? extends cgp> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new cgp.a(this));
      this.bR.a(2, new bxv(this, 1.0, false));
      this.bR.a(7, new byy(this, 1.0, 0.0F));
      this.bR.a(8, new bxt(this, cjt.class, 8.0F));
      this.bR.a(8, new byg(this));
      this.bR.a(10, new cgp.b(this));
      this.bR.a(11, new cgp.d(this));
      this.bS.a(1, new cgp.c(this, this::a_));
      this.bS.a(2, new bzd(this));
      this.bS.a(3, new bze<>(this, cgq.class, true, false));
      this.bS.a(4, new bzk<>(this, false));
   }

   public static bru.a r() {
      return cgz.gt().a(brv.q, 40.0).a(brv.r, 0.3F).a(brv.c, 7.0).a(brv.k, 64.0).a(brv.v, 1.0);
   }

   @Override
   public void h(@Nullable bqo $$0) {
      super.h($$0);
      brr $$1 = this.f(brv.r);
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
   protected void a(ajc.a $$0) {
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

   public void u() {
      if (this.ah >= this.cb + 400) {
         this.cb = this.ah;
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), aum.ii, this.db(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aiy<?> $$0) {
      if (bZ.equals($$0) && this.gp() && this.dM().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      doz $$1 = this.gn();
      if ($$1 != null) {
         $$0.a("carriedBlockState", ub.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      doz $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = ub.a(this.dM().a(ks.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dM(), $$0);
   }

   boolean g(cjt $$0) {
      crj $$1 = $$0.fZ().j.get(3);
      if ($$1.a(dca.ee.p())) {
         return false;
      } else {
         esa $$2 = $$0.f(1.0F).d();
         esa $$3 = new esa(this.dr() - $$0.dr(), this.dv() - $$0.dv(), this.dx() - $$0.dx());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(kl.aa, this.d(0.5), this.du() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bm = false;
      if (!this.dM().B) {
         this.a((aps)this.dM(), true);
      }

      super.n_();
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   protected void Y() {
      if (this.dM().Q() && this.ah >= this.cc + 600) {
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

   boolean b(bpv $$0) {
      esa $$1 = new esa(this.dr() - $$0.dr(), this.e(0.5) - $$0.dv(), this.dx() - $$0.dx());
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

      doz $$4 = this.dM().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(avh.a);
      if ($$5 && !$$6) {
         esa $$7 = this.dk();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dM().a(dts.R, $$7, dts.a.a(this));
            if (!this.aU()) {
               this.dM().a(null, this.K, this.L, this.M, aum.ij, this.db(), 1.0F, 1.0F);
               this.a(aum.ij, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected aul v() {
      return this.go() ? aum.ih : aum.ie;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.ig;
   }

   @Override
   protected aul o_() {
      return aum.if;
   }

   @Override
   protected void a(bot $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      doz $$3 = this.gn();
      if ($$3 != null) {
         crj $$4 = new crj(crm.ph);
         $$4.a(cwt.v, 1);
         enh.a $$5 = new enh.a((aps)this.dM()).a(epo.f, this.dk()).a(epo.i, $$4).b(epo.a, this);

         for (crj $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable doz $$0) {
      this.an.a(bY, Optional.ofNullable($$0));
   }

   @Nullable
   public doz gn() {
      return this.an.a(bY).orElse(null);
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof ckx;
         if (!$$0.a(ave.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dM().x_() && !($$0.d() instanceof bqo) && this.ag.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (ckx)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bot $$0, ckx $$1, float $$2) {
      crj $$3 = $$1.p();
      cth $$4 = $$3.a(jp.x, cth.a);
      return $$4.a(cti.a) ? super.a($$0, $$2) : false;
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

   static class a extends bxl {
      private final cgp a;
      @Nullable
      private bqo b;

      public a(cgp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bxl.a.c, bxl.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cjt)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cjt)this.b);
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

   static class b extends bxl {
      private final cgp a;

      public b(cgp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() == null) {
            return false;
         } else {
            return !this.a.dM().aa().b(cyt.c) ? false : this.a.ei().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         axr $$0 = this.a.ei();
         cyx $$1 = this.a.dM();
         int $$2 = axk.a(this.a.dr() - 1.0 + $$0.j() * 2.0);
         int $$3 = axk.a(this.a.dt() + $$0.j() * 2.0);
         int $$4 = axk.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         ib $$5 = new ib($$2, $$3, $$4);
         doz $$6 = $$1.a_($$5);
         ib $$7 = $$5.d();
         doz $$8 = $$1.a_($$7);
         doz $$9 = this.a.gn();
         if ($$9 != null) {
            $$9 = dby.b($$9, this.a.dM(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dts.i, $$5, dts.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cyx $$0, ib $$1, doz $$2, doz $$3, doz $$4, ib $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dca.F) && $$4.r($$0, $$5) && $$2.a((cza)$$0, $$1) && $$0.a_(this.a, erv.a(esa.a($$1))).isEmpty();
      }
   }

   static class c extends bze<cjt> {
      private final cgp i;
      @Nullable
      private cjt j;
      private int k;
      private int l;
      private final cbe m;
      private final cbe n = cbe.a().d();
      private final Predicate<bqo> o;

      public c(cgp $$0, @Nullable Predicate<bqo> $$1) {
         super($$0, cjt.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cjt)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cbe.a().a(this.l()).a(this.o);
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
               if (this.i.g((cjt)this.c)) {
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

   static class d extends bxl {
      private final cgp a;

      public d(cgp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() != null) {
            return false;
         } else {
            return !this.a.dM().aa().b(cyt.c) ? false : this.a.ei().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         axr $$0 = this.a.ei();
         cyx $$1 = this.a.dM();
         int $$2 = axk.a(this.a.dr() - 2.0 + $$0.j() * 4.0);
         int $$3 = axk.a(this.a.dt() + $$0.j() * 3.0);
         int $$4 = axk.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         ib $$5 = new ib($$2, $$3, $$4);
         doz $$6 = $$1.a_($$5);
         esa $$7 = new esa((double)this.a.dq() + 0.5, (double)$$3 + 0.5, (double)this.a.dw() + 0.5);
         esa $$8 = new esa((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         erw $$9 = $$1.a(new cyg($$7, $$8, cyg.a.b, cyg.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(avc.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dts.f, $$5, dts.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
