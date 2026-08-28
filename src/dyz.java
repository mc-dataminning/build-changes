public class dyz extends dyo {
   private static final boolean a = false;
   private static final boolean b = false;
   private static final boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean f = false;
   private final dji g = new dji() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dyz.this.e();
      }

      @Override
      public asb e() {
         return (asb)dyz.this.n;
      }

      @Override
      public void f() {
         ebq $$0 = dyz.this.n.a_(dyz.this.o);
         this.e().a(dyz.this.o, $$0, $$0, 3);
      }

      @Override
      public fgc g() {
         return fgc.b(dyz.this.o);
      }

      @Override
      public ek i() {
         jc $$0 = dyz.this.m().c(doy.b);
         return new ek(this, fgc.b(dyz.this.o), new fgb(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dyz.this.n();
      }
   };

   public dyz(iw $$0, ebq $$1) {
      super(dyq.x, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      this.g.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.g.b($$0, $$1);
      this.d = $$0.b("powered", false);
      this.f = $$0.b("conditionMet", false);
      this.b($$0.b("auto", false));
   }

   public dji a() {
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
      if (!$$1 && $$0 && !this.d && this.n != null && this.s() != dyz.a.a) {
         this.u();
      }
   }

   public void f() {
      dyz.a $$0 = this.s();
      if ($$0 == dyz.a.b && (this.d || this.e) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dno $$0 = this.m().b();
      if ($$0 instanceof doy) {
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
         iw $$0 = this.o.a(this.n.a_(this.o).c(doy.b).g());
         if (this.n.a_($$0).b() instanceof doy) {
            dyo $$1 = this.n.c_($$0);
            this.f = $$1 instanceof dyz && ((dyz)$$1).a().k() > 0;
         } else {
            this.f = false;
         }
      }

      return this.f;
   }

   public dyz.a s() {
      ebq $$0 = this.m();
      if ($$0.a(dnq.gm)) {
         return dyz.a.c;
      } else if ($$0.a(dnq.lm)) {
         return dyz.a.b;
      } else {
         return $$0.a(dnq.ln) ? dyz.a.a : dyz.a.c;
      }
   }

   public boolean t() {
      ebq $$0 = this.n.a_(this.ax_());
      return $$0.b() instanceof doy ? $$0.c(doy.c) : false;
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.g.b($$0.a(kl.g));
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.g, this.g.o());
   }

   @Override
   public void a(ua $$0) {
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
