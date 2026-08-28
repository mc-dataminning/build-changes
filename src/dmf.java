import com.mojang.serialization.MapCodec;

public abstract class dmf extends dna {
   private final czi a;

   protected dmf(czi $$0, ebp.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmf> a();

   @Override
   public boolean a(ebq $$0) {
      return true;
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyc($$0, $$1, this.a);
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dyc $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public czi b() {
      return this.a;
   }
}
