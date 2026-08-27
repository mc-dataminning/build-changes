import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dsc extends drs {
   public static final Codec<dsc> b = bfa.b(dfa.b).comapFlatMap(dsc::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final bfa<dfa> c;

   private static DataResult<dsc> a(bfa<dfa> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new dsc($$0));
   }

   public dsc(bfa<dfa> $$0) {
      this.c = $$0;
   }

   public dsc(bfa.a<dfa> $$0) {
      this($$0.a());
   }

   @Override
   protected drt<?> a() {
      return drt.b;
   }

   @Override
   public dfa a(aru $$0, gu $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
