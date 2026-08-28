import java.util.List;

public abstract class cvr extends cxf {
   private final int o;
   private final int p;
   protected final cwi m;
   protected final cxi n = new cxi();

   public cvr(cwz<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cxu(this, $$2, $$3);
   }

   protected cxn a(crx $$0, int $$1, int $$2) {
      return this.a(new cxj($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cxn(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cxf.a a(boolean $$0, boolean $$1, deu<?> $$2, ars $$3, crw $$4) {
      deu<dee> $$5 = (deu<dee>)$$2;
      this.l();

      cxf.a var8;
      try {
         List<cxn> $$6 = this.n();
         var8 = aku.a(new aku.a<dee>() {
            @Override
            public void a(csd $$0) {
               cvr.this.a($$0);
            }

            @Override
            public void a() {
               cvr.this.n.a();
               cvr.this.m.a();
            }

            @Override
            public boolean a(deu<dee> $$0) {
               return $$0.b().a(cvr.this.m.aC_(), cvr.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (deu<dee>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(ars $$0, deu<dee> $$1) {
   }

   public abstract cxn m();

   public abstract List<cxn> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract crx q();

   @Override
   public void a(csd $$0) {
      this.m.fillStackedContents($$0);
   }
}
