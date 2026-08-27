import javax.annotation.Nullable;

public class cal extends bzx {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final csc bX = csc.a(cpg.qY, cpg.qZ);
   private static final aie<Boolean> bY = aih.a(cal.class, aig.k);
   @Nullable
   private cal.a<chl> bZ;
   @Nullable
   private cal.b ca;

   public cal(bnw<? extends cal> $$0, cvr $$1) {
      super($$0, $$1);
      this.w();
   }

   boolean A() {
      return this.am.b(bY);
   }

   private void w(boolean $$0) {
      this.am.b(bY, $$0);
      this.w();
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Trusting", this.A());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bY, false);
   }

   @Override
   protected void B() {
      this.ca = new cal.b(this, 0.6, bX, true);
      this.bO.a(1, new buz(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bvl(this, 0.3F));
      this.bO.a(8, new bvv(this));
      this.bO.a(9, new bur(this, 0.8));
      this.bO.a(10, new bws(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bvn(this, chl.class, 10.0F));
      this.bP.a(1, new bwy<>(this, cac.class, false));
      this.bP.a(1, new bwy<>(this, cay.class, 10, false, false, cay.bU));
   }

   @Override
   public void aa() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bot.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bot.a);
            this.g(true);
         } else {
            this.b(bot.a);
            this.g(false);
         }
      } else {
         this.b(bot.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.A() && this.ag > 2400;
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 10.0).a(bpp.o, 0.3F).a(bpp.c, 3.0);
   }

   @Nullable
   @Override
   protected atk y() {
      return atl.rK;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.rJ;
   }

   @Override
   protected atk n_() {
      return atl.rL;
   }

   private float gg() {
      return (float)this.g(bpp.c);
   }

   @Override
   public boolean B(bnq $$0) {
      return $$0.a(this.dN().b((boi)this), this.gg());
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ((this.ca == null || this.ca.i()) && !this.A() && this.m($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dM().B) {
            if (this.af.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dM().a(this, (byte)41);
            } else {
               this.x(false);
               this.dM().a(this, (byte)40);
            }
         }

         return blw.a(this.dM().B);
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
      jx $$1 = jz.O;
      if (!$$0) {
         $$1 = jz.ab;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dM().a($$1, this.d(1.0), this.du() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void w() {
      if (this.bZ == null) {
         this.bZ = new cal.a<>(this, chl.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.A()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public cal b(aow $$0, bnl $$1) {
      return bnw.as.a((cvr)$$0);
   }

   @Override
   public boolean m(cpd $$0) {
      return bX.a($$0);
   }

   public static boolean c(bnw<cal> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cvu $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         hz $$1 = this.dm();
         if ($$1.v() < $$0.A_()) {
            return false;
         }

         dlj $$2 = $$0.a_($$1.d());
         if ($$2.a(cyu.i) || $$2.a(aua.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      if ($$3 == null) {
         $$3 = new bnl.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends boi> extends bum<T> {
      private final cal i;

      public a(cal $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bnv.e::test);
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

   static class b extends bwn {
      private final cal c;

      public b(cal $$0, double $$1, csc $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.A();
      }
   }
}
