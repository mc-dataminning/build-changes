public class cjm extends cje {
   static final aie<String> c = aih.a(cjm.class, aig.e);
   static final aie<vq> d = aih.a(cjm.class, aig.f);
   private final cus e = new cjm.a();
   private static final int i = 4;
   private int j;

   public cjm(bnw<? extends cjm> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cjm(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.u, $$0, $$1, $$2, $$3);
   }

   @Override
   protected coy ai_() {
      return cpg.nL;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(c, "");
      this.an().a(d, vp.a);
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      this.e.b($$0);
      this.an().b(c, this.C().m());
      this.an().b(d, this.C().l());
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public cje.a w() {
      return cje.a.g;
   }

   @Override
   public dlj y() {
      return cyu.fN.o();
   }

   public cus C() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.j >= 4) {
         this.C().a(this.dM());
         this.j = this.ag;
      }
   }

   @Override
   public blw a(chl $$0, blv $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aie<?> $$0) {
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
   public boolean cM() {
      return true;
   }

   public class a extends cus {
      @Override
      public aow e() {
         return (aow)cjm.this.dM();
      }

      @Override
      public void f() {
         cjm.this.an().b(cjm.c, this.m());
         cjm.this.an().b(cjm.d, this.l());
      }

      @Override
      public enz g() {
         return cjm.this.dk();
      }

      public cjm h() {
         return cjm.this;
      }

      @Override
      public du i() {
         return new du(this, cjm.this.dk(), cjm.this.bG(), this.e(), 2, this.n().getString(), cjm.this.Q_(), this.e().o(), cjm.this);
      }

      @Override
      public boolean j() {
         return !cjm.this.dH();
      }
   }
}
