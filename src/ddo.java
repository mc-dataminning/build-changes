import com.mojang.serialization.MapCodec;

public abstract class ddo extends dej {
   private final ctg a;

   protected ddo(ctg $$0, drz.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddo> a();

   @Override
   public boolean a(dsa $$0) {
      return true;
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dou($$0, $$1, this.a);
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return $$0.c_($$1) instanceof dou $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public ctg b() {
      return this.a;
   }
}
