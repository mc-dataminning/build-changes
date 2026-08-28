public class csa extends crq {
   static final ajx<String> b = akb.a(csa.class, ajz.e);
   static final ajx<wp> c = akb.a(csa.class, ajz.f);
   private final dga d = new csa.a();
   private static final int h = 4;
   private int i;

   public csa(bvi<? extends csa> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected cxd o() {
      return cxl.oq;
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.vO);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, wo.a);
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.d.b($$0, this.dW());
      this.au().a(b, this.q().m());
      this.au().a(c, this.q().l());
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      this.d.a($$0, this.dW());
   }

   @Override
   public dxq v() {
      return dkg.gi.m();
   }

   public dga q() {
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
   public bsy a(cpr $$0, bsx $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(ajx<?> $$0) {
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

   public class a extends dga {
      @Override
      public ard e() {
         return (ard)csa.this.dU();
      }

      @Override
      public void f() {
         csa.this.au().a(csa.b, this.m());
         csa.this.au().a(csa.c, this.l());
      }

      @Override
      public fbx g() {
         return csa.this.ds();
      }

      public csa h() {
         return csa.this;
      }

      @Override
      public ex i() {
         return new ex(this, csa.this.ds(), csa.this.bT(), this.e(), 2, this.n().getString(), csa.this.m_(), this.e().p(), csa.this);
      }

      @Override
      public boolean j() {
         return !csa.this.dP();
      }
   }
}
