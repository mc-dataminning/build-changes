import javax.annotation.Nullable;

public class csq extends crt {
   public csq(bwr<? extends csq> $$0, djh $$1) {
      super($$0, $$1);
   }

   public csq(djh $$0, bxj $$1, czk $$2) {
      super(bwr.aW, $$0, $$1, $$2);
   }

   public csq(djh $$0, double $$1, double $$2, double $$3, czk $$4) {
      super(bwr.aW, $$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected czg g() {
      return czo.wC;
   }

   @Override
   public void a(arq $$0, czk $$1, @Nullable bwi $$2) {
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
