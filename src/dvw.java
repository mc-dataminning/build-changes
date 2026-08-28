public class dvw extends dvl {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dgq d = new dgq() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dvw.this.e();
      }

      @Override
      public arn e() {
         return (arn)dvw.this.n;
      }

      @Override
      public void f() {
         dym $$0 = dvw.this.n.a_(dvw.this.o);
         this.e().a(dvw.this.o, $$0, $$0, 3);
      }

      @Override
      public fcu g() {
         return fcu.b(dvw.this.o);
      }

      @Override
      public ex i() {
         jo $$0 = dvw.this.m().c(dmd.b);
         return new ex(this, fcu.b(dvw.this.o), new fct(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dvw.this.n();
      }
   };

   public dvw(jj $$0, dym $$1) {
      super(dvn.x, $$0, $$1);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   public dgq a() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != dvw.a.a) {
         this.u();
      }
   }

   public void f() {
      dvw.a $$0 = this.s();
      if ($$0 == dvw.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dku $$0 = this.m().b();
      if ($$0 instanceof dmd) {
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
         jj $$0 = this.o.a(this.n.a_(this.o).c(dmd.b).g());
         if (this.n.a_($$0).b() instanceof dmd) {
            dvl $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dvw && ((dvw)$$1).a().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dvw.a s() {
      dym $$0 = this.m();
      if ($$0.a(dkw.gi)) {
         return dvw.a.c;
      } else if ($$0.a(dkw.li)) {
         return dvw.a.b;
      } else {
         return $$0.a(dkw.lj) ? dvw.a.a : dvw.a.c;
      }
   }

   public boolean t() {
      dym $$0 = this.n.a_(this.aw_());
      return $$0.b() instanceof dmd ? $$0.c(dmd.c) : false;
   }

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      this.d.b($$0.a(kx.g));
   }

   @Override
   protected void a(kt.a $$0) {
      super.a($$0);
      $$0.a(kx.g, this.d.o());
   }

   @Override
   public void a(tw $$0) {
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
