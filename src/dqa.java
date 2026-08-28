public class dqa extends dpq {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dbh d = new dbh() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dqa.this.e();
      }

      @Override
      public aqm e() {
         return (aqm)dqa.this.n;
      }

      @Override
      public void f() {
         dsl $$0 = dqa.this.n.a_(dqa.this.o);
         this.e().a(dqa.this.o, $$0, $$0, 3);
      }

      @Override
      public ewh g() {
         return ewh.b(dqa.this.o);
      }

      @Override
      public eq i() {
         jf $$0 = dqa.this.n().c(dgr.b);
         return new eq(this, ewh.b(dqa.this.o), new ewg(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dqa.this.o();
      }
   };

   public dqa(ja $$0, dsl $$1) {
      super(dps.w, $$0, $$1);
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

   public dbh b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dqa.a.a) {
         this.v();
      }
   }

   public void f() {
      dqa.a $$0 = this.l();
      if ($$0 == dqa.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dfi $$0 = this.n().b();
      if ($$0 instanceof dgr) {
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
         ja $$0 = this.o.a(this.n.a_(this.o).c(dgr.b).g());
         if (this.n.a_($$0).b() instanceof dgr) {
            dpq $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dqa && ((dqa)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dqa.a l() {
      dsl $$0 = this.n();
      if ($$0.a(dfk.fN)) {
         return dqa.a.c;
      } else if ($$0.a(dfk.kG)) {
         return dqa.a.b;
      } else {
         return $$0.a(dfk.kH) ? dqa.a.a : dqa.a.c;
      }
   }

   public boolean u() {
      dsl $$0 = this.n.a_(this.az_());
      return $$0.b() instanceof dgr ? $$0.c(dgr.c) : false;
   }

   @Override
   protected void a(dpq.b $$0) {
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
