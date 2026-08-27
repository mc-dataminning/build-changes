public class dfk extends dgh implements dgg {
   private static final int c = 1;
   private il<clj> d = il.a(27, clj.b);
   private final dfq e = new dfq() {
      @Override
      protected void a(csa $$0, ht $$1, dhi $$2) {
         dfk.a($$0, $$1, $$2, aqr.ej);
      }

      @Override
      protected void b(csa $$0, ht $$1, dhi $$2) {
         dfk.a($$0, $$1, $$2, aqr.eh);
      }

      @Override
      protected void a(csa $$0, ht $$1, dhi $$2, int $$3, int $$4) {
         dfk.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cdu $$0) {
         if (!($$0.bS instanceof cgt)) {
            return false;
         } else {
            biq $$1 = ((cgt)$$0.bS).l();
            return $$1 == dfk.this || $$1 instanceof bip && ((bip)$$1).a(dfk.this);
         }
      }
   };
   private final dfl f = new dfl();

   protected dfk(dff<?> $$0, ht $$1, dhi $$2) {
      super($$0, $$1, $$2);
   }

   public dfk(ht $$0, dhi $$1) {
      this(dff.b, $$0, $$1);
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
      this.d = il.a(this.b(), clj.b);
      if (!this.d($$0)) {
         bir.b($$0, this.d);
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bir.a($$0, this.d);
      }
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dfk $$3) {
      $$3.f.a();
   }

   static void a(csa $$0, ht $$1, dhi $$2, aqq $$3) {
      dia $$4 = $$2.c(cwd.d);
      if ($$4 != dia.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dia.c) {
            hx $$8 = cwd.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aqs.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cdu $$0) {
      if (!this.q && !$$0.O_()) {
         this.e.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cdu $$0) {
      if (!this.q && !$$0.O_()) {
         this.e.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected il<clj> f() {
      return this.d;
   }

   @Override
   protected void a(il<clj> $$0) {
      this.d = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.f.a($$0);
   }

   public static int a(crg $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dfd $$3 = $$0.c_($$1);
         if ($$3 instanceof dfk) {
            return ((dfk)$$3).e.a();
         }
      }

      return 0;
   }

   public static void a(dfk $$0, dfk $$1) {
      il<clj> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cgm a(int $$0, cdt $$1) {
      return cgt.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.e.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(csa $$0, ht $$1, dhi $$2, int $$3, int $$4) {
      cva $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
