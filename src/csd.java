import java.util.List;

public abstract class csd extends ctr {
   private final int o;
   private final int p;
   protected final csu m;
   protected final ctu n = new ctu();

   public csd(ctl<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cug(this, $$2, $$3);
   }

   protected ctz a(cox $$0, int $$1, int $$2) {
      return this.a(new ctv($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new ctz(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public ctr.a a(boolean $$0, boolean $$1, dbj<?> $$2, arc $$3, cow $$4) {
      dbj<dat> $$5 = (dbj<dat>)$$2;
      this.l();

      ctr.a var8;
      try {
         List<ctz> $$6 = this.n();
         var8 = akg.a(new akg.a<dat>() {
            @Override
            public void a(cpc $$0) {
               csd.this.a($$0);
            }

            @Override
            public void a() {
               csd.this.n.a();
               csd.this.m.a();
            }

            @Override
            public boolean a(dbj<dat> $$0) {
               return $$0.b().a(csd.this.m.aB_(), csd.this.q().dW());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dbj<dat>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(arc $$0, dbj<dat> $$1) {
   }

   public abstract ctz m();

   public abstract List<ctz> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cox q();

   @Override
   public void a(cpc $$0) {
      this.m.fillStackedContents($$0);
   }
}
