public class dhf extends dgv {
   private boolean a;
   private boolean b;
   private boolean c;
   private final csq d = new csq() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dhf.this.e();
      }

      @Override
      public and e() {
         return (and)dhf.this.o;
      }

      @Override
      public void f() {
         djh $$0 = dhf.this.o.a_(dhf.this.p);
         this.e().a(dhf.this.p, $$0, $$0, 3);
      }

      @Override
      public elt g() {
         return elt.b(dhf.this.p);
      }

      @Override
      public ds i() {
         ic $$0 = dhf.this.r().c(cxz.b);
         return new ds(this, elt.b(dhf.this.p), new els(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dhf.this.s();
      }
   };

   public dhf(hx $$0, djh $$1) {
      super(dgx.w, $$0, $$1);
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

   public csq c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.m() != dhf.a.a) {
         this.x();
      }
   }

   public void g() {
      dhf.a $$0 = this.m();
      if ($$0 == dhf.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cwq $$0 = this.r().b();
      if ($$0 instanceof cxz) {
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
         hx $$0 = this.p.a(this.o.a_(this.p).c(cxz.b).g());
         if (this.o.a_($$0).b() instanceof cxz) {
            dgv $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dhf && ((dhf)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dhf.a m() {
      djh $$0 = this.r();
      if ($$0.a(cws.fN)) {
         return dhf.a.c;
      } else if ($$0.a(cws.kG)) {
         return dhf.a.b;
      } else {
         return $$0.a(cws.kH) ? dhf.a.a : dhf.a.c;
      }
   }

   public boolean w() {
      djh $$0 = this.o.a_(this.aB_());
      return $$0.b() instanceof cxz ? $$0.c(cxz.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
