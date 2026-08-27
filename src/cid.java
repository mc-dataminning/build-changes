import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cid extends cin implements bsg {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final btf d = new btf(c, "Attacking speed boost", 0.15F, btf.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final ajm<Optional<dqh>> bZ = ajq.a(cid.class, ajo.j);
   private static final ajm<Boolean> ca = ajq.a(cid.class, ajo.k);
   private static final ajm<Boolean> cb = ajq.a(cid.class, ajo.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final box ce = ayy.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cid(brn<? extends cid> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new byr(this));
      this.bS.a(1, new cid.a(this));
      this.bS.a(2, new bzh(this, 1.0, false));
      this.bS.a(7, new cak(this, 1.0, 0.0F));
      this.bS.a(8, new bzf(this, clh.class, 8.0F));
      this.bS.a(8, new bzs(this));
      this.bS.a(10, new cid.b(this));
      this.bS.a(11, new cid.d(this));
      this.bT.a(1, new cid.c(this, this::a_));
      this.bT.a(2, new cap(this));
      this.bT.a(3, new caq<>(this, cie.class, true, false));
      this.bT.a(4, new caw<>(this, false));
   }

   public static btg.a r() {
      return cin.gv().a(bth.q, 40.0).a(bth.r, 0.3F).a(bth.c, 7.0).a(bth.k, 64.0).a(bth.v, 1.0);
   }

   @Override
   public void h(@Nullable bsa $$0) {
      super.h($$0);
      btd $$1 = this.f(bth.r);
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
   protected void a(ajq.a $$0) {
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
         if (!this.aU()) {
            this.dN().a(this.ds(), this.dw(), this.dy(), avc.ii, this.dc(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajm<?> $$0) {
      if (ca.equals($$0) && this.gr() && this.dN().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      dqh $$1 = this.gp();
      if ($$1 != null) {
         $$0.a("carriedBlockState", up.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      dqh $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = up.a(this.dN().a(le.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dN(), $$0);
   }

   boolean g(clh $$0) {
      csz $$1 = $$0.ga().i.get(3);
      if ($$1.a(ddg.ee.q())) {
         return false;
      } else {
         etp $$2 = $$0.f(1.0F).d();
         etp $$3 = new etp(this.ds() - $$0.ds(), this.dw() - $$0.dw(), this.dy() - $$0.dy());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(kx.Z, this.d(0.5), this.dv() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bo = false;
      if (!this.dN().B) {
         this.a((aqh)this.dN(), true);
      }

      super.n_();
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   protected void Y() {
      if (this.dN().Q() && this.ai >= this.cd + 600) {
         float $$0 = this.br();
         if ($$0 > 0.5F && this.dN().h(this.dn()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.Y();
   }

   protected boolean y() {
      if (!this.dN().x_() && this.bB()) {
         double $$0 = this.ds() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.du() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dy() + (this.ah.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(brh $$0) {
      etp $$1 = new etp(this.ds() - $$0.ds(), this.e(0.5) - $$0.dw(), this.dy() - $$0.dy());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.ds() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.du() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dy() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      in.a $$3 = new in.a($$0, $$1, $$2);

      while ($$3.v() > this.dN().I_() && !this.dN().a_($$3).d()) {
         $$3.c(is.a);
      }

      dqh $$4 = this.dN().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(avw.a);
      if ($$5 && !$$6) {
         etp $$7 = this.dl();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dN().a(dva.R, $$7, dva.a.a(this));
            if (!this.aU()) {
               this.dN().a(null, this.L, this.M, this.N, avc.ij, this.dc(), 1.0F, 1.0F);
               this.a(avc.ij, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avb v() {
      return this.gq() ? avc.ih : avc.ie;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.ig;
   }

   @Override
   protected avb o_() {
      return avc.if;
   }

   @Override
   protected void a(bqf $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dqh $$3 = this.gp();
      if ($$3 != null) {
         csz $$4 = new csz(ctc.pi);
         $$4.a(cyj.v, 1);
         eoo.a $$5 = new eoo.a((aqh)this.dN()).a(erc.f, this.dl()).a(erc.i, $$4).b(erc.a, this);

         for (csz $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dqh $$0) {
      this.ao.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public dqh gp() {
      return this.ao.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cml;
         if (!$$0.a(avt.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dN().x_() && !($$0.d() instanceof bsa) && this.ah.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cml)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bqf $$0, cml $$1, float $$2) {
      csz $$3 = $$1.p();
      cuy $$4 = $$3.a(ka.E, cuy.a);
      return $$4.a(cuz.a) ? super.a($$0, $$2) : false;
   }

   public boolean gq() {
      return this.ao.a(ca);
   }

   public boolean gr() {
      return this.ao.a(cb);
   }

   public void gs() {
      this.ao.a(cb, true);
   }

   @Override
   public boolean V() {
      return super.V() || this.gp() != null;
   }

   static class a extends byx {
      private final cid a;
      @Nullable
      private bsa b;

      public a(cid $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.c, byx.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof clh)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((clh)this.b);
         }
      }

      @Override
      public void c() {
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.b.ds(), this.b.dw(), this.b.dy());
      }
   }

   static class b extends byx {
      private final cid a;

      public b(cid $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gp() == null) {
            return false;
         } else {
            return !this.a.dN().aa().b(czz.c) ? false : this.a.ej().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ayg $$0 = this.a.ej();
         dad $$1 = this.a.dN();
         int $$2 = axz.a(this.a.ds() - 1.0 + $$0.j() * 2.0);
         int $$3 = axz.a(this.a.du() + $$0.j() * 2.0);
         int $$4 = axz.a(this.a.dy() - 1.0 + $$0.j() * 2.0);
         in $$5 = new in($$2, $$3, $$4);
         dqh $$6 = $$1.a_($$5);
         in $$7 = $$5.d();
         dqh $$8 = $$1.a_($$7);
         dqh $$9 = this.a.gp();
         if ($$9 != null) {
            $$9 = dde.b($$9, this.a.dN(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dva.i, $$5, dva.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(dad $$0, in $$1, dqh $$2, dqh $$3, dqh $$4, in $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(ddg.F) && $$4.r($$0, $$5) && $$2.a((dag)$$0, $$1) && $$0.a_(this.a, etk.a(etp.a($$1))).isEmpty();
      }
   }

   static class c extends caq<clh> {
      private final cid i;
      @Nullable
      private clh j;
      private int k;
      private int l;
      private final ccq m;
      private final ccq n = ccq.a().d();
      private final Predicate<bsa> o;

      public c(cid $$0, @Nullable Predicate<bsa> $$1) {
         super($$0, clh.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((clh)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = ccq.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dN().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gs();
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
            if (this.c != null && !this.i.bP()) {
               if (this.i.g((clh)this.c)) {
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

   static class d extends byx {
      private final cid a;

      public d(cid $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gp() != null) {
            return false;
         } else {
            return !this.a.dN().aa().b(czz.c) ? false : this.a.ej().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ayg $$0 = this.a.ej();
         dad $$1 = this.a.dN();
         int $$2 = axz.a(this.a.ds() - 2.0 + $$0.j() * 4.0);
         int $$3 = axz.a(this.a.du() + $$0.j() * 3.0);
         int $$4 = axz.a(this.a.dy() - 2.0 + $$0.j() * 4.0);
         in $$5 = new in($$2, $$3, $$4);
         dqh $$6 = $$1.a_($$5);
         etp $$7 = new etp((double)this.a.dr() + 0.5, (double)$$3 + 0.5, (double)this.a.dx() + 0.5);
         etp $$8 = new etp((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         etl $$9 = $$1.a(new czm($$7, $$8, czm.a.b, czm.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(avr.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dva.f, $$5, dva.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
