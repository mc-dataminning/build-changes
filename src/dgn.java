public class dgn extends dgd {
   private boolean a;
   private boolean b;
   private boolean c;
   private final crz d = new crz() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dgn.this.e();
      }

      @Override
      public amp e() {
         return (amp)dgn.this.o;
      }

      @Override
      public void f() {
         dip $$0 = dgn.this.o.a_(dgn.this.p);
         this.e().a(dgn.this.p, $$0, $$0, 3);
      }

      @Override
      public elb g() {
         return elb.b(dgn.this.p);
      }

      @Override
      public ds i() {
         ia $$0 = dgn.this.r().c(cxi.b);
         return new ds(this, elb.b(dgn.this.p), new ela(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !dgn.this.s();
      }
   };

   public dgn(hv $$0, dip $$1) {
      super(dgf.w, $$0, $$1);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.k());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(sj $$0) {
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

   public crz c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.m() != dgn.a.a) {
         this.x();
      }
   }

   public void g() {
      dgn.a $$0 = this.m();
      if ($$0 == dgn.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cvz $$0 = this.r().b();
      if ($$0 instanceof cxi) {
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
         hv $$0 = this.p.a(this.o.a_(this.p).c(cxi.b).g());
         if (this.o.a_($$0).b() instanceof cxi) {
            dgd $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dgn && ((dgn)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dgn.a m() {
      dip $$0 = this.r();
      if ($$0.a(cwb.fN)) {
         return dgn.a.c;
      } else if ($$0.a(cwb.kG)) {
         return dgn.a.b;
      } else {
         return $$0.a(cwb.kH) ? dgn.a.a : dgn.a.c;
      }
   }

   public boolean w() {
      dip $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof cxi ? $$0.c(cxi.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
