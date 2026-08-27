public class djs extends dkp implements dko {
   private static final int e = 1;
   private iu<cpq> f = iu.a(27, cpq.h);
   private final djy g = new djy() {
      @Override
      protected void a(cwe $$0, ib $$1, dme $$2) {
         djs.a($$0, $$1, $$2, atp.eI);
      }

      @Override
      protected void b(cwe $$0, ib $$1, dme $$2) {
         djs.a($$0, $$1, $$2, atp.eG);
      }

      @Override
      protected void a(cwe $$0, ib $$1, dme $$2, int $$3, int $$4) {
         djs.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cia $$0) {
         if (!($$0.bX instanceof clb)) {
            return false;
         } else {
            bme $$1 = ((clb)$$0.bX).l();
            return $$1 == djs.this || $$1 instanceof bmd && ((bmd)$$1).a(djs.this);
         }
      }
   };
   private final djt h = new djt();

   protected djs(djn<?> $$0, ib $$1, dme $$2) {
      super($$0, $$1, $$2);
   }

   public djs(ib $$0, dme $$1) {
      this(djn.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected vs k() {
      return vs.c("container.chest");
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.f = iu.a(this.b(), cpq.h);
      if (!this.c_($$0)) {
         bmf.b($$0, this.f);
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmf.a($$0, this.f);
      }
   }

   public static void a(cwe $$0, ib $$1, dme $$2, djs $$3) {
      $$3.h.a();
   }

   static void a(cwe $$0, ib $$1, dme $$2, ato $$3) {
      dmw $$4 = $$2.c(dai.d);
      if ($$4 != dmw.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dmw.c) {
            ih $$8 = dai.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, atq.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cia $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aD_(), this.n());
      }
   }

   @Override
   public void c(cia $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aD_(), this.n());
      }
   }

   @Override
   protected iu<cpq> j() {
      return this.f;
   }

   @Override
   protected void a(iu<cpq> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(cvk $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      if ($$2.t()) {
         djl $$3 = $$0.c_($$1);
         if ($$3 instanceof djs) {
            return ((djs)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(djs $$0, djs $$1) {
      iu<cpq> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cku a(int $$0, chz $$1) {
      return clb.a($$0, $$1, this);
   }

   public void l() {
      if (!this.q) {
         this.g.c(this.i(), this.aD_(), this.n());
      }
   }

   protected void a(cwe $$0, ib $$1, dme $$2, int $$3, int $$4) {
      czf $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
