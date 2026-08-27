public class dkp extends dlm implements dll {
   private static final int e = 1;
   private iu<cqm> f = iu.a(27, cqm.h);
   private final dkv g = new dkv() {
      @Override
      protected void a(cxb $$0, ib $$1, dnb $$2) {
         dkp.a($$0, $$1, $$2, aty.eP);
      }

      @Override
      protected void b(cxb $$0, ib $$1, dnb $$2) {
         dkp.a($$0, $$1, $$2, aty.eN);
      }

      @Override
      protected void a(cxb $$0, ib $$1, dnb $$2, int $$3, int $$4) {
         dkp.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(ciu $$0) {
         if (!($$0.bZ instanceof clx)) {
            return false;
         } else {
            bmw $$1 = ((clx)$$0.bZ).l();
            return $$1 == dkp.this || $$1 instanceof bmv && ((bmv)$$1).a(dkp.this);
         }
      }
   };
   private final dkq h = new dkq();

   protected dkp(dkk<?> $$0, ib $$1, dnb $$2) {
      super($$0, $$1, $$2);
   }

   public dkp(ib $$0, dnb $$1) {
      this(dkk.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vu k() {
      return vu.c("container.chest");
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.f = iu.a(this.b(), cqm.h);
      if (!this.c_($$0)) {
         bmx.b($$0, this.f);
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmx.a($$0, this.f);
      }
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dkp $$3) {
      $$3.h.a();
   }

   static void a(cxb $$0, ib $$1, dnb $$2, atx $$3) {
      dnt $$4 = $$2.c(dbf.d);
      if ($$4 != dnt.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dnt.c) {
            ih $$8 = dbf.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, atz.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(ciu $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.a($$0, this.i(), this.aC_(), this.n());
      }
   }

   @Override
   public void c(ciu $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.b($$0, this.i(), this.aC_(), this.n());
      }
   }

   @Override
   protected iu<cqm> j() {
      return this.f;
   }

   @Override
   protected void a(iu<cqm> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cwh $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dki $$3 = $$0.c_($$1);
         if ($$3 instanceof dkp) {
            return ((dkp)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dkp $$0, dkp $$1) {
      iu<cqm> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected clq a(int $$0, cit $$1) {
      return clx.a($$0, $$1, this);
   }

   public void l() {
      if (!this.q) {
         this.g.c(this.i(), this.aC_(), this.n());
      }
   }

   protected void a(cxb $$0, ib $$1, dnb $$2, int $$3, int $$4) {
      dac $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
