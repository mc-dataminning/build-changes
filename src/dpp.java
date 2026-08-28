public class dpp extends dqn implements dql {
   private static final int d = 1;
   private jr<cuq> e = jr.a(27, cuq.l);
   private final dpv f = new dpv() {
      @Override
      protected void a(dbz $$0, iz $$1, dsd $$2) {
         dpp.a($$0, $$1, $$2, awa.eQ);
      }

      @Override
      protected void b(dbz $$0, iz $$1, dsd $$2) {
         dpp.a($$0, $$1, $$2, awa.eO);
      }

      @Override
      protected void a(dbz $$0, iz $$1, dsd $$2, int $$3, int $$4) {
         dpp.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmy $$0) {
         if (!($$0.cb instanceof cqc)) {
            return false;
         } else {
            bqo $$1 = ((cqc)$$0.cb).l();
            return $$1 == dpp.this || $$1 instanceof bqn && ((bqn)$$1).a(dpp.this);
         }
      }
   };
   private final dpq g = new dpq();

   protected dpp(dpk<?> $$0, iz $$1, dsd $$2) {
      super($$0, $$1, $$2);
   }

   public dpp(iz $$0, dsd $$1) {
      this(dpk.b, $$0, $$1);
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
      this.e = jr.a(this.b(), cuq.l);
      if (!this.a_($$0)) {
         bqp.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqp.a($$0, this.e, $$1);
      }
   }

   public static void a(dbz $$0, iz $$1, dsd $$2, dpp $$3) {
      $$3.g.a();
   }

   static void a(dbz $$0, iz $$1, dsd $$2, avz $$3) {
      dsv $$4 = $$2.c(dgd.d);
      if ($$4 != dsv.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dsv.c) {
            je $$8 = dgd.h($$2);
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
   public void d_(cmy $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public void c(cmy $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   protected jr<cuq> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cuq> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbf $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dpi $$3 = $$0.c_($$1);
         if ($$3 instanceof dpp) {
            return ((dpp)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpp $$0, dpp $$1) {
      jr<cuq> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpv a(int $$0, cmx $$1) {
      return cqc.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.ay_(), this.n());
      }
   }

   protected void a(dbz $$0, iz $$1, dsd $$2, int $$3, int $$4) {
      dfa $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
