import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class ect extends ecj {
   public static final Codec<ect> b = bmp.b(dpi.b).comapFlatMap(ect::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bmp<dpi> c;

   private static DataResult<ect> a(bmp<dpi> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new ect($$0));
   }

   public ect(bmp<dpi> $$0) {
      this.c = $$0;
   }

   public ect(bmp.a<dpi> $$0) {
      this($$0.a());
   }

   @Override
   protected eck<?> a() {
      return eck.b;
   }

   @Override
   public dpi a(axt $$0, id $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
