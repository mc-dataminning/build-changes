public class cdk extends cdc {
   static final adx<String> c = aea.a(cdk.class, adz.e);
   static final adx<te> d = aea.a(cdk.class, adz.f);
   private final cok e = new cdk.a();
   private static final int f = 4;
   private int g;

   public cdk(bik<? extends cdk> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cdk(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cir j() {
      return ciz.na;
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(c, "");
      this.al().a(d, td.a);
   }

   @Override
   protected void a(qs $$0) {
      super.a($$0);
      this.e.b($$0);
      this.al().b(c, this.A().m());
      this.al().b(d, this.A().l());
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cdc.a t() {
      return cdc.a.g;
   }

   @Override
   public dey w() {
      return csl.fN.n();
   }

   public cok A() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.g >= 4) {
         this.A().a(this.dK());
         this.g = this.ah;
      }
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(adx<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.al().b(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.al().b(c));
      }
   }

   @Override
   public boolean cM() {
      return true;
   }

   public class a extends cok {
      @Override
      public aki e() {
         return (aki)cdk.this.dK();
      }

      @Override
      public void f() {
         cdk.this.al().b(cdk.c, this.m());
         cdk.this.al().b(cdk.d, this.l());
      }

      @Override
      public ehf g() {
         return cdk.this.di();
      }

      public cdk h() {
         return cdk.this;
      }

      @Override
      public ds i() {
         return new ds(this, cdk.this.di(), cdk.this.bF(), this.e(), 2, this.n().getString(), cdk.this.H_(), this.e().n(), cdk.this);
      }

      @Override
      public boolean j() {
         return !cdk.this.dF();
      }
   }
}
