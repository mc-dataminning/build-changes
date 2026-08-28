public class cqe extends cpv {
   static final akh<String> c = akl.a(cqe.class, akj.e);
   static final akh<xe> d = akl.a(cqe.class, akj.f);
   private final ddj e = new cqe.a();
   private static final int i = 4;
   private int j;

   public cqe(bty<? extends cqe> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cqe(dej $$0, double $$1, double $$2, double $$3) {
      super(bty.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cvn ak_() {
      return cvw.nM;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xd.a);
   }

   @Override
   protected void a(ug $$0) {
      super.a($$0);
      this.e.b($$0, this.dU());
      this.at().a(c, this.F().m());
      this.at().a(d, this.F().l());
   }

   @Override
   protected void b(ug $$0) {
      super.b($$0);
      this.e.a($$0, this.dU());
   }

   @Override
   public cpv.a y() {
      return cpv.a.g;
   }

   @Override
   public dus A() {
      return dho.fN.n();
   }

   public ddj F() {
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
   public brs a(cnx $$0, brr $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(akh<?> $$0) {
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

   public class a extends ddj {
      @Override
      public arj e() {
         return (arj)cqe.this.dS();
      }

      @Override
      public void f() {
         cqe.this.at().a(cqe.c, this.m());
         cqe.this.at().a(cqe.d, this.l());
      }

      @Override
      public eyw g() {
         return cqe.this.dq();
      }

      public cqe h() {
         return cqe.this;
      }

      @Override
      public eu i() {
         return new eu(this, cqe.this.dq(), cqe.this.bR(), this.e(), 2, this.n().getString(), cqe.this.R_(), this.e().o(), cqe.this);
      }

      @Override
      public boolean j() {
         return !cqe.this.dN();
      }
   }
}
