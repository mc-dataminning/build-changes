import com.mojang.serialization.MapCodec;

public class dpt extends dma {
   public static final MapCodec<dpt> d = b(dpt::new);

   @Override
   protected MapCodec<? extends dpt> a() {
      return d;
   }

   protected dpt(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dzz $$0, dzz $$1, ja $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
