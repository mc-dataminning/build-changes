public class clw extends clo {
   static final aiy<String> c = ajc.a(clw.class, aja.e);
   static final aiy<wg> d = ajc.a(clw.class, aja.f);
   private final cxy e = new clw.a();
   private static final int i = 4;
   private int j;

   public clw(bqb<? extends clw> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public clw(cyx $$0, double $$1, double $$2, double $$3) {
      super(bqb.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cre ag_() {
      return crm.nL;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, wf.a);
   }

   @Override
   protected void a(tm $$0) {
      super.a($$0);
      this.e.b($$0, this.dO());
      this.an().a(c, this.B().m());
      this.an().a(d, this.B().l());
   }

   @Override
   protected void b(tm $$0) {
      super.b($$0);
      this.e.a($$0, this.dO());
   }

   @Override
   public clo.a v() {
      return clo.a.g;
   }

   @Override
   public doz x() {
      return dca.fN.n();
   }

   public cxy B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.B().a(this.dM());
         this.j = this.ah;
      }
   }

   @Override
   public boa a(cjt $$0, bnz $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aiy<?> $$0) {
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
   public boolean cM() {
      return true;
   }

   public class a extends cxy {
      @Override
      public aps e() {
         return (aps)clw.this.dM();
      }

      @Override
      public void f() {
         clw.this.an().a(clw.c, this.m());
         clw.this.an().a(clw.d, this.l());
      }

      @Override
      public esa g() {
         return clw.this.dk();
      }

      public clw h() {
         return clw.this;
      }

      @Override
      public du i() {
         return new du(this, clw.this.dk(), clw.this.bJ(), this.e(), 2, this.n().getString(), clw.this.O_(), this.e().o(), clw.this);
      }

      @Override
      public boolean j() {
         return !clw.this.dH();
      }
   }
}
