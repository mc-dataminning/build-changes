public class dqp extends dqf {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dbv d = new dbv() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dqp.this.e();
      }

      @Override
      public aqt e() {
         return (aqt)dqp.this.n;
      }

      @Override
      public void f() {
         dta $$0 = dqp.this.n.a_(dqp.this.o);
         this.e().a(dqp.this.o, $$0, $$0, 3);
      }

      @Override
      public eww g() {
         return eww.b(dqp.this.o);
      }

      @Override
      public et i() {
         ji $$0 = dqp.this.n().c(dhf.b);
         return new et(this, eww.b(dqp.this.o), new ewv(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dqp.this.o();
      }
   };

   public dqp(jd $$0, dta $$1) {
      super(dqh.w, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
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

   public dbv b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dqp.a.a) {
         this.v();
      }
   }

   public void f() {
      dqp.a $$0 = this.l();
      if ($$0 == dqp.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dfw $$0 = this.n().b();
      if ($$0 instanceof dhf) {
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
         jd $$0 = this.o.a(this.n.a_(this.o).c(dhf.b).g());
         if (this.n.a_($$0).b() instanceof dhf) {
            dqf $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dqp && ((dqp)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dqp.a l() {
      dta $$0 = this.n();
      if ($$0.a(dfy.fN)) {
         return dqp.a.c;
      } else if ($$0.a(dfy.kG)) {
         return dqp.a.b;
      } else {
         return $$0.a(dfy.kH) ? dqp.a.a : dqp.a.c;
      }
   }

   public boolean u() {
      dta $$0 = this.n.a_(this.az_());
      return $$0.b() instanceof dhf ? $$0.c(dhf.c) : false;
   }

   @Override
   protected void a(dqf.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kq.g));
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.d.o());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
