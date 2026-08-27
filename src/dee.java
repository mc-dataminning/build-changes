public class dee extends dfa implements dez {
   private static final int c = 1;
   private il<ckj> f = il.a(27, ckj.b);
   private final dek g = new dek() {
      @Override
      protected void a(cqz $$0, ht $$1, dgb $$2) {
         dee.a($$0, $$1, $$2, aqd.ej);
      }

      @Override
      protected void b(cqz $$0, ht $$1, dgb $$2) {
         dee.a($$0, $$1, $$2, aqd.eh);
      }

      @Override
      protected void a(cqz $$0, ht $$1, dgb $$2, int $$3, int $$4) {
         dee.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(ccx $$0) {
         if (!($$0.bS instanceof cfw)) {
            return false;
         } else {
            bhu $$1 = ((cfw)$$0.bS).l();
            return $$1 == dee.this || $$1 instanceof bht && ((bht)$$1).a(dee.this);
         }
      }
   };
   private final def j = new def();

   protected dee(ddz<?> $$0, ht $$1, dgb $$2) {
      super($$0, $$1, $$2);
   }

   public dee(ht $$0, dgb $$1) {
      this(ddz.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ui g() {
      return ui.c("container.chest");
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.f = il.a(this.b(), ckj.b);
      if (!this.d($$0)) {
         bhv.b($$0, this.f);
      }
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bhv.a($$0, this.f);
      }
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, dee $$3) {
      $$3.j.a();
   }

   static void a(cqz $$0, ht $$1, dgb $$2, aqc $$3) {
      dgt $$4 = $$2.c(cvd.d);
      if ($$4 != dgt.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dgt.c) {
            hx $$8 = cvd.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aqe.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(ccx $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(ccx $$0) {
      if (!this.q && !$$0.N_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected il<ckj> f() {
      return this.f;
   }

   @Override
   protected void a(il<ckj> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(cqf $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      if ($$2.t()) {
         ddx $$3 = $$0.c_($$1);
         if ($$3 instanceof dee) {
            return ((dee)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dee $$0, dee $$1) {
      il<ckj> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cfp a(int $$0, ccw $$1) {
      return cfw.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cqz $$0, ht $$1, dgb $$2, int $$3, int $$4) {
      cua $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
