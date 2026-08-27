public class dhn extends dhd {
   private boolean a;
   private boolean b;
   private boolean c;
   private final csy d = new csy() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dhn.this.e();
      }

      @Override
      public ane e() {
         return (ane)dhn.this.o;
      }

      @Override
      public void f() {
         djp $$0 = dhn.this.o.a_(dhn.this.p);
         this.e().a(dhn.this.p, $$0, $$0, 3);
      }

      @Override
      public emc g() {
         return emc.b(dhn.this.p);
      }

      @Override
      public ds i() {
         ic $$0 = dhn.this.r().c(cyh.b);
         return new ds(this, emc.b(dhn.this.p), new emb(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().o(), null);
      }

      @Override
      public boolean j() {
         return !dhn.this.s();
      }
   };

   public dhn(hx $$0, djp $$1) {
      super(dhf.w, $$0, $$1);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.k());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.d.b($$0);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean u() {
      return true;
   }

   public csy c() {
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
      if (!$$1 && $$0 && !this.a && this.o != null && this.m() != dhn.a.a) {
         this.x();
      }
   }

   public void g() {
      dhn.a $$0 = this.m();
      if ($$0 == dhn.a.b && (this.a || this.b) && this.o != null) {
         this.x();
      }
   }

   private void x() {
      cwy $$0 = this.r().b();
      if ($$0 instanceof cyh) {
         this.l();
         this.o.a(this.p, $$0, 1);
      }
   }

   public boolean k() {
      return this.c;
   }

   public boolean l() {
      this.c = true;
      if (this.w()) {
         hx $$0 = this.p.a(this.o.a_(this.p).c(cyh.b).g());
         if (this.o.a_($$0).b() instanceof cyh) {
            dhd $$1 = this.o.c_($$0);
            this.c = $$1 instanceof dhn && ((dhn)$$1).c().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dhn.a m() {
      djp $$0 = this.r();
      if ($$0.a(cxa.fN)) {
         return dhn.a.c;
      } else if ($$0.a(cxa.kG)) {
         return dhn.a.b;
      } else {
         return $$0.a(cxa.kH) ? dhn.a.a : dhn.a.c;
      }
   }

   public boolean w() {
      djp $$0 = this.o.a_(this.aE_());
      return $$0.b() instanceof cyh ? $$0.c(cyh.c) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
