import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjh extends cjr implements bti {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bui d = new bui(c, "Attacking speed boost", 0.15F, bui.a.a);
   private static final int e = 400;
   private static final int ca = 600;
   private static final ajp<Optional<dsl>> cb = ajt.a(cjh.class, ajr.j);
   private static final ajp<Boolean> cc = ajt.a(cjh.class, ajr.k);
   private static final ajp<Boolean> cd = ajt.a(cjh.class, ajr.k);
   private int ce = Integer.MIN_VALUE;
   private int cf;
   private static final bps cg = azh.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cjh(bsn<? extends cjh> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cjh.a(this));
      this.bU.a(2, new cak(this, 1.0, false));
      this.bU.a(7, new cbn(this, 1.0, 0.0F));
      this.bU.a(8, new cai(this, cml.class, 8.0F));
      this.bU.a(8, new cav(this));
      this.bU.a(10, new cjh.b(this));
      this.bU.a(11, new cjh.d(this));
      this.bV.a(1, new cjh.c(this, this::a_));
      this.bV.a(2, new cbs(this));
      this.bV.a(3, new cbt<>(this, cji.class, true, false));
      this.bV.a(4, new cbz<>(this, false));
   }

   public static buj.a s() {
      return cjr.gt().a(buk.s, 40.0).a(buk.v, 0.3F).a(buk.c, 7.0).a(buk.m, 64.0).a(buk.B, 1.0);
   }

   @Override
   public void h(@Nullable btc $$0) {
      super.h($$0);
      bug $$1 = this.f(buk.v);
      if ($$0 == null) {
         this.cf = 0;
         this.ao.a(cc, false);
         this.ao.a(cd, false);
         $$1.b(d.b());
      } else {
         this.cf = this.ai;
         this.ao.a(cc, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, Optional.empty());
      $$0.a(cc, false);
      $$0.a(cd, false);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   public void t() {
      if (this.ai >= this.ce + 400) {
         this.ce = this.ai;
         if (!this.aY()) {
            this.dR().a(this.dw(), this.dA(), this.dC(), avh.in, this.dg(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cc.equals($$0) && this.gp() && this.dR().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      dsl $$1 = this.gn();
      if ($$1 != null) {
         $$0.a("carriedBlockState", um.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      dsl $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = um.a(this.dR().a(lr.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dR(), $$0);
   }

   boolean g(cml $$0) {
      cud $$1 = $$0.ga().i.get(3);
      if ($$1.a(dfk.ee.r())) {
         return false;
      } else {
         ewh $$2 = $$0.g(1.0F).d();
         ewh $$3 = new ewh(this.dw() - $$0.dw(), this.dA() - $$0.dA(), this.dC() - $$0.dC());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.F(this) : false;
      }
   }

   @Override
   public void m_() {
      if (this.dR().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dR().a(lj.ac, this.d(0.5), this.dz() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bo = false;
      if (!this.dR().B) {
         this.a((aqm)this.dR(), true);
      }

      super.m_();
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dR().R() && this.ai >= this.cf + 600) {
         float $$0 = this.bv();
         if ($$0 > 0.5F && this.dR().h(this.dr()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.x();
         }
      }

      super.Z();
   }

   protected boolean x() {
      if (!this.dR().x_() && this.bF()) {
         double $$0 = this.dw() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.dy() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dC() + (this.ah.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bsh $$0) {
      ewh $$1 = new ewh(this.dw() - $$0.dw(), this.e(0.5) - $$0.dA(), this.dC() - $$0.dC());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dw() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dy() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dC() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      ja.a $$3 = new ja.a($$0, $$1, $$2);

      while ($$3.v() > this.dR().I_() && !this.dR().a_($$3).d()) {
         $$3.c(jf.a);
      }

      dsl $$4 = this.dR().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awc.a);
      if ($$5 && !$$6) {
         ewh $$7 = this.dp();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dR().a(dxh.R, $$7, dxh.a.a(this));
            if (!this.aY()) {
               this.dR().a(null, this.L, this.M, this.N, avh.io, this.dg(), 1.0F, 1.0F);
               this.a(avh.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avg v() {
      return this.go() ? avh.im : avh.ij;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.il;
   }

   @Override
   protected avg n_() {
      return avh.ik;
   }

   @Override
   protected void a(aqm $$0, bra $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dsl $$3 = this.gn();
      if ($$3 != null) {
         cud $$4 = new cud(cug.pj);
         czo.a($$4, $$0.H_(), daz.g, $$0.d_(this.dr()), this.dU());
         eqz.a $$5 = new eqz.a((aqm)this.dR()).a(ets.f, this.dp()).a(ets.i, $$4).b(ets.a, this);

         for (cud $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable dsl $$0) {
      this.ao.a(cb, Optional.ofNullable($$0));
   }

   @Nullable
   public dsl gn() {
      return this.ao.a(cb).orElse(null);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cnp;
         if (!$$0.a(avy.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dR().x_() && !($$0.d() instanceof btc) && this.ah.a(10) != 0) {
               this.x();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cnp)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.x()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bra $$0, cnp $$1, float $$2) {
      cud $$3 = $$1.p();
      cwe $$4 = $$3.a(kn.G, cwe.a);
      return $$4.a(cwf.a) ? super.a($$0, $$2) : false;
   }

   public boolean go() {
      return this.ao.a(cc);
   }

   public boolean gp() {
      return this.ao.a(cd);
   }

   public void gq() {
      this.ao.a(cd, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.gn() != null;
   }

   static class a extends caa {
      private final cjh a;
      @Nullable
      private btc b;

      public a(cjh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.c, caa.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cml)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cml)this.b);
         }
      }

      @Override
      public void c() {
         this.a.J().n();
      }

      @Override
      public void e() {
         this.a.F().a(this.b.dw(), this.b.dA(), this.b.dC());
      }
   }

   static class b extends caa {
      private final cjh a;

      public b(cjh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() == null) {
            return false;
         } else {
            return !this.a.dR().ab().b(dcc.c) ? false : this.a.dU().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ayo $$0 = this.a.dU();
         dcg $$1 = this.a.dR();
         int $$2 = ayg.a(this.a.dw() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayg.a(this.a.dy() + $$0.j() * 2.0);
         int $$4 = ayg.a(this.a.dC() - 1.0 + $$0.j() * 2.0);
         ja $$5 = new ja($$2, $$3, $$4);
         dsl $$6 = $$1.a_($$5);
         ja $$7 = $$5.d();
         dsl $$8 = $$1.a_($$7);
         dsl $$9 = this.a.gn();
         if ($$9 != null) {
            $$9 = dfi.b($$9, this.a.dR(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dxh.i, $$5, dxh.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dcg $$0, ja $$1, dsl $$2, dsl $$3, dsl $$4, ja $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dfk.F) && $$4.r($$0, $$5) && $$2.a((dcj)$$0, $$1) && $$0.a_(this.a, ewc.a(ewh.a($$1))).isEmpty();
      }
   }

   static class c extends cbt<cml> {
      private final cjh i;
      @Nullable
      private cml j;
      private int k;
      private int l;
      private final cdt m;
      private final cdt n = cdt.a().d();
      private final Predicate<btc> o;

      public c(cjh $$0, @Nullable Predicate<btc> $$1) {
         super($$0, cml.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cml)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cdt.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dR().a(this.m, this.i);
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
            if (this.c != null && !this.i.bT()) {
               if (this.i.g((cml)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.x();
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

   static class d extends caa {
      private final cjh a;

      public d(cjh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gn() != null) {
            return false;
         } else {
            return !this.a.dR().ab().b(dcc.c) ? false : this.a.dU().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ayo $$0 = this.a.dU();
         dcg $$1 = this.a.dR();
         int $$2 = ayg.a(this.a.dw() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayg.a(this.a.dy() + $$0.j() * 3.0);
         int $$4 = ayg.a(this.a.dC() - 2.0 + $$0.j() * 4.0);
         ja $$5 = new ja($$2, $$3, $$4);
         dsl $$6 = $$1.a_($$5);
         ewh $$7 = new ewh((double)this.a.dv() + 0.5, (double)$$3 + 0.5, (double)this.a.dB() + 0.5);
         ewh $$8 = new ewh((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ewd $$9 = $$1.a(new dbp($$7, $$8, dbp.a.b, dbp.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(avw.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dxh.f, $$5, dxh.a.a(this.a, $$6));
            this.a.c($$6.b().o());
         }
      }
   }
}
