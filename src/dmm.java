public class dmm extends dnk implements dni {
   private static final int e = 1;
   private iu<crj> f = iu.a(27, crj.i);
   private final dms g = new dms() {
      @Override
      protected void a(cyx $$0, ib $$1, doz $$2) {
         dmm.a($$0, $$1, $$2, aum.eQ);
      }

      @Override
      protected void b(cyx $$0, ib $$1, doz $$2) {
         dmm.a($$0, $$1, $$2, aum.eO);
      }

      @Override
      protected void a(cyx $$0, ib $$1, doz $$2, int $$3, int $$4) {
         dmm.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cjt $$0) {
         if (!($$0.bY instanceof cmw)) {
            return false;
         } else {
            bnt $$1 = ((cmw)$$0.bY).l();
            return $$1 == dmm.this || $$1 instanceof bns && ((bns)$$1).a(dmm.this);
         }
      }
   };
   private final dmn h = new dmn();

   protected dmm(dmh<?> $$0, ib $$1, doz $$2) {
      super($$0, $$1, $$2);
   }

   public dmm(ib $$0, doz $$1) {
      this(dmh.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wg k() {
      return wg.c("container.chest");
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.f = iu.a(this.b(), crj.i);
      if (!this.a_($$0)) {
         bnu.b($$0, this.f, $$1);
      }
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnu.a($$0, this.f, $$1);
      }
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dmm $$3) {
      $$3.h.a();
   }

   static void a(cyx $$0, ib $$1, doz $$2, aul $$3) {
      dpr $$4 = $$2.c(ddb.d);
      if ($$4 != dpr.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dpr.c) {
            ih $$8 = ddb.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aun.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.h.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cjt $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public void c(cjt $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   protected iu<crj> j() {
      return this.f;
   }

   @Override
   protected void a(iu<crj> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cyd $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dmf $$3 = $$0.c_($$1);
         if ($$3 instanceof dmm) {
            return ((dmm)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dmm $$0, dmm $$1) {
      iu<crj> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cmp a(int $$0, cjs $$1) {
      return cmw.a($$0, $$1, this);
   }

   public void l() {
      if (!this.q) {
         this.g.c(this.i(), this.aA_(), this.n());
      }
   }

   protected void a(cyx $$0, ib $$1, doz $$2, int $$3, int $$4) {
      dby $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
