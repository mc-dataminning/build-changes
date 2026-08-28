import java.util.List;

public abstract class cul extends cvz {
   private final int o;
   private final int p;
   protected final cvc m;
   protected final cwc n = new cwc();

   public cul(cvt<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cwo(this, $$2, $$3);
   }

   protected cwh a(cqs $$0, int $$1, int $$2) {
      return this.a(new cwd($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cwh(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cvz.a a(boolean $$0, boolean $$1, ddo<?> $$2, aro $$3, cqr $$4) {
      ddo<dcy> $$5 = (ddo<dcy>)$$2;
      this.l();

      cvz.a var8;
      try {
         List<cwh> $$6 = this.n();
         var8 = akq.a(new akq.a<dcy>() {
            @Override
            public void a(cqx $$0) {
               cul.this.a($$0);
            }

            @Override
            public void a() {
               cul.this.n.a();
               cul.this.m.a();
            }

            @Override
            public boolean a(ddo<dcy> $$0) {
               return $$0.b().a(cul.this.m.ax_(), cul.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (ddo<dcy>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(aro $$0, ddo<dcy> $$1) {
   }

   public abstract cwh m();

   public abstract List<cwh> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cqs q();

   @Override
   public void a(cqx $$0) {
      this.m.fillStackedContents($$0);
   }
}
