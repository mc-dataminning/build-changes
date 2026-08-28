import com.mojang.serialization.MapCodec;

public abstract class ddw extends der {
   private final cst a;

   protected ddw(cst $$0, dsg.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddw> a();

   @Override
   public boolean a(dsh $$0) {
      return true;
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpc($$0, $$1, this.a);
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return $$0.c_($$1) instanceof dpc $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cst b() {
      return this.a;
   }
}
