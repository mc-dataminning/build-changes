import java.util.List;

public abstract class csu extends cui {
   private final int o;
   private final int p;
   protected final ctl m;
   protected final cul n = new cul();

   public csu(cuc<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cux(this, $$2, $$3);
   }

   protected cuq a(cpo $$0, int $$1, int $$2) {
      return this.a(new cum($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cuq(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cui.a a(boolean $$0, boolean $$1, dca<?> $$2, arx $$3, cpn $$4) {
      dca<dbk> $$5 = (dca<dbk>)$$2;
      this.l();

      cui.a var8;
      try {
         List<cuq> $$6 = this.n();
         var8 = alb.a(new alb.a<dbk>() {
            @Override
            public void a(cpt $$0) {
               csu.this.a($$0);
            }

            @Override
            public void a() {
               csu.this.n.a();
               csu.this.m.a();
            }

            @Override
            public boolean a(dca<dbk> $$0) {
               return $$0.b().a(csu.this.m.aC_(), csu.this.q().dW());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dca<dbk>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(arx $$0, dca<dbk> $$1) {
   }

   public abstract cuq m();

   public abstract List<cuq> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cpo q();

   @Override
   public void a(cpt $$0) {
      this.m.fillStackedContents($$0);
   }
}
