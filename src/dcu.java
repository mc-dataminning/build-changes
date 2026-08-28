import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcu<T>(T a, Optional<eyy> b) {
   public static Codec<eyy> a(bai $$0) {
      return eyy.e
         .validate(
            $$1 -> {
               aze.a $$2 = new aze.a();
               evv $$3 = new evv($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dcu<T>> a(Codec<T> $$0, bai $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dcu::a), a($$1).optionalFieldOf("requirements").forGetter(dcu::b)).apply($$2, dcu::new)
      );
   }

   public boolean a(evp $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
