public class cqb extends cps {
   static final akg<String> c = akk.a(cqb.class, aki.e);
   static final akg<xd> d = akk.a(cqb.class, aki.f);
   private final ddg e = new cqb.a();
   private static final int i = 4;
   private int j;

   public cqb(btv<? extends cqb> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cqb(deg $$0, double $$1, double $$2, double $$3) {
      super(btv.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cvk aj_() {
      return cvt.nM;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xc.a);
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.e.b($$0, this.dU());
      this.at().a(c, this.F().m());
      this.at().a(d, this.F().l());
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      this.e.a($$0, this.dU());
   }

   @Override
   public cps.a y() {
      return cps.a.g;
   }

   @Override
   public duo A() {
      return dhl.fN.o();
   }

   public ddg F() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.j >= 4) {
         this.F().a(this.dS());
         this.j = this.ag;
      }
   }

   @Override
   public brp a(cnu $$0, bro $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.at().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.at().a(c));
      }
   }

   @Override
   public boolean cT() {
      return true;
   }

   public class a extends ddg {
      @Override
      public arh e() {
         return (arh)cqb.this.dS();
      }

      @Override
      public void f() {
         cqb.this.at().a(cqb.c, this.m());
         cqb.this.at().a(cqb.d, this.l());
      }

      @Override
      public eys g() {
         return cqb.this.dq();
      }

      public cqb h() {
         return cqb.this;
      }

      @Override
      public et i() {
         return new et(this, cqb.this.dq(), cqb.this.bR(), this.e(), 2, this.n().getString(), cqb.this.Q_(), this.e().o(), cqb.this);
      }

      @Override
      public boolean j() {
         return !cqb.this.dN();
      }
   }
}
