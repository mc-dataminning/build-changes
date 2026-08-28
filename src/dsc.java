public class dsc extends drs {
   private boolean a;
   private boolean b;
   private boolean c;
   private final ddg d = new ddg() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dsc.this.e();
      }

      @Override
      public arh e() {
         return (arh)dsc.this.o;
      }

      @Override
      public void f() {
         duo $$0 = dsc.this.o.a_(dsc.this.p);
         this.e().a(dsc.this.p, $$0, $$0, 3);
      }

      @Override
      public eys g() {
         return eys.b(dsc.this.p);
      }

      @Override
      public et i() {
         jj $$0 = dsc.this.m().c(dis.b);
         return new et(this, eys.b(dsc.this.p), new eyr(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dsc.this.n();
      }
   };

   public dsc(je $$0, duo $$1) {
      super(dru.w, $$0, $$1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean p() {
      return true;
   }

   public ddg b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dsc.a.a) {
         this.v();
      }
   }

   public void f() {
      dsc.a $$0 = this.t();
      if ($$0 == dsc.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      dhj $$0 = this.m().b();
      if ($$0 instanceof dis) {
         this.k();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.u()) {
         je $$0 = this.p.a(this.o.a_(this.p).c(dis.b).g());
         if (this.o.a_($$0).b() instanceof dis) {
            drs $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dsc && ((dsc)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dsc.a t() {
      duo $$0 = this.m();
      if ($$0.a(dhl.fN)) {
         return dsc.a.c;
      } else if ($$0.a(dhl.kG)) {
         return dsc.a.b;
      } else {
         return $$0.a(dhl.kH) ? dsc.a.a : dsc.a.c;
      }
   }

   public boolean u() {
      duo $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof dis ? $$0.c(dis.c) : false;
   }

   @Override
   protected void a(drs.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kr.g));
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.g, this.d.o());
   }

   @Override
   public void a(uf $$0) {
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
