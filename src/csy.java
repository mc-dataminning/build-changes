import java.util.List;

public abstract class csy extends cum {
   private final int o;
   private final int p;
   protected final ctp m;
   protected final cup n = new cup();

   public csy(cug<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cvb(this, $$2, $$3);
   }

   protected cuu a(cps $$0, int $$1, int $$2) {
      return this.a(new cuq($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cuu(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cum.a a(boolean $$0, boolean $$1, dcd<?> $$2, ash $$3, cpr $$4) {
      dcd<dbp> $$5 = (dcd<dbp>)$$2;
      this.l();

      cum.a var8;
      try {
         List<cuu> $$6 = this.n();
         var8 = all.a(new all.a<dbp>() {
            @Override
            public void a(cpx $$0) {
               csy.this.a($$0);
            }

            @Override
            public void a() {
               csy.this.n.a();
               csy.this.m.a();
            }

            @Override
            public boolean a(dcd<dbp> $$0) {
               return $$0.b().a(csy.this.m.aC_(), csy.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dcd<dbp>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(ash $$0, dcd<dbp> $$1) {
   }

   public abstract cuu m();

   public abstract List<cuu> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cps q();

   @Override
   public void a(cpx $$0) {
      this.m.fillStackedContents($$0);
   }
}
