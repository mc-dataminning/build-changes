import java.util.List;

public abstract class csc extends ctq {
   private final int o;
   private final int p;
   protected final cst m;
   protected final ctt n = new ctt();

   public csc(ctk<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cuf(this, $$2, $$3);
   }

   protected cty a(cow $$0, int $$1, int $$2) {
      return this.a(new ctu($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cty(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public ctq.a a(boolean $$0, boolean $$1, dbi<?> $$2, ard $$3, cov $$4) {
      dbi<das> $$5 = (dbi<das>)$$2;
      this.l();

      ctq.a var8;
      try {
         List<cty> $$6 = this.n();
         var8 = akh.a(new akh.a<das>() {
            @Override
            public void a(cpb $$0) {
               csc.this.a($$0);
            }

            @Override
            public void a() {
               csc.this.n.a();
               csc.this.m.a();
            }

            @Override
            public boolean a(dbi<das> $$0) {
               return $$0.b().a(csc.this.m.aB_(), csc.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dbi<das>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(ard $$0, dbi<das> $$1) {
   }

   public abstract cty m();

   public abstract List<cty> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cow q();

   @Override
   public void a(cpb $$0) {
      this.m.fillStackedContents($$0);
   }
}
