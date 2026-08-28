public class cpb extends cot {
   static final ajw<String> c = aka.a(cpb.class, ajy.e);
   static final ajw<wz> d = aka.a(cpb.class, ajy.f);
   private final dbx e = new cpb.a();
   private static final int i = 4;
   private int j;

   public cpb(bsx<? extends cpb> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cpb(dcw $$0, double $$1, double $$2, double $$3) {
      super(bsx.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cul ak_() {
      return cut.nM;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, wy.a);
   }

   @Override
   protected void a(ub $$0) {
      super.a($$0);
      this.e.b($$0, this.dR());
      this.ar().a(c, this.B().m());
      this.ar().a(d, this.B().l());
   }

   @Override
   protected void b(ub $$0) {
      super.b($$0);
      this.e.a($$0, this.dR());
   }

   @Override
   public cot.a v() {
      return cot.a.g;
   }

   @Override
   public dtc x() {
      return dga.fN.o();
   }

   public dbx B() {
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
   public bqr a(cmx $$0, bqq $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajw<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.ar().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.ar().a(c));
      }
   }

   @Override
   public boolean cQ() {
      return true;
   }

   public class a extends dbx {
      @Override
      public aqu e() {
         return (aqu)cpb.this.dP();
      }

      @Override
      public void f() {
         cpb.this.ar().a(cpb.c, this.m());
         cpb.this.ar().a(cpb.d, this.l());
      }

      @Override
      public exa g() {
         return cpb.this.dn();
      }

      public cpb h() {
         return cpb.this;
      }

      @Override
      public et i() {
         return new et(this, cpb.this.dn(), cpb.this.bN(), this.e(), 2, this.n().getString(), cpb.this.S_(), this.e().o(), cpb.this);
      }

      @Override
      public boolean j() {
         return !cpb.this.dK();
      }
   }
}
