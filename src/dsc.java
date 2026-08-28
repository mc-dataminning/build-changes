public class dsc extends dtc implements dta {
   private static final int d = 1;
   private jx<cvs> e = jx.a(27, cvs.k);
   private final dsi f = new dsi() {
      @Override
      protected void a(dej $$0, jf $$1, dus $$2) {
         dsc.a($$0, $$1, $$2, awg.eR);
      }

      @Override
      protected void b(dej $$0, jf $$1, dus $$2) {
         dsc.a($$0, $$1, $$2, awg.eP);
      }

      @Override
      protected void a(dej $$0, jf $$1, dus $$2, int $$3, int $$4) {
         dsc.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cnx $$0) {
         if (!($$0.bZ instanceof cri)) {
            return false;
         } else {
            brl $$1 = ((cri)$$0.bZ).l();
            return $$1 == dsc.this || $$1 instanceof brk && ((brk)$$1).a(dsc.this);
         }
      }
   };
   private final dsd g = new dsd();

   protected dsc(drx<?> $$0, jf $$1, dus $$2) {
      super($$0, $$1, $$2);
   }

   public dsc(jf $$0, dus $$1) {
      this(drx.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xe j() {
      return xe.c("container.chest");
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.e = jx.a(this.b(), cvs.k);
      if (!this.b_($$0)) {
         brm.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brm.a($$0, this.e, $$1);
      }
   }

   public static void a(dej $$0, jf $$1, dus $$2, dsc $$3) {
      $$3.g.a();
   }

   static void a(dej $$0, jf $$1, dus $$2, awf $$3) {
      dvk $$4 = $$2.c(dip.d);
      if ($$4 != dvk.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dvk.c) {
            jk $$8 = dip.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awh.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cnx $$0) {
      if (!this.q && !$$0.Q_()) {
         this.f.a($$0, this.i(), this.aC_(), this.m());
      }
   }

   @Override
   public void c(cnx $$0) {
      if (!this.q && !$$0.Q_()) {
         this.f.b($$0, this.i(), this.aC_(), this.m());
      }
   }

   @Override
   protected jx<cvs> f() {
      return this.e;
   }

   @Override
   protected void a(jx<cvs> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(ddo $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      if ($$2.x()) {
         drv $$3 = $$0.c_($$1);
         if ($$3 instanceof dsc) {
            return ((dsc)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dsc $$0, dsc $$1) {
      jx<cvs> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cqz a(int $$0, cnw $$1) {
      return cri.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aC_(), this.m());
      }
   }

   protected void a(dej $$0, jf $$1, dus $$2, int $$3, int $$4) {
      dhm $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
