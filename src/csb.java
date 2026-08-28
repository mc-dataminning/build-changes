public class csb extends crr {
   static final alc<String> b = alg.a(csb.class, ale.e);
   static final alc<xv> c = alg.a(csb.class, ale.f);
   private final dga d = new csb.a();
   private static final int h = 4;
   private int i;

   public csb(bvm<? extends csb> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected cxg u() {
      return cxo.of;
   }

   @Override
   public cxk dI() {
      return new cxk(cxo.vC);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, xu.a);
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.d.b($$0, this.dX());
      this.au().a(b, this.v().m());
      this.au().a(c, this.v().l());
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      this.d.a($$0, this.dX());
   }

   @Override
   public dxn w() {
      return dkg.gb.m();
   }

   public dga v() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.v().a(this.dV());
         this.i = this.af;
      }
   }

   @Override
   public bte a(cps $$0, btd $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(alc<?> $$0) {
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

   public class a extends dga {
      @Override
      public ash e() {
         return (ash)csb.this.dV();
      }

      @Override
      public void f() {
         csb.this.au().a(csb.b, this.m());
         csb.this.au().a(csb.c, this.l());
      }

      @Override
      public fbs g() {
         return csb.this.dt();
      }

      public csb h() {
         return csb.this;
      }

      @Override
      public ew i() {
         return new ew(this, csb.this.dt(), csb.this.bU(), this.e(), 2, this.n().getString(), csb.this.p_(), this.e().p(), csb.this);
      }

      @Override
      public boolean j() {
         return !csb.this.dQ();
      }
   }
}
