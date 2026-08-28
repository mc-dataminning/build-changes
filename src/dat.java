import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dat<T>(T a, Optional<ewe> b) {
   public static Codec<ewe> a(evn $$0) {
      return ewe.e
         .validate(
            $$1 -> {
               azi.a $$2 = new azi.a();
               esz $$3 = new esz($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dat<T>> a(Codec<T> $$0, evn $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dat::a), a($$1).optionalFieldOf("requirements").forGetter(dat::b)).apply($$2, dat::new)
      );
   }

   public boolean a(est $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
