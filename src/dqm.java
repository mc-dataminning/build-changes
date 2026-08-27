public class dqm extends dqc {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dbb d = new dbb() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dqm.this.e();
      }

      @Override
      public aqt e() {
         return (aqt)dqm.this.n;
      }

      @Override
      public void f() {
         dtc $$0 = dqm.this.n.a_(dqm.this.o);
         this.e().a(dqm.this.o, $$0, $$0, 3);
      }

      @Override
      public ewu g() {
         return ewu.b(dqm.this.o);
      }

      @Override
      public eh i() {
         iw $$0 = dqm.this.n().c(dgl.b);
         return new eh(this, ewu.b(dqm.this.o), new ewt(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dqm.this.o();
      }
   };

   public dqm(ir $$0, dtc $$1) {
      super(dqe.x, $$0, $$1);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dqm.a.a) {
         this.u();
      }
   }

   public void f() {
      dqm.a $$0 = this.l();
      if ($$0 == dqm.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dfc $$0 = this.n().b();
      if ($$0 instanceof dgl) {
         this.k();
         this.n.a(this.o, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.t()) {
         ir $$0 = this.o.a(this.n.a_(this.o).c(dgl.b).g());
         if (this.n.a_($$0).b() instanceof dgl) {
            dqc $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dqm && ((dqm)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dqm.a l() {
      dtc $$0 = this.n();
      if ($$0.a(dfe.gG)) {
         return dqm.a.c;
      } else if ($$0.a(dfe.lE)) {
         return dqm.a.b;
      } else {
         return $$0.a(dfe.lF) ? dqm.a.a : dqm.a.c;
      }
   }

   public boolean t() {
      dtc $$0 = this.n.a_(this.az_());
      return $$0.b() instanceof dgl ? $$0.c(dgl.c) : false;
   }

   @Override
   public void a(ka $$0) {
      this.d.b($$0.a(ke.f));
   }

   @Override
   public void a(ka.a $$0) {
      super.a($$0);
      $$0.a(ke.f, this.d.o());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
