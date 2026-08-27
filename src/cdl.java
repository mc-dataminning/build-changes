public class cdl extends cdd {
   static final adz<String> c = aec.a(cdl.class, aeb.e);
   static final adz<tf> d = aec.a(cdl.class, aeb.f);
   private final col e = new cdl.a();
   private static final int f = 4;
   private int g;

   public cdl(bim<? extends cdl> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cdl(cpl $$0, double $$1, double $$2, double $$3) {
      super(bim.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cis j() {
      return cja.na;
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
   public cdd.a t() {
      return cdd.a.g;
   }

   @Override
   public dez w() {
      return csm.fN.n();
   }

   public col A() {
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
   public bgq a(cbm $$0, bgp $$1) {
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

   public class a extends col {
      @Override
      public akk e() {
         return (akk)cdl.this.dK();
      }

      @Override
      public void f() {
         cdl.this.al().b(cdl.c, this.m());
         cdl.this.al().b(cdl.d, this.l());
      }

      @Override
      public ehd g() {
         return cdl.this.di();
      }

      public cdl h() {
         return cdl.this;
      }

      @Override
      public dr i() {
         return new dr(this, cdl.this.di(), cdl.this.bF(), this.e(), 2, this.n().getString(), cdl.this.H_(), this.e().n(), cdl.this);
      }

      @Override
      public boolean j() {
         return !cdl.this.dF();
      }
   }
}
