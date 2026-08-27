public class dcx extends ddt implements dds {
   private static final int c = 1;
   private hp<cja> f = hp.a(27, cja.b);
   private final ddd g = new ddd() {
      @Override
      protected void a(cpq $$0, gw $$1, dfe $$2) {
         dcx.a($$0, $$1, $$2, aoz.ej);
      }

      @Override
      protected void b(cpq $$0, gw $$1, dfe $$2) {
         dcx.a($$0, $$1, $$2, aoz.eh);
      }

      @Override
      protected void a(cpq $$0, gw $$1, dfe $$2, int $$3, int $$4) {
         dcx.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cbp $$0) {
         if (!($$0.bQ instanceof cen)) {
            return false;
         } else {
            bgm $$1 = ((cen)$$0.bQ).l();
            return $$1 == dcx.this || $$1 instanceof bgl && ((bgl)$$1).a(dcx.this);
         }
      }
   };
   private final dcy j = new dcy();

   protected dcx(dcs<?> $$0, gw $$1, dfe $$2) {
      super($$0, $$1, $$2);
   }

   public dcx(gw $$0, dfe $$1) {
      this(dcs.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ti g() {
      return ti.c("container.chest");
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.f = hp.a(this.b(), cja.b);
      if (!this.d($$0)) {
         bgn.b($$0, this.f);
      }
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgn.a($$0, this.f);
      }
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, dcx $$3) {
      $$3.j.a();
   }

   static void a(cpq $$0, gw $$1, dfe $$2, aoy $$3) {
      dfw $$4 = $$2.c(cts.c);
      if ($$4 != dfw.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dfw.c) {
            hc $$8 = cts.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, apa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cbp $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbp $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected hp<cja> f() {
      return this.f;
   }

   @Override
   protected void a(hp<cja> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(cow $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dcq $$3 = $$0.c_($$1);
         if ($$3 instanceof dcx) {
            return ((dcx)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dcx $$0, dcx $$1) {
      hp<cja> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected ceg a(int $$0, cbo $$1) {
      return cen.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cpq $$0, gw $$1, dfe $$2, int $$3, int $$4) {
      csq $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
