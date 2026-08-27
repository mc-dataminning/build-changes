import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dsb extends drr {
   public static final Codec<dsb> b = bfa.b(dez.b).comapFlatMap(dsb::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bfa<dez> c;

   private static DataResult<dsb> a(bfa<dez> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dsb($$0));
   }

   public dsb(bfa<dez> $$0) {
      this.c = $$0;
   }

   public dsb(bfa.a<dez> $$0) {
      this($$0.a());
   }

   @Override
   protected drs<?> a() {
      return drs.b;
   }

   @Override
   public dez a(aru $$0, gu $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
