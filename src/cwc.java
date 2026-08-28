import java.util.List;

public abstract class cwc extends cxq {
   private final int o;
   private final int p;
   protected final cwt m;
   protected final cxu n = new cxu();

   public cwc(cxk<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cyg(this, $$2, $$3);
   }

   protected cxz a(csi $$0, int $$1, int $$2) {
      return this.a(new cxv($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cxz(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cxq.a a(boolean $$0, boolean $$1, dfg<?> $$2, asb $$3, csh $$4) {
      dfg<deq> $$5 = (dfg<deq>)$$2;
      this.l();

      cxq.a var8;
      try {
         List<cxz> $$6 = this.n();
         var8 = ald.a(new ald.a<deq>() {
            @Override
            public void a(cso $$0) {
               cwc.this.a($$0);
            }

            @Override
            public void a() {
               cwc.this.n.a();
               cwc.this.m.a();
            }

            @Override
            public boolean a(dfg<deq> $$0) {
               return $$0.b().a(cwc.this.m.ay_(), cwc.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dfg<deq>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(asb $$0, dfg<deq> $$1) {
   }

   public abstract cxz m();

   public abstract List<cxz> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract csi q();

   @Override
   public void a(cso $$0) {
      this.m.fillStackedContents($$0);
   }
}
