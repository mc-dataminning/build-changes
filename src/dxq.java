public class dxq extends dxf {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dib d = new dib() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dxq.this.e();
      }

      @Override
      public arq e() {
         return (arq)dxq.this.n;
      }

      @Override
      public void f() {
         eah $$0 = dxq.this.n.a_(dxq.this.o);
         this.e().a(dxq.this.o, $$0, $$0, 3);
      }

      @Override
      public feq g() {
         return feq.b(dxq.this.o);
      }

      @Override
      public ei i() {
         ja $$0 = dxq.this.m().c(dnp.b);
         return new ei(this, feq.b(dxq.this.o), new fep(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dxq.this.n();
      }
   };

   public dxq(iu $$0, eah $$1) {
      super(dxh.x, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   public dib a() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != dxq.a.a) {
         this.u();
      }
   }

   public void f() {
      dxq.a $$0 = this.s();
      if ($$0 == dxq.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dmf $$0 = this.m().b();
      if ($$0 instanceof dnp) {
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
         iu $$0 = this.o.a(this.n.a_(this.o).c(dnp.b).g());
         if (this.n.a_($$0).b() instanceof dnp) {
            dxf $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dxq && ((dxq)$$1).a().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dxq.a s() {
      eah $$0 = this.m();
      if ($$0.a(dmh.gm)) {
         return dxq.a.c;
      } else if ($$0.a(dmh.lm)) {
         return dxq.a.b;
      } else {
         return $$0.a(dmh.ln) ? dxq.a.a : dxq.a.c;
      }
   }

   public boolean t() {
      eah $$0 = this.n.a_(this.ax_());
      return $$0.b() instanceof dnp ? $$0.c(dnp.c) : false;
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.d.b($$0.a(kj.g));
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.g, this.d.o());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("CustomName");
      $$0.r("conditionMet");
      $$0.r("powered");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
