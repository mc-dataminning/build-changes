public class coz extends cor {
   static final ajv<String> c = ajz.a(coz.class, ajx.e);
   static final ajv<wy> d = ajz.a(coz.class, ajx.f);
   private final dbv e = new coz.a();
   private static final int i = 4;
   private int j;

   public coz(bsw<? extends coz> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public coz(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cuj ag_() {
      return cur.nM;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, wx.a);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.e.b($$0, this.dS());
      this.ar().a(c, this.B().m());
      this.ar().a(d, this.B().l());
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      this.e.a($$0, this.dS());
   }

   @Override
   public cor.a v() {
      return cor.a.g;
   }

   @Override
   public dta x() {
      return dfy.fN.o();
   }

   public dbv B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ai - this.j >= 4) {
         this.B().a(this.dQ());
         this.j = this.ai;
      }
   }

   @Override
   public bqq a(cmv $$0, bqp $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajv<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.ar().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.ar().a(c));
      }
   }

   @Override
   public boolean cQ() {
      return true;
   }

   public class a extends dbv {
      @Override
      public aqt e() {
         return (aqt)coz.this.dQ();
      }

      @Override
      public void f() {
         coz.this.ar().a(coz.c, this.m());
         coz.this.ar().a(coz.d, this.l());
      }

      @Override
      public eww g() {
         return coz.this.do();
      }

      public coz h() {
         return coz.this;
      }

      @Override
      public et i() {
         return new et(this, coz.this.do(), coz.this.bN(), this.e(), 2, this.n().getString(), coz.this.O_(), this.e().o(), coz.this);
      }

      @Override
      public boolean j() {
         return !coz.this.dL();
      }
   }
}
