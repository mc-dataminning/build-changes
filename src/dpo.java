public class dpo extends dqm implements dqk {
   private static final int d = 1;
   private jr<cup> e = jr.a(27, cup.l);
   private final dpu f = new dpu() {
      @Override
      protected void a(dby $$0, iz $$1, dsc $$2) {
         dpo.a($$0, $$1, $$2, awa.eQ);
      }

      @Override
      protected void b(dby $$0, iz $$1, dsc $$2) {
         dpo.a($$0, $$1, $$2, awa.eO);
      }

      @Override
      protected void a(dby $$0, iz $$1, dsc $$2, int $$3, int $$4) {
         dpo.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmx $$0) {
         if (!($$0.cb instanceof cqb)) {
            return false;
         } else {
            bqn $$1 = ((cqb)$$0.cb).l();
            return $$1 == dpo.this || $$1 instanceof bqm && ((bqm)$$1).a(dpo.this);
         }
      }
   };
   private final dpp g = new dpp();

   protected dpo(dpj<?> $$0, iz $$1, dsc $$2) {
      super($$0, $$1, $$2);
   }

   public dpo(iz $$0, dsc $$1) {
      this(dpj.b, $$0, $$1);
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
      this.e = jr.a(this.b(), cup.l);
      if (!this.a_($$0)) {
         bqo.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqo.a($$0, this.e, $$1);
      }
   }

   public static void a(dby $$0, iz $$1, dsc $$2, dpo $$3) {
      $$3.g.a();
   }

   static void a(dby $$0, iz $$1, dsc $$2, avz $$3) {
      dsu $$4 = $$2.c(dgc.d);
      if ($$4 != dsu.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dsu.c) {
            je $$8 = dgc.h($$2);
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
   public void d_(cmx $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public void c(cmx $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   protected jr<cup> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cup> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbe $$0, iz $$1) {
      dsc $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dph $$3 = $$0.c_($$1);
         if ($$3 instanceof dpo) {
            return ((dpo)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpo $$0, dpo $$1) {
      jr<cup> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpu a(int $$0, cmw $$1) {
      return cqb.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.ay_(), this.n());
      }
   }

   protected void a(dby $$0, iz $$1, dsc $$2, int $$3, int $$4) {
      dez $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
