public class ddh extends dcx {
   private boolean a;
   private boolean b;
   private boolean c;
   private final coy d = new coy() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         ddh.this.e();
      }

      @Override
      public aks e() {
         return (aks)ddh.this.o;
      }

      @Override
      public void f() {
         dfl $$0 = ddh.this.o.a_(ddh.this.p);
         this.e().a(ddh.this.p, $$0, $$0, 3);
      }

      @Override
      public ehp g() {
         return ehp.b(ddh.this.p);
      }

      @Override
      public dt i() {
         hc $$0 = ddh.this.q().c(cue.a);
         return new dt(this, ehp.b(ddh.this.p), new eho(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !ddh.this.r();
      }
   };

   public ddh(gw $$0, dfl $$1) {
      super(dcz.w, $$0, $$1);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(qy $$0) {
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

   public coy c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != ddh.a.a) {
         this.x();
      }
   }

   public void g() {
      ddh.a $$0 = this.v();
      if ($$0 == ddh.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      csx $$0 = this.q().b();
      if ($$0 instanceof cue) {
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
         gw $$0 = this.p.a(this.o.a_(this.p).c(cue.a).g());
         if (this.o.a_($$0).b() instanceof cue) {
            dcx $$1 = this.o.c_($$0);
            this.c = $$1 instanceof ddh && ((ddh)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public ddh.a v() {
      dfl $$0 = this.q();
      if ($$0.a(csy.fN)) {
         return ddh.a.c;
      } else if ($$0.a(csy.kG)) {
         return ddh.a.b;
      } else {
         return $$0.a(csy.kH) ? ddh.a.a : ddh.a.c;
      }
   }

   public boolean w() {
      dfl $$0 = this.o.a_(this.p());
      return $$0.b() instanceof cue ? $$0.c(cue.b) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
