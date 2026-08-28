public class cpb extends cot {
   static final akk<String> c = ako.a(cpb.class, akm.e);
   static final akk<xp> d = ako.a(cpb.class, akm.f);
   private final daz e = new cpb.a();
   private static final int i = 4;
   private int j;

   public cpb(bta<? extends cpb> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cpb(dby $$0, double $$1, double $$2, double $$3) {
      super(bta.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cuk ag_() {
      return cus.nM;
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
   public cot.a v() {
      return cot.a.g;
   }

   @Override
   public dsc x() {
      return dfb.fN.o();
   }

   public daz B() {
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
   public bqu a(cmx $$0, bqt $$1) {
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

   public class a extends daz {
      @Override
      public arf e() {
         return (arf)cpb.this.dP();
      }

      @Override
      public void f() {
         cpb.this.ap().a(cpb.c, this.m());
         cpb.this.ap().a(cpb.d, this.l());
      }

      @Override
      public evr g() {
         return cpb.this.dn();
      }

      public cpb h() {
         return cpb.this;
      }

      @Override
      public ep i() {
         return new ep(this, cpb.this.dn(), cpb.this.bM(), this.e(), 2, this.n().getString(), cpb.this.O_(), this.e().o(), cpb.this);
      }

      @Override
      public boolean j() {
         return !cpb.this.dK();
      }
   }
}
