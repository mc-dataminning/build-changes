public class dyc extends dxr {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dil d = new dil() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dyc.this.e();
      }

      @Override
      public arq e() {
         return (arq)dyc.this.n;
      }

      @Override
      public void f() {
         eat $$0 = dyc.this.n.a_(dyc.this.o);
         this.e().a(dyc.this.o, $$0, $$0, 3);
      }

      @Override
      public ffc g() {
         return ffc.b(dyc.this.o);
      }

      @Override
      public ej i() {
         jb $$0 = dyc.this.m().c(dob.b);
         return new ej(this, ffc.b(dyc.this.o), new ffb(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dyc.this.n();
      }
   };

   public dyc(iv $$0, eat $$1) {
      super(dxt.x, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.o("powered");
      this.c = $$0.o("conditionMet");
      this.b($$0.o("auto"));
   }

   public dil a() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != dyc.a.a) {
         this.u();
      }
   }

   public void f() {
      dyc.a $$0 = this.s();
      if ($$0 == dyc.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dmr $$0 = this.m().b();
      if ($$0 instanceof dob) {
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
         iv $$0 = this.o.a(this.n.a_(this.o).c(dob.b).g());
         if (this.n.a_($$0).b() instanceof dob) {
            dxr $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dyc && ((dyc)$$1).a().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dyc.a s() {
      eat $$0 = this.m();
      if ($$0.a(dmt.gm)) {
         return dyc.a.c;
      } else if ($$0.a(dmt.lm)) {
         return dyc.a.b;
      } else {
         return $$0.a(dmt.ln) ? dyc.a.a : dyc.a.c;
      }
   }

   public boolean t() {
      eat $$0 = this.n.a_(this.ax_());
      return $$0.b() instanceof dob ? $$0.c(dob.c) : false;
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.d.b($$0.a(kk.g));
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.g, this.d.o());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.p("CustomName");
      $$0.p("conditionMet");
      $$0.p("powered");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
