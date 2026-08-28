public class dpp extends dpf {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dax d = new dax() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dpp.this.e();
      }

      @Override
      public are e() {
         return (are)dpp.this.n;
      }

      @Override
      public void f() {
         dsa $$0 = dpp.this.n.a_(dpp.this.o);
         this.e().a(dpp.this.o, $$0, $$0, 3);
      }

      @Override
      public evp g() {
         return evp.b(dpp.this.o);
      }

      @Override
      public ep i() {
         je $$0 = dpp.this.n().c(dgg.b);
         return new ep(this, evp.b(dpp.this.o), new evo(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dpp.this.o();
      }
   };

   public dpp(iz $$0, dsa $$1) {
      super(dph.w, $$0, $$1);
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
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

   public dax b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dpp.a.a) {
         this.v();
      }
   }

   public void f() {
      dpp.a $$0 = this.l();
      if ($$0 == dpp.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dex $$0 = this.n().b();
      if ($$0 instanceof dgg) {
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
         iz $$0 = this.o.a(this.n.a_(this.o).c(dgg.b).g());
         if (this.n.a_($$0).b() instanceof dgg) {
            dpf $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dpp && ((dpp)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dpp.a l() {
      dsa $$0 = this.n();
      if ($$0.a(dez.fN)) {
         return dpp.a.c;
      } else if ($$0.a(dez.kG)) {
         return dpp.a.b;
      } else {
         return $$0.a(dez.kH) ? dpp.a.a : dpp.a.c;
      }
   }

   public boolean u() {
      dsa $$0 = this.n.a_(this.az_());
      return $$0.b() instanceof dgg ? $$0.c(dgg.c) : false;
   }

   @Override
   protected void a(dpf.b $$0) {
      super.a($$0);
      this.d.b($$0.a(km.f));
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.f, this.d.o());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
