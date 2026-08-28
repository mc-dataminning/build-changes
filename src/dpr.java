public class dpr extends dph {
   private boolean a;
   private boolean b;
   private boolean c;
   private final daz d = new daz() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dpr.this.e();
      }

      @Override
      public arf e() {
         return (arf)dpr.this.n;
      }

      @Override
      public void f() {
         dsc $$0 = dpr.this.n.a_(dpr.this.o);
         this.e().a(dpr.this.o, $$0, $$0, 3);
      }

      @Override
      public evr g() {
         return evr.b(dpr.this.o);
      }

      @Override
      public ep i() {
         je $$0 = dpr.this.n().c(dgi.b);
         return new ep(this, evr.b(dpr.this.o), new evq(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dpr.this.o();
      }
   };

   public dpr(iz $$0, dsc $$1) {
      super(dpj.w, $$0, $$1);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
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

   public daz b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dpr.a.a) {
         this.v();
      }
   }

   public void f() {
      dpr.a $$0 = this.l();
      if ($$0 == dpr.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dez $$0 = this.n().b();
      if ($$0 instanceof dgi) {
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
         iz $$0 = this.o.a(this.n.a_(this.o).c(dgi.b).g());
         if (this.n.a_($$0).b() instanceof dgi) {
            dph $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dpr && ((dpr)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dpr.a l() {
      dsc $$0 = this.n();
      if ($$0.a(dfb.fN)) {
         return dpr.a.c;
      } else if ($$0.a(dfb.kG)) {
         return dpr.a.b;
      } else {
         return $$0.a(dfb.kH) ? dpr.a.a : dpr.a.c;
      }
   }

   public boolean u() {
      dsc $$0 = this.n.a_(this.ay_());
      return $$0.b() instanceof dgi ? $$0.c(dgi.c) : false;
   }

   @Override
   protected void a(dph.b $$0) {
      super.a($$0);
      this.d.b($$0.a(km.g));
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.g, this.d.o());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
