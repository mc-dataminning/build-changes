public class dfs extends dfi {
   private boolean a;
   private boolean b;
   private boolean c;
   private final crg d = new crg() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dfs.this.e();
      }

      @Override
      public ami e() {
         return (ami)dfs.this.o;
      }

      @Override
      public void f() {
         dhn $$0 = dfs.this.o.a_(dfs.this.p);
         this.e().a(dfs.this.p, $$0, $$0, 3);
      }

      @Override
      public ejz g() {
         return ejz.b(dfs.this.p);
      }

      @Override
      public du i() {
         ib $$0 = dfs.this.r().c(cwo.b);
         return new du(this, ejz.b(dfs.this.p), new ejy(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !dfs.this.s();
      }
   };

   public dfs(hx $$0, dhn $$1) {
      super(dfk.w, $$0, $$1);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.k());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.d.b($$0);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean u() {
      return true;
   }

   public crg c() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public boolean f() {
      return this.b;
   }

   public void b(boolean $$0) {
      boolean $$1 = this.b;
      this.b = $$0;
      if (!$$1 && $$0 && !this.a && this.o != null && this.m() != dfs.a.a) {
         this.x();
      }
   }

   public void g() {
      dfs.a $$0 = this.m();
      if ($$0 == dfs.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cvf $$0 = this.r().b();
      if ($$0 instanceof cwo) {
         this.l();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean k() {
      return this.c;
   }

   public boolean l() {
      this.c = true;
      if (this.w()) {
         hx $$0 = this.p.a(this.o.a_(this.p).c(cwo.b).g());
         if (this.o.a_($$0).b() instanceof cwo) {
            dfi $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dfs && ((dfs)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dfs.a m() {
      dhn $$0 = this.r();
      if ($$0.a(cvh.fN)) {
         return dfs.a.c;
      } else if ($$0.a(cvh.kG)) {
         return dfs.a.b;
      } else {
         return $$0.a(cvh.kH) ? dfs.a.a : dfs.a.c;
      }
   }

   public boolean w() {
      dhn $$0 = this.o.a_(this.aC_());
      return $$0.b() instanceof cwo ? $$0.c(cwo.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
