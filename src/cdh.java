import javax.annotation.Nullable;

public class cdh extends cct {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.33;
   private static final cwd cc = cwd.a(csg.qZ, csg.ra);
   private static final ajk<Boolean> cd = ajo.a(cdh.class, ajm.k);
   @Nullable
   private cdh.a<ckl> ce;
   @Nullable
   private cdh.b cf;

   public cdh(bqr<? extends cdh> $$0, czu $$1) {
      super($$0, $$1);
      this.u();
   }

   boolean y() {
      return this.ao.a(cd);
   }

   private void w(boolean $$0) {
      this.ao.a(cd, $$0);
      this.u();
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
   }

   @Override
   protected void z() {
      this.cf = new cdh.b(this, 0.6, cc, true);
      this.bS.a(1, new bxv(this));
      this.bS.a(3, this.cf);
      this.bS.a(7, new byh(this, 0.3F));
      this.bS.a(8, new byr(this));
      this.bS.a(9, new bxn(this, 0.8));
      this.bS.a(10, new bzo(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new byj(this, ckl.class, 10.0F));
      this.bT.a(1, new bzu<>(this, ccy.class, false));
      this.bT.a(1, new bzu<>(this, cdu.class, 10, false, false, cdu.bZ));
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(brp.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(brp.a);
            this.h(true);
         } else {
            this.b(brp.a);
            this.h(false);
         }
      } else {
         this.b(brp.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 10.0).a(bsl.r, 0.3F).a(bsl.c, 3.0);
   }

   @Nullable
   @Override
   protected auy v() {
      return auz.sb;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.sa;
   }

   @Override
   protected auy o_() {
      return auz.sc;
   }

   private float gp() {
      return (float)this.g(bsl.c);
   }

   @Override
   public boolean C(bql $$0) {
      return $$0.a(this.dO().b((bre)this), this.gp());
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ((this.cf == null || this.cf.i()) && !this.y() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dN().B) {
            if (this.ah.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dN().a(this, (byte)41);
            } else {
               this.x(false);
               this.dN().a(this, (byte)40);
            }
         }

         return boq.a(this.dN().B);
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
      ku $$1 = kw.O;
      if (!$$0) {
         $$1 = kw.ab;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dN().a($$1, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void u() {
      if (this.ce == null) {
         this.ce = new cdh.a<>(this, ckl.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ce);
      if (!this.y()) {
         this.bS.a(4, this.ce);
      }
   }

   @Nullable
   public cdh b(aqe $$0, bqf $$1) {
      return bqr.at.a((czu)$$0);
   }

   @Override
   public boolean o(csd $$0) {
      return cc.a($$0);
   }

   public static boolean c(bqr<cdh> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(czx $$0) {
      if ($$0.f(this) && !$$0.d(this.cI())) {
         im $$1 = this.dn();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dpy $$2 = $$0.a_($$1.d());
         if ($$2.a(dcx.i) || $$2.a(avo.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      if ($$3 == null) {
         $$3 = new bqf.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.5F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   @Override
   public boolean bU() {
      return this.bY() || super.bU();
   }

   static class a<T extends bre> extends bxi<T> {
      private final cdh i;

      public a(cdh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bqq.e::test);
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

   static class b extends bzj {
      private final cdh c;

      public b(cdh $$0, double $$1, cwd $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
