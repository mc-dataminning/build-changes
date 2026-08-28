import java.util.List;

public abstract class cvt extends cxh {
   private final int o;
   private final int p;
   protected final cwk m;
   protected final cxk n = new cxk();

   public cvt(cxb<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cxw(this, $$2, $$3);
   }

   protected cxp a(crz $$0, int $$1, int $$2) {
      return this.a(new cxl($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cxp(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cxh.a a(boolean $$0, boolean $$1, dew<?> $$2, aru $$3, cry $$4) {
      dew<deg> $$5 = (dew<deg>)$$2;
      this.l();

      cxh.a var8;
      try {
         List<cxp> $$6 = this.n();
         var8 = akw.a(new akw.a<deg>() {
            @Override
            public void a(csf $$0) {
               cvt.this.a($$0);
            }

            @Override
            public void a() {
               cvt.this.n.a();
               cvt.this.m.a();
            }

            @Override
            public boolean a(dew<deg> $$0) {
               return $$0.b().a(cvt.this.m.aC_(), cvt.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dew<deg>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(aru $$0, dew<deg> $$1) {
   }

   public abstract cxp m();

   public abstract List<cxp> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract crz q();

   @Override
   public void a(csf $$0) {
      this.m.fillStackedContents($$0);
   }
}
