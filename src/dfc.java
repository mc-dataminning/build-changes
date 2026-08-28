import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfc<T>(T a, Optional<fbw> b) {
   public static Codec<fbw> a(baw $$0) {
      return fbw.e
         .validate(
            $$1 -> {
               azr.a $$2 = new azr.a();
               eyt $$3 = new eyt($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dfc<T>> a(Codec<T> $$0, baw $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dfc::a), a($$1).optionalFieldOf("requirements").forGetter(dfc::b)).apply($$2, dfc::new)
      );
   }

   public boolean a(eyn $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
