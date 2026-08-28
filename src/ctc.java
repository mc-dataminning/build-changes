import java.util.List;

public abstract class ctc extends cuq {
   private final int o;
   private final int p;
   protected final ctt m;
   protected final cut n = new cut();

   public ctc(cuk<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cvf(this, $$2, $$3);
   }

   protected cuy a(cpw $$0, int $$1, int $$2) {
      return this.a(new cuu($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cuy(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cuq.a a(boolean $$0, boolean $$1, dci<?> $$2, ash $$3, cpv $$4) {
      dci<dbs> $$5 = (dci<dbs>)$$2;
      this.l();

      cuq.a var8;
      try {
         List<cuy> $$6 = this.n();
         var8 = all.a(new all.a<dbs>() {
            @Override
            public void a(cqb $$0) {
               ctc.this.a($$0);
            }

            @Override
            public void a() {
               ctc.this.n.a();
               ctc.this.m.a();
            }

            @Override
            public boolean a(dci<dbs> $$0) {
               return $$0.b().a(ctc.this.m.aC_(), ctc.this.q().dW());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dci<dbs>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(ash $$0, dci<dbs> $$1) {
   }

   public abstract cuy m();

   public abstract List<cuy> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cpw q();

   @Override
   public void a(cqb $$0) {
      this.m.fillStackedContents($$0);
   }
}
