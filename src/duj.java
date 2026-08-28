public class duj extends dtz {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dfi d = new dfi() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         duj.this.e();
      }

      @Override
      public ard e() {
         return (ard)duj.this.n;
      }

      @Override
      public void f() {
         dwx $$0 = duj.this.n.a_(duj.this.o);
         this.e().a(duj.this.o, $$0, $$0, 3);
      }

      @Override
      public fba g() {
         return fba.b(duj.this.o);
      }

      @Override
      public ex i() {
         jn $$0 = duj.this.m().c(dkv.b);
         return new ex(this, fba.b(duj.this.o), new faz(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !duj.this.n();
      }
   };

   public duj(ji $$0, dwx $$1) {
      super(dub.x, $$0, $$1);
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

   public dfi b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != duj.a.a) {
         this.u();
      }
   }

   public void f() {
      duj.a $$0 = this.s();
      if ($$0 == duj.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      djm $$0 = this.m().b();
      if ($$0 instanceof dkv) {
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
         ji $$0 = this.o.a(this.n.a_(this.o).c(dkv.b).g());
         if (this.n.a_($$0).b() instanceof dkv) {
            dtz $$1 = this.n.c_($$0);
            this.c = $$1 instanceof duj && ((duj)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public duj.a s() {
      dwx $$0 = this.m();
      if ($$0.a(djo.gi)) {
         return duj.a.c;
      } else if ($$0.a(djo.li)) {
         return duj.a.b;
      } else {
         return $$0.a(djo.lj) ? duj.a.a : duj.a.c;
      }
   }

   public boolean t() {
      dwx $$0 = this.n.a_(this.aA_());
      return $$0.b() instanceof dkv ? $$0.c(dkv.c) : false;
   }

   @Override
   protected void a(dtz.b $$0) {
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
