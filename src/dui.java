public class dui extends dty {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dfh d = new dfh() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dui.this.e();
      }

      @Override
      public ard e() {
         return (ard)dui.this.o;
      }

      @Override
      public void f() {
         dww $$0 = dui.this.o.a_(dui.this.p);
         this.e().a(dui.this.p, $$0, $$0, 3);
      }

      @Override
      public faz g() {
         return faz.b(dui.this.p);
      }

      @Override
      public ex i() {
         jn $$0 = dui.this.m().c(dku.b);
         return new ex(this, faz.b(dui.this.p), new fay(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dui.this.n();
      }
   };

   public dui(ji $$0, dww $$1) {
      super(dua.x, $$0, $$1);
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

   public dfh b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.s() != dui.a.a) {
         this.u();
      }
   }

   public void f() {
      dui.a $$0 = this.s();
      if ($$0 == dui.a.b && (this.a || this.b) && this.o != null) {
         this.u();
      }
   }

   private void u() {
      djl $$0 = this.m().b();
      if ($$0 instanceof dku) {
         this.k();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.t()) {
         ji $$0 = this.p.a(this.o.a_(this.p).c(dku.b).g());
         if (this.o.a_($$0).b() instanceof dku) {
            dty $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dui && ((dui)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dui.a s() {
      dww $$0 = this.m();
      if ($$0.a(djn.gi)) {
         return dui.a.c;
      } else if ($$0.a(djn.li)) {
         return dui.a.b;
      } else {
         return $$0.a(djn.lj) ? dui.a.a : dui.a.c;
      }
   }

   public boolean t() {
      dww $$0 = this.o.a_(this.aA_());
      return $$0.b() instanceof dku ? $$0.c(dku.c) : false;
   }

   @Override
   protected void a(dty.b $$0) {
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
