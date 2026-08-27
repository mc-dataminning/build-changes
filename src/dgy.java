public class dgy extends dgo {
   private boolean a;
   private boolean b;
   private boolean c;
   private final csj d = new csj() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dgy.this.e();
      }

      @Override
      public amz e() {
         return (amz)dgy.this.o;
      }

      @Override
      public void f() {
         dja $$0 = dgy.this.o.a_(dgy.this.p);
         this.e().a(dgy.this.p, $$0, $$0, 3);
      }

      @Override
      public elm g() {
         return elm.b(dgy.this.p);
      }

      @Override
      public ds i() {
         ic $$0 = dgy.this.r().c(cxs.b);
         return new ds(this, elm.b(dgy.this.p), new ell(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dgy.this.s();
      }
   };

   public dgy(hx $$0, dja $$1) {
      super(dgq.w, $$0, $$1);
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.k());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(sl $$0) {
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

   public csj c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.m() != dgy.a.a) {
         this.x();
      }
   }

   public void g() {
      dgy.a $$0 = this.m();
      if ($$0 == dgy.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cwj $$0 = this.r().b();
      if ($$0 instanceof cxs) {
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
         hx $$0 = this.p.a(this.o.a_(this.p).c(cxs.b).g());
         if (this.o.a_($$0).b() instanceof cxs) {
            dgo $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dgy && ((dgy)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dgy.a m() {
      dja $$0 = this.r();
      if ($$0.a(cwl.fN)) {
         return dgy.a.c;
      } else if ($$0.a(cwl.kG)) {
         return dgy.a.b;
      } else {
         return $$0.a(cwl.kH) ? dgy.a.a : dgy.a.c;
      }
   }

   public boolean w() {
      dja $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof cxs ? $$0.c(cxs.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
