import java.util.List;

public abstract class cqx extends csl {
   private final int o;
   private final int p;
   protected final cro m;
   protected final cso n = new cso();

   public cqx(csf<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cta(this, $$2, $$3);
   }

   protected cst a(cnu $$0, int $$1, int $$2) {
      return this.a(new csp($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cst(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public csl.a a(boolean $$0, boolean $$1, daj<?> $$2, cnt $$3) {
      daj<czx> $$4 = (daj<czx>)$$2;
      this.l();

      csl.a var7;
      try {
         List<cst> $$5 = this.n();
         var7 = akp.a(new akp.a<czx>() {
            @Override
            public void a(cnz $$0) {
               cqx.this.a($$0);
            }

            @Override
            public void a() {
               cqx.this.n.a();
               cqx.this.m.a();
            }

            @Override
            public boolean a(daj<czx> $$0) {
               return $$0.b().a(cqx.this.m.aC_(), cqx.this.q().dS());
            }
         }, this.o, this.p, $$5, $$5, $$3, $$4, $$0, $$1);
      } finally {
         this.a((daj<czx>)$$2);
      }

      return var7;
   }

   @Override
   protected void l() {
   }

   protected void a(daj<czx> $$0) {
   }

   public abstract cst m();

   public abstract List<cst> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cnu q();

   @Override
   public void a(cnz $$0) {
      this.m.fillStackedContents($$0);
   }
}
