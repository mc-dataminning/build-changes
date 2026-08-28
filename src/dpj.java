public class dpj extends dqh implements dqf {
   private static final int d = 1;
   private jr<cuk> e = jr.a(27, cuk.l);
   private final dpp f = new dpp() {
      @Override
      protected void a(dbt $$0, iz $$1, drx $$2) {
         dpj.a($$0, $$1, $$2, avw.eQ);
      }

      @Override
      protected void b(dbt $$0, iz $$1, drx $$2) {
         dpj.a($$0, $$1, $$2, avw.eO);
      }

      @Override
      protected void a(dbt $$0, iz $$1, drx $$2, int $$3, int $$4) {
         dpj.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cms $$0) {
         if (!($$0.cb instanceof cpw)) {
            return false;
         } else {
            bqi $$1 = ((cpw)$$0.cb).l();
            return $$1 == dpj.this || $$1 instanceof bqh && ((bqh)$$1).a(dpj.this);
         }
      }
   };
   private final dpk g = new dpk();

   protected dpj(dpe<?> $$0, iz $$1, drx $$2) {
      super($$0, $$1, $$2);
   }

   public dpj(iz $$0, drx $$1) {
      this(dpe.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xl k() {
      return xl.c("container.chest");
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e = jr.a(this.b(), cuk.l);
      if (!this.a_($$0)) {
         bqj.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqj.a($$0, this.e, $$1);
      }
   }

   public static void a(dbt $$0, iz $$1, drx $$2, dpj $$3) {
      $$3.g.a();
   }

   static void a(dbt $$0, iz $$1, drx $$2, avv $$3) {
      dsp $$4 = $$2.c(dfx.d);
      if ($$4 != dsp.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dsp.c) {
            je $$8 = dfx.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avx.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cms $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public void c(cms $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   @Override
   protected jr<cuk> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cuk> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(daz $$0, iz $$1) {
      drx $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dpc $$3 = $$0.c_($$1);
         if ($$3 instanceof dpj) {
            return ((dpj)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpj $$0, dpj $$1) {
      jr<cuk> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpp a(int $$0, cmr $$1) {
      return cpw.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.aA_(), this.n());
      }
   }

   protected void a(dbt $$0, iz $$1, drx $$2, int $$3, int $$4) {
      deu $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
