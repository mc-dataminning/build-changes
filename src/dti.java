public class dti extends dsy {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dem d = new dem() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dti.this.e();
      }

      @Override
      public arp e() {
         return (arp)dti.this.o;
      }

      @Override
      public void f() {
         dvv $$0 = dti.this.o.a_(dti.this.p);
         this.e().a(dti.this.p, $$0, $$0, 3);
      }

      @Override
      public ezy g() {
         return ezy.b(dti.this.p);
      }

      @Override
      public ew i() {
         jm $$0 = dti.this.m().c(djz.b);
         return new ew(this, ezy.b(dti.this.p), new ezx(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dti.this.n();
      }
   };

   public dti(jh $$0, dvv $$1) {
      super(dta.w, $$0, $$1);
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
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

   public dem b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dti.a.a) {
         this.v();
      }
   }

   public void f() {
      dti.a $$0 = this.t();
      if ($$0 == dti.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      diq $$0 = this.m().b();
      if ($$0 instanceof djz) {
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
         jh $$0 = this.p.a(this.o.a_(this.p).c(djz.b).g());
         if (this.o.a_($$0).b() instanceof djz) {
            dsy $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dti && ((dti)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dti.a t() {
      dvv $$0 = this.m();
      if ($$0.a(dis.fN)) {
         return dti.a.c;
      } else if ($$0.a(dis.kG)) {
         return dti.a.b;
      } else {
         return $$0.a(dis.kH) ? dti.a.a : dti.a.c;
      }
   }

   public boolean u() {
      dvv $$0 = this.o.a_(this.aA_());
      return $$0.b() instanceof djz ? $$0.c(djz.c) : false;
   }

   @Override
   protected void a(dsy.b $$0) {
      super.a($$0);
      this.d.b($$0.a(ku.g));
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.g, this.d.o());
   }

   @Override
   public void a(ul $$0) {
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
