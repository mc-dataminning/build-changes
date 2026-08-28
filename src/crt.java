import java.util.List;

public abstract class crt extends cth {
   private final int o;
   private final int p;
   protected final csk m;
   protected final ctk n = new ctk();

   public crt(ctb<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new ctw(this, $$2, $$3);
   }

   protected ctp a(cor $$0, int $$1, int $$2) {
      return this.a(new ctl($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new ctp(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public cth.a a(boolean $$0, boolean $$1, dav<?> $$2, coq $$3) {
      dav<daj> $$4 = (dav<daj>)$$2;
      this.l();

      cth.a var7;
      try {
         List<ctp> $$5 = this.n();
         var7 = akx.a(new akx.a<daj>() {
            @Override
            public void a(cow $$0) {
               crt.this.a($$0);
            }

            @Override
            public void a() {
               crt.this.n.a();
               crt.this.m.a();
            }

            @Override
            public boolean a(dav<daj> $$0) {
               return $$0.b().a(crt.this.m.aC_(), crt.this.q().dY());
            }
         }, this.o, this.p, $$5, $$5, $$3, $$4, $$0, $$1);
      } finally {
         this.a((dav<daj>)$$2);
      }

      return var7;
   }

   @Override
   protected void l() {
   }

   protected void a(dav<daj> $$0) {
   }

   public abstract ctp m();

   public abstract List<ctp> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cor q();

   @Override
   public void a(cow $$0) {
      this.m.fillStackedContents($$0);
   }
}
