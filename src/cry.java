import javax.annotation.Nullable;

public class cry extends crb {
   public cry(bwj<? extends cry> $$0, dip $$1) {
      super($$0, $$1);
   }

   public cry(dip $$0, bwz $$1, cys $$2) {
      super(bwj.aW, $$0, $$1, $$2);
   }

   public cry(dip $$0, double $$1, double $$2, double $$3, cys $$4) {
      super(bwj.aW, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(aro $$0, cys $$1, @Nullable bwa $$2) {
      bvs $$3 = new bvs(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.q() instanceof bwz $$4) {
         $$3.a($$4);
      }

      $$3.a(3.0F);
      $$3.c(-0.5F);
      $$3.c(10);
      $$3.d(-$$3.e() / (float)$$3.i());
      $$3.c($$1);
      $$0.b($$3);
   }
}
