public class dsq extends dsg {
   private boolean a;
   private boolean b;
   private boolean c;
   private final ddv d = new ddv() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dsq.this.e();
      }

      @Override
      public arm e() {
         return (arm)dsq.this.o;
      }

      @Override
      public void f() {
         dvd $$0 = dsq.this.o.a_(dsq.this.p);
         this.e().a(dsq.this.p, $$0, $$0, 3);
      }

      @Override
      public ezh g() {
         return ezh.b(dsq.this.p);
      }

      @Override
      public ev i() {
         jl $$0 = dsq.this.m().c(djh.b);
         return new ev(this, ezh.b(dsq.this.p), new ezg(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dsq.this.n();
      }
   };

   public dsq(jg $$0, dvd $$1) {
      super(dsi.w, $$0, $$1);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean p() {
      return true;
   }

   public ddv b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dsq.a.a) {
         this.v();
      }
   }

   public void f() {
      dsq.a $$0 = this.t();
      if ($$0 == dsq.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      dhy $$0 = this.m().b();
      if ($$0 instanceof djh) {
         this.k();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.u()) {
         jg $$0 = this.p.a(this.o.a_(this.p).c(djh.b).g());
         if (this.o.a_($$0).b() instanceof djh) {
            dsg $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dsq && ((dsq)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dsq.a t() {
      dvd $$0 = this.m();
      if ($$0.a(dia.fN)) {
         return dsq.a.c;
      } else if ($$0.a(dia.kG)) {
         return dsq.a.b;
      } else {
         return $$0.a(dia.kH) ? dsq.a.a : dsq.a.c;
      }
   }

   public boolean u() {
      dvd $$0 = this.o.a_(this.aC_());
      return $$0.b() instanceof djh ? $$0.c(djh.c) : false;
   }

   @Override
   protected void a(dsg.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kt.g));
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      $$0.a(kt.g, this.d.o());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      $$0.r("CustomName");
      $$0.r("conditionMet");
      $$0.r("powered");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
