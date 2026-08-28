public class dvh extends dux {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dgi d = new dgi() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dvh.this.e();
      }

      @Override
      public ash e() {
         return (ash)dvh.this.o;
      }

      @Override
      public void f() {
         dxv $$0 = dvh.this.o.a_(dvh.this.p);
         this.e().a(dvh.this.p, $$0, $$0, 3);
      }

      @Override
      public fby g() {
         return fby.b(dvh.this.p);
      }

      @Override
      public ew i() {
         jm $$0 = dvh.this.m().c(dlw.b);
         return new ew(this, fby.b(dvh.this.p), new fbx(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dvh.this.n();
      }
   };

   public dvh(jh $$0, dxv $$1) {
      super(duz.x, $$0, $$1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
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

   public dgi b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dvh.a.a) {
         this.v();
      }
   }

   public void f() {
      dvh.a $$0 = this.t();
      if ($$0 == dvh.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      dkm $$0 = this.m().b();
      if ($$0 instanceof dlw) {
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
         jh $$0 = this.p.a(this.o.a_(this.p).c(dlw.b).g());
         if (this.o.a_($$0).b() instanceof dlw) {
            dux $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dvh && ((dvh)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dvh.a t() {
      dxv $$0 = this.m();
      if ($$0.a(dko.gb)) {
         return dvh.a.c;
      } else if ($$0.a(dko.lb)) {
         return dvh.a.b;
      } else {
         return $$0.a(dko.lc) ? dvh.a.a : dvh.a.c;
      }
   }

   public boolean u() {
      dxv $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof dlw ? $$0.c(dlw.c) : false;
   }

   @Override
   protected void a(dux.b $$0) {
      super.a($$0);
      this.d.b($$0.a(ku.g));
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.d.o());
   }

   @Override
   public void a(ux $$0) {
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
