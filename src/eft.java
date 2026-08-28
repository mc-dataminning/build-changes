import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class eft extends efj {
   public static final MapCodec<eft> b = bon.b(dsh.b).comapFlatMap(eft::a, $$0 -> $$0.c).fieldOf("entries");
   private final bon<dsh> c;

   private static DataResult<eft> a(bon<dsh> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new eft($$0));
   }

   public eft(bon<dsh> $$0) {
      this.c = $$0;
   }

   public eft(bon.a<dsh> $$0) {
      this($$0.a());
   }

   @Override
   protected efk<?> a() {
      return efk.b;
   }

   @Override
   public dsh a(aym $$0, ja $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
