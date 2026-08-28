import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dca<T>(T a, Optional<exy> b) {
   public static Codec<exy> a(exh $$0) {
      return exy.e
         .validate(
            $$1 -> {
               azs.a $$2 = new azs.a();
               eut $$3 = new eut($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dca<T>> a(Codec<T> $$0, exh $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dca::a), a($$1).optionalFieldOf("requirements").forGetter(dca::b)).apply($$2, dca::new)
      );
   }

   public boolean a(eun $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
