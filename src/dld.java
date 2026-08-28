import com.mojang.serialization.MapCodec;

public abstract class dld extends dly {
   private final cyi a;

   protected dld(cyi $$0, ean.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dld> a();

   @Override
   public boolean a(eao $$0) {
      return true;
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxa($$0, $$1, this.a);
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return $$0.c_($$1) instanceof dxa $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public cyi b() {
      return this.a;
   }
}
