public class dsf extends drv {
   private boolean a;
   private boolean b;
   private boolean c;
   private final ddj d = new ddj() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dsf.this.e();
      }

      @Override
      public arj e() {
         return (arj)dsf.this.o;
      }

      @Override
      public void f() {
         dus $$0 = dsf.this.o.a_(dsf.this.p);
         this.e().a(dsf.this.p, $$0, $$0, 3);
      }

      @Override
      public eyw g() {
         return eyw.b(dsf.this.p);
      }

      @Override
      public eu i() {
         jk $$0 = dsf.this.m().c(div.b);
         return new eu(this, eyw.b(dsf.this.p), new eyv(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dsf.this.n();
      }
   };

   public dsf(jf $$0, dus $$1) {
      super(drx.w, $$0, $$1);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
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

   public ddj b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dsf.a.a) {
         this.v();
      }
   }

   public void f() {
      dsf.a $$0 = this.t();
      if ($$0 == dsf.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      dhm $$0 = this.m().b();
      if ($$0 instanceof div) {
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
         jf $$0 = this.p.a(this.o.a_(this.p).c(div.b).g());
         if (this.o.a_($$0).b() instanceof div) {
            drv $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dsf && ((dsf)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dsf.a t() {
      dus $$0 = this.m();
      if ($$0.a(dho.fN)) {
         return dsf.a.c;
      } else if ($$0.a(dho.kG)) {
         return dsf.a.b;
      } else {
         return $$0.a(dho.kH) ? dsf.a.a : dsf.a.c;
      }
   }

   public boolean u() {
      dus $$0 = this.o.a_(this.aC_());
      return $$0.b() instanceof div ? $$0.c(div.c) : false;
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      this.d.b($$0.a(ks.g));
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.g, this.d.o());
   }

   @Override
   public void a(ug $$0) {
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
