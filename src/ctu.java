public class ctu extends ctk {
   static final akj<String> b = akn.a(ctu.class, akl.e);
   static final akj<wy> c = akn.a(ctu.class, akl.f);
   private final dhw d = new ctu.a();
   private static final int h = 4;
   private int i;

   public ctu(bwm<? extends ctu> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected cyu o() {
      return czc.os;
   }

   @Override
   public cyy dI() {
      return new cyy(czc.vS);
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
   public dzz v() {
      return dmc.gj.m();
   }

   public dhw q() {
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
   public bub a(cqy $$0, bua $$1) {
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

   public class a extends dhw {
      @Override
      public arq e() {
         return (arq)ctu.this.dV();
      }

      @Override
      public void f() {
         ctu.this.au().a(ctu.b, this.m());
         ctu.this.au().a(ctu.c, this.l());
      }

      @Override
      public fei g() {
         return ctu.this.dt();
      }

      public ctu h() {
         return ctu.this;
      }

      @Override
      public ei i() {
         return new ei(this, ctu.this.dt(), ctu.this.bU(), this.e(), 2, this.n().getString(), ctu.this.m_(), this.e().p(), ctu.this);
      }

      @Override
      public boolean j() {
         return !ctu.this.dQ();
      }
   }
}
