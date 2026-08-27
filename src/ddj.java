public class ddj extends dcz {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cpc d = new cpc() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         ddj.this.e();
      }

      @Override
      public akt e() {
         return (akt)ddj.this.o;
      }

      @Override
      public void f() {
         dfd $$0 = ddj.this.o.a_(ddj.this.p);
         this.e().a(ddj.this.p, $$0, $$0, 3);
      }

      @Override
      public ehh g() {
         return ehh.b(ddj.this.p);
      }

      @Override
      public dt i() {
         ha $$0 = ddj.this.q().c(cul.b);
         return new dt(this, ehh.b(ddj.this.p), new ehg(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !ddj.this.r();
      }
   };

   public ddj(gw $$0, dfd $$1) {
      super(ddb.w, $$0, $$1);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(qw $$0) {
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

   public cpc c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != ddj.a.a) {
         this.x();
      }
   }

   public void g() {
      ddj.a $$0 = this.v();
      if ($$0 == ddj.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      ctc $$0 = this.q().b();
      if ($$0 instanceof cul) {
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
         gw $$0 = this.p.a(this.o.a_(this.p).c(cul.b).g());
         if (this.o.a_($$0).b() instanceof cul) {
            dcz $$1 = this.o.c_($$0);
            this.c = $$1 instanceof ddj && ((ddj)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public ddj.a v() {
      dfd $$0 = this.q();
      if ($$0.a(cte.fN)) {
         return ddj.a.c;
      } else if ($$0.a(cte.kG)) {
         return ddj.a.b;
      } else {
         return $$0.a(cte.kH) ? ddj.a.a : ddj.a.c;
      }
   }

   public boolean w() {
      dfd $$0 = this.o.a_(this.p());
      return $$0.b() instanceof cul ? $$0.c(cul.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
