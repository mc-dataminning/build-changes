public class dxz extends dza implements dyy {
   private static final int d = 1;
   private jo<czn> e = jo.a(27, czn.k);
   private final dyf f = new dyf() {
      @Override
      protected void a(djm $$0, iv $$1, eat $$2) {
         dxz.a($$0, $$1, $$2, awn.eU);
      }

      @Override
      protected void b(djm $$0, iv $$1, eat $$2) {
         dxz.a($$0, $$1, $$2, awn.eS);
      }

      @Override
      protected void a(djm $$0, iv $$1, eat $$2, int $$3, int $$4) {
         dxz.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(crm $$0) {
         if (!($$0.bR instanceof cvo)) {
            return false;
         } else {
            btz $$1 = ((cvo)$$0.bR).l();
            return $$1 == dxz.this || $$1 instanceof bty && ((bty)$$1).a(dxz.this);
         }
      }
   };
   private final dya g = new dya();

   protected dxz(dxt<?> $$0, iv $$1, eat $$2) {
      super($$0, $$1, $$2);
   }

   public dxz(iv $$0, eat $$1) {
      this(dxt.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wy j() {
      return wy.c("container.chest");
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.e = jo.a(this.b(), czn.k);
      if (!this.b_($$0)) {
         bua.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bua.a($$0, this.e, $$1);
      }
   }

   public static void a(djm $$0, iv $$1, eat $$2, dxz $$3) {
      $$3.g.a();
   }

   static void a(djm $$0, iv $$1, eat $$2, awm $$3) {
      ebl $$4 = $$2.c(dnv.d);
      if ($$4 != ebl.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == ebl.c) {
            jb $$8 = dnv.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.g.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void c_(crm $$0) {
      if (!this.p && !$$0.V_()) {
         this.f.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public void c(crm $$0) {
      if (!this.p && !$$0.V_()) {
         this.f.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   protected jo<czn> f() {
      return this.e;
   }

   @Override
   protected void a(jo<czn> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(diq $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dxr $$3 = $$0.c_($$1);
         if ($$3 instanceof dxz) {
            return ((dxz)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dxz $$0, dxz $$1) {
      jo<czn> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cvf a(int $$0, crl $$1) {
      return cvo.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.ax_(), this.m());
      }
   }

   protected void a(djm $$0, iv $$1, eat $$2, int $$3, int $$4) {
      dmr $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
