import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dwc extends dvs {
   public static final Codec<dwc> b = bif.b(dja.b).comapFlatMap(dwc::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bif<dja> c;

   private static DataResult<dwc> a(bif<dja> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dwc($$0));
   }

   public dwc(bif<dja> $$0) {
      this.c = $$0;
   }

   public dwc(bif.a<dja> $$0) {
      this($$0.a());
   }

   @Override
   protected dvt<?> a() {
      return dvt.b;
   }

   @Override
   public dja a(aup $$0, hx $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
