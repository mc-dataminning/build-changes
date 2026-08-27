public class dde extends dea implements ddz {
   private static final int c = 1;
   private hp<cjh> f = hp.a(27, cjh.b);
   private final ddk g = new ddk() {
      @Override
      protected void a(cpx $$0, gw $$1, dfl $$2) {
         dde.a($$0, $$1, $$2, apf.ej);
      }

      @Override
      protected void b(cpx $$0, gw $$1, dfl $$2) {
         dde.a($$0, $$1, $$2, apf.eh);
      }

      @Override
      protected void a(cpx $$0, gw $$1, dfl $$2, int $$3, int $$4) {
         dde.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cbw $$0) {
         if (!($$0.bS instanceof ceu)) {
            return false;
         } else {
            bgt $$1 = ((ceu)$$0.bS).l();
            return $$1 == dde.this || $$1 instanceof bgs && ((bgs)$$1).a(dde.this);
         }
      }
   };
   private final ddf j = new ddf();

   protected dde(dcz<?> $$0, gw $$1, dfl $$2) {
      super($$0, $$1, $$2);
   }

   public dde(gw $$0, dfl $$1) {
      this(dcz.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected tn g() {
      return tn.c("container.chest");
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.f = hp.a(this.b(), cjh.b);
      if (!this.d($$0)) {
         bgu.b($$0, this.f);
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgu.a($$0, this.f);
      }
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, dde $$3) {
      $$3.j.a();
   }

   static void a(cpx $$0, gw $$1, dfl $$2, ape $$3) {
      dgd $$4 = $$2.c(ctz.c);
      if ($$4 != dgd.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dgd.c) {
            hc $$8 = ctz.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, apg.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cbw $$0) {
      if (!this.q && !$$0.M_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbw $$0) {
      if (!this.q && !$$0.M_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected hp<cjh> f() {
      return this.f;
   }

   @Override
   protected void a(hp<cjh> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(cpd $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dcx $$3 = $$0.c_($$1);
         if ($$3 instanceof dde) {
            return ((dde)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dde $$0, dde $$1) {
      hp<cjh> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cen a(int $$0, cbv $$1) {
      return ceu.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cpx $$0, gw $$1, dfl $$2, int $$3, int $$4) {
      csx $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
