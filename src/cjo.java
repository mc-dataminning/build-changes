import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjo extends cjy implements btq {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final buq d = new buq(c, "Attacking speed boost", 0.15F, buq.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final akg<Optional<drx>> bZ = akk.a(cjo.class, aki.j);
   private static final akg<Boolean> ca = akk.a(cjo.class, aki.k);
   private static final akg<Boolean> cb = akk.a(cjo.class, aki.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final bqa ce = azu.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cjo(bsv<? extends cjo> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cjo.a(this));
      this.bS.a(2, new cas(this, 1.0, false));
      this.bS.a(7, new cbv(this, 1.0, 0.0F));
      this.bS.a(8, new caq(this, cms.class, 8.0F));
      this.bS.a(8, new cbd(this));
      this.bS.a(10, new cjo.b(this));
      this.bS.a(11, new cjo.d(this));
      this.bT.a(1, new cjo.c(this, this::a_));
      this.bT.a(2, new cca(this));
      this.bT.a(3, new ccb<>(this, cjp.class, true, false));
      this.bT.a(4, new cch<>(this, false));
   }

   public static bur.a s() {
      return cjy.gw().a(bus.q, 40.0).a(bus.r, 0.3F).a(bus.c, 7.0).a(bus.k, 64.0).a(bus.v, 1.0);
   }

   @Override
   public void h(@Nullable btk $$0) {
      super.h($$0);
      buo $$1 = this.f(bus.r);
      if ($$0 == null) {
         this.cd = 0;
         this.ao.a(ca, false);
         this.ao.a(cb, false);
         $$1.b(d.b());
      } else {
         this.cd = this.ai;
         this.ao.a(ca, true);
         if (!$$1.a(d)) {
            $$1.c(d);
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
      this.a(ce.a(this.ah));
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

   public void u() {
      if (this.ai >= this.cc + 400) {
         this.cc = this.ai;
         if (!this.aW()) {
            this.dP().a(this.du(), this.dy(), this.dA(), avw.in, this.de(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (ca.equals($$0) && this.gs() && this.dP().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      drx $$1 = this.gq();
      if ($$1 != null) {
         $$0.a("carriedBlockState", vg.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      drx $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = vg.a(this.dP().a(lq.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dP(), $$0);
   }

   boolean g(cms $$0) {
      cuk $$1 = $$0.gc().i.get(3);
      if ($$1.a(dew.ee.r())) {
         return false;
      } else {
         evm $$2 = $$0.f(1.0F).d();
         evm $$3 = new evm(this.du() - $$0.du(), this.dy() - $$0.dy(), this.dA() - $$0.dA());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dP().a(lj.ac, this.d(0.5), this.dx() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dP().B) {
         this.a((arb)this.dP(), true);
      }

      super.n_();
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dP().R() && this.ai >= this.cd + 600) {
         float $$0 = this.bt();
         if ($$0 > 0.5F && this.dP().h(this.dp()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.Z();
   }

   protected boolean y() {
      if (!this.dP().x_() && this.bD()) {
         double $$0 = this.du() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.dw() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dA() + (this.ah.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bsp $$0) {
      evm $$1 = new evm(this.du() - $$0.du(), this.e(0.5) - $$0.dy(), this.dA() - $$0.dA());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.du() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dw() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dA() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      iz.a $$3 = new iz.a($$0, $$1, $$2);

      while ($$3.v() > this.dP().I_() && !this.dP().a_($$3).d()) {
         $$3.c(je.a);
      }

      drx $$4 = this.dP().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awr.a);
      if ($$5 && !$$6) {
         evm $$7 = this.dn();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dP().a(dwq.R, $$7, dwq.a.a(this));
            if (!this.aW()) {
               this.dP().a(null, this.L, this.M, this.N, avw.io, this.de(), 1.0F, 1.0F);
               this.a(avw.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avv v() {
      return this.gr() ? avw.im : avw.ij;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.il;
   }

   @Override
   protected avv o_() {
      return avw.ik;
   }

   @Override
   protected void a(bri $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      drx $$3 = this.gq();
      if ($$3 != null) {
         cuk $$4 = new cuk(cun.pi);
         $$4.a(czy.v, 1);
         eqg.a $$5 = new eqg.a((arb)this.dP()).a(esz.f, this.dn()).a(esz.i, $$4).b(esz.a, this);

         for (cuk $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable drx $$0) {
      this.ao.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public drx gq() {
      return this.ao.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cnw;
         if (!$$0.a(awn.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dP().x_() && !($$0.d() instanceof btk) && this.ah.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cnw)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bri $$0, cnw $$1, float $$2) {
      cuk $$3 = $$1.p();
      cwl $$4 = $$3.a(km.F, cwl.a);
      return $$4.a(cwm.a) ? super.a($$0, $$2) : false;
   }

   public boolean gr() {
      return this.ao.a(ca);
   }

   public boolean gs() {
      return this.ao.a(cb);
   }

   public void gt() {
      this.ao.a(cb, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.gq() != null;
   }

   static class a extends cai {
      private final cjo a;
      @Nullable
      private btk b;

      public a(cjo $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cai.a.c, cai.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cms)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cms)this.b);
         }
      }

      @Override
      public void c() {
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.b.du(), this.b.dy(), this.b.dA());
      }
   }

   static class b extends cai {
      private final cjo a;

      public b(cjo $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gq() == null) {
            return false;
         } else {
            return !this.a.dP().ab().b(dbp.c) ? false : this.a.el().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         azc $$0 = this.a.el();
         dbt $$1 = this.a.dP();
         int $$2 = ayu.a(this.a.du() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayu.a(this.a.dw() + $$0.j() * 2.0);
         int $$4 = ayu.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         iz $$5 = new iz($$2, $$3, $$4);
         drx $$6 = $$1.a_($$5);
         iz $$7 = $$5.d();
         drx $$8 = $$1.a_($$7);
         drx $$9 = this.a.gq();
         if ($$9 != null) {
            $$9 = deu.b($$9, this.a.dP(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dwq.i, $$5, dwq.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(dbt $$0, iz $$1, drx $$2, drx $$3, drx $$4, iz $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dew.F) && $$4.r($$0, $$5) && $$2.a((dbw)$$0, $$1) && $$0.a_(this.a, evh.a(evm.a($$1))).isEmpty();
      }
   }

   static class c extends ccb<cms> {
      private final cjo i;
      @Nullable
      private cms j;
      private int k;
      private int l;
      private final ceb m;
      private final ceb n = ceb.a().d();
      private final Predicate<btk> o;

      public c(cjo $$0, @Nullable Predicate<btk> $$1) {
         super($$0, cms.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cms)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = ceb.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dP().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gt();
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
            if (this.c != null && !this.i.bR()) {
               if (this.i.g((cms)this.c)) {
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

   static class d extends cai {
      private final cjo a;

      public d(cjo $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gq() != null) {
            return false;
         } else {
            return !this.a.dP().ab().b(dbp.c) ? false : this.a.el().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         azc $$0 = this.a.el();
         dbt $$1 = this.a.dP();
         int $$2 = ayu.a(this.a.du() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayu.a(this.a.dw() + $$0.j() * 3.0);
         int $$4 = ayu.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         iz $$5 = new iz($$2, $$3, $$4);
         drx $$6 = $$1.a_($$5);
         evm $$7 = new evm((double)this.a.dt() + 0.5, (double)$$3 + 0.5, (double)this.a.dz() + 0.5);
         evm $$8 = new evm((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         evi $$9 = $$1.a(new dbc($$7, $$8, dbc.a.b, dbc.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(awl.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dwq.f, $$5, dwq.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
