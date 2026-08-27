import javax.annotation.Nullable;

public class cbr extends cbd {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.33;
   private static final ctk cb = ctk.a(cqn.qY, cqn.qZ);
   private static final aim<Boolean> cc = aiq.a(cbr.class, aio.k);
   @Nullable
   private cbr.a<cis> cd;
   @Nullable
   private cbr.b ce;

   public cbr(bpc<? extends cbr> $$0, cwz $$1) {
      super($$0, $$1);
      this.s();
   }

   boolean y() {
      return this.an.a(cc);
   }

   private void w(boolean $$0) {
      this.an.a(cc, $$0);
      this.s();
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void z() {
      this.ce = new cbr.b(this, 0.6, cb, true);
      this.bR.a(1, new bwf(this));
      this.bR.a(3, this.ce);
      this.bR.a(7, new bwr(this, 0.3F));
      this.bR.a(8, new bxb(this));
      this.bR.a(9, new bvx(this, 0.8));
      this.bR.a(10, new bxy(this, 0.8, 1.0000001E-5F));
      this.bR.a(11, new bwt(this, cis.class, 10.0F));
      this.bS.a(1, new bye<>(this, cbi.class, false));
      this.bS.a(1, new bye<>(this, cce.class, 10, false, false, cce.bY));
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bpz.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bpz.a);
            this.g(true);
         } else {
            this.b(bpz.a);
            this.g(false);
         }
      } else {
         this.b(bpz.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ah > 2400;
   }

   public static bqu.a r() {
      return bpq.A().a(bqv.q, 10.0).a(bqv.r, 0.3F).a(bqv.c, 3.0);
   }

   @Nullable
   @Override
   protected atx v() {
      return aty.rN;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.rM;
   }

   @Override
   protected atx n_() {
      return aty.rO;
   }

   private float gn() {
      return (float)this.g(bqv.c);
   }

   @Override
   public boolean C(bow $$0) {
      return $$0.a(this.dN().b((bpo)this), this.gn());
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
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

         return bnc.a(this.dM().B);
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
      ka $$1 = kc.P;
      if (!$$0) {
         $$1 = kc.ac;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dM().a($$1, this.d(1.0), this.du() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void s() {
      if (this.cd == null) {
         this.cd = new cbr.a<>(this, cis.class, 16.0F, 0.8, 1.33);
      }

      this.bR.a(this.cd);
      if (!this.y()) {
         this.bR.a(4, this.cd);
      }
   }

   @Nullable
   public cbr b(apf $$0, bor $$1) {
      return bpc.at.a((cwz)$$0);
   }

   @Override
   public boolean o(cqk $$0) {
      return cb.a($$0);
   }

   public static boolean c(bpc<cbr> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cxc $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         ib $$1 = this.dm();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dmz $$2 = $$0.a_($$1.d());
         if ($$2.a(dac.i) || $$2.a(aun.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      if ($$3 == null) {
         $$3 = new bor.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public epr cJ() {
      return new epr(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends bpo> extends bvs<T> {
      private final cbr i;

      public a(cbr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bpb.e::test);
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

   static class b extends bxt {
      private final cbr c;

      public b(cbr $$0, double $$1, ctk $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
