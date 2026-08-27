public class dda extends dcq {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cor d = new cor() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dda.this.e();
      }

      @Override
      public akn e() {
         return (akn)dda.this.o;
      }

      @Override
      public void f() {
         dfe $$0 = dda.this.o.a_(dda.this.p);
         this.e().a(dda.this.p, $$0, $$0, 3);
      }

      @Override
      public ehi g() {
         return ehi.b(dda.this.p);
      }

      @Override
      public dt i() {
         hc $$0 = dda.this.q().c(ctx.a);
         return new dt(this, ehi.b(dda.this.p), new ehh(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !dda.this.r();
      }
   };

   public dda(gw $$0, dfe $$1) {
      super(dcs.w, $$0, $$1);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(qu $$0) {
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

   public cor c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != dda.a.a) {
         this.x();
      }
   }

   public void g() {
      dda.a $$0 = this.v();
      if ($$0 == dda.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      csq $$0 = this.q().b();
      if ($$0 instanceof ctx) {
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
         gw $$0 = this.p.a(this.o.a_(this.p).c(ctx.a).g());
         if (this.o.a_($$0).b() instanceof ctx) {
            dcq $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dda && ((dda)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dda.a v() {
      dfe $$0 = this.q();
      if ($$0.a(csr.fN)) {
         return dda.a.c;
      } else if ($$0.a(csr.kG)) {
         return dda.a.b;
      } else {
         return $$0.a(csr.kH) ? dda.a.a : dda.a.c;
      }
   }

   public boolean w() {
      dfe $$0 = this.o.a_(this.p());
      return $$0.b() instanceof ctx ? $$0.c(ctx.b) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
