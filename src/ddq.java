import com.mojang.serialization.MapCodec;

public abstract class ddq extends del {
   private final cti a;

   protected ddq(cti $$0, dsb.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddq> a();

   @Override
   public boolean a(dsc $$0) {
      return true;
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dow($$0, $$1, this.a);
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return $$0.c_($$1) instanceof dow $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cti b() {
      return this.a;
   }
}
