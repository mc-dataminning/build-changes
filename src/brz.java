import javax.annotation.Nullable;

public class brz extends brl {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final ciz bX = ciz.a(cgc.ql, cgc.qm);
   private static final aby<Boolean> bY = acb.a(brz.class, aca.k);
   @Nullable
   private brz.a<byo> bZ;
   @Nullable
   private brz.b ca;

   public brz(bfn<? extends brz> $$0, cmm $$1) {
      super($$0, $$1);
      this.r();
   }

   boolean w() {
      return this.am.b(bY);
   }

   private void w(boolean $$0) {
      this.am.b(bY, $$0);
      this.r();
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Trusting", this.w());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bY, false);
   }

   @Override
   protected void x() {
      this.ca = new brz.b(this, 0.6, bX, true);
      this.bO.a(1, new bmp(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bnb(this, 0.3F));
      this.bO.a(8, new bnl(this));
      this.bO.a(9, new bmh(this, 0.8));
      this.bO.a(10, new boi(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bnd(this, byo.class, 10.0F));
      this.bP.a(1, new boo<>(this, brq.class, false));
      this.bP.a(1, new boo<>(this, bsm.class, 10, false, false, bsm.bU));
   }

   @Override
   public void W() {
      if (this.G().b()) {
         double $$0 = this.G().c();
         if ($$0 == 0.6) {
            this.b(bgl.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bgl.a);
            this.g(true);
         } else {
            this.b(bgl.a);
            this.g(false);
         }
      } else {
         this.b(bgl.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && this.ag > 2400;
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.a, 10.0).a(bhg.d, 0.3F).a(bhg.f, 3.0);
   }

   @Nullable
   @Override
   protected amg s() {
      return amh.qG;
   }

   @Override
   public int M() {
      return 900;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.qF;
   }

   @Override
   protected amg g_() {
      return amh.qH;
   }

   private float fY() {
      return (float)this.b(bhg.f);
   }

   @Override
   public boolean z(bfj $$0) {
      return $$0.a(this.dJ().b((bfz)this), this.fY());
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if ((this.ca == null || this.ca.i()) && !this.w() && this.m($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dI().B) {
            if (this.af.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dI().a(this, (byte)41);
            } else {
               this.x(false);
               this.dI().a(this, (byte)40);
            }
         }

         return bdx.a(this.dI().B);
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
      it $$1 = iv.M;
      if (!$$0) {
         $$1 = iv.Z;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dI().a($$1, this.d(1.0), this.dq() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void r() {
      if (this.bZ == null) {
         this.bZ = new brz.a<>(this, byo.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.w()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public brz b(aif $$0, bfe $$1) {
      return bfn.aq.a((cmm)$$0);
   }

   @Override
   public boolean m(cfz $$0) {
      return bX.a($$0);
   }

   public static boolean c(bfn<brz> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cmp $$0) {
      if ($$0.f(this) && !$$0.d(this.cE())) {
         gu $$1 = this.di();
         if ($$1.v() < $$0.t_()) {
            return false;
         }

         dcb $$2 = $$0.a_($$1.d());
         if ($$2.a(cpo.i) || $$2.a(amw.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      if ($$3 == null) {
         $$3 = new bfe.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eei cG() {
      return new eei(0.0, (double)(0.5F * this.cF()), (double)(this.dd() * 0.4F));
   }

   @Override
   public boolean bQ() {
      return this.bU() || super.bQ();
   }

   static class a<T extends bfz> extends bmc<T> {
      private final brz i;

      public a(brz $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bfm.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.w() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.w() && super.b();
      }
   }

   static class b extends bod {
      private final brz c;

      public b(brz $$0, double $$1, ciz $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.w();
      }
   }
}
