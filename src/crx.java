public class crx extends crn {
   static final aks<String> b = akw.a(crx.class, aku.e);
   static final aks<xk> c = akw.a(crx.class, aku.f);
   private final dfz d = new crx.a();
   private static final int h = 4;
   private int i;

   public crx(bvi<? extends crx> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected cxc u() {
      return cxk.oo;
   }

   @Override
   public cxg dJ() {
      return new cxg(cxk.vM);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, xj.a);
   }

   @Override
   protected void a(um $$0) {
      super.a($$0);
      this.d.b($$0, this.dY());
      this.au().a(b, this.v().m());
      this.au().a(c, this.v().l());
   }

   @Override
   protected void b(um $$0) {
      super.b($$0);
      this.d.a($$0, this.dY());
   }

   @Override
   public dxo w() {
      return dkf.gi.m();
   }

   public dfz v() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.v().a(this.dW());
         this.i = this.af;
      }
   }

   @Override
   public bta a(cpo $$0, bsz $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(aks<?> $$0) {
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

   @Override
   public boolean cW() {
      return true;
   }

   public class a extends dfz {
      @Override
      public arx e() {
         return (arx)crx.this.dW();
      }

      @Override
      public void f() {
         crx.this.au().a(crx.b, this.m());
         crx.this.au().a(crx.c, this.l());
      }

      @Override
      public fbr g() {
         return crx.this.du();
      }

      public crx h() {
         return crx.this;
      }

      @Override
      public ew i() {
         return new ew(this, crx.this.du(), crx.this.bU(), this.e(), 2, this.n().getString(), crx.this.p_(), this.e().p(), crx.this);
      }

      @Override
      public boolean j() {
         return !crx.this.dR();
      }
   }
}
