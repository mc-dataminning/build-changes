public class djd extends dit {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cuo d = new cuo() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         djd.this.e();
      }

      @Override
      public aov e() {
         return (aov)djd.this.o;
      }

      @Override
      public void f() {
         dlf $$0 = djd.this.o.a_(djd.this.p);
         this.e().a(djd.this.p, $$0, $$0, 3);
      }

      @Override
      public ens g() {
         return ens.b(djd.this.p);
      }

      @Override
      public du i() {
         ie $$0 = djd.this.r().c(czx.b);
         return new du(this, ens.b(djd.this.p), new enr(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !djd.this.s();
      }
   };

   public djd(hz $$0, dlf $$1) {
      super(div.w, $$0, $$1);
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

   public cuo c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.m() != djd.a.a) {
         this.x();
      }
   }

   public void g() {
      djd.a $$0 = this.m();
      if ($$0 == djd.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cyo $$0 = this.r().b();
      if ($$0 instanceof czx) {
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
         hz $$0 = this.p.a(this.o.a_(this.p).c(czx.b).g());
         if (this.o.a_($$0).b() instanceof czx) {
            dit $$1 = this.o.c_($$0);
            this.c = $$1 instanceof djd && ((djd)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public djd.a m() {
      dlf $$0 = this.r();
      if ($$0.a(cyq.fN)) {
         return djd.a.c;
      } else if ($$0.a(cyq.kG)) {
         return djd.a.b;
      } else {
         return $$0.a(cyq.kH) ? djd.a.a : djd.a.c;
      }
   }

   public boolean w() {
      dlf $$0 = this.o.a_(this.aE_());
      return $$0.b() instanceof czx ? $$0.c(czx.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
