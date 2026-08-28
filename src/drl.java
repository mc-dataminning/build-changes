public class drl extends dsl implements dsj {
   private static final int d = 1;
   private jw<cvl> e = jw.a(27, cvl.k);
   private final drr f = new drr() {
      @Override
      protected void a(dds $$0, je $$1, dua $$2) {
         drl.a($$0, $$1, $$2, awd.eR);
      }

      @Override
      protected void b(dds $$0, je $$1, dua $$2) {
         drl.a($$0, $$1, $$2, awd.eP);
      }

      @Override
      protected void a(dds $$0, je $$1, dua $$2, int $$3, int $$4) {
         drl.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cnp $$0) {
         if (!($$0.ca instanceof cqz)) {
            return false;
         } else {
            brd $$1 = ((cqz)$$0.ca).l();
            return $$1 == drl.this || $$1 instanceof brc && ((brc)$$1).a(drl.this);
         }
      }
   };
   private final drm g = new drm();

   protected drl(drg<?> $$0, je $$1, dua $$2) {
      super($$0, $$1, $$2);
   }

   public drl(je $$0, dua $$1) {
      this(drg.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xd j() {
      return xd.c("container.chest");
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.e = jw.a(this.b(), cvl.k);
      if (!this.b_($$0)) {
         bre.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bre.a($$0, this.e, $$1);
      }
   }

   public static void a(dds $$0, je $$1, dua $$2, drl $$3) {
      $$3.g.a();
   }

   static void a(dds $$0, je $$1, dua $$2, awc $$3) {
      dus $$4 = $$2.c(dhy.d);
      if ($$4 != dus.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dus.c) {
            jj $$8 = dhy.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awe.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cnp $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aD_(), this.m());
      }
   }

   @Override
   public void c(cnp $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aD_(), this.m());
      }
   }

   @Override
   protected jw<cvl> f() {
      return this.e;
   }

   @Override
   protected void a(jw<cvl> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dcx $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dre $$3 = $$0.c_($$1);
         if ($$3 instanceof drl) {
            return ((drl)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(drl $$0, drl $$1) {
      jw<cvl> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cqq a(int $$0, cno $$1) {
      return cqz.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aD_(), this.m());
      }
   }

   protected void a(dds $$0, je $$1, dua $$2, int $$3, int $$4) {
      dgv $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
