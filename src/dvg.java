public class dvg extends duw {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dgh d = new dgh() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dvg.this.e();
      }

      @Override
      public ash e() {
         return (ash)dvg.this.o;
      }

      @Override
      public void f() {
         dxu $$0 = dvg.this.o.a_(dvg.this.p);
         this.e().a(dvg.this.p, $$0, $$0, 3);
      }

      @Override
      public fbx g() {
         return fbx.b(dvg.this.p);
      }

      @Override
      public ew i() {
         jm $$0 = dvg.this.m().c(dlv.b);
         return new ew(this, fbx.b(dvg.this.p), new fbw(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dvg.this.n();
      }
   };

   public dvg(jh $$0, dxu $$1) {
      super(duy.x, $$0, $$1);
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

   public dgh b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dvg.a.a) {
         this.v();
      }
   }

   public void f() {
      dvg.a $$0 = this.t();
      if ($$0 == dvg.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      dkl $$0 = this.m().b();
      if ($$0 instanceof dlv) {
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
         jh $$0 = this.p.a(this.o.a_(this.p).c(dlv.b).g());
         if (this.o.a_($$0).b() instanceof dlv) {
            duw $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dvg && ((dvg)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dvg.a t() {
      dxu $$0 = this.m();
      if ($$0.a(dkn.gb)) {
         return dvg.a.c;
      } else if ($$0.a(dkn.lb)) {
         return dvg.a.b;
      } else {
         return $$0.a(dkn.lc) ? dvg.a.a : dvg.a.c;
      }
   }

   public boolean u() {
      dxu $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof dlv ? $$0.c(dlv.c) : false;
   }

   @Override
   protected void a(duw.b $$0) {
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
