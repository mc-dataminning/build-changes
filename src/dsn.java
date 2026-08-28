public class dsn extends dtn implements dtl {
   private static final int d = 1;
   private jy<cvx> e = jy.a(27, cvx.k);
   private final dst f = new dst() {
      @Override
      protected void a(dev $$0, jg $$1, dvd $$2) {
         dsn.a($$0, $$1, $$2, awk.eR);
      }

      @Override
      protected void b(dev $$0, jg $$1, dvd $$2) {
         dsn.a($$0, $$1, $$2, awk.eP);
      }

      @Override
      protected void a(dev $$0, jg $$1, dvd $$2, int $$3, int $$4) {
         dsn.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(coh $$0) {
         if (!($$0.ca instanceof crs)) {
            return false;
         } else {
            brr $$1 = ((crs)$$0.ca).l();
            return $$1 == dsn.this || $$1 instanceof brq && ((brq)$$1).a(dsn.this);
         }
      }
   };
   private final dso g = new dso();

   protected dsn(dsi<?> $$0, jg $$1, dvd $$2) {
      super($$0, $$1, $$2);
   }

   public dsn(jg $$0, dvd $$1) {
      this(dsi.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xh j() {
      return xh.c("container.chest");
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.e = jy.a(this.b(), cvx.k);
      if (!this.b_($$0)) {
         brs.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brs.a($$0, this.e, $$1);
      }
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dsn $$3) {
      $$3.g.a();
   }

   static void a(dev $$0, jg $$1, dvd $$2, awj $$3) {
      dvv $$4 = $$2.c(djb.d);
      if ($$4 != dvv.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dvv.c) {
            jl $$8 = djb.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awl.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void d_(coh $$0) {
      if (!this.q && !$$0.R_()) {
         this.f.a($$0, this.i(), this.aC_(), this.m());
      }
   }

   @Override
   public void c(coh $$0) {
      if (!this.q && !$$0.R_()) {
         this.f.b($$0, this.i(), this.aC_(), this.m());
      }
   }

   @Override
   protected jy<cvx> f() {
      return this.e;
   }

   @Override
   protected void a(jy<cvx> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dea $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dsg $$3 = $$0.c_($$1);
         if ($$3 instanceof dsn) {
            return ((dsn)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dsn $$0, dsn $$1) {
      jy<cvx> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected crj a(int $$0, cog $$1) {
      return crs.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aC_(), this.m());
      }
   }

   protected void a(dev $$0, jg $$1, dvd $$2, int $$3, int $$4) {
      dhy $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
