public class dxn extends dyo implements dym {
   private static final int d = 1;
   private jn<czd> e = jn.a(27, czd.k);
   private final dxt f = new dxt() {
      @Override
      protected void a(dja $$0, iu $$1, eah $$2) {
         dxn.a($$0, $$1, $$2, awn.eU);
      }

      @Override
      protected void b(dja $$0, iu $$1, eah $$2) {
         dxn.a($$0, $$1, $$2, awn.eS);
      }

      @Override
      protected void a(dja $$0, iu $$1, eah $$2, int $$3, int $$4) {
         dxn.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(crc $$0) {
         if (!($$0.bR instanceof cve)) {
            return false;
         } else {
            btw $$1 = ((cve)$$0.bR).l();
            return $$1 == dxn.this || $$1 instanceof btv && ((btv)$$1).a(dxn.this);
         }
      }
   };
   private final dxo g = new dxo();

   protected dxn(dxh<?> $$0, iu $$1, eah $$2) {
      super($$0, $$1, $$2);
   }

   public dxn(iu $$0, eah $$1) {
      this(dxh.b, $$0, $$1);
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
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.e = jn.a(this.b(), czd.k);
      if (!this.b_($$0)) {
         btx.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btx.a($$0, this.e, $$1);
      }
   }

   public static void a(dja $$0, iu $$1, eah $$2, dxn $$3) {
      $$3.g.a();
   }

   static void a(dja $$0, iu $$1, eah $$2, awm $$3) {
      eaz $$4 = $$2.c(dnj.d);
      if ($$4 != eaz.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == eaz.c) {
            ja $$8 = dnj.i($$2);
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
   public void c_(crc $$0) {
      if (!this.p && !$$0.V_()) {
         this.f.a($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   public void c(crc $$0) {
      if (!this.p && !$$0.V_()) {
         this.f.b($$0, this.i(), this.ax_(), this.m());
      }
   }

   @Override
   protected jn<czd> f() {
      return this.e;
   }

   @Override
   protected void a(jn<czd> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dig $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dxf $$3 = $$0.c_($$1);
         if ($$3 instanceof dxn) {
            return ((dxn)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dxn $$0, dxn $$1) {
      jn<czd> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cuv a(int $$0, crb $$1) {
      return cve.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.ax_(), this.m());
      }
   }

   protected void a(dja $$0, iu $$1, eah $$2, int $$3, int $$4) {
      dmf $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
