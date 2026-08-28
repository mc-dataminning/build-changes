import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czy<T>(T a, Optional<euw> b) {
   public static Codec<euw> a(euf $$0) {
      return euw.e
         .validate(
            $$1 -> {
               ayt.a $$2 = new ayt.a();
               $$0.a($$2, $$1);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<czy<T>> a(Codec<T> $$0, euf $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(czy::a), a($$1).optionalFieldOf("requirements").forGetter(czy::b)).apply($$2, czy::new)
      );
   }

   public boolean a(erl $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
