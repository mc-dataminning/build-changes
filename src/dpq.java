public class dpq extends dqo implements dqm {
   private static final int d = 1;
   private jr<cur> e = jr.a(27, cur.l);
   private final dpw f = new dpw() {
      @Override
      protected void a(dca $$0, iz $$1, dse $$2) {
         dpq.a($$0, $$1, $$2, awa.eQ);
      }

      @Override
      protected void b(dca $$0, iz $$1, dse $$2) {
         dpq.a($$0, $$1, $$2, awa.eO);
      }

      @Override
      protected void a(dca $$0, iz $$1, dse $$2, int $$3, int $$4) {
         dpq.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmz $$0) {
         if (!($$0.cb instanceof cqd)) {
            return false;
         } else {
            bqp $$1 = ((cqd)$$0.cb).l();
            return $$1 == dpq.this || $$1 instanceof bqo && ((bqo)$$1).a(dpq.this);
         }
      }
   };
   private final dpr g = new dpr();

   protected dpq(dpl<?> $$0, iz $$1, dse $$2) {
      super($$0, $$1, $$2);
   }

   public dpq(iz $$0, dse $$1) {
      this(dpl.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xp k() {
      return xp.c("container.chest");
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e = jr.a(this.b(), cur.l);
      if (!this.a_($$0)) {
         bqq.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqq.a($$0, this.e, $$1);
      }
   }

   public static void a(dca $$0, iz $$1, dse $$2, dpq $$3) {
      $$3.g.a();
   }

   static void a(dca $$0, iz $$1, dse $$2, avz $$3) {
      dsw $$4 = $$2.c(dge.d);
      if ($$4 != dsw.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dsw.c) {
            je $$8 = dge.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awb.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cmz $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public void c(cmz $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   protected jr<cur> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cur> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbg $$0, iz $$1) {
      dse $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dpj $$3 = $$0.c_($$1);
         if ($$3 instanceof dpq) {
            return ((dpq)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpq $$0, dpq $$1) {
      jr<cur> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpw a(int $$0, cmy $$1) {
      return cqd.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.ay_(), this.n());
      }
   }

   protected void a(dca $$0, iz $$1, dse $$2, int $$3, int $$4) {
      dfb $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
