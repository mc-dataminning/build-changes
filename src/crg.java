public class crg extends cqw {
   static final ajy<String> b = akc.a(crg.class, aka.e);
   static final ajy<wp> c = akc.a(crg.class, aka.f);
   private final dfi d = new crg.a();
   private static final int h = 4;
   private int i;

   public crg(bus<? extends crg> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected cwl u() {
      return cwt.oo;
   }

   @Override
   public cwp dI() {
      return new cwp(cwt.vM);
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
   public dwx w() {
      return djo.gi.m();
   }

   public dfi v() {
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
   public bsk a(cox $$0, bsj $$1) {
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

   public class a extends dfi {
      @Override
      public ard e() {
         return (ard)crg.this.dV();
      }

      @Override
      public void f() {
         crg.this.au().a(crg.b, this.m());
         crg.this.au().a(crg.c, this.l());
      }

      @Override
      public fba g() {
         return crg.this.dt();
      }

      public crg h() {
         return crg.this;
      }

      @Override
      public ex i() {
         return new ex(this, crg.this.dt(), crg.this.bU(), this.e(), 2, this.n().getString(), crg.this.p_(), this.e().p(), crg.this);
      }

      @Override
      public boolean j() {
         return !crg.this.dQ();
      }
   }
}
