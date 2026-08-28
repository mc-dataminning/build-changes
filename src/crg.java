public class crg extends cqw {
   static final ajx<String> b = akb.a(crg.class, ajz.e);
   static final ajx<wo> c = akb.a(crg.class, ajz.f);
   private final dfi d = new crg.a();
   private static final int h = 4;
   private int i;

   public crg(bur<? extends crg> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected cwl u() {
      return cwt.oo;
   }

   @Override
   public cwp dJ() {
      return new cwp(cwt.vM);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, wn.a);
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.d.b($$0, this.dY());
      this.au().a(b, this.v().m());
      this.au().a(c, this.v().l());
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      this.d.a($$0, this.dY());
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
         this.v().a(this.dW());
         this.i = this.af;
      }
   }

   @Override
   public bsj a(cox $$0, bsi $$1) {
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

   @Override
   public boolean cW() {
      return true;
   }

   public class a extends dfi {
      @Override
      public arc e() {
         return (arc)crg.this.dW();
      }

      @Override
      public void f() {
         crg.this.au().a(crg.b, this.m());
         crg.this.au().a(crg.c, this.l());
      }

      @Override
      public fba g() {
         return crg.this.du();
      }

      public crg h() {
         return crg.this;
      }

      @Override
      public ex i() {
         return new ex(this, crg.this.du(), crg.this.bU(), this.e(), 2, this.n().getString(), crg.this.p_(), this.e().p(), crg.this);
      }

      @Override
      public boolean j() {
         return !crg.this.dR();
      }
   }
}
