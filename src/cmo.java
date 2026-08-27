public class cmo extends cmg {
   static final ajk<String> c = ajo.a(cmo.class, ajm.e);
   static final ajk<ws> d = ajo.a(cmo.class, ajm.f);
   private final cyv e = new cmo.a();
   private static final int i = 4;
   private int j;

   public cmo(bqr<? extends cmo> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cmo(czu $$0, double $$1, double $$2, double $$3) {
      super(bqr.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cry ag_() {
      return csg.nM;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, wr.a);
   }

   @Override
   protected void a(ty $$0) {
      super.a($$0);
      this.e.b($$0, this.dP());
      this.an().a(c, this.B().m());
      this.an().a(d, this.B().l());
   }

   @Override
   protected void b(ty $$0) {
      super.b($$0);
      this.e.a($$0, this.dP());
   }

   @Override
   public cmg.a v() {
      return cmg.a.g;
   }

   @Override
   public dpy x() {
      return dcx.fN.n();
   }

   public cyv B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ai - this.j >= 4) {
         this.B().a(this.dN());
         this.j = this.ai;
      }
   }

   @Override
   public boq a(ckl $$0, bop $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajk<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.an().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.an().a(c));
      }
   }

   @Override
   public boolean cN() {
      return true;
   }

   public class a extends cyv {
      @Override
      public aqe e() {
         return (aqe)cmo.this.dN();
      }

      @Override
      public void f() {
         cmo.this.an().a(cmo.c, this.m());
         cmo.this.an().a(cmo.d, this.l());
      }

      @Override
      public etf g() {
         return cmo.this.dl();
      }

      public cmo h() {
         return cmo.this;
      }

      @Override
      public ec i() {
         return new ec(this, cmo.this.dl(), cmo.this.bK(), this.e(), 2, this.n().getString(), cmo.this.O_(), this.e().o(), cmo.this);
      }

      @Override
      public boolean j() {
         return !cmo.this.dI();
      }
   }
}
