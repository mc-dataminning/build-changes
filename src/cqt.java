public class cqt extends cqk {
   static final akl<String> c = akp.a(cqt.class, akn.e);
   static final akl<xi> d = akp.a(cqt.class, akn.f);
   private final deb e = new cqt.a();
   private static final int i = 4;
   private int j;

   public cqt(bul<? extends cqt> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cqt(dfb $$0, double $$1, double $$2, double $$3) {
      super(bul.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cvx al_() {
      return cwf.nM;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xh.a);
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.e.b($$0, this.dZ());
      this.aw().a(c, this.E().m());
      this.aw().a(d, this.E().l());
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      this.e.a($$0, this.dZ());
   }

   @Override
   public cqk.a y() {
      return cqk.a.g;
   }

   @Override
   public dvj A() {
      return dig.fN.m();
   }

   public deb E() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.j >= 4) {
         this.E().a(this.dX());
         this.j = this.ag;
      }
   }

   @Override
   public bsd a(com $$0, bsc $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.aw().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.aw().a(c));
      }
   }

   @Override
   public boolean cX() {
      return true;
   }

   public class a extends deb {
      @Override
      public arn e() {
         return (arn)cqt.this.dX();
      }

      @Override
      public void f() {
         cqt.this.aw().a(cqt.c, this.m());
         cqt.this.aw().a(cqt.d, this.l());
      }

      @Override
      public ezn g() {
         return cqt.this.dv();
      }

      public cqt h() {
         return cqt.this;
      }

      @Override
      public ew i() {
         return new ew(this, cqt.this.dv(), cqt.this.bV(), this.e(), 2, this.n().getString(), cqt.this.S_(), this.e().o(), cqt.this);
      }

      @Override
      public boolean j() {
         return !cqt.this.dS();
      }
   }
}
