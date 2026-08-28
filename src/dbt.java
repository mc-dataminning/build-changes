import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbt<T>(T a, Optional<exr> b) {
   public static Codec<exr> a(exa $$0) {
      return exr.e
         .validate(
            $$1 -> {
               azt.a $$2 = new azt.a();
               eum $$3 = new eum($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dbt<T>> a(Codec<T> $$0, exa $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dbt::a), a($$1).optionalFieldOf("requirements").forGetter(dbt::b)).apply($$2, dbt::new)
      );
   }

   public boolean a(eug $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
