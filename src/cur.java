import java.util.List;

public abstract class cur extends cwf {
   private final int o;
   private final int p;
   protected final cvi m;
   protected final cwi n = new cwi();

   public cur(cvz<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cwu(this, $$2, $$3);
   }

   protected cwn a(cqy $$0, int $$1, int $$2) {
      return this.a(new cwj($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cwn(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cwf.a a(boolean $$0, boolean $$1, ddu<?> $$2, arq $$3, cqx $$4) {
      ddu<dde> $$5 = (ddu<dde>)$$2;
      this.l();

      cwf.a var8;
      try {
         List<cwn> $$6 = this.n();
         var8 = aks.a(new aks.a<dde>() {
            @Override
            public void a(crd $$0) {
               cur.this.a($$0);
            }

            @Override
            public void a() {
               cur.this.n.a();
               cur.this.m.a();
            }

            @Override
            public boolean a(ddu<dde> $$0) {
               return $$0.b().a(cur.this.m.ax_(), cur.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (ddu<dde>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(arq $$0, ddu<dde> $$1) {
   }

   public abstract cwn m();

   public abstract List<cwn> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cqy q();

   @Override
   public void a(crd $$0) {
      this.m.fillStackedContents($$0);
   }
}
