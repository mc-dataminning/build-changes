public class cfl extends cfd {
   static final afm<String> c = afp.a(cfl.class, afo.e);
   static final afm<ur> d = afp.a(cfl.class, afo.f);
   private final cqt e = new cfl.a();
   private static final int i = 4;
   private int j;

   public cfl(bkm<? extends cfl> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cfl(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected ckw ag_() {
      return cle.na;
   }

   @Override
   protected void b_() {
      super.b_();
      this.al().a(c, "");
      this.al().a(d, uq.a);
   }

   @Override
   protected void a(rz $$0) {
      super.a($$0);
      this.e.b($$0);
      this.al().b(c, this.B().m());
      this.al().b(d, this.B().l());
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cfd.a v() {
      return cfd.a.g;
   }

   @Override
   public dgw x() {
      return cuv.fN.o();
   }

   public cqt B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.B().a(this.dL());
         this.j = this.ah;
      }
   }

   @Override
   public biq a(cdm $$0, bip $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(afm<?> $$0) {
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

   public class a extends cqt {
      @Override
      public ama e() {
         return (ama)cfl.this.dL();
      }

      @Override
      public void f() {
         cfl.this.al().b(cfl.c, this.m());
         cfl.this.al().b(cfl.d, this.l());
      }

      @Override
      public eji g() {
         return cfl.this.dj();
      }

      public cfl h() {
         return cfl.this;
      }

      @Override
      public du i() {
         return new du(this, cfl.this.dj(), cfl.this.bF(), this.e(), 2, this.n().getString(), cfl.this.O_(), this.e().n(), cfl.this);
      }

      @Override
      public boolean j() {
         return !cfl.this.dG();
      }
   }
}
