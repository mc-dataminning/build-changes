public class dvt extends dwu implements dws {
   private static final int d = 1;
   private kb<cxy> e = kb.a(27, cxy.k);
   private final dvz f = new dvz() {
      @Override
      protected void a(dhp $$0, jj $$1, dym $$2) {
         dvt.a($$0, $$1, $$2, awk.eS);
      }

      @Override
      protected void b(dhp $$0, jj $$1, dym $$2) {
         dvt.a($$0, $$1, $$2, awk.eQ);
      }

      @Override
      protected void a(dhp $$0, jj $$1, dym $$2, int $$3, int $$4) {
         dvt.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cqi $$0) {
         if (!($$0.bP instanceof ctw)) {
            return false;
         } else {
            btj $$1 = ((ctw)$$0.bP).l();
            return $$1 == dvt.this || $$1 instanceof bti && ((bti)$$1).a(dvt.this);
         }
      }
   };
   private final dvu g = new dvu();

   protected dvt(dvn<?> $$0, jj $$1, dym $$2) {
      super($$0, $$1, $$2);
   }

   public dvt(jj $$0, dym $$1) {
      this(dvn.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wv j() {
      return wv.c("container.chest");
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.e = kb.a(this.b(), cxy.k);
      if (!this.b_($$0)) {
         btk.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btk.a($$0, this.e, $$1);
      }
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dvt $$3) {
      $$3.g.a();
   }

   static void a(dhp $$0, jj $$1, dym $$2, awj $$3) {
      dze $$4 = $$2.c(dlx.d);
      if ($$4 != dze.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dze.c) {
            jo $$8 = dlx.i($$2);
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
   public void c_(cqi $$0) {
      if (!this.p && !$$0.U_()) {
         this.f.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   public void c(cqi $$0) {
      if (!this.p && !$$0.U_()) {
         this.f.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   protected kb<cxy> f() {
      return this.e;
   }

   @Override
   protected void a(kb<cxy> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dgv $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dvl $$3 = $$0.c_($$1);
         if ($$3 instanceof dvt) {
            return ((dvt)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dvt $$0, dvt $$1) {
      kb<cxy> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected ctn a(int $$0, cqh $$1) {
      return ctw.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.aw_(), this.m());
      }
   }

   protected void a(dhp $$0, jj $$1, dym $$2, int $$3, int $$4) {
      dku $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
