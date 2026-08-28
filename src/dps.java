public class dps extends dpi {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dba d = new dba() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dps.this.e();
      }

      @Override
      public arf e() {
         return (arf)dps.this.n;
      }

      @Override
      public void f() {
         dsd $$0 = dps.this.n.a_(dps.this.o);
         this.e().a(dps.this.o, $$0, $$0, 3);
      }

      @Override
      public evs g() {
         return evs.b(dps.this.o);
      }

      @Override
      public ep i() {
         je $$0 = dps.this.n().c(dgj.b);
         return new ep(this, evs.b(dps.this.o), new evr(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dps.this.o();
      }
   };

   public dps(iz $$0, dsd $$1) {
      super(dpk.w, $$0, $$1);
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

   public dba b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dps.a.a) {
         this.v();
      }
   }

   public void f() {
      dps.a $$0 = this.l();
      if ($$0 == dps.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dfa $$0 = this.n().b();
      if ($$0 instanceof dgj) {
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
         iz $$0 = this.o.a(this.n.a_(this.o).c(dgj.b).g());
         if (this.n.a_($$0).b() instanceof dgj) {
            dpi $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dps && ((dps)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dps.a l() {
      dsd $$0 = this.n();
      if ($$0.a(dfc.fN)) {
         return dps.a.c;
      } else if ($$0.a(dfc.kG)) {
         return dps.a.b;
      } else {
         return $$0.a(dfc.kH) ? dps.a.a : dps.a.c;
      }
   }

   public boolean u() {
      dsd $$0 = this.n.a_(this.ay_());
      return $$0.b() instanceof dgj ? $$0.c(dgj.c) : false;
   }

   @Override
   protected void a(dpi.b $$0) {
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
