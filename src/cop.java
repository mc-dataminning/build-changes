public class cop extends cog {
   static final ajp<String> c = ajt.a(cop.class, ajr.e);
   static final ajp<wu> d = ajt.a(cop.class, ajr.f);
   private final dbh e = new cop.a();
   private static final int i = 4;
   private int j;

   public cop(bsn<? extends cop> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cop(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cty ag_() {
      return cug.nM;
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
      this.e.b($$0, this.dT());
      this.ar().a(c, this.B().m());
      this.ar().a(d, this.B().l());
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.e.a($$0, this.dT());
   }

   @Override
   public cog.a v() {
      return cog.a.g;
   }

   @Override
   public dsl x() {
      return dfk.fN.o();
   }

   public dbh B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ai - this.j >= 4) {
         this.B().a(this.dR());
         this.j = this.ai;
      }
   }

   @Override
   public bqh a(cml $$0, bqg $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajp<?> $$0) {
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
   public boolean cR() {
      return true;
   }

   public class a extends dbh {
      @Override
      public aqm e() {
         return (aqm)cop.this.dR();
      }

      @Override
      public void f() {
         cop.this.ar().a(cop.c, this.m());
         cop.this.ar().a(cop.d, this.l());
      }

      @Override
      public ewh g() {
         return cop.this.dp();
      }

      public cop h() {
         return cop.this;
      }

      @Override
      public eq i() {
         return new eq(this, cop.this.dp(), cop.this.bO(), this.e(), 2, this.n().getString(), cop.this.O_(), this.e().o(), cop.this);
      }

      @Override
      public boolean j() {
         return !cop.this.dM();
      }
   }
}
