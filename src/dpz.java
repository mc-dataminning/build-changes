public class dpz extends dpp {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dbg d = new dbg() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dpz.this.e();
      }

      @Override
      public aqm e() {
         return (aqm)dpz.this.n;
      }

      @Override
      public void f() {
         dsk $$0 = dpz.this.n.a_(dpz.this.o);
         this.e().a(dpz.this.o, $$0, $$0, 3);
      }

      @Override
      public ewf g() {
         return ewf.b(dpz.this.o);
      }

      @Override
      public eq i() {
         jf $$0 = dpz.this.n().c(dgq.b);
         return new eq(this, ewf.b(dpz.this.o), new ewe(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dpz.this.o();
      }
   };

   public dpz(ja $$0, dsk $$1) {
      super(dpr.w, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
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

   public dbg b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dpz.a.a) {
         this.v();
      }
   }

   public void f() {
      dpz.a $$0 = this.l();
      if ($$0 == dpz.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dfh $$0 = this.n().b();
      if ($$0 instanceof dgq) {
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
         ja $$0 = this.o.a(this.n.a_(this.o).c(dgq.b).g());
         if (this.n.a_($$0).b() instanceof dgq) {
            dpp $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dpz && ((dpz)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dpz.a l() {
      dsk $$0 = this.n();
      if ($$0.a(dfj.fN)) {
         return dpz.a.c;
      } else if ($$0.a(dfj.kG)) {
         return dpz.a.b;
      } else {
         return $$0.a(dfj.kH) ? dpz.a.a : dpz.a.c;
      }
   }

   public boolean u() {
      dsk $$0 = this.n.a_(this.az_());
      return $$0.b() instanceof dgq ? $$0.c(dgq.c) : false;
   }

   @Override
   protected void a(dpp.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kn.g));
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.g, this.d.o());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
