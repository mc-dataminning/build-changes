import com.mojang.serialization.MapCodec;

public abstract class dha extends dhv {
   private final cvc a;

   protected dha(cvc $$0, dvn.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dha> a();

   @Override
   public boolean a(dvo $$0) {
      return true;
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsg($$0, $$1, this.a);
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return $$0.c_($$1) instanceof dsg $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cvc b() {
      return this.a;
   }
}
