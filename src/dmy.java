public class dmy extends dmo {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cyh d = new cyh() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dmy.this.e();
      }

      @Override
      public apu e() {
         return (apu)dmy.this.o;
      }

      @Override
      public void f() {
         dpi $$0 = dmy.this.o.a_(dmy.this.p);
         this.e().a(dmy.this.p, $$0, $$0, 3);
      }

      @Override
      public esj g() {
         return esj.b(dmy.this.p);
      }

      @Override
      public dv i() {
         ij $$0 = dmy.this.n().c(ddq.b);
         return new dv(this, esj.b(dmy.this.p), new esi(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dmy.this.o();
      }
   };

   public dmy(id $$0, dpi $$1) {
      super(dmq.w, $$0, $$1);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean q() {
      return true;
   }

   public cyh b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.l() != dmy.a.a) {
         this.u();
      }
   }

   public void f() {
      dmy.a $$0 = this.l();
      if ($$0 == dmy.a.b && (this.a || this.b) && this.o != null) {
         this.u();
      }
   }

   private void u() {
      dch $$0 = this.n().b();
      if ($$0 instanceof ddq) {
         this.k();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.t()) {
         id $$0 = this.p.a(this.o.a_(this.p).c(ddq.b).g());
         if (this.o.a_($$0).b() instanceof ddq) {
            dmo $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dmy && ((dmy)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dmy.a l() {
      dpi $$0 = this.n();
      if ($$0.a(dcj.fN)) {
         return dmy.a.c;
      } else if ($$0.a(dcj.kG)) {
         return dmy.a.b;
      } else {
         return $$0.a(dcj.kH) ? dmy.a.a : dmy.a.c;
      }
   }

   public boolean t() {
      dpi $$0 = this.o.a_(this.az_());
      return $$0.b() instanceof ddq ? $$0.c(ddq.c) : false;
   }

   @Override
   public void a(jn $$0) {
      this.d.b($$0.a(jr.d));
   }

   @Override
   public void a(jn.a $$0) {
      super.a($$0);
      $$0.a(jr.d, this.d.o());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
