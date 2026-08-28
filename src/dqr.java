public class dqr extends dqh {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dbx d = new dbx() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dqr.this.e();
      }

      @Override
      public aqu e() {
         return (aqu)dqr.this.n;
      }

      @Override
      public void f() {
         dtc $$0 = dqr.this.n.a_(dqr.this.o);
         this.e().a(dqr.this.o, $$0, $$0, 3);
      }

      @Override
      public exa g() {
         return exa.b(dqr.this.o);
      }

      @Override
      public et i() {
         ji $$0 = dqr.this.n().c(dhh.b);
         return new et(this, exa.b(dqr.this.o), new ewz(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dqr.this.o();
      }
   };

   public dqr(jd $$0, dtc $$1) {
      super(dqj.w, $$0, $$1);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
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

   public dbx b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dqr.a.a) {
         this.v();
      }
   }

   public void f() {
      dqr.a $$0 = this.l();
      if ($$0 == dqr.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dfy $$0 = this.n().b();
      if ($$0 instanceof dhh) {
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
         jd $$0 = this.o.a(this.n.a_(this.o).c(dhh.b).g());
         if (this.n.a_($$0).b() instanceof dhh) {
            dqh $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dqr && ((dqr)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dqr.a l() {
      dtc $$0 = this.n();
      if ($$0.a(dga.fN)) {
         return dqr.a.c;
      } else if ($$0.a(dga.kG)) {
         return dqr.a.b;
      } else {
         return $$0.a(dga.kH) ? dqr.a.a : dqr.a.c;
      }
   }

   public boolean u() {
      dtc $$0 = this.n.a_(this.aD_());
      return $$0.b() instanceof dhh ? $$0.c(dhh.c) : false;
   }

   @Override
   protected void a(dqh.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kq.g));
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.d.o());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
