import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfu<T>(T a, Optional<fcx> b) {
   public static Codec<fcx> a(bay $$0) {
      return fcx.e
         .validate(
            $$1 -> {
               azt.a $$2 = new azt.a();
               ezu $$3 = new ezu($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dfu<T>> a(Codec<T> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dfu::a), a($$1).optionalFieldOf("requirements").forGetter(dfu::b)).apply($$2, dfu::new)
      );
   }

   public boolean a(ezo $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
