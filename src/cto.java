import java.util.List;

public abstract class cto extends cvc {
   private final int o;
   private final int p;
   protected final cuf m;
   protected final cvf n = new cvf();

   public cto(cuw<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cvr(this, $$2, $$3);
   }

   protected cvk a(cqi $$0, int $$1, int $$2) {
      return this.a(new cvg($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cvk(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cvc.a a(boolean $$0, boolean $$1, dcq<?> $$2, arn $$3, cqh $$4) {
      dcq<dca> $$5 = (dcq<dca>)$$2;
      this.l();

      cvc.a var8;
      try {
         List<cvk> $$6 = this.n();
         var8 = akp.a(new akp.a<dca>() {
            @Override
            public void a(cqn $$0) {
               cto.this.a($$0);
            }

            @Override
            public void a() {
               cto.this.n.a();
               cto.this.m.a();
            }

            @Override
            public boolean a(dcq<dca> $$0) {
               return $$0.b().a(cto.this.m.ax_(), cto.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dcq<dca>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(arn $$0, dcq<dca> $$1) {
   }

   public abstract cvk m();

   public abstract List<cvk> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cqi q();

   @Override
   public void a(cqn $$0) {
      this.m.fillStackedContents($$0);
   }
}
