public class cow extends coo {
   static final akg<String> c = akk.a(cow.class, aki.e);
   static final akg<xl> d = akk.a(cow.class, aki.f);
   private final dau e = new cow.a();
   private static final int i = 4;
   private int j;

   public cow(bsv<? extends cow> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cow(dbt $$0, double $$1, double $$2, double $$3) {
      super(bsv.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cuf ah_() {
      return cun.nM;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xk.a);
   }

   @Override
   protected void a(ur $$0) {
      super.a($$0);
      this.e.b($$0, this.dR());
      this.ap().a(c, this.B().m());
      this.ap().a(d, this.B().l());
   }

   @Override
   protected void b(ur $$0) {
      super.b($$0);
      this.e.a($$0, this.dR());
   }

   @Override
   public coo.a v() {
      return coo.a.g;
   }

   @Override
   public drx x() {
      return dew.fN.n();
   }

   public dau B() {
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
   public bqp a(cms $$0, bqo $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(akg<?> $$0) {
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

   public class a extends dau {
      @Override
      public arb e() {
         return (arb)cow.this.dP();
      }

      @Override
      public void f() {
         cow.this.ap().a(cow.c, this.m());
         cow.this.ap().a(cow.d, this.l());
      }

      @Override
      public evm g() {
         return cow.this.dn();
      }

      public cow h() {
         return cow.this;
      }

      @Override
      public ep i() {
         return new ep(this, cow.this.dn(), cow.this.bM(), this.e(), 2, this.n().getString(), cow.this.O_(), this.e().o(), cow.this);
      }

      @Override
      public boolean j() {
         return !cow.this.dK();
      }
   }
}
