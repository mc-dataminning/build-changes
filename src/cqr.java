import java.util.List;

public abstract class cqr extends csf {
   private final int o;
   private final int p;
   protected final cri m;
   protected final csi n = new csi();

   public cqr(crz<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new csu(this, $$2, $$3);
   }

   protected csn a(cnp $$0, int $$1, int $$2) {
      return this.a(new csj($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new csn(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public csf.a a(boolean $$0, boolean $$1, czv<?> $$2, cno $$3) {
      czv<czj> $$4 = (czv<czj>)$$2;
      this.l();

      csf.a var7;
      try {
         List<csn> $$5 = this.n();
         var7 = akp.a(new akp.a<czj>() {
            @Override
            public void a(cnu $$0) {
               cqr.this.a($$0);
            }

            @Override
            public void a() {
               cqr.this.n.a();
               cqr.this.m.a();
            }

            @Override
            public boolean a(czv<czj> $$0) {
               return $$0.b().a(cqr.this.m.aE_(), cqr.this.q().dS());
            }
         }, this.o, this.p, $$5, $$5, $$3, $$4, $$0, $$1);
      } finally {
         this.a((czv<czj>)$$2);
      }

      return var7;
   }

   @Override
   protected void l() {
   }

   protected void a(czv<czj> $$0) {
   }

   public abstract csn m();

   public abstract List<csn> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cnp q();

   @Override
   public void a(cnu $$0) {
      this.m.fillStackedContents($$0);
   }
}
