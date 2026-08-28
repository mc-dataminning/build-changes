public class csr extends csh {
   static final akg<String> b = akk.a(csr.class, aki.e);
   static final akg<wv> c = akk.a(csr.class, aki.f);
   private final dgq d = new csr.a();
   private static final int h = 4;
   private int i;

   public csr(bwb<? extends csr> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected cxu o() {
      return cyc.oq;
   }

   @Override
   public cxy dI() {
      return new cxy(cyc.vQ);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, wu.a);
   }

   @Override
   protected void a(tw $$0) {
      super.a($$0);
      this.d.b($$0, this.dX());
      this.au().a(b, this.q().m());
      this.au().a(c, this.q().l());
   }

   @Override
   protected void b(tw $$0) {
      super.b($$0);
      this.d.a($$0, this.dX());
   }

   @Override
   public dym v() {
      return dkw.gi.m();
   }

   public dgq q() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.q().a(this.dV());
         this.i = this.af;
      }
   }

   @Override
   public btq a(cqi $$0, btp $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         try {
            this.d.c(this.au().a(c));
         } catch (Throwable var3) {
         }
      } else if (b.equals($$0)) {
         this.d.a(this.au().a(b));
      }
   }

   public class a extends dgq {
      @Override
      public arn e() {
         return (arn)csr.this.dV();
      }

      @Override
      public void f() {
         csr.this.au().a(csr.b, this.m());
         csr.this.au().a(csr.c, this.l());
      }

      @Override
      public fcu g() {
         return csr.this.dt();
      }

      public csr h() {
         return csr.this;
      }

      @Override
      public ex i() {
         return new ex(this, csr.this.dt(), csr.this.bU(), this.e(), 2, this.n().getString(), csr.this.m_(), this.e().p(), csr.this);
      }

      @Override
      public boolean j() {
         return !csr.this.dQ();
      }
   }
}
