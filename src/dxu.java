public class dxu extends dyv implements dyt {
   private static final int d = 1;
   private jo<czk> e = jo.a(27, czk.k);
   private final dya f = new dya() {
      @Override
      protected void a(djh $$0, iv $$1, eao $$2) {
         dxu.a($$0, $$1, $$2, awn.eU);
      }

      @Override
      protected void b(djh $$0, iv $$1, eao $$2) {
         dxu.a($$0, $$1, $$2, awn.eS);
      }

      @Override
      protected void a(djh $$0, iv $$1, eao $$2, int $$3, int $$4) {
         dxu.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(crj $$0) {
         if (!($$0.bR instanceof cvl)) {
            return false;
         } else {
            btz $$1 = ((cvl)$$0.bR).l();
            return $$1 == dxu.this || $$1 instanceof bty && ((bty)$$1).a(dxu.this);
         }
      }
   };
   private final dxv g = new dxv();

   protected dxu(dxo<?> $$0, iv $$1, eao $$2) {
      super($$0, $$1, $$2);
   }

   public dxu(iv $$0, eao $$1) {
      this(dxo.b, $$0, $$1);
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
      this.e = jo.a(this.b(), czk.k);
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

   public static void a(djh $$0, iv $$1, eao $$2, dxu $$3) {
      $$3.g.a();
   }

   static void a(djh $$0, iv $$1, eao $$2, awm $$3) {
      ebg $$4 = $$2.c(dnq.d);
      if ($$4 != ebg.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == ebg.c) {
            jb $$8 = dnq.i($$2);
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
   public void c_(crj $$0) {
      if (!this.p && !$$0.V_()) {
         this.f.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public void c(crj $$0) {
      if (!this.p && !$$0.V_()) {
         this.f.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   protected jo<czk> f() {
      return this.e;
   }

   @Override
   protected void a(jo<czk> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(din $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dxm $$3 = $$0.c_($$1);
         if ($$3 instanceof dxu) {
            return ((dxu)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dxu $$0, dxu $$1) {
      jo<czk> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cvc a(int $$0, cri $$1) {
      return cvl.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.ax_(), this.m());
      }
   }

   protected void a(djh $$0, iv $$1, eao $$2, int $$3, int $$4) {
      dmm $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
