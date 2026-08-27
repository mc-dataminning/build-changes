public class dmp extends dmf {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cxy d = new cxy() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dmp.this.e();
      }

      @Override
      public aps e() {
         return (aps)dmp.this.o;
      }

      @Override
      public void f() {
         doz $$0 = dmp.this.o.a_(dmp.this.p);
         this.e().a(dmp.this.p, $$0, $$0, 3);
      }

      @Override
      public esa g() {
         return esa.b(dmp.this.p);
      }

      @Override
      public du i() {
         ih $$0 = dmp.this.n().c(ddh.b);
         return new du(this, esa.b(dmp.this.p), new erz(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dmp.this.o();
      }
   };

   public dmp(ib $$0, doz $$1) {
      super(dmh.w, $$0, $$1);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean q() {
      return true;
   }

   public cxy b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.l() != dmp.a.a) {
         this.u();
      }
   }

   public void f() {
      dmp.a $$0 = this.l();
      if ($$0 == dmp.a.b && (this.a || this.b) && this.o != null) {
         this.u();
      }
   }

   private void u() {
      dby $$0 = this.n().b();
      if ($$0 instanceof ddh) {
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
         ib $$0 = this.p.a(this.o.a_(this.p).c(ddh.b).g());
         if (this.o.a_($$0).b() instanceof ddh) {
            dmf $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dmp && ((dmp)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dmp.a l() {
      doz $$0 = this.n();
      if ($$0.a(dca.fN)) {
         return dmp.a.c;
      } else if ($$0.a(dca.kG)) {
         return dmp.a.b;
      } else {
         return $$0.a(dca.kH) ? dmp.a.a : dmp.a.c;
      }
   }

   public boolean t() {
      doz $$0 = this.o.a_(this.aA_());
      return $$0.b() instanceof ddh ? $$0.c(ddh.c) : false;
   }

   @Override
   public void a(jl $$0) {
      this.d.b($$0.a(jp.d));
   }

   @Override
   public void a(jl.a $$0) {
      super.a($$0);
      $$0.a(jp.d, this.d.o());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
