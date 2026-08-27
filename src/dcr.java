public class dcr extends ddn implements ddm {
   private static final int c = 1;
   private ho<ciw> f = ho.a(27, ciw.b);
   private final dcx g = new dcx() {
      @Override
      protected void a(cpk $$0, gv $$1, dey $$2) {
         dcr.a($$0, $$1, $$2, aou.ej);
      }

      @Override
      protected void b(cpk $$0, gv $$1, dey $$2) {
         dcr.a($$0, $$1, $$2, aou.eh);
      }

      @Override
      protected void a(cpk $$0, gv $$1, dey $$2, int $$3, int $$4) {
         dcr.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cbl $$0) {
         if (!($$0.bQ instanceof cej)) {
            return false;
         } else {
            bgh $$1 = ((cej)$$0.bQ).l();
            return $$1 == dcr.this || $$1 instanceof bgg && ((bgg)$$1).a(dcr.this);
         }
      }
   };
   private final dcs j = new dcs();

   protected dcr(dcm<?> $$0, gv $$1, dey $$2) {
      super($$0, $$1, $$2);
   }

   public dcr(gv $$0, dey $$1) {
      this(dcm.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected te g() {
      return te.c("container.chest");
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.f = ho.a(this.b(), ciw.b);
      if (!this.d($$0)) {
         bgi.b($$0, this.f);
      }
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgi.a($$0, this.f);
      }
   }

   public static void a(cpk $$0, gv $$1, dey $$2, dcr $$3) {
      $$3.j.a();
   }

   static void a(cpk $$0, gv $$1, dey $$2, aot $$3) {
      dfq $$4 = $$2.c(ctm.c);
      if ($$4 != dfq.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dfq.c) {
            hb $$8 = ctm.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aov.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.j.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cbl $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbl $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected ho<ciw> f() {
      return this.f;
   }

   @Override
   protected void a(ho<ciw> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(coq $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dck $$3 = $$0.c_($$1);
         if ($$3 instanceof dcr) {
            return ((dcr)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dcr $$0, dcr $$1) {
      ho<ciw> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cec a(int $$0, cbk $$1) {
      return cej.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cpk $$0, gv $$1, dey $$2, int $$3, int $$4) {
      csk $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
