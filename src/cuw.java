import java.util.List;

public abstract class cuw extends cwk {
   private final int o;
   private final int p;
   protected final cvn m;
   protected final cwn n = new cwn();

   public cuw(cwe<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cwz(this, $$2, $$3);
   }

   protected cws a(crc $$0, int $$1, int $$2) {
      return this.a(new cwo($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new cws(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cwk.a a(boolean $$0, boolean $$1, ddz<?> $$2, arq $$3, crb $$4) {
      ddz<ddj> $$5 = (ddz<ddj>)$$2;
      this.l();

      cwk.a var8;
      try {
         List<cws> $$6 = this.n();
         var8 = aks.a(new aks.a<ddj>() {
            @Override
            public void a(cri $$0) {
               cuw.this.a($$0);
            }

            @Override
            public void a() {
               cuw.this.n.a();
               cuw.this.m.a();
            }

            @Override
            public boolean a(ddz<ddj> $$0) {
               return $$0.b().a(cuw.this.m.ay_(), cuw.this.q().dV());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (ddz<ddj>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(arq $$0, ddz<ddj> $$1) {
   }

   public abstract cws m();

   public abstract List<cws> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract crc q();

   @Override
   public void a(cri $$0) {
      this.m.fillStackedContents($$0);
   }
}
