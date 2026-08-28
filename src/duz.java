public class duz extends dup {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dga d = new dga() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         duz.this.e();
      }

      @Override
      public ash e() {
         return (ash)duz.this.o;
      }

      @Override
      public void f() {
         dxn $$0 = duz.this.o.a_(duz.this.p);
         this.e().a(duz.this.p, $$0, $$0, 3);
      }

      @Override
      public fbs g() {
         return fbs.b(duz.this.p);
      }

      @Override
      public ew i() {
         jm $$0 = duz.this.m().c(dlo.b);
         return new ew(this, fbs.b(duz.this.p), new fbr(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !duz.this.n();
      }
   };

   public duz(jh $$0, dxn $$1) {
      super(dur.x, $$0, $$1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean p() {
      return true;
   }

   public dga b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != duz.a.a) {
         this.v();
      }
   }

   public void f() {
      duz.a $$0 = this.t();
      if ($$0 == duz.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      dke $$0 = this.m().b();
      if ($$0 instanceof dlo) {
         this.k();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.u()) {
         jh $$0 = this.p.a(this.o.a_(this.p).c(dlo.b).g());
         if (this.o.a_($$0).b() instanceof dlo) {
            dup $$1 = this.o.c_($$0);
            this.c = $$1 instanceof duz && ((duz)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public duz.a t() {
      dxn $$0 = this.m();
      if ($$0.a(dkg.gb)) {
         return duz.a.c;
      } else if ($$0.a(dkg.lb)) {
         return duz.a.b;
      } else {
         return $$0.a(dkg.lc) ? duz.a.a : duz.a.c;
      }
   }

   public boolean u() {
      dxn $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof dlo ? $$0.c(dlo.c) : false;
   }

   @Override
   protected void a(dup.b $$0) {
      super.a($$0);
      this.d.b($$0.a(ku.g));
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.d.o());
   }

   @Override
   public void a(ux $$0) {
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
