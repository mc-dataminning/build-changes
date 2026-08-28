public class cpc extends cou {
   static final akk<String> c = ako.a(cpc.class, akm.e);
   static final akk<xp> d = ako.a(cpc.class, akm.f);
   private final dba e = new cpc.a();
   private static final int i = 4;
   private int j;

   public cpc(btb<? extends cpc> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cpc(dbz $$0, double $$1, double $$2, double $$3) {
      super(btb.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cul ag_() {
      return cut.nM;
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
   public cou.a v() {
      return cou.a.g;
   }

   @Override
   public dsd x() {
      return dfc.fN.o();
   }

   public dba B() {
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
   public bqv a(cmy $$0, bqu $$1) {
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

   public class a extends dba {
      @Override
      public arf e() {
         return (arf)cpc.this.dP();
      }

      @Override
      public void f() {
         cpc.this.ap().a(cpc.c, this.m());
         cpc.this.ap().a(cpc.d, this.l());
      }

      @Override
      public evs g() {
         return cpc.this.dn();
      }

      public cpc h() {
         return cpc.this;
      }

      @Override
      public ep i() {
         return new ep(this, cpc.this.dn(), cpc.this.bM(), this.e(), 2, this.n().getString(), cpc.this.O_(), this.e().o(), cpc.this);
      }

      @Override
      public boolean j() {
         return !cpc.this.dK();
      }
   }
}
