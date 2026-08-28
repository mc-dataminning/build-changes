public class dpx extends dpn {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dbe d = new dbe() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dpx.this.e();
      }

      @Override
      public aqk e() {
         return (aqk)dpx.this.n;
      }

      @Override
      public void f() {
         dsh $$0 = dpx.this.n.a_(dpx.this.o);
         this.e().a(dpx.this.o, $$0, $$0, 3);
      }

      @Override
      public evz g() {
         return evz.b(dpx.this.o);
      }

      @Override
      public eq i() {
         jf $$0 = dpx.this.n().c(dgo.b);
         return new eq(this, evz.b(dpx.this.o), new evy(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dpx.this.o();
      }
   };

   public dpx(ja $$0, dsh $$1) {
      super(dpp.w, $$0, $$1);
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

   public dbe b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dpx.a.a) {
         this.v();
      }
   }

   public void f() {
      dpx.a $$0 = this.l();
      if ($$0 == dpx.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dff $$0 = this.n().b();
      if ($$0 instanceof dgo) {
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
         ja $$0 = this.o.a(this.n.a_(this.o).c(dgo.b).g());
         if (this.n.a_($$0).b() instanceof dgo) {
            dpn $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dpx && ((dpx)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dpx.a l() {
      dsh $$0 = this.n();
      if ($$0.a(dfh.fN)) {
         return dpx.a.c;
      } else if ($$0.a(dfh.kG)) {
         return dpx.a.b;
      } else {
         return $$0.a(dfh.kH) ? dpx.a.a : dpx.a.c;
      }
   }

   public boolean u() {
      dsh $$0 = this.n.a_(this.az_());
      return $$0.b() instanceof dgo ? $$0.c(dgo.c) : false;
   }

   @Override
   protected void a(dpn.b $$0) {
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
