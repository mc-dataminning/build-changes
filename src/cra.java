import java.util.List;

public abstract class cra extends cso {
   private final int o;
   private final int p;
   protected final crr m;
   protected final csr n = new csr();

   public cra(csi<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new ctd(this, $$2, $$3);
   }

   protected csw a(cnx $$0, int $$1, int $$2) {
      return this.a(new css($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new csw(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cso.a a(boolean $$0, boolean $$1, dam<?> $$2, cnw $$3) {
      dam<daa> $$4 = (dam<daa>)$$2;
      this.l();

      cso.a var7;
      try {
         List<csw> $$5 = this.n();
         var7 = akq.a(new akq.a<daa>() {
            @Override
            public void a(coc $$0) {
               cra.this.a($$0);
            }

            @Override
            public void a() {
               cra.this.n.a();
               cra.this.m.a();
            }

            @Override
            public boolean a(dam<daa> $$0) {
               return $$0.b().a(cra.this.m.aD_(), cra.this.q().dS());
            }
         }, this.o, this.p, $$5, $$5, $$3, $$4, $$0, $$1);
      } finally {
         this.a((dam<daa>)$$2);
      }

      return var7;
   }

   @Override
   protected void l() {
   }

   protected void a(dam<daa> $$0) {
   }

   public abstract csw m();

   public abstract List<csw> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cnx q();

   @Override
   public void a(coc $$0) {
      this.m.fillStackedContents($$0);
   }
}
