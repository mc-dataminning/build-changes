import java.util.List;

public abstract class cvd extends cwr {
   private final int o;
   private final int p;
   protected final cvu m;
   protected final cwu n = new cwu();

   public cvd(cwl<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cxg(this, $$2, $$3);
   }

   protected cwz a(crj $$0, int $$1, int $$2) {
      return this.a(new cwv($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cwz(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cwr.a a(boolean $$0, boolean $$1, deg<?> $$2, arq $$3, cri $$4) {
      deg<ddq> $$5 = (deg<ddq>)$$2;
      this.l();

      cwr.a var8;
      try {
         List<cwz> $$6 = this.n();
         var8 = aks.a(new aks.a<ddq>() {
            @Override
            public void a(crp $$0) {
               cvd.this.a($$0);
            }

            @Override
            public void a() {
               cvd.this.n.a();
               cvd.this.m.a();
            }

            @Override
            public boolean a(deg<ddq> $$0) {
               return $$0.b().a(cvd.this.m.ay_(), cvd.this.q().dU());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (deg<ddq>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(arq $$0, deg<ddq> $$1) {
   }

   public abstract cwz m();

   public abstract List<cwz> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract crj q();

   @Override
   public void a(crp $$0) {
      this.m.fillStackedContents($$0);
   }
}
