public class dxx extends dxm {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dii d = new dii() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dxx.this.e();
      }

      @Override
      public arq e() {
         return (arq)dxx.this.n;
      }

      @Override
      public void f() {
         eao $$0 = dxx.this.n.a_(dxx.this.o);
         this.e().a(dxx.this.o, $$0, $$0, 3);
      }

      @Override
      public fex g() {
         return fex.b(dxx.this.o);
      }

      @Override
      public ej i() {
         jb $$0 = dxx.this.m().c(dnw.b);
         return new ej(this, fex.b(dxx.this.o), new few(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dxx.this.n();
      }
   };

   public dxx(iv $$0, eao $$1) {
      super(dxo.x, $$0, $$1);
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

   public dii a() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != dxx.a.a) {
         this.u();
      }
   }

   public void f() {
      dxx.a $$0 = this.s();
      if ($$0 == dxx.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dmm $$0 = this.m().b();
      if ($$0 instanceof dnw) {
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
         iv $$0 = this.o.a(this.n.a_(this.o).c(dnw.b).g());
         if (this.n.a_($$0).b() instanceof dnw) {
            dxm $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dxx && ((dxx)$$1).a().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dxx.a s() {
      eao $$0 = this.m();
      if ($$0.a(dmo.gm)) {
         return dxx.a.c;
      } else if ($$0.a(dmo.lm)) {
         return dxx.a.b;
      } else {
         return $$0.a(dmo.ln) ? dxx.a.a : dxx.a.c;
      }
   }

   public boolean t() {
      eao $$0 = this.n.a_(this.ax_());
      return $$0.b() instanceof dnw ? $$0.c(dnw.c) : false;
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
