public class dcu extends dck {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cok d = new cok() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dcu.this.e();
      }

      @Override
      public aki e() {
         return (aki)dcu.this.o;
      }

      @Override
      public void f() {
         dey $$0 = dcu.this.o.a_(dcu.this.p);
         this.e().a(dcu.this.p, $$0, $$0, 3);
      }

      @Override
      public ehf g() {
         return ehf.b(dcu.this.p);
      }

      @Override
      public ds i() {
         hb $$0 = dcu.this.q().c(ctr.a);
         return new ds(this, ehf.b(dcu.this.p), new ehe(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !dcu.this.r();
      }
   };

   public dcu(gv $$0, dey $$1) {
      super(dcm.w, $$0, $$1);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(qs $$0) {
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

   public cok c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != dcu.a.a) {
         this.x();
      }
   }

   public void g() {
      dcu.a $$0 = this.v();
      if ($$0 == dcu.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      csk $$0 = this.q().b();
      if ($$0 instanceof ctr) {
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
         gv $$0 = this.p.a(this.o.a_(this.p).c(ctr.a).g());
         if (this.o.a_($$0).b() instanceof ctr) {
            dck $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dcu && ((dcu)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dcu.a v() {
      dey $$0 = this.q();
      if ($$0.a(csl.fN)) {
         return dcu.a.c;
      } else if ($$0.a(csl.kG)) {
         return dcu.a.b;
      } else {
         return $$0.a(csl.kH) ? dcu.a.a : dcu.a.c;
      }
   }

   public boolean w() {
      dey $$0 = this.o.a_(this.p());
      return $$0.b() instanceof ctr ? $$0.c(ctr.b) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
