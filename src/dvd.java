public class dvd extends dwe implements dwc {
   private static final int d = 1;
   private jz<cxo> e = jz.a(27, cxo.k);
   private final dvj f = new dvj() {
      @Override
      protected void a(dhh $$0, jh $$1, dxu $$2) {
         dvd.a($$0, $$1, $$2, axf.eS);
      }

      @Override
      protected void b(dhh $$0, jh $$1, dxu $$2) {
         dvd.a($$0, $$1, $$2, axf.eQ);
      }

      @Override
      protected void a(dhh $$0, jh $$1, dxu $$2, int $$3, int $$4) {
         dvd.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cpw $$0) {
         if (!($$0.cd instanceof ctk)) {
            return false;
         } else {
            btb $$1 = ((ctk)$$0.cd).l();
            return $$1 == dvd.this || $$1 instanceof bta && ((bta)$$1).a(dvd.this);
         }
      }
   };
   private final dve g = new dve();

   protected dvd(duy<?> $$0, jh $$1, dxu $$2) {
      super($$0, $$1, $$2);
   }

   public dvd(jh $$0, dxu $$1) {
      this(duy.b, $$0, $$1);
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
      this.e = jz.a(this.b(), cxo.k);
      if (!this.b_($$0)) {
         btc.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btc.a($$0, this.e, $$1);
      }
   }

   public static void a(dhh $$0, jh $$1, dxu $$2, dvd $$3) {
      $$3.g.a();
   }

   static void a(dhh $$0, jh $$1, dxu $$2, axe $$3) {
      dym $$4 = $$2.c(dlp.d);
      if ($$4 != dym.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dym.c) {
            jm $$8 = dlp.i($$2);
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
   public void c_(cpw $$0) {
      if (!this.q && !$$0.aa_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cpw $$0) {
      if (!this.q && !$$0.aa_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jz<cxo> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cxo> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dgm $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      if ($$2.x()) {
         duw $$3 = $$0.c_($$1);
         if ($$3 instanceof dvd) {
            return ((dvd)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dvd $$0, dvd $$1) {
      jz<cxo> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected ctb a(int $$0, cpv $$1) {
      return ctk.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(dhh $$0, jh $$1, dxu $$2, int $$3, int $$4) {
      dkl $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
