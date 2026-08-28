import com.mojang.serialization.MapCodec;

public abstract class ddz extends deu {
   private final csw a;

   protected ddz(csw $$0, dsk.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddz> a();

   @Override
   public boolean a(dsl $$0) {
      return true;
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpf($$0, $$1, this.a);
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return $$0.c_($$1) instanceof dpf $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public csw b() {
      return this.a;
   }
}
