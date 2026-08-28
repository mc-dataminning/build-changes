public class crf extends cqv {
   static final ajy<String> b = akc.a(crf.class, aka.e);
   static final ajy<wp> c = akc.a(crf.class, aka.f);
   private final dfh d = new crf.a();
   private static final int h = 4;
   private int i;

   public crf(bur<? extends crf> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected cwk u() {
      return cws.oo;
   }

   @Override
   public cwo dI() {
      return new cwo(cws.vM);
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
   public dww w() {
      return djn.gi.m();
   }

   public dfh v() {
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
   public bsj a(cow $$0, bsi $$1) {
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

   public class a extends dfh {
      @Override
      public ard e() {
         return (ard)crf.this.dV();
      }

      @Override
      public void f() {
         crf.this.au().a(crf.b, this.m());
         crf.this.au().a(crf.c, this.l());
      }

      @Override
      public faz g() {
         return crf.this.dt();
      }

      public crf h() {
         return crf.this;
      }

      @Override
      public ex i() {
         return new ex(this, crf.this.dt(), crf.this.bU(), this.e(), 2, this.n().getString(), crf.this.p_(), this.e().p(), crf.this);
      }

      @Override
      public boolean j() {
         return !crf.this.dQ();
      }
   }
}
