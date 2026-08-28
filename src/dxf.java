public class dxf extends dyg implements dye {
   private static final int d = 1;
   private jn<cyy> e = jn.a(27, cyy.k);
   private final dxl f = new dxl() {
      @Override
      protected void a(div $$0, iu $$1, dzz $$2) {
         dxf.a($$0, $$1, $$2, awn.eS);
      }

      @Override
      protected void b(div $$0, iu $$1, dzz $$2) {
         dxf.a($$0, $$1, $$2, awn.eQ);
      }

      @Override
      protected void a(div $$0, iu $$1, dzz $$2, int $$3, int $$4) {
         dxf.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cqy $$0) {
         if (!($$0.bQ instanceof cuz)) {
            return false;
         } else {
            btu $$1 = ((cuz)$$0.bQ).l();
            return $$1 == dxf.this || $$1 instanceof btt && ((btt)$$1).a(dxf.this);
         }
      }
   };
   private final dxg g = new dxg();

   protected dxf(dwz<?> $$0, iu $$1, dzz $$2) {
      super($$0, $$1, $$2);
   }

   public dxf(iu $$0, dzz $$1) {
      this(dwz.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wy j() {
      return wy.c("container.chest");
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.e = jn.a(this.b(), cyy.k);
      if (!this.b_($$0)) {
         btv.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btv.a($$0, this.e, $$1);
      }
   }

   public static void a(div $$0, iu $$1, dzz $$2, dxf $$3) {
      $$3.g.a();
   }

   static void a(div $$0, iu $$1, dzz $$2, awm $$3) {
      ear $$4 = $$2.c(dnd.d);
      if ($$4 != ear.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == ear.c) {
            ja $$8 = dnd.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awo.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
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
   public void c_(cqy $$0) {
      if (!this.p && !$$0.U_()) {
         this.f.a($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   public void c(cqy $$0) {
      if (!this.p && !$$0.U_()) {
         this.f.b($$0, this.i(), this.aw_(), this.m());
      }
   }

   @Override
   protected jn<cyy> f() {
      return this.e;
   }

   @Override
   protected void a(jn<cyy> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dib $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dwx $$3 = $$0.c_($$1);
         if ($$3 instanceof dxf) {
            return ((dxf)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dxf $$0, dxf $$1) {
      jn<cyy> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cuq a(int $$0, cqx $$1) {
      return cuz.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.aw_(), this.m());
      }
   }

   protected void a(div $$0, iu $$1, dzz $$2, int $$3, int $$4) {
      dma $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
