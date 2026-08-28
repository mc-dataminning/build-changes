public class cuu extends cuk {
   static final akl<String> b = akp.a(cuu.class, akn.e);
   static final akl<xa> c = akp.a(cuu.class, akn.f);
   private final diw d = new cuu.a();
   private static final int h = 4;
   private int i;

   public cuu(bxc<? extends cuu> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected czu o() {
      return dac.ov;
   }

   @Override
   public czy dI() {
      return new czy(dac.vX);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, wz.a);
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.d.b($$0, this.dX());
      this.ar().a(b, this.q().m());
      this.ar().a(c, this.q().l());
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      this.d.a($$0, this.dX());
   }

   @Override
   public ebe v() {
      return dne.gm.m();
   }

   public diw q() {
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
   public bur a(crx $$0, buq $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(akl<?> $$0) {
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

   public class a extends diw {
      @Override
      public ars e() {
         return (ars)cuu.this.dV();
      }

      @Override
      public void f() {
         cuu.this.ar().a(cuu.b, this.m());
         cuu.this.ar().a(cuu.c, this.l());
      }

      @Override
      public ffq g() {
         return cuu.this.dt();
      }

      public cuu h() {
         return cuu.this;
      }

      @Override
      public ej i() {
         return new ej(this, cuu.this.dt(), cuu.this.bT(), this.e(), 2, this.n().getString(), cuu.this.m_(), this.e().p(), cuu.this);
      }

      @Override
      public boolean j() {
         return !cuu.this.dQ();
      }
   }
}
