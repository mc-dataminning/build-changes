import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfx<T>(T a, Optional<fdc> b) {
   public static Codec<fdc> a(bay $$0) {
      return fdc.e
         .validate(
            $$1 -> {
               azt.a $$2 = new azt.a();
               ezz $$3 = new ezz($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dfx<T>> a(Codec<T> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dfx::a), a($$1).optionalFieldOf("requirements").forGetter(dfx::b)).apply($$2, dfx::new)
      );
   }

   public boolean a(ezt $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
