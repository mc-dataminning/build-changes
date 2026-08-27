public class cft extends cfl {
   static final afo<String> c = afr.a(cft.class, afq.e);
   static final afo<ur> d = afr.a(cft.class, afq.f);
   private final crb e = new cft.a();
   private static final int i = 4;
   private int j;

   public cft(bku<? extends cft> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cft(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cle ag_() {
      return clm.nL;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an().a(c, "");
      this.an().a(d, uq.a);
   }

   @Override
   protected void a(rz $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cfl.a w() {
      return cfl.a.g;
   }

   @Override
   public dhi y() {
      return cvc.fN.o();
   }

   public crb C() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.C().a(this.dN());
         this.j = this.ah;
      }
   }

   @Override
   public bix a(cdu $$0, biw $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(afo<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.an().b(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.an().b(c));
      }
   }

   @Override
   public boolean cN() {
      return true;
   }

   public class a extends crb {
      @Override
      public ame e() {
         return (ame)cft.this.dN();
      }

      @Override
      public void f() {
         cft.this.an().b(cft.c, this.m());
         cft.this.an().b(cft.d, this.l());
      }

      @Override
      public eju g() {
         return cft.this.dl();
      }

      public cft h() {
         return cft.this;
      }

      @Override
      public du i() {
         return new du(this, cft.this.dl(), cft.this.bG(), this.e(), 2, this.n().getString(), cft.this.P_(), this.e().n(), cft.this);
      }

      @Override
      public boolean j() {
         return !cft.this.dI();
      }
   }
}
