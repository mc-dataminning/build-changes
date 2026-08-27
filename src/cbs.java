import javax.annotation.Nullable;

public class cbs extends cbe {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.33;
   private static final ctm cb = ctm.a(cqp.qY, cqp.qZ);
   private static final aim<Boolean> cc = aiq.a(cbs.class, aio.k);
   @Nullable
   private cbs.a<ciu> cd;
   @Nullable
   private cbs.b ce;

   public cbs(bpd<? extends cbs> $$0, cxb $$1) {
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
      this.ce = new cbs.b(this, 0.6, cb, true);
      this.bR.a(1, new bwg(this));
      this.bR.a(3, this.ce);
      this.bR.a(7, new bws(this, 0.3F));
      this.bR.a(8, new bxc(this));
      this.bR.a(9, new bvy(this, 0.8));
      this.bR.a(10, new bxz(this, 0.8, 1.0000001E-5F));
      this.bR.a(11, new bwu(this, ciu.class, 10.0F));
      this.bS.a(1, new byf<>(this, cbj.class, false));
      this.bS.a(1, new byf<>(this, ccf.class, 10, false, false, ccf.bY));
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bqa.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bqa.a);
            this.g(true);
         } else {
            this.b(bqa.a);
            this.g(false);
         }
      } else {
         this.b(bqa.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ah > 2400;
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 10.0).a(bqw.r, 0.3F).a(bqw.c, 3.0);
   }

   @Nullable
   @Override
   protected atx v() {
      return aty.rR;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.rQ;
   }

   @Override
   protected atx n_() {
      return aty.rS;
   }

   private float gn() {
      return (float)this.g(bqw.c);
   }

   @Override
   public boolean C(box $$0) {
      return $$0.a(this.dN().b((bpp)this), this.gn());
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
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

         return bnd.a(this.dM().B);
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
         this.cd = new cbs.a<>(this, ciu.class, 16.0F, 0.8, 1.33);
      }

      this.bR.a(this.cd);
      if (!this.y()) {
         this.bR.a(4, this.cd);
      }
   }

   @Nullable
   public cbs b(apf $$0, bos $$1) {
      return bpd.au.a((cxb)$$0);
   }

   @Override
   public boolean o(cqm $$0) {
      return cb.a($$0);
   }

   public static boolean c(bpd<cbs> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cxe $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         ib $$1 = this.dm();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dnb $$2 = $$0.a_($$1.d());
         if ($$2.a(dae.i) || $$2.a(aun.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      if ($$3 == null) {
         $$3 = new bos.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends bpp> extends bvt<T> {
      private final cbs i;

      public a(cbs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bpc.e::test);
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

   static class b extends bxu {
      private final cbs c;

      public b(cbs $$0, double $$1, ctm $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
