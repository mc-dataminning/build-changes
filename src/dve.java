public class dve extends dwf implements dwd {
   private static final int d = 1;
   private jz<cxp> e = jz.a(27, cxp.j);
   private final dvk f = new dvk() {
      @Override
      protected void a(dhi $$0, jh $$1, dxv $$2) {
         dve.a($$0, $$1, $$2, axf.eS);
      }

      @Override
      protected void b(dhi $$0, jh $$1, dxv $$2) {
         dve.a($$0, $$1, $$2, axf.eQ);
      }

      @Override
      protected void a(dhi $$0, jh $$1, dxv $$2, int $$3, int $$4) {
         dve.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cpx $$0) {
         if (!($$0.cd instanceof ctl)) {
            return false;
         } else {
            btc $$1 = ((ctl)$$0.cd).l();
            return $$1 == dve.this || $$1 instanceof btb && ((btb)$$1).a(dve.this);
         }
      }
   };
   private final dvf g = new dvf();

   protected dve(duz<?> $$0, jh $$1, dxv $$2) {
      super($$0, $$1, $$2);
   }

   public dve(jh $$0, dxv $$1) {
      this(duz.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xv j() {
      return xv.c("container.chest");
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cxp.j);
      if (!this.b_($$0)) {
         btd.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btd.a($$0, this.e, $$1);
      }
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, dve $$3) {
      $$3.g.a();
   }

   static void a(dhi $$0, jh $$1, dxv $$2, axe $$3) {
      dyn $$4 = $$2.c(dlq.d);
      if ($$4 != dyn.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dyn.c) {
            jm $$8 = dlq.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, axg.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void c_(cpx $$0) {
      if (!this.q && !$$0.aa_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cpx $$0) {
      if (!this.q && !$$0.aa_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jz<cxp> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cxp> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dgn $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dux $$3 = $$0.c_($$1);
         if ($$3 instanceof dve) {
            return ((dve)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dve $$0, dve $$1) {
      jz<cxp> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected ctc a(int $$0, cpw $$1) {
      return ctl.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(dhi $$0, jh $$1, dxv $$2, int $$3, int $$4) {
      dkm $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
