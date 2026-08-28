import java.util.List;

public abstract class csb extends ctp {
   private final int o;
   private final int p;
   protected final css m;
   protected final cts n = new cts();

   public csb(ctj<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new cue(this, $$2, $$3);
   }

   protected ctx a(cov $$0, int $$1, int $$2) {
      return this.a(new ctt($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new ctx(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public ctp.a a(boolean $$0, boolean $$1, dbh<?> $$2, arc $$3, cou $$4) {
      dbh<dar> $$5 = (dbh<dar>)$$2;
      this.l();

      ctp.a var8;
      try {
         List<ctx> $$6 = this.n();
         var8 = akg.a(new akg.a<dar>() {
            @Override
            public void a(cpa $$0) {
               csb.this.a($$0);
            }

            @Override
            public void a() {
               csb.this.n.a();
               csb.this.m.a();
            }

            @Override
            public boolean a(dbh<dar> $$0) {
               return $$0.b().a(csb.this.m.aB_(), csb.this.q().dW());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dbh<dar>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(arc $$0, dbh<dar> $$1) {
   }

   public abstract ctx m();

   public abstract List<ctx> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cov q();

   @Override
   public void a(cpa $$0) {
      this.m.fillStackedContents($$0);
   }
}
