import java.util.List;

public abstract class cse extends cts {
   private final int o;
   private final int p;
   protected final csv m;
   protected final ctv n = new ctv();

   public cse(ctm<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cuh(this, $$2, $$3);
   }

   protected cua a(coy $$0, int $$1, int $$2) {
      return this.a(new ctw($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cua(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cts.a a(boolean $$0, boolean $$1, dbk<?> $$2, ard $$3, cox $$4) {
      dbk<dau> $$5 = (dbk<dau>)$$2;
      this.l();

      cts.a var8;
      try {
         List<cua> $$6 = this.n();
         var8 = akh.a(new akh.a<dau>() {
            @Override
            public void a(cpd $$0) {
               cse.this.a($$0);
            }

            @Override
            public void a() {
               cse.this.n.a();
               cse.this.m.a();
            }

            @Override
            public boolean a(dbk<dau> $$0) {
               return $$0.b().a(cse.this.m.aB_(), cse.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dbk<dau>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(ard $$0, dbk<dau> $$1) {
   }

   public abstract cua m();

   public abstract List<cua> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract coy q();

   @Override
   public void a(cpd $$0) {
      this.m.fillStackedContents($$0);
   }
}
