public class dyn extends dyc {
   private static final boolean a = false;
   private static final boolean b = false;
   private static final boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean f = false;
   private final diw g = new diw() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dyn.this.e();
      }

      @Override
      public ars e() {
         return (ars)dyn.this.n;
      }

      @Override
      public void f() {
         ebe $$0 = dyn.this.n.a_(dyn.this.o);
         this.e().a(dyn.this.o, $$0, $$0, 3);
      }

      @Override
      public ffq g() {
         return ffq.b(dyn.this.o);
      }

      @Override
      public ej i() {
         jb $$0 = dyn.this.m().c(dom.b);
         return new ej(this, ffq.b(dyn.this.o), new ffp(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dyn.this.n();
      }
   };

   public dyn(iv $$0, ebe $$1) {
      super(dye.x, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      this.g.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.g.b($$0, $$1);
      this.d = $$0.b("powered", false);
      this.f = $$0.b("conditionMet", false);
      this.b($$0.b("auto", false));
   }

   public diw a() {
      return this.g;
   }

   public void a(boolean $$0) {
      this.d = $$0;
   }

   public boolean c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public void b(boolean $$0) {
      boolean $$1 = this.e;
      this.e = $$0;
      if (!$$1 && $$0 && !this.d && this.n != null && this.s() != dyn.a.a) {
         this.u();
      }
   }

   public void f() {
      dyn.a $$0 = this.s();
      if ($$0 == dyn.a.b && (this.d || this.e) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dnc $$0 = this.m().b();
      if ($$0 instanceof dom) {
         this.k();
         this.n.a(this.o, $$0, 1);
      }
   }

   public boolean j() {
      return this.f;
   }

   public boolean k() {
      this.f = true;
      if (this.t()) {
         iv $$0 = this.o.a(this.n.a_(this.o).c(dom.b).g());
         if (this.n.a_($$0).b() instanceof dom) {
            dyc $$1 = this.n.c_($$0);
            this.f = $$1 instanceof dyn && ((dyn)$$1).a().k() > 0;
         } else {
            this.f = false;
         }
      }

      return this.f;
   }

   public dyn.a s() {
      ebe $$0 = this.m();
      if ($$0.a(dne.gm)) {
         return dyn.a.c;
      } else if ($$0.a(dne.lm)) {
         return dyn.a.b;
      } else {
         return $$0.a(dne.ln) ? dyn.a.a : dyn.a.c;
      }
   }

   public boolean t() {
      ebe $$0 = this.n.a_(this.aB_());
      return $$0.b() instanceof dom ? $$0.c(dom.c) : false;
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.g.b($$0.a(kk.g));
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.g, this.g.o());
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
