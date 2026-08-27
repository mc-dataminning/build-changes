public class coe extends cnw {
   static final ajy<String> c = akc.a(coe.class, aka.e);
   static final ajy<xe> d = akc.a(coe.class, aka.f);
   private final dbb e = new coe.a();
   private static final int i = 4;
   private int j;

   public coe(bsb<? extends coe> $$0, dca $$1) {
      super($$0, $$1);
   }

   public coe(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.x, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cuc ah_() {
      return cuk.pc;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xd.a);
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.e.b($$0, this.dY());
      this.ap().a(c, this.B().m());
      this.ap().a(d, this.B().l());
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      this.e.a($$0, this.dY());
   }

   @Override
   public cnw.a u() {
      return cnw.a.g;
   }

   @Override
   public dtc x() {
      return dfe.gG.n();
   }

   public dbb B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.am - this.j >= 4) {
         this.B().a(this.dU());
         this.j = this.am;
      }
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajy<?> $$0) {
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
   public boolean cU() {
      return true;
   }

   public class a extends dbb {
      @Override
      public aqt e() {
         return (aqt)coe.this.dU();
      }

      @Override
      public void f() {
         coe.this.ap().a(coe.c, this.m());
         coe.this.ap().a(coe.d, this.l());
      }

      @Override
      public ewu g() {
         return coe.this.ds();
      }

      public coe h() {
         return coe.this;
      }

      @Override
      public eh i() {
         return new eh(this, coe.this.ds(), coe.this.bR(), this.e(), 2, this.n().getString(), coe.this.P_(), this.e().o(), coe.this);
      }

      @Override
      public boolean j() {
         return !coe.this.dP();
      }
   }
}
