public class duh extends dtx {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dfg d = new dfg() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         duh.this.e();
      }

      @Override
      public arc e() {
         return (arc)duh.this.o;
      }

      @Override
      public void f() {
         dwv $$0 = duh.this.o.a_(duh.this.p);
         this.e().a(duh.this.p, $$0, $$0, 3);
      }

      @Override
      public fay g() {
         return fay.b(duh.this.p);
      }

      @Override
      public ex i() {
         jn $$0 = duh.this.m().c(dkt.b);
         return new ex(this, fay.b(duh.this.p), new fax(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !duh.this.n();
      }
   };

   public duh(ji $$0, dwv $$1) {
      super(dtz.x, $$0, $$1);
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

   public dfg b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.s() != duh.a.a) {
         this.u();
      }
   }

   public void f() {
      duh.a $$0 = this.s();
      if ($$0 == duh.a.b && (this.a || this.b) && this.o != null) {
         this.u();
      }
   }

   private void u() {
      djk $$0 = this.m().b();
      if ($$0 instanceof dkt) {
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
         ji $$0 = this.p.a(this.o.a_(this.p).c(dkt.b).g());
         if (this.o.a_($$0).b() instanceof dkt) {
            dtx $$1 = this.o.c_($$0);
            this.c = $$1 instanceof duh && ((duh)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public duh.a s() {
      dwv $$0 = this.m();
      if ($$0.a(djm.gi)) {
         return duh.a.c;
      } else if ($$0.a(djm.li)) {
         return duh.a.b;
      } else {
         return $$0.a(djm.lj) ? duh.a.a : duh.a.c;
      }
   }

   public boolean t() {
      dwv $$0 = this.o.a_(this.aA_());
      return $$0.b() instanceof dkt ? $$0.c(dkt.c) : false;
   }

   @Override
   protected void a(dtx.b $$0) {
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
