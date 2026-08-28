import java.util.List;

public abstract class crp extends ctd {
   private final int o;
   private final int p;
   protected final csg m;
   protected final ctg n = new ctg();

   public crp(csx<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cts(this, $$2, $$3);
   }

   protected ctl a(com $$0, int $$1, int $$2) {
      return this.a(new cth($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new ctl(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public ctd.a a(boolean $$0, boolean $$1, dar<?> $$2, col $$3) {
      dar<daf> $$4 = (dar<daf>)$$2;
      this.l();

      ctd.a var7;
      try {
         List<ctl> $$5 = this.n();
         var7 = aku.a(new aku.a<daf>() {
            @Override
            public void a(cos $$0) {
               crp.this.a($$0);
            }

            @Override
            public void a() {
               crp.this.n.a();
               crp.this.m.a();
            }

            @Override
            public boolean a(dar<daf> $$0) {
               return $$0.b().a(crp.this.m.aC_(), crp.this.q().dX());
            }
         }, this.o, this.p, $$5, $$5, $$3, $$4, $$0, $$1);
      } finally {
         this.a((dar<daf>)$$2);
      }

      return var7;
   }

   @Override
   protected void l() {
   }

   protected void a(dar<daf> $$0) {
   }

   public abstract ctl m();

   public abstract List<ctl> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract com q();

   @Override
   public void a(cos $$0) {
      this.m.fillStackedContents($$0);
   }
}
