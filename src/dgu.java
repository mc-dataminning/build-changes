import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgu<T>(T a, Optional<fec> b) {
   public static Codec<fec> a(bbl $$0) {
      return fec.e
         .validate(
            $$1 -> {
               bag.a $$2 = new bag.a();
               faz $$3 = new faz($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dgu<T>> a(Codec<T> $$0, bbl $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dgu::a), a($$1).optionalFieldOf("requirements").forGetter(dgu::b)).apply($$2, dgu::new)
      );
   }

   public boolean a(fat $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
