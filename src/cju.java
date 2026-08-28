import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cju extends cke implements btw {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final buw d = new buw(c, "Attacking speed boost", 0.15F, buw.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final akk<Optional<dsd>> bZ = ako.a(cju.class, akm.j);
   private static final akk<Boolean> ca = ako.a(cju.class, akm.k);
   private static final akk<Boolean> cb = ako.a(cju.class, akm.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final bqg ce = azz.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cju(btb<? extends cju> $$0, dbz $$1) {
      super($$0, $$1);
      this.a(eon.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cai(this));
      this.bS.a(1, new cju.a(this));
      this.bS.a(2, new cay(this, 1.0, false));
      this.bS.a(7, new ccb(this, 1.0, 0.0F));
      this.bS.a(8, new caw(this, cmy.class, 8.0F));
      this.bS.a(8, new cbj(this));
      this.bS.a(10, new cju.b(this));
      this.bS.a(11, new cju.d(this));
      this.bT.a(1, new cju.c(this, this::a_));
      this.bT.a(2, new ccg(this));
      this.bT.a(3, new cch<>(this, cjv.class, true, false));
      this.bT.a(4, new ccn<>(this, false));
   }

   public static bux.a s() {
      return cke.gw().a(buy.q, 40.0).a(buy.r, 0.3F).a(buy.c, 7.0).a(buy.k, 64.0).a(buy.v, 1.0);
   }

   @Override
   public void h(@Nullable btq $$0) {
      super.h($$0);
      buu $$1 = this.f(buy.r);
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
   protected void a(ako.a $$0) {
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
            this.dP().a(this.du(), this.dy(), this.dA(), awa.in, this.de(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akk<?> $$0) {
      if (ca.equals($$0) && this.gs() && this.dP().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      dsd $$1 = this.gq();
      if ($$1 != null) {
         $$0.a("carriedBlockState", vh.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      dsd $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = vh.a(this.dP().a(lq.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dP(), $$0);
   }

   boolean g(cmy $$0) {
      cuq $$1 = $$0.gc().i.get(3);
      if ($$1.a(dfc.ee.r())) {
         return false;
      } else {
         evs $$2 = $$0.f(1.0F).d();
         evs $$3 = new evs(this.du() - $$0.du(), this.dy() - $$0.dy(), this.dA() - $$0.dA());
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
            this.dP().a(li.ac, this.d(0.5), this.dx() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dP().B) {
         this.a((arf)this.dP(), true);
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

   boolean b(bsv $$0) {
      evs $$1 = new evs(this.du() - $$0.du(), this.e(0.5) - $$0.dy(), this.dA() - $$0.dA());
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

      dsd $$4 = this.dP().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awv.a);
      if ($$5 && !$$6) {
         evs $$7 = this.dn();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dP().a(dww.R, $$7, dww.a.a(this));
            if (!this.aW()) {
               this.dP().a(null, this.L, this.M, this.N, awa.io, this.de(), 1.0F, 1.0F);
               this.a(awa.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avz v() {
      return this.gr() ? awa.im : awa.ij;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.il;
   }

   @Override
   protected avz o_() {
      return awa.ik;
   }

   @Override
   protected void a(bro $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dsd $$3 = this.gq();
      if ($$3 != null) {
         cuq $$4 = new cuq(cut.pi);
         $$4.a(dae.v, 1);
         eqm.a $$5 = new eqm.a((arf)this.dP()).a(etf.f, this.dn()).a(etf.i, $$4).b(etf.a, this);

         for (cuq $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dsd $$0) {
      this.ao.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public dsd gq() {
      return this.ao.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof coc;
         if (!$$0.a(awr.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dP().x_() && !($$0.d() instanceof btq) && this.ah.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (coc)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bro $$0, coc $$1, float $$2) {
      cuq $$3 = $$1.p();
      cwr $$4 = $$3.a(km.G, cwr.a);
      return $$4.a(cws.a) ? super.a($$0, $$2) : false;
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

   static class a extends cao {
      private final cju a;
      @Nullable
      private btq b;

      public a(cju $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cao.a.c, cao.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cmy)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cmy)this.b);
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

   static class b extends cao {
      private final cju a;

      public b(cju $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gq() == null) {
            return false;
         } else {
            return !this.a.dP().ab().b(dbv.c) ? false : this.a.el().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         azh $$0 = this.a.el();
         dbz $$1 = this.a.dP();
         int $$2 = ayz.a(this.a.du() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayz.a(this.a.dw() + $$0.j() * 2.0);
         int $$4 = ayz.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         iz $$5 = new iz($$2, $$3, $$4);
         dsd $$6 = $$1.a_($$5);
         iz $$7 = $$5.d();
         dsd $$8 = $$1.a_($$7);
         dsd $$9 = this.a.gq();
         if ($$9 != null) {
            $$9 = dfa.b($$9, this.a.dP(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dww.i, $$5, dww.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(dbz $$0, iz $$1, dsd $$2, dsd $$3, dsd $$4, iz $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dfc.F) && $$4.r($$0, $$5) && $$2.a((dcc)$$0, $$1) && $$0.a_(this.a, evn.a(evs.a($$1))).isEmpty();
      }
   }

   static class c extends cch<cmy> {
      private final cju i;
      @Nullable
      private cmy j;
      private int k;
      private int l;
      private final ceh m;
      private final ceh n = ceh.a().d();
      private final Predicate<btq> o;

      public c(cju $$0, @Nullable Predicate<btq> $$1) {
         super($$0, cmy.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cmy)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = ceh.a().a(this.l()).a(this.o);
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
               if (this.i.g((cmy)this.c)) {
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

   static class d extends cao {
      private final cju a;

      public d(cju $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gq() != null) {
            return false;
         } else {
            return !this.a.dP().ab().b(dbv.c) ? false : this.a.el().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         azh $$0 = this.a.el();
         dbz $$1 = this.a.dP();
         int $$2 = ayz.a(this.a.du() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayz.a(this.a.dw() + $$0.j() * 3.0);
         int $$4 = ayz.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         iz $$5 = new iz($$2, $$3, $$4);
         dsd $$6 = $$1.a_($$5);
         evs $$7 = new evs((double)this.a.dt() + 0.5, (double)$$3 + 0.5, (double)this.a.dz() + 0.5);
         evs $$8 = new evs((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         evo $$9 = $$1.a(new dbi($$7, $$8, dbi.a.b, dbi.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(awp.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dww.f, $$5, dww.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
