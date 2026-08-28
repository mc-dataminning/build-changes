public class csf extends crv {
   static final alc<String> b = alg.a(csf.class, ale.e);
   static final alc<xv> c = alg.a(csf.class, ale.f);
   private final dgh d = new csf.a();
   private static final int h = 4;
   private int i;

   public csf(bvq<? extends csf> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected cxk u() {
      return cxs.of;
   }

   @Override
   public cxo dJ() {
      return new cxo(cxs.vC);
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
   public dxu w() {
      return dkn.gb.m();
   }

   public dgh v() {
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
   public bti a(cpw $$0, bth $$1) {
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

   public class a extends dgh {
      @Override
      public ash e() {
         return (ash)csf.this.dW();
      }

      @Override
      public void f() {
         csf.this.au().a(csf.b, this.m());
         csf.this.au().a(csf.c, this.l());
      }

      @Override
      public fbx g() {
         return csf.this.du();
      }

      public csf h() {
         return csf.this;
      }

      @Override
      public ew i() {
         return new ew(this, csf.this.du(), csf.this.bU(), this.e(), 2, this.n().getString(), csf.this.p_(), this.e().p(), csf.this);
      }

      @Override
      public boolean j() {
         return !csf.this.dR();
      }
   }
}
