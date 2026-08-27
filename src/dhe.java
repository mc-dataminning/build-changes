public class dhe extends dgu {
   private boolean a;
   private boolean b;
   private boolean c;
   private final csp d = new csp() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dhe.this.e();
      }

      @Override
      public and e() {
         return (and)dhe.this.o;
      }

      @Override
      public void f() {
         djg $$0 = dhe.this.o.a_(dhe.this.p);
         this.e().a(dhe.this.p, $$0, $$0, 3);
      }

      @Override
      public els g() {
         return els.b(dhe.this.p);
      }

      @Override
      public ds i() {
         ic $$0 = dhe.this.r().c(cxy.b);
         return new ds(this, els.b(dhe.this.p), new elr(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dhe.this.s();
      }
   };

   public dhe(hx $$0, djg $$1) {
      super(dgw.w, $$0, $$1);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.k());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(sn $$0) {
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

   public csp c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.m() != dhe.a.a) {
         this.x();
      }
   }

   public void g() {
      dhe.a $$0 = this.m();
      if ($$0 == dhe.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cwp $$0 = this.r().b();
      if ($$0 instanceof cxy) {
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
         hx $$0 = this.p.a(this.o.a_(this.p).c(cxy.b).g());
         if (this.o.a_($$0).b() instanceof cxy) {
            dgu $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dhe && ((dhe)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dhe.a m() {
      djg $$0 = this.r();
      if ($$0.a(cwr.fN)) {
         return dhe.a.c;
      } else if ($$0.a(cwr.kG)) {
         return dhe.a.b;
      } else {
         return $$0.a(cwr.kH) ? dhe.a.a : dhe.a.c;
      }
   }

   public boolean w() {
      djg $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof cxy ? $$0.c(cxy.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
