public class cvf extends cuv {
   static final aku<String> b = aky.a(cvf.class, akw.e);
   static final aku<xg> c = aky.a(cvf.class, akw.f);
   private final dji d = new cvf.a();
   private static final int h = 4;
   private int i;

   public cvf(bxn<? extends cvf> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected dag o() {
      return dao.ov;
   }

   @Override
   public dak dI() {
      return new dak(dao.vX);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, xf.a);
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
   public ebq v() {
      return dnq.gm.m();
   }

   public dji q() {
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
   public bvc a(csi $$0, bvb $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(aku<?> $$0) {
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

   public class a extends dji {
      @Override
      public asb e() {
         return (asb)cvf.this.dV();
      }

      @Override
      public void f() {
         cvf.this.ar().a(cvf.b, this.m());
         cvf.this.ar().a(cvf.c, this.l());
      }

      @Override
      public fgc g() {
         return cvf.this.dt();
      }

      public cvf h() {
         return cvf.this;
      }

      @Override
      public ek i() {
         return new ek(this, cvf.this.dt(), cvf.this.bT(), this.e(), 2, this.n().getString(), cvf.this.m_(), this.e().p(), cvf.this);
      }

      @Override
      public boolean j() {
         return !cvf.this.dQ();
      }
   }
}
