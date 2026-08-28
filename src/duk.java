public class duk extends dua {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dfj d = new dfj() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         duk.this.e();
      }

      @Override
      public ard e() {
         return (ard)duk.this.n;
      }

      @Override
      public void f() {
         dwy $$0 = duk.this.n.a_(duk.this.o);
         this.e().a(duk.this.o, $$0, $$0, 3);
      }

      @Override
      public fbb g() {
         return fbb.b(duk.this.o);
      }

      @Override
      public ex i() {
         jn $$0 = duk.this.m().c(dkw.b);
         return new ex(this, fbb.b(duk.this.o), new fba(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !duk.this.n();
      }
   };

   public duk(ji $$0, dwy $$1) {
      super(duc.x, $$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   public dfj b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != duk.a.a) {
         this.u();
      }
   }

   public void f() {
      duk.a $$0 = this.s();
      if ($$0 == duk.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      djn $$0 = this.m().b();
      if ($$0 instanceof dkw) {
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
         ji $$0 = this.o.a(this.n.a_(this.o).c(dkw.b).g());
         if (this.n.a_($$0).b() instanceof dkw) {
            dua $$1 = this.n.c_($$0);
            this.c = $$1 instanceof duk && ((duk)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public duk.a s() {
      dwy $$0 = this.m();
      if ($$0.a(djp.gi)) {
         return duk.a.c;
      } else if ($$0.a(djp.li)) {
         return duk.a.b;
      } else {
         return $$0.a(djp.lj) ? duk.a.a : duk.a.c;
      }
   }

   public boolean t() {
      dwy $$0 = this.n.a_(this.aA_());
      return $$0.b() instanceof dkw ? $$0.c(dkw.c) : false;
   }

   @Override
   protected void a(dua.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kv.g));
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.g, this.d.o());
   }

   @Override
   public void a(tq $$0) {
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
