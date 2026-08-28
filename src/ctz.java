public class ctz extends ctp {
   static final akj<String> b = akn.a(ctz.class, akl.e);
   static final akj<wy> c = akn.a(ctz.class, akl.f);
   private final dib d = new ctz.a();
   private static final int h = 4;
   private int i;

   public ctz(bwo<? extends ctz> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected cyz o() {
      return czh.ov;
   }

   @Override
   public czd dI() {
      return new czd(czh.vX);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, wx.a);
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.d.b($$0, this.dX());
      this.au().a(b, this.q().m());
      this.au().a(c, this.q().l());
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      this.d.a($$0, this.dX());
   }

   @Override
   public eah v() {
      return dmh.gm.m();
   }

   public dib q() {
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
   public bud a(crc $$0, buc $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         try {
            this.d.c(this.au().a(c));
         } catch (Throwable var3) {
         }
      } else if (b.equals($$0)) {
         this.d.a(this.au().a(b));
      }
   }

   public class a extends dib {
      @Override
      public arq e() {
         return (arq)ctz.this.dV();
      }

      @Override
      public void f() {
         ctz.this.au().a(ctz.b, this.m());
         ctz.this.au().a(ctz.c, this.l());
      }

      @Override
      public feq g() {
         return ctz.this.dt();
      }

      public ctz h() {
         return ctz.this;
      }

      @Override
      public ei i() {
         return new ei(this, ctz.this.dt(), ctz.this.bU(), this.e(), 2, this.n().getString(), ctz.this.m_(), this.e().p(), ctz.this);
      }

      @Override
      public boolean j() {
         return !ctz.this.dQ();
      }
   }
}
