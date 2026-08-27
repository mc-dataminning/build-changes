public class dfb extends der {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cqt d = new cqt() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dfb.this.e();
      }

      @Override
      public ama e() {
         return (ama)dfb.this.o;
      }

      @Override
      public void f() {
         dgw $$0 = dfb.this.o.a_(dfb.this.p);
         this.e().a(dfb.this.p, $$0, $$0, 3);
      }

      @Override
      public eji g() {
         return eji.b(dfb.this.p);
      }

      @Override
      public du i() {
         hx $$0 = dfb.this.q().c(cwc.b);
         return new du(this, eji.b(dfb.this.p), new ejh(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !dfb.this.r();
      }
   };

   public dfb(ht $$0, dgw $$1) {
      super(det.w, $$0, $$1);
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

   public cqt c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != dfb.a.a) {
         this.x();
      }
   }

   public void g() {
      dfb.a $$0 = this.v();
      if ($$0 == dfb.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cut $$0 = this.q().b();
      if ($$0 instanceof cwc) {
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
         ht $$0 = this.p.a(this.o.a_(this.p).c(cwc.b).g());
         if (this.o.a_($$0).b() instanceof cwc) {
            der $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dfb && ((dfb)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dfb.a v() {
      dgw $$0 = this.q();
      if ($$0.a(cuv.fN)) {
         return dfb.a.c;
      } else if ($$0.a(cuv.kG)) {
         return dfb.a.b;
      } else {
         return $$0.a(cuv.kH) ? dfb.a.a : dfb.a.c;
      }
   }

   public boolean w() {
      dgw $$0 = this.o.a_(this.p());
      return $$0.b() instanceof cwc ? $$0.c(cwc.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
