public class cpv extends cpm {
   static final akg<String> c = akk.a(cpv.class, aki.e);
   static final akg<xd> d = akk.a(cpv.class, aki.f);
   private final dcs e = new cpv.a();
   private static final int i = 4;
   private int j;

   public cpv(btq<? extends cpv> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cpv(dds $$0, double $$1, double $$2, double $$3) {
      super(btq.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cvg aj_() {
      return cvo.nM;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xc.a);
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.e.b($$0, this.dU());
      this.at().a(c, this.E().m());
      this.at().a(d, this.E().l());
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      this.e.a($$0, this.dU());
   }

   @Override
   public cpm.a x() {
      return cpm.a.g;
   }

   @Override
   public dua z() {
      return dgx.fN.o();
   }

   public dcs E() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.j >= 4) {
         this.E().a(this.dS());
         this.j = this.ag;
      }
   }

   @Override
   public brk a(cnp $$0, brj $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.at().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.at().a(c));
      }
   }

   @Override
   public boolean cT() {
      return true;
   }

   public class a extends dcs {
      @Override
      public arg e() {
         return (arg)cpv.this.dS();
      }

      @Override
      public void f() {
         cpv.this.at().a(cpv.c, this.m());
         cpv.this.at().a(cpv.d, this.l());
      }

      @Override
      public eye g() {
         return cpv.this.dq();
      }

      public cpv h() {
         return cpv.this;
      }

      @Override
      public et i() {
         return new et(this, cpv.this.dq(), cpv.this.bR(), this.e(), 2, this.n().getString(), cpv.this.Q_(), this.e().o(), cpv.this);
      }

      @Override
      public boolean j() {
         return !cpv.this.dN();
      }
   }
}
