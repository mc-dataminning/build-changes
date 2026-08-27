public class cnz extends cnr {
   static final ajr<String> c = ajv.a(cnz.class, ajt.e);
   static final ajr<wx> d = ajv.a(cnz.class, ajt.f);
   private final czy e = new cnz.a();
   private static final int i = 4;
   private int j;

   public cnz(bsa<? extends cnz> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cnz(dax $$0, double $$1, double $$2, double $$3) {
      super(bsa.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected ctj ag_() {
      return ctr.nM;
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, ww.a);
   }

   @Override
   protected void a(ud $$0) {
      super.a($$0);
      this.e.b($$0, this.dR());
      this.ap().a(c, this.B().m());
      this.ap().a(d, this.B().l());
   }

   @Override
   protected void b(ud $$0) {
      super.b($$0);
      this.e.a($$0, this.dR());
   }

   @Override
   public cnr.a v() {
      return cnr.a.g;
   }

   @Override
   public drb x() {
      return dea.fN.n();
   }

   public czy B() {
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
   public bpu a(clw $$0, bpt $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajr<?> $$0) {
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

   public class a extends czy {
      @Override
      public aqm e() {
         return (aqm)cnz.this.dP();
      }

      @Override
      public void f() {
         cnz.this.ap().a(cnz.c, this.m());
         cnz.this.ap().a(cnz.d, this.l());
      }

      @Override
      public euk g() {
         return cnz.this.dn();
      }

      public cnz h() {
         return cnz.this;
      }

      @Override
      public ee i() {
         return new ee(this, cnz.this.dn(), cnz.this.bM(), this.e(), 2, this.n().getString(), cnz.this.O_(), this.e().o(), cnz.this);
      }

      @Override
      public boolean j() {
         return !cnz.this.dK();
      }
   }
}
