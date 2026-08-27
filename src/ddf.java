public class ddf extends dcv {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cow d = new cow() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         ddf.this.e();
      }

      @Override
      public akr e() {
         return (akr)ddf.this.o;
      }

      @Override
      public void f() {
         dfj $$0 = ddf.this.o.a_(ddf.this.p);
         this.e().a(ddf.this.p, $$0, $$0, 3);
      }

      @Override
      public ehn g() {
         return ehn.b(ddf.this.p);
      }

      @Override
      public dt i() {
         hc $$0 = ddf.this.q().c(cuc.a);
         return new dt(this, ehn.b(ddf.this.p), new ehm(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !ddf.this.r();
      }
   };

   public ddf(gw $$0, dfj $$1) {
      super(dcx.w, $$0, $$1);
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.d.b($$0);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean t() {
      return true;
   }

   public cow c() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public boolean f() {
      return this.b;
   }

   public void b(boolean $$0) {
      boolean $$1 = this.b;
      this.b = $$0;
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != ddf.a.a) {
         this.x();
      }
   }

   public void g() {
      ddf.a $$0 = this.v();
      if ($$0 == ddf.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      csv $$0 = this.q().b();
      if ($$0 instanceof cuc) {
         this.j();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean i() {
      return this.c;
   }

   public boolean j() {
      this.c = true;
      if (this.w()) {
         gw $$0 = this.p.a(this.o.a_(this.p).c(cuc.a).g());
         if (this.o.a_($$0).b() instanceof cuc) {
            dcv $$1 = this.o.c_($$0);
            this.c = $$1 instanceof ddf && ((ddf)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public ddf.a v() {
      dfj $$0 = this.q();
      if ($$0.a(csw.fN)) {
         return ddf.a.c;
      } else if ($$0.a(csw.kG)) {
         return ddf.a.b;
      } else {
         return $$0.a(csw.kH) ? ddf.a.a : ddf.a.c;
      }
   }

   public boolean w() {
      dfj $$0 = this.o.a_(this.p());
      return $$0.b() instanceof cuc ? $$0.c(cuc.b) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
