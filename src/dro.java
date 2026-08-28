public class dro extends dre {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dcs d = new dcs() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dro.this.e();
      }

      @Override
      public arg e() {
         return (arg)dro.this.o;
      }

      @Override
      public void f() {
         dua $$0 = dro.this.o.a_(dro.this.p);
         this.e().a(dro.this.p, $$0, $$0, 3);
      }

      @Override
      public eye g() {
         return eye.b(dro.this.p);
      }

      @Override
      public et i() {
         jj $$0 = dro.this.m().c(die.b);
         return new et(this, eye.b(dro.this.p), new eyd(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dro.this.n();
      }
   };

   public dro(je $$0, dua $$1) {
      super(drg.w, $$0, $$1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
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

   public dcs b() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.t() != dro.a.a) {
         this.v();
      }
   }

   public void f() {
      dro.a $$0 = this.t();
      if ($$0 == dro.a.b && (this.a || this.b) && this.o != null) {
         this.v();
      }
   }

   private void v() {
      dgv $$0 = this.m().b();
      if ($$0 instanceof die) {
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
         je $$0 = this.p.a(this.o.a_(this.p).c(die.b).g());
         if (this.o.a_($$0).b() instanceof die) {
            dre $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dro && ((dro)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dro.a t() {
      dua $$0 = this.m();
      if ($$0.a(dgx.fN)) {
         return dro.a.c;
      } else if ($$0.a(dgx.kG)) {
         return dro.a.b;
      } else {
         return $$0.a(dgx.kH) ? dro.a.a : dro.a.c;
      }
   }

   public boolean u() {
      dua $$0 = this.o.a_(this.aD_());
      return $$0.b() instanceof die ? $$0.c(die.c) : false;
   }

   @Override
   protected void a(dre.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kr.g));
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.g, this.d.o());
   }

   @Override
   public void a(uf $$0) {
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
