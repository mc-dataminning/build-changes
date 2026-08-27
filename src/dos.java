public class dos extends doi {
   private boolean a;
   private boolean b;
   private boolean c;
   private final daa d = new daa() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dos.this.e();
      }

      @Override
      public aqn e() {
         return (aqn)dos.this.n;
      }

      @Override
      public void f() {
         drd $$0 = dos.this.n.a_(dos.this.o);
         this.e().a(dos.this.o, $$0, $$0, 3);
      }

      @Override
      public eum g() {
         return eum.b(dos.this.o);
      }

      @Override
      public ee i() {
         it $$0 = dos.this.n().c(dfj.b);
         return new ee(this, eum.b(dos.this.o), new eul(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dos.this.o();
      }
   };

   public dos(io $$0, drd $$1) {
      super(dok.w, $$0, $$1);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
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

   public daa b() {
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
      if (!$$1 && $$0 && !this.a && this.n != null && this.l() != dos.a.a) {
         this.v();
      }
   }

   public void f() {
      dos.a $$0 = this.l();
      if ($$0 == dos.a.b && (this.a || this.b) && this.n != null) {
         this.v();
      }
   }

   private void v() {
      dea $$0 = this.n().b();
      if ($$0 instanceof dfj) {
         this.k();
         this.n.a(this.o, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.u()) {
         io $$0 = this.o.a(this.n.a_(this.o).c(dfj.b).g());
         if (this.n.a_($$0).b() instanceof dfj) {
            doi $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dos && ((dos)$$1).b().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dos.a l() {
      drd $$0 = this.n();
      if ($$0.a(dec.fN)) {
         return dos.a.c;
      } else if ($$0.a(dec.kG)) {
         return dos.a.b;
      } else {
         return $$0.a(dec.kH) ? dos.a.a : dos.a.c;
      }
   }

   public boolean u() {
      drd $$0 = this.n.a_(this.aA_());
      return $$0.b() instanceof dfj ? $$0.c(dfj.c) : false;
   }

   @Override
   protected void a(doi.b $$0) {
      super.a($$0);
      this.d.b($$0.a(kb.f));
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.f, this.d.o());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      $$0.r("CustomName");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
