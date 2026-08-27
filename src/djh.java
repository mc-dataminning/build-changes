public class djh extends dix {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cus d = new cus() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         djh.this.e();
      }

      @Override
      public aow e() {
         return (aow)djh.this.o;
      }

      @Override
      public void f() {
         dlj $$0 = djh.this.o.a_(djh.this.p);
         this.e().a(djh.this.p, $$0, $$0, 3);
      }

      @Override
      public enz g() {
         return enz.b(djh.this.p);
      }

      @Override
      public du i() {
         ie $$0 = djh.this.r().c(dab.b);
         return new du(this, enz.b(djh.this.p), new eny(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !djh.this.s();
      }
   };

   public djh(hz $$0, dlj $$1) {
      super(diz.w, $$0, $$1);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.k());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(sw $$0) {
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

   public cus c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.m() != djh.a.a) {
         this.x();
      }
   }

   public void g() {
      djh.a $$0 = this.m();
      if ($$0 == djh.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cys $$0 = this.r().b();
      if ($$0 instanceof dab) {
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
         hz $$0 = this.p.a(this.o.a_(this.p).c(dab.b).g());
         if (this.o.a_($$0).b() instanceof dab) {
            dix $$1 = this.o.c_($$0);
            this.c = $$1 instanceof djh && ((djh)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public djh.a m() {
      dlj $$0 = this.r();
      if ($$0.a(cyu.fN)) {
         return djh.a.c;
      } else if ($$0.a(cyu.kG)) {
         return djh.a.b;
      } else {
         return $$0.a(cyu.kH) ? djh.a.a : djh.a.c;
      }
   }

   public boolean w() {
      dlj $$0 = this.o.a_(this.aE_());
      return $$0.b() instanceof dab ? $$0.c(dab.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
