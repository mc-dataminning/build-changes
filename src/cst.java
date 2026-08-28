import javax.annotation.Nullable;

public class cst extends crw {
   public cst(bwr<? extends cst> $$0, djm $$1) {
      super($$0, $$1);
   }

   public cst(djm $$0, bxj $$1, czn $$2) {
      super(bwr.aW, $$0, $$1, $$2);
   }

   public cst(djm $$0, double $$1, double $$2, double $$3, czn $$4) {
      super(bwr.aW, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected czj g() {
      return czr.wC;
   }

   @Override
   public void a(arq $$0, czn $$1, @Nullable bwi $$2) {
      bwa $$3 = new bwa(this.dU(), this.dz(), this.dB(), this.dF());
      if (this.q() instanceof bxj $$4) {
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
