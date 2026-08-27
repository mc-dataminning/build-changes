import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dty extends dto {
   public static final Codec<dty> b = bha.b(dgw.b).comapFlatMap(dty::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bha<dgw> c;

   private static DataResult<dty> a(bha<dgw> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dty($$0));
   }

   public dty(bha<dgw> $$0) {
      this.c = $$0;
   }

   public dty(bha.a<dgw> $$0) {
      this($$0.a());
   }

   @Override
   protected dtp<?> a() {
      return dtp.b;
   }

   @Override
   public dgw a(ato $$0, ht $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
