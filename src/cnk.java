public class cnk extends cnc {
   static final ajm<String> c = ajq.a(cnk.class, ajo.e);
   static final ajm<wu> d = ajq.a(cnk.class, ajo.f);
   private final cze e = new cnk.a();
   private static final int i = 4;
   private int j;

   public cnk(brn<? extends cnk> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cnk(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected csu ag_() {
      return ctc.nM;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, wt.a);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.e.b($$0, this.dP());
      this.an().a(c, this.B().m());
      this.an().a(d, this.B().l());
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      this.e.a($$0, this.dP());
   }

   @Override
   public cnc.a v() {
      return cnc.a.g;
   }

   @Override
   public dqh x() {
      return ddg.fN.n();
   }

   public cze B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ai - this.j >= 4) {
         this.B().a(this.dN());
         this.j = this.ai;
      }
   }

   @Override
   public bpm a(clh $$0, bpl $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajm<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.an().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.an().a(c));
      }
   }

   @Override
   public boolean cN() {
      return true;
   }

   public class a extends cze {
      @Override
      public aqh e() {
         return (aqh)cnk.this.dN();
      }

      @Override
      public void f() {
         cnk.this.an().a(cnk.c, this.m());
         cnk.this.an().a(cnk.d, this.l());
      }

      @Override
      public etp g() {
         return cnk.this.dl();
      }

      public cnk h() {
         return cnk.this;
      }

      @Override
      public ed i() {
         return new ed(this, cnk.this.dl(), cnk.this.bK(), this.e(), 2, this.n().getString(), cnk.this.O_(), this.e().o(), cnk.this);
      }

      @Override
      public boolean j() {
         return !cnk.this.dI();
      }
   }
}
