public class cpa extends cos {
   static final akj<String> c = akn.a(cpa.class, akl.e);
   static final akj<xo> d = akn.a(cpa.class, akl.f);
   private final day e = new cpa.a();
   private static final int i = 4;
   private int j;

   public cpa(bsz<? extends cpa> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cpa(dbx $$0, double $$1, double $$2, double $$3) {
      super(bsz.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cuj ag_() {
      return cur.nM;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xn.a);
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
   public cos.a v() {
      return cos.a.g;
   }

   @Override
   public dsb x() {
      return dfa.fN.o();
   }

   public day B() {
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
   public bqt a(cmw $$0, bqs $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(akj<?> $$0) {
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

   public class a extends day {
      @Override
      public are e() {
         return (are)cpa.this.dP();
      }

      @Override
      public void f() {
         cpa.this.ap().a(cpa.c, this.m());
         cpa.this.ap().a(cpa.d, this.l());
      }

      @Override
      public evq g() {
         return cpa.this.dn();
      }

      public cpa h() {
         return cpa.this;
      }

      @Override
      public ep i() {
         return new ep(this, cpa.this.dn(), cpa.this.bM(), this.e(), 2, this.n().getString(), cpa.this.O_(), this.e().o(), cpa.this);
      }

      @Override
      public boolean j() {
         return !cpa.this.dK();
      }
   }
}
