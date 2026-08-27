public class dkq extends dkg {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cwa d = new cwa() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dkq.this.e();
      }

      @Override
      public apf e() {
         return (apf)dkq.this.o;
      }

      @Override
      public void f() {
         dmz $$0 = dkq.this.o.a_(dkq.this.p);
         this.e().a(dkq.this.p, $$0, $$0, 3);
      }

      @Override
      public epr g() {
         return epr.b(dkq.this.p);
      }

      @Override
      public du i() {
         ih $$0 = dkq.this.n().c(dbj.b);
         return new du(this, epr.b(dkq.this.p), new epq(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dkq.this.o();
      }
   };

   public dkq(ib $$0, dmz $$1) {
      super(dki.w, $$0, $$1);
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

   public cwa b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.l() != dkq.a.a) {
         this.t();
      }
   }

   public void f() {
      dkq.a $$0 = this.l();
      if ($$0 == dkq.a.b && (this.a || this.b) && this.o != null) {
         this.t();
      }
   }

   private void t() {
      daa $$0 = this.n().b();
      if ($$0 instanceof dbj) {
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
         ib $$0 = this.p.a(this.o.a_(this.p).c(dbj.b).g());
         if (this.o.a_($$0).b() instanceof dbj) {
            dkg $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dkq && ((dkq)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dkq.a l() {
      dmz $$0 = this.n();
      if ($$0.a(dac.fN)) {
         return dkq.a.c;
      } else if ($$0.a(dac.kG)) {
         return dkq.a.b;
      } else {
         return $$0.a(dac.kH) ? dkq.a.a : dkq.a.c;
      }
   }

   public boolean s() {
      dmz $$0 = this.o.a_(this.aC_());
      return $$0.b() instanceof dbj ? $$0.c(dbj.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
