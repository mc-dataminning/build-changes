public class cqx extends cqo {
   static final ako<String> c = aks.a(cqx.class, akq.e);
   static final ako<xl> d = aks.a(cqx.class, akq.f);
   private final def e = new cqx.a();
   private static final int i = 4;
   private int j;

   public cqx(bup<? extends cqx> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected cwb al_() {
      return cwj.nM;
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.ve);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, xk.a);
   }

   @Override
   protected void a(un $$0) {
      super.a($$0);
      this.e.b($$0, this.ea());
      this.aw().a(c, this.F().m());
      this.aw().a(d, this.F().l());
   }

   @Override
   protected void b(un $$0) {
      super.b($$0);
      this.e.a($$0, this.ea());
   }

   @Override
   public dvo z() {
      return dil.fN.m();
   }

   public def F() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.j >= 4) {
         this.F().a(this.dY());
         this.j = this.ag;
      }
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ako<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.aw().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.aw().a(c));
      }
   }

   @Override
   public boolean cY() {
      return true;
   }

   public class a extends def {
      @Override
      public arq e() {
         return (arq)cqx.this.dY();
      }

      @Override
      public void f() {
         cqx.this.aw().a(cqx.c, this.m());
         cqx.this.aw().a(cqx.d, this.l());
      }

      @Override
      public ezr g() {
         return cqx.this.dw();
      }

      public cqx h() {
         return cqx.this;
      }

      @Override
      public ew i() {
         return new ew(this, cqx.this.dw(), cqx.this.bW(), this.e(), 2, this.n().getString(), cqx.this.S_(), this.e().o(), cqx.this);
      }

      @Override
      public boolean j() {
         return !cqx.this.dT();
      }
   }
}
