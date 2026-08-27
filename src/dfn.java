public class dfn extends dfd {
   private boolean a;
   private boolean b;
   private boolean c;
   private final crb d = new crb() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dfn.this.e();
      }

      @Override
      public ame e() {
         return (ame)dfn.this.o;
      }

      @Override
      public void f() {
         dhi $$0 = dfn.this.o.a_(dfn.this.p);
         this.e().a(dfn.this.p, $$0, $$0, 3);
      }

      @Override
      public eju g() {
         return eju.b(dfn.this.p);
      }

      @Override
      public du i() {
         hx $$0 = dfn.this.q().c(cwj.b);
         return new du(this, eju.b(dfn.this.p), new ejt(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !dfn.this.r();
      }
   };

   public dfn(ht $$0, dhi $$1) {
      super(dff.w, $$0, $$1);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.d.b($$0);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean t() {
      return true;
   }

   public crb c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != dfn.a.a) {
         this.x();
      }
   }

   public void g() {
      dfn.a $$0 = this.v();
      if ($$0 == dfn.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cva $$0 = this.q().b();
      if ($$0 instanceof cwj) {
         this.j();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean i() {
      return this.c;
   }

   public boolean j() {
      this.c = true;
      if (this.w()) {
         ht $$0 = this.p.a(this.o.a_(this.p).c(cwj.b).g());
         if (this.o.a_($$0).b() instanceof cwj) {
            dfd $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dfn && ((dfn)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dfn.a v() {
      dhi $$0 = this.q();
      if ($$0.a(cvc.fN)) {
         return dfn.a.c;
      } else if ($$0.a(cvc.kG)) {
         return dfn.a.b;
      } else {
         return $$0.a(cvc.kH) ? dfn.a.a : dfn.a.c;
      }
   }

   public boolean w() {
      dhi $$0 = this.o.a_(this.p());
      return $$0.b() instanceof cwj ? $$0.c(cwj.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
