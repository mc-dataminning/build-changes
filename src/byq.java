import javax.annotation.Nullable;

public class byq extends byc {
   public static final double bU = 0.6;
   public static final double bV = 0.8;
   public static final double bX = 1.33;
   private static final cqh bY = cqh.a(cnj.qY, cnj.qZ);
   private static final agn<Boolean> bZ = agq.a(byq.class, agp.k);
   @Nullable
   private byq.a<cfq> ca;
   @Nullable
   private byq.b cb;

   public byq(bmc<? extends byq> $$0, ctx $$1) {
      super($$0, $$1);
      this.w();
   }

   boolean A() {
      return this.an.b(bZ);
   }

   private void w(boolean $$0) {
      this.an.b(bZ, $$0);
      this.w();
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Trusting", this.A());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bZ, false);
   }

   @Override
   protected void B() {
      this.cb = new byq.b(this, 0.6, bY, true);
      this.bP.a(1, new bte(this));
      this.bP.a(3, this.cb);
      this.bP.a(7, new btq(this, 0.3F));
      this.bP.a(8, new bua(this));
      this.bP.a(9, new bsw(this, 0.8));
      this.bP.a(10, new bux(this, 0.8, 1.0000001E-5F));
      this.bP.a(11, new bts(this, cfq.class, 10.0F));
      this.bQ.a(1, new bvd<>(this, byh.class, false));
      this.bQ.a(1, new bvd<>(this, bzd.class, 10, false, false, bzd.bV));
   }

   @Override
   public void aa() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bna.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bna.a);
            this.g(true);
         } else {
            this.b(bna.a);
            this.g(false);
         }
      } else {
         this.b(bna.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.A() && this.ah > 2400;
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 10.0).a(bnu.o, 0.3F).a(bnu.c, 3.0);
   }

   @Nullable
   @Override
   protected ars y() {
      return art.rJ;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.rI;
   }

   @Override
   protected ars n_() {
      return art.rK;
   }

   private float gf() {
      return (float)this.g(bnu.c);
   }

   @Override
   public boolean B(blw $$0) {
      return $$0.a(this.dM().b((bmo)this), this.gf());
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ((this.cb == null || this.cb.i()) && !this.A() && this.m($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dL().B) {
            if (this.ag.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dL().a(this, (byte)41);
            } else {
               this.x(false);
               this.dL().a(this, (byte)40);
            }
         }

         return bkc.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      jv $$1 = jx.O;
      if (!$$0) {
         $$1 = jx.ab;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dL().a($$1, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void w() {
      if (this.ca == null) {
         this.ca = new byq.a<>(this, cfq.class, 16.0F, 0.8, 1.33);
      }

      this.bP.a(this.ca);
      if (!this.A()) {
         this.bP.a(4, this.ca);
      }
   }

   @Nullable
   public byq b(ane $$0, blr $$1) {
      return bmc.as.a((ctx)$$0);
   }

   @Override
   public boolean m(cng $$0) {
      return bY.a($$0);
   }

   public static boolean c(bmc<byq> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cua $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         hx $$1 = this.dl();
         if ($$1.v() < $$0.A_()) {
            return false;
         }

         djp $$2 = $$0.a_($$1.d());
         if ($$2.a(cxa.i) || $$2.a(asi.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if ($$3 == null) {
         $$3 = new blr.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends bmo> extends bsr<T> {
      private final byq i;

      public a(byq $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bmb.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.A() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.A() && super.b();
      }
   }

   static class b extends bus {
      private final byq c;

      public b(byq $$0, double $$1, cqh $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.A();
      }
   }
}
