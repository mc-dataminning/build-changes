public class dpm extends dpc {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dau d = new dau() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dpm.this.e();
      }

      @Override
      public arb e() {
         return (arb)dpm.this.n;
      }

      @Override
      public void f() {
         drx $$0 = dpm.this.n.a_(dpm.this.o);
         this.e().a(dpm.this.o, $$0, $$0, 3);
      }

      @Override
      public evm g() {
         return evm.b(dpm.this.o);
      }

      @Override
      public ep i() {
         je $$0 = dpm.this.n().c(dgd.b);
         return new ep(this, evm.b(dpm.this.o), new evl(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dpm.this.o();
      }
   };

   public dpm(iz $$0, drx $$1) {
      super(dpe.w, $$0, $$1);
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

   public dau b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dpm.a.a) {
         this.v();
      }
   }

   public void f() {
      dpm.a $$0 = this.l();
      if ($$0 == dpm.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      deu $$0 = this.n().b();
      if ($$0 instanceof dgd) {
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
         iz $$0 = this.o.a(this.n.a_(this.o).c(dgd.b).g());
         if (this.n.a_($$0).b() instanceof dgd) {
            dpc $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dpm && ((dpm)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dpm.a l() {
      drx $$0 = this.n();
      if ($$0.a(dew.fN)) {
         return dpm.a.c;
      } else if ($$0.a(dew.kG)) {
         return dpm.a.b;
      } else {
         return $$0.a(dew.kH) ? dpm.a.a : dpm.a.c;
      }
   }

   public boolean u() {
      drx $$0 = this.n.a_(this.aA_());
      return $$0.b() instanceof dgd ? $$0.c(dgd.c) : false;
   }

   @Override
   protected void a(dpc.b $$0) {
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
