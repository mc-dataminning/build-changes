import java.util.List;

public abstract class ctd extends cur {
   private final int o;
   private final int p;
   protected final ctu m;
   protected final cuu n = new cuu();

   public ctd(cul<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cvg(this, $$2, $$3);
   }

   protected cuz a(cpx $$0, int $$1, int $$2) {
      return this.a(new cuv($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cuz(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cur.a a(boolean $$0, boolean $$1, dcj<?> $$2, ash $$3, cpw $$4) {
      dcj<dbt> $$5 = (dcj<dbt>)$$2;
      this.l();

      cur.a var8;
      try {
         List<cuz> $$6 = this.n();
         var8 = all.a(new all.a<dbt>() {
            @Override
            public void a(cqc $$0) {
               ctd.this.a($$0);
            }

            @Override
            public void a() {
               ctd.this.n.a();
               ctd.this.m.a();
            }

            @Override
            public boolean a(dcj<dbt> $$0) {
               return $$0.b().a(ctd.this.m.aC_(), ctd.this.q().dW());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dcj<dbt>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(ash $$0, dcj<dbt> $$1) {
   }

   public abstract cuz m();

   public abstract List<cuz> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cpx q();

   @Override
   public void a(cqc $$0) {
      this.m.fillStackedContents($$0);
   }
}
