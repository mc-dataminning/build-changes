import com.mojang.serialization.MapCodec;

public abstract class ddp extends dek {
   private final cth a;

   protected ddp(cth $$0, dsa.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddp> a();

   @Override
   public boolean a(dsb $$0) {
      return true;
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dov($$0, $$1, this.a);
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return $$0.c_($$1) instanceof dov $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cth b() {
      return this.a;
   }
}
