import java.util.List;

public abstract class csx extends cul {
   private final int o;
   private final int p;
   protected final cto m;
   protected final cuo n = new cuo();

   public csx(cuf<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cva(this, $$2, $$3);
   }

   protected cut a(cpr $$0, int $$1, int $$2) {
      return this.a(new cup($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cut(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cul.a a(boolean $$0, boolean $$1, dca<?> $$2, ard $$3, cpq $$4) {
      dca<dbk> $$5 = (dca<dbk>)$$2;
      this.l();

      cul.a var8;
      try {
         List<cut> $$6 = this.n();
         var8 = akg.a(new akg.a<dbk>() {
            @Override
            public void a(cpw $$0) {
               csx.this.a($$0);
            }

            @Override
            public void a() {
               csx.this.n.a();
               csx.this.m.a();
            }

            @Override
            public boolean a(dca<dbk> $$0) {
               return $$0.b().a(csx.this.m.aB_(), csx.this.q().dU());
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

   protected void a(ard $$0, dca<dbk> $$1) {
   }

   public abstract cut m();

   public abstract List<cut> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cpr q();

   @Override
   public void a(cpw $$0) {
      this.m.fillStackedContents($$0);
   }
}
