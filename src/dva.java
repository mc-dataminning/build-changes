public class dva extends duq {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dfz d = new dfz() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dva.this.e();
      }

      @Override
      public arx e() {
         return (arx)dva.this.o;
      }

      @Override
      public void f() {
         dxo $$0 = dva.this.o.a_(dva.this.p);
         this.e().a(dva.this.p, $$0, $$0, 3);
      }

      @Override
      public fbr g() {
         return fbr.b(dva.this.p);
      }

      @Override
      public ew i() {
         jm $$0 = dva.this.m().c(dlm.b);
         return new ew(this, fbr.b(dva.this.p), new fbq(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dva.this.n();
      }
   };

   public dva(jh $$0, dxo $$1) {
      super(dus.x, $$0, $$1);
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   public dfz b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.s() != dva.a.a) {
         this.u();
      }
   }

   public void f() {
      dva.a $$0 = this.s();
      if ($$0 == dva.a.b && (this.a || this.b) && this.o != null) {
         this.u();
      }
   }

   private void u() {
      dkd $$0 = this.m().b();
      if ($$0 instanceof dlm) {
         this.k();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.t()) {
         jh $$0 = this.p.a(this.o.a_(this.p).c(dlm.b).g());
         if (this.o.a_($$0).b() instanceof dlm) {
            duq $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dva && ((dva)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dva.a s() {
      dxo $$0 = this.m();
      if ($$0.a(dkf.gi)) {
         return dva.a.c;
      } else if ($$0.a(dkf.li)) {
         return dva.a.b;
      } else {
         return $$0.a(dkf.lj) ? dva.a.a : dva.a.c;
      }
   }

   public boolean t() {
      dxo $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof dlm ? $$0.c(dlm.c) : false;
   }

   @Override
   protected void a(duq.b $$0) {
      super.a($$0);
      this.d.b($$0.a(ku.g));
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.d.o());
   }

   @Override
   public void a(um $$0) {
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
