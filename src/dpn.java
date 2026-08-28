public class dpn extends dql implements dqj {
   private static final int d = 1;
   private jr<cuo> e = jr.a(27, cuo.l);
   private final dpt f = new dpt() {
      @Override
      protected void a(dbx $$0, iz $$1, dsb $$2) {
         dpn.a($$0, $$1, $$2, avz.eQ);
      }

      @Override
      protected void b(dbx $$0, iz $$1, dsb $$2) {
         dpn.a($$0, $$1, $$2, avz.eO);
      }

      @Override
      protected void a(dbx $$0, iz $$1, dsb $$2, int $$3, int $$4) {
         dpn.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmw $$0) {
         if (!($$0.cb instanceof cqa)) {
            return false;
         } else {
            bqm $$1 = ((cqa)$$0.cb).l();
            return $$1 == dpn.this || $$1 instanceof bql && ((bql)$$1).a(dpn.this);
         }
      }
   };
   private final dpo g = new dpo();

   protected dpn(dpi<?> $$0, iz $$1, dsb $$2) {
      super($$0, $$1, $$2);
   }

   public dpn(iz $$0, dsb $$1) {
      this(dpi.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xo k() {
      return xo.c("container.chest");
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e = jr.a(this.b(), cuo.l);
      if (!this.a_($$0)) {
         bqn.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqn.a($$0, this.e, $$1);
      }
   }

   public static void a(dbx $$0, iz $$1, dsb $$2, dpn $$3) {
      $$3.g.a();
   }

   static void a(dbx $$0, iz $$1, dsb $$2, avy $$3) {
      dst $$4 = $$2.c(dgb.d);
      if ($$4 != dst.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dst.c) {
            je $$8 = dgb.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cmw $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   public void c(cmw $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.ay_(), this.n());
      }
   }

   @Override
   protected jr<cuo> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cuo> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbd $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dpg $$3 = $$0.c_($$1);
         if ($$3 instanceof dpn) {
            return ((dpn)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpn $$0, dpn $$1) {
      jr<cuo> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpt a(int $$0, cmv $$1) {
      return cqa.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.ay_(), this.n());
      }
   }

   protected void a(dbx $$0, iz $$1, dsb $$2, int $$3, int $$4) {
      dey $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
