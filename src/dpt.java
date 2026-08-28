public class dpt extends dpj {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dbb d = new dbb() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dpt.this.e();
      }

      @Override
      public arf e() {
         return (arf)dpt.this.n;
      }

      @Override
      public void f() {
         dse $$0 = dpt.this.n.a_(dpt.this.o);
         this.e().a(dpt.this.o, $$0, $$0, 3);
      }

      @Override
      public evt g() {
         return evt.b(dpt.this.o);
      }

      @Override
      public ep i() {
         je $$0 = dpt.this.n().c(dgk.b);
         return new ep(this, evt.b(dpt.this.o), new evs(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dpt.this.o();
      }
   };

   public dpt(iz $$0, dse $$1) {
      super(dpl.w, $$0, $$1);
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

   public dbb b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dpt.a.a) {
         this.v();
      }
   }

   public void f() {
      dpt.a $$0 = this.l();
      if ($$0 == dpt.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dfb $$0 = this.n().b();
      if ($$0 instanceof dgk) {
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
         iz $$0 = this.o.a(this.n.a_(this.o).c(dgk.b).g());
         if (this.n.a_($$0).b() instanceof dgk) {
            dpj $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dpt && ((dpt)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dpt.a l() {
      dse $$0 = this.n();
      if ($$0.a(dfd.fN)) {
         return dpt.a.c;
      } else if ($$0.a(dfd.kG)) {
         return dpt.a.b;
      } else {
         return $$0.a(dfd.kH) ? dpt.a.a : dpt.a.c;
      }
   }

   public boolean u() {
      dse $$0 = this.n.a_(this.ay_());
      return $$0.b() instanceof dgk ? $$0.c(dgk.c) : false;
   }

   @Override
   protected void a(dpj.b $$0) {
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
