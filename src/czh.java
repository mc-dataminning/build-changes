import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czh<T>(T a, Optional<etz> b) {
   public static Codec<etz> a(eti $$0) {
      return etz.e
         .validate(
            $$1 -> {
               ayk.a $$2 = new ayk.a();
               $$0.a($$2, $$1);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<czh<T>> a(Codec<T> $$0, eti $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(czh::a), a($$1).optionalFieldOf("requirements").forGetter(czh::b)).apply($$2, czh::new)
      );
   }

   public boolean a(eqo $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
