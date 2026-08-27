import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dpd extends dot {
   public static final Codec<dpd> b = bch.b(dcb.b).comapFlatMap(dpd::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bch<dcb> c;

   private static DataResult<dpd> a(bch<dcb> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dpd($$0));
   }

   public dpd(bch<dcb> $$0) {
      this.c = $$0;
   }

   public dpd(bch.a<dcb> $$0) {
      this($$0.a());
   }

   @Override
   protected dou<?> a() {
      return dou.b;
   }

   @Override
   public dcb a(apf $$0, gu $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
