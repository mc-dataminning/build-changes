import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbk<T>(T a, Optional<eww> b) {
   public static Codec<eww> a(ewf $$0) {
      return eww.e
         .validate(
            $$1 -> {
               azl.a $$2 = new azl.a();
               etr $$3 = new etr($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dbk<T>> a(Codec<T> $$0, ewf $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dbk::a), a($$1).optionalFieldOf("requirements").forGetter(dbk::b)).apply($$2, dbk::new)
      );
   }

   public boolean a(etl $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
