public class crd extends cqt {
   static final akm<String> b = akq.a(crd.class, ako.e);
   static final akm<xj> c = akq.a(crd.class, ako.f);
   private final dem d = new crd.a();
   private static final int h = 4;
   private int i;

   public crd(bus<? extends crd> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected cwi t() {
      return cwq.nM;
   }

   @Override
   public cwm dI() {
      return new cwm(cwq.ve);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, xi.a);
   }

   @Override
   protected void a(ul $$0) {
      super.a($$0);
      this.d.b($$0, this.dX());
      this.au().a(b, this.u().m());
      this.au().a(c, this.u().l());
   }

   @Override
   protected void b(ul $$0) {
      super.b($$0);
      this.d.a($$0, this.dX());
   }

   @Override
   public dvv w() {
      return dis.fN.m();
   }

   public dem u() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.u().a(this.dV());
         this.i = this.af;
      }
   }

   @Override
   public bsk a(cou $$0, bsj $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(akm<?> $$0) {
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

   @Override
   public boolean cW() {
      return true;
   }

   public class a extends dem {
      @Override
      public arp e() {
         return (arp)crd.this.dV();
      }

      @Override
      public void f() {
         crd.this.au().a(crd.b, this.m());
         crd.this.au().a(crd.c, this.l());
      }

      @Override
      public ezy g() {
         return crd.this.dt();
      }

      public crd h() {
         return crd.this;
      }

      @Override
      public ew i() {
         return new ew(this, crd.this.dt(), crd.this.bU(), this.e(), 2, this.n().getString(), crd.this.o_(), this.e().p(), crd.this);
      }

      @Override
      public boolean j() {
         return !crd.this.dQ();
      }
   }
}
