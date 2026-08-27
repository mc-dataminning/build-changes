public class djv extends djl {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cvf d = new cvf() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         djv.this.e();
      }

      @Override
      public apa e() {
         return (apa)djv.this.o;
      }

      @Override
      public void f() {
         dme $$0 = djv.this.o.a_(djv.this.p);
         this.e().a(djv.this.p, $$0, $$0, 3);
      }

      @Override
      public eov g() {
         return eov.b(djv.this.p);
      }

      @Override
      public du i() {
         ih $$0 = djv.this.n().c(dao.b);
         return new du(this, eov.b(djv.this.p), new eou(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !djv.this.o();
      }
   };

   public djv(ib $$0, dme $$1) {
      super(djn.w, $$0, $$1);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   public void a(sy $$0, in.a $$1) {
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

   public cvf b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.l() != djv.a.a) {
         this.t();
      }
   }

   public void f() {
      djv.a $$0 = this.l();
      if ($$0 == djv.a.b && (this.a || this.b) && this.o != null) {
         this.t();
      }
   }

   private void t() {
      czf $$0 = this.n().b();
      if ($$0 instanceof dao) {
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
         ib $$0 = this.p.a(this.o.a_(this.p).c(dao.b).g());
         if (this.o.a_($$0).b() instanceof dao) {
            djl $$1 = this.o.c_($$0);
            this.c = $$1 instanceof djv && ((djv)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public djv.a l() {
      dme $$0 = this.n();
      if ($$0.a(czh.fN)) {
         return djv.a.c;
      } else if ($$0.a(czh.kG)) {
         return djv.a.b;
      } else {
         return $$0.a(czh.kH) ? djv.a.a : djv.a.c;
      }
   }

   public boolean s() {
      dme $$0 = this.o.a_(this.aD_());
      return $$0.b() instanceof dao ? $$0.c(dao.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
