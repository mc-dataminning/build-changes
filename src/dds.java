import com.mojang.serialization.MapCodec;

public abstract class dds extends den {
   private final ctk a;

   protected dds(ctk $$0, dsd.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dds> a();

   @Override
   public boolean a(dse $$0) {
      return true;
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new doy($$0, $$1, this.a);
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return $$0.c_($$1) instanceof doy $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public ctk b() {
      return this.a;
   }
}
