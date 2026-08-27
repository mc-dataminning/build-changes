public class dcv extends dcl {
   private boolean a;
   private boolean b;
   private boolean c;
   private final col d = new col() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dcv.this.e();
      }

      @Override
      public akk e() {
         return (akk)dcv.this.o;
      }

      @Override
      public void f() {
         dez $$0 = dcv.this.o.a_(dcv.this.p);
         this.e().a(dcv.this.p, $$0, $$0, 3);
      }

      @Override
      public ehd g() {
         return ehd.b(dcv.this.p);
      }

      @Override
      public dr i() {
         ha $$0 = dcv.this.q().c(cts.a);
         return new dr(this, ehd.b(dcv.this.p), new ehc(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !dcv.this.r();
      }
   };

   public dcv(gu $$0, dez $$1) {
      super(dcn.w, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(qr $$0) {
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

   public col c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != dcv.a.a) {
         this.x();
      }
   }

   public void g() {
      dcv.a $$0 = this.v();
      if ($$0 == dcv.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      csl $$0 = this.q().b();
      if ($$0 instanceof cts) {
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
         gu $$0 = this.p.a(this.o.a_(this.p).c(cts.a).g());
         if (this.o.a_($$0).b() instanceof cts) {
            dcl $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dcv && ((dcv)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dcv.a v() {
      dez $$0 = this.q();
      if ($$0.a(csm.fN)) {
         return dcv.a.c;
      } else if ($$0.a(csm.kG)) {
         return dcv.a.b;
      } else {
         return $$0.a(csm.kH) ? dcv.a.a : dcv.a.c;
      }
   }

   public boolean w() {
      dez $$0 = this.o.a_(this.p());
      return $$0.b() instanceof cts ? $$0.c(cts.b) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
