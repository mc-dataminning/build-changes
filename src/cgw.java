import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgw extends chg implements bqz {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bry d = new bry(c, "Attacking speed boost", 0.15F, bry.a.a);
   private static final int e = 400;
   private static final int bX = 600;
   private static final aja<Optional<dpi>> bY = aje.a(cgw.class, ajc.j);
   private static final aja<Boolean> bZ = aje.a(cgw.class, ajc.k);
   private static final aja<Boolean> ca = aje.a(cgw.class, ajc.k);
   private int cb = Integer.MIN_VALUE;
   private int cc;
   private static final bnq cd = ayl.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public cgw(bqg<? extends cgw> $$0, czg $$1) {
      super($$0, $$1);
      this.a(els.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new cgw.a(this));
      this.bR.a(2, new bya(this, 1.0, false));
      this.bR.a(7, new bzd(this, 1.0, 0.0F));
      this.bR.a(8, new bxy(this, cka.class, 8.0F));
      this.bR.a(8, new byl(this));
      this.bR.a(10, new cgw.b(this));
      this.bR.a(11, new cgw.d(this));
      this.bS.a(1, new cgw.c(this, this::a_));
      this.bS.a(2, new bzi(this));
      this.bS.a(3, new bzj<>(this, cgx.class, true, false));
      this.bS.a(4, new bzp<>(this, false));
   }

   public static brz.a r() {
      return chg.gt().a(bsa.q, 40.0).a(bsa.r, 0.3F).a(bsa.c, 7.0).a(bsa.k, 64.0).a(bsa.v, 1.0);
   }

   @Override
   public void h(@Nullable bqt $$0) {
      super.h($$0);
      brw $$1 = this.f(bsa.r);
      if ($$0 == null) {
         this.cc = 0;
         this.an.a(bZ, false);
         this.an.a(ca, false);
         $$1.b(d.b());
      } else {
         this.cc = this.ah;
         this.an.a(bZ, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void a(aje.a $$0) {
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
            this.dM().a(this.dr(), this.dv(), this.dx(), auo.ii, this.db(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aja<?> $$0) {
      if (bZ.equals($$0) && this.gp() && this.dM().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      dpi $$1 = this.gn();
      if ($$1 != null) {
         $$0.a("carriedBlockState", ud.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      dpi $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = ud.a(this.dM().a(ku.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dM(), $$0);
   }

   boolean g(cka $$0) {
      crs $$1 = $$0.fZ().j.get(3);
      if ($$1.a(dcj.ee.p())) {
         return false;
      } else {
         esj $$2 = $$0.f(1.0F).d();
         esj $$3 = new esj(this.dr() - $$0.dr(), this.dv() - $$0.dv(), this.dx() - $$0.dx());
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
            this.dM().a(kn.aa, this.d(0.5), this.du() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bm = false;
      if (!this.dM().B) {
         this.a((apu)this.dM(), true);
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

   boolean b(bqa $$0) {
      esj $$1 = new esj(this.dr() - $$0.dr(), this.e(0.5) - $$0.dv(), this.dx() - $$0.dx());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dr() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dt() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dx() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      id.a $$3 = new id.a($$0, $$1, $$2);

      while ($$3.v() > this.dM().I_() && !this.dM().a_($$3).d()) {
         $$3.c(ij.a);
      }

      dpi $$4 = this.dM().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(avj.a);
      if ($$5 && !$$6) {
         esj $$7 = this.dk();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dM().a(dub.R, $$7, dub.a.a(this));
            if (!this.aU()) {
               this.dM().a(null, this.K, this.L, this.M, auo.ij, this.db(), 1.0F, 1.0F);
               this.a(auo.ij, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected aun v() {
      return this.go() ? auo.ih : auo.ie;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.ig;
   }

   @Override
   protected aun o_() {
      return auo.if;
   }

   @Override
   protected void a(boy $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dpi $$3 = this.gn();
      if ($$3 != null) {
         crs $$4 = new crs(crv.ph);
         $$4.a(cxc.v, 1);
         enq.a $$5 = new enq.a((apu)this.dM()).a(epx.f, this.dk()).a(epx.i, $$4).b(epx.a, this);

         for (crs $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dpi $$0) {
      this.an.a(bY, Optional.ofNullable($$0));
   }

   @Nullable
   public dpi gn() {
      return this.an.a(bY).orElse(null);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cle;
         if (!$$0.a(avg.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dM().x_() && !($$0.d() instanceof bqt) && this.ag.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cle)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(boy $$0, cle $$1, float $$2) {
      crs $$3 = $$1.p();
      ctq $$4 = $$3.a(jr.x, ctq.a);
      return $$4.a(ctr.a) ? super.a($$0, $$2) : false;
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

   static class a extends bxq {
      private final cgw a;
      @Nullable
      private bqt b;

      public a(cgw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bxq.a.c, bxq.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cka)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cka)this.b);
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

   static class b extends bxq {
      private final cgw a;

      public b(cgw $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() == null) {
            return false;
         } else {
            return !this.a.dM().aa().b(czc.c) ? false : this.a.ei().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         axt $$0 = this.a.ei();
         czg $$1 = this.a.dM();
         int $$2 = axm.a(this.a.dr() - 1.0 + $$0.j() * 2.0);
         int $$3 = axm.a(this.a.dt() + $$0.j() * 2.0);
         int $$4 = axm.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         id $$5 = new id($$2, $$3, $$4);
         dpi $$6 = $$1.a_($$5);
         id $$7 = $$5.d();
         dpi $$8 = $$1.a_($$7);
         dpi $$9 = this.a.gn();
         if ($$9 != null) {
            $$9 = dch.b($$9, this.a.dM(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dub.i, $$5, dub.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(czg $$0, id $$1, dpi $$2, dpi $$3, dpi $$4, id $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dcj.F) && $$4.r($$0, $$5) && $$2.a((czj)$$0, $$1) && $$0.a_(this.a, ese.a(esj.a($$1))).isEmpty();
      }
   }

   static class c extends bzj<cka> {
      private final cgw i;
      @Nullable
      private cka j;
      private int k;
      private int l;
      private final cbj m;
      private final cbj n = cbj.a().d();
      private final Predicate<bqt> o;

      public c(cgw $$0, @Nullable Predicate<bqt> $$1) {
         super($$0, cka.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cka)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cbj.a().a(this.l()).a(this.o);
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
               if (this.i.g((cka)this.c)) {
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

   static class d extends bxq {
      private final cgw a;

      public d(cgw $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() != null) {
            return false;
         } else {
            return !this.a.dM().aa().b(czc.c) ? false : this.a.ei().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         axt $$0 = this.a.ei();
         czg $$1 = this.a.dM();
         int $$2 = axm.a(this.a.dr() - 2.0 + $$0.j() * 4.0);
         int $$3 = axm.a(this.a.dt() + $$0.j() * 3.0);
         int $$4 = axm.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         id $$5 = new id($$2, $$3, $$4);
         dpi $$6 = $$1.a_($$5);
         esj $$7 = new esj((double)this.a.dq() + 0.5, (double)$$3 + 0.5, (double)this.a.dw() + 0.5);
         esj $$8 = new esj((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         esf $$9 = $$1.a(new cyp($$7, $$8, cyp.a.b, cyp.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(ave.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dub.f, $$5, dub.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
