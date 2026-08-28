public class dsw extends dsm {
   private boolean a;
   private boolean b;
   private boolean c;
   private final deb d = new deb() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dsw.this.e();
      }

      @Override
      public arn e() {
         return (arn)dsw.this.o;
      }

      @Override
      public void f() {
         dvj $$0 = dsw.this.o.a_(dsw.this.p);
         this.e().a(dsw.this.p, $$0, $$0, 3);
      }

      @Override
      public ezn g() {
         return ezn.b(dsw.this.p);
      }

      @Override
      public ew i() {
         jm $$0 = dsw.this.m().c(djn.b);
         return new ew(this, ezn.b(dsw.this.p), new ezm(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dsw.this.n();
      }
   };

   public dsw(jh $$0, dvj $$1) {
      super(dso.w, $$0, $$1);
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
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

   public deb b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dsw.a.a) {
         this.v();
      }
   }

   public void f() {
      dsw.a $$0 = this.t();
      if ($$0 == dsw.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      die $$0 = this.m().b();
      if ($$0 instanceof djn) {
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
         jh $$0 = this.p.a(this.o.a_(this.p).c(djn.b).g());
         if (this.o.a_($$0).b() instanceof djn) {
            dsm $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dsw && ((dsw)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dsw.a t() {
      dvj $$0 = this.m();
      if ($$0.a(dig.fN)) {
         return dsw.a.c;
      } else if ($$0.a(dig.kG)) {
         return dsw.a.b;
      } else {
         return $$0.a(dig.kH) ? dsw.a.a : dsw.a.c;
      }
   }

   public boolean u() {
      dvj $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof djn ? $$0.c(djn.c) : false;
   }

   @Override
   protected void a(dsm.b $$0) {
      super.a($$0);
      this.d.b($$0.a(ku.g));
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.d.o());
   }

   @Override
   public void a(uk $$0) {
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
