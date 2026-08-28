public class csg extends crw {
   static final alc<String> b = alg.a(csg.class, ale.e);
   static final alc<xv> c = alg.a(csg.class, ale.f);
   private final dgi d = new csg.a();
   private static final int h = 4;
   private int i;

   public csg(bvr<? extends csg> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected cxl u() {
      return cxt.of;
   }

   @Override
   public cxp dJ() {
      return new cxp(cxt.vC);
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
      this.d.b($$0, this.dY());
      this.au().a(b, this.v().m());
      this.au().a(c, this.v().l());
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      this.d.a($$0, this.dY());
   }

   @Override
   public dxv w() {
      return dko.gb.m();
   }

   public dgi v() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.af - this.i >= 4) {
         this.v().a(this.dW());
         this.i = this.af;
      }
   }

   @Override
   public btj a(cpx $$0, bti $$1) {
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

   public class a extends dgi {
      @Override
      public ash e() {
         return (ash)csg.this.dW();
      }

      @Override
      public void f() {
         csg.this.au().a(csg.b, this.m());
         csg.this.au().a(csg.c, this.l());
      }

      @Override
      public fby g() {
         return csg.this.du();
      }

      public csg h() {
         return csg.this;
      }

      @Override
      public ew i() {
         return new ew(this, csg.this.du(), csg.this.bU(), this.e(), 2, this.n().getString(), csg.this.p_(), this.e().p(), csg.this);
      }

      @Override
      public boolean j() {
         return !csg.this.dR();
      }
   }
}
