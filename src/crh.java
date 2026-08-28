public class crh extends cqx {
   static final ajy<String> b = akc.a(crh.class, aka.e);
   static final ajy<wp> c = akc.a(crh.class, aka.f);
   private final dfj d = new crh.a();
   private static final int h = 4;
   private int i;

   public crh(but<? extends crh> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected cwm u() {
      return cwu.oo;
   }

   @Override
   public cwq dI() {
      return new cwq(cwu.vM);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, wo.a);
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.d.b($$0, this.dX());
      this.au().a(b, this.v().m());
      this.au().a(c, this.v().l());
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      this.d.a($$0, this.dX());
   }

   @Override
   public dwy w() {
      return djp.gi.m();
   }

   public dfj v() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.v().a(this.dV());
         this.i = this.af;
      }
   }

   @Override
   public bsl a(coy $$0, bsk $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(ajy<?> $$0) {
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

   public class a extends dfj {
      @Override
      public ard e() {
         return (ard)crh.this.dV();
      }

      @Override
      public void f() {
         crh.this.au().a(crh.b, this.m());
         crh.this.au().a(crh.c, this.l());
      }

      @Override
      public fbb g() {
         return crh.this.dt();
      }

      public crh h() {
         return crh.this;
      }

      @Override
      public ex i() {
         return new ex(this, crh.this.dt(), crh.this.bU(), this.e(), 2, this.n().getString(), crh.this.p_(), this.e().p(), crh.this);
      }

      @Override
      public boolean j() {
         return !crh.this.dQ();
      }
   }
}
