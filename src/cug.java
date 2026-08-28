public class cug extends ctw {
   static final akj<String> b = akn.a(cug.class, akl.e);
   static final akj<wy> c = akn.a(cug.class, akl.f);
   private final dii d = new cug.a();
   private static final int h = 4;
   private int i;

   public cug(bwr<? extends cug> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected czg o() {
      return czo.ov;
   }

   @Override
   public czk dH() {
      return new czk(czo.vX);
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
      this.d.b($$0, this.dW());
      this.ar().a(b, this.q().m());
      this.ar().a(c, this.q().l());
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      this.d.a($$0, this.dW());
   }

   @Override
   public eao v() {
      return dmo.gm.m();
   }

   public dii q() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.q().a(this.dU());
         this.i = this.af;
      }
   }

   @Override
   public bug a(crj $$0, buf $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(akj<?> $$0) {
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

   public class a extends dii {
      @Override
      public arq e() {
         return (arq)cug.this.dU();
      }

      @Override
      public void f() {
         cug.this.ar().a(cug.b, this.m());
         cug.this.ar().a(cug.c, this.l());
      }

      @Override
      public fex g() {
         return cug.this.ds();
      }

      public cug h() {
         return cug.this;
      }

      @Override
      public ej i() {
         return new ej(this, cug.this.ds(), cug.this.bS(), this.e(), 2, this.n().getString(), cug.this.m_(), this.e().p(), cug.this);
      }

      @Override
      public boolean j() {
         return !cug.this.dP();
      }
   }
}
