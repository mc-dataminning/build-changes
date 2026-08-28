public class duw extends dvx implements dvv {
   private static final int d = 1;
   private jz<cxk> e = jz.a(27, cxk.k);
   private final dvc f = new dvc() {
      @Override
      protected void a(dha $$0, jh $$1, dxn $$2) {
         duw.a($$0, $$1, $$2, axf.eR);
      }

      @Override
      protected void b(dha $$0, jh $$1, dxn $$2) {
         duw.a($$0, $$1, $$2, axf.eP);
      }

      @Override
      protected void a(dha $$0, jh $$1, dxn $$2, int $$3, int $$4) {
         duw.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cps $$0) {
         if (!($$0.cd instanceof ctg)) {
            return false;
         } else {
            bsx $$1 = ((ctg)$$0.cd).l();
            return $$1 == duw.this || $$1 instanceof bsw && ((bsw)$$1).a(duw.this);
         }
      }
   };
   private final dux g = new dux();

   protected duw(dur<?> $$0, jh $$1, dxn $$2) {
      super($$0, $$1, $$2);
   }

   public duw(jh $$0, dxn $$1) {
      this(dur.b, $$0, $$1);
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
      this.e = jz.a(this.b(), cxk.k);
      if (!this.b_($$0)) {
         bsy.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsy.a($$0, this.e, $$1);
      }
   }

   public static void a(dha $$0, jh $$1, dxn $$2, duw $$3) {
      $$3.g.a();
   }

   static void a(dha $$0, jh $$1, dxn $$2, axe $$3) {
      dyf $$4 = $$2.c(dli.d);
      if ($$4 != dyf.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dyf.c) {
            jm $$8 = dli.i($$2);
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
   public void c_(cps $$0) {
      if (!this.q && !$$0.aa_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cps $$0) {
      if (!this.q && !$$0.aa_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jz<cxk> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cxk> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dgf $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dup $$3 = $$0.c_($$1);
         if ($$3 instanceof duw) {
            return ((duw)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(duw $$0, duw $$1) {
      jz<cxk> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected csx a(int $$0, cpr $$1) {
      return ctg.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(dha $$0, jh $$1, dxn $$2, int $$3, int $$4) {
      dke $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
