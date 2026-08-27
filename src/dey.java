public class dey extends dfv implements dfu {
   private static final int c = 1;
   private il<clb> d = il.a(27, clb.b);
   private final dfe e = new dfe() {
      @Override
      protected void a(crs $$0, ht $$1, dgw $$2) {
         dey.a($$0, $$1, $$2, aqn.ej);
      }

      @Override
      protected void b(crs $$0, ht $$1, dgw $$2) {
         dey.a($$0, $$1, $$2, aqn.eh);
      }

      @Override
      protected void a(crs $$0, ht $$1, dgw $$2, int $$3, int $$4) {
         dey.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cdm $$0) {
         if (!($$0.bS instanceof cgl)) {
            return false;
         } else {
            bij $$1 = ((cgl)$$0.bS).l();
            return $$1 == dey.this || $$1 instanceof bii && ((bii)$$1).a(dey.this);
         }
      }
   };
   private final dez f = new dez();

   protected dey(det<?> $$0, ht $$1, dgw $$2) {
      super($$0, $$1, $$2);
   }

   public dey(ht $$0, dgw $$1) {
      this(det.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ur g() {
      return ur.c("container.chest");
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.d = il.a(this.b(), clb.b);
      if (!this.d($$0)) {
         bik.b($$0, this.d);
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bik.a($$0, this.d);
      }
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dey $$3) {
      $$3.f.a();
   }

   static void a(crs $$0, ht $$1, dgw $$2, aqm $$3) {
      dho $$4 = $$2.c(cvw.d);
      if ($$4 != dho.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dho.c) {
            hx $$8 = cvw.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aqo.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.f.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cdm $$0) {
      if (!this.q && !$$0.N_()) {
         this.e.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cdm $$0) {
      if (!this.q && !$$0.N_()) {
         this.e.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected il<clb> f() {
      return this.d;
   }

   @Override
   protected void a(il<clb> $$0) {
      this.d = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.f.a($$0);
   }

   public static int a(cqy $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      if ($$2.t()) {
         der $$3 = $$0.c_($$1);
         if ($$3 instanceof dey) {
            return ((dey)$$3).e.a();
         }
      }

      return 0;
   }

   public static void a(dey $$0, dey $$1) {
      il<clb> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cge a(int $$0, cdl $$1) {
      return cgl.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.e.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(crs $$0, ht $$1, dgw $$2, int $$3, int $$4) {
      cut $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
