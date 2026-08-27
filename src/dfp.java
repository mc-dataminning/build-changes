public class dfp extends dgm implements dgl {
   private static final int e = 1;
   private ip<clo> f = ip.a(27, clo.b);
   private final dfv g = new dfv() {
      @Override
      protected void a(csf $$0, hx $$1, dhn $$2) {
         dfp.a($$0, $$1, $$2, aqv.ej);
      }

      @Override
      protected void b(csf $$0, hx $$1, dhn $$2) {
         dfp.a($$0, $$1, $$2, aqv.eh);
      }

      @Override
      protected void a(csf $$0, hx $$1, dhn $$2, int $$3, int $$4) {
         dfp.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cdz $$0) {
         if (!($$0.bS instanceof cgy)) {
            return false;
         } else {
            biu $$1 = ((cgy)$$0.bS).l();
            return $$1 == dfp.this || $$1 instanceof bit && ((bit)$$1).a(dfp.this);
         }
      }
   };
   private final dfq h = new dfq();

   protected dfp(dfk<?> $$0, hx $$1, dhn $$2) {
      super($$0, $$1, $$2);
   }

   public dfp(hx $$0, dhn $$1) {
      this(dfk.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected uv l() {
      return uv.c("container.chest");
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.f = ip.a(this.b(), clo.b);
      if (!this.c_($$0)) {
         biv.b($$0, this.f);
      }
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         biv.a($$0, this.f);
      }
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dfp $$3) {
      $$3.h.a();
   }

   static void a(csf $$0, hx $$1, dhn $$2, aqu $$3) {
      dif $$4 = $$2.c(cwi.d);
      if ($$4 != dif.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dif.c) {
            ib $$8 = cwi.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aqw.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.h.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cdz $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.a($$0, this.i(), this.aC_(), this.r());
      }
   }

   @Override
   public void c(cdz $$0) {
      if (!this.q && !$$0.P_()) {
         this.g.b($$0, this.i(), this.aC_(), this.r());
      }
   }

   @Override
   protected ip<clo> k() {
      return this.f;
   }

   @Override
   protected void a(ip<clo> $$0) {
      this.f = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.h.a($$0);
   }

   public static int a(crl $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dfi $$3 = $$0.c_($$1);
         if ($$3 instanceof dfp) {
            return ((dfp)$$3).g.a();
         }
      }

      return 0;
   }

   public static void a(dfp $$0, dfp $$1) {
      ip<clo> $$2 = $$0.k();
      $$0.a($$1.k());
      $$1.a($$2);
   }

   @Override
   protected cgr a(int $$0, cdy $$1) {
      return cgy.a($$0, $$1, this);
   }

   public void m() {
      if (!this.q) {
         this.g.c(this.i(), this.aC_(), this.r());
      }
   }

   protected void a(csf $$0, hx $$1, dhn $$2, int $$3, int $$4) {
      cvf $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
