import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfi<T>(T a, Optional<fci> b) {
   public static Codec<fci> a(bay $$0) {
      return fci.e
         .validate(
            $$1 -> {
               azt.a $$2 = new azt.a();
               ezf $$3 = new ezf($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dfi<T>> a(Codec<T> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dfi::a), a($$1).optionalFieldOf("requirements").forGetter(dfi::b)).apply($$2, dfi::new)
      );
   }

   public boolean a(eyz $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
