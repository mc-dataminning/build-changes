public class coo extends cof {
   static final ajp<String> c = ajt.a(coo.class, ajr.e);
   static final ajp<wu> d = ajt.a(coo.class, ajr.f);
   private final dbg e = new coo.a();
   private static final int i = 4;
   private int j;

   public coo(bsm<? extends coo> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public coo(dcf $$0, double $$1, double $$2, double $$3) {
      super(bsm.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected ctx ag_() {
      return cuf.nM;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, wt.a);
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.e.b($$0, this.dS());
      this.aq().a(c, this.B().m());
      this.aq().a(d, this.B().l());
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.e.a($$0, this.dS());
   }

   @Override
   public cof.a v() {
      return cof.a.g;
   }

   @Override
   public dsk x() {
      return dfj.fN.o();
   }

   public dbg B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ai - this.j >= 4) {
         this.B().a(this.dQ());
         this.j = this.ai;
      }
   }

   @Override
   public bqg a(cmk $$0, bqf $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.aq().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.aq().a(c));
      }
   }

   @Override
   public boolean cQ() {
      return true;
   }

   public class a extends dbg {
      @Override
      public aqm e() {
         return (aqm)coo.this.dQ();
      }

      @Override
      public void f() {
         coo.this.aq().a(coo.c, this.m());
         coo.this.aq().a(coo.d, this.l());
      }

      @Override
      public ewf g() {
         return coo.this.do();
      }

      public coo h() {
         return coo.this;
      }

      @Override
      public eq i() {
         return new eq(this, coo.this.do(), coo.this.bN(), this.e(), 2, this.n().getString(), coo.this.O_(), this.e().o(), coo.this);
      }

      @Override
      public boolean j() {
         return !coo.this.dL();
      }
   }
}
