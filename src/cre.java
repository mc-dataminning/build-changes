public class cre extends cqu {
   static final ajx<String> b = akb.a(cre.class, ajz.e);
   static final ajx<wo> c = akb.a(cre.class, ajz.f);
   private final dfg d = new cre.a();
   private static final int h = 4;
   private int i;

   public cre(buq<? extends cre> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected cwj u() {
      return cwr.oo;
   }

   @Override
   public cwn dJ() {
      return new cwn(cwr.vM);
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
   public dwv w() {
      return djm.gi.m();
   }

   public dfg v() {
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
   public bsi a(cov $$0, bsh $$1) {
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

   public class a extends dfg {
      @Override
      public arc e() {
         return (arc)cre.this.dW();
      }

      @Override
      public void f() {
         cre.this.au().a(cre.b, this.m());
         cre.this.au().a(cre.c, this.l());
      }

      @Override
      public fay g() {
         return cre.this.du();
      }

      public cre h() {
         return cre.this;
      }

      @Override
      public ex i() {
         return new ex(this, cre.this.du(), cre.this.bU(), this.e(), 2, this.n().getString(), cre.this.p_(), this.e().p(), cre.this);
      }

      @Override
      public boolean j() {
         return !cre.this.dR();
      }
   }
}
