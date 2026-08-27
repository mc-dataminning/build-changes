public class dcw extends dcm {
   private boolean a;
   private boolean b;
   private boolean c;
   private final com d = new com() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dcw.this.e();
      }

      @Override
      public akk e() {
         return (akk)dcw.this.o;
      }

      @Override
      public void f() {
         dfa $$0 = dcw.this.o.a_(dcw.this.p);
         this.e().a(dcw.this.p, $$0, $$0, 3);
      }

      @Override
      public ehe g() {
         return ehe.b(dcw.this.p);
      }

      @Override
      public dr i() {
         ha $$0 = dcw.this.q().c(ctt.a);
         return new dr(this, ehe.b(dcw.this.p), new ehd(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().n(), null);
      }

      @Override
      public boolean j() {
         return !dcw.this.r();
      }
   };

   public dcw(gu $$0, dfa $$1) {
      super(dco.w, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.d.b($$0);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean t() {
      return true;
   }

   public com c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.v() != dcw.a.a) {
         this.x();
      }
   }

   public void g() {
      dcw.a $$0 = this.v();
      if ($$0 == dcw.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      csm $$0 = this.q().b();
      if ($$0 instanceof ctt) {
         this.j();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean i() {
      return this.c;
   }

   public boolean j() {
      this.c = true;
      if (this.w()) {
         gu $$0 = this.p.a(this.o.a_(this.p).c(ctt.a).g());
         if (this.o.a_($$0).b() instanceof ctt) {
            dcm $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dcw && ((dcw)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dcw.a v() {
      dfa $$0 = this.q();
      if ($$0.a(csn.fN)) {
         return dcw.a.c;
      } else if ($$0.a(csn.kG)) {
         return dcw.a.b;
      } else {
         return $$0.a(csn.kH) ? dcw.a.a : dcw.a.c;
      }
   }

   public boolean w() {
      dfa $$0 = this.o.a_(this.p());
      return $$0.b() instanceof ctt ? $$0.c(ctt.b) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
