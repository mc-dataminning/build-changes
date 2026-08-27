public class ddc extends ddy implements ddx {
   private static final int c = 1;
   private hp<cjf> f = hp.a(27, cjf.b);
   private final ddi g = new ddi() {
      @Override
      protected void a(cpv $$0, gw $$1, dfj $$2) {
         ddc.a($$0, $$1, $$2, ape.ej);
      }

      @Override
      protected void b(cpv $$0, gw $$1, dfj $$2) {
         ddc.a($$0, $$1, $$2, ape.eh);
      }

      @Override
      protected void a(cpv $$0, gw $$1, dfj $$2, int $$3, int $$4) {
         ddc.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cbu $$0) {
         if (!($$0.bS instanceof ces)) {
            return false;
         } else {
            bgr $$1 = ((ces)$$0.bS).l();
            return $$1 == ddc.this || $$1 instanceof bgq && ((bgq)$$1).a(ddc.this);
         }
      }
   };
   private final ddd j = new ddd();

   protected ddc(dcx<?> $$0, gw $$1, dfj $$2) {
      super($$0, $$1, $$2);
   }

   public ddc(gw $$0, dfj $$1) {
      this(dcx.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected tm g() {
      return tm.c("container.chest");
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.f = hp.a(this.b(), cjf.b);
      if (!this.d($$0)) {
         bgs.b($$0, this.f);
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgs.a($$0, this.f);
      }
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, ddc $$3) {
      $$3.j.a();
   }

   static void a(cpv $$0, gw $$1, dfj $$2, apd $$3) {
      dgb $$4 = $$2.c(ctx.c);
      if ($$4 != dgb.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dgb.c) {
            hc $$8 = ctx.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, apf.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.j.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cbu $$0) {
      if (!this.q && !$$0.M_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbu $$0) {
      if (!this.q && !$$0.M_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected hp<cjf> f() {
      return this.f;
   }

   @Override
   protected void a(hp<cjf> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(cpb $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dcv $$3 = $$0.c_($$1);
         if ($$3 instanceof ddc) {
            return ((ddc)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(ddc $$0, ddc $$1) {
      hp<cjf> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cel a(int $$0, cbt $$1) {
      return ces.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cpv $$0, gw $$1, dfj $$2, int $$3, int $$4) {
      csv $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
