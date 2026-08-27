public class deh extends ddx {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cqa d = new cqa() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         deh.this.e();
      }

      @Override
      public alq e() {
         return (alq)deh.this.o;
      }

      @Override
      public void f() {
         dgb $$0 = deh.this.o.a_(deh.this.p);
         this.e().a(deh.this.p, $$0, $$0, 3);
      }

      @Override
      public eif g() {
         return eif.b(deh.this.p);
      }

      @Override
      public du i() {
         hx $$0 = deh.this.q().c(cvj.b);
         return new du(this, eif.b(deh.this.p), new eie(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !deh.this.r();
      }
   };

   public deh(ht $$0, dgb $$1) {
      super(ddz.w, $$0, $$1);
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(rt $$0) {
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

   public cqa c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != deh.a.a) {
         this.x();
      }
   }

   public void g() {
      deh.a $$0 = this.v();
      if ($$0 == deh.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cua $$0 = this.q().b();
      if ($$0 instanceof cvj) {
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
         ht $$0 = this.p.a(this.o.a_(this.p).c(cvj.b).g());
         if (this.o.a_($$0).b() instanceof cvj) {
            ddx $$1 = this.o.c_($$0);
            this.c = $$1 instanceof deh && ((deh)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public deh.a v() {
      dgb $$0 = this.q();
      if ($$0.a(cuc.fN)) {
         return deh.a.c;
      } else if ($$0.a(cuc.kG)) {
         return deh.a.b;
      } else {
         return $$0.a(cuc.kH) ? deh.a.a : deh.a.c;
      }
   }

   public boolean w() {
      dgb $$0 = this.o.a_(this.p());
      return $$0.b() instanceof cvj ? $$0.c(cvj.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
