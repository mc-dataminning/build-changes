import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddo<T>(T a, Optional<ezs> b) {
   public static Codec<ezs> a(ezb $$0) {
      return ezs.e
         .validate(
            $$1 -> {
               bak.a $$2 = new bak.a();
               ewn $$3 = new ewn($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<ddo<T>> a(Codec<T> $$0, ezb $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(ddo::a), a($$1).optionalFieldOf("requirements").forGetter(ddo::b)).apply($$2, ddo::new)
      );
   }

   public boolean a(ewh $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
