public class dyp extends dye {
   private static final boolean a = false;
   private static final boolean b = false;
   private static final boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean f = false;
   private final diy g = new diy() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dyp.this.e();
      }

      @Override
      public aru e() {
         return (aru)dyp.this.n;
      }

      @Override
      public void f() {
         ebg $$0 = dyp.this.n.a_(dyp.this.o);
         this.e().a(dyp.this.o, $$0, $$0, 3);
      }

      @Override
      public ffs g() {
         return ffs.b(dyp.this.o);
      }

      @Override
      public ek i() {
         jc $$0 = dyp.this.m().c(doo.b);
         return new ek(this, ffs.b(dyp.this.o), new ffr(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dyp.this.n();
      }
   };

   public dyp(iw $$0, ebg $$1) {
      super(dyg.x, $$0, $$1);
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

   public diy a() {
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
      if (!$$1 && $$0 && !this.d && this.n != null && this.s() != dyp.a.a) {
         this.u();
      }
   }

   public void f() {
      dyp.a $$0 = this.s();
      if ($$0 == dyp.a.b && (this.d || this.e) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dne $$0 = this.m().b();
      if ($$0 instanceof doo) {
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
         iw $$0 = this.o.a(this.n.a_(this.o).c(doo.b).g());
         if (this.n.a_($$0).b() instanceof doo) {
            dye $$1 = this.n.c_($$0);
            this.f = $$1 instanceof dyp && ((dyp)$$1).a().k() > 0;
         } else {
            this.f = false;
         }
      }

      return this.f;
   }

   public dyp.a s() {
      ebg $$0 = this.m();
      if ($$0.a(dng.gm)) {
         return dyp.a.c;
      } else if ($$0.a(dng.lm)) {
         return dyp.a.b;
      } else {
         return $$0.a(dng.ln) ? dyp.a.a : dyp.a.c;
      }
   }

   public boolean t() {
      ebg $$0 = this.n.a_(this.aB_());
      return $$0.b() instanceof doo ? $$0.c(doo.c) : false;
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
