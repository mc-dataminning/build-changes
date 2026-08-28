import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ejl extends ejb {
   public static final MapCodec<ejl> b = bqs.b(dvv.a).comapFlatMap(ejl::a, $$0 -> $$0.c).fieldOf("entries");
   private final bqs<dvv> c;

   private static DataResult<ejl> a(bqs<dvv> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ejl($$0));
   }

   public ejl(bqs<dvv> $$0) {
      this.c = $$0;
   }

   public ejl(bqs.a<dvv> $$0) {
      this($$0.a());
   }

   @Override
   protected ejc<?> a() {
      return ejc.b;
   }

   @Override
   public dvv a(azu $$0, jh $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
