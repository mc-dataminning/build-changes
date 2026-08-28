import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eif extends ehv {
   public static final MapCodec<eif> b = bpz.b(duo.a).comapFlatMap(eif::a, $$0 -> $$0.c).fieldOf("entries");
   private final bpz<duo> c;

   private static DataResult<eif> a(bpz<duo> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eif($$0));
   }

   public eif(bpz<duo> $$0) {
      this.c = $$0;
   }

   public eif(bpz.a<duo> $$0) {
      this($$0.a());
   }

   @Override
   protected ehw<?> a() {
      return ehw.b;
   }

   @Override
   public duo a(azl $$0, je $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
