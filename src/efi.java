import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class efi extends eey {
   public static final MapCodec<efi> b = boz.b(drx.b).comapFlatMap(efi::a, $$0 -> $$0.c).fieldOf("entries");
   private final boz<drx> c;

   private static DataResult<efi> a(boz<drx> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new efi($$0));
   }

   public efi(boz<drx> $$0) {
      this.c = $$0;
   }

   public efi(boz.a<drx> $$0) {
      this($$0.a());
   }

   @Override
   protected eez<?> a() {
      return eez.b;
   }

   @Override
   public drx a(azc $$0, iz $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
