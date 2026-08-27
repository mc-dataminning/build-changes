import javax.annotation.Nullable;

public class ccw extends cci {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.33;
   private static final cvp cb = cvp.a(crv.qY, crv.qZ);
   private static final aja<Boolean> cc = aje.a(ccw.class, ajc.k);
   @Nullable
   private ccw.a<cka> cd;
   @Nullable
   private ccw.b ce;

   public ccw(bqg<? extends ccw> $$0, czg $$1) {
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
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void z() {
      this.ce = new ccw.b(this, 0.6, cb, true);
      this.bR.a(1, new bxk(this));
      this.bR.a(3, this.ce);
      this.bR.a(7, new bxw(this, 0.3F));
      this.bR.a(8, new byg(this));
      this.bR.a(9, new bxc(this, 0.8));
      this.bR.a(10, new bzd(this, 0.8, 1.0000001E-5F));
      this.bR.a(11, new bxy(this, cka.class, 10.0F));
      this.bS.a(1, new bzj<>(this, ccn.class, false));
      this.bS.a(1, new bzj<>(this, cdj.class, 10, false, false, cdj.bY));
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bre.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bre.a);
            this.g(true);
         } else {
            this.b(bre.a);
            this.g(false);
         }
      } else {
         this.b(bre.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ah > 2400;
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 10.0).a(bsa.r, 0.3F).a(bsa.c, 3.0);
   }

   @Nullable
   @Override
   protected aun v() {
      return auo.rU;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.rT;
   }

   @Override
   protected aun o_() {
      return auo.rV;
   }

   private float gn() {
      return (float)this.g(bsa.c);
   }

   @Override
   public boolean C(bqa $$0) {
      return $$0.a(this.dN().b((bqt)this), this.gn());
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
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

         return bof.a(this.dM().B);
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
      kl $$1 = kn.P;
      if (!$$0) {
         $$1 = kn.ac;
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
         this.cd = new ccw.a<>(this, cka.class, 16.0F, 0.8, 1.33);
      }

      this.bR.a(this.cd);
      if (!this.y()) {
         this.bR.a(4, this.cd);
      }
   }

   @Nullable
   public ccw b(apu $$0, bpu $$1) {
      return bqg.at.a((czg)$$0);
   }

   @Override
   public boolean o(crs $$0) {
      return cb.a($$0);
   }

   public static boolean c(bqg<ccw> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(czj $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         id $$1 = this.dm();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dpi $$2 = $$0.a_($$1.d());
         if ($$2.a(dcj.i) || $$2.a(ave.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if ($$3 == null) {
         $$3 = new bpu.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends bqt> extends bwx<T> {
      private final ccw i;

      public a(ccw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bqf.e::test);
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

   static class b extends byy {
      private final ccw c;

      public b(ccw $$0, double $$1, cvp $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
