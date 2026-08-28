public class cuw extends cum {
   static final akn<String> b = akr.a(cuw.class, akp.e);
   static final akn<xc> c = akr.a(cuw.class, akp.f);
   private final diy d = new cuw.a();
   private static final int h = 4;
   private int i;

   public cuw(bxe<? extends cuw> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected czw o() {
      return dae.ov;
   }

   @Override
   public daa dI() {
      return new daa(dae.vX);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, xb.a);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.d.b($$0, this.dX());
      this.ar().a(b, this.q().m());
      this.ar().a(c, this.q().l());
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      this.d.a($$0, this.dX());
   }

   @Override
   public ebg v() {
      return dng.gm.m();
   }

   public diy q() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.q().a(this.dV());
         this.i = this.af;
      }
   }

   @Override
   public but a(crz $$0, bus $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(akn<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         try {
            this.d.c(this.ar().a(c));
         } catch (Throwable var3) {
         }
      } else if (b.equals($$0)) {
         this.d.a(this.ar().a(b));
      }
   }

   public class a extends diy {
      @Override
      public aru e() {
         return (aru)cuw.this.dV();
      }

      @Override
      public void f() {
         cuw.this.ar().a(cuw.b, this.m());
         cuw.this.ar().a(cuw.c, this.l());
      }

      @Override
      public ffs g() {
         return cuw.this.dt();
      }

      public cuw h() {
         return cuw.this;
      }

      @Override
      public ek i() {
         return new ek(this, cuw.this.dt(), cuw.this.bT(), this.e(), 2, this.n().getString(), cuw.this.m_(), this.e().p(), cuw.this);
      }

      @Override
      public boolean j() {
         return !cuw.this.dQ();
      }
   }
}
