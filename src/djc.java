import com.mojang.serialization.MapCodec;

public abstract class djc extends djx {
   private final cwl a;

   protected djc(cwl $$0, dxt.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djc> a();

   @Override
   public boolean a(dxu $$0) {
      return true;
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dul($$0, $$1, this.a);
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return $$0.c_($$1) instanceof dul $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cwl b() {
      return this.a;
   }
}
