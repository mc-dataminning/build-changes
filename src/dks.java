public class dks extends dki {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cwc d = new cwc() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dks.this.e();
      }

      @Override
      public apf e() {
         return (apf)dks.this.o;
      }

      @Override
      public void f() {
         dnb $$0 = dks.this.o.a_(dks.this.p);
         this.e().a(dks.this.p, $$0, $$0, 3);
      }

      @Override
      public ept g() {
         return ept.b(dks.this.p);
      }

      @Override
      public du i() {
         ih $$0 = dks.this.n().c(dbl.b);
         return new du(this, ept.b(dks.this.p), new eps(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dks.this.o();
      }
   };

   public dks(ib $$0, dnb $$1) {
      super(dkk.w, $$0, $$1);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean q() {
      return true;
   }

   public cwc b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.l() != dks.a.a) {
         this.t();
      }
   }

   public void f() {
      dks.a $$0 = this.l();
      if ($$0 == dks.a.b && (this.a || this.b) && this.o != null) {
         this.t();
      }
   }

   private void t() {
      dac $$0 = this.n().b();
      if ($$0 instanceof dbl) {
         this.k();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.s()) {
         ib $$0 = this.p.a(this.o.a_(this.p).c(dbl.b).g());
         if (this.o.a_($$0).b() instanceof dbl) {
            dki $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dks && ((dks)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dks.a l() {
      dnb $$0 = this.n();
      if ($$0.a(dae.fN)) {
         return dks.a.c;
      } else if ($$0.a(dae.kG)) {
         return dks.a.b;
      } else {
         return $$0.a(dae.kH) ? dks.a.a : dks.a.c;
      }
   }

   public boolean s() {
      dnb $$0 = this.o.a_(this.aC_());
      return $$0.b() instanceof dbl ? $$0.c(dbl.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
