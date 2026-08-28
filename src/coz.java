public class coz extends cor {
   static final akj<String> c = akn.a(coz.class, akl.e);
   static final akj<xo> d = akn.a(coz.class, akl.f);
   private final dax e = new coz.a();
   private static final int i = 4;
   private int j;

   public coz(bsy<? extends coz> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public coz(dbw $$0, double $$1, double $$2, double $$3) {
      super(bsy.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cui ah_() {
      return cuq.nM;
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
   public cor.a v() {
      return cor.a.g;
   }

   @Override
   public dsa x() {
      return dez.fN.o();
   }

   public dax B() {
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
   public bqs a(cmv $$0, bqr $$1) {
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

   public class a extends dax {
      @Override
      public are e() {
         return (are)coz.this.dP();
      }

      @Override
      public void f() {
         coz.this.ap().a(coz.c, this.m());
         coz.this.ap().a(coz.d, this.l());
      }

      @Override
      public evp g() {
         return coz.this.dn();
      }

      public coz h() {
         return coz.this;
      }

      @Override
      public ep i() {
         return new ep(this, coz.this.dn(), coz.this.bM(), this.e(), 2, this.n().getString(), coz.this.O_(), this.e().o(), coz.this);
      }

      @Override
      public boolean j() {
         return !coz.this.dK();
      }
   }
}
