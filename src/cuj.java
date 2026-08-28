public class cuj extends ctz {
   static final akj<String> b = akn.a(cuj.class, akl.e);
   static final akj<wy> c = akn.a(cuj.class, akl.f);
   private final dil d = new cuj.a();
   private static final int h = 4;
   private int i;

   public cuj(bwr<? extends cuj> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected czj o() {
      return czr.ov;
   }

   @Override
   public czn dH() {
      return new czn(czr.vX);
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
   public eat v() {
      return dmt.gm.m();
   }

   public dil q() {
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
   public bug a(crm $$0, buf $$1) {
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

   public class a extends dil {
      @Override
      public arq e() {
         return (arq)cuj.this.dU();
      }

      @Override
      public void f() {
         cuj.this.ar().a(cuj.b, this.m());
         cuj.this.ar().a(cuj.c, this.l());
      }

      @Override
      public ffc g() {
         return cuj.this.ds();
      }

      public cuj h() {
         return cuj.this;
      }

      @Override
      public ej i() {
         return new ej(this, cuj.this.ds(), cuj.this.bS(), this.e(), 2, this.n().getString(), cuj.this.m_(), this.e().p(), cuj.this);
      }

      @Override
      public boolean j() {
         return !cuj.this.dP();
      }
   }
}
