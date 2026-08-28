import java.util.List;

public abstract class cvg extends cwu {
   private final int o;
   private final int p;
   protected final cvx m;
   protected final cwx n = new cwx();

   public cvg(cwo<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cxj(this, $$2, $$3);
   }

   protected cxc a(crm $$0, int $$1, int $$2) {
      return this.a(new cwy($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cxc(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cwu.a a(boolean $$0, boolean $$1, dej<?> $$2, arq $$3, crl $$4) {
      dej<ddt> $$5 = (dej<ddt>)$$2;
      this.l();

      cwu.a var8;
      try {
         List<cxc> $$6 = this.n();
         var8 = aks.a(new aks.a<ddt>() {
            @Override
            public void a(crs $$0) {
               cvg.this.a($$0);
            }

            @Override
            public void a() {
               cvg.this.n.a();
               cvg.this.m.a();
            }

            @Override
            public boolean a(dej<ddt> $$0) {
               return $$0.b().a(cvg.this.m.ay_(), cvg.this.q().dU());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dej<ddt>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(arq $$0, dej<ddt> $$1) {
   }

   public abstract cxc m();

   public abstract List<cxc> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract crm q();

   @Override
   public void a(crs $$0) {
      this.m.fillStackedContents($$0);
   }
}
