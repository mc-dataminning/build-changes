public class dxi extends dwx {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dhw d = new dhw() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dxi.this.e();
      }

      @Override
      public arq e() {
         return (arq)dxi.this.n;
      }

      @Override
      public void f() {
         dzz $$0 = dxi.this.n.a_(dxi.this.o);
         this.e().a(dxi.this.o, $$0, $$0, 3);
      }

      @Override
      public fei g() {
         return fei.b(dxi.this.o);
      }

      @Override
      public ei i() {
         ja $$0 = dxi.this.m().c(dnj.b);
         return new ei(this, fei.b(dxi.this.o), new feh(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dxi.this.n();
      }
   };

   public dxi(iu $$0, dzz $$1) {
      super(dwz.x, $$0, $$1);
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

   public dhw a() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != dxi.a.a) {
         this.u();
      }
   }

   public void f() {
      dxi.a $$0 = this.s();
      if ($$0 == dxi.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dma $$0 = this.m().b();
      if ($$0 instanceof dnj) {
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
         iu $$0 = this.o.a(this.n.a_(this.o).c(dnj.b).g());
         if (this.n.a_($$0).b() instanceof dnj) {
            dwx $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dxi && ((dxi)$$1).a().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dxi.a s() {
      dzz $$0 = this.m();
      if ($$0.a(dmc.gj)) {
         return dxi.a.c;
      } else if ($$0.a(dmc.lj)) {
         return dxi.a.b;
      } else {
         return $$0.a(dmc.lk) ? dxi.a.a : dxi.a.c;
      }
   }

   public boolean t() {
      dzz $$0 = this.n.a_(this.aw_());
      return $$0.b() instanceof dnj ? $$0.c(dnj.c) : false;
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
