public class dnn extends dnd {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cyv d = new cyv() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dnn.this.e();
      }

      @Override
      public aqe e() {
         return (aqe)dnn.this.o;
      }

      @Override
      public void f() {
         dpy $$0 = dnn.this.o.a_(dnn.this.p);
         this.e().a(dnn.this.p, $$0, $$0, 3);
      }

      @Override
      public etf g() {
         return etf.b(dnn.this.p);
      }

      @Override
      public ec i() {
         ir $$0 = dnn.this.n().c(dee.b);
         return new ec(this, etf.b(dnn.this.p), new ete(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dnn.this.o();
      }
   };

   public dnn(im $$0, dpy $$1) {
      super(dnf.w, $$0, $$1);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
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

   public cyv b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.l() != dnn.a.a) {
         this.u();
      }
   }

   public void f() {
      dnn.a $$0 = this.l();
      if ($$0 == dnn.a.b && (this.a || this.b) && this.o != null) {
         this.u();
      }
   }

   private void u() {
      dcv $$0 = this.n().b();
      if ($$0 instanceof dee) {
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
         im $$0 = this.p.a(this.o.a_(this.p).c(dee.b).g());
         if (this.o.a_($$0).b() instanceof dee) {
            dnd $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dnn && ((dnn)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dnn.a l() {
      dpy $$0 = this.n();
      if ($$0.a(dcx.fN)) {
         return dnn.a.c;
      } else if ($$0.a(dcx.kG)) {
         return dnn.a.b;
      } else {
         return $$0.a(dcx.kH) ? dnn.a.a : dnn.a.c;
      }
   }

   public boolean t() {
      dpy $$0 = this.o.a_(this.az_());
      return $$0.b() instanceof dee ? $$0.c(dee.c) : false;
   }

   @Override
   public void a(jv $$0) {
      this.d.b($$0.a(jz.d));
   }

   @Override
   public void a(jv.a $$0) {
      super.a($$0);
      $$0.a(jz.d, this.d.o());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
