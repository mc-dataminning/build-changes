public class dcs extends ddo implements ddn {
   private static final int c = 1;
   private hn<cix> f = hn.a(27, cix.b);
   private final dcy g = new dcy() {
      @Override
      protected void a(cpl $$0, gu $$1, dez $$2) {
         dcs.a($$0, $$1, $$2, aow.ej);
      }

      @Override
      protected void b(cpl $$0, gu $$1, dez $$2) {
         dcs.a($$0, $$1, $$2, aow.eh);
      }

      @Override
      protected void a(cpl $$0, gu $$1, dez $$2, int $$3, int $$4) {
         dcs.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cbm $$0) {
         if (!($$0.bQ instanceof cek)) {
            return false;
         } else {
            bgj $$1 = ((cek)$$0.bQ).l();
            return $$1 == dcs.this || $$1 instanceof bgi && ((bgi)$$1).a(dcs.this);
         }
      }
   };
   private final dct j = new dct();

   protected dcs(dcn<?> $$0, gu $$1, dez $$2) {
      super($$0, $$1, $$2);
   }

   public dcs(gu $$0, dez $$1) {
      this(dcn.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected tf g() {
      return tf.c("container.chest");
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.f = hn.a(this.b(), cix.b);
      if (!this.d($$0)) {
         bgk.b($$0, this.f);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgk.a($$0, this.f);
      }
   }

   public static void a(cpl $$0, gu $$1, dez $$2, dcs $$3) {
      $$3.j.a();
   }

   static void a(cpl $$0, gu $$1, dez $$2, aov $$3) {
      dfr $$4 = $$2.c(ctn.c);
      if ($$4 != dfr.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dfr.c) {
            ha $$8 = ctn.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aox.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cbm $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(cbm $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected hn<cix> f() {
      return this.f;
   }

   @Override
   protected void a(hn<cix> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(cor $$0, gu $$1) {
      dez $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dcl $$3 = $$0.c_($$1);
         if ($$3 instanceof dcs) {
            return ((dcs)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dcs $$0, dcs $$1) {
      hn<cix> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected ced a(int $$0, cbl $$1) {
      return cek.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cpl $$0, gu $$1, dez $$2, int $$3, int $$4) {
      csl $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
