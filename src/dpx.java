public class dpx extends dqw implements dqu {
   private static final int d = 1;
   private js<cud> e = js.a(27, cud.l);
   private final dqd f = new dqd() {
      @Override
      protected void a(dcg $$0, ja $$1, dsl $$2) {
         dpx.a($$0, $$1, $$2, avh.eQ);
      }

      @Override
      protected void b(dcg $$0, ja $$1, dsl $$2) {
         dpx.a($$0, $$1, $$2, avh.eO);
      }

      @Override
      protected void a(dcg $$0, ja $$1, dsl $$2, int $$3, int $$4) {
         dpx.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cml $$0) {
         if (!($$0.ce instanceof cpq)) {
            return false;
         } else {
            bqa $$1 = ((cpq)$$0.ce).l();
            return $$1 == dpx.this || $$1 instanceof bpz && ((bpz)$$1).a(dpx.this);
         }
      }
   };
   private final dpy g = new dpy();

   protected dpx(dps<?> $$0, ja $$1, dsl $$2) {
      super($$0, $$1, $$2);
   }

   public dpx(ja $$0, dsl $$1) {
      this(dps.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wu k() {
      return wu.c("container.chest");
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.e = js.a(this.b(), cud.l);
      if (!this.a_($$0)) {
         bqb.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqb.a($$0, this.e, $$1);
      }
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dpx $$3) {
      $$3.g.a();
   }

   static void a(dcg $$0, ja $$1, dsl $$2, avg $$3) {
      dtd $$4 = $$2.c(dgl.d);
      if ($$4 != dtd.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dtd.c) {
            jf $$8 = dgl.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cml $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cml $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected js<cud> j() {
      return this.e;
   }

   @Override
   protected void a(js<cud> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbm $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dpq $$3 = $$0.c_($$1);
         if ($$3 instanceof dpx) {
            return ((dpx)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpx $$0, dpx $$1) {
      js<cud> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpi a(int $$0, cmk $$1) {
      return cpq.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(dcg $$0, ja $$1, dsl $$2, int $$3, int $$4) {
      dfi $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
