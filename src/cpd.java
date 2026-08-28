public class cpd extends cov {
   static final akk<String> c = ako.a(cpd.class, akm.e);
   static final akk<xp> d = ako.a(cpd.class, akm.f);
   private final dbb e = new cpd.a();
   private static final int i = 4;
   private int j;

   public cpd(btc<? extends cpd> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cpd(dca $$0, double $$1, double $$2, double $$3) {
      super(btc.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cum ag_() {
      return cuu.nM;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xo.a);
   }

   @Override
   protected void a(us $$0) {
      super.a($$0);
      this.e.b($$0, this.dR());
      this.ap().a(c, this.B().m());
      this.ap().a(d, this.B().l());
   }

   @Override
   protected void b(us $$0) {
      super.b($$0);
      this.e.a($$0, this.dR());
   }

   @Override
   public cov.a v() {
      return cov.a.g;
   }

   @Override
   public dse x() {
      return dfd.fN.o();
   }

   public dbb B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ai - this.j >= 4) {
         this.B().a(this.dP());
         this.j = this.ai;
      }
   }

   @Override
   public bqw a(cmz $$0, bqv $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.ap().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.ap().a(c));
      }
   }

   @Override
   public boolean cP() {
      return true;
   }

   public class a extends dbb {
      @Override
      public arf e() {
         return (arf)cpd.this.dP();
      }

      @Override
      public void f() {
         cpd.this.ap().a(cpd.c, this.m());
         cpd.this.ap().a(cpd.d, this.l());
      }

      @Override
      public evt g() {
         return cpd.this.dn();
      }

      public cpd h() {
         return cpd.this;
      }

      @Override
      public ep i() {
         return new ep(this, cpd.this.dn(), cpd.this.bM(), this.e(), 2, this.n().getString(), cpd.this.O_(), this.e().o(), cpd.this);
      }

      @Override
      public boolean j() {
         return !cpd.this.dK();
      }
   }
}
