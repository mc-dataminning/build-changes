import javax.annotation.Nullable;

public class ccr extends ccd {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.33;
   private static final cvg cb = cvg.a(crm.qY, crm.qZ);
   private static final aiy<Boolean> cc = ajc.a(ccr.class, aja.k);
   @Nullable
   private ccr.a<cjt> cd;
   @Nullable
   private ccr.b ce;

   public ccr(bqb<? extends ccr> $$0, cyx $$1) {
      super($$0, $$1);
      this.u();
   }

   boolean y() {
      return this.an.a(cc);
   }

   private void w(boolean $$0) {
      this.an.a(cc, $$0);
      this.u();
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void z() {
      this.ce = new ccr.b(this, 0.6, cb, true);
      this.bR.a(1, new bxf(this));
      this.bR.a(3, this.ce);
      this.bR.a(7, new bxr(this, 0.3F));
      this.bR.a(8, new byb(this));
      this.bR.a(9, new bwx(this, 0.8));
      this.bR.a(10, new byy(this, 0.8, 1.0000001E-5F));
      this.bR.a(11, new bxt(this, cjt.class, 10.0F));
      this.bS.a(1, new bze<>(this, cci.class, false));
      this.bS.a(1, new bze<>(this, cde.class, 10, false, false, cde.bY));
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bqz.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bqz.a);
            this.g(true);
         } else {
            this.b(bqz.a);
            this.g(false);
         }
      } else {
         this.b(bqz.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ah > 2400;
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 10.0).a(brv.r, 0.3F).a(brv.c, 3.0);
   }

   @Nullable
   @Override
   protected aul v() {
      return aum.rU;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.rT;
   }

   @Override
   protected aul o_() {
      return aum.rV;
   }

   private float gn() {
      return (float)this.g(brv.c);
   }

   @Override
   public boolean C(bpv $$0) {
      return $$0.a(this.dN().b((bqo)this), this.gn());
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dM().B) {
            if (this.ag.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dM().a(this, (byte)41);
            } else {
               this.x(false);
               this.dM().a(this, (byte)40);
            }
         }

         return boa.a(this.dM().B);
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
      kj $$1 = kl.P;
      if (!$$0) {
         $$1 = kl.ac;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dM().a($$1, this.d(1.0), this.du() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void u() {
      if (this.cd == null) {
         this.cd = new ccr.a<>(this, cjt.class, 16.0F, 0.8, 1.33);
      }

      this.bR.a(this.cd);
      if (!this.y()) {
         this.bR.a(4, this.cd);
      }
   }

   @Nullable
   public ccr b(aps $$0, bpp $$1) {
      return bqb.at.a((cyx)$$0);
   }

   @Override
   public boolean o(crj $$0) {
      return cb.a($$0);
   }

   public static boolean c(bqb<ccr> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cza $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         ib $$1 = this.dm();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         doz $$2 = $$0.a_($$1.d());
         if ($$2.a(dca.i) || $$2.a(avc.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if ($$3 == null) {
         $$3 = new bpp.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends bqo> extends bws<T> {
      private final ccr i;

      public a(ccr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bqa.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.y() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.y() && super.b();
      }
   }

   static class b extends byt {
      private final ccr c;

      public b(ccr $$0, double $$1, cvg $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
