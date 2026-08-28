public class dvc extends dus {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dga d = new dga() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dvc.this.e();
      }

      @Override
      public ard e() {
         return (ard)dvc.this.n;
      }

      @Override
      public void f() {
         dxq $$0 = dvc.this.n.a_(dvc.this.o);
         this.e().a(dvc.this.o, $$0, $$0, 3);
      }

      @Override
      public fbx g() {
         return fbx.b(dvc.this.o);
      }

      @Override
      public ex i() {
         jn $$0 = dvc.this.m().c(dln.b);
         return new ex(this, fbx.b(dvc.this.o), new fbw(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dvc.this.n();
      }
   };

   public dvc(ji $$0, dxq $$1) {
      super(duu.x, $$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   public dga b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != dvc.a.a) {
         this.u();
      }
   }

   public void f() {
      dvc.a $$0 = this.s();
      if ($$0 == dvc.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dke $$0 = this.m().b();
      if ($$0 instanceof dln) {
         this.k();
         this.n.a(this.o, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.t()) {
         ji $$0 = this.o.a(this.n.a_(this.o).c(dln.b).g());
         if (this.n.a_($$0).b() instanceof dln) {
            dus $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dvc && ((dvc)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dvc.a s() {
      dxq $$0 = this.m();
      if ($$0.a(dkg.gi)) {
         return dvc.a.c;
      } else if ($$0.a(dkg.li)) {
         return dvc.a.b;
      } else {
         return $$0.a(dkg.lj) ? dvc.a.a : dvc.a.c;
      }
   }

   public boolean t() {
      dxq $$0 = this.n.a_(this.aA_());
      return $$0.b() instanceof dln ? $$0.c(dln.c) : false;
   }

   @Override
   protected void a(dus.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kv.g));
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.g, this.d.o());
   }

   @Override
   public void a(tq $$0) {
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
