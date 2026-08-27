public class czu extends daq implements dap {
   private static final int c = 1;
   private hn<cfz> f = hn.a(27, cfz.b);
   private final daa g = new daa() {
      @Override
      protected void a(cmm $$0, gu $$1, dcb $$2) {
         czu.a($$0, $$1, $$2, amh.ej);
      }

      @Override
      protected void b(cmm $$0, gu $$1, dcb $$2) {
         czu.a($$0, $$1, $$2, amh.eh);
      }

      @Override
      protected void a(cmm $$0, gu $$1, dcb $$2, int $$3, int $$4) {
         czu.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(byo $$0) {
         if (!($$0.bR instanceof cbm)) {
            return false;
         } else {
            bdq $$1 = ((cbm)$$0.bR).l();
            return $$1 == czu.this || $$1 instanceof bdp && ((bdp)$$1).a(czu.this);
         }
      }
   };
   private final czv j = new czv();

   protected czu(czp<?> $$0, gu $$1, dcb $$2) {
      super($$0, $$1, $$2);
   }

   public czu(gu $$0, dcb $$1) {
      this(czp.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected sw g() {
      return sw.c("container.chest");
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.f = hn.a(this.b(), cfz.b);
      if (!this.d($$0)) {
         bdr.b($$0, this.f);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bdr.a($$0, this.f);
      }
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, czu $$3) {
      $$3.j.a();
   }

   static void a(cmm $$0, gu $$1, dcb $$2, amg $$3) {
      dct $$4 = $$2.c(cqp.c);
      if ($$4 != dct.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dct.c) {
            ha $$8 = cqp.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, ami.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(byo $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(byo $$0) {
      if (!this.q && !$$0.G_()) {
         this.g.b($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   protected hn<cfz> f() {
      return this.f;
   }

   @Override
   protected void a(hn<cfz> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.j.a($$0);
   }

   public static int a(cls $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      if ($$2.t()) {
         czn $$3 = $$0.c_($$1);
         if ($$3 instanceof czu) {
            return ((czu)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(czu $$0, czu $$1) {
      hn<cfz> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cbf a(int $$0, byn $$1) {
      return cbm.a($$0, $$1, this);
   }

   public void i() {
      if (!this.q) {
         this.g.c(this.k(), this.p(), this.q());
      }
   }

   protected void a(cmm $$0, gu $$1, dcb $$2, int $$3, int $$4) {
      cpn $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
