import com.mojang.serialization.MapCodec;

public abstract class dlt extends dmo {
   private final cyw a;

   protected dlt(cyw $$0, ebd.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dlt> a();

   @Override
   public boolean a(ebe $$0) {
      return true;
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dxq($$0, $$1, this.a);
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dxq $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cyw b() {
      return this.a;
   }
}
