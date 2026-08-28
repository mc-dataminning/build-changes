import java.util.List;

public abstract class crk extends csy {
   private final int o;
   private final int p;
   protected final csb m;
   protected final ctb n = new ctb();

   public crk(css<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new ctn(this, $$2, $$3);
   }

   protected ctg a(coh $$0, int $$1, int $$2) {
      return this.a(new ctc($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new ctg(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public csy.a a(boolean $$0, boolean $$1, dal<?> $$2, cog $$3) {
      dal<czz> $$4 = (dal<czz>)$$2;
      this.l();

      csy.a var7;
      try {
         List<ctg> $$5 = this.n();
         var7 = akt.a(new akt.a<czz>() {
            @Override
            public void a(com $$0) {
               crk.this.a($$0);
            }

            @Override
            public void a() {
               crk.this.n.a();
               crk.this.m.a();
            }

            @Override
            public boolean a(dal<czz> $$0) {
               return $$0.b().a(crk.this.m.aD_(), crk.this.q().dX());
            }
         }, this.o, this.p, $$5, $$5, $$3, $$4, $$0, $$1);
      } finally {
         this.a((dal<czz>)$$2);
      }

      return var7;
   }

   @Override
   protected void l() {
   }

   protected void a(dal<czz> $$0) {
   }

   public abstract ctg m();

   public abstract List<ctg> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract coh q();

   @Override
   public void a(com $$0) {
      this.m.fillStackedContents($$0);
   }
}
