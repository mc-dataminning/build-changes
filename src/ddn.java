import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddn<T>(T a, Optional<ezr> b) {
   public static Codec<ezr> a(bbe $$0) {
      return ezr.e
         .validate(
            $$1 -> {
               baa.a $$2 = new baa.a();
               ewo $$3 = new ewo($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<ddn<T>> a(Codec<T> $$0, bbe $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(ddn::a), a($$1).optionalFieldOf("requirements").forGetter(ddn::b)).apply($$2, ddn::new)
      );
   }

   public boolean a(ewi $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
