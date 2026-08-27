public class cdm extends cde {
   static final adz<String> c = aec.a(cdm.class, aeb.e);
   static final adz<tf> d = aec.a(cdm.class, aeb.f);
   private final com e = new cdm.a();
   private static final int f = 4;
   private int g;

   public cdm(bim<? extends cdm> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public cdm(cpm $$0, double $$1, double $$2, double $$3) {
      super(bim.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cit j() {
      return cjb.na;
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(c, "");
      this.al().a(d, te.a);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.e.b($$0);
      this.al().b(c, this.A().m());
      this.al().b(d, this.A().l());
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cde.a t() {
      return cde.a.g;
   }

   @Override
   public dfa w() {
      return csn.fN.n();
   }

   public com A() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.g >= 4) {
         this.A().a(this.dK());
         this.g = this.ah;
      }
   }

   @Override
   public bgq a(cbn $$0, bgp $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(adz<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.al().b(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.al().b(c));
      }
   }

   @Override
   public boolean cM() {
      return true;
   }

   public class a extends com {
      @Override
      public akk e() {
         return (akk)cdm.this.dK();
      }

      @Override
      public void f() {
         cdm.this.al().b(cdm.c, this.m());
         cdm.this.al().b(cdm.d, this.l());
      }

      @Override
      public ehe g() {
         return cdm.this.di();
      }

      public cdm h() {
         return cdm.this;
      }

      @Override
      public dr i() {
         return new dr(this, cdm.this.di(), cdm.this.bF(), this.e(), 2, this.n().getString(), cdm.this.H_(), this.e().n(), cdm.this);
      }

      @Override
      public boolean j() {
         return !cdm.this.dF();
      }
   }
}
