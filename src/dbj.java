import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbj<T>(T a, Optional<exh> b) {
   public static Codec<exh> a(ewq $$0) {
      return exh.e
         .validate(
            $$1 -> {
               azp.a $$2 = new azp.a();
               euc $$3 = new euc($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dbj<T>> a(Codec<T> $$0, ewq $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dbj::a), a($$1).optionalFieldOf("requirements").forGetter(dbj::b)).apply($$2, dbj::new)
      );
   }

   public boolean a(etw $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
