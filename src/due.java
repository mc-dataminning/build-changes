public class due extends dvf implements dvd {
   private static final int d = 1;
   private ka<cwn> e = ka.a(27, cwn.j);
   private final duk f = new duk() {
      @Override
      protected void a(dgg $$0, ji $$1, dwv $$2) {
         due.a($$0, $$1, $$2, avz.eS);
      }

      @Override
      protected void b(dgg $$0, ji $$1, dwv $$2) {
         due.a($$0, $$1, $$2, avz.eQ);
      }

      @Override
      protected void a(dgg $$0, ji $$1, dwv $$2, int $$3, int $$4) {
         due.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cov $$0) {
         if (!($$0.cd instanceof csj)) {
            return false;
         } else {
            bsb $$1 = ((csj)$$0.cd).l();
            return $$1 == due.this || $$1 instanceof bsa && ((bsa)$$1).a(due.this);
         }
      }
   };
   private final duf g = new duf();

   protected due(dtz<?> $$0, ji $$1, dwv $$2) {
      super($$0, $$1, $$2);
   }

   public due(ji $$0, dwv $$1) {
      this(dtz.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wo j() {
      return wo.c("container.chest");
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.e = ka.a(this.b(), cwn.j);
      if (!this.b_($$0)) {
         bsc.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsc.a($$0, this.e, $$1);
      }
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, due $$3) {
      $$3.g.a();
   }

   static void a(dgg $$0, ji $$1, dwv $$2, avy $$3) {
      dxn $$4 = $$2.c(dkn.d);
      if ($$4 != dxn.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dxn.c) {
            jn $$8 = dkn.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awa.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void c_(cov $$0) {
      if (!this.q && !$$0.Z_()) {
         this.f.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cov $$0) {
      if (!this.q && !$$0.Z_()) {
         this.f.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   protected ka<cwn> f() {
      return this.e;
   }

   @Override
   protected void a(ka<cwn> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dfl $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dtx $$3 = $$0.c_($$1);
         if ($$3 instanceof due) {
            return ((due)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(due $$0, due $$1) {
      ka<cwn> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected csa a(int $$0, cou $$1) {
      return csj.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aA_(), this.m());
      }
   }

   protected void a(dgg $$0, ji $$1, dwv $$2, int $$3, int $$4) {
      djk $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
