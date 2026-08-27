public class dnw extends dnm {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cze d = new cze() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dnw.this.e();
      }

      @Override
      public aqh e() {
         return (aqh)dnw.this.n;
      }

      @Override
      public void f() {
         dqh $$0 = dnw.this.n.a_(dnw.this.o);
         this.e().a(dnw.this.o, $$0, $$0, 3);
      }

      @Override
      public etp g() {
         return etp.b(dnw.this.o);
      }

      @Override
      public ed i() {
         is $$0 = dnw.this.n().c(den.b);
         return new ed(this, etp.b(dnw.this.o), new eto(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dnw.this.o();
      }
   };

   public dnw(in $$0, dqh $$1) {
      super(dno.w, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
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

   public cze b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dnw.a.a) {
         this.u();
      }
   }

   public void f() {
      dnw.a $$0 = this.l();
      if ($$0 == dnw.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dde $$0 = this.n().b();
      if ($$0 instanceof den) {
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
         in $$0 = this.o.a(this.n.a_(this.o).c(den.b).g());
         if (this.n.a_($$0).b() instanceof den) {
            dnm $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dnw && ((dnw)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dnw.a l() {
      dqh $$0 = this.n();
      if ($$0.a(ddg.fN)) {
         return dnw.a.c;
      } else if ($$0.a(ddg.kG)) {
         return dnw.a.b;
      } else {
         return $$0.a(ddg.kH) ? dnw.a.a : dnw.a.c;
      }
   }

   public boolean t() {
      dqh $$0 = this.n.a_(this.az_());
      return $$0.b() instanceof den ? $$0.c(den.c) : false;
   }

   @Override
   public void a(jw $$0) {
      this.d.b($$0.a(ka.f));
   }

   @Override
   public void a(jw.a $$0) {
      super.a($$0);
      $$0.a(ka.f, this.d.o());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
