public class cdo extends cdg {
   static final aec<String> c = aef.a(cdo.class, aee.e);
   static final aec<ti> d = aef.a(cdo.class, aee.f);
   private final cor e = new cdo.a();
   private static final int f = 4;
   private int g;

   public cdo(bip<? extends cdo> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public cdo(cpq $$0, double $$1, double $$2, double $$3) {
      super(bip.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected civ j() {
      return cjd.na;
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(c, "");
      this.al().a(d, th.a);
   }

   @Override
   protected void a(qu $$0) {
      super.a($$0);
      this.e.b($$0);
      this.al().b(c, this.A().m());
      this.al().b(d, this.A().l());
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cdg.a t() {
      return cdg.a.g;
   }

   @Override
   public dfe w() {
      return csr.fN.n();
   }

   public cor A() {
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
   public bgt a(cbp $$0, bgs $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aec<?> $$0) {
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

   public class a extends cor {
      @Override
      public akn e() {
         return (akn)cdo.this.dK();
      }

      @Override
      public void f() {
         cdo.this.al().b(cdo.c, this.m());
         cdo.this.al().b(cdo.d, this.l());
      }

      @Override
      public ehi g() {
         return cdo.this.di();
      }

      public cdo h() {
         return cdo.this;
      }

      @Override
      public dt i() {
         return new dt(this, cdo.this.di(), cdo.this.bF(), this.e(), 2, this.n().getString(), cdo.this.H_(), this.e().n(), cdo.this);
      }

      @Override
      public boolean j() {
         return !cdo.this.dF();
      }
   }
}
