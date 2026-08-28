import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class ekm extends ekc {
   public static final MapCodec<ekm> b = bqr.b(dww.a).comapFlatMap(ekm::a, $$0 -> $$0.c).fieldOf("entries");
   private final bqr<dww> c;

   private static DataResult<ekm> a(bqr<dww> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ekm($$0));
   }

   public ekm(bqr<dww> $$0) {
      this.c = $$0;
   }

   public ekm(bqr.a<dww> $$0) {
      this($$0.a());
   }

   @Override
   protected ekd<?> a() {
      return ekd.b;
   }

   @Override
   public dww a(azh $$0, ji $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
