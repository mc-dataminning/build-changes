public class dpq extends dpg {
   private boolean a;
   private boolean b;
   private boolean c;
   private final day d = new day() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dpq.this.e();
      }

      @Override
      public are e() {
         return (are)dpq.this.n;
      }

      @Override
      public void f() {
         dsb $$0 = dpq.this.n.a_(dpq.this.o);
         this.e().a(dpq.this.o, $$0, $$0, 3);
      }

      @Override
      public evq g() {
         return evq.b(dpq.this.o);
      }

      @Override
      public ep i() {
         je $$0 = dpq.this.n().c(dgh.b);
         return new ep(this, evq.b(dpq.this.o), new evp(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dpq.this.o();
      }
   };

   public dpq(iz $$0, dsb $$1) {
      super(dpi.w, $$0, $$1);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean q() {
      return true;
   }

   public day b() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean c() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public void b(boolean $$0) {
      boolean $$1 = this.b;
      this.b = $$0;
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dpq.a.a) {
         this.v();
      }
   }

   public void f() {
      dpq.a $$0 = this.l();
      if ($$0 == dpq.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dey $$0 = this.n().b();
      if ($$0 instanceof dgh) {
         this.k();
         this.n.a(this.o, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.u()) {
         iz $$0 = this.o.a(this.n.a_(this.o).c(dgh.b).g());
         if (this.n.a_($$0).b() instanceof dgh) {
            dpg $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dpq && ((dpq)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dpq.a l() {
      dsb $$0 = this.n();
      if ($$0.a(dfa.fN)) {
         return dpq.a.c;
      } else if ($$0.a(dfa.kG)) {
         return dpq.a.b;
      } else {
         return $$0.a(dfa.kH) ? dpq.a.a : dpq.a.c;
      }
   }

   public boolean u() {
      dsb $$0 = this.n.a_(this.ay_());
      return $$0.b() instanceof dgh ? $$0.c(dgh.c) : false;
   }

   @Override
   protected void a(dpg.b $$0) {
      super.a($$0);
      this.d.b($$0.a(km.g));
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.g, this.d.o());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
