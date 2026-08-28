public class dtb extends dsr {
   private boolean a;
   private boolean b;
   private boolean c;
   private final def d = new def() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dtb.this.e();
      }

      @Override
      public arq e() {
         return (arq)dtb.this.o;
      }

      @Override
      public void f() {
         dvo $$0 = dtb.this.o.a_(dtb.this.p);
         this.e().a(dtb.this.p, $$0, $$0, 3);
      }

      @Override
      public ezr g() {
         return ezr.b(dtb.this.p);
      }

      @Override
      public ew i() {
         jm $$0 = dtb.this.m().c(djs.b);
         return new ew(this, ezr.b(dtb.this.p), new ezq(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dtb.this.n();
      }
   };

   public dtb(jh $$0, dvo $$1) {
      super(dst.w, $$0, $$1);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(un $$0, js.a $$1) {
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

   public def b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dtb.a.a) {
         this.v();
      }
   }

   public void f() {
      dtb.a $$0 = this.t();
      if ($$0 == dtb.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      dij $$0 = this.m().b();
      if ($$0 instanceof djs) {
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
         jh $$0 = this.p.a(this.o.a_(this.p).c(djs.b).g());
         if (this.o.a_($$0).b() instanceof djs) {
            dsr $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dtb && ((dtb)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dtb.a t() {
      dvo $$0 = this.m();
      if ($$0.a(dil.fN)) {
         return dtb.a.c;
      } else if ($$0.a(dil.kG)) {
         return dtb.a.b;
      } else {
         return $$0.a(dil.kH) ? dtb.a.a : dtb.a.c;
      }
   }

   public boolean u() {
      dvo $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof djs ? $$0.c(djs.c) : false;
   }

   @Override
   protected void a(dsr.b $$0) {
      super.a($$0);
      this.d.b($$0.a(ku.g));
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.d.o());
   }

   @Override
   public void a(un $$0) {
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
