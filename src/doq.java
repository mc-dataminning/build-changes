public class doq extends dog {
   private boolean a;
   private boolean b;
   private boolean c;
   private final czy d = new czy() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         doq.this.e();
      }

      @Override
      public aqm e() {
         return (aqm)doq.this.n;
      }

      @Override
      public void f() {
         drb $$0 = doq.this.n.a_(doq.this.o);
         this.e().a(doq.this.o, $$0, $$0, 3);
      }

      @Override
      public euk g() {
         return euk.b(doq.this.o);
      }

      @Override
      public ee i() {
         it $$0 = doq.this.n().c(dfh.b);
         return new ee(this, euk.b(doq.this.o), new euj(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !doq.this.o();
      }
   };

   public doq(io $$0, drb $$1) {
      super(doi.w, $$0, $$1);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
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

   public czy b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != doq.a.a) {
         this.v();
      }
   }

   public void f() {
      doq.a $$0 = this.l();
      if ($$0 == doq.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      ddy $$0 = this.n().b();
      if ($$0 instanceof dfh) {
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
         io $$0 = this.o.a(this.n.a_(this.o).c(dfh.b).g());
         if (this.n.a_($$0).b() instanceof dfh) {
            dog $$1 = this.n.c_($$0);
            this.c = $$1 instanceof doq && ((doq)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public doq.a l() {
      drb $$0 = this.n();
      if ($$0.a(dea.fN)) {
         return doq.a.c;
      } else if ($$0.a(dea.kG)) {
         return doq.a.b;
      } else {
         return $$0.a(dea.kH) ? doq.a.a : doq.a.c;
      }
   }

   public boolean u() {
      drb $$0 = this.n.a_(this.az_());
      return $$0.b() instanceof dfh ? $$0.c(dfh.c) : false;
   }

   @Override
   protected void a(dog.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kb.f));
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.f, this.d.o());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
