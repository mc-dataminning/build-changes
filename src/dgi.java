import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgi<T>(T a, Optional<fdq> b) {
   public static Codec<fdq> a(bba $$0) {
      return fdq.e
         .validate(
            $$1 -> {
               azv.a $$2 = new azv.a();
               fan $$3 = new fan($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dgi<T>> a(Codec<T> $$0, bba $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dgi::a), a($$1).optionalFieldOf("requirements").forGetter(dgi::b)).apply($$2, dgi::new)
      );
   }

   public boolean a(fah $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
